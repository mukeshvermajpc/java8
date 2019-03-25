package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaCollection {
  public static void main(String args[])
  {
	  List<Integer>list=new ArrayList();
	  list.add(20);
	  list.add(10);
	  list.add(25);
	  list.add(5);
	  list.add(30);
	  list.add(0);
	  list.add(15);
	  list.add(60);
	  Comparator<Integer>c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
	  Collections.sort(list,c);
	  list.stream().forEach(System.out::println);
  }
}
