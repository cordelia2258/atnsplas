package com.atns.plas.common.util;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class BindingUtil {
	/**
	 * request Prarameter 명을 리스트로 변환
	 * @param request
	 * @return
	 */
	public static List paramNameList(HttpServletRequest request){
		
		Map paramMap = request.getParameterMap();
		Enumeration paramNames = request.getParameterNames();
		List<String> paramNameList = new ArrayList<String>();
		
		for(int i=0; i<paramMap.size(); i++) {
			paramNameList.add((String)paramNames.nextElement());
		}
		
		return paramNameList;
	}
	
	/**
	 * request Data를 List로 변환
	 * @param request
	 * @return
	 */
	public static List parseList(HttpServletRequest request, List<String> paramNameList){
		
		Map paramMap = request.getParameterMap();
		List<HashMap> requestList = new ArrayList<HashMap>();
		HashMap<String, String> map = null;
		
		for (int j=0; j < ((String[])paramMap.get("sStatus")).length; j++) {
			map = new HashMap<String, String>();
			for(int i=0; i<paramNameList.size(); i++) {
				//request가 배열이 아닐경우를 예외처리
				if(j <  ((String[])paramMap.get(paramNameList.get(i))).length) {
					map.put(paramNameList.get(i), ((String[])paramMap.get(paramNameList.get(i)))[j]);
				}
			}
			requestList.add(map);	
		}
				
		return requestList;
	}
	
}
