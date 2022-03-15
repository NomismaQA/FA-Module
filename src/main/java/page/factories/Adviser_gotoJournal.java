package page.factories;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a50235a3-00f3-427c-9b57-7357800017da
@TestModellerModule(guid = "a50235a3-00f3-427c-9b57-7357800017da")
public class Adviser_gotoJournal extends BasePage
{
	public Adviser_gotoJournal(WebDriver driver) {
		super(driver);
		
	}


	

	
	private By ClickAdviserToolElem = By.xpath("//*[@id='ctl00_AccountantToolSpn']/button");

	private By ClickJournalElem = By.xpath("//li[@id='ctl00_liJournals']/a");

	

	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClickAdviserTool
	 * @throws InterruptedException 
     * @name Click ClickAdviserTool
     */
	public void ClickAdviserTool() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClickAdviserToolElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickAdviserTool", "ClickAdviserTool failed. Unable to locate object: " + ClickAdviserToolElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickAdviserTool", "ClickAdviserTool failed. Unable to locate object: " + ClickAdviserToolElem.toString());

			Assert.fail("Unable to locate object: " + ClickAdviserToolElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	
          
          Thread.sleep(1000);

		ExtentReportManager.passStep(m_Driver, "ClickAdviserTool");

		TestModellerLogger.PassStep(m_Driver, "ClickAdviserTool");
	}

      
	/**
 	 * Enter EnterNomismaStartDate
	 * @throws InterruptedException 
     * @name Enter EnterNomismaStartDate
     */
 	public void ClickJournal() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(ClickJournalElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickJournal", "ClickJournal failed. Unable to locate object: " + ClickJournalElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickJournal", "ClickJournal failed. Unable to locate object: " + ClickJournalElem.toString());

 			Assert.fail("Unable to locate object: " + ClickJournalElem.toString());
         }

 		 			
 		elem.click();
 		
 		
 		
 		ChangeWindow.tabswitch(m_Driver);
 		
 		Thread.sleep(1000);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "ClickJournal " );

  		TestModellerLogger.PassStep(m_Driver, "ClickJournal ");
 	}

 
}