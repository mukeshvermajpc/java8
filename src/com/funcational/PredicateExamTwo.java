package com.funcational;

import java.util.function.Predicate;

public class PredicateExamTwo {
  public static void main(String args[])
  {
	  String[]s= {"Rahul","Vinay","Manish","Shashank","Shabez"};
	  Predicate<String>p=s1->s1.length()>5;
	  for(String st:s)
	  {
		  if(p.test(st))
			  System.out.println(st);
	  }
  }
}
