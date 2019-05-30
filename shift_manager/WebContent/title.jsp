<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>タイトル画面</title>
</head>
<body>
<div id = "main">
	<div id = "top">
		<img src = "./img/title logo.png">
	</div>
	<s:form action = "HomeAction">
		<s:submit value = "PRESS THIS BUTTON" />
	</s:form>
</div>
</body>
</html>