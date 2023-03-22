package com.earth.moon;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller	//1. 컨트롤러 어노테이션
public class ThrowingTwoDice {
	
	@RequestMapping("/rollDice")
	public void moon(HttpServletResponse response) {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter out;
		//''싱글포테이션
		
		int id1 = (int) (Math.random() * 6) + 1;
		int id2 = (int) (Math.random() * 6) + 1;
		
		try {
			
			out = response.getWriter();
			out.print("<html>");
			out.print("<head>");
			out.print("</head>");
			out.println("<body>");
			out.println("<img src='resources/img/dice"+id1+".jpg' />");
			out.println("<img src='resources/img/dice"+id2+".jpg' />");
			out.println("</body>");
			out.print("</html>");
			
		} catch (IOException e) {e.printStackTrace();}
		
		
	}
}
















