package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.provartesting.com/documentation/using-provar/tooltip-testing/");
		
		WebElement tooltip = driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/div/div/span[2]/a"));
		
		String tips = tooltip.getAttribute("title");
		System.out.println(tips);
		

}
}