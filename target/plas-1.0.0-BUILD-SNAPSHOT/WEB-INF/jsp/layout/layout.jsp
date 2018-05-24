<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles"  prefix="tiles"%>
<%
/**
 * ========================================================
 * 주시스템    : plas
 * 서브시스템  : portal
 * 프로그램명  : Layout
 * 설명 	   : Layout 페이지
 * 작성자      : 오재석
 * 작성일      : 2018. 4. 27.
 * ========================================================
 * 수정자/수정일 :
 * 수정사유/내역 : 
 * ========================================================
 */
%>
<html lang="en">	
	<head>
		<%@ include  file="/WEB-INF/jsp/include/title.jsp" %>
		<%@ include  file="/WEB-INF/jsp/include/css_header.jsp" %>
	</head>

	<body class="y_body">
	<div class="y_wrap">
			<tiles:insertAttribute name="header" />
			<div class="y_container">
			<tiles:insertAttribute name="left" />
			<tiles:insertAttribute name="content" />
			</div>
			<tiles:insertAttribute name="footer" />
			<div class="y_shadow" id="bodyShadow"></div>
	</div>
	<%@ include  file="/WEB-INF/jsp/include/js_header.jsp" %>
	</body>
	
</html>
