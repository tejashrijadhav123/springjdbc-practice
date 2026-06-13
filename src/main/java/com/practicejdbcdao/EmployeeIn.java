package com.practicejdbcdao;

import java.util.List;

import com.practicejdbcentity.Employee;

public interface EmployeeIn {
	
	public int insert(Employee e);
    public int delete(Employee e);
    public int update(Employee e);
    public List<Employee> setAll();
}
