package com.funcational;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExamThree {
    public static void main(String args[])
    {
      List<Employee>list=new ArrayList();
      list.add(new Employee("Durga",1000));
      list.add(new Employee("Ravi",2000));
      list.add(new Employee("Shiva",3000));
      list.add(new Employee("Mahesh",4000));
      list.add(new Employee("Adarsh",5000));
      list.add(new Employee("Sagar",6000));
      Predicate<Employee>p=e->e.salary>4000;
      for(Employee emp:list)
      {
    	  if(p.test(emp))
    		  System.out.println(emp.name+"  "+emp.salary);
      }
    }
}
