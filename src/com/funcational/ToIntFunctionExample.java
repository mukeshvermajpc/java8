package com.funcational;

import java.util.function.ToIntFunction;

public class ToIntFunctionExample {
   public static void main(String[] args) {
	ToIntFunction<String>f=s->s.length();
	System.out.println(f.applyAsInt("Durga"));
}
}
