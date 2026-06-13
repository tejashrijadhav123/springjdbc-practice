package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.Studentdao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World in spring jdbc!" );
       /*ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       JdbcTemplate temp=(JdbcTemplate) con.getBean("jdbctemp");
       //Insert Query
       String query="insert into student(id,name,city) values(?,?,?)";
       //Fire the Query
       int result=temp.update(query,2,"teju","pune");
       System.out.println("no of record inserted::"+result);*/
        
       // ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
        Studentdao temp=(Studentdao) con.getBean("ss");
        Student s=new Student();
        /*for insertion
        s.setId(3);
        s.setName("Shri");
        s.setCity("pune");
        
        int result=temp.insert(s);
        System.out.println("no of record insert"+result);*/
        
        //for updation
       /* s.setId(1);
        s.setName("Tejashri");
        s.setCity("satara");
        int result=temp.chnage(s);
        System.out.println("no of record updation"+result);*/
        
        //for deletion
        /*s.setId(2);
        int result=temp.remove(s);
        System.out.println("no of record delete"+result);*/
        
        //Student s1=temp.getStudent(1);
        //System.out.println(s1);
        
        List<Student> tt=temp.getAllStudent();
        for (Student student : tt) {
			System.out.println(student);
		}
    }
}
