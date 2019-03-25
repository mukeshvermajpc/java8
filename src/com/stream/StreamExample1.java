package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample1 {
	public static void main(String args[]) {
     List<Integer>list=new ArrayList();
     list.add(0);
     list.add(5);
     list.add(10);
     list.add(15);
     list.add(20);
     list.add(25);
     
     System.out.println(list);
     List<Integer>l2=list.stream().filter(x->x%2==0).collect(Collectors.toList());
     l2.forEach(System.out::println);
     
     
     
	}
}
