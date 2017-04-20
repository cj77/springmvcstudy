<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>首页</title>
<link href="/lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <div class="container">
    	<div>
    		<%=request.getAttribute("FORMBUILDER")%>
    	</div>
    </div>    
    <script src="/lib/jquery-1.12.4.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>