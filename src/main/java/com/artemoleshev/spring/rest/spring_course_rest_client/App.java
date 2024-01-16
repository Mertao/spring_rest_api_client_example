package com.artemoleshev.spring.rest.spring_course_rest_client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.artemoleshev.spring.rest.entity.Employee;
import com.artemoleshev.spring.rest.spring_course_rest_client.configuration.MyConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new 
        		AnnotationConfigApplicationContext(MyConfig.class);
        
        Communication communication = context.getBean("communication", Communication.class);
        
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
        
        Employee employee = communication.getEmployee(15);
        System.out.println(employee);
        
        Employee newEmployee = new Employee("Api", "Test", "123", 123);
        communication.saveEmployee(newEmployee);
        System.out.println(newEmployee);
        
        Employee updatedEmployee = communication.getEmployee(18);
        updatedEmployee.setSalary(3333);
        communication.saveEmployee(updatedEmployee);
        System.out.println(updatedEmployee);
        
        
        communication.deleteEmployee(18);
        
        context.close();
    }
}
