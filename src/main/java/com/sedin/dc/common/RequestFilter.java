package com.sedin.dc.common;

import com.dzy.support.platform.common.util.Principal;
import com.dzy.support.platform.service.exception.ServiceException;
import com.dzy.support.platform.service.util.ServiceFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Component
@ServletComponentScan
@WebFilter(urlPatterns = "/*", filterName = "requestFilter")
public class RequestFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
			Principal principal = new Principal();
		
			principal.setAuthorization(true);
		
			principal.setUserNo("10001");
		
			Principal.setContext(principal);
		
			chain.doFilter(request, response);
			
			try {
				
				ServiceFactory.getInstance().releaseService(Principal.getContext());
				
				Principal.removeContext();
				
				System.out.println("线程结束");
				
			} catch (ServiceException e) {
				
				
			}
	}
}