package com.egen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class AppInitialize extends AbstractAnnotationConfigDispatcherServletInitializer{
	/**
	 * implement the following methods
	 */
	private static final Logger logger = LoggerFactory.getLogger(AppInitialize.class);
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[]{AppConfig.class, JPAConfig.class};

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

	@Override
	protected String[] getServletMappings() {
		logger.info("Getting all /api/ mappings");
		return new  String[]{"/api/*"};
	}
}
