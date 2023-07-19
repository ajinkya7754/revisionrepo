package utill_classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utillity {
	
	public static String GetDataFromConfig( String c) throws IOException {
		 FileInputStream file = new FileInputStream("configuration\\config.property");
		 Properties prop = new Properties();
		 
		 prop.load(file);
		 
		String value= prop.getProperty(c);
		 return value;
	}
	
	public static void explicitwait(WebDriver driver,int time,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}

}
