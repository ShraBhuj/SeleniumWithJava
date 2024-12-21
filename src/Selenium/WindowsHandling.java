package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args) throws InterruptedException {
		// Windows Handling
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Pingale\\OneDrive\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		
        Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Insta= driver.findElement(By.xpath("//a[@title=\"Take a look at Instagram\"]"));
		
		Insta.click();
		
		  Thread.sleep(2000);
		  
		  System.out.println(driver.getWindowHandle());
		  
		  System.out.println(driver.getWindowHandles());
		  
		  String pw= driver.getWindowHandle();
		  
		  Set <String> mw= driver.getWindowHandles();
		  
		  for (String a:mw)
		  {
			  if(!(pw.equals(a)))
			  {
				  driver.switchTo().window(a);
			  }
			  
			  
		  }
		  
		  
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("0123456789");
		  
		  //Thread.sleep(2000);
		  
		  
		  
		

	}

}
