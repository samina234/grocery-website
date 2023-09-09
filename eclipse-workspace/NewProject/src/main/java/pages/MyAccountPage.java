package pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.WebTestBase;
import util.Utility;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
        

public class MyAccountPage extends WebTestBase {
	
	
	 
	    @FindBy(xpath="//*[@id=\"shopify-section-footer\"]/footer/div/div[1]/div[1]/div[1]/div/ul/li[4]/a")
	    WebElement youtubeOptions;
	    @FindBy(xpath="//*[@id=\"nector-rewards-widget-container\"]/div/div")
	    WebElement giftBox;
	    @FindBy(xpath="//*[@id=\"block-template--16161731608738__featured-collections-collection-1\"]/div[1]/div/product-item[1]/div[2]/div[2]/button[1]")
	    WebElement addtocartbtn;
	    
	    
	public MyAccountPage(){
        PageFactory.initElements(driver, this);
    }
	
	
	
	public void verifyGetWindowhandle() throws InterruptedException {
		
		Utility.scrollDownByElement(driver,youtubeOptions);
		youtubeOptions.click();
		Utility.switchToWindows(driver);
}
	
public void verifyGetaddtocart() throws InterruptedException  {
	Thread.sleep(1000);
		
		Utility.scrollDownByElement(driver,addtocartbtn);
		addtocartbtn.click();
		
}
	
	public void mouseHover() {
		// TODO Auto-generated method stub
		Utility.mouseHover(driver,giftBox);
		
		
		
	}
	public void scrollUpDown() throws InterruptedException {
		
		Utility.scrollPage(driver);
	}
	
	public void getCookiesHandle() {
		// TODO Auto-generated method stub
		Utility.getCookies();
		
	}
	
	

}


