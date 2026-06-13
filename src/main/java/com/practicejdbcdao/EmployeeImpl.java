package com.practicejdbcdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.practicejdbcentity.Employee;
@Component("empp")
public class EmployeeImpl implements EmployeeIn{

	private JdbcTemplate jd;
	
    public int insert(Employee e) {
		String result="insert into emp values(?,?,?)";
		int r=jd.update(result,e.getId(),e.getName(),e.getPosition());
		return r;
	}
    public int delete(Employee e) {
    	String result="delete from emp where id=?";
		int r=jd.update(result,e.getId());
		return r;
	}
    public int update(Employee e) {
    	String result="update  emp set name=? where id=?";
		int r=jd.update(result,e.getName(),e.getId());
		return r;
	}
    public List<Employee> setAll() {
		String result="select * from emp";
		RowMapper<Employee> R=new Rowmapperimpl();
		List<Employee>r=jd.query(result, R);
		return  r;
	}
	public JdbcTemplate getJd() {
		return jd;
	}
	@Autowired
	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}
	
	


	

}
