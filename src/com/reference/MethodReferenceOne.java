package com.reference;
public class MethodReferenceOne {
  public static void m1()
  {
	for(int i=0;i<10;i++)
	{
		System.out.println("Child thread");
	}
  }
  public static void main(String args[])
  {
	  Runnable r=MethodReferenceOne::m1;
	  Thread t=new Thread(r);
	  t.start();
	  for(int i=0;i<10;i++)
	  {
		  System.out.println("Main Thread");
	  }
  }
}
