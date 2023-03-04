package interview;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HowtoHandleChildWindowPopups {
	
	@Test
	public void childwindow() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> itr = winds.iterator();
		String parentWindow = itr.next();
		String ChildWindow = itr.next();
		
		WebDriver cw = driver.switchTo().window(ChildWindow);
		System.out.println(cw.getTitle());
	}

}
