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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/b3cca347-9321-4f09-ba54-a41a57e07e86
@TestModellerModule(guid = "b3cca347-9321-4f09-ba54-a41a57e07e86")
public class newfinal extends BasePage
{
	public newfinal (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.id("ctl00_cPH_login");

	private By PasswordElem = By.id("ctl00_cPH_pass");

	private By LoginButtonElem = By.id("ctl00_cPH_btnLogin");

	private By AgentsElem = By.xpath("//SPAN[text()='Agents']");

	private By SearchagentnameElem = By.id("ctl00_cPHFilter_txtAgentName");

	private By SearchbuttonElem = By.id("ctl00_cPHFilter_btnSearch");

	private By AgentnameElem = By.xpath("//TD[text()='\n                            Nakul@@\n                        ']");

	private By ClientsElem = By.xpath("//SPAN[text()='Clients']");

	private By AddnewclientElem = By.id("ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd");

	private By ManuallylimitedcompanyElem = By.id("ctl00_ctl00_ParentContent_cPH_btnLimitedCompany");

	private By Limited_CompanyElem = By.id("ctl00_ctl00_ParentContent_cPH_ltBussinessName");

	private By BusinessnameElem = By.id("ctl00_ctl00_ParentContent_cPH_txtCompanyName");

	private By RegNoElem = By.id("ctl00_ctl00_ParentContent_cPH_txtRegNo");

	private By RegDateElem = By.id("ctl00_ctl00_ParentContent_cPH_txtCRegDate");

	private By FirstNameElem = By.id("ctl00_ctl00_ParentContent_cPH_txtFirstName1");

	private By LastNameElem = By.id("ctl00_ctl00_ParentContent_cPH_txtLastName1");

	private By TickbuttonElem = By.id("ctl00_ctl00_ParentContent_cPH_chkIsEmployee");

	private By SaveButtonElem = By.id("ctl00_ctl00_ParentContent_cPH_btnSave");

	private By SearchclientElem = By.id("ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany");

	private By Searchbutton_1Elem = By.id("ctl00_ctl00_ParentContent_cPHFilter_btnSearch");

	private By Final_AccountsElem = By.xpath("//SPAN[text()='Final Accounts']");

	private By SettingsElem = By.xpath("//SPAN[text()='Settings']");

	private By Accounts_SettingsElem = By.xpath("//A[text()='Accounts Settings']");

	private By EditbuttonElem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']/IMG");

	private By Principal_activityElem = By.id("ctl00_cPH_txtPrincipalactivity");

	private By Authentication_codeElem = By.id("ctl00_cPH_txtAuthentication");

	private By CTdistrictElem = By.id("ctl00_cPH_txtCTdistrict");

	private By CTUTRElem = By.id("ctl00_cPH_txtCTutr");

	private By CompanySecretaryElem = By.id("ctl00_cPH_txtCompanySecretary");

	private By ReportingStdTypeElem = By.id("ctl00_cPH_ddlReportingStdType");

	private By AccountantReportFormatElem = By.id("ctl00_cPH_ddlAccountantReportFormat");

	private By SignatoryPartnerLmtdElem = By.id("ctl00_cPH_ddlSignatoryPartnerLmtd");

	private By chkIsIncludeInReportElem = By.id("ctl00_cPH_chkIsIncludeInReport");

	private By ByPositionsRightElem = By.id("ctl00_cPH_radPreparedByPositionsRight");

	private By chkCharitDonationsElem = By.id("ctl00_cPH_chkCharitDonations");

	private By tIntroducePageBreakAfterPageNumbersFrs105ShortElem = By.id("ctl00_cPH_lstIntroducePageBreakAfterPageNumbersFrs105Short");

	private By lstIntroducePageBreakAfterPageNumbersFrs105FullElem = By.id("ctl00_cPH_lstIntroducePageBreakAfterPageNumbersFrs105Full");

	private By Address1Elem = By.id("ctl00_cPH_txtAddress1");

	private By Address2Elem = By.id("ctl00_cPH_txtAddress2");

	private By Address3Elem = By.id("ctl00_cPH_txtAddress3");

	private By Address4Elem = By.id("ctl00_cPH_txtAddress4");

	private By PostCodeElem = By.id("ctl00_cPH_txtRegFAPostCode");

	private By SaveButton_1Elem = By.id("ctl00_cphFooter_btnSave");

	private By Final_Accounts_1Elem = By.xpath("//SPAN[text()='Final Accounts']");

	private By Full_AccountsElem = By.xpath("//A[text()='Full Accounts']");

	private By Company_InformationElem = By.xpath("//A[text()='Company Information']");

	private By Income_StatementElem = By.xpath("//A[text()='Income Statement']");

	private By Statement_of_Financial_PositionElem = By.xpath("//A[text()='Statement of Financial Position']");

	private By Detailed_Income_StatementElem = By.xpath("//A[text()='Detailed Income Statement']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c")) {
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
 	 * Enter Searchagentname
     * @name Enter Searchagentname
     */
 	public void Enter_Searchagentname(String Searchagentname)
 	{
 	    
 		WebElement elem = getWebElement(SearchagentnameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchagentname", "Enter_Searchagentname failed. Unable to locate object: " + SearchagentnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchagentname", "Enter_Searchagentname failed. Unable to locate object: " + SearchagentnameElem.toString());

 			Assert.fail("Unable to locate object: " + SearchagentnameElem.toString());
         }

 		elem.sendKeys(Searchagentname);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Searchagentname " + Searchagentname);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Searchagentname " + Searchagentname);
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
 	 * Click Add_new_client
     * @name Click Add_new_client
     */
	public void Click_Addnewclient()
	{
        
		WebElement elem = getWebElement(AddnewclientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Addnewclient", "Click_Addnewclient failed. Unable to locate object: " + AddnewclientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Addnewclient", "Click_Addnewclient failed. Unable to locate object: " + AddnewclientElem.toString());

			Assert.fail("Unable to locate object: " + AddnewclientElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Addnewclient");

		TestModellerLogger.PassStep(m_Driver, "Click_Addnewclient");
	}

     
	/**
 	 * Click Manually_limited_company
     * @name Click Manually_limited_company
     */
	public void Click_Manuallylimitedcompany()
	{
        
		WebElement elem = getWebElement(ManuallylimitedcompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Manuallylimitedcompany", "Click_Manuallylimitedcompany failed. Unable to locate object: " + ManuallylimitedcompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Manuallylimitedcompany", "Click_Manuallylimitedcompany failed. Unable to locate object: " + ManuallylimitedcompanyElem.toString());

			Assert.fail("Unable to locate object: " + ManuallylimitedcompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Manuallylimitedcompany");

		TestModellerLogger.PassStep(m_Driver, "Click_Manuallylimitedcompany");
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
 	 * Enter RegNo
     * @name Enter RegNo
     */
 	public void Enter_RegNo(String RegNo)
 	{
 	    
 		WebElement elem = getWebElement(RegNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegNo", "Enter_RegNo failed. Unable to locate object: " + RegNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegNo", "Enter_RegNo failed. Unable to locate object: " + RegNoElem.toString());

 			Assert.fail("Unable to locate object: " + RegNoElem.toString());
         }

 		elem.sendKeys(RegNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegNo " + RegNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegNo " + RegNo);
 	}

      
	/**
 	 * Enter RegDate
     * @name Enter RegDate
     */
 	public void Enter_RegDate(String RegDate)
 	{
 	    
 		WebElement elem = getWebElement(RegDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegDate", "Enter_RegDate failed. Unable to locate object: " + RegDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegDate", "Enter_RegDate failed. Unable to locate object: " + RegDateElem.toString());

 			Assert.fail("Unable to locate object: " + RegDateElem.toString());
         }

 		elem.sendKeys(RegDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegDate " + RegDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegDate " + RegDate);
 	}

      
	/**
 	 * Enter FirstName
     * @name Enter FirstName
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
 	 * Click Tick_button
     * @name Click Tick_button
     */
	public void Click_Tickbutton()
	{
        
		WebElement elem = getWebElement(TickbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tickbutton", "Click_Tickbutton failed. Unable to locate object: " + TickbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tickbutton", "Click_Tickbutton failed. Unable to locate object: " + TickbuttonElem.toString());

			Assert.fail("Unable to locate object: " + TickbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tickbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Tickbutton");
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
          	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}

      
	/**
 	 * Enter Search_client
     * @name Enter Search_client
     */
 	public void Enter_Searchclient(String Searchclient)
 	{
 	    
 		WebElement elem = getWebElement(SearchclientElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchclient", "Enter_Searchclient failed. Unable to locate object: " + SearchclientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchclient", "Enter_Searchclient failed. Unable to locate object: " + SearchclientElem.toString());

 			Assert.fail("Unable to locate object: " + SearchclientElem.toString());
         }

 		elem.sendKeys(Searchclient);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Searchclient " + Searchclient);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Searchclient " + Searchclient);
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

     
	/**
 	 * Click Settings
     * @name Click Settings
     */
	public void Click_Settings()
	{
        
		WebElement elem = getWebElement(SettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings", "Click_Settings failed. Unable to locate object: " + SettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings", "Click_Settings failed. Unable to locate object: " + SettingsElem.toString());

			Assert.fail("Unable to locate object: " + SettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings");
	}

     
	/**
 	 * Click Accounts Settings
     * @name Click Accounts Settings
     */
	public void Click_Accounts_Settings()
	{
        
		WebElement elem = getWebElement(Accounts_SettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounts_Settings", "Click_Accounts_Settings failed. Unable to locate object: " + Accounts_SettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounts_Settings", "Click_Accounts_Settings failed. Unable to locate object: " + Accounts_SettingsElem.toString());

			Assert.fail("Unable to locate object: " + Accounts_SettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Accounts_Settings");

		TestModellerLogger.PassStep(m_Driver, "Click_Accounts_Settings");
	}

     
	/**
 	 * Click Edit_button
     * @name Click Edit_button
     */
	public void Click_Editbutton()
	{
        
		WebElement elem = getWebElement(EditbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Editbutton", "Click_Editbutton failed. Unable to locate object: " + EditbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Editbutton", "Click_Editbutton failed. Unable to locate object: " + EditbuttonElem.toString());

			Assert.fail("Unable to locate object: " + EditbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Editbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Editbutton");
	}

      
	/**
 	 * Enter Principal activity
     * @name Enter Principal activity
     */
 	public void Enter_Principal_activity(String Principal_activity)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Principal_activityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Principal_activity", "Enter_Principal_activity failed. Unable to locate object: " + Principal_activityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Principal_activity", "Enter_Principal_activity failed. Unable to locate object: " + Principal_activityElem.toString());

 			Assert.fail("Unable to locate object: " + Principal_activityElem.toString());
         }

 		elem.sendKeys(Principal_activity);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Principal_activity " + Principal_activity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Principal_activity " + Principal_activity);
 	}

      
	/**
 	 * Enter Authentication code
     * @name Enter Authentication code
     */
 	public void Enter_Authentication_code(String Authentication_code)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Authentication_codeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Authentication_code", "Enter_Authentication_code failed. Unable to locate object: " + Authentication_codeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Authentication_code", "Enter_Authentication_code failed. Unable to locate object: " + Authentication_codeElem.toString());

 			Assert.fail("Unable to locate object: " + Authentication_codeElem.toString());
         }

 		elem.sendKeys(Authentication_code);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Authentication_code " + Authentication_code);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Authentication_code " + Authentication_code);
 	}

      
	/**
 	 * Enter CTdistrict
     * @name Enter CTdistrict
     */
 	public void Enter_CTdistrict(String CTdistrict)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(CTdistrictElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CTdistrict", "Enter_CTdistrict failed. Unable to locate object: " + CTdistrictElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CTdistrict", "Enter_CTdistrict failed. Unable to locate object: " + CTdistrictElem.toString());

 			Assert.fail("Unable to locate object: " + CTdistrictElem.toString());
         }

 		elem.sendKeys(CTdistrict);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CTdistrict " + CTdistrict);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CTdistrict " + CTdistrict);
 	}

      
	/**
 	 * Enter CT_UTR
     * @name Enter CT_UTR
     */
 	public void Enter_CTUTR(String CTUTR)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(CTUTRElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CTUTR", "Enter_CTUTR failed. Unable to locate object: " + CTUTRElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CTUTR", "Enter_CTUTR failed. Unable to locate object: " + CTUTRElem.toString());

 			Assert.fail("Unable to locate object: " + CTUTRElem.toString());
         }

 		elem.sendKeys(CTUTR);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CTUTR " + CTUTR);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CTUTR " + CTUTR);
 	}

      
	/**
 	 * Enter CompanySecretary
     * @name Enter CompanySecretary
     */
 	public void Enter_CompanySecretary(String CompanySecretary)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(CompanySecretaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CompanySecretary", "Enter_CompanySecretary failed. Unable to locate object: " + CompanySecretaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CompanySecretary", "Enter_CompanySecretary failed. Unable to locate object: " + CompanySecretaryElem.toString());

 			Assert.fail("Unable to locate object: " + CompanySecretaryElem.toString());
         }

 		elem.sendKeys(CompanySecretary);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CompanySecretary " + CompanySecretary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CompanySecretary " + CompanySecretary);
 	}

    
	/**
 	 * Select ReportingStdType
     * @name Select ReportingStdType
     */
    public void Select_ReportingStdType(String ReportingStdType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ReportingStdTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ReportingStdType", "Select_ReportingStdType failed. Unable to locate object: " + ReportingStdTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ReportingStdType", "Select_ReportingStdType failed. Unable to locate object: " + ReportingStdTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ReportingStdTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ReportingStdType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);
 	}

    
	/**
 	 * Select AccountantReportFormat
     * @name Select AccountantReportFormat
     */
    public void Select_AccountantReportFormat(String AccountantReportFormat)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(AccountantReportFormatElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_AccountantReportFormat", "Select_AccountantReportFormat failed. Unable to locate object: " + AccountantReportFormatElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_AccountantReportFormat", "Select_AccountantReportFormat failed. Unable to locate object: " + AccountantReportFormatElem.toString());

 			Assert.fail("Unable to locate object: " + AccountantReportFormatElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(AccountantReportFormat);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_AccountantReportFormat " + AccountantReportFormat);

 		TestModellerLogger.PassStep(m_Driver, "Select_AccountantReportFormat " + AccountantReportFormat);
 	}

    
	/**
 	 * Select SignatoryPartnerLmtd
     * @name Select SignatoryPartnerLmtd
     */
    public void Select_SignatoryPartnerLmtd(String SignatoryPartnerLmtd)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(SignatoryPartnerLmtdElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SignatoryPartnerLmtd", "Select_SignatoryPartnerLmtd failed. Unable to locate object: " + SignatoryPartnerLmtdElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SignatoryPartnerLmtd", "Select_SignatoryPartnerLmtd failed. Unable to locate object: " + SignatoryPartnerLmtdElem.toString());

 			Assert.fail("Unable to locate object: " + SignatoryPartnerLmtdElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SignatoryPartnerLmtd);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_SignatoryPartnerLmtd " + SignatoryPartnerLmtd);

 		TestModellerLogger.PassStep(m_Driver, "Select_SignatoryPartnerLmtd " + SignatoryPartnerLmtd);
 	}

     
	/**
 	 * Click chkIsIncludeInReport
     * @name Click chkIsIncludeInReport
     */
	public void Click_chkIsIncludeInReport()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(chkIsIncludeInReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkIsIncludeInReport", "Click_chkIsIncludeInReport failed. Unable to locate object: " + chkIsIncludeInReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkIsIncludeInReport", "Click_chkIsIncludeInReport failed. Unable to locate object: " + chkIsIncludeInReportElem.toString());

			Assert.fail("Unable to locate object: " + chkIsIncludeInReportElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_chkIsIncludeInReport");

		TestModellerLogger.PassStep(m_Driver, "Click_chkIsIncludeInReport");
	}

     
	/**
 	 * Click ByPositionsRight
     * @name Click ByPositionsRight
     */
	public void Click_ByPositionsRight()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ByPositionsRightElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ByPositionsRight", "Click_ByPositionsRight failed. Unable to locate object: " + ByPositionsRightElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ByPositionsRight", "Click_ByPositionsRight failed. Unable to locate object: " + ByPositionsRightElem.toString());

			Assert.fail("Unable to locate object: " + ByPositionsRightElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ByPositionsRight");

		TestModellerLogger.PassStep(m_Driver, "Click_ByPositionsRight");
	}

     
	/**
 	 * Click chkCharitDonations
     * @name Click chkCharitDonations
     */
	public void Click_chkCharitDonations()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(chkCharitDonationsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkCharitDonations", "Click_chkCharitDonations failed. Unable to locate object: " + chkCharitDonationsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkCharitDonations", "Click_chkCharitDonations failed. Unable to locate object: " + chkCharitDonationsElem.toString());

			Assert.fail("Unable to locate object: " + chkCharitDonationsElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_chkCharitDonations");

		TestModellerLogger.PassStep(m_Driver, "Click_chkCharitDonations");
	}

    
	/**
 	 * Select tIntroducePageBreakAfterPageNumbersFrs105Short
     * @name Select tIntroducePageBreakAfterPageNumbersFrs105Short
     */
    public void Select_tIntroducePageBreakAfterPageNumbersFrs105Short(String tIntroducePageBreakAfterPageNumbersFrs105Short)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(tIntroducePageBreakAfterPageNumbersFrs105ShortElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_tIntroducePageBreakAfterPageNumbersFrs105Short", "Select_tIntroducePageBreakAfterPageNumbersFrs105Short failed. Unable to locate object: " + tIntroducePageBreakAfterPageNumbersFrs105ShortElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_tIntroducePageBreakAfterPageNumbersFrs105Short", "Select_tIntroducePageBreakAfterPageNumbersFrs105Short failed. Unable to locate object: " + tIntroducePageBreakAfterPageNumbersFrs105ShortElem.toString());

 			Assert.fail("Unable to locate object: " + tIntroducePageBreakAfterPageNumbersFrs105ShortElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(tIntroducePageBreakAfterPageNumbersFrs105Short);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_tIntroducePageBreakAfterPageNumbersFrs105Short " + tIntroducePageBreakAfterPageNumbersFrs105Short);

 		TestModellerLogger.PassStep(m_Driver, "Select_tIntroducePageBreakAfterPageNumbersFrs105Short " + tIntroducePageBreakAfterPageNumbersFrs105Short);
 	}

    
	/**
 	 * Select lstIntroducePageBreakAfterPageNumbersFrs105Full
     * @name Select lstIntroducePageBreakAfterPageNumbersFrs105Full
     */
    public void Select_lstIntroducePageBreakAfterPageNumbersFrs105Full(String lstIntroducePageBreakAfterPageNumbersFrs105Full)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(lstIntroducePageBreakAfterPageNumbersFrs105FullElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Full", "Select_lstIntroducePageBreakAfterPageNumbersFrs105Full failed. Unable to locate object: " + lstIntroducePageBreakAfterPageNumbersFrs105FullElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Full", "Select_lstIntroducePageBreakAfterPageNumbersFrs105Full failed. Unable to locate object: " + lstIntroducePageBreakAfterPageNumbersFrs105FullElem.toString());

 			Assert.fail("Unable to locate object: " + lstIntroducePageBreakAfterPageNumbersFrs105FullElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(lstIntroducePageBreakAfterPageNumbersFrs105Full);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Full " + lstIntroducePageBreakAfterPageNumbersFrs105Full);

 		TestModellerLogger.PassStep(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Full " + lstIntroducePageBreakAfterPageNumbersFrs105Full);
 	}

      
	/**
 	 * Enter Address1
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Address1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

 			Assert.fail("Unable to locate object: " + Address1Elem.toString());
         }

 		elem.sendKeys(Address1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address1 " + Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address1 " + Address1);
 	}

      
	/**
 	 * Enter Address2
     * @name Enter Address2
     */
 	public void Enter_Address2(String Address2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Address2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

 			Assert.fail("Unable to locate object: " + Address2Elem.toString());
         }

 		elem.sendKeys(Address2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address2 " + Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address2 " + Address2);
 	}

      
	/**
 	 * Enter Address3
     * @name Enter Address3
     */
 	public void Enter_Address3(String Address3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Address3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

 			Assert.fail("Unable to locate object: " + Address3Elem.toString());
         }

 		elem.sendKeys(Address3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address3 " + Address3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address3 " + Address3);
 	}

      
	/**
 	 * Enter Address4
     * @name Enter Address4
     */
 	public void Enter_Address4(String Address4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Address4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

 			Assert.fail("Unable to locate object: " + Address4Elem.toString());
         }

 		elem.sendKeys(Address4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address4 " + Address4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address4 " + Address4);
 	}

      
	/**
 	 * Enter PostCode
     * @name Enter PostCode
     */
 	public void Enter_PostCode(String PostCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(PostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + PostCodeElem.toString());
         }

 		elem.sendKeys(PostCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode " + PostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode " + PostCode);
 	}

     
	/**
 	 * Click Save_Button
     * @name Click Save_Button
     */
	public void Click_SaveButton_1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SaveButton_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton_1", "Click_SaveButton_1 failed. Unable to locate object: " + SaveButton_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton_1", "Click_SaveButton_1 failed. Unable to locate object: " + SaveButton_1Elem.toString());

			Assert.fail("Unable to locate object: " + SaveButton_1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton_1");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton_1");
	}

     
	/**
 	 * Click Final Accounts
     * @name Click Final Accounts
     */
	public void Click_Final_Accounts_1()
	{
        
		WebElement elem = getWebElement(Final_Accounts_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts_1", "Click_Final_Accounts_1 failed. Unable to locate object: " + Final_Accounts_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts_1", "Click_Final_Accounts_1 failed. Unable to locate object: " + Final_Accounts_1Elem.toString());

			Assert.fail("Unable to locate object: " + Final_Accounts_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts_1");
	}

     
	/**
 	 * Click Full Accounts
     * @name Click Full Accounts
     */
	public void Click_Full_Accounts()
	{
        
		WebElement elem = getWebElement(Full_AccountsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Full_Accounts", "Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Full_Accounts", "Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

			Assert.fail("Unable to locate object: " + Full_AccountsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}

     
	/**
 	 * Click Company Information
     * @name Click Company Information
     */
	public void Click_Company_Information()
	{
        
		WebElement elem = getWebElement(Company_InformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Company_Information", "Click_Company_Information failed. Unable to locate object: " + Company_InformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Company_Information", "Click_Company_Information failed. Unable to locate object: " + Company_InformationElem.toString());

			Assert.fail("Unable to locate object: " + Company_InformationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Company_Information");

		TestModellerLogger.PassStep(m_Driver, "Click_Company_Information");
	}

     
	/**
 	 * Click Income Statement
     * @name Click Income Statement
     */
	public void Click_Income_Statement()
	{
        
		WebElement elem = getWebElement(Income_StatementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Statement", "Click_Income_Statement failed. Unable to locate object: " + Income_StatementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Statement", "Click_Income_Statement failed. Unable to locate object: " + Income_StatementElem.toString());

			Assert.fail("Unable to locate object: " + Income_StatementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement");
	}

     
	/**
 	 * Click Statement of Financial Position
     * @name Click Statement of Financial Position
     */
	public void Click_Statement_of_Financial_Position()
	{
        
		WebElement elem = getWebElement(Statement_of_Financial_PositionElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Statement_of_Financial_Position", "Click_Statement_of_Financial_Position failed. Unable to locate object: " + Statement_of_Financial_PositionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Statement_of_Financial_Position", "Click_Statement_of_Financial_Position failed. Unable to locate object: " + Statement_of_Financial_PositionElem.toString());

			Assert.fail("Unable to locate object: " + Statement_of_Financial_PositionElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Statement_of_Financial_Position");

		TestModellerLogger.PassStep(m_Driver, "Click_Statement_of_Financial_Position");
	}

     
	/**
 	 * Click Detailed Income Statement
     * @name Click Detailed Income Statement
     */
	public void Click_Detailed_Income_Statement()
	{
        
		WebElement elem = getWebElement(Detailed_Income_StatementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Detailed_Income_Statement", "Click_Detailed_Income_Statement failed. Unable to locate object: " + Detailed_Income_StatementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Detailed_Income_Statement", "Click_Detailed_Income_Statement failed. Unable to locate object: " + Detailed_Income_StatementElem.toString());

			Assert.fail("Unable to locate object: " + Detailed_Income_StatementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Detailed_Income_Statement");

		TestModellerLogger.PassStep(m_Driver, "Click_Detailed_Income_Statement");
	}
}