package MethodPractice;

public class SubClass extends SuperClass {
	
	public void m1() {
		System.out.println("this is method m1 child class");
	}
	
	public static void m2() {
		System.out.println("this is static method m2 from child class");
	}
	
	
	public static void main(String[] args) {
		
		SubClass sb=new SubClass();
		sb.m1();
		sb.m2();
		
	}

}
