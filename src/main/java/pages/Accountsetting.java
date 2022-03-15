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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3c83bc3f-a580-4bd8-8c72-d0868c6e2182
@TestModellerModule(guid = "3c83bc3f-a580-4bd8-8c72-d0868c6e2182")
public class Accountsetting extends BasePage
{
	public Accountsetting (WebDriver driver)
	{
		super(driver);
	}


	
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

	private By chkIsIncludeInReportElem = By.xpath("//INPUT[@name='ctl00$cPH$chkIsIncludeInReport']");

	private By PositionsRightElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By lstIntroducePageBreakAfterPageNumbersFrs105ShortElem = By.xpath("//SELECT[@name='ctl00$cPH$lstIntroducePageBreakAfterPageNumbersFrs105Short']");

	private By lstIntroducePageBreakAfterPageNumbersFrs105FullElem = By.xpath("//SELECT[@name='ctl00$cPH$lstIntroducePageBreakAfterPageNumbersFrs105Full']");

	private By Address1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By Address2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By Address3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By Address4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By PostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$txtRegFAPostCode']");

	private By SavebuttonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts_1Elem = By.xpath("//SPAN[contains(text(),'Final Accounts')]");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Cover_PageElem = By.xpath("//A[@href='#topfull']");

	private By Company_InformationElem = By.xpath("//A[contains(text(),'Company Information')]");

	private By Income_StatementElem = By.xpath("//A[contains(text(),'Income Statement')]");

	private By Statement_of_Financial_PositionElem = By.xpath("//A[contains(text(),'Statement of Financial Position')]");

	private By Detailed_Income_StatementElem = By.xpath("//A[contains(text(),'Detailed Income Statement')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/FinalAccounts.aspx?FYCode=10691&CompanyCode=7452");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/AccountUI/FinalAccounts.aspx?FYCode=10691&CompanyCode=7452");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/AccountUI/FinalAccounts.aspx?FYCode=10691&CompanyCode=7452");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/FinalAccounts.aspx?FYCode=10691&CompanyCode=7452";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/FinalAccounts.aspx?FYCode=10691&CompanyCode=7452")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
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
 	 * Select lstIntroducePageBreakAfterPageNumbersFrs105Short
     * @name Select lstIntroducePageBreakAfterPageNumbersFrs105Short
     */
    public void Select_lstIntroducePageBreakAfterPageNumbersFrs105Short(String lstIntroducePageBreakAfterPageNumbersFrs105Short)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(lstIntroducePageBreakAfterPageNumbersFrs105ShortElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Short", "Select_lstIntroducePageBreakAfterPageNumbersFrs105Short failed. Unable to locate object: " + lstIntroducePageBreakAfterPageNumbersFrs105ShortElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Short", "Select_lstIntroducePageBreakAfterPageNumbersFrs105Short failed. Unable to locate object: " + lstIntroducePageBreakAfterPageNumbersFrs105ShortElem.toString());

 			Assert.fail("Unable to locate object: " + lstIntroducePageBreakAfterPageNumbersFrs105ShortElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(lstIntroducePageBreakAfterPageNumbersFrs105Short);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Short " + lstIntroducePageBreakAfterPageNumbersFrs105Short);

 		TestModellerLogger.PassStep(m_Driver, "Select_lstIntroducePageBreakAfterPageNumbersFrs105Short " + lstIntroducePageBreakAfterPageNumbersFrs105Short);
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
 	 * Click Save_button
     * @name Click Save_button
     */
	public void Click_Savebutton()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(SavebuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Savebutton", "Click_Savebutton failed. Unable to locate object: " + SavebuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Savebutton", "Click_Savebutton failed. Unable to locate object: " + SavebuttonElem.toString());

			Assert.fail("Unable to locate object: " + SavebuttonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Savebutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Savebutton");
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
 	 * Click Cover Page
     * @name Click Cover Page
     */
	public void Click_Cover_Page()
	{
        
		WebElement elem = getWebElement(Cover_PageElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cover_Page", "Click_Cover_Page failed. Unable to locate object: " + Cover_PageElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cover_Page", "Click_Cover_Page failed. Unable to locate object: " + Cover_PageElem.toString());

			Assert.fail("Unable to locate object: " + Cover_PageElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Cover_Page");

		TestModellerLogger.PassStep(m_Driver, "Click_Cover_Page");
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