package com.atns.plas.portal.login.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.atns.plas.portal.login.vo.LoginVO;

@Service
public interface LoginService {
	
	/**
	 * 상위 조직 정보 조회
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	LoginVO getUserinfoData(HashMap map) throws Exception;
}
