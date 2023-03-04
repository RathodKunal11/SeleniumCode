package MethodPractice;

import org.testng.annotations.Test;

public class SoftAssert {

	@Test
	public void sample3() {
		SoftAssert soft = new SoftAssert();
		
		String str1 = "Hello";
		soft.assertEquals(str1, "Hi");        // fail
		System.out.println(str1);
		
		String str2 = "Hi";
		soft.assertEquals(str2, "Hi");       // pass
		System.out.println(str2);
		soft.assertAll();
	}
	
	
	private void assertAll() {
		// TODO Auto-generated method stub
		
	}


	private void assertEquals(String str1, String string) {
		// TODO Auto-generated method stub
		
	}


	@Test
	public void sample4() {
		System.out.println("Automation");
	}
}
