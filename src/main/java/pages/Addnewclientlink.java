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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/04ca82b6-0b76-4139-8476-d2675e85abaa
@TestModellerModule(guid = "04ca82b6-0b76-4139-8476-d2675e85abaa")
public class Addnewclientlink extends BasePage
{
	public Addnewclientlink (WebDriver driver)
	{
		super(driver);
	}


	
	private By Add_new_client_linkElem = By.xpath("//LI[@class='header_add_btn dropdown']/A");

	private By _New_Client_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_btnAdd']");


	
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
 	 * Click Add_new_client_link
     * @name Click Add_new_client_link
     */
	public void Click_Add_new_client_link()
	{
        
		WebElement elem = getWebElement(Add_new_client_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_new_client_link", "Click_Add_new_client_link failed. Unable to locate object: " + Add_new_client_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_new_client_link", "Click_Add_new_client_link failed. Unable to locate object: " + Add_new_client_linkElem.toString());

			Assert.fail("Unable to locate object: " + Add_new_client_linkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_new_client_link");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_new_client_link");
	}

     
	/**
 	 * Click  New Client 
     * @name Click  New Client 
     */
	public void Click__New_Client_()
	{
        
		WebElement elem = getWebElement(_New_Client_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Client_", "Click__New_Client_ failed. Unable to locate object: " + _New_Client_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Client_", "Click__New_Client_ failed. Unable to locate object: " + _New_Client_Elem.toString());

			Assert.fail("Unable to locate object: " + _New_Client_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Client_");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Client_");
	}
}