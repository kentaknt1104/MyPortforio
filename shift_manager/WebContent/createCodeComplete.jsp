<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv = "refresh" content = "3; url = 'LoginAction'">
<title>Insert title here</title>
</head>
<body>
	<h3>
		登録が完了しました。<br />
		3秒後に自動遷移します。
	</h3>
	<h4>
		自動遷移しない場合はお手数ですが、
		<a href = '<s:url action = "LoginAction" />'>こちら</a>
		をクリックして下さい。
	</h4>
</body>
</html>