package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;


	public class LoginPage extends WebTestBase {
		@FindBy(xpath="//*[@id=\"shopify-section-header\"]/store-header/div[1]/div/div/div[2]/a[1]")
		WebElement login;
		 @FindBy(xpath = "//*[@id=\"customer[email]\"]")
		    WebElement emailTextBox;

		    @FindBy(xpath = "//*[@id=\"customer[password]\"]")
		    WebElement passwordTextBox;

		    @FindBy(xpath = "//*[@id=\"customer_login\"]/button/span[1]")
		    WebElement loginbtn;

		    
		    public LoginPage(){
		    	//used for creating webelements
		        PageFactory.initElements(driver, this);

}
		    public void login(String email , String password){
		    	login.click();
		        emailTextBox.sendKeys(email);
		        passwordTextBox.sendKeys(password);
		        loginbtn.click();
		    }
	}

