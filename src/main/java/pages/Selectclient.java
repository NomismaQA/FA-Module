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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b1f7232b-c741-4483-9f01-49b70d058c23
@TestModellerModule(guid = "b1f7232b-c741-4483-9f01-49b70d058c23")
public class Selectclient extends BasePage
{
	public Selectclient (WebDriver driver)
	{
		super(driver);
	}


	
	private By usernameElem = By.id("ctl00_cPH_login");

	private By PasswordElem = By.id("ctl00_cPH_pass");

	private By LoginButtonElem = By.id("ctl00_cPH_btnLogin");

	private By AgentsElem = By.xpath("//SPAN[text()='Agents']");

	private By SearchagentElem = By.id("ctl00_cPHFilter_txtAgentName");

	private By SearchbuttonElem = By.id("ctl00_cPHFilter_btnSearch");

	private By AgentnameElem = By.xpath("//TD[text()='\n                            Nakul@@\n                        ']");

	private By ClientsElem = By.xpath("//SPAN[text()='Clients']");

	private By Final_AccountsElem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A/SPAN[@class='side_nav_text']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AdminUI/Agents.aspx?p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter username
     * @name Enter username
     */
 	public void Enter_username(String username)
 	{
 	    
 		WebElement elem = getWebElement(usernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_username", "Enter_username failed. Unable to locate object: " + usernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_username", "Enter_username failed. Unable to locate object: " + usernameElem.toString());

 			Assert.fail("Unable to locate object: " + usernameElem.toString());
         }

 		elem.sendKeys(username);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_username " + username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_username " + username);
 	}

      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		WebElement elem = getWebElement(PasswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

 			Assert.fail("Unable to locate object: " + PasswordElem.toString());
         }

 		elem.sendKeys(Password);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}

     
	/**
 	 * Click Login_Button
     * @name Click Login_Button
     */
	public void Click_LoginButton()
	{
        
		WebElement elem = getWebElement(LoginButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

			Assert.fail("Unable to locate object: " + LoginButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LoginButton");

		TestModellerLogger.PassStep(m_Driver, "Click_LoginButton");
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
          	

		ExtentReportManager.passStep(m_Driver, "Click_Agentname");

		TestModellerLogger.PassStep(m_Driver, "Click_Agentname");
	}

     
	/**
 	 * Click Clients
     * @name Click Clients
     */
	public void Click_Clients()
	{
        
		WebElement elem = getWebElement(ClientsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

			Assert.fail("Unable to locate object: " + ClientsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clients");

		TestModellerLogger.PassStep(m_Driver, "Click_Clients");
	}

     
	/**
 	 * Click Final Accounts
     * @name Click Final Accounts
     */
	public void Click_Final_Accounts()
	{
        
		WebElement elem = getWebElement(Final_AccountsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts", "Click_Final_Accounts failed. Unable to locate object: " + Final_AccountsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts", "Click_Final_Accounts failed. Unable to locate object: " + Final_AccountsElem.toString());

			Assert.fail("Unable to locate object: " + Final_AccountsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts");
	}
}