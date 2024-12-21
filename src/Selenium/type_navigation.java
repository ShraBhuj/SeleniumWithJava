package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class type_navigation {

	public static void main(String[] args) throws InterruptedException {
		// type in data and navigation
		
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
	
	    Bt.click();
	
	    Thread.sleep(5000);
	    
	    WebElement Bz = driver.findElement(By.xpath("(//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"])[12]"));
	    
	    Bz.click();
	    
	    Thread.sleep(5000);
	    
	    WebElement Wiym = driver.findElement(By.xpath("//textarea[@placeholder=\"What's on your mind?\"]"));
	    
	    Wiym.sendKeys("Today is Sunday, Have a nice day!!");
	    
	    WebElement Bttn = driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main\"]"));
	    
	    Bttn.click();
	
	}

}
