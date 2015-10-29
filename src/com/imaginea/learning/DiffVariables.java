package com.imaginea.learning;

public class DiffVariables {
	public static int i = 10;
	private int j = 20;
	protected int k = 30;
	
	public int instanceVariable = 10;
	static int classVariable = 20;
	
	void increment(final int variabe){
		int t =variabe;
		System.out.println(t++);
		System.out.println(variabe);
	}
	
	static void incrementClass(int cVariable){
		cVariable++;
		System.out.println(cVariable);
	}
	
	public static void main(String[] args) {
		System.out.println(classVariable);		
		DiffVariables diffVariables = new DiffVariables();
		diffVariables.increment(diffVariables.instanceVariable);
		diffVariables.increment(diffVariables.instanceVariable);
		System.out.println(diffVariables.instanceVariable);
		DiffVariables diffVariables1 = new DiffVariables();
		diffVariables.increment(diffVariables1.instanceVariable);
		System.out.println(diffVariables1.instanceVariable);
		
		System.out.println("----------Class Variable----------");
		incrementClass(diffVariables.classVariable);
		incrementClass(diffVariables.classVariable);
		System.out.println(DiffVariables.classVariable);
	}


}