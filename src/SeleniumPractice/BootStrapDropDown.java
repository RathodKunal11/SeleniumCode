package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/bootstrap/bootstrap_dropdowns.asp");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@id=\"menu1\"]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[3]/ul/li/a"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("CSS")) {
				list.get(i).click();
				break;
			}
		}
	}

}
