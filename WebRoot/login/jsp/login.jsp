<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="<%=basePath %>login/css/normalize.css" />
<link rel="stylesheet" type="text/css" href="<%=basePath %>login/css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="<%=basePath %>login/css/component.css" />
<!--[if IE]>
<script src="<%=basePath %>login/js/html5.js"></script>
<![endif]-->
<script type="text/javascript">
function managerLogin(){
	document.getElementById("loginForm").submit();
}
</script>
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>欢迎你</h3>
						<form action="<%=basePath %>managerLogin.action" name="loginForm" id = "loginForm" method="post">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="logname" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="logpass" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="mb2"><a class="act-but submit" href="javascript:managerLogin();" style="color: #FFFFFF">登录</a></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="<%=basePath %>login/js/TweenLite.min.js"></script>
		<script src="<%=basePath %>login/js/EasePack.min.js"></script>
		<script src="<%=basePath %>login/js/rAF.js"></script>
		<script src="<%=basePath %>login/js/demo-1.js"></script>
		<div style="text-align:center;">
<p>更多模板：<a href="http://www.mycodes.net/" target="_blank">源码之家</a></p>
</div>
	</body>
</html>