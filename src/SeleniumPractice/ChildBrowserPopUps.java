package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUps {
	
	public static void main(String[] args) {
		
		//Launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Enter the URL
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//How to handle child window
//		Set<String> First_Window = driver.getWindowHandles();
//		System.out.println(First_Window);
		
		driver.findElement(By.xpath("//a[text()='Meta Pay']")).click();
	
		Set<String> wind = driver.getWindowHandles();
		 Iterator<String> iterate = wind.iterator();
		 iterate.next();
		 String Second_Window = iterate.next();
		 driver.switchTo().window(Second_Window);
		 System.out.println("Page Title of second Window:-"+driver.getTitle());
		
//		Set<String> winds = driver.getWindowHandles();
//		String firstwind = winds.iterator().next();
//		driver.switchTo().window(firstwind);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
