package seleniumAlpha4screenshot;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementSCreenShot {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.get("https://www.hubspot.com/");
		
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("__cfduid");
		
//		Set<Cookie> cookielist  = driver.manage().getCookies();
//		for(Cookie getcookies :cookielist) {
//			System.out.println(getcookies);
//		}
//		
		
		
		
		
		
		
//		 
//		Alert alert = driver.switchTo().alert(); 
//		String alerttext = alert.getText(); 
//		System.out.println(alerttext); 
//		  alert.sendKeys(alerttext); 
//		  alert.accept(); 
//		  
		  

		

//		Set<String> st = driver.getWindowHandles();
//		Iterator<String>handle = st.iterator();
//		
//		String ParentWindowID = handle.next();
//		System.out.println("parent window id is: " +ParentWindowID);
//		
//		String childWindowId = handle.next();
//		System.out.println("child window id is: "+ childWindowId);
//		
//		driver.switchTo().window(childWindowId);
//		System.out.println(driver.getTitle());
		// driver.close();
		
		
		
		
		
		WebElement login =driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
		login.click();
		
driver.quit();
	}

}
