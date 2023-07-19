package pom_classes;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utill_classes.utillity;

public class HomePage extends utillity {
	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/user/balance/inr']")
	private WebElement addfunds ;
	
	@FindBy(xpath="//div[text()='INR Balance']")
	private WebElement INR ;
	
	@FindBy(xpath="//input[@id='wrs445Amount']")
	private WebElement amm;

	@FindBy(xpath="//img[@alt='Groww Logo']")
	private WebElement logo;
	
	@FindBy(xpath="//input[@id='vpa_input']")
	private WebElement upi;
	
	@FindBy(xpath="//span[text()='DEPOSIT MONEY']")
	private WebElement depositmoney;
	
	@FindBy(xpath="//div[text()='DEPOSIT']")
	private WebElement deposit;
	
	@FindBy(xpath="//div[text()='Stocks']")
	private WebElement stock;
	
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
	public boolean homepagevisible() {
		try {
			explicitwait(driver,20,stock);
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		return true;
	}
	
	public void clickonaddfunds() {
		addfunds.click();
		
	}
	
	public void ammounts() throws IOException {
		explicitwait(driver,20,deposit);
		driver.findElement(By.xpath("//div[text()='+ ₹500']")).click();
		upi.sendKeys(GetDataFromConfig("upi"));
		depositmoney.click();
		
	}
}
