package com.earth.soohyeonglee;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/super-simple")
public class SuperSimpleServlet extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		request.setAttribute("requestName", request.getParameter("name"));
		request.setAttribute("servletName", getServletName());
		request.getRequestDispatcher("WEB-INF/views/helloearth.jsp").forward(request, response);
	}
	
	@Override
	public String getServletName() {
		return this.getServletConfig().getServletName();
	}
}