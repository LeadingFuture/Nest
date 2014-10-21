<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
<link rel="stylesheet"
	href="http://cdn.bootcss.com/bootstrap/3.2.0/css/bootstrap.min.css">
<link rel="stylesheet" href="../css/resetbootstrap.css">
</head>
<body>
	<s:property value="message" />
	<br />
	<table>
		<thead>
			<tr>
				<th>姓名</th>
				<th>开始日期</th>
				<th>天数</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="members" var="m">
				<tr>
					<td>${m.userName}</td>
					<td><s:date name="#m.startDate" format="yyyy-MM-dd"/> </td>
					<td>${m.passedDays} 天</td>
					<td>
					    <a href="members?memberId=<s:property value="id"/>">编辑</a>&nbsp;
						<a href="delete?memberId=<s:property value="id"/>">删除</a>
					</td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
	<br />
	<s:form action="save">
		<s:textfield name="member.id" cssStyle="display:none" />
		<s:textfield label="姓名" name="member.userName" />
		<s:radio label="性别" list="#{'1':'男','0':'女'}" name="member.sex"/>
		<s:textfield label="开始日期" name="member.startDate" />
		<s:submit />
	</s:form>
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</body>
</html>