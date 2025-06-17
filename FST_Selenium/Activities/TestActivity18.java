package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestActivity18 {
public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/selects/");
		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		
		// Store the select and make a new select object
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
		Select select1 = new Select(dropdown);
		
		select1.selectByVisibleText("One");
		select1.selectByIndex(2);
		select1.selectByValue("three");
		
		System.out.println("all visible options: ");
		for (WebElement option: select1.getOptions()) {
			System.out.println(option.getText());
		}
		
		driver.quit();
	}
}
