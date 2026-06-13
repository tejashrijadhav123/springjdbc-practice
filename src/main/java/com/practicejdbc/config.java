package com.practicejdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.practicejdbcentity.Employee;

@Configuration
@ComponentScan(basePackages = {"com.practicejdbcdao"})
public class config {
	@Bean("ds")
	public DataSource getDatasource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/employee");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean("jdbc")
	 public JdbcTemplate getJdbcTemplate()
	 {
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getDatasource());
		return jd;	 
	 }
}
