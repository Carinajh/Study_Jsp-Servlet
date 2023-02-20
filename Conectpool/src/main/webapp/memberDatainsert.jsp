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
			String sql = "insert into memberforpre (id,pw,name,phone) values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "abc");
			ps.setString(2, "123");
			ps.setString(3, "홍길동");
			ps.setString(4, "1111");
			ps.executeUpdate();
			
			ps.setString(1, "aaa");
			ps.setString(2, "111222");
			ps.setString(3, "홍길tn");
			ps.setString(4, "3344");
			ps.executeUpdate();
			
			ps.setString(1, "bbb");
			ps.setString(2, "222333");
			ps.setString(3, "홍길tjs");
			ps.setString(4, "5566");
			ps.executeUpdate();
			
			ps.setString(1, "ccc");
			ps.setString(2, "444555");
			ps.setString(3, "홍길aud");
			ps.setString(4, "6677");
			ps.executeUpdate();
			
			out.print("insert success");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
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
	<a href="memberDataView">회원정보보기</a>
</body>
</html>