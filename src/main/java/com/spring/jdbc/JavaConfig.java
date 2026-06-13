package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.Studentdao;
import com.spring.jdbc.dao.Studentimpl;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})
public class JavaConfig {
	@Bean("ds")
	public DataSource getdatasource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	@Bean("jdbctemp")
	public JdbcTemplate getjdbctemplate()
	{
		JdbcTemplate jd=new JdbcTemplate();
		jd.setDataSource(getdatasource());
		return jd;
	}
	//for the purpose of add autowiring we comment this method
	/*
	@Bean("ss")
	public Studentdao getStudentdao()
	{
		Studentimpl ss=new Studentimpl();
		ss.setJd(getjdbctemplate());
		return ss;	
	}*/
	

}
