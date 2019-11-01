package seleniumAlpha4screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementScreenShotMainnn {


	static WebDriver driver;


	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='remember']"));

/**
 * after selenium alpha 4 version new concept came to the market getscreenshotAs method for the specific element 
 */
		File scrFile = username.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./target/screenShots/usernameelement.png"));

		
		
		/**
		 * calling element screenshot method passing parameters 
		 * its example of the method overloading concept as well 
		 */
		TakeScreenShotElement(username, "usernameelement");
		TakeScreenShotElement(password, "passwordelement");
		TakeScreenShotElement(checkbox, "checkboxelement");



	}
	/**
	 * generic method for the element screen shot 
	 * passing web element and string file name  
	 * @param element
	 * @param fileName
	 */
	
	public static void TakeScreenShotElement(WebElement element, String fileName) {
		File scrFile = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("./target/screenShots/"+fileName+ ".png"));
		} catch (IOException e) {
			e.printStackTrace();
			
			
			
			
		}
		

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
