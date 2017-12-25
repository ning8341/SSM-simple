<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; utf-8">
<title>Insert title here</title>
<script src="js/jquery.min.js">
</script>
<script>
$(document).ready(function(){
	$("button").click(
	   function(){
		   //responseTxt,statusTxt,xhr 固定的
		   $("#div1").load("images/1.txt",function(responseTxt,statusTxt,xhr){
			   $("#div1").slideToggle("slow");  
			   if(statusTxt=="success")
			        alert("外部内容加载成功!");
			      if(statusTxt=="error")
			        alert("Error: "+xhr.status+": "+xhr.statusText);
		   });	
	});
});
</script>
</head>

<body>
	<div id="div1">
		<h2>获取文本内容</h2>
	</div>
	    <button>获取外部内容</button>



</body>
</html>