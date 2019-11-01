package seleniumAlpha4screenshot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Util {
	
	
	public void readProperties() throws FileNotFoundException {
		
		Properties prop = new Properties();
		FileInputStream input = new FileInputStream("/Users/jey/eclipse-workspace/elementScreenShot/src/main/java/seleniumAlpha4screenshot/config.properties");
			try {
				prop.load(input);
			} catch (IOException e) {
				e.printStackTrace();
			}

}
}