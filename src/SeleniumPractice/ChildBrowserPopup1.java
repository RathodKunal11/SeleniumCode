package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChildBrowserPopup1 {
	@Test
	public void cb() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> itr = winds.iterator();
		String fw = itr.next();
		String sw = itr.next();
//		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
		driver.switchTo().window(sw);
		System.out.println("Title of child window"+driver.getTitle());
		driver.switchTo().window(fw);
		System.out.println("Title of the first window"+driver.getTitle());
	}

}
