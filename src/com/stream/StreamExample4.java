package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample4 {
   public static void main(String args[])
   {
	   List<Integer>list=new ArrayList();
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(45);
	   Integer[]i=list.stream().toArray(Integer[]::new);
	   for(Integer i1:i)
	   {
		   System.out.println(i1);
	   }
	   //print using stream
	   System.out.println("Print using Stream");
	   Stream.of(i).forEach(System.out::println);
   }
}
