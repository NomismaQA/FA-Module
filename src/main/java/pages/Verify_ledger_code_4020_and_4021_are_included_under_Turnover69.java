package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/486f12f8-914f-4023-88f3-b07d170b30a1
@TestModellerModule(guid = "486f12f8-914f-4023-88f3-b07d170b30a1")
public class Verify_ledger_code_4020_and_4021_are_included_under_Turnover69 extends BasePage
{
	public Verify_ledger_code_4020_and_4021_are_included_under_Turnover69 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By SearchElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

//	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");
	
	private By _Nakul_Elem = By.xpath("//*[@id=\"ctl00_divSubContent\"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");
	
	private By _Clients_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ctl00ctl00ParentContentcPHFilterddlTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Searchbutton1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LLP_Elem = By.xpath("//SPAN[contains(text(),'ABC LLP')]");

	private By _Accountant_Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_accountantMenu\"]/a/span");

	private By Addbutton1Elem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']");

	private By ctl00cPHtxtDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By ctl00cPHtxtDescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDescription']");

	private By ctl00cPHddCurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");

	//private By ctl00cPHrptRecordctl00AccountUC1txtAccountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount']");
	
	private By ctl00cPHrptRecordctl00AccountUC1txtAccountElem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']/span[1]");

	private By ctl00cPHrptRecordctl00txtCreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtCredit']");

	private By ctl00cPHrptRecordctl01AccountUC1txtAccountElem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl01_ltAccount-container']/span[1]");

	private By ctl00cPHrptRecordctl01txtCreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$txtCredit']");

	//private By ctl00cPHrptRecordctl02AccountUC1txtAccountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$AccountUC1$txtAccount']");

	private By ctl00cPHrptRecordctl02AccountUC1txtAccountElem = By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl02_ltAccount-container']/span[1]");

	private By ctl00cPHrptRecordctl02txtDebitElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$txtDebit']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_FA\"]/a/span");

	private By Settings1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_liSettings\"]/a/span");

	private By Accounts_SettingsElem = By.xpath("//*[@id=\"ctl00_SideMenu1_liSettings\"]/ul/li[2]/a");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ctl00cPHtxtPrincipalactivityElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPrincipalactivity']");

	private By ctl00cPHtxtAuthenticationElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAuthentication']");

	private By ctl00cPHtxtCTdistrictElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTdistrict']");

	private By ctl00cPHtxtCTutrElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTutr']");

	private By ctl00cPHtxtCompanySecretaryElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCompanySecretary']");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By ctl00cPHddlAccountantReportFormatElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlAccountantReportFormat']");

	private By ctl00cPHddlSignatoryPartnerLmtdElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSignatoryPartnerLmtd']");

	private By ctl00cPHchkIsIncludeInReportElem = By.xpath("//INPUT[@name='ctl00$cPH$chkIsIncludeInReport']");

	private By radPreparedByPositionsLeft_for_ctl00cPHPreparedByElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsLeft']");

	private By ctl00cPHchkCharitDonationsElem = By.xpath("//INPUT[@name='ctl00$cPH$chkCharitDonations']");

	private By ctl00cPHchkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By Save2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Detailed_Income_StatementElem = By.xpath("//A[contains(text(),'Detailed Income Statement')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58")) {
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
	public void Click_Login_Button()
	{
        
		WebElement elem = getWebElement(Login_ButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login_Button", "Click_Login_Button failed. Unable to locate object: " + Login_ButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login_Button", "Click_Login_Button failed. Unable to locate object: " + Login_ButtonElem.toString());

			Assert.fail("Unable to locate object: " + Login_ButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Login_Button");

		TestModellerLogger.PassStep(m_Driver, "Click_Login_Button");
	}

      
	/**
 	 * Enter ctl00$cPHFilter$txtAgentName
     * @name Enter ctl00$cPHFilter$txtAgentName
     */
 	public void Enter_ctl00cPHFiltertxtAgentName(String ctl00cPHFiltertxtAgentName)
 	{
 	    
 		try {
 			handlepopup();
			WebElement elem = getWebElement(ctl00cPHFiltertxtAgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHFiltertxtAgentName", "Enter_ctl00cPHFiltertxtAgentName failed. Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHFiltertxtAgentNameElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(ctl00cPHFiltertxtAgentName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHFiltertxtAgentName " + ctl00cPHFiltertxtAgentName);
 	}

 	public boolean handlepopup()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(1000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"9f000f36-5dbb-78db-58e6-6e9eef1755d5\"]"));
			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			System.out.println(true);
			return true;
		} catch (Exception e) 
		{
			System.out.println(false);
			return data;
		}
	}
     
	/**
 	 * Click Search
     * @name Click Search
     */
	public void Click_Search()
	{
        
		try {
			WebElement elem = getWebElement(SearchElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search", "Click_Search failed. Unable to locate object: " + SearchElem.toString());

				Assert.fail("Unable to locate object: " + SearchElem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search");

		TestModellerLogger.PassStep(m_Driver, "Click_Search");
	}

     
	/**
 	 * Click  Nakul@@ 
     * @name Click  Nakul@@ 
     */
	public void Click__Nakul_()
	{
        
		try {
			WebElement elem = getWebElement(_Nakul_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				Assert.fail("Unable to locate object: " + _Nakul_Elem.toString());
			}
			Thread.sleep(1000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}

     
	/**
 	 * Click  Clients 
     * @name Click  Clients 
     */
	public void Click__Clients_()
	{
        
		WebElement elem = getWebElement(_Clients_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

			Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Clients_");

		TestModellerLogger.PassStep(m_Driver, "Click__Clients_");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(String ctl00ctl00ParentContentcPHFiltertxtSearchCompany)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());
         }

 		elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlType
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlType
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlType(String ctl00ctl00ParentContentcPHFilterddlType)
 	{
 	    
 		WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType", "Select_ctl00ctl00ParentContentcPHFilterddlType failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType", "Select_ctl00ctl00ParentContentcPHFilterddlType failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType " + ctl00ctl00ParentContentcPHFilterddlType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType " + ctl00ctl00ParentContentcPHFilterddlType);
 	}

     
	/**
 	 * Click Searchbutton1
     * @name Click Searchbutton1
     */
	public void Click_Searchbutton1()
	{
        
		WebElement elem = getWebElement(Searchbutton1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbutton1", "Click_Searchbutton1 failed. Unable to locate object: " + Searchbutton1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbutton1", "Click_Searchbutton1 failed. Unable to locate object: " + Searchbutton1Elem.toString());

			Assert.fail("Unable to locate object: " + Searchbutton1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Searchbutton1");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbutton1");
	}

     
	/**
 	 * Click  ABC LLP 
     * @name Click  ABC LLP 
     */
	public void Click__ABC_LLP_()
	{
        
		try {
			WebElement elem = getWebElement(_ABC_LLP_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LLP_", "Click__ABC_LLP_ failed. Unable to locate object: " + _ABC_LLP_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LLP_", "Click__ABC_LLP_ failed. Unable to locate object: " + _ABC_LLP_Elem.toString());

				Assert.fail("Unable to locate object: " + _ABC_LLP_Elem.toString());
			}

			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LLP_");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LLP_");
	}

     
	/**
 	 * Click  Accountant 
     * @name Click  Accountant 
     */
	public void Click__Accountant_()
	{
        
		WebElement elem = getWebElement(_Accountant_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Accountant_", "Click__Accountant_ failed. Unable to locate object: " + _Accountant_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Accountant_", "Click__Accountant_ failed. Unable to locate object: " + _Accountant_Elem.toString());

			Assert.fail("Unable to locate object: " + _Accountant_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Accountant_");

		TestModellerLogger.PassStep(m_Driver, "Click__Accountant_");
	}

     
	/**
 	 * Click Addbutton1
     * @name Click Addbutton1
     */
	public void Click_Addbutton1()
	{
        
		WebElement elem = getWebElement(Addbutton1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Addbutton1", "Click_Addbutton1 failed. Unable to locate object: " + Addbutton1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Addbutton1", "Click_Addbutton1 failed. Unable to locate object: " + Addbutton1Elem.toString());

			Assert.fail("Unable to locate object: " + Addbutton1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Addbutton1");

		TestModellerLogger.PassStep(m_Driver, "Click_Addbutton1");
	}

      
	/**
 	 * Enter ctl00$cPH$txtDate
     * @name Enter ctl00$cPH$txtDate
     */
 	public void Enter_ctl00cPHtxtDate(String ctl00cPHtxtDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDate", "Enter_ctl00cPHtxtDate failed. Unable to locate object: " + ctl00cPHtxtDateElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDateElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDate " + ctl00cPHtxtDate);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtDescription
     * @name Enter ctl00$cPH$txtDescription
     */
 	public void Enter_ctl00cPHtxtDescription(String ctl00cPHtxtDescription)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtDescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDescription", "Enter_ctl00cPHtxtDescription failed. Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtDescription", "Enter_ctl00cPHtxtDescription failed. Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtDescriptionElem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtDescription);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtDescription " + ctl00cPHtxtDescription);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtDescription " + ctl00cPHtxtDescription);
 	}

    
	/**
 	 * Select ctl00$cPH$ddCurrency
     * @name Select ctl00$cPH$ddCurrency
     */
    public void Select_ctl00cPHddCurrency(String ctl00cPHddCurrency)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHddCurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddCurrency", "Select_ctl00cPHddCurrency failed. Unable to locate object: " + ctl00cPHddCurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddCurrency", "Select_ctl00cPHddCurrency failed. Unable to locate object: " + ctl00cPHddCurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddCurrencyElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddCurrency);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddCurrency " + ctl00cPHddCurrency);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddCurrency " + ctl00cPHddCurrency);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount
     * @name Enter ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount
     */
 	public void Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount(String ctl00cPHrptRecordctl00AccountUC1txtAccount)
 	{
 		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		//	m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']/span[1]")).click();
			WebElement elem = getWebElement(ctl00cPHrptRecordctl00AccountUC1txtAccountElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl00AccountUC1txtAccountElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl00AccountUC1txtAccountElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl00AccountUC1txtAccountElem.toString());
			 }		
			elem.click();
			Thread.sleep(5000);
			m_Driver.findElement(By.xpath("//*[starts-with(text(), '4020 - Flat rate saving')]")).click();
			Thread.sleep(2000);
			m_Driver.findElement(By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$txtDebit']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount " + ctl00cPHrptRecordctl00AccountUC1txtAccount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount " + ctl00cPHrptRecordctl00AccountUC1txtAccount);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl00$txtCredit
     * @name Enter ctl00$cPH$rptRecord$ctl00$txtCredit
     */
 	public void Enter_ctl00cPHrptRecordctl00txtCredit(String ctl00cPHrptRecordctl00txtCredit)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHrptRecordctl00txtCreditElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit", "Enter_ctl00cPHrptRecordctl00txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl00txtCreditElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit", "Enter_ctl00cPHrptRecordctl00txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl00txtCreditElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl00txtCreditElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHrptRecordctl00txtCredit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit " + ctl00cPHrptRecordctl00txtCredit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit " + ctl00cPHrptRecordctl00txtCredit);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl01$AccountUC1$txtAccount
     * @name Enter ctl00$cPH$rptRecord$ctl01$AccountUC1$txtAccount
     */
 	public void Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount(String ctl00cPHrptRecordctl01AccountUC1txtAccount)
 	{
 		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHrptRecordctl01AccountUC1txtAccountElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl01AccountUC1txtAccountElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl01AccountUC1txtAccountElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl01AccountUC1txtAccountElem.toString());
			 }

			elem.click();
			Thread.sleep(3000);
			m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("4021");
			Thread.sleep(2000);
			m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
			m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
//			m_Driver.findElement(By.xpath("//*[starts-with(text(), '4021 - Flat rate saving')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount " + ctl00cPHrptRecordctl01AccountUC1txtAccount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount " + ctl00cPHrptRecordctl01AccountUC1txtAccount);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl01$txtCredit
     * @name Enter ctl00$cPH$rptRecord$ctl01$txtCredit
     */
 	public void Enter_ctl00cPHrptRecordctl01txtCredit(String ctl00cPHrptRecordctl01txtCredit)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHrptRecordctl01txtCreditElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit", "Enter_ctl00cPHrptRecordctl01txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl01txtCreditElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit", "Enter_ctl00cPHrptRecordctl01txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl01txtCreditElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl01txtCreditElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHrptRecordctl01txtCredit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit " + ctl00cPHrptRecordctl01txtCredit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit " + ctl00cPHrptRecordctl01txtCredit);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl02$AccountUC1$txtAccount
     * @name Enter ctl00$cPH$rptRecord$ctl02$AccountUC1$txtAccount
     */
 	public void Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount(String ctl00cPHrptRecordctl02AccountUC1txtAccount)
 	{
 	    
		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHrptRecordctl02AccountUC1txtAccountElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl02AccountUC1txtAccountElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl02AccountUC1txtAccountElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl02AccountUC1txtAccountElem.toString());
			 }
			
			elem.click();
