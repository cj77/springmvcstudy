<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/view/include/taglib.jsp"%>

<html>
<body>
<h2>Hello World!</h2>

<form id="loginForm" class="form-signin" action="${ctx}/login" method="post">
		<label class="input-label" for="username">登录名</label>
		<input type="text" id="username" name="username" class="input-block-level required" value="test">
		<label class="input-label" for="password">密码</label>
		<input type="password" id="password" name="password" class="input-block-level required">
		<input class="btn btn-large btn-primary" type="submit" value="登 录"/>&nbsp;&nbsp;
		<label for="rememberMe" title="下次不需要再登录"><input type="checkbox" id="rememberMe" name="rememberMe" checked}/> 记住我（公共场所慎用）</label>
		
	</form>
	
</body>
</html>
