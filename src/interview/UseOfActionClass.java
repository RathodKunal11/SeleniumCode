package interview;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UseOfActionClass {
	
	@Test
	public void actionClass() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.next.co.uk/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		List<WebElement> AllOption = driver.findElements(By.xpath("//*[@id=\"platform_modernisation_meganav\"]//ul/li"));
		for(int i=0;i<AllOption.size();i++) {
			Actions a=new Actions(driver);
			WebElement link = AllOption.get(i);
			a.moveToElement(link);
			a.build().perform();
		}
	}

}
