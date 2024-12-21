package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice2_whole_url {

	public static void main(String[] args) throws InterruptedException {
		// automate whole url
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Pingale\\OneDrive\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		
		Firstname.sendKeys("Shradha");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		Lastname.sendKeys("Pingale");
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@class=\"form-control ng-pristine ng-untouched ng-valid\"]"));
		
		Address.sendKeys("Near Airport, Pune- 411015.");
		
		WebElement EmailAdd = driver.findElement(By.xpath("//input[@type='email']"));
		
		EmailAdd.sendKeys("srpingale04@orkut.com");
		
		WebElement Phone = driver.findElement(By.xpath("//input[@type='tel']"));
		
		Phone.sendKeys("01234567890");
		
		WebElement Female= driver.findElement(By.xpath("//input[@value=\"FeMale\"]"));
		
		Female.click();
		
		WebElement Hobbies= driver.findElement(By.xpath("//input[@id='checkbox2']"));
		
		Hobbies.click();
	
		
		WebElement Lang = driver.findElement(By.xpath("//div[@id=\"msdd\"][@class=\"ui-autocomplete-multiselect ui-state-default ui-widget\"]"));
		
		//Actions act= new Actions(driver);
		
		//act.doubleClick(Lang);
		
		Lang.click();
		
		Thread.sleep(2000);
		
		
		
        
		
		WebElement EngL= driver.findElement(By.xpath("(//a[@class=\"ui-corner-all\"])[8]"));
	    EngL.click();
	    
	    Thread.sleep(2000);

	    Lang.click();
 
        WebElement HindiL= driver.findElement(By.xpath("(//a[@class=\"ui-corner-all\"])[16]"));
	    
       HindiL.click();
		


	}

}
