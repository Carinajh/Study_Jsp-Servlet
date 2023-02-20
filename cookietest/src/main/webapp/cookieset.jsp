<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("cookieName","cookieValue"); //쿠키생성 쿠키이름,쿠키값
		cookie.setMaxAge(60*60); //1시간유지
		response.addCookie(cookie);
		cookie = new Cookie("cookie333","cookie333"); //쿠키생성 쿠키이름,쿠키값
		cookie.setMaxAge(60*60); //1시간유지
		response.addCookie(cookie);
	%>
	
	<a href="cookieget.jsp">cookie get</a>
</body>
</html>