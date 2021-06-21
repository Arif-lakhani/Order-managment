package com.egen;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
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
@PropertySource(value = "classpath:application.properties")
public class JPAConfig {

//	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {
		//TODO: configure emf
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(emf().getDataSource());
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPackagesToScan("com.egen.model");

		Properties properties = jpaProperties();
		emf.setJpaProperties(properties);
		return emf;

		//return null;
	}

//	@Bean
	public DataSource dataSource() {
		//TODO: configure data source bean
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/order_db?useUnicode=true&tmp;useJDBCCompliantTimeZoneShift=true");
		ds.setUsername("root");
		ds.setPassword("Bhumit@123");
		return ds;
		//return  null;
	}

//	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		//TODO: configure transaction manager
		JpaTransactionManager jtm = new JpaTransactionManager((emf));
		return jtm;
		//return null;
	}

	private Properties jpaProperties() {
		//TODO: configure jpa properties
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		properties.put("hibernate.hbm2ddl.auto", "validate");
		properties.put("hibernate.show_sql", "true");
		return properties;
		//return null;
	}
}
