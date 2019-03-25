package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList();
		list.add(70);
		list.add(45);
		list.add(10);
		list.add(65);
		list.add(20);
		list.add(25);
		System.out.println(list);
		long fail = list.stream().filter(x -> x < 35).count();
		System.out.println("Failed student is: " + fail);

		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List is:" + sortedList);

		System.out.println("Decending order");
		List<Integer> decSorted = list.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)
				.collect(Collectors.toList());
		System.out.println(decSorted);
	}
}
