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
			<p>SHIFT MAKER</p>
		</div>
		<div>
			<p>現在の登録シフトは以下の通りです。</p>
			<table>
			<s:iterator value = "shiftInfoDTOList">
				<tr>
					<td>
						<s:property value = "id"/>
					</td>
					<td>
						<s:property value = "userName"/>
					</td>
					<td>
						<s:property value = "partCode"/>
					</td>
					<td>
						<s:property value = "day"/>
					</td>
					<td>
						<s:property value = "start"/>
					</td>
					<td>
						<s:property value = "end"/>
					</td>
					<td>
						<s:property value = "color"/>
					</td>
					<td>
						<s:property value = "status"/>
					</td>
				</tr>
			</s:iterator>
			</table>

			<div>
				<p>空白の時間に自分、または誰かを登録して下さい。</p>
				<p>
					登録は
					<a href = '<s:url action = "GoHomeAction" />'>こちら</a>
					から
				</p>
			</div>

			<div>
				<p>これで確定でよければ</p>
					actionに飛ばします。
<%-- 				<s:form action = "DecideShiftAction"> --%>
<%-- 					<s:submit value = "シフト確定" /> --%>
<%-- 					<s:hidden name = decided value = "1"/> --%>
<%-- 				</s:form> --%>
				<p>シフト確定ボタンを押して下さい。</p>
			</div>
		</div>
	</div>
</body>
</html>