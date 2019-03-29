package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> li = Arrays.asList(new Employee(1, "kalyan", 20000), new Employee(2, "jogi", 30000),
				new Employee(3, "surya", 40000));
		Employee emp = li.stream().min((Employee1, Employee2) -> Employee1.salary > Employee2.salary ? 1 : -1).get();
		System.out.println(emp.salary);

	}

}
