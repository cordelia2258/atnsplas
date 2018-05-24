package com.atns.plas.portal.statement.web;

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
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.atns.plas.common.service.Globals;
import com.atns.plas.common.util.CommonUtil;
import com.atns.plas.common.util.Constants;
import com.atns.plas.common.util.StringUtil;
import com.atns.plas.common.web.BaseController;
import com.atns.plas.portal.login.service.LoginService;
import com.atns.plas.portal.login.vo.LoginVO;

@Controller
public class StatementController extends BaseController {

	private static final Logger logger = LoggerFactory.getLogger(StatementController.class);

	@RequestMapping(value = "/portal/statement/doStatementRegister.do")
	public String goStatementRegister(HttpServletRequest request, ModelAndView mv) {
		System.out.println("여긴오니???");
		int i = 0;
		
		if(i == 0){
			return "redirect:/portal/statement/plas.do";
		}else{
			return "redirect:/plas.do";
		}
	}
	
	@RequestMapping(value="/portal/statement/plas.do")
	public String actionMain(ModelMap model)  throws Exception {
		// 메인 페이지 이동
		System.out.println("plas/여긴오니???");
		String default_page = Globals.STATEMENT_REGISTER;
		
		//최초 메인 페이지 호출용 파마메터 셋팅
		String param = "?menuId=MAIN";
		
		if (default_page.startsWith("/")) {
		    return "forward:" + default_page + param;
		} else {
		    return default_page + param;
		}
	}	
	
	@RequestMapping(value = "/portal/statement/statement.do")
	public String defaultPage(ModelMap model, HttpServletRequest request) throws Exception {
		System.out.println("plas/여긴오니???");
		String menuId = request.getParameter("menuId");
		String systemName = Constants.SYSTEM_NAME;

		System.out.println(systemName);
		System.out.println(menuId);

		model.addAttribute("menuId", menuId);
		model.addAttribute("systemName", systemName);

		return "statementTiles";
	}
	//게시판 인설트 이동
	@RequestMapping(value = "/portal/statement/doStatementCreate.do")
	public String goStatementCreate(HttpServletRequest request, ModelAndView mv) {
		int i = 0;
		
		if(i == 0){
			return "redirect:/portal/statement/plasCreate.do";
		}else{
			return "redirect:/login.do";
		}
	}
	@RequestMapping(value="/portal/statement/plasCreate.do")
	public String plasCreate(ModelMap model)  throws Exception {
		// 메인 페이지 이동
		String default_page = Globals.STATEMENT_INSERT;
		
		//최초 메인 페이지 호출용 파마메터 셋팅
		String param = "?menuId=MAIN";
		
		if (default_page.startsWith("/")) {
		    return "forward:" + default_page + param;
		} else {
		    return default_page + param;
		}
	}	
	@RequestMapping(value = "/portal/statement/statementCreate.do")
	public String createPage(ModelMap model, HttpServletRequest request) throws Exception {

		String menuId = request.getParameter("menuId");
		String systemName = Constants.SYSTEM_NAME;

		System.out.println(systemName);
		System.out.println(menuId);
        System.out.println("statmentController");
		model.addAttribute("menuId", menuId);
		
		model.addAttribute("systemName", systemName);

		return "statementTilesCreate";
	}
	

}
