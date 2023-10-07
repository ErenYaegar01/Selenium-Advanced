package Advanced;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.webdriver", "C:\\\\Program Files\\\\Java\\\\jdk-17\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\'j_idt93:j_idt95\']/span[2]"));
		download.click();
		
		File totalfiles = new File("C:\\Users\\Saran S\\Downloads");
		File[] number= totalfiles.listFiles();
		
		for (File file : number) {
			if(file.getName().equals("TestLeaf Logo.png")){
				System.out.println("File is downloaded properly");
				break;
			}
		}
	}
}
