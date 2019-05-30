<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>シフト管理</title>
</head>
<body>
	<div id = "main">
	<s:if test = "errorMessage != null">
		<div>
			<p><s:property value = "errorMessage" /></p>
		</div>
	</s:if>
	<s:elseif test="adminFlg > 0">
		<div id = "top">
			<h1>シフト管理を始めよう</h1>
		</div>
		<div>
			<p>
				申請されたシフトは
				<a href = '<s:url action = "ShiftCheckAction" />'>こちら</a>
			</p>
			<p>
				シフトの変更や設定は
				<a href = '<s:url action = "ShiftManageAction" />'>こちら</a>
			</p>
		</div>
	</s:elseif>
	<s:else>
		<div id = "top">
			<h1>シフト登録を始めよう</h1>
		</div>
		<div>
			<h3>名前とパートコードを入力してください</h3>
			<s:form action = "LoginAction">
				<s:textfield name = "userName" label = "登録者氏名" />
				<s:password name = "partCode" label = "パートコード "/>
				<s:submit value = "送信" />
			</s:form><br />
			<div>
				<p>
					初めての出勤の方は
					<a href = '<s:url action = "CreateCodeAction" />'>こちら</a>
				</p>
			</div>
		</div>
	</s:else>
	</div>
</body>
</html>