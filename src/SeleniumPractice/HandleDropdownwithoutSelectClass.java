package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownwithoutSelectClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cardekho.com");
		driver.manage().deleteAllCookies();
		
		List<WebElement> links = driver.findElements(By.xpath("//li[5]/ul/li"));
		
		for(int i=0;i<links.size();i++) {
			String link = links.get(i).getAttribute("data-slug");
			System.err.println(i+ "==> "+ link);
		}
		
		
	}

}
