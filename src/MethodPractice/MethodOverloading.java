package MethodPractice;

public class MethodOverloading {
	
	public void m1(int a,int b) {
		
		System.out.println(a+b);
	}
	
	public void m1(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	public void m1(double a,double b,int c) {
		
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mol=new MethodOverloading();
		mol.m1(10,20);
		mol.m1(10.2,20.4,10);
		mol.m1(10,20,30);
	}

}
