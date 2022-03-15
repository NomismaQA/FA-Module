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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/16d887d5-c237-47e7-a445-e266a8664b76
@TestModellerModule(guid = "16d887d5-c237-47e7-a445-e266a8664b76")
public class FAscript extends BasePage
{
	public FAscript (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHloginElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By ctl00cPHpassElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By SearchElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By LLPElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_RptClient_ctl03_lnkClientEdit']");

	private By _Friends_Test_CompanyElem = By.cssSelector("TD[onclick='navigateIn\\(this\\)']");

	private By SettingsElem = By.xpath("/html/body/form/main/div[11]/div[2]/ul/li[13]/a/span");

	private By _EditElem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By GeneralElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbGeneral']");

	private By ctl00cPHtbContainerTbGeneraltxtRegNoElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtRegNo']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress1Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress1']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress2']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress3Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress3']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress4']");

	private By ctl00cPHtbContainerTbGeneraltxtPostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtPostCode']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");

	private By Final_AccountsElem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A/SPAN[@class='side_nav_text']");

	private By Settings_1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A/SPAN[@class='side_nav_text']");

	private By Accounts_SettingsElem = By.xpath("//A[@href='../AccountUI/FinalAccountSettings.aspx?FYCode=9050&CompanyCode=6837']");

	private By EditElem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']/IMG");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By _Save__1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By ctl00cPHtxtPrincipalactivityElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPrincipalactivity']");

	private By ctl00cPHtxtAuthenticationElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAuthentication']");

	private By ctl00cPHtxtCTdistrictElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTdistrict']");

	private By ctl00cPHtxtCTutrElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTutr']");

	private By ctl00cPHtxtCompanySecretaryElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCompanySecretary']");

	private By ctl00cPHddlReportingStdType_1Elem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By ctl00cPHddlAccountantReportFormatElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlAccountantReportFormat']");

	private By ctl00cPHddlSignatoryPartnerLmtdElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSignatoryPartnerLmtd']");

	private By ctl00cPHchkIsIncludeInReportElem = By.xpath("//INPUT[@name='ctl00$cPH$chkIsIncludeInReport']");

	private By radPreparedByPositionsRight_for_ctl00cPHPreparedByElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By _Save__2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts_1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A/SPAN[@class='side_nav_text']");

	private By Full_AccountsElem = By.xpath("//A[@href='../AccountUI/FinalAccountPreview.aspx?FYCode=9050&CompanyCode=6837&t=Full']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter ctl00$cPH$login
     * @name Enter ctl00$cPH$login
     */
 	public void Enter_ctl00cPHlogin(String ctl00cPHlogin)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHloginElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHlogin", "Enter_ctl00cPHlogin failed. Unable to locate object: " + ctl00cPHloginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHlogin", "Enter_ctl00cPHlogin failed. Unable to locate object: " + ctl00cPHloginElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHloginElem.toString());
         }

 		elem.sendKeys(ctl00cPHlogin);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHlogin " + ctl00cPHlogin);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHlogin " + ctl00cPHlogin);
 	}

      
	/**
 	 * Enter ctl00$cPH$pass
     * @name Enter ctl00$cPH$pass
     */
 	public void Enter_ctl00cPHpass(String ctl00cPHpass)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHpassElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHpass", "Enter_ctl00cPHpass failed. Unable to locate object: " + ctl00cPHpassElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHpass", "Enter_ctl00cPHpass failed. Unable to locate object: " + ctl00cPHpassElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHpassElem.toString());
         }

 		elem.sendKeys(ctl00cPHpass);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);
 	}

     
	/**
 	 * Click Login
     * @name Click Login
     */
	public void Click_Login()
	{
        
		WebElement elem = getWebElement(LoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

			Assert.fail("Unable to locate object: " + LoginElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Login");

		TestModellerLogger.PassStep(m_Driver, "Click_Login");
	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtAgentName
     * @name Enter ctl00$cPHFilter$txtAgentName
     */
 	public void Enter_ctl00cPHFiltertxtAgentName(String ctl00cPHFiltertxtAgentName)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHFiltertxtAgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());
         }

 		elem.sendKeys(ctl00cPHFiltertxtAgentName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);
 	}

     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		WebElement elem = getWebElement(SearchElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

			Assert.fail("Unable to locate object: " + SearchElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

     
	/**
 	 * Click  Nakul@@ 
     * @name Click  Nakul@@ 
     */
	public void Click__Nakul_()
	{
        
		WebElement elem = getWebElement(_Nakul_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

			Assert.fail("Unable to locate object: " + _Nakul_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}

     
	/**
 	 * Click LLP
     * @name Click LLP
     */
	public void Click_LLP()
	{
        
		WebElement elem = getWebElement(LLPElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LLP", "Click_LLP failed. Unable to locate object: " + LLPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LLP", "Click_LLP failed. Unable to locate object: " + LLPElem.toString());

			Assert.fail("Unable to locate object: " + LLPElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LLP");

		TestModellerLogger.PassStep(m_Driver, "Click_LLP");
	}

     
	/**
 	 * Click  Friends Test Company
     * @name Click  Friends Test Company
     */
	public void Click__Friends_Test_Company()
	{
        
		WebElement elem = getWebElement(_Friends_Test_CompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Friends_Test_Company", "Click__Friends_Test_Company failed. Unable to locate object: " + _Friends_Test_CompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Friends_Test_Company", "Click__Friends_Test_Company failed. Unable to locate object: " + _Friends_Test_CompanyElem.toString());

			Assert.fail("Unable to locate object: " + _Friends_Test_CompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Friends_Test_Company");

		TestModellerLogger.PassStep(m_Driver, "Click__Friends_Test_Company");
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
 	 * Click  Edit
     * @name Click  Edit
     */
	public void Click__Edit()
	{
        
		WebElement elem = getWebElement(_EditElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Edit", "Click__Edit failed. Unable to locate object: " + _EditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Edit", "Click__Edit failed. Unable to locate object: " + _EditElem.toString());

			Assert.fail("Unable to locate object: " + _EditElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Edit");

		TestModellerLogger.PassStep(m_Driver, "Click__Edit");
	}

     
	/**
 	 * Click General
     * @name Click General
     */
	public void Click_General()
	{
        
		WebElement elem = getWebElement(GeneralElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_General", "Click_General failed. Unable to locate object: " + GeneralElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_General", "Click_General failed. Unable to locate object: " + GeneralElem.toString());

			Assert.fail("Unable to locate object: " + GeneralElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_General");

		TestModellerLogger.PassStep(m_Driver, "Click_General");
	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtRegNo
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtRegNo
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(String ctl00cPHtbContainerTbGeneraltxtRegNo)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtRegNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo", "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo", "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtRegNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo " + ctl00cPHtbContainerTbGeneraltxtRegNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo " + ctl00cPHtbContainerTbGeneraltxtRegNo);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress1
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress1
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(String ctl00cPHtbContainerTbGeneraltxtAddress1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress1Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 " + ctl00cPHtbContainerTbGeneraltxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 " + ctl00cPHtbContainerTbGeneraltxtAddress1);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress2
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress2
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(String ctl00cPHtbContainerTbGeneraltxtAddress2)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress2Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 " + ctl00cPHtbContainerTbGeneraltxtAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 " + ctl00cPHtbContainerTbGeneraltxtAddress2);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress3
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress3
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(String ctl00cPHtbContainerTbGeneraltxtAddress3)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress3Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress3Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 " + ctl00cPHtbContainerTbGeneraltxtAddress3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 " + ctl00cPHtbContainerTbGeneraltxtAddress3);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress4
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress4
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(String ctl00cPHtbContainerTbGeneraltxtAddress4)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress4Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress4Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 " + ctl00cPHtbContainerTbGeneraltxtAddress4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 " + ctl00cPHtbContainerTbGeneraltxtAddress4);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtPostCode
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtPostCode
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(String ctl00cPHtbContainerTbGeneraltxtPostCode)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode", "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode", "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtPostCodeElem.toString());
         }

 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtPostCode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode " + ctl00cPHtbContainerTbGeneraltxtPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode " + ctl00cPHtbContainerTbGeneraltxtPostCode);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
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
	public void Click_Settings_1()
	{
        
		WebElement elem = getWebElement(Settings_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings_1", "Click_Settings_1 failed. Unable to locate object: " + Settings_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings_1", "Click_Settings_1 failed. Unable to locate object: " + Settings_1Elem.toString());

			Assert.fail("Unable to locate object: " + Settings_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings_1");
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
 	 * Select ctl00$cPH$ddlReportingStdType
     * @name Select ctl00$cPH$ddlReportingStdType
     */
    public void Select_ctl00cPHddlReportingStdType(String ctl00cPHddlReportingStdType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHddlReportingStdTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlReportingStdType", "Select_ctl00cPHddlReportingStdType failed. Unable to locate object: " + ctl00cPHddlReportingStdTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlReportingStdType", "Select_ctl00cPHddlReportingStdType failed. Unable to locate object: " + ctl00cPHddlReportingStdTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlReportingStdTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlReportingStdType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlReportingStdType " + ctl00cPHddlReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlReportingStdType " + ctl00cPHddlReportingStdType);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save__1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(_Save__1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save__1", "Click__Save__1 failed. Unable to locate object: " + _Save__1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save__1", "Click__Save__1 failed. Unable to locate object: " + _Save__1Elem.toString());

			Assert.fail("Unable to locate object: " + _Save__1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save__1");

		TestModellerLogger.PassStep(m_Driver, "Click__Save__1");
	}

      
	/**
 	 * Enter ctl00$cPH$txtPrincipalactivity
     * @name Enter ctl00$cPH$txtPrincipalactivity
     */
 	public void Enter_ctl00cPHtxtPrincipalactivity(String ctl00cPHtxtPrincipalactivity)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtPrincipalactivityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtPrincipalactivity);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity " + ctl00cPHtxtPrincipalactivity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity " + ctl00cPHtxtPrincipalactivity);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAuthentication
     * @name Enter ctl00$cPH$txtAuthentication
     */
 	public void Enter_ctl00cPHtxtAuthentication(String ctl00cPHtxtAuthentication)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAuthenticationElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAuthentication);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAuthentication " + ctl00cPHtxtAuthentication);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAuthentication " + ctl00cPHtxtAuthentication);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCTdistrict
     * @name Enter ctl00$cPH$txtCTdistrict
     */
 	public void Enter_ctl00cPHtxtCTdistrict(String ctl00cPHtxtCTdistrict)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCTdistrictElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtCTdistrict);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCTdistrict " + ctl00cPHtxtCTdistrict);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCTdistrict " + ctl00cPHtxtCTdistrict);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCTutr
     * @name Enter ctl00$cPH$txtCTutr
     */
 	public void Enter_ctl00cPHtxtCTutr(String ctl00cPHtxtCTutr)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCTutrElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtCTutr);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCTutr " + ctl00cPHtxtCTutr);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCTutr " + ctl00cPHtxtCTutr);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCompanySecretary
     * @name Enter ctl00$cPH$txtCompanySecretary
     */
 	public void Enter_ctl00cPHtxtCompanySecretary(String ctl00cPHtxtCompanySecretary)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCompanySecretaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCompanySecretary", "Enter_ctl00cPHtxtCompanySecretary failed. Unable to locate object: " + ctl00cPHtxtCompanySecretaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCompanySecretary", "Enter_ctl00cPHtxtCompanySecretary failed. Unable to locate object: " + ctl00cPHtxtCompanySecretaryElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCompanySecretaryElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtCompanySecretary);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCompanySecretary " + ctl00cPHtxtCompanySecretary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCompanySecretary " + ctl00cPHtxtCompanySecretary);
 	}

    
	/**
 	 * Select ctl00$cPH$ddlReportingStdType
     * @name Select ctl00$cPH$ddlReportingStdType
     */
    public void Select_ctl00cPHddlReportingStdType_1(String ctl00cPHddlReportingStdType)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHddlReportingStdType_1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlReportingStdType_1", "Select_ctl00cPHddlReportingStdType_1 failed. Unable to locate object: " + ctl00cPHddlReportingStdType_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlReportingStdType_1", "Select_ctl00cPHddlReportingStdType_1 failed. Unable to locate object: " + ctl00cPHddlReportingStdType_1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlReportingStdType_1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlReportingStdType);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlReportingStdType_1 " + ctl00cPHddlReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlReportingStdType_1 " + ctl00cPHddlReportingStdType);
 	}

    
	/**
 	 * Select ctl00$cPH$ddlAccountantReportFormat
     * @name Select ctl00$cPH$ddlAccountantReportFormat
     */
    public void Select_ctl00cPHddlAccountantReportFormat(String ctl00cPHddlAccountantReportFormat)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHddlAccountantReportFormatElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlAccountantReportFormat", "Select_ctl00cPHddlAccountantReportFormat failed. Unable to locate object: " + ctl00cPHddlAccountantReportFormatElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlAccountantReportFormat", "Select_ctl00cPHddlAccountantReportFormat failed. Unable to locate object: " + ctl00cPHddlAccountantReportFormatElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlAccountantReportFormatElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlAccountantReportFormat);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlAccountantReportFormat " + ctl00cPHddlAccountantReportFormat);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlAccountantReportFormat " + ctl00cPHddlAccountantReportFormat);
 	}

    
	/**
 	 * Select ctl00$cPH$ddlSignatoryPartnerLmtd
     * @name Select ctl00$cPH$ddlSignatoryPartnerLmtd
     */
    public void Select_ctl00cPHddlSignatoryPartnerLmtd(String ctl00cPHddlSignatoryPartnerLmtd)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHddlSignatoryPartnerLmtdElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlSignatoryPartnerLmtd", "Select_ctl00cPHddlSignatoryPartnerLmtd failed. Unable to locate object: " + ctl00cPHddlSignatoryPartnerLmtdElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlSignatoryPartnerLmtd", "Select_ctl00cPHddlSignatoryPartnerLmtd failed. Unable to locate object: " + ctl00cPHddlSignatoryPartnerLmtdElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlSignatoryPartnerLmtdElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlSignatoryPartnerLmtd);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlSignatoryPartnerLmtd " + ctl00cPHddlSignatoryPartnerLmtd);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlSignatoryPartnerLmtd " + ctl00cPHddlSignatoryPartnerLmtd);
 	}

     
	/**
 	 * Click ctl00$cPH$chkIsIncludeInReport
     * @name Click ctl00$cPH$chkIsIncludeInReport
     */
	public void Click_ctl00cPHchkIsIncludeInReport()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ctl00cPHchkIsIncludeInReportElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ctl00cPHchkIsIncludeInReport", "Click_ctl00cPHchkIsIncludeInReport failed. Unable to locate object: " + ctl00cPHchkIsIncludeInReportElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ctl00cPHchkIsIncludeInReport", "Click_ctl00cPHchkIsIncludeInReport failed. Unable to locate object: " + ctl00cPHchkIsIncludeInReportElem.toString());

			Assert.fail("Unable to locate object: " + ctl00cPHchkIsIncludeInReportElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00cPHchkIsIncludeInReport");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00cPHchkIsIncludeInReport");
	}

     
	/**
 	 * Click 'radPreparedByPositionsRight' for 'ctl00$cPH$PreparedBy''
     * @name Click 'radPreparedByPositionsRight' for 'ctl00$cPH$PreparedBy''
     */
	public void Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(radPreparedByPositionsRight_for_ctl00cPHPreparedByElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy", "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy failed. Unable to locate object: " + radPreparedByPositionsRight_for_ctl00cPHPreparedByElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy", "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy failed. Unable to locate object: " + radPreparedByPositionsRight_for_ctl00cPHPreparedByElem.toString());

			Assert.fail("Unable to locate object: " + radPreparedByPositionsRight_for_ctl00cPHPreparedByElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy");

		TestModellerLogger.PassStep(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy");
	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save__2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(_Save__2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save__2", "Click__Save__2 failed. Unable to locate object: " + _Save__2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save__2", "Click__Save__2 failed. Unable to locate object: " + _Save__2Elem.toString());

			Assert.fail("Unable to locate object: " + _Save__2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save__2");

		TestModellerLogger.PassStep(m_Driver, "Click__Save__2");
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
}