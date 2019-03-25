package com.consumer;

import java.util.function.Consumer;

public class ConsumerExample1 {
  public static void main(String[] args) {
	 Consumer<String>c=s->System.out.println(s);
	 c.accept("Manish");
	 c.accept("Durga");
	 c.accept("Shabez");
	 c.accept("Rahul");
	
}
}
