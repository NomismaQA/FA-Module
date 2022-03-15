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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/cd5af4c4-7fc6-4364-a477-a96129a28c3e
@TestModellerModule(guid = "cd5af4c4-7fc6-4364-a477-a96129a28c3e")
public class Accountsettings1201 extends BasePage
{
	public Accountsettings1201 (WebDriver driver)
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

	private By Search_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By clientnameElem = By.xpath("//TD[@style='cursor: pointer;']");

	private By Final_AccountsElem = By.xpath("//SPAN[contains(text(),'Final Accounts')]");

	private By SettingsElem = By.xpath("//SPAN[contains(text(),'Settings')]");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By EditElem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']/IMG");

	private By PrincipalactivityElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPrincipalactivity']");

	private By AuthenticationcodeElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAuthentication']");

	private By CTdistrictElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTdistrict']");

	private By CTUTRElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTutr']");

	private By CompanySecretaryElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCompanySecretary']");

	private By ReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By AccountantReportFormatElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlAccountantReportFormat']");

	private By SignatoryPartnerLmtdElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSignatoryPartnerLmtd']");

	private By IncludeInReportElem = By.xpath("//INPUT[@name='ctl00$cPH$chkIsIncludeInReport']");

	private By PositionsRightElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By chkCharitDonationsElem = By.xpath("//INPUT[@name='ctl00$cPH$chkCharitDonations']");

	private By Frs105ShortElem = By.xpath("//SELECT[@name='ctl00$cPH$lstIntroducePageBreakAfterPageNumbersFrs105Short']");

	private By Frs105FullElem = By.xpath("//SELECT[@name='ctl00$cPH$lstIntroducePageBreakAfterPageNumbersFrs105Full']");

	private By chkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By Address1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By Address2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By Address3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By Address4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By PostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$txtRegFAPostCode']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=c33c695a-cc1e-4a5b-bf9a-a9ea7e297239");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=c33c695a-cc1e-4a5b-bf9a-a9ea7e297239");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=c33c695a-cc1e-4a5b-bf9a-a9ea7e297239");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=c33c695a-cc1e-4a5b-bf9a-a9ea7e297239";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=c33c695a-cc1e-4a5b-bf9a-a9ea7e297239")) {
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
 	 * Click Search 
     * @name Click Search 
     */
	public void Click_Search_()
	{
        
		WebElement elem = getWebElement(Search_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_", "Click_Search_ failed. Unable to locate object: " + Search_Elem.toString());

			Assert.fail("Unable to locate object: " + Search_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_");
	}

     
	/**
 	 * Click client_name
     * @name Click client_name
     */
	public void Click_clientname()
	{
        
		WebElement elem = getWebElement(clientnameElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_clientname", "Click_clientname failed. Unable to locate object: " + clientnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_clientname", "Click_clientname failed. Unable to locate object: " + clientnameElem.toString());

			Assert.fail("Unable to locate object: " + clientnameElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_clientname");

		TestModellerLogger.PassStep(m_Driver, "Click_clientname");
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
 	 * Click Edit
     * @name Click Edit
     */
	public void Click_Edit()
	{
        
		WebElement elem = getWebElement(EditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit", "Click_Edit failed. Unable to locate object: " + EditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit", "Click_Edit failed. Unable to locate object: " + EditElem.toString());

			Assert.fail("Unable to locate object: " + EditElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit");
	}

      
	/**
 	 * Enter Principalactivity
     * @name Enter Principalactivity
     */
 	public void Enter_Principalactivity(String Principalactivity)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(PrincipalactivityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Principalactivity", "Enter_Principalactivity failed. Unable to locate object: " + PrincipalactivityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Principalactivity", "Enter_Principalactivity failed. Unable to locate object: " + PrincipalactivityElem.toString());

 			Assert.fail("Unable to locate object: " + PrincipalactivityElem.toString());
         }

 		elem.sendKeys(Principalactivity);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Principalactivity " + Principalactivity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Principalactivity " + Principalactivity);
 	}

      
	/**
 	 * Enter Authentication_code
     * @name Enter Authentication_code
     */
 	public void Enter_Authenticationcode(String Authenticationcode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(AuthenticationcodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Authenticationcode", "Enter_Authenticationcode failed. Unable to locate object: " + AuthenticationcodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Authenticationcode", "Enter_Authenticationcode failed. Unable to locate object: " + AuthenticationcodeElem.toString());

 			Assert.fail("Unable to locate object: " + AuthenticationcodeElem.toString());
         }

 		elem.sendKeys(Authenticationcode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Authenticationcode " + Authenticationcode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Authenticationcode " + Authenticationcode);
 	}

      
	/**
 	 * Enter CT_district
     * @name Enter CT_district
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
 	 * Click IncludeInReport
     * @name Click IncludeInReport
     */
	public void Click_IncludeInReport()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(IncludeInReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_IncludeInReport", "Click_IncludeInReport failed. Unable to locate object: " + IncludeInReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_IncludeInReport", "Click_IncludeInReport failed. Unable to locate object: " + IncludeInReportElem.toString());

			Assert.fail("Unable to locate object: " + IncludeInReportElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_IncludeInReport");

		TestModellerLogger.PassStep(m_Driver, "Click_IncludeInReport");
	}

     
	/**
 	 * Click PositionsRight
     * @name Click PositionsRight
     */
	public void Click_PositionsRight()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(PositionsRightElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PositionsRight", "Click_PositionsRight failed. Unable to locate object: " + PositionsRightElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PositionsRight", "Click_PositionsRight failed. Unable to locate object: " + PositionsRightElem.toString());

			Assert.fail("Unable to locate object: " + PositionsRightElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_PositionsRight");

		TestModellerLogger.PassStep(m_Driver, "Click_PositionsRight");
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
 	 * Select Frs105Short
     * @name Select Frs105Short
     */
    public void Select_Frs105Short(String Frs105Short)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Frs105ShortElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Frs105Short", "Select_Frs105Short failed. Unable to locate object: " + Frs105ShortElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Frs105Short", "Select_Frs105Short failed. Unable to locate object: " + Frs105ShortElem.toString());

 			Assert.fail("Unable to locate object: " + Frs105ShortElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Frs105Short);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Frs105Short " + Frs105Short);

 		TestModellerLogger.PassStep(m_Driver, "Select_Frs105Short " + Frs105Short);
 	}

    
	/**
 	 * Select Frs105Full
     * @name Select Frs105Full
     */
    public void Select_Frs105Full(String Frs105Full)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(Frs105FullElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Frs105Full", "Select_Frs105Full failed. Unable to locate object: " + Frs105FullElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Frs105Full", "Select_Frs105Full failed. Unable to locate object: " + Frs105FullElem.toString());

 			Assert.fail("Unable to locate object: " + Frs105FullElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Frs105Full);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Frs105Full " + Frs105Full);

 		TestModellerLogger.PassStep(m_Driver, "Select_Frs105Full " + Frs105Full);
 	}

     
	/**
 	 * Click chkDirectorsYear
     * @name Click chkDirectorsYear
     */
	public void Click_chkDirectorsYear()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(chkDirectorsYearElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkDirectorsYear", "Click_chkDirectorsYear failed. Unable to locate object: " + chkDirectorsYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkDirectorsYear", "Click_chkDirectorsYear failed. Unable to locate object: " + chkDirectorsYearElem.toString());

			Assert.fail("Unable to locate object: " + chkDirectorsYearElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_chkDirectorsYear");

		TestModellerLogger.PassStep(m_Driver, "Click_chkDirectorsYear");
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
	public void Click_SaveButton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}