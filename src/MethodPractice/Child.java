package MethodPractice;

public class Child extends father {
	
	public void bike() {
		System.out.println("Son bike");
	}
	
	public void money() {
		System.out.println("Son $50");
	}
	
	public static void main(String[] args) {
		
		father cs=new Child();
		cs.money();
		cs.home();
		
		Child s=(Child) new father();
		s.money();
		
	}
	
	

}
