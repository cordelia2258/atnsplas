package com.atns.plas.common.web;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.atns.plas.common.util.BindingUtil;

public class BaseController {
	/**
	 * request Data의 Parameter Name을 List에 담는다.
	 */
	private List<String> paramNameList;
	
	/**
	 * request Data를 List에 담는다.
	 */
	private List<HashMap> requestList;

	public List<String> getParamNameList() {
		return paramNameList;
	}

	public void setParamNameList(List<String> paramNameList) {
		this.paramNameList = paramNameList;
	}

	public List<HashMap> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<HashMap> requestList) {
		this.requestList = requestList;
	}
	
	public void setParamNameList(HttpServletRequest request){
		this.paramNameList = BindingUtil.paramNameList(request);
	}
	
	public void setRequestList(HttpServletRequest request, List<String> paramNameList){
		this.requestList = BindingUtil.parseList(request, paramNameList);
	}
	
	public void processRequestList(HttpServletRequest request){
		
		//request Parameter명을 리스트로 변환
		setParamNameList(request);
		
		//request Data를 리스트로 변환
		setRequestList(request, getParamNameList());
		
	}
	
	
}
