package com.funcational;

import java.util.function.Function;

public class FunctionExample {
   public static void main(String args[])
   {
	   Function<Integer,Integer>f=i->i*i;
	   System.out.println(f.apply(12));
	   System.out.println(f.apply(15));
   }
}
