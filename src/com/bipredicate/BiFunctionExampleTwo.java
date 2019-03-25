package com.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import com.funcational.Employee;

public class BiFunctionExampleTwo {
   public static void main(String[] args) {
	List<Employee>list=new ArrayList();
	BiFunction<String,Integer,Employee>f=(name,salary)->new Employee(name,salary);
    list.add(f.apply("Durga",1000));
    list.add(f.apply("Ravi", 2000));
    list.add(f.apply("Shiva", 2400));
    list.add(f.apply("Rahul", 1400));
    
    for(Employee emp:list)
    {
    	System.out.println("Name: "+emp.name);
    	System.out.println("Salary: "+emp.salary);
    	System.out.println();
    }
   
   
   }
}
