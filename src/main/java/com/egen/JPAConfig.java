package com.egen;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class JPAConfig {
	private static final Logger logger = LoggerFactory.getLogger(JPAConfig.class);
	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {
		logger.info("Entity Manager Factory Bean Initialized");
		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
		logger.info("Setting up data source info");
		entityManagerFactoryBean.setDataSource(dataSource());


		entityManagerFactoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		entityManagerFactoryBean.setPackagesToScan("com.egen.model");


		logger.info("Setting up Jpa Properties");
		entityManagerFactoryBean.setJpaProperties(this.jpaProperties());
		return entityManagerFactoryBean;
	}

	@Bean
	public DataSource dataSource() {
		logger.info("dataSource Instance Initialized");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		//ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		logger.info("Setting up PostgresSQL driver");
		dataSource.setDriverClassName("org.postgresql.Driver");
		//ds.setUrl("jdbc:mysql://localhost:3306/order_processing?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
		logger.info("Setting up Url, username and Password for driver class");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/orderprocessing?useJDBCCompliantTimezoneShift=true");
		dataSource.setUsername("postgres");
		dataSource.setPassword("root");
		return dataSource;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		logger.info("transactionManager Initialized");
		JpaTransactionManager transactionManager = new JpaTransactionManager(emf);
		return transactionManager;
	}

	private Properties jpaProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect","org.hibernate.dialect.PostgreSQLDialect");
		//properties.put("hibernate.dialect","org.hibernate.dialect.MySQL57Dialect");
		properties.put("hibernate.hbm2ddl.auto", "create");
		properties.put("hibernate.show_sql", "true");
		return properties;
	}
}
