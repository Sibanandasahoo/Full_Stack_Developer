package com.simplilearn.method;

public class Employee {
	int id;
	String name;
	String Dept;
	public Employee() {
		id=142;
		name="Kit";
		Dept="Tainee Eng.";
	}
	public Employee(int id,String name,String Dept) {
		this.id=id;
		this.name=name;
		this.Dept=Dept;
	}
	public static void main(String[] args) {
		Employee obj =new Employee();
		System.out.println("User 1");
		System.out.println("id: "+obj.id);
		System.out.println("name: "+obj.name);
		System.out.println("Dept: "+obj.Dept);
		
		Employee obj1=new Employee(10,"anil","Developer");
		System.out.println("\nUser 2");
		System.out.println("id: "+obj1.id);
		System.out.println("name: "+obj1.name);
		System.out.println("Dept: "+obj1.Dept);
		
	}
}
