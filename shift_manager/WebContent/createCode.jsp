<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Code</title>
</head>
<body>
	<div id = "main">
		<div id = "top">
			<h1>在籍登録をしよう</h1>
		</div>
		<div>
			<h3>まず始めに氏名を入力して下さい</h3>
			<s:form action = "CreateCodeConfirmAction">
				<s:textfield name = "userName" />
				<s:submit value = "送信" />
			</s:form>
		</div>
	</div>
</body>
</html>