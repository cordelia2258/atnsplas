//*-----------------------------------------------------------
// 함수명 : PopupWin
// 설 명  : 팝업 윈도우 열기
// 입력값 : url    >> 팝업창 URL
//          name   >> 팝업창 이름
//          width  >> 가로너비
//          height >> 세로너비
//          useScroll >> 스크롤 사용여부 (yes/no)
// Example  : PopupWin(winUrl, 'RoleMenu', 600, 400, 'yes')
//------------------------------------------------------------
function PopupWin(url, name, width, height, useScroll){
  var features;
  var t = screen.height / 2 - height / 2;
  var l = screen.width  / 2 - width  / 2;
  var option = "toolbar=no,menubar=no,location=no,scrollbars="+ useScroll +",status=no,resizable=no";

  features = "top=" + t + ",left=" + l + ",width=" + width + ",height=" + height + "," + option;

  var remote = window.open(url, name, features);
  if (remote.opener == null) remote.opener=window;

  remote.focus();
  //remote.close();
  //remote = window.open(url, name, features);
}

function plasAlert(message){
	swal({   title: "Error",   text: message,   type: "error"});
}