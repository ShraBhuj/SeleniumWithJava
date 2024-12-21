package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonActions {

	public static void main(String[] args) throws InterruptedException {
		// Radio button Action
		
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
	    
	    if (Bt.isDisplayed())
	    {
	    	Bt.click();
	    	
	    }
	    
	    Thread.sleep(2000);
	    
	    WebElement MyInfo= driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]"));
	    
	    MyInfo.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement FemaleRadiobt = driver.findElement(By.xpath("//label[normalize-space()='Female']"));
	
	    WebElement MaleRadiobt = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
	    
	    if (FemaleRadiobt.isSelected())
	    {
	    	MaleRadiobt.click();
	    	
	    }
	    else 
	    {
	    	FemaleRadiobt.click();
	    	
	    }
	    
	    
	}

}
