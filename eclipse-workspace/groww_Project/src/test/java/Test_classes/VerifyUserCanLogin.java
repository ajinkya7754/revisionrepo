package Test_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base_class.base1;
import pom_classes.HomePage;
import pom_classes.LoginPage;

public class VerifyUserCanLogin {
	WebDriver driver;
	LoginPage lp;
	HomePage hp;
	@BeforeClass
	public void beforeclass() {
		driver =base1.GetDriver();
	}
	
	@BeforeMethod
	public void beforemethod() {
		lp = new LoginPage(driver);
		hp= new HomePage(driver);
	}
	
	@Test(priority=1)
	public void test1() throws IOException {
		lp.Loginsection();
		lp.userID();
		lp.password();
		lp.ClickOnSubmit();
		lp.PIN();
	}
	@Test(priority=2)
	public void UserCanAddFund() throws IOException {
	if(hp.homepagevisible()==true)
	{
	hp.clickonaddfunds();
	hp.ammounts();
	
	
	}
	
	}
	@AfterMethod
	public void aftermethod() {
		
	}

	@AfterClass
	public void afterclass() {
		
	}
}
