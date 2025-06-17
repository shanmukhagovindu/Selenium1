package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;
public class Activity_17 {
	public static void main(String[] args) {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		
		// open the browser or page
		driver.get("https://training-support.net/webelements/sliders");
		
		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		
		//Find and print initial value
		WebElement volumeValue = driver.findElement(By.cssSelector("h1.text-5xl.font-extrabold"));
		System.out.println(volumeValue.getText());
		//Find the slider
		WebElement slider = driver.findElement(By.id("volume"));
		//Move to 25%
		builder.moveToElement(slider).clickAndHold(slider).moveByOffset(200,0).release().build().perform();
		//print the new value
		System.out.println(volumeValue.getText());
		//Move to 75%
		builder.moveToElement(slider).clickAndHold(slider).moveByOffset(-150,0).release().build().perform();
		//print the new value
		System.out.println(volumeValue.getText());
		
				
		
		
		// close the browser
		driver.quit();
	}
}