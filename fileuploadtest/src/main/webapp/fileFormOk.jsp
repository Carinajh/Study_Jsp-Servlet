<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%
    	String path = request.getRealPath("filefolder");
    	int size = 1024*1024*10;//10m
    	String file;
    	String orifile="";//(파일이름 중복이될때)
    	
    	try{
    		MultipartRequest multi = new MultipartRequest(request,path,size,"EUC-KR",new DefaultFileRenamePolicy());
    		
    		Enumeration files = multi.getFileNames();
    		String str =(String)files.nextElement();
    		
    		file = multi.getFilesystemName(str);
    		orifile = multi.getOriginalFileName(str);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
success!!
</body>
</html>