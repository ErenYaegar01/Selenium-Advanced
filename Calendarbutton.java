
package Advanced;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/calendar");
		////div[@class='datetimepicker-dummy-wrapper']/following::input[@class='datetimepicker-dummy-input is-datetimepicker-range]'
		
		//1.Clicking the calendar text box.
		WebElement textbox = driver.findElement(By.xpath("//div[@class='datetimepicker-dummy-wrapper']/following::input[@class='datetimepicker-dummy-input is-datetimepicker-range']"));
		textbox.click();
		
		
		//2. Accessing the next button calendar.
		WebElement next = driver.findElement(By.xpath("//*[@class='datepicker-nav-month-year']/following::button[@class='datepicker-nav-next button is-small is-text'][2]"));
		next.click();
		////*[@class='datepicker-nav-month-year']/following::button[@class='datepicker-nav-next button is-small is-text'][2]
		
		//3. Accessing the date element.
		//*[@id="datetimePickere6b26723-9dfe-407a-9672-d1569e28a6cd"]/following::button[text()='6'][1]
		WebElement date = driver.findElement(By.xpath("//div[@data-date='Fri Apr 14 2023 00:00:00 GMT+0530 (India Standard Time)']/child::button"));
		date.click();
		

	}

}
