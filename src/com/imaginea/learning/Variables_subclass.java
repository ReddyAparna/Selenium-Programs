package com.imaginea.learning;
import com.imaginea.learning.DiffVariables;;
public class Variables_subclass extends DiffVariables {
	
	public static void printMethod(){
		
		//System.out.println(i);
		//System.out.println(k);
		// System.out.println(dv.j); Throws compilation error as the variable is "Private" and can be accessable within the class
		
}
public static void main(String args[]){
	DiffVariables dv = new DiffVariables();
	System.out.println(i);
	System.out.println(dv.k);
	//new Variables_subclass().printMethod();
}
}