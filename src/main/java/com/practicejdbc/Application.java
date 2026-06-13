package com.practicejdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practicejdbcdao.EmployeeImpl;
import com.practicejdbcdao.EmployeeIn;
import com.practicejdbcentity.Employee;

public class Application {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(config.class);
		EmployeeIn temp=(EmployeeIn)con.getBean("empp");
		Employee e=new Employee();
		
		//insert
		/*e.setId(3);
		e.setName("Shri");
		e.setPosition("engineer");
		int i=temp.insert(e);
        System.out.println("record inserted:"+e); */
		
		//delete
		//e.setId(2);
        //int i=temp.delete(e);
        //System.out.println("record deleted:"+e);
        
        //update 
		//e.setName("Shriyash");
		//e.setId(3);
		//int i=temp.update(e);
        //System.out.println("record updated:"+e);
        
		//Select Query
		List<Employee>e1=(List<Employee>) temp.setAll();
		System.out.println("record is:"+e1);
	}

}
