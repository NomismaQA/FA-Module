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
public class ReportsSideMenu extends BasePage
{
	public ReportsSideMenu (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickReports_Financial_ProfitLossElem = By.xpath("//*[@id='FincReports']/table/tbody/tr[1]/td/a");

	private By Click_FASideMenuElem = By.xpath("//*[@id='ctl00_SideMenu1_FA']/a/span");



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
 	 * Click ClickReports_Financial_ProfitLossElem
     * @name Click ClickReports_Financial_ProfitLossElem
     */
	public void ClickReports_Financial_ProfitLoss()
	{
        
		WebElement elem = getWebElement(ClickReports_Financial_ProfitLossElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickReports_Financial_ProfitLoss", "ClickReports_Financial_ProfitLoss failed. Unable to locate object: " + ClickReports_Financial_ProfitLossElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickReports_Financial_ProfitLoss", "ClickReports_Financial_ProfitLoss failed. Unable to locate object: " + ClickReports_Financial_ProfitLossElem.toString());

			Assert.fail("Unable to locate object: " + ClickReports_Financial_ProfitLossElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "ClickReports_Financial_ProfitLoss");

		TestModellerLogger.PassStep(m_Driver, "ClickReports_Financial_ProfitLoss");
	}

     
	/**
 	 * Enter Click_FASideMenu
	 * @throws InterruptedException 
     * @name Enter Click_FASideMenu
     */
	
 	public void Click_FASideMenu() throws InterruptedException
 	{
 	    
 		WebElement elem = getWebElement(Click_FASideMenuElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_FASideMenu", "Click_FASideMenu failed. Unable to locate object: " + Click_FASideMenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_FASideMenu", "Click_FASideMenu failed. Unable to locate object: " + Click_FASideMenuElem.toString());

 			Assert.fail("Unable to locate object: " + Click_FASideMenuElem.toString());
         }

 		elem.click();
 		
 		ChangeWindow.tabswitch(m_Driver);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Click_FASideMenu " );

  		TestModellerLogger.PassStep(m_Driver, "Click_FASideMenu ");
 	}

 
   
}