package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormEx
 */
@WebServlet("/FormEx")
public class FormEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("doPost");
		request.setCharacterEncoding("EUC-KR");
		
		String name = request.getParameter("name");
		String id= request.getParameter("id");
		String pw= request.getParameter("pw");
		
		String[] hobby= request.getParameterValues("hobby");
		String major= request.getParameter("major");
		String protocol= request.getParameter("protocol");
		
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter pr = response.getWriter();
		
		pr.println("<html><head></head><body>");
		pr.println("이름:"+name+"</br>");
		pr.println("아이디:"+id+"<br/>");
		pr.println("비밀번호:"+pw+"<br/>");
		pr.println("취미:"+Arrays.toString(hobby)+"<br/>");
		pr.println("전공:"+major+"<br/>");
		pr.println("프로토콜:"+protocol+"<br/>");
		pr.println("</body></html>");
		
		pr.close();
		
	}

}
