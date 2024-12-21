package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Demo_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// Actions - dropdown
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rohit Pingale\\OneDrive\\Documents\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();
	
        driver.get("https://uncodemy.com/");
		
		Thread.sleep(2000);

		driver.manage().window().maximize();
		
		WebElement Category = driver.findElement(By.xpath("//span[@id='categoriesBtn']"));
		
		//Actions a = new Actions (WebDriver ref name);
		
		Actions a = new Actions (driver);
		
		a.moveToElement(Category).perform();
		
		//used selectorhub for below xpath
		
		//manually taken -- //a[@class="has"][@href="/course/manual-testing-course-in-noida"][1] -- for manual testing
		
		WebElement St = driver.findElement(By.xpath("//body/nav[@id='main-nav']/div[@class='nav-container']/div[@class='categories']/nav[@class='navr']/menu[@id='categories-menu']/menuitem[@label='drop']/menu[@class='hii']/menuitem[3]/a[1]"));
		
		a.moveToElement(St).perform();
		
		WebElement Mt = driver.findElement(By.xpath("//a[normalize-space()='Manual Testing']"));

		Mt.click();
		
		Thread.sleep(2000);
		
	}

}
