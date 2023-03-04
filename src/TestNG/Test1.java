package TestNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@BeforeMethod
	public void BM() {
		System.out.println("THis is before method");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("this is After method");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("This is before class method");
	}
	
	
	
	@BeforeTest
	public void BT() {
		System.out.println("This is before test method");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("This is After test method");
	}
	
	@Test(priority=1)
	public void m1() {
		System.out.println("This is method m1");
	}
	
	
	
	

}
