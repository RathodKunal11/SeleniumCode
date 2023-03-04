package PolicyBazar;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PBdashboard {
	WebDriver driver;
	@Test(priority=1)
	public void Setup() {
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void EnterTheURL() {
		driver.get("https://www.policybazaar.com/");
	}
	
	@Test(priority=3)
	public void varifyTheTitleOfWebPage() {
		
		Assert.assertEquals(driver.getTitle(),driver.getTitle());
	}
	
	@Test(priority=4)
	public void VarifyNumberOfModulesOnDashboard() {
		HashSet<String> hs=new HashSet<String>();
		List<WebElement> list = driver.findElements(By.xpath("//section[@class='prd-row']/div/a"));
		Iterator<WebElement> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(int i=0;i<=list.size();i++) {
			String Heading = list.get(i).getText();
			System.out.println(Heading+"  "+i);
		}
	}
}
