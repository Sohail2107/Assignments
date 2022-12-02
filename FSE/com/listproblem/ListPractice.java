package com.listproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPractice {

	public static void main(String[] args) {
		
		List<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1, "john", 1000));
		al.add(new Employee(2, "don", 2000));
		al.add(new Employee(3, "bob", 5000));
		al.add(new Employee(4, "roger", 700));
		al.add(new Employee(5, "ron", 600));
		al.add(new Employee(6, "mike", 4000));
		al.add(new Employee(7, "steve", 900));
		al.add(new Employee(8, "tom", 1200));
		al.add(new Employee(9, "henry", 1300));
		al.add(new Employee(10, "ford", 1500));
		
		EmployeeComparator comparator = new EmployeeComparator();
		
		//1.Iterate the arraylist using for loop,for each loop,stream.
		al.stream().forEach(System.out::println);
		
		//2.Sort the employees using their name.
		Collections.sort(al, comparator);
		al.stream().forEach(System.out::println);
		
		//3.Use Iterator and List Iterator object to iterate the employee in both direction.
		ListIterator it =al.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		
		//4.Use Stream map method to show all the employee name in uppercase.
		al.stream().map(a->a.getEmpName().toUpperCase()).forEach(System.out::println);
		
		//5.Use stream to calculate average salary.
		Double avg=al.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
		System.out.println(avg);
		
		//6. Use  sort() method of stream class to sort the employees.
		al.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getSalary).forEach(System.out::println);

	}

}
