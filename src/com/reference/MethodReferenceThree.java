package com.reference;
public class MethodReferenceThree {
  public static void main(String[] args) {
	Interf1 i=Sample::new;
	Sample s1=i.get();
	Sample s2=i.get();
	Sample s4=i.get();
}
}
