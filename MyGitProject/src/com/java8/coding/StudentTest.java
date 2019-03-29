package com.java8.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> studentlist = Arrays.asList(new Student(1, "kalyan"), new Student(2, "manisha"));
		studentlist.stream().filter(student -> student.id == 1).forEach(student -> System.out.println(student.name));
		/*
		 * Map<Integer,
		 * String>maplist=studentlist.stream().collect(Collectors.toMap(Student::getId,
		 * Student::getName)); System.out.println(maplist);
		 */
	}

}
