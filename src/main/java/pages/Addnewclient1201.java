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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e9f78cfb-40ed-4e83-9125-799f08b4124e
@TestModellerModule(guid = "e9f78cfb-40ed-4e83-9125-799f08b4124e")
public class Addnewclient1201 extends BasePage
{
	public Addnewclient1201 (WebDriver driver)
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

	private By _New_ClientElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");

	private By Limited_CompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']");

	private By ManuallyLimitedCompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By BusinessnameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegistrationNumberElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By RegistrationDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By FirstNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By LastNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Please_tick_if_director_is_also_an_employee_in_the_companyElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_chkIsEmployee']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=069f2327-9e51-4e07-b10c-eeca785659e8");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=069f2327-9e51-4e07-b10c-eeca785659e8");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=069f2327-9e51-4e07-b10c-eeca785659e8");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=069f2327-9e51-4e07-b10c-eeca785659e8";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=069f2327-9e51-4e07-b10c-eeca785659e8")) {
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
 	 * Click  New Client
     * @name Click  New Client
     */
	public void Click__New_Client()
	{
        
		WebElement elem = getWebElement(_New_ClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Client", "Click__New_Client failed. Unable to locate object: " + _New_ClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Client", "Click__New_Client failed. Unable to locate object: " + _New_ClientElem.toString());

			Assert.fail("Unable to locate object: " + _New_ClientElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Client");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Client");
	}

     
	/**
 	 * Click Limited Company
     * @name Click Limited Company
     */
	public void Click_Limited_Company()
	{
        
		WebElement elem = getWebElement(Limited_CompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Limited_Company", "Click_Limited_Company failed. Unable to locate object: " + Limited_CompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Limited_Company", "Click_Limited_Company failed. Unable to locate object: " + Limited_CompanyElem.toString());

			Assert.fail("Unable to locate object: " + Limited_CompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Limited_Company");

		TestModellerLogger.PassStep(m_Driver, "Click_Limited_Company");
	}

     
	/**
 	 * Click Manually_Limited_Company
     * @name Click Manually_Limited_Company
     */
	public void Click_ManuallyLimitedCompany()
	{
        
		WebElement elem = getWebElement(ManuallyLimitedCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ManuallyLimitedCompany", "Click_ManuallyLimitedCompany failed. Unable to locate object: " + ManuallyLimitedCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ManuallyLimitedCompany", "Click_ManuallyLimitedCompany failed. Unable to locate object: " + ManuallyLimitedCompanyElem.toString());

			Assert.fail("Unable to locate object: " + ManuallyLimitedCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ManuallyLimitedCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_ManuallyLimitedCompany");
	}

      
	/**
 	 * Enter Business_name
     * @name Enter Business_name
     */
 	public void Enter_Businessname(String Businessname)
 	{
 	    
 		WebElement elem = getWebElement(BusinessnameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Businessname", "Enter_Businessname failed. Unable to locate object: " + BusinessnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Businessname", "Enter_Businessname failed. Unable to locate object: " + BusinessnameElem.toString());

 			Assert.fail("Unable to locate object: " + BusinessnameElem.toString());
         }

 		elem.sendKeys(Businessname);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Businessname " + Businessname);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Businessname " + Businessname);
 	}

      
	/**
 	 * Enter Registration_Number
     * @name Enter Registration_Number
     */
 	public void Enter_RegistrationNumber(String RegistrationNumber)
 	{
 	    
 		WebElement elem = getWebElement(RegistrationNumberElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegistrationNumber", "Enter_RegistrationNumber failed. Unable to locate object: " + RegistrationNumberElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegistrationNumber", "Enter_RegistrationNumber failed. Unable to locate object: " + RegistrationNumberElem.toString());

 			Assert.fail("Unable to locate object: " + RegistrationNumberElem.toString());
         }

 		elem.sendKeys(RegistrationNumber);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegistrationNumber " + RegistrationNumber);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegistrationNumber " + RegistrationNumber);
 	}

      
	/**
 	 * Enter Registration_Date
     * @name Enter Registration_Date
     */
 	public void Enter_RegistrationDate(String RegistrationDate)
 	{
 	    
 		WebElement elem = getWebElement(RegistrationDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegistrationDate", "Enter_RegistrationDate failed. Unable to locate object: " + RegistrationDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegistrationDate", "Enter_RegistrationDate failed. Unable to locate object: " + RegistrationDateElem.toString());

 			Assert.fail("Unable to locate object: " + RegistrationDateElem.toString());
         }

 		elem.sendKeys(RegistrationDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegistrationDate " + RegistrationDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegistrationDate " + RegistrationDate);
 	}

      
	/**
 	 * Enter First_Name
     * @name Enter First_Name
     */
 	public void Enter_FirstName(String FirstName)
 	{
 	    
 		WebElement elem = getWebElement(FirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_FirstName failed. Unable to locate object: " + FirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_FirstName failed. Unable to locate object: " + FirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + FirstNameElem.toString());
         }

 		elem.sendKeys(FirstName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FirstName " + FirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FirstName " + FirstName);
 	}

      
	/**
 	 * Enter LastName
     * @name Enter LastName
     */
 	public void Enter_LastName(String LastName)
 	{
 	    
 		WebElement elem = getWebElement(LastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

 			Assert.fail("Unable to locate object: " + LastNameElem.toString());
         }

 		elem.sendKeys(LastName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName " + LastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LastName " + LastName);
 	}

     
	/**
 	 * Click Please tick if director is also an employee in the company
     * @name Click Please tick if director is also an employee in the company
     */
	public void Click_Please_tick_if_director_is_also_an_employee_in_the_company()
	{
        
		WebElement elem = getWebElement(Please_tick_if_director_is_also_an_employee_in_the_companyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Please_tick_if_director_is_also_an_employee_in_the_company", "Click_Please_tick_if_director_is_also_an_employee_in_the_company failed. Unable to locate object: " + Please_tick_if_director_is_also_an_employee_in_the_companyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Please_tick_if_director_is_also_an_employee_in_the_company", "Click_Please_tick_if_director_is_also_an_employee_in_the_company failed. Unable to locate object: " + Please_tick_if_director_is_also_an_employee_in_the_companyElem.toString());

			Assert.fail("Unable to locate object: " + Please_tick_if_director_is_also_an_employee_in_the_companyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Please_tick_if_director_is_also_an_employee_in_the_company");

		TestModellerLogger.PassStep(m_Driver, "Click_Please_tick_if_director_is_also_an_employee_in_the_company");
	}

     
	/**
 	 * Click Save_Button
     * @name Click Save_Button
     */
	public void Click_SaveButton()
	{
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}