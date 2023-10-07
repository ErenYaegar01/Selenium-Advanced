package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node0pmln8bnsefoiz20krxnjiub60675.node0");
		
		//1. working with a frame.
		driver.switchTo().frame(0);
		WebElement frame = driver.findElement(By.id("Click"));
		frame.click();
		
		String Message = driver.findElement(By.id("Click")).getText();
		System.out.println(Message);
		driver.switchTo().defaultContent();
		
		//2.handling Multiple Frames.
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement frame5 = driver.findElement(By.id("Click"));
		frame5.click();
		
		driver.switchTo().defaultContent();
		
		//3. Total Frames present in the web site.
	     List<WebElement> elements = driver.findElements(By.tagName("iframe"));
	     //findElements is nothing but a collection rather  than a single one (findElement).
	     int total = elements.size();
	     System.out.println(total);
		

	}

}
