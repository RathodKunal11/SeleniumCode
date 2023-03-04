package SeleniumPractice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Initiate the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\selenium JF\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Maximize page
		driver.manage().window().maximize();
		
		//Implicit wait for 10 sec
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//open the URL of the app
		driver.get("https://demo.guru99.com/test/newtours/");
		
		//wait
		Thread.sleep(5000);
		
		//capture the links from the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//Number of links
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++) {
			
			//by using href attribute we can get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			//create a connection using object "link"
			
			URL link=new URL(url);
			HttpURLConnection httpconn = (HttpURLConnection) link.openConnection();
			
			Thread.sleep(2000);
			
			//establish connection
			
			httpconn.connect();
			
			int resCode = httpconn.getResponseCode();//return response if res code is above 400:Broken link
			
			if(resCode>=400) {
				System.out.println(url +" = "+ " is broken link");
			}
			else
			{
				System.out.println(url +" = "+ " is valid link");
			}
			
			
			
		}
		
		
		
	}
	
	

}
