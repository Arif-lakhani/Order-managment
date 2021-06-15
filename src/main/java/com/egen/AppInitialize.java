package com.egen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Slf4j
public class AppInitialize extends AbstractAnnotationConfigDispatcherServletInitializer{
	/**
	 * implement the following methods
	 */

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
		log.info("Getting all /api/ mappings");
		return new  String[]{"/api/*"};
	}
}
