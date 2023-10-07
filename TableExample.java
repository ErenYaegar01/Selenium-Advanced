package Advanced;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/table");
		
		//1.Number of rows
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int row = rows.size();
		System.out.println("Number of rows present: " + row);
		
		//2.Number of columns.
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		int column = columns.size();
		System.out.println("Number of rows present: " + column);
		
		//3.Get title of the second column.
		WebElement getElement = driver.findElement(By.xpath("//td[normalize-space()='google.com']//following::td[1]"));
		String title = getElement.getText();
		System.out.println("Title is: "+ title);
		
		
		//4. Get All title columns.
		List<WebElement> allTitle = driver.findElements(By.xpath("//td[2]"));
		List<String> number = new ArrayList<String>();
		
		for (WebElement webElement : allTitle) {
           String value = webElement.getText();
           number.add(value);
		}
		System.out.println("Final list: "+ number);
		
		
	
		
		
		
		
		
		
	}

}
