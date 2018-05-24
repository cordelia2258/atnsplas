<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles"%>
<%@ page import="com.atns.plas.portal.login.vo.*" %>
<%@ page import="org.apache.commons.lang.StringUtils" %>
<%
/**
 * ========================================================
 * 주시스템    : sales
 * 서브시스템  : portal
 * 프로그램명  : Header
 * 설명 	   : Header 페이지
 * 작성자      : 오재석
 * 작성일      : 2018. 04. 27.
 * ========================================================
 * 수정자/수정일 :
 * 수정사유/내역 : 
 * ========================================================
 */
%>
<%
	LoginVO user = (LoginVO)session.getAttribute("userInfo"); 

%>