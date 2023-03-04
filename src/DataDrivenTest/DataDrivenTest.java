package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider="Logindata")
	public void loginTest(String user,String pwd,String exp) {
		driver.get("http://admin-demo.nopcommerce.com/login");
		WebElement txtemail = driver.findElement(By.id("Email"));
		txtemail.clear();
		txtemail.sendKeys(user);
		
		WebElement txtPassword = driver.findElement(By.id("password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String exp_title="Dashboard / nopCommerce administration";
		String act_title = driver.getTitle();
		
		if(exp.equals("valid")) {
			if(exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("invalid")) {
			
			if(exp_title.equals(act_title)) {
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
	}
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() {
		
		String loginData[][]= {
				{"admin@yourstore.com","admin",	"valid"},
				{"admin@yourstore.com","adm","Invalid"},
				{"adm@yourstore.com","admin","Invalid"},
				{"adm@yourstore.com","adm","Invalid"}

		};
		
		return loginData;
	}
	
	@AfterClass
	void tearDown() {
		 driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
