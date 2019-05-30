<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id = "main">
		<div id = "top">
			<h1><s:property value = "session.userName" />さんこんにちは</h1>
		</div>
		<div>
			<s:if test = "decided > 0">
				<p>
					今月の確定シフトは
					<a href = "<s:url action = 'ThisMonthShiftAction' />">
						こちらから確認して下さい。</a>
				</p>
			</s:if>
			<p>
				来月のシフトの提出・変更などは
				<a href = '<s:url action = "NextMonthShiftAction" />'>
				こちらから申請して下さい。</a>
			</p>
		</div>
	</div>
</body>
</html>