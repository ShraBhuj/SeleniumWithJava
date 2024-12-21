package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_dragndrop {

	public static void main(String[] args) throws InterruptedException {
		// Actions- drag n drop
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Pingale\\OneDrive\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.globalsqa.com/demo-site/draganddrop/#google_vignette");
	    
	    Thread.sleep(5000);
	    
	    driver.manage().window().maximize();
	    
	    WebElement SFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	    
	    driver.switchTo().frame(SFrame);
	    
	    Thread.sleep(2000);
	    
	    //Actions a = new Actions (WebDriver ref name);
		
	  	Actions a = new Actions (driver); // action class declared
	    
	    WebElement dragimg1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
	    
	    WebElement dropimg = driver.findElement(By.xpath("//div[@id='trash']"));
	    
	    a.dragAndDrop(dragimg1, dropimg).perform();
	  	
	  	 Thread.sleep(2000);
	  	
	  	WebElement dragimg2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
	  	
	  	WebElement dragimg3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	  	
	  	WebElement dragimg4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
	  	
	  	a.dragAndDrop(dragimg2, dropimg).perform();
	  	
	  	 Thread.sleep(2000);
	  	
	  	a.dragAndDrop(dragimg3, dropimg).perform();
	  	
	  	 Thread.sleep(2000);
	  	
	  	a.dragAndDrop(dragimg4, dropimg).perform();
	  	
	  	 Thread.sleep(2000);
	  	

	}

}
