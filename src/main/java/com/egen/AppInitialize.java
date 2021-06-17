package com.egen;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitialize extends AbstractAnnotationConfigDispatcherServletInitializer{

protected Class<?>[] getRootConfigClasses() {
	return new Class[]{AppConfig.class,JPAConfig.class,SwaggerConfig.class};
}

	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

	//Accepts end point request coming only from /api
	protected String[] getServletMappings() {
		return new String[]{"/api/*"};
	}
}
