package seleniumAlpha4screenshot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTabSelenium4 {

	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		String textTitle = driver.getTitle();
		System.out.println(textTitle);
		
		
		/**
		 * this is the new feature of selenium 4 alpha with new window we can open new blank tab 
		 * this amazing feature came to the market after selenium 4alpha as soon as we have control on new tab we can enter new url 
		 * we can do some actions over there then just use driver.close 
		 * it will close the new opened tab window
		 * 
		 * so there's another exception coming to the picture once we close the window our driver is lost 
		 * to check it right after closing the window again driver.getTitle method this time we will see  
		 * 
		 * <<<<<<NoSuchWindowException>>>>>>>>>>>>>>
		 * 
		 * so to solve this problem to get back again to the main window we are using now windowHandler method 
		 * then I'm creating object of the arraylist class by referring list interface 
		 * then storing them into string giving the index number 
		 * then using switchto.window  method to the the main window 
		 * then printing new title 
		 * 
		 * before selenium 4 alpha we can do it with javascriptexecutor but now in selenium 4 it s available 
		 * 
		 * same exactly thing we can do   driver.switchTo().newWindow(WindowType.TAB); here is tab 
		 * but we can switch it to the window as well it will be new window not the tab 
		 * then same thing come back again 
		 */
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		Set<String> handles = driver.getWindowHandles();
		List<String>  ls = new ArrayList<String>(handles); //creating arraylist class object by referring list interface 
		
		String parentWindow = ls.get(0);
		String childWindow = ls.get(1);
		
		
		System.out.println("after switching to new tab is blank :" +driver.getTitle());		
		
		
		driver.get("https://www.facebook.com/");
		System.out.println("after getting new blank title is : " + driver.getTitle());
		
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		String title = driver.getTitle();
		
		if(title == title ) {
			System.out.println("new title is: " +title);
		}
		else {
			System.out.println("wrong title");
		}
		
		
		
		
		
		driver.quit();
		
		
		
		
	}

}
