/*Open a new browser to https://training-support.net/webelements/selects
Get the title of the page and print it to the console.
On the Multi Select:
Select the "HTML" option using the visible text.
Select the 4th, 5th and 6th options using the index.
Select the "Node" option using the value.
Deselect the 5th option using index.
Close the browser.
*/
package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestActivity_19 {
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
		WebElement multilist = driver.findElement(By.cssSelector("select.h-80"));
		Select select1 = new Select(multilist);
		
		select1.selectByVisibleText("HTML");
		select1.selectByIndex(4);
		select1.selectByIndex(5);
		select1.selectByIndex(6);
		select1.selectByValue("nodejs");
		select1.deselectByIndex(4);
		
		System.out.println("all visible options: ");
		for (WebElement option: select1.getOptions()) {
			System.out.println(option.getText());
		}
		
		driver.quit();
	}
}
