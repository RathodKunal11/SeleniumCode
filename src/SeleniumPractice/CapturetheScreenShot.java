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

public class CapturetheScreenShot {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www2.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		//full page screen shot
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		File trg=new File(".//ScreenShots\\homepage2.png");
//		FileUtils.copyFile(src, trg);
//		driver.close();
		
		//Capture the part of webpage
		TakesScreenshot ts=(TakesScreenshot) driver;
		WebElement topOptions = driver.findElement(By.xpath("//div[@data-testid='primary-meganav']"));
		File src = topOptions.getScreenshotAs(OutputType.FILE);
		File trg=new File(".//ScreenShots\\TopBarOptions.png");
		FileUtils.copyFile(src, trg);
		driver.close();
		
	}

}
