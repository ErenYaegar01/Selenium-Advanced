package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		
		//1. Accessing the home page link.
		WebElement Hompage = driver.findElement(By.linkText("Go to Dashboard"));
		Hompage.click();
		
		//take the driver back to the home page.
		driver.navigate().back();
		
		//2. Accessing the link without clicking it.
		WebElement Nonlink = driver.findElement(By.partialLinkText("Find the URL without clicking me."));
		Nonlink.getAttribute("href");
		System.out.println("This  link was able to access  without clicking it");
		
		//3. Accessing the broken link.
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
	
		String verify = driver.getTitle();
		
		if(verify.contains("404")) {
			System.out.println("Oops!! The link was not working");
		}
		driver.navigate().back();
		
		//4.Accessing the same link.
		WebElement Hompage1 = driver.findElement(By.linkText("Go to Dashboard"));
		Hompage1.click();
		//Stale Element Reference Exception
		driver.navigate().back();
		//5.Count the number of links present.
		List<WebElement> counts = driver.findElements(By.tagName("a"));
		int size = counts.size();
		System.out.println("Number of links present are : " +size);
		

	}

}
