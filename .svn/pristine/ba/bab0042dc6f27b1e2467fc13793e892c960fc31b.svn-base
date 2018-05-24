package com.atns.plas.portal.login.service.impl;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.atns.plas.portal.login.service.LoginService;
import com.atns.plas.portal.login.vo.LoginVO;

@Service("LoginService")
public class LoginServiceImpl implements LoginService {

	@Override
	public LoginVO getUserinfoData(HashMap map) throws Exception {
		// TODO Auto-generated method stub
		
		LoginVO vo = new LoginVO();
		
		if(map != null){
			vo.setUsrid((String)map.get("USRID"));
			vo.setUsrnm((String)map.get("USRNM"));
			vo.setBukrs((String)map.get("BURKS"));
			vo.setButxt((String)map.get("BUTXT"));
			vo.setPaswd((String)map.get("PASWD"));
			vo.setOrgcd((String)map.get("ORGCD"));
			vo.setOrgnm((String)map.get("ORGNM"));
			vo.setKostl((String)map.get("KOSTL"));
			vo.setKtext((String)map.get("KTEXT"));
			vo.setFtext((String)map.get("FTEXT"));
			vo.setGsber((String)map.get("GSBER"));
			vo.setFistl((String)map.get("FISTL"));
			vo.setPrctr((String)map.get("PRCTR"));
			vo.setMctxt((String)map.get("MCTXT"));
			vo.setEmail((String)map.get("EMAIL"));
			vo.setAucls((String)map.get("AUCLS"));
			vo.setBizcd((String)map.get("BIZCD"));
			vo.setEpchk((String)map.get("EPCHK"));
			vo.setSpras((String)map.get("SPRAS"));
			vo.setWaers((String)map.get("WAERS"));
		}
		
		return vo;
	}

}
