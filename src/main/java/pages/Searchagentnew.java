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
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/525a9644-53fa-46c4-a78a-36e430e4ee3b
@TestModellerModule(guid = "525a9644-53fa-46c4-a78a-36e430e4ee3b")
public class Searchagentnew extends BasePage
{
	public Searchagentnew (WebDriver driver)
	{
		super(driver);
	}


	
	private By AgentsElem = By.xpath("//SPAN[text()='Agents']");

	private By SearchagentElem = By.id("ctl00_cPHFilter_txtAgentName");

	private By SearchbuttonElem = By.id("ctl00_cPHFilter_btnSearch");

	private By AgentnameElem = By.xpath("//TD[text()='\n                            Nakul@@\n                        ']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Agents
     * @name Click Agents
     */
	public void Click_Agents()
	{
        
		WebElement elem = getWebElement(AgentsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Agents", "Click_Agents failed. Unable to locate object: " + AgentsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Agents", "Click_Agents failed. Unable to locate object: " + AgentsElem.toString());

			Assert.fail("Unable to locate object: " + AgentsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Agents");

		TestModellerLogger.PassStep(m_Driver, "Click_Agents");
	}

      
	/**
 	 * Enter Searchagent
     * @name Enter Searchagent
     */
 	public void Enter_Searchagent(String Searchagent)
 	{
 	    
 		WebElement elem = getWebElement(SearchagentElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchagent", "Enter_Searchagent failed. Unable to locate object: " + SearchagentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchagent", "Enter_Searchagent failed. Unable to locate object: " + SearchagentElem.toString());

 			Assert.fail("Unable to locate object: " + SearchagentElem.toString());
         }

 		elem.sendKeys(Searchagent);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Searchagent " + Searchagent);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Searchagent " + Searchagent);
 	}

     
	/**
 	 * Click Search_button
     * @name Click Search_button
     */
	public void Click_Searchbutton()
	{
        
		WebElement elem = getWebElement(SearchbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbutton", "Click_Searchbutton failed. Unable to locate object: " + SearchbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbutton", "Click_Searchbutton failed. Unable to locate object: " + SearchbuttonElem.toString());

			Assert.fail("Unable to locate object: " + SearchbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Searchbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbutton");
	}

     
	/**
 	 * Click Agentname
     * @name Click Agentname
     */
	public void Click_Agentname()
	{
        
		WebElement elem = getWebElement(AgentnameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Agentname", "Click_Agentname failed. Unable to locate object: " + AgentnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Agentname", "Click_Agentname failed. Unable to locate object: " + AgentnameElem.toString());

			Assert.fail("Unable to locate object: " + AgentnameElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Agentname");

		TestModellerLogger.PassStep(m_Driver, "Click_Agentname");
	}
}