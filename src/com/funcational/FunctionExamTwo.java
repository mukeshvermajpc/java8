package com.funcational;

import java.util.function.Function;

public class FunctionExamTwo {
   public static void main(String args[])
   {
	   Function<String,Integer>f=s->s.length();
	   System.out.println(f.apply("Raushan"));
	   System.out.println(f.apply("Manish"));
   }
}
