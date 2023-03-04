package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownList {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//Locate the drop down which need to be handle
		
		WebElement Month_DropDown = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select sl=new Select( Month_DropDown);
		
		
		String default_option = sl.getFirstSelectedOption().getText();
		
		System.out.println(default_option);
		
		List<WebElement> Month_List = sl.getOptions();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
	}
	

}
