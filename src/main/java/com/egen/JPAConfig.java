package com.egen;


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

//	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {
		//TODO: configure emf
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setDataSource(dataSource());
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setPackagesToScan("com.egen.model");
		Properties properties = jpaProperties();
		emf.setJpaProperties(properties);
		return emf;
	}

//	@Bean
	public DataSource dataSource() {
		//TODO: configure data source bean
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/order_mgmt?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC");
		ds.setUsername("root");
		ds.setPassword("password");
		return  ds;
	}

//	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		//TODO: configure transaction manager
		JpaTransactionManager jpaTransactionManager = new JpaTransactionManager((emf));
		return jpaTransactionManager;
	}

	private Properties jpaProperties() {
		//TODO: configure jpa properties
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		properties.put("hibernate.hbm2ddl.auto", "create");
		properties.put("hibernate.show_sql", "true");
		return properties;
	}
}
