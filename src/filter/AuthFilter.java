package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter("/AuthFilter")
public class AuthFilter implements Filter {

    public AuthFilter() {}

	public void destroy() {}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest reqt = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		HttpSession ses = reqt.getSession(false);
		String reqURI = reqt.getRequestURI();
		System.out.println("reqURI: "+reqURI);
		System.out.println("ses.getAttribute(\"username\"): "+ses.getAttribute("username"));
		/*
		if (reqURI.indexOf("/main/") >= 0 && ses.getAttribute("username") != null)
			chain.doFilter(request, response);
		else
			resp.sendRedirect(reqt.getContextPath() + "/login.xhtml");
		*/
		chain.doFilter(request, response);
		
	}

	public void init(FilterConfig fConfig) throws ServletException {}
	
}
