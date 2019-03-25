package com.other;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {
  public static void main(String[] args) {
	IntBinaryOperator b=(i1,i2)->i1*i2;
	System.out.println(b.applyAsInt(10, 20));
}
}
