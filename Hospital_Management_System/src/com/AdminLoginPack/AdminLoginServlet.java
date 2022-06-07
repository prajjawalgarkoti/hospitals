package com.AdminLoginPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AdminLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		
	String user =	request.getParameter("username");
	String pass = request.getParameter("password");
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	
	if(user.equals("admin1") && pass.equals("admin@1"))
	{
		response.sendRedirect("WelcomeAdmin.html");
	}
	
	else if(user.equals("admin2") && pass.equals("admin@2")){
		
		response.sendRedirect("WelcomeAdmin.html");

	}
	
	else {
		
		out.println("You are not admin ");
	}
}
}
