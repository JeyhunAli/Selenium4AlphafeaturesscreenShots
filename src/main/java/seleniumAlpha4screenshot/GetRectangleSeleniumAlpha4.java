package seleniumAlpha4screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetRectangleSeleniumAlpha4 {


	static WebDriver driver;


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");

		WebElement loginButtondim = driver.findElement(By.id("loginBtn"));
		/**
		 * this method is available in selenium 3 to get rectangle of the element size height or width
		 */
		Dimension loginBDim =loginButtondim.getSize();
		System.out.println(loginBDim.height);
		System.out.println(loginBDim.width);


		System.out.println("********************************************");
		
		
/**
 * this new rectangle method is available in selenium 4 alpha 
 */
		Rectangle rect = loginButtondim.getRect();
		System.out.println(rect.height);
		System.out.println(rect.getWidth());
		
		System.out.println(rect.x);
		System.out.println(rect.y);













	}

}
