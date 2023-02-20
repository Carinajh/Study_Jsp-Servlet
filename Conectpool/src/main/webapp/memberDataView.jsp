<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%!
		Connection conn;
		PreparedStatement ps;
		ResultSet rs;
		
		private String driver= "oracle.jdbc.driver.OracleDriver";
		private String url ="jdbc:oracle:thin:@localhost:1521:orcl";
		private String uid = "c##scott";
		private String upw = "tiger";
	%>
	<%
		try{
			Class.forName(driver);
			
			conn = DriverManager.getConnection(url,uid,upw);
			String sql = "select * from memberforpre";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				
				out.println(id + " " + pw + " "+name+" "+phone+" </br>");
			}
			
		}catch(Exception e){
			try {
				if(rs !=null) rs.close();
				if(ps != null) ps.close();	
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.getStackTrace();
			}
		}
	%>
</body>
</html>