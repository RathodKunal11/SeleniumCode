package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;
	
	public void CrossBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver(); 
		}
		else
		{
			System.out.println("Invalid browser setup");
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	

}