Thread.sleep(3000);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("1300");
Thread.sleep(2000);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ARROW_DOWN);
m_Driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Keys.ENTER);
//m_Driver.findElement(By.xpath("//*[starts-with(text(), '1300 - Other debtors')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount " + ctl00cPHrptRecordctl02AccountUC1txtAccount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount " + ctl00cPHrptRecordctl02AccountUC1txtAccount);
 	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl02$txtDebit
     * @name Enter ctl00$cPH$rptRecord$ctl02$txtDebit
     */
 	public void Enter_ctl00cPHrptRecordctl02txtDebit(String ctl00cPHrptRecordctl02txtDebit)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHrptRecordctl02txtDebitElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02txtDebit", "Enter_ctl00cPHrptRecordctl02txtDebit failed. Unable to locate object: " + ctl00cPHrptRecordctl02txtDebitElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02txtDebit", "Enter_ctl00cPHrptRecordctl02txtDebit failed. Unable to locate object: " + ctl00cPHrptRecordctl02txtDebitElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl02txtDebitElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHrptRecordctl02txtDebit);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl02txtDebit " + ctl00cPHrptRecordctl02txtDebit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl02txtDebit " + ctl00cPHrptRecordctl02txtDebit);
 	}

     
	/**
 	 * Click Save1
     * @name Click Save1
     */
	public void Click_Save1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(Save1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

			Assert.fail("Unable to locate object: " + Save1Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save1");

		TestModellerLogger.PassStep(m_Driver, "Click_Save1");
	}

     
	/**
 	 * Click Final Accounts1
     * @name Click Final Accounts1
     */
	public void Click_Final_Accounts1()
	{
        
		try {
			WebElement elem = getWebElement(Final_Accounts1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts1", "Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts1", "Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts1Elem.toString());

				Assert.fail("Unable to locate object: " + Final_Accounts1Elem.toString());
			}
Thread.sleep(3000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts1");
	}

     
	/**
 	 * Click Settings1
     * @name Click Settings1
     */
	public void Click_Settings1()
	{
        
		try {
			WebElement elem = getWebElement(Settings1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings1", "Click_Settings1 failed. Unable to locate object: " + Settings1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings1", "Click_Settings1 failed. Unable to locate object: " + Settings1Elem.toString());

				Assert.fail("Unable to locate object: " + Settings1Elem.toString());
			}
Thread.sleep(3000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings1");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings1");
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
 	 * Click Edit1
     * @name Click Edit1
     */
	public void Click_Edit1()
	{
        
		WebElement elem = getWebElement(Edit1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit1", "Click_Edit1 failed. Unable to locate object: " + Edit1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit1", "Click_Edit1 failed. Unable to locate object: " + Edit1Elem.toString());

			Assert.fail("Unable to locate object: " + Edit1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit1");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit1");
	}

      
	/**
 	 * Enter ctl00$cPH$txtPrincipalactivity
     * @name Enter ctl00$cPH$txtPrincipalactivity
     */
 	public void Enter_ctl00cPHtxtPrincipalactivity(String ctl00cPHtxtPrincipalactivity)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtPrincipalactivityElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());
			 }
elem.clear();
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHtxtPrincipalactivity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAuthenticationElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());
			 }
