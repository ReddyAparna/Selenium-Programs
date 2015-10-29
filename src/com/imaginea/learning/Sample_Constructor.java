package com.imaginea.learning;

public class Sample_Constructor {
	int empSalary;
	public Sample_Constructor(String name){
		System.out.println("Salary of emp....."+ name);
	}
	public void setSalary(int salary){
		empSalary = salary;
	}
	public int getSalary(){
		return empSalary;
	}
public static void main(String args[]){
	Sample_Constructor sc = new Sample_Constructor("Sanny");
	Sample_Constructor sc1 = new Sample_Constructor("Shyam");
	sc.setSalary(1000);
	sc.getSalary();
	System.out.println(sc.empSalary);
	sc1.setSalary(2000);
	sc1.getSalary();
	System.out.println(sc1.empSalary);
}
}
