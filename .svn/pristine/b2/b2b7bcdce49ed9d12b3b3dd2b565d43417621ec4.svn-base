function showLoading() {
    if ($("#loadingbar").length === 0) {
        var l = [];
        l.push('<div class="modal fade loadingbar" id="loadingbar" tabindex="-1" role="dialog" aria-hidden="true">');
        l.push('   <div style="margin-top:20%;">');
        l.push('      <div class="sk-spinner sk-spinner-wave" >');
        l.push('         <div class="sk-rect1"></div>');
        l.push('         <div class="sk-rect2"></div>');
        l.push('         <div class="sk-rect3"></div>');
        l.push('         <div class="sk-rect4"></div>');
        l.push('         <div class="sk-rect5"></div>');
        l.push('      </div>');
        l.push('    </div>');
        l.push(' </div>');

        $(document.body).append(l.join(""));
    }

    $("#loadingbar").modal("show");
}

//==================================================    
//화면에 보여지는 로딩바 숨기기
//==================================================
function hideLoading() {
    $("#loadingbar").modal("hide");
    setTimeout(function(){
    	$("#loadingbar").remove();
    }, 1000);
    
}