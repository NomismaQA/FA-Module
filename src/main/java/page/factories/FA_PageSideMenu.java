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
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a50235a3-00f3-427c-9b57-7357800017da
@TestModellerModule(guid = "a50235a3-00f3-427c-9b57-7357800017da")
public class FA_PageSideMenu extends BasePage
{
	public FA_PageSideMenu(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	private By ClickCT600_Tax_ReturnElem = By.xpath("//*[@id='ctl00_SideMenu1_liCT600TaxReturn']/a/span");

	private By ClickCT_AdjustmentsElem = By.xpath("//*[@id='ctl00_SideMenu1_CTFinalAccountAdjustments']/a");




	
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
 	 * Click ClickCT600_Tax_Return
     * @name Click ClickCT600_Tax_Return
     */
	public void ClickCT600_Tax_Return()
	{
        
		WebElement elem = getWebElement(ClickCT600_Tax_ReturnElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickCT600_Tax_Return", "ClickCT600_Tax_Return failed. Unable to locate object: " + ClickCT600_Tax_ReturnElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickCT600_Tax_Return", "ClickCT600_Tax_Return failed. Unable to locate object: " + ClickCT600_Tax_ReturnElem.toString());

			Assert.fail("Unable to locate object: " + ClickCT600_Tax_ReturnElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "ClickCT600_Tax_Return");

		TestModellerLogger.PassStep(m_Driver, "ClickCT600_Tax_Return");
	}

     
	/**
 	 * Enter ClickCT_Adjustments
	 * @throws InterruptedException 
     * @name Enter ClickCT_Adjustments
     */
	
 	public void ClickCT_Adjustments() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(ClickCT_AdjustmentsElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickCT_Adjustments", "ClickCT_Adjustments failed. Unable to locate object: " + ClickCT_AdjustmentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickCT_Adjustments", "ClickCT_Adjustments failed. Unable to locate object: " + ClickCT_AdjustmentsElem.toString());

 			Assert.fail("Unable to locate object: " + ClickCT_AdjustmentsElem.toString());
         }

 		elem.click();
 		
  		ExtentReportManager.passStep(m_Driver, "ClickCT_Adjustments " );

  		TestModellerLogger.PassStep(m_Driver, "ClickCT_Adjustments " );
 	}

     
	
}