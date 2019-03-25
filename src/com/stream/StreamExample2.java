package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamExample2 {
	public static void main(String args[]) {
	     List<Integer>mark=new ArrayList();
	     mark.add(0);
	     mark.add(5);
	     mark.add(10);
	     mark.add(15);
	     mark.add(20);
	     mark.add(25);
	     
	     System.out.println(mark);
	     /*using map*/
	     List<Integer>updatedMark=mark.stream().map(x->x+5).collect(Collectors.toList());
	     updatedMark.forEach(System.out::println);
	     
	     
	     
		}
}
