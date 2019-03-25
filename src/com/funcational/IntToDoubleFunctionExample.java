package com.funcational;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {
   public static void main(String args[])
   {
	   IntToDoubleFunction f=i->Math.sqrt(i);
	   System.out.println(f.applyAsDouble(9));
	   System.out.println(f.applyAsDouble(27));
   }
}
