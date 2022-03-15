package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/4c9f0122-f070-4c88-ad30-37657f5c128d
@TestModellerModule(guid = "4c9f0122-f070-4c88-ad30-37657f5c128d")
public class TurnoverpageFA775 extends BasePage
{
	public TurnoverpageFA775 (WebDriver driver)
	{
		super(driver);
	}


	
	private By Select_Financial_YearElem = By.xpath("//SELECT[@name='ctl00$ddlFinancialYear']");

	private By Select_Financial_Year2Elem = By.xpath("//SELECT[@name='ctl00$ddlFinancialYear']");

	private By Income_Statement_PageElem = By.xpath("//A[contains(text(),'Income Statement')]");

	private By Sales1Elem = By.xpath("//TD[contains(text(),'-43,234.00')]");

	private By Turnover_valueElem = By.xpath("//A[@href='Popup/FAViewTrialBalance.aspx?StandardCode=2&MainSection=PL&Year=P&Section=TURNOVER&FYCode=53174&CompanyCode=13249']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

    
	/**
 	 * Select Select_Financial_Year
     * @name Select Select_Financial_Year
     */
    public void Select_Select_Financial_Year(String Select_Financial_Year)
 	{
 	    
 		WebElement elem = getWebElement(Select_Financial_YearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Financial_Year", "Select_Select_Financial_Year failed. Unable to locate object: " + Select_Financial_YearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Financial_Year", "Select_Select_Financial_Year failed. Unable to locate object: " + Select_Financial_YearElem.toString());

 			Assert.fail("Unable to locate object: " + Select_Financial_YearElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Financial_Year);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Financial_Year " + Select_Financial_Year);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Financial_Year " + Select_Financial_Year);
 	}

    
	/**
 	 * Select Select_Financial_Year2
     * @name Select Select_Financial_Year2
     */
    public void Select_Select_Financial_Year2(String Select_Financial_Year2)
 	{
 	    
 		WebElement elem = getWebElement(Select_Financial_Year2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Financial_Year2", "Select_Select_Financial_Year2 failed. Unable to locate object: " + Select_Financial_Year2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Financial_Year2", "Select_Select_Financial_Year2 failed. Unable to locate object: " + Select_Financial_Year2Elem.toString());

 			Assert.fail("Unable to locate object: " + Select_Financial_Year2Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Select_Financial_Year2);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Select_Financial_Year2 " + Select_Financial_Year2);

 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Financial_Year2 " + Select_Financial_Year2);
 	}

     
	/**
 	 * Click Income_Statement_Page
     * @name Click Income_Statement_Page
     */
	public void Click_Income_Statement_Page()
	{
        
		WebElement elem = getWebElement(Income_Statement_PageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Statement_Page", "Click_Income_Statement_Page failed. Unable to locate object: " + Income_Statement_PageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Statement_Page", "Click_Income_Statement_Page failed. Unable to locate object: " + Income_Statement_PageElem.toString());

			Assert.fail("Unable to locate object: " + Income_Statement_PageElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement_Page");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement_Page");
	}

     
	/**
 	 * Click Sales1
     * @name Click Sales1
     */
	public void Click_Sales1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Sales1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Sales1", "Click_Sales1 failed. Unable to locate object: " + Sales1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Sales1", "Click_Sales1 failed. Unable to locate object: " + Sales1Elem.toString());

			Assert.fail("Unable to locate object: " + Sales1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Sales1");

		TestModellerLogger.PassStep(m_Driver, "Click_Sales1");
	}

     
	/**
 	 * Click Turnover_value
     * @name Click Turnover_value
     */
	public void Click_Turnover_value()
	{
        
		WebElement elem = getWebElement(Turnover_valueElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Turnover_value", "Click_Turnover_value failed. Unable to locate object: " + Turnover_valueElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Turnover_value", "Click_Turnover_value failed. Unable to locate object: " + Turnover_valueElem.toString());

			Assert.fail("Unable to locate object: " + Turnover_valueElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Turnover_value");

		TestModellerLogger.PassStep(m_Driver, "Click_Turnover_value");
	}
}