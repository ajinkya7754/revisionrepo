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

public class VerifyUserCanAddFunds {
	WebDriver driver;
	HomePage hp;
	@BeforeClass
	public void beforeClass() {
		 driver = base1.GetDriver();
	}
	@BeforeMethod
	public void beforeMethod() {
		 hp= new HomePage(driver);
	}
	@Test
		public void UserCanAddFund() throws IOException {
		hp.clickonaddfunds();
		hp.ammounts();
			
		}
	
	@AfterMethod
	public void AfterMethod(){
		
	}
	@AfterClass
	public void AfterClass() {
		
	}

}
