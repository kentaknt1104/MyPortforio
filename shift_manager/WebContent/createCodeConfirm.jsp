<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type = "text/javascript" src = "./js/main.js"></script>
<title>ユーザー登録確認画面</title>
</head>
<body>
	<div id = "main">
		<div id = "top">
			<h3>
				あなたのパートコードは
				<s:property value = "session.partCode" />です。
			</h3>
		</div>
		<div>
			<s:form id = "createForm">
				<h3>以下の内容で登録してもよろしいですか。</h3>
				<p>氏名：<s:property value = "session.userName" /></p>
				<p>パートコード：<s:property value = "session.partCode" /></p>
				<s:submit value = "戻る" id = "backButton" class = "btn" onclick = "backAction()" />
				<s:submit value = "登録" id = "registButton" class = "btn" onclick = "registAction()" />
			</s:form>
		</div>
	</div>
</body>
</html>