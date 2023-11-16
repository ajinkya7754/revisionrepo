package interview_pupose;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_case_user {
    static WebDriver driver;

	public static  void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
	    driver = new ChromeDriver();
		driver.get("http://dev.cloud.trinka.ai/signup") ;
	    driver.manage().window().maximize();
	  	    
	    // create account
	    
	    WebElement  email = driver.findElement(By.xpath("//input[@ng-reflect-name='email_id']"));
	    email.sendKeys("metil.ajinkya01@gmail.com");
	    
	    WebElement  pass = driver.findElement(By.xpath("//input[@id='userSignUpPassword']"));
	    pass.sendKeys("12345678");
	    
	    WebElement  first_name = driver.findElement(By.xpath("//input[@ng-reflect-name='first_name']"));
	    first_name.sendKeys("Ajinkya");
	    
	    WebElement  last_name = driver.findElement(By.xpath("//input[@ng-reflect-name='last_name']"));
	    last_name.sendKeys("Metil");
	    
	    WebElement  button = driver.findElement(By.xpath("//button[text()='Create Account']"));
	    button.click();
	    Thread.sleep(10000);
	    
	    
	    // home page
	    
	    WebElement  Marketer = driver.findElement(By.xpath("//span[text()='Marketer']"));
	    Marketer.click();
	    
	    WebElement  Lets_Get_Started = driver.findElement(By.xpath("//button[@class='purple-btn btn-submit']"));
	    Lets_Get_Started.click();
	    Thread.sleep(10000);
	    
	    
	  // land on my drive page
	    
	    WebElement  profile = driver.findElement(By.xpath("//img[@class='img-fluid']"));
	    profile.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement  Account_setting = driver.findElement(By.xpath(" //span[text()=' Account Settings']"));
	    Account_setting.click();
	    Thread.sleep(2000);
	    
	    
	    // Land on Account setting
	    
	    WebElement  upgrade_button= driver.findElement(By.className("UpgradePremiumButton"));
	    upgrade_button.click();
	    
	    Set<String> address=driver.getWindowHandles();
	    List<String> addressList= new ArrayList<String>(address);
	    
	    driver.switchTo().window(addressList.get(1));
	    Thread.sleep(2000);
	    WebElement  validate_Text= driver.findElement(By.className("choose-plan-header"));
	  System.out.println(validate_Text.getText());
	   
	   driver.close();
	  
	}
	
	

}
