<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <jsp:useBean id="member" class="fileuploadtest.memberInfo" scope="page"></jsp:useBean>
    <jsp:setProperty name="member" property="name" value="ȫ�浿"/>
    <jsp:setProperty name="member" property="id" value="abc"/>
    <jsp:setProperty name="member" property="pw" value="123"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
�̸�:<jsp:getProperty name="member" property="name"/><br/>
���̵�:<jsp:getProperty name="member" property="id"/><br/>
�н�����:<jsp:getProperty name="member" property="pw"/><br/>
<hr/>
�̸�:${member.name }<br/>
���̵�:${member.id }<br/>
�н�����:${member.pw }<br/>

</body>
</html>