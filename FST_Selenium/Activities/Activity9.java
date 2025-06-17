package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
	public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/keyboard-events");
		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		
		// Type some text
		builder.sendKeys("This is Shanmukha").build().perform();
		
		// print the message
		System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
		
		// close the browser
		driver.quit();
	}
}
