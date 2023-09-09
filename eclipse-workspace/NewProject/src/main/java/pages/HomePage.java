package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import testBase.WebTestBase;

public class HomePage extends WebTestBase {
	@FindBy(xpath="//*[@id=\"js-site-search-input\"]")
	WebElement SearchBox;
	
	@FindBy(xpath="//*[@id=\"main-part\"]/div/div[1]/div/div[1]/div/div/div[1]/h1")
	WebElement Searchresult;
	public void HomePage(){
        PageFactory.initElements(driver, this);
	}
	public void Search(String s) {
		SearchBox.sendKeys(s);
		SearchBox.sendKeys(Keys.ENTER);
	
	}

	public String Searchresult() {
		return Searchresult.getText();
	}
	
}


