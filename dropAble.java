package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dropAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement From = driver.findElement(By.id("form:drag_content"));
		WebElement To = driver.findElement(By.id("form:drop_content"));
		
		Actions actions = new Actions(driver);
		actions.clickAndHold(From).moveToElement(To).build().perform();
		//2.Method 
		//actions.dragAndDrop(From, To).build().perform();
        // this alternative method is used to return the same action but with different methods.
	}

}
