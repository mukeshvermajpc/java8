package com.reference;
public class MethodReferenceTwo {
	public static void sum(int x,int y)
	{
		System.out.println("The Sum "+(x+y));
	}
    public static void main(String args[])
    {
    	Interf i=(a,b)->System.out.println("The Sum "+(a+b));
    	i.add(10, 20);
    	Interf i1=MethodReferenceTwo::sum;
    	i1.add(200, 300);
    	
    }
}
