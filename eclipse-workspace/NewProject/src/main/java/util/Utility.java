package util;

import testBase.WebTestBase;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase.WebTestBase;

public class Utility extends WebTestBase  {

	
		public static void selectValue(WebElement Element,String term,String value)
		{
			Select dropDown=new Select(Element);
			if(term.equalsIgnoreCase("byValue")){
	            dropDown.selectByValue(value);
	        }else if(term.equalsIgnoreCase("byIndex")){
	            dropDown.selectByIndex(Integer.parseInt(value));
	        }else if(term.equalsIgnoreCase("byVisibleText")){
	            dropDown.selectByVisibleText(value);
	        }else{
	            System.out.println("What are you looking for?");
	        }
		}
			public static void mouseHover(WebDriver driver, WebElement element){
		        Actions action=new Actions(driver);
		        action.moveToElement(element)
		                .build()
		                .perform();
		        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		   }
			public static void getCookies(){
		        Set<Cookie> cookies = driver.manage().getCookies();
		        for (Cookie c : cookies){
		            System.out.println(c);
		        }
		    }
			
			public static void scrollDownByElement(WebDriver driver, WebElement element){
		        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
		    }
			public static void switchToWindows(WebDriver driver) throws InterruptedException {
				// TODO Auto-generated method stub
				String parentWindow=driver.getWindowHandle();
				Set<String> allwindow=driver.getWindowHandles();
				for(String s : allwindow) {
					if(!parentWindow.contentEquals(s)) {
						driver.switchTo().window(s);
						Thread.sleep(5000);
						driver.close();
					}
					
				}
				driver.switchTo().window(parentWindow);
				Thread.sleep(5000);		
			}
			
			public static void scrollPage(WebDriver driver) throws InterruptedException {
				JavascriptExecutor j=(JavascriptExecutor)driver;
				j.executeScript("window.scrollBy(0,500)");
				
				for(int i=0;i<10;i++) 
				{
				j.executeScript("window.scrollBy(0,500)");
				Thread.sleep(1000);
				}
				
				for(int i=0;i<10;i++) 
				{
					j.executeScript("window.scrollBy(0,-500)");
					Thread.sleep(1000);
				}
			}
			
		}
	
