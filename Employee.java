package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private int id;
	private int salary;
	public Employee(String name,int id,int salary) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public boolean equals(Object obj) {
		Employee emp=(Employee)obj;
		boolean status=false;
		if(this.name.equalsIgnoreCase(emp.name)&& this.id==emp.id &&this.salary==emp.salary) {
			status=true;
		}
		return status;
	}
	public static List<Employee> getEmpList(){
		ArrayList<Employee> arr=new ArrayList<Employee>();
		arr.add(new Employee("Akash",123,2000));
		arr.add(new Employee("Arnab",155,4000));
		arr.add(new Employee("Dev",173,5000));
		arr.add(new Employee("Deep",124,6000));
		arr.add(new Employee("Abhisek",163,3000));
		return arr;}
	public int hashCode() {
		return this.id;	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
