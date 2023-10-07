package Advanced;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ctrldrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		
		List<WebElement> selectable = driver.findElements(By.xpath("//*[@id=\'container\']/div/h3"));
		int size = selectable.size();
		System.out.println(size);
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
		.click(selectable.get(2))
		.click(selectable.get(3))
		.click(selectable.get(6))
		.click(selectable.get(7)).build().perform();
		//Another method is used to hold the selectable options.
//		Actions action1 = new Actions(driver);
//		action1.clickAndHold(selectable.get(0));
//		action1.clickAndHold(selectable.get(1));
//		action1.clickAndHold(selectable.get(2));
//		action1.clickAndHold(selectable.get(3));
//		action1.clickAndHold(selectable.get(4));
		

	}

}
