package com.earth.cooky;
								
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
										//미리 초기화(early init)
//@WebServlet(urlPatterns = {"/hello", "/hello/*"}, loadOnStartup = 1)
@WebFilter(urlPatterns = "/*")  //모든 요청에 필터를 적용
public class PerformanceFilter implements Filter{

	@Override
	public void init(FilterConfig filterConfig) 
			throws ServletException {
		// 초기화 작업
	}
	
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response,FilterChain chain) 
			throws IOException, ServletException {
		// 1. 전처리 작업
		long startTime = System.currentTimeMillis();
		
		
		// 2. 서블릿 또는 다음 필터를 호출
		chain.doFilter(request, response);		//원래 실행되어야할게 실행됐고
		
		// 3. 후처리 작업 ms 밀리세컨즈 1000분의 1초
		System.out.println("[" +((HttpServletRequest)request).getRequestURI()+ "]");
		System.out.println("소요시간 = " + (System.currentTimeMillis()- startTime)+ "ms");
	}
	
	@Override
	public void destroy() {
		//정리 작업
	}

}
