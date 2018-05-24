<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">

<head>
  <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
  <script src="//ajax.googleapis.com/ajax/libs/jqueryui/1.11.1/jquery-ui.min.js"></script>
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css" />
</head>
 <script>
	$(document).ready(function(){  
	    $("#newRegister").click(function(){       
	    	alert("sd");
	    	window.location.href ="/portal/statement/doStatementCreate.do";
	    	//$("#newRegister").attr("action", "/portal/statement/doStatementCreate.do").submit(); 
	        });  
	    $("#checkButton").click(function(){       
	    	alert("sd");
	    	
	        });  
	});  
	$.datepicker.setDefaults({
		  closeText: "닫기",
	      prevText: "이전달",
	      nextText: "다음달",
	      currentText: "오늘",
	      monthNames: ["1월", "2월", "3월", "4월", "5월", "6월","7월", "8월", "9월", "10월", "11월", "12월"],
	      monthNamesShort: ["1월", "2월", "3월", "4월", "5월", "6월","7월", "8월", "9월", "10월", "11월", "12월"],
	      dayNames: ["일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"],
	      dayNamesShort: ["일", "월", "화", "수", "목", "금", "토"],
	      dayNamesMin: ["일", "월", "화", "수", "목", "금", "토"],
	      weekHeader: "주",
	      dateFormat: "yyyy-mm-dd",
	      firstDay: 0,
	      isRTL: false,
	      showMonthAfterYear: true,
	      yearSuffix: "년"
    });
    $(function() {
        $("#datepicker1").datepicker();
        $("#datepicker2").datepicker();
    });


  </script>
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
		     	<div class="jarviswidget jarviswidget-color-blueDark jarviswidget-sortable" role="widget" style="margin: -35px 4px 195px 229px">
				
				<header role="heading" class="ui-sortable-handle">
					<div class="jarviswidget-ctrls" role="menu" style="margin: 10px 0px 0px 0px">   
						<a href="javascript:void(0);" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse">
							<i class="fa fa-minus ">
							</i>
						</a> 
						<a href="javascript:void(0);" class="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
							<i class="fa fa-expand ">
							</i>
						</a> 
						<a href="javascript:void(0);" class="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete">
							<i class="fa fa-times"></i>
						</a>
					</div>					
					<span class="widget-icon" style="margin: 10px 0px 0px 0px"> <i class="fa fa-table"></i> </span>
					<style>
					h2{
					color:white;
					}
					</style>
					<h2>Normal Table</h2>

					<span class="jarviswidget-loader">
						<i class="fa fa-refresh fa-spin"></i>
					</span>
					
				</header>
				
				<!-- widget div-->
				<div role="content">
					<form>
						<div style="margin:-4px 0px 0px 690px;">
							-거래처<input type ="text" id ="textValue1" style="margin-top:10px;height :20px;width:60px">
							-진행상태
							<select name="job">
							    <option value="">전체</option>
							    <option value="1">결제요청</option>
							    <option value="2">결제진행</option>
							    <option value="3">결제완료</option>
							    <option value="4">반려</option>
							</select>
							-전기일자
							<input type ="text" id ="datepicker1" style="margin-top:10px;height :20px;width:75px"> 
							~
							<input type ="text" id ="datepicker2" style="margin-top:10px;height :20px;width:75px">
							<input type = "button"  id = "checkButton"class="btn btn-default" style="height :25px;width:50px" value ="조회">
							
						</div>
				</form>
					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
					</div>
					<!-- end widget edit box -->
					<!-- widget content -->
					<div class="widget-body">				
						<div class="table-responsive">						
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>전표번호</th>
										<th>거래처</th>
										<th>전기일자</th>
										<th>계정과목</th>
										<th>금액</th>
										<th>세금</th>
										<th>적요</th>
										<th>진행상태</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Row 1</td>
										<td>Row 2</td>
										<td>Row 3</td>
										<td>Row 4</td>
										<td>Row 5</td>
										<td>Row 6</td>
										<td>Row 7</td>
										<td>Row 8</td>
									</tr>									
								</tbody>
							</table>		
							<input type = "button" id = "newRegister"  class="btn btn-default" style="height :25px;width:50px;margin:0px 0px 0px 1175px;" value ="신규">					
						</div>
					</div>
					<!-- end widget content -->
				</div>
				<!-- end widget div -->
			</div>
		     </div>   
	         <tiles:insertAttribute name="footer" />
	         <div class="y_shadow" id="bodyShadow"></div>
         </div>
	<%@ include  file="/WEB-INF/jsp/include/js_header.jsp" %>
	</body>
</html>


