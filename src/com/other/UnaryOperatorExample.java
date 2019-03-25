package com.other;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
   public static void main(String[] args) {
	UnaryOperator<Integer>f=i->i*i;
	System.out.println(f.apply(6));
}
}
 