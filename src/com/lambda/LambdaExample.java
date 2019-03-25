package com.lambda;
public class LambdaExample {
  public static void main(String args[])
   {
	   Interf obj=()->{System.out.println("This is a lambda expression example");};
       obj.m1();
       Operation op=(int a,int b)->{ return a+b;};
       System.out.println("Sum of two number is:"+op.add(10, 20));
       System.out.println("Sum of two number is"+op.add(200, 300));
   }
}
