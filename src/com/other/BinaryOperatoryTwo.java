package com.other;

import java.util.function.BinaryOperator;

public class BinaryOperatoryTwo {
  public static void main(String[] args) {
	BinaryOperator<Integer>b=(i1,i2)->i1*i2;
	System.out.println(b.apply(10,20));
}
}
