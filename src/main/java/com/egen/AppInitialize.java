package com.egen;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import lombok.extern.slf4j.Slf4j;
@Slf4j
public class AppInitialize extends AbstractAnnotationConfigDispatcherServletInitializer{
/**
 * implement the following methods
 */

	@Override
	protected Class<?>[] getRootConfigClasses() {

		return new Class<?>[]{AppConfig.class, JPAConfig.class};

	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[0];
	}

	@Override
	protected String[] getServletMappings() {
		log.info("asd");
		return new  String[]{"/"};
	}
}
