package week66;

import week66.local101;

public class local101 {
	String br = "Blackpink";//Instance variable
	static int age = 10;//static variable
	static String catlisa = "Luca";//static variable
	
	public static void main(String[]args) {
		//body of method
		//using local variable age outside it's scope
		String owner = "Lisa";//local variable
		local101 obj = new local101();
		
		System.out.println("Cat name is "+ catlisa + " and Owner is " + owner);
		catlisa();
		obj.display();
		
	}
	public static void catlisa() {
		//body of sub method name is cat
		//local variable age
		int age = 1;
		age = age + 5;
		System.out.println("Luca age is "+ age);
	}
	public void display() {
		System.out.println(br);
	}
}
