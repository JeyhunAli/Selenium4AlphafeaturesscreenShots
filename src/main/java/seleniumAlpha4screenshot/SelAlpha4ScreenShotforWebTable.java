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

public class SelAlpha4ScreenShotforWebTable {
	
	
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement webtable = driver.findElement(By.xpath("//div[@id='reg_box']"));
		System.out.println(webtable);
		
		
		
		webtableScreenShot(webtable, "webtable");
		
		
		/**
		 * this screen shot for webtable to do that need to first find out xpath of that particular webtable then take screen shot 
		 * 
		 * 
		 * another important note 
		 * whenever creating xpath for the entire table with class name if inside the one class 
		 * there are two class separated from each other by blank
		 * by choosing this its gone give me invalid selector expection
		 * in that time better use css selector locator 
		 * 
		 * another this html tag with the property its also xpath example ----->>  "//form"
		 * 
		 */
		
		
	}
	
	public static void webtableScreenShot(WebElement elements, String filename ) {
		
		TakesScreenshot webtable = ((TakesScreenshot)elements);
		File srcWebtable = webtable.getScreenshotAs(OutputType.FILE);
		 try {
			FileUtils.copyFile(srcWebtable, new File("./target/"+filename+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
