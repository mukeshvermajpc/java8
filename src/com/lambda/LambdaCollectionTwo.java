package com.lambda;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaCollectionTwo {
  public static void main(String[] args) {
	List<Employee>list=new ArrayList();
	list.add(new Employee(12,"Manish"));
	list.add(new Employee(10,"Shashank"));
	list.add(new Employee(15,"Shavez"));
	Collections.sort(list,(e1,e2)->(e1.id<e2.id)?-1:(e1.id>e2.id)?1:0);
    list.forEach((Employee e)->System.out.println(e.id+" "+e.name));
    Collections.sort(list, (e1,e2)->e1.name.compareTo(e2.name));
    list.forEach((Employee e)->System.out.println(e.id+" "+e.name));
  }
}
