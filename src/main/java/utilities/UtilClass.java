package utilities;

import java.util.ArrayList;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilClass {
public void switchwindowNew1(WebDriver driver, WebElement element) throws InterruptedException {
		
		
		//driver.switchTo().defaultContent();
		driver.switchTo().frame(element);
		Thread.sleep(5000);
		}
	
	public void switchDefaultWindow(WebDriver driver) throws InterruptedException
	{
		  Thread.sleep(3000);
			driver.switchTo().defaultContent();
	}
	
	public void switchwindowForward(WebDriver driver) throws InterruptedException {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(tabs.size()-1));
		//Thread.sleep(2000);
	}
	public void switchwindowBackward(WebDriver driver) throws InterruptedException {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		ArrayList tabs = new ArrayList (driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window((String) tabs.get(tabs.size()-2));
		//Thread.sleep(2000);
	}
		 public Date addDays(Date d, int days)
		    {
				
		        d.setTime(d.getTime() + days * 1000 * 60 * 60 * 24);
		        return d;
		         
		    }
		 
	
		//Waits
		public void implictWaitForSeconds(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		}
		
		public void implictWaitForMinutes(WebDriver driver, int time){
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
		}
		
		public void explicitWait(WebDriver driver, int time, By locator){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		public void explicitWaitvisibility(WebDriver driver, int time, WebElement element){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		public void explicitiWaitlocated(WebDriver driver, int time, By locator){
			WebDriverWait iwait = new WebDriverWait(driver, time);
			iwait.until(ExpectedConditions.presenceOfElementLocated(locator));
			
		}
		

		public static void waitForTextToAppear(WebDriver driver, String textToAppear, WebElement element) {
		    WebDriverWait wait = new WebDriverWait(driver,40);
		    wait.until(ExpectedConditions.textToBePresentInElement(element, textToAppear));
		}
		
		public void fluentWait(WebDriver driver, int totalTime,int pollingTime, WebElement element){
			
			FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
			fw.withTimeout(totalTime, TimeUnit.SECONDS);
			fw.pollingEvery(pollingTime, TimeUnit.SECONDS);
			fw.ignoring(NoSuchElementException.class);
			fw.until(ExpectedConditions.visibilityOf(element));
		        driver.navigate().refresh();
		}
		
		public void explicitWait_elementToBeClickable(WebDriver driver, int time, WebElement element){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.elementToBeClickable(element));	
		}
		
		public void explicitWait_attributeToBeNotEmpty(WebDriver driver, int time, WebElement element, String attribute){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.attributeToBeNotEmpty(element,attribute));
		}
		
		public void explicitWait_textToBePresentInElementValue(WebDriver driver, int time, WebElement element, String value){
			WebDriverWait wait = new WebDriverWait(driver, time);
			wait.until(ExpectedConditions.textToBePresentInElementValue(element, value));
		}
		public void waitForLoad(WebDriver driver) 
		  {
			  ExpectedCondition<Boolean> pageLoadCondition = new
			      ExpectedCondition<Boolean>() {
			          public Boolean apply(WebDriver driver) {
			              return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
			          }
			      };
		  
			  WebDriverWait wait = new WebDriverWait(driver, 30);
			  wait.until(pageLoadCondition);
			  }
		public static void waitForTextToAppear(WebDriver driver, WebElement element, String textToAppear) throws InterruptedException{
		    WebDriverWait wait = new WebDriverWait(driver, 10);

		    wait.until(ExpectedConditions.visibilityOf(element));
		}
		public boolean isAlertPresent(WebDriver driver) {

		    boolean presentFlag = false;

		    try {

		        // Check the presence of alert
		        Alert alert = driver.switchTo().alert();
		        // Alert present; set the flag
		        presentFlag = true;
		        // if present consume the alert
		        alert.accept();
		        //( Now, click on ok or cancel button )

		    } catch (NoAlertPresentException ex) {
		        // Alert not present
		        ex.printStackTrace();
		    }

		    return presentFlag;
		}
		
		public void javaScriptExecutorSendkeys(String enter_15,WebDriver m_Driver)
		{
			JavascriptExecutor	js= (JavascriptExecutor)m_Driver;
			js.executeScript("document.getElementById('ctl00_cPH_txtRepairsEtc').value='"+enter_15+"'");
			
			js.executeScript("arguments[0].click();", enter_15);
		}
		

	}

