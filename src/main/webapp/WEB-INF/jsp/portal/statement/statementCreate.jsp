<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
 
<html>
	<head>
		<%@ include  file="/WEB-INF/jsp/include/title.jsp" %>
		<%@ include  file="/WEB-INF/jsp/include/css_header.jsp" %>
	</head>
	<body class="y_body">
		<div class="y_wrap">
	        <tiles:insertAttribute name="header"/>      
	        <div class="y_container">  
	        	<tiles:insertAttribute name="left" />     
	        </div>
	  	     <div>
		     	
		     </div>   
	         <tiles:insertAttribute name="footer" />
	         <div class="y_shadow" id="bodyShadow"></div>
         </div>
	<%@ include  file="/WEB-INF/jsp/include/js_header.jsp" %>
	</body>
</html>


