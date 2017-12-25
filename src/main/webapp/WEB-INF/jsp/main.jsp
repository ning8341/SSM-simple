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
        </nav>
      </div>
    </div>
	<div class="intr" id="top">
    	<span class="avtar"></span>
        <p class="peointr">我叫董维宁，一名奋斗的北漂。</p>
        <p class="peointr">爱技术、爱生活、爱旅行。</p>
    </div>
    <div class="title" id="part3">技能介绍</div>
    <div class="content">
        <ul class="nav nav-tabs" role="tablist">
          <li class="active"><a href="#home" role="tab" data-toggle="tab">JavaWeb</a></li>
          <li><a href="#profile" role="tab" data-toggle="tab">Linux</a></li>
          <li><a href="#messages" role="tab" data-toggle="tab">Python</a></li>
        </ul>
        <div class="tab-content">
          <div class="tab-pane active" id="home">
          	<p class="text">1.熟练使用spring+springmvc+mybatis+mysql+tomcat开发web应用</p>
            <p class="text">2.对spring+strut2+hibernate有一定的了解</p>
            <p class="text">3.熟练使用javascript和jQeury，了解esayui</p>
            <p class="text">4.熟练使用powerDesigner、svn、maven、github、UML、sqlyog、jd、xshell、xftp、VM等工具</p>
            <p class="text">5.了解springboot、多线程、高并发、锁机制、ajax跨域等</p>
            <p class="text">6.良好的代码规范和注释习惯，良好的团队意识</p>
          </div>
          <div class="tab-pane" id="profile">
          	<p class="text">熟练使用Linux的常用命令</p>
            <p class="text">安装配置常用软件，如mysql、jdk、ngnix、hadoop(搭建过slaves)</p>
          </div>
          <div class="tab-pane" id="messages">
          	<p class="text">使用Eclipse的pyDev插件写过几段python的demo</p>
            <p class="text">基本python--basic--阶段</p>
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
			<a id="serach" href="javascript:findAData();">查看数据</a>			
			</div>
         
        </div>
    </div>
   
    <div class="title" id="part1">教育经历</div>
    <div class="content">
    	<div class="pic pic1">
    		<img src="images/h1.jpg" alt="">
    		<p>高中-开滦二中</p>
    	</div>
    	<div class="pic pic2">
    		<img src="images/h2.jpg" alt="">
    		<p>大学-石家庄铁道学院四方学院</p>
    	</div>
    	<div class="pic pic3">
    		<img src="images/h3.jpg" alt="">
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
			<button id="submit" type="submit">提交</button>
		</form>	
		<img src="images/kof97.png">
	</div>
	
	<!--     添加part6 -->
	<div class="title" id="part6">进入学员信息系统</div>
	<div class="content">
		<form action="${pageContext.request.contextPath }/list">
			<button id="submit" type="submit">进入系统</button>
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