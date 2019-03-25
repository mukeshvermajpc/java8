package com.lambda;
public class WithOutLambda implements Interf {

	@Override
	public void m1() {
		System.out.println("it is an example of without lambda expression");		
	}
 public static void main(String args[])
 {
	 Interf obj=new WithOutLambda();
	 obj.m1();
	 obj.m1();
 }
}
