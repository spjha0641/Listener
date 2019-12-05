package com.servlet.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


@WebFilter("/*")
public class First_Filter implements Filter {

    
    public First_Filter() {
    	System.out.println("First_Filter-> def constructor...");
    }

		public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		System.out.println("First_Filter--> doFilter... Before");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("First_Filter-->doFilter... After");
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("First_Filter-->init...");
	}
	public void destroy() {
		
	}

}
