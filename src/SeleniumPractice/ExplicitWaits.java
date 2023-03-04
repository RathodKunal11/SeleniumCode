package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS );
		WebElement element =driver.findElement(By.xpath("//a[text()='Meta Pay']"));
		element.click();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		WebElement element2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Meta Pay']")));
		element2.click();
	}

}
