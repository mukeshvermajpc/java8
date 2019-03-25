package com.biconsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
   public static void main(String[] args) {
	List<Employee>list=new ArrayList();
	populate(list);
	BiConsumer<Employee, Double>c=(e,d)->e.salary=e.salary+d;
	for(Employee e:list)
	{
		c.accept(e, (double) 500);
	}
	for(Employee emp:list)
	{
		System.out.println("Name: "+emp.name);
		System.out.println("Salary: "+emp.salary);
		System.out.println();
	}
}
   public static void populate(List<Employee>l)
   {
	   l.add(new Employee("Durga",1000));
	   l.add(new Employee("Sunny",2000));
	   l.add(new Employee("Bunny",3000));
	   l.add(new Employee("Chinny",4000));
	   l.add(new Employee("Gunny",5000));
   }
}
