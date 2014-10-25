<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/control.css">
<link rel="stylesheet" type="text/css" href="css/reset.css">
</head>
<body>
	<div id="index_content">
		<div class="index_passeddays">
			已过天数:
			<s:property value="passedDays" />
			天
			<div>
				<a href="member/members">测试</a>
			</div>
		</div>
	</div>
</body>
</html>
