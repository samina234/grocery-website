package testCase;
import testBase.WebTestBase;

import org.testng.annotations.*;
import org.testng.asserts.*;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import org.openqa.selenium.JavascriptExecutor;

public class TC01 extends WebTestBase {
LoginPage loginPage;
HomePage homePage;
MyAccountPage myAccountPage;
	//loading the config file
	public TC01() {
		super();
	}
	
	
	@BeforeMethod
	public void BeforeMethod() {
		initialization();
		loginPage=new LoginPage();
		homePage=new HomePage();
		myAccountPage=new MyAccountPage();
	}
	

	@Test
	public void VerifyLogin() {
		//In Selenium, Asserts are validations or checkpoints for an application.
		SoftAssert softAssert = new SoftAssert();
	     loginPage.login(prop.getProperty("email"), prop.getProperty("Password"));
	     softAssert.assertAll();
	     
	     
	}
	
	@Test
	public void verifyWindowhandle() throws InterruptedException{
	     SoftAssert softAssert = new SoftAssert();
	     
	     myAccountPage.verifyGetWindowhandle();
	    
	     softAssert.assertAll();
	    
	 }
	
	@Test  
	public void verifyCookiesHandle(){
	     SoftAssert softAssert = new SoftAssert();
	    myAccountPage.getCookiesHandle();
	     softAssert.assertAll();
	 }
	
	
	@Test  //mouse hovering on the user
	public void verifyMouseHover(){
	     SoftAssert softAssert = new SoftAssert();
	 myAccountPage.mouseHover();
	     softAssert.assertAll();
	 }
	@Test
	public void checkScrolling() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		 myAccountPage.scrollUpDown();
		  softAssert.assertAll();
	}
	
	@Test
	public void checkaddtocart() throws InterruptedException {
		SoftAssert softAssert = new SoftAssert();
		 myAccountPage.verifyGetaddtocart();
		  softAssert.assertAll();
	}
	
	@AfterMethod
	public void AfterMethod() {
		driver.close();
	}


}

     




	
	


