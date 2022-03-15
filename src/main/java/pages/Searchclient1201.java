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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8cad74d9-de0d-47a4-b7d8-519ac576fcc5
@TestModellerModule(guid = "8cad74d9-de0d-47a4-b7d8-519ac576fcc5")
public class Searchclient1201 extends BasePage
{
	public Searchclient1201 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By AgentsElem = By.xpath("//SPAN[contains(text(),'Agents')]");

	private By SearchAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By SearchbuttonElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By AgentNameElem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By ClientsElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A/SPAN[@class='side_nav_text']");

	private By SearchclientnameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By Searchbutton_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _Test_Systems_LtdElem = By.cssSelector("TD[onclick='navigateIn\\(this\\)']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52443&CompanyCode=13249&menuid=0&p=true");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52443&CompanyCode=13249&menuid=0&p=true");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52443&CompanyCode=13249&menuid=0&p=true");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52443&CompanyCode=13249&menuid=0&p=true";

        if (!currentUrl.equals("Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Default.aspx?FYCode=52443&CompanyCode=13249&menuid=0&p=true")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Username
     * @name Enter Username
     */
 	public void Enter_Username(String Username)
 	{
 	    
 		WebElement elem = getWebElement(UsernameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

 			Assert.fail("Unable to locate object: " + UsernameElem.toString());
         }

 		elem.sendKeys(Username);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);
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
 	 * Enter Search_Agent_Name
     * @name Enter Search_Agent_Name
     */
 	public void Enter_SearchAgentName(String SearchAgentName)
 	{
 	    
 		WebElement elem = getWebElement(SearchAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchAgentNameElem.toString());
         }

 		elem.sendKeys(SearchAgentName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);
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
 	 * Click Agent_Name
     * @name Click Agent_Name
     */
	public void Click_AgentName()
	{
        
		WebElement elem = getWebElement(AgentNameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AgentName", "Click_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AgentName", "Click_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

			Assert.fail("Unable to locate object: " + AgentNameElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);
  	

		ExtentReportManager.passStep(m_Driver, "Click_AgentName");

		TestModellerLogger.PassStep(m_Driver, "Click_AgentName");
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
 	 * Enter Search_client_name
     * @name Enter Search_client_name
     */
 	public void Enter_Searchclientname(String Searchclientname)
 	{
 	    
 		WebElement elem = getWebElement(SearchclientnameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchclientname", "Enter_Searchclientname failed. Unable to locate object: " + SearchclientnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchclientname", "Enter_Searchclientname failed. Unable to locate object: " + SearchclientnameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchclientnameElem.toString());
         }

 		elem.sendKeys(Searchclientname);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Searchclientname " + Searchclientname);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Searchclientname " + Searchclientname);
 	}

     
	/**
 	 * Click Search_button
     * @name Click Search_button
     */
	public void Click_Searchbutton_1()
	{
        
		WebElement elem = getWebElement(Searchbutton_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbutton_1", "Click_Searchbutton_1 failed. Unable to locate object: " + Searchbutton_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbutton_1", "Click_Searchbutton_1 failed. Unable to locate object: " + Searchbutton_1Elem.toString());

			Assert.fail("Unable to locate object: " + Searchbutton_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Searchbutton_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbutton_1");
	}

     
	/**
 	 * Click  Test Systems Ltd
     * @name Click  Test Systems Ltd
     */
	public void Click__Test_Systems_Ltd()
	{
        
		WebElement elem = getWebElement(_Test_Systems_LtdElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Test_Systems_Ltd", "Click__Test_Systems_Ltd failed. Unable to locate object: " + _Test_Systems_LtdElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Test_Systems_Ltd", "Click__Test_Systems_Ltd failed. Unable to locate object: " + _Test_Systems_LtdElem.toString());

			Assert.fail("Unable to locate object: " + _Test_Systems_LtdElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);


		ExtentReportManager.passStep(m_Driver, "Click__Test_Systems_Ltd");

		TestModellerLogger.PassStep(m_Driver, "Click__Test_Systems_Ltd");
	}
}