<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	${10 }<br />
	${99.99 }<br />
	${"abc" }<br />
	${true }<br />
	
	${10+5 }<br />
	${99.99-10 }<br />
	${5*5 }<br />
	${4/2 }<br />
		${1>2 }<br />
	${1<2 }<br />
	${(1>2)?1:2 }<br />
	${(1>2)||(1<2)}<br />
</body>
</html>