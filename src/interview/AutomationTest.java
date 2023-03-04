package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class AutomationTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\Chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		String Etitle="` Welcome to the Simple Travel Agency!";
		if(title.equalsIgnoreCase(Etitle)) {
			System.out.println("Title is Matched");
		}else {
			System.out.println("Title is not Matched");
		}
		
		driver.findElement(By.xpath("//a[text()='destination of the week! The Beach!']")).click();
		driver.navigate().back();
		
		//Purchase a ticket
		WebElement DropDown = driver.findElement(By.xpath("//select[@name='fromPort']"));
		WebElement DropDown2 = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select s=new Select(DropDown);
		Select s1=new Select(DropDown2);
		s.selectByVisibleText("Mexico City");
		s1.selectByVisibleText("London");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}
	

}
