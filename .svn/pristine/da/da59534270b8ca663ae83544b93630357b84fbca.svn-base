<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.atns.plas.portal.login.vo.LoginVO" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <%@ include  file="/WEB-INF/jsp/include/title.jsp" %>
	<%@ include  file="/WEB-INF/jsp/include/css_header.jsp" %>
</head>
<body>
    <div id="container" class="cls-container">
        
		<!-- BACKGROUND IMAGE -->
		<!--===================================================-->
		<div id="bg-overlay"></div>
		
		<!-- LOGIN FORM -->
		<!--===================================================-->
		<div class="cls-content">
		    <div class="cls-content-sm panel">
		        <div class="panel-body">
		            <div class="mar-ver pad-btm">
		                <h1 class="h3">${systemName} Login</h1>
		                <p>Sign In to your account</p>
		            </div>
		            <form id="form" name="form" method="post">
		                <div class="form-group">
		                    <input type="text" id="usrid" name="usrid" class="form-control" placeholder="Username" autofocus maxlength="8">
		                </div>
		                <div class="form-group">
		                    <input type="password" id="paswd" name="paswd" class="form-control" placeholder="Password">
		                </div>
		                <div class="form-group">
							    <select class="form-control" id="langu" name="langu">
                                     <option value="KO">Korean</option>
                                     <option value="EN">English</option>
                                </select>
		                </div>
		                
		                <div class="checkbox pad-btm text-left">
		                    <input id="demo-form-checkbox" class="magic-checkbox" type="checkbox">
		                    <label for="demo-form-checkbox">Remember me</label>
		                </div>
		                <button id="login" class="btn btn-primary btn-lg btn-block" type="button">Sign In</button>
		            </form>
		        </div>
		
		        <div class="pad-all">
		            <a href="pages-password-reminder.html" class="btn-link mar-rgt">Forgot password ?</a>
		            <a href="pages-register.html" class="btn-link mar-lft">Create a new account</a>
		        </div>
		    </div>
		</div>
		<!--===================================================-->
		
		<!-- DEMO PURPOSE ONLY -->
		<!--===================================================-->
		<div class="demo-bg">
		</div>
		<!--===================================================-->
		
    </div>
    <!--===================================================-->
    <!-- END OF CONTAINER -->
    
    <!-- ================== BEGIN Common include File ================== -->
	<%@ include  file="/WEB-INF/jsp/include/js_header.jsp" %>
	<!-- ================== END Common include File ================== -->

  <script language="JavaScript" type="text/JavaScript">
  //<![CDATA[
    $(function(){
	  $("#login").on("click",function(){
		 doLoginAction(); 
	  });
	  
	  $("#paswd").on("keydown", function(e){
		 if(e.keyCode === 13){
			 doLoginAction();
		 } 
	  });
    });
    
    function doLoginAction(){
    	if($("#usrid").val() === ""){
    		swal({   icon: "warning", title: "Warning",   text: "ID를 입력해 주시기 바랍니다.",   type: "error"});
    		return;
    	}
    	if($("#paswd").val() === ""){
    		swal({   icon: "warning", title: "Warning",   text: "비밀번호를 입력해 주시기 바랍니다.",   type: "error"});
    		return;
    	}
    	
    	$("#form").attr("method", "post").attr("action", "/portal/login/doLoginAction.do").submit();
    }
  //]]>
  </script>
</body>
</html>