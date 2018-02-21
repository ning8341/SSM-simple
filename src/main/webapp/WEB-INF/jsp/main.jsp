<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 <title>董维宁-个人网站</title>
    <!-- CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/blog.css" rel="stylesheet">
  </head>
  <body>
	<%
	Cookie killMyCookie = new Cookie("cookiename1", null);
    killMyCookie.setMaxAge(0);
    killMyCookie.setPath("/");
    response.addCookie(killMyCookie);
    Cookie killMyCookie1 = new Cookie("cookiename2", null);
    killMyCookie1.setMaxAge(0);
    killMyCookie1.setPath("/");
    response.addCookie(killMyCookie1);
	%>
	<div class="blog-masthead" >
      <div class="container">
        <nav class="blog-nav">
          <a class="blog-nav-item active" href="#top">首页</a>
          <a class="blog-nav-item" href="#part3">技能介绍</a>
          <a class="blog-nav-item" href="#part1">教育经历</a>
          <a class="blog-nav-item" href="#part4">项目介绍</a> 
          <a class="blog-nav-item" href="#part2">自我介绍</a>
          <a class="blog-nav-item" href="#part5">图片上传</a>
          <a class="blog-nav-item" href="#part6">学员信息系统</a>
             
          <a class="blog-nav-item class1" href="${pageContext.request.contextPath }/logout">退出</a>
                          
        </nav>
      </div>
    </div>
	<div class="intr" id="top">
    	<span class="avtar" id="here_img"></span>
        <p class="peointr" id="context"></p>
        <p class="peointr" id="context1"></p>
    </div>
    <div class="title" id="part3">技能介绍</div>
    <div class="content">
        <ul class="nav nav-tabs" role="tablist">
          <li class="active"><a href="#home" role="tab" data-toggle="tab">JavaWeb</a></li>
          <!-- <li><a href="#profile" role="tab" data-toggle="tab">Linux</a></li>
          <li><a href="#messages" role="tab" data-toggle="tab">Python</a></li> -->
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="home">
          	<p class="text" id="prointro1"></p>           
          </div>
          <div class="tab-pane" id="profile">
          	<p class="text" id="prointro2"></p>
           
          </div>
          <div class="tab-pane" id="messages">
          	<p class="text" id="prointro3"></p>
           
          </div>
        </div>
    </div>
<!--     添加part4 等待完成录入-->
    <div class="title" id="part4">项目介绍</div>
    <div class="content">
        <ul class="nav nav-tabs" role="tablist">
          <li class="active"><a href="#home" role="tab" data-toggle="tab">介绍</a></li>
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="home">	
<!--   此处是添加一个href来通过ajax发请求 -->
			<a id="serach"></a>		
			</div>
         
        </div>
    </div>
   
    <div class="title" id="part1">教育经历</div>
    <div class="content">
    	<div class="pic pic1">
    		<img id="img_1" src="images/h1.jpg" alt="">
    		<p>高中-开滦二中</p>
    	</div>
    	<div class="pic pic2">
    		<img id="img_2" src="images/h2.jpg" alt="">
    		<p>大学-石家庄铁道学院四方学院</p>
    	</div>
    	<div class="pic pic3">
    		<img id="img_3" src="images/h3.jpg" alt="">
    		<p>IT培训-达内中关村中心</p>
    	</div>
    </div>
    <div class="title" id="part2">自我介绍</div>
    <div class="content">
    	<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
              <ol class="carousel-indicators">
                <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
                <li data-target="#carousel-example-generic" data-slide-to="1"></li>
                <li data-target="#carousel-example-generic" data-slide-to="2"></li>
              </ol>
              <div class="carousel-inner" role="listbox">
                <div class="item active">
                  <img src="images/s1.jpg" alt="...">
                </div>
                <div class="item">
                  <img src="images/s2.jpg" alt="...">
                </div>
				<div class="item">
                  <img src="images/s3.jpg" alt="...">
                </div>
              </div>
              <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
              </a>
              <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
              </a>
            </div>
    </div>
	<!--     添加part5 -->
	<div class="title" id="part5">图片上传</div>
	<div class="content">

		<form id="uploadImg" action="${pageContext.request.contextPath}/upload " method="post"
			enctype="multipart/form-data" >	
			上传头像 <input type="file" id="pic1" name="pic1">			
			<button class="btn btn-primary btn-lg" id="submit" type="submit">提交</button>
		</form>	
		<img src="images/kof97.png">
	</div>
	
	<!--     添加part6 -->
	<div class="title" id="part6">进入学员信息系统</div>
	<div class="content">
		<form action="${pageContext.request.contextPath }/list">
			<button class="btn btn-primary btn-lg" id="submit" type="submit">进入系统</button>
		</form>
		<img src="images/studentManager.png">
	</div>








	<!--      回到顶部 -->
	<a href="#top" class="btt">顶部</a>
	
    <!-- Js-->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugin.js"></script>
    <script src="js/file.js"></script>
    
    
  </body>
</html>