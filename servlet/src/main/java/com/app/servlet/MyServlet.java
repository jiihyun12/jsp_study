package com.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
// @WebServlet("/home")
// URL을 mapping해주는 역할
// 하지만 파일 하나의 어노텐션이 다 들어가있으면, 유지보수가 어렵다.
// 따라서 web.xml을 만들어서 한번에 일괄적으로 관리한다.
// 프로젝트 하나당 web.xml 하나

public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		response.setContentType("text/html; charset=utf-8;");
		
//		System.out.println(request.getParameter("name"));
//		response.getWriter().append(request.getParameter("name"));
//		
		
//		PrintWriter out = response.getWriter();
//		String name ="";
//		name = request.getParameter("name");
//		
//		out.print("<h1>Hello, JSP</h1>");
//		out.print(name + "환영합니다.");
//		out.close();
		
		PrintWriter out = response.getWriter();
		int num1 =0 , num2 = 0;
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
            	
        if((num1 + num2) % 2 == 0) {
        	out.print("짝수입니다.");
        }else {
        	out.print("홀수입니다.");
        }
		
		
//		response.getWriter().append("Hello, World ").append("\n contextPath : " + request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doGet(request, response);
	}

}
