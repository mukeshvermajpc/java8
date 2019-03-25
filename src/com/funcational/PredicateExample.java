package com.funcational;

import java.util.function.Predicate;

public class PredicateExample {
  public static void main(String[] args) {
	Predicate<Integer>p=i->i%2==0;
	System.out.println(p.test(10));
	System.out.println(p.test(13));
	System.out.println(p.test(124));
	System.out.println(p.test(123));
}
}
