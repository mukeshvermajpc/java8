package com.funcational;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunction {
	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(4));
		IntFunction<Integer>f1=i->i*i;
		System.out.println(f1.apply(12));
	}
}
