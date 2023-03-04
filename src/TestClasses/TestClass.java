package TestClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utility.BaseClass;

public class TestClass extends BaseClass{
	WebDriver driver;
	
	@Test
	public void setup() {
		CrossBrowser("chrome");
		CrossBrowser("firefox");
	}
	

	
	@Test(priority=2)
	public void VerifyCurrentUrl() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
	}
	
	@Test(priority=3)
	public void VerifyPageTitle() {
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}
	
	@Test(priority=4)
	public void VerifyUsernameField() {
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(username.isDisplayed());
		username.sendKeys("Paresh");
	}
	
	@Test(priority=5)
	public void VerifyPasswordField() {
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("Paresh@1123");
	}
	
	
	@Test(priority=6)
	public void ClickLoginButton() {
		WebElement LoginBtn = driver.findElement(By.xpath("//input[@id='email']"));
		Assert.assertTrue(LoginBtn.isEnabled());
		LoginBtn.click();
	}
}
