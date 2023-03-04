package SeleniumPractice;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLink {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TreeSet<String> fl=new TreeSet<String>();
		
		List<WebElement> Footer_link = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
		for(int i=0;i<=Footer_link.size()-1;i++) {
			
			String link = Footer_link.get(i).getText();
			
			fl.add(link);
		}
		
		System.out.println(fl);
		System.out.println(fl.size());
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
