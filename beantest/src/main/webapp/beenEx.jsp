<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="student" class="beantest.ex.Student" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:setProperty name="student" property="user" value="홍길동"/>
	<jsp:setProperty name="student" property="age" value="13"/>
	<jsp:setProperty name="student" property="grade" value="6"/>
	<jsp:setProperty name="student" property="num" value="7"/>
	
	이름:<jsp:getProperty name="student" property="user"/><br/>
	나이:<jsp:getProperty name="student" property="age"/><br/>
	학년:<jsp:getProperty name="student" property="grade"/><br/>
	번호:<jsp:getProperty name="student" property="num"/><br/>
	
</body>
</html>