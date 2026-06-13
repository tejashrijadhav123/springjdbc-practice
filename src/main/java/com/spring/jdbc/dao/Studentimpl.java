package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;
@Component("ss")
public class Studentimpl implements Studentdao{
	
	private JdbcTemplate jd;
	public int insert(Student s)
	{
		 String query="insert into student(id,name,city) values(?,?,?)";
		 int r=this.jd.update(query,s.getId(),s.getName(),s.getCity());
		 return r;
	}
	public int chnage(Student s) {
		String q="update student set name=?,city=? where id=?";
		int r=this.jd.update(q,s.getName(),s.getCity(),s.getId());
		return r;
	}
	public int remove(Student s) {
		String q="delete from student where id=?";
		int r=this.jd.update(q,s.getId());
		return r;
	}
	public Student getStudent(int studentid) {
		String query="select * from student where id=?";
		RowMapper<Student>rowMapper=new RowMapperimpl();
		Student r=this.jd.queryForObject(query, rowMapper,studentid);
		return r;
	}
	public List<Student> getAllStudent() {
		String query="select * from student";
		RowMapper<Student>rowMapper=new RowMapperimpl();
		List<Student> s=this.jd.query(query, rowMapper);
		return s;
	}
	public JdbcTemplate getJd() {
		return jd;
	}
	@Autowired
	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}
	

}