elem.clear();
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHtxtAuthentication);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtCTdistrictElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());
			 }
elem.clear();
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHtxtCTdistrict);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtCTutrElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());
			 }
elem.clear();
Thread.sleep(3000);
			elem.sendKeys(ctl00cPHtxtCTutr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
elem.clear();
 		elem.sendKeys(ctl00cPHtxtCompanySecretary);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCompanySecretary " + ctl00cPHtxtCompanySecretary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCompanySecretary " + ctl00cPHtxtCompanySecretary);
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
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlReportingStdType " + ctl00cPHddlReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlReportingStdType " + ctl00cPHddlReportingStdType);
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
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlAccountantReportFormat " + ctl00cPHddlAccountantReportFormat);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlAccountantReportFormat " + ctl00cPHddlAccountantReportFormat);
 	}

    
	/**
 	 * Select ctl00$cPH$ddlSignatoryPartnerLmtd
     * @name Select ctl00$cPH$ddlSignatoryPartnerLmtd
     */
  
     
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
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00cPHchkIsIncludeInReport");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00cPHchkIsIncludeInReport");
	}

     
	/**
 	 * Click 'radPreparedByPositionsLeft' for 'ctl00$cPH$PreparedBy''
     * @name Click 'radPreparedByPositionsLeft' for 'ctl00$cPH$PreparedBy''
     */
	public void Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(radPreparedByPositionsLeft_for_ctl00cPHPreparedByElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy", "Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy failed. Unable to locate object: " + radPreparedByPositionsLeft_for_ctl00cPHPreparedByElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy", "Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy failed. Unable to locate object: " + radPreparedByPositionsLeft_for_ctl00cPHPreparedByElem.toString());

			Assert.fail("Unable to locate object: " + radPreparedByPositionsLeft_for_ctl00cPHPreparedByElem.toString());
        }

		elem.click();
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy");

		TestModellerLogger.PassStep(m_Driver, "Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy");
	}

     
	/**
 	 * Click ctl00$cPH$chkCharitDonations
     * @name Click ctl00$cPH$chkCharitDonations
     */
	public void Click_ctl00cPHchkCharitDonations()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ctl00cPHchkCharitDonationsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ctl00cPHchkCharitDonations", "Click_ctl00cPHchkCharitDonations failed. Unable to locate object: " + ctl00cPHchkCharitDonationsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ctl00cPHchkCharitDonations", "Click_ctl00cPHchkCharitDonations failed. Unable to locate object: " + ctl00cPHchkCharitDonationsElem.toString());

			Assert.fail("Unable to locate object: " + ctl00cPHchkCharitDonationsElem.toString());
        }

		elem.click();
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00cPHchkCharitDonations");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00cPHchkCharitDonations");
	}

     
	/**
 	 * Click ctl00$cPH$chkDirectorsYear
     * @name Click ctl00$cPH$chkDirectorsYear
     */
	public void Click_ctl00cPHchkDirectorsYear()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(ctl00cPHchkDirectorsYearElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ctl00cPHchkDirectorsYear", "Click_ctl00cPHchkDirectorsYear failed. Unable to locate object: " + ctl00cPHchkDirectorsYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ctl00cPHchkDirectorsYear", "Click_ctl00cPHchkDirectorsYear failed. Unable to locate object: " + ctl00cPHchkDirectorsYearElem.toString());

			Assert.fail("Unable to locate object: " + ctl00cPHchkDirectorsYearElem.toString());
        }

		elem.click();
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00cPHchkDirectorsYear");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00cPHchkDirectorsYear");
	}

     
	/**
 	 * Click Save2
     * @name Click Save2
     */
	public void Click_Save2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Save2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save2", "Click_Save2 failed. Unable to locate object: " + Save2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save2", "Click_Save2 failed. Unable to locate object: " + Save2Elem.toString());

			Assert.fail("Unable to locate object: " + Save2Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save2");

		TestModellerLogger.PassStep(m_Driver, "Click_Save2");
	}

     
	/**
 	 * Click Final Accounts2
     * @name Click Final Accounts2
     */
	public void Click_Final_Accounts2()
	{
        
		WebElement elem = getWebElement(Final_Accounts2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts2", "Click_Final_Accounts2 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts2", "Click_Final_Accounts2 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

			Assert.fail("Unable to locate object: " + Final_Accounts2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts2");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts2");
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