package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// Screenshot
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Pingale\\OneDrive\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        Thread.sleep(2000);

		driver.manage().window().maximize();
	
        WebElement Un = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		
		Un.sendKeys("Admin");
		
		WebElement Ps = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		
		Ps.sendKeys("admin123");
	
	    WebElement Bt = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]"));
	
	    TakesScreenshot Tscr = (TakesScreenshot) driver;
	    
	    File Source = Tscr.getScreenshotAs(OutputType.FILE);
	    
	    File Dest = new File ("D:\\ScreenShots\\S1.png");
	    
	    FileUtils.copyFile(Source, Dest);
	    
	    Bt.click();
	    
	    Thread.sleep(5000);
	    
	    File Source1 = Tscr.getScreenshotAs(OutputType.FILE);
	    
	    File Dest1 = new File ("D:\\ScreenShots\\S2.png");
	    
	    FileUtils.copyFile(Source1, Dest1);
	    

	}

}
