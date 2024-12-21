package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_with_ok {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP Pavilion\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement txt=driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		txt.click();	
		Thread.sleep(2000);
		Alert a=driver.switchTo().alert();
		a.accept();
		WebElement txt2=driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']\"]"));

		
		
	}

}