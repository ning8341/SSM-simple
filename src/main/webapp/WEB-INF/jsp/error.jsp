<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="css/error.css" />
<script language="JavaScript">
	function dosearch() {
		var sf = document.searchform;
		var submitto = sf.sengine.value;
		var value =  sf.searchterms.value;
		alert("感谢您的吐槽，88");
		
		/* + escape(sf.searchterms.value */
		window.location.href = submitto;
		return false;
	}
</script>
<body>
	<div class="header">
		<img src="images/Logo_sample.png" />
	</div>

	<p class="error">404</p>

	<div class="content">
		<h2>你好，页面找不到了呀！</h2>

	<p class="text">
		 轻轻的我将离开你，正如你轻轻的归去。来吐槽几句吧
		 <form name="searchform" onSubmit="return dosearch();">
				<input type="hidden" name="sengine" value="${pageContext.request.contextPath}/login" />	
				<input type="text" name="searchterms" class="inputform">
				<input type="submit" name="SearchSubmit" value="发送"class="button"> 
			</form>
			<!-- Change www.yoursite.com to your website domain -->
		</p>
				
			<p class="links">
				<a id="button" href="${pageContext.request.contextPath}/register">&larr; Back</a>
				<!--These are links. You can change it to a page you want to by replacing the '#' with your url.-->
			</p>
		</div>

	

		</body>
</html>