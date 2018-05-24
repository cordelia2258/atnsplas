<!DOCTYPE HTML>
<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
<meta name="viewport" content="width=device-width,initial-scale=1.0,target-densityDpi=medium-dpi">
<link href="<%=request.getContextPath()%>/css/y_style.css" rel="stylesheet" />
<title>HTTP 404 Error</title>
</head>
<body class="y_ctn_body error_body">
<div class="y_ctn_wrap">
	<div class="y_error_wrap">
		<div class="img_wrap">
			<span class="error_img"></span>
		</div>
		<div class="text_wrap">
			<div class="text">
				<h2 class="error_title">HTTP 404 Error</h2>
				<p>웹페이지를 찾을 수 없습니다.
			</div>
		</div>
	</div>	
</div>
</body>
</html>