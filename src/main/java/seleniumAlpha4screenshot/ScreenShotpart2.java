package seleniumAlpha4screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotpart2 {
	
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://app.hubspot.com/login");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

		WebElement checkbox = driver.findElement(By.xpath("//input[@id='remember']"));
		
		username.sendKeys("jeyhun");
		password.sendKeys("12345");
		
		
		takeScreenShotpart2method(password, "password");
		takeScreenShotpartPage(driver, "wholePage");
		
	}
	
	
	/**
	 * below two generic method one for element one for entire page 
	 * whenever i need it i just call it to my main page then pass the parameters then execute my program it will create two screen shot one for 
	 * element 
	 * one for the entire page 
	 * i can use these two methods inside utility class then whenever i need it i can call 
	 * @param element
	 * @param filename
	 */
	
	public static void takeScreenShotpart2method (WebElement element, String filename) {
		

		 TakesScreenshot scrShot = ((TakesScreenshot)element);
		 File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(scrFile, new File("./target/screenShot/"+filename+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		
		 
		 }
	public static void takeScreenShotpartPage(WebDriver driver , String filename) {
	  TakesScreenshot scrShotpage = ((TakesScreenshot)driver);
	  File scrPage = scrShotpage.getScreenshotAs(OutputType.FILE);
	  try {
		FileUtils.copyFile(scrPage, new File("./target/screenShots/"+filename+".jpg"));
	} catch (IOException e) {
		e.printStackTrace();
	}
	  
	  
	  
	
	
	}
	
	
	
	
	
	

}
