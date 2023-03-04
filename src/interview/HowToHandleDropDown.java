package interview;

import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HowToHandleDropDown {
	
	@Test
	public void DropDown() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement Mdropdown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(Mdropdown);
		s.selectByIndex(10);
		
		
		
		List<WebElement> Alloption = s.getOptions();
		HashSet<String> option=new HashSet<String>();
		
		for(int i=0;i<=Alloption.size();i++) {
			String opt = Alloption.get(i).getText();
			System.out.println(i+"==>"+opt);
			option.add(opt);
		}
	}

}
