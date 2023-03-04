package SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenShot {
	 
	//@Test
	public void TakeScreenShot() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://byjus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement tg = driver.findElement(By.xpath("//div[@class='bj-form']"));
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination = new File("F:\\software testing training\\Automation testing\\ScreenShots\\LoginPage.png");
		FileUtils.copyFile(Source, Destination);
		
		
		
		
	}
	
	@Test
	public void sc() throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://byjus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 WebElement tg = driver.findElement(By.xpath("//div[@class='bj-form']"));
		 
		 File src = tg.getScreenshotAs(OutputType.FILE);
		 
		 File trg=new File("F:\\software testing training\\Automation testing\\ScreenShots\\Login.png");
		 
		 FileUtils.copyFile(src, trg);
		 
				
		
	}

	

}
