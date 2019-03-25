package com.funcational;

import java.util.function.Predicate;

public class PredicateEven {
  public static void main(String args[])
  {
	  int[]x= {0,5,10,15,20,25,30,35};
	  Predicate<Integer>p=i->i%2==0;
	  Predicate<Integer>p1=i->i>10;
	  for(int a:x)
	  {
		  if(p.negate().test(a))
			  System.out.println(a);
	  }
	  
  }
}
