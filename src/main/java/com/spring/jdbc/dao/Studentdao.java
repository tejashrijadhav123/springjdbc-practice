package com.spring.jdbc.dao;
import java.util.List;
import com.spring.jdbc.entity.Student;

public interface Studentdao {
	
	public int insert(Student s);
    public int chnage(Student s);
    public int remove(Student s);
    public Student getStudent(int studentid);
    public List<Student> getAllStudent();
}
