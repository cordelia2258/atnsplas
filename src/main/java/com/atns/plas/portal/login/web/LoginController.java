package com.atns.plas.portal.login.web;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atns.plas.common.service.Globals;
import com.atns.plas.common.util.CommonUtil;
import com.atns.plas.common.util.Constants;
import com.atns.plas.common.util.StringUtil;
import com.atns.plas.common.web.BaseController;
import com.atns.plas.portal.login.service.LoginService;
import com.atns.plas.portal.login.vo.LoginVO;
import com.sap.conn.jco.JCoDestination;
import com.sap.conn.jco.JCoDestinationManager;
import com.sap.conn.jco.JCoFunction;
import com.sap.conn.jco.JCoRecordMetaData;
import com.sap.conn.jco.JCoStructure;

@Controller
@RequestMapping(value = "/portal/login")
public class LoginController extends BaseController{

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/* 로그인 서비스 */
//	@Resource(name = "LoginService")
//	private LoginService loginService;
	
//	@Autowired
//	private LoginService loginService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value= "/login.do")
	public String goLogin(HttpServletRequest request, Model model) {
		//EmployeeVO empVo = (EmployeeVO)session.getAttribute(Config.SYSTEM_SESSION_EMP_STR);
		logger.info("Welcome! Login Controller");
		
		String bukrs = StringUtil.getValidTextFromHtml(Constants.BUKRS);
		String usrid = Constants.USRID;
    	String systemName = Constants.SYSTEM_NAME;
    	String contextPath = request.getContextPath();
    	
		model.addAttribute("bukrs", bukrs );
		model.addAttribute("systemName", systemName );
		model.addAttribute("contextPath", contextPath );
		
		return "portal/login/login";
	}
	
	@RequestMapping(value= "/doLoginAction.do")
	public String doLoginAction(HttpServletRequest request, HttpSession session, Model model, @ModelAttribute("loginVO") LoginVO loginVo) 
		throws Exception{
//		//EmployeeVO empVo = (EmployeeVO)session.getAttribute(Config.SYSTEM_SESSION_EMP_STR);
		logger.info("=================================================================================");
		logger.info("==========================" + loginVo.toString() + "=============================");
		logger.info("=================================================================================");
		
		loginVo.setLogip(CommonUtil.getLocalV4IP());
		
		if(loginVo.getBukrs() == null){
			loginVo.setBukrs("1000");
		}
		
		if(loginVo.getLangu() == null){
			loginVo.setLangu("KO");
		}
		
//		processRequestList(request);
//		
//		userInfoVo.setUsrid(loginVo.getUsrid());			//User ID
//		
//		if(loginVo.getUsrid()== null || loginVo.getUsrid().equals(""))
//		{
//			request.getSession().setAttribute("LOGINIDFAIL", "Y"); 
//        	return  "redirect:/login.do";
//		}
//		
		HashMap<String, Object> map = doLoginActionData(loginVo);
//		
//		LoginVO userInfoVo = loginService.getUserinfoData(map);
//		
//		// 2-1. 로그인 정보를 세션에 저장
//		request.getSession().setAttribute("userInfo", userInfoVo); 
		
		if(map != null){
			return "redirect:/portal/login/plas.do";
		}else{
			return "redirect:/login.do";
		}
	}
	
	public HashMap<String, Object> doLoginActionData(LoginVO loginVO){
		String funcName = "ZPLAS_CM_LOGIN";
		HashMap<String, Object> data = new HashMap<String, Object>();
		
		try {
			JCoDestination destination = JCoDestinationManager.getDestination(Constants.ABAP_AS);
			JCoFunction function = destination.getRepository().getFunction(funcName);
			
			if(function == null)
	            throw new RuntimeException(funcName + " not found in SAP.");
			
	    	function.getImportParameterList().setValue("I_BUKRS", loginVO.getBukrs());
	    	function.getImportParameterList().setValue("I_USRID", loginVO.getUsrid());
	    	function.getImportParameterList().setValue("I_PASWD", loginVO.getPaswd());
	    	function.getImportParameterList().setValue("I_LOGIP", loginVO.getLogip());
	    	function.getImportParameterList().setValue("I_LANGU", loginVO.getLangu());
	    	
	    	function.execute(destination);
			
			JCoStructure userinfo = function.getExportParameterList().getStructure("E_USERINFO");
			JCoStructure result = function.getExportParameterList().getStructure("E_RETURN");
			JCoRecordMetaData metaData = function.getExportParameterList().getMetaData().getRecordMetaData("E_USERINFO");
			
			if(result.getString("TYPE").equals("S")){
	        	for (int j=0; j<metaData.getFieldCount(); j++) {
	        		if (metaData.getType(j) == 2) {
	        			data.put(metaData.getName(j), (Object)userinfo.getFloat(metaData.getName(j)));
	        		} else {
	        			data.put(metaData.getName(j), (String) userinfo.getString(metaData.getName(j)));
	        		}
	        	}
			}
			
		} catch (Exception e) {
			logger.error("getDetailData ===> " + e.getMessage());
		}
		
		logger.info("data= " + data.toString());
		
		return data;
	}
	
	/**
	 * 로그인 후 메인화면으로 들어간다
	 * @param 
	 * @return 로그인 페이지
	 * @exception Exception
	 */
    @RequestMapping(value="/plas.do")
	public String actionMain(ModelMap model)  throws Exception {
//    	LoginVO user = (LoginVO)SalesUserDetailsHelper.getAuthenticatedUser();
//    	
//    	//상위 메뉴조회
//    	P9004_Vo p9004_Vo = new P9004_Vo();
//    	
//    	p9004_Vo.setUserid(user.getUserid());
//    	p9004_Vo.setRoleCode(user.getRoleCode());
//    	
//    	List topMenuList = p9004_Service.selectTopMenuList(p9004_Vo); 
//    	model.addAttribute("topMenuList", topMenuList);
//    	
//    	
		// 메인 페이지 이동
		String default_page = Globals.DEFAULT_PAGE;
		
		//최초 메인 페이지 호출용 파마메터 셋팅
		String param = "?menuId=MAIN";
		
		if (default_page.startsWith("/")) {
		    return "forward:" + default_page + param;
		} else {
		    return default_page + param;
		}
	}
    
    /**
	 * 기본 레이아웃 페이지 호출
	 * @param model
	 * @param request
	 * @return
	 * @throws Exception
	 */
    @RequestMapping(value="/default.do")
	public String defaultPage(ModelMap model, HttpServletRequest request) throws Exception{					
		
    	String menuId = request.getParameter("menuId");
    	String systemName = Constants.SYSTEM_NAME;
    	
		model.addAttribute("menuId", menuId);
		model.addAttribute("systemName", systemName );
				
		return "layoutTiles";
	}
    
    /**
     * 로그아웃
     * @param request
     * @param model
     * @return
     * @throws Exception 
     */
    @RequestMapping(value="/Logout.do")
	public String actionLogout(HttpServletRequest request, ModelMap model) 
			throws Exception {
    	
//    	LoginVO user = (LoginVO)SalesUserDetailsHelper.getAuthenticatedUser();
    	
    	
    	/* 세션 끊기 */
    	request.getSession().setAttribute("userInfo", null);

    	return "redirect:/login.do";
    }
	
}
