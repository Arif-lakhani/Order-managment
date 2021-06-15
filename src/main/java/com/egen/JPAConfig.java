package com.egen;


import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class JPAConfig {

//	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {
		//TODO: configure emf
		return null;
	}

//	@Bean
	public DataSource dataSource() {
		//TODO: configure data source bean
		return  null;
	}

//	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		//TODO: configure transaction manager
		return null;
	}

	@SuppressWarnings("unused")
	private Properties jpaProperties() {
		//TODO: configure jpa properties
		return null;
	}
}
