// 加入js写的右下角弹窗
function pop_init(title, content) {
	// 取当前浏览器窗口大小
	var windowWidth = $(document).width();
	var windowHeight = $(document).height();
	// 弹窗的大小
	var weight = 320;
	var height = 150;
	$("body")
			.append("<div id='pop_div'style='display:none;position:absolute;border:1px solid #e0e0e0;z-index:99;width:"
							+ weight
							+ "px;height:"
							+ height
							+ "px;top:"
							+ (windowHeight - height - 10)
							+ "px;left:"
							+ (windowWidth - weight - 10)
							+ "px'>"
							+ "<div style='line-height:32px;background:#f6f0f3;border-bottom:1px solid #e0e0e0;font-size:14px;padding:0 0 0 10px;'>"
							+ "<div style='float:left;'><b>"
							+ title
							+ "</b></div><div style='float:right;cursor:pointer;'><b onclick='pop_close()'>×</b></div>"
							+ "<div style='clear:both'></div>"
							+ "</div>"
							+ "<div id='content'>"
							+ content
							+ "</div>"
							+ "</div>");
}
function pop_close() {
	
	$('#pop_div').fadeOut(400);
}
$(document).ready(function() {
			pop_init("弹窗可恨", "<ul style='font-size:30;color:yellow;'><li >360安全卫士弹窗是流氓</li><li >你好我是讨厌的弹窗</li></ul>");
			$('#pop_div').fadeIn(400);
		});
		
  //设置弹窗的显示时间
 window.onload=function(){		
    setTimeout("closeAlert()",3000);//3秒后调用弹窗的关闭方法
    
 }  
 //关闭弹窗的方法
 function closeAlert(){
	
    $('#pop_div').css("display","none");
     
 } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    