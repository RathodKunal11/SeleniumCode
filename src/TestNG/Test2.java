package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority=1)
	public void m1() {
		System.out.println("This is method m1 from test2 class");
	}
	
	@AfterClass
	public void AC() {
		System.out.println("This is After class method");
	}

}
