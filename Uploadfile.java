package Advanced;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]"));
		uploadButton.click();
		
		//selenium is used to automate only for web applications in this case
		//we have to interact with windows so we have to use Java.
		// StringSelection method is used to convert the java string i.e., the location here will be converted into a plain text so that we can copy paste easily.
		StringSelection selection = new StringSelection("C:\\Users\\Saran S\\Downloads\\TestLeaf Logo (1).png");
//		Toolkit is one of the java libraries which is used to access the tools like clip board  so that we can able to store the copied value and then paste into the desired location.
		// setContents sets the content of this attachment part to that of the given Object and sets the value of the Content-Type header to the given type.setcontents(Transferable contents, clip board owner).
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
//		
//		//Robot class performance
		// This robot class acts like a virtual keyboard so that we can automate the operations that we want to do so that it can interact with windows.
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	

	}

}
