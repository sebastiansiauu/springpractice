package com.xtremax;

public class Developer extends Employee {
	
	private double salary;
	
	Developer(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void aaa() {
		System.out.println(getName());
		System.out.println(getAge());
		System.out.println(getSalary());
	}
	
}