<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="css/resetbootstrap.css">
</head>
<body>
	<s:property value="message" />
	<br />
	<s:iterator value="members" var="m">
	
		${m.firstName}
		<s:property value="lastName" />
		<a href="members?memberId=<s:property value="id"/>" >编辑</a>&nbsp;
		<a href="delete?memberId=<s:property value="id"/>" >删除</a>
		<br />
	</s:iterator>
	<br />
	<s:form action="save">
		<s:textfield id="id" name="member.id" cssStyle="display:none" />
		<s:textfield id="firstName" label="Fisrt Name" name="member.firstName" />
		<s:textfield id="lastName" label="Last Name" name="member.lastName" />
		<s:submit/>
	</s:form>
<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>