package Advanced;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowInteract {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		String Parentwindow= driver.getWindowHandle();  //getwindowHandle method is used to get a separate ID for the window we want and it stores it as a string so that we can differentiate from parent to child window.
		//1. Open another new window.
		WebElement Oldwindow = driver.findElement(By.id("j_idt88:new"));
		Oldwindow.click();
		Set<String> handles=driver.getWindowHandles(); // Its having a collection of windows that we opened with the help of the driver and it stores it as a set type.- getWindowHandles()

		for(String Childwindow : handles) {                 //Change the control of the parent window to new window. For each loop iterates through each window opened and then changes the control.
			driver.switchTo().window(Childwindow);
		}
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Vegetaprince718@gmail.com");
		driver.close();
		driver.switchTo().window(Parentwindow);
		Thread.sleep(3000);
		//2. Operating Multiple Windows.
		WebElement multiple = driver.findElement(By.id("j_idt88:j_idt91"));
		multiple.click();
		int number = driver.getWindowHandles().size();
		System.out.println("Number of opened windows is: " + number);
		Thread.sleep(3000);

		//3. Closing all child windows except parent windows.
		WebElement Dontclose = driver.findElement(By.id("j_idt88:j_idt93"));
		Dontclose.click();
		Set<String>handler = driver.getWindowHandles();
		// At last the for each loop terminates all the windows except the parent window including that we opened in the muliple window scenario also muliple window = 2 tabs and close scenario window = 3 tabs totally 5 tab have been closed by the for each loop.
		for (String allwindow : handler) {
			if(!allwindow.equals(Parentwindow)) {
				driver.switchTo().window(allwindow);
				driver.close();
			}

		}
	}

}


