package pom_classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utill_classes.utillity;

public class LoginPage extends utillity {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='login_email1']")
	private WebElement userID;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Submit']")
	private WebElement Submit;
	
	@FindBy(xpath="//span[text()='Login/Register']")
	private WebElement Loginsection;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continuebtn;
		
	
	
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
		
	
	public void Loginsection() {
		 Loginsection.click();
	 }
	public void userID() throws IOException {
		userID.sendKeys(GetDataFromConfig("email"));
	}
	
    public void password() throws IOException {
    	continuebtn.click();
    	password.sendKeys(GetDataFromConfig("password"));	
	}
    public void ClickOnSubmit() {
    	Submit.click();
    }
    
    public void PIN() throws IOException {
    	  	
    	driver.findElement(By.xpath("//div[@id='otpinput88parent']")).sendKeys(GetDataFromConfig("PIN"));
        }
    
}