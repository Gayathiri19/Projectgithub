package org.test;

public class Employee {
	public void empDetails(int id) {
		System.out.println(id);

	}

	public void empDetails(String name) {
		System.out.println(name);

	}

	public void empDetails(int age, String city) {
		System.out.println(age);
		System.out.println(city);

	}

	public static void main(String[] args) {
		Employee s = new Employee();
		s.empDetails(7543);
		s.empDetails("java");
		s.empDetails(20, "chennai");
	}
}
