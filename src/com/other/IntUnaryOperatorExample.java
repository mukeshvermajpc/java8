package com.other;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorExample {
  public static void main(String[] args) {
	IntUnaryOperator f=i->i*i;
	System.out.println(f.applyAsInt(6));
}
}
