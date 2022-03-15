package pages;

import pages.BasePage;
import org.openqa.selenium.By;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d8821b8f-6916-4b7b-88ea-0dfc64e77a27
@TestModellerModule(guid = "d8821b8f-6916-4b7b-88ea-0dfc64e77a27")
public class Verify_ledger_code_4020_and_4021_are_included_under_Turnover70 extends BasePage
{
	public Verify_ledger_code_4020_and_4021_are_included_under_Turnover70 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ctl00ctl00ParentContentcPHFilterddlTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LLP_Elem = By.xpath("//SPAN[contains(text(),'ABC LLP')]");

	private By _Accountant_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");

	private By Add_Journal_entryElem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']");

	private By ctl00cPHtxtDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By ctl00cPHtxtDescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDescription']");

	private By ctl00cPHddCurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");

	private By ctl00cPHrptRecordctl00AccountUC1txtAccountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount']");

	private By _4020_Flat_rate_savingElem = By.xpath("//LI[@style='padding: 0px; text-align: left; text-overflow: ellipsis; background-color: white; color: black;']");

	private By ctl00cPHrptRecordctl00txtCreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtCredit']");

	private By ctl00cPHrptRecordctl01AccountUC1txtAccountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$AccountUC1$txtAccount']");

	private By _4021_Flat_rate_savingElem = By.xpath("//LI[@style='padding: 0px; text-align: left; text-overflow: ellipsis; background-color: white; color: black;']");

	private By ctl00cPHrptRecordctl01txtCreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$txtCredit']");

	private By ctl00cPHrptRecordctl02AccountUC1txtAccountElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$AccountUC1$txtAccount']");

	private By _1300_Other_debtorsElem = By.xpath("//LI[@style='padding: 0px; text-align: left; text-overflow: ellipsis; background-color: white; color: black;']");

	private By ctl00cPHrptRecordctl02txtCreditElem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$txtCredit']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By _Settings_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By ctl00cPHddlAccountantReportFormatElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlAccountantReportFormat']");

	private By ctl00cPHddlSignatoryPartnerLmtdElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlSignatoryPartnerLmtd']");

	private By ctl00cPHchkIsIncludeInReportElem = By.xpath("//INPUT[@name='ctl00$cPH$chkIsIncludeInReport']");

	private By radPreparedByPositionsRight_for_ctl00cPHPreparedByElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By ctl00cPHchkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By ctl00cPHtxtAddress1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By ctl00cPHtxtAddress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By ctl00cPHtxtAddress3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By ctl00cPHtxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By ctl00cPHtxtRegFAPostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$txtRegFAPostCode']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Detailed_Income_StatementElem = By.xpath("//A[contains(text(),'Detailed Income Statement')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=97dbe630-fee1-4e4a-91ec-2d98ef2f49e3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=97dbe630-fee1-4e4a-91ec-2d98ef2f49e3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=97dbe630-fee1-4e4a-91ec-2d98ef2f49e3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=97dbe630-fee1-4e4a-91ec-2d98ef2f49e3";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=97dbe630-fee1-4e4a-91ec-2d98ef2f49e3")) {
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
Thread.sleep(15000);
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
			Thread.sleep(10000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
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
 	 * Click Search_button1
     * @name Click Search_button1
     */
	public void Click_Search_button1()
	{
        
		try {
			WebElement elem = getWebElement(Search_button1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button1", "Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button1", "Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

				Assert.fail("Unable to locate object: " + Search_button1Elem.toString());
			}
Thread.sleep(5000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button1");
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
Thread.sleep(5000);
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
 	 * Click Search_button2
     * @name Click Search_button2
     */
	public void Click_Search_button2()
	{
        
		WebElement elem = getWebElement(Search_button2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button2", "Click_Search_button2 failed. Unable to locate object: " + Search_button2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button2", "Click_Search_button2 failed. Unable to locate object: " + Search_button2Elem.toString());

			Assert.fail("Unable to locate object: " + Search_button2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button2");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button2");
	}

     
	/**
 	 * Click  ABC LLP 
     * @name Click  ABC LLP 
     */
	public void Click__ABC_LLP_()
	{
        
		WebElement elem = getWebElement(_ABC_LLP_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LLP_", "Click__ABC_LLP_ failed. Unable to locate object: " + _ABC_LLP_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LLP_", "Click__ABC_LLP_ failed. Unable to locate object: " + _ABC_LLP_Elem.toString());

			Assert.fail("Unable to locate object: " + _ABC_LLP_Elem.toString());
        }

		elem.click();
       ChangeWindow.tabswitch(m_Driver);   	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LLP_");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LLP_");
	}

     
	/**
 	 * Click  Accountant 
     * @name Click  Accountant 
     */
	public void Click__Accountant_()
	{
        
		try {
			WebElement elem = getWebElement(_Accountant_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Accountant_", "Click__Accountant_ failed. Unable to locate object: " + _Accountant_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Accountant_", "Click__Accountant_ failed. Unable to locate object: " + _Accountant_Elem.toString());

				Assert.fail("Unable to locate object: " + _Accountant_Elem.toString());
			}
			
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Accountant_");

		TestModellerLogger.PassStep(m_Driver, "Click__Accountant_");
	}

     
	/**
 	 * Click Add Journal entry
     * @name Click Add Journal entry
     */
	public void Click_Add_Journal_entry()
	{
        
		WebElement elem = getWebElement(Add_Journal_entryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Journal_entry", "Click_Add_Journal_entry failed. Unable to locate object: " + Add_Journal_entryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Journal_entry", "Click_Add_Journal_entry failed. Unable to locate object: " + Add_Journal_entryElem.toString());

			Assert.fail("Unable to locate object: " + Add_Journal_entryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Journal_entry");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Journal_entry");
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
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHrptRecordctl00AccountUC1txtAccountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl00AccountUC1txtAccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl00AccountUC1txtAccountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl00AccountUC1txtAccountElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptRecordctl00AccountUC1txtAccount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount " + ctl00cPHrptRecordctl00AccountUC1txtAccount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount " + ctl00cPHrptRecordctl00AccountUC1txtAccount);
 	}

     
	/**
 	 * Click 4020 - Flat rate saving
     * @name Click 4020 - Flat rate saving
     */
	public void Click__4020_Flat_rate_saving()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_4020_Flat_rate_savingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__4020_Flat_rate_saving", "Click__4020_Flat_rate_saving failed. Unable to locate object: " + _4020_Flat_rate_savingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__4020_Flat_rate_saving", "Click__4020_Flat_rate_saving failed. Unable to locate object: " + _4020_Flat_rate_savingElem.toString());

			Assert.fail("Unable to locate object: " + _4020_Flat_rate_savingElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__4020_Flat_rate_saving");

		TestModellerLogger.PassStep(m_Driver, "Click__4020_Flat_rate_saving");
	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl00$txtCredit
     * @name Enter ctl00$cPH$rptRecord$ctl00$txtCredit
     */
 	public void Enter_ctl00cPHrptRecordctl00txtCredit(String ctl00cPHrptRecordctl00txtCredit)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHrptRecordctl00txtCreditElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit", "Enter_ctl00cPHrptRecordctl00txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl00txtCreditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit", "Enter_ctl00cPHrptRecordctl00txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl00txtCreditElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl00txtCreditElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptRecordctl00txtCredit);
 		
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
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHrptRecordctl01AccountUC1txtAccountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl01AccountUC1txtAccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl01AccountUC1txtAccountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl01AccountUC1txtAccountElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptRecordctl01AccountUC1txtAccount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount " + ctl00cPHrptRecordctl01AccountUC1txtAccount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount " + ctl00cPHrptRecordctl01AccountUC1txtAccount);
 	}

     
	/**
 	 * Click 4021 - Flat rate saving
     * @name Click 4021 - Flat rate saving
     */
	public void Click__4021_Flat_rate_saving()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_4021_Flat_rate_savingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__4021_Flat_rate_saving", "Click__4021_Flat_rate_saving failed. Unable to locate object: " + _4021_Flat_rate_savingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__4021_Flat_rate_saving", "Click__4021_Flat_rate_saving failed. Unable to locate object: " + _4021_Flat_rate_savingElem.toString());

			Assert.fail("Unable to locate object: " + _4021_Flat_rate_savingElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__4021_Flat_rate_saving");

		TestModellerLogger.PassStep(m_Driver, "Click__4021_Flat_rate_saving");
	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl01$txtCredit
     * @name Enter ctl00$cPH$rptRecord$ctl01$txtCredit
     */
 	public void Enter_ctl00cPHrptRecordctl01txtCredit(String ctl00cPHrptRecordctl01txtCredit)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHrptRecordctl01txtCreditElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit", "Enter_ctl00cPHrptRecordctl01txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl01txtCreditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit", "Enter_ctl00cPHrptRecordctl01txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl01txtCreditElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl01txtCreditElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptRecordctl01txtCredit);
 		
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
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHrptRecordctl02AccountUC1txtAccountElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl02AccountUC1txtAccountElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount failed. Unable to locate object: " + ctl00cPHrptRecordctl02AccountUC1txtAccountElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl02AccountUC1txtAccountElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptRecordctl02AccountUC1txtAccount);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount " + ctl00cPHrptRecordctl02AccountUC1txtAccount);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount " + ctl00cPHrptRecordctl02AccountUC1txtAccount);
 	}

     
	/**
 	 * Click 1300 - Other debtors
     * @name Click 1300 - Other debtors
     */
	public void Click__1300_Other_debtors()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(_1300_Other_debtorsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__1300_Other_debtors", "Click__1300_Other_debtors failed. Unable to locate object: " + _1300_Other_debtorsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__1300_Other_debtors", "Click__1300_Other_debtors failed. Unable to locate object: " + _1300_Other_debtorsElem.toString());

			Assert.fail("Unable to locate object: " + _1300_Other_debtorsElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__1300_Other_debtors");

		TestModellerLogger.PassStep(m_Driver, "Click__1300_Other_debtors");
	}

      
	/**
 	 * Enter ctl00$cPH$rptRecord$ctl02$txtCredit
     * @name Enter ctl00$cPH$rptRecord$ctl02$txtCredit
     */
 	public void Enter_ctl00cPHrptRecordctl02txtCredit(String ctl00cPHrptRecordctl02txtCredit)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHrptRecordctl02txtCreditElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02txtCredit", "Enter_ctl00cPHrptRecordctl02txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl02txtCreditElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02txtCredit", "Enter_ctl00cPHrptRecordctl02txtCredit failed. Unable to locate object: " + ctl00cPHrptRecordctl02txtCreditElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHrptRecordctl02txtCreditElem.toString());
         }

 		elem.sendKeys(ctl00cPHrptRecordctl02txtCredit);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHrptRecordctl02txtCredit " + ctl00cPHrptRecordctl02txtCredit);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHrptRecordctl02txtCredit " + ctl00cPHrptRecordctl02txtCredit);
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
        
		WebElement elem = getWebElement(Final_Accounts1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts1", "Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts1", "Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts1Elem.toString());

			Assert.fail("Unable to locate object: " + Final_Accounts1Elem.toString());
        }

		elem.click();
       ChangeWindow.tabswitch(m_Driver);   	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts1");
	}

     
	/**
 	 * Click  Settings 
     * @name Click  Settings 
     */
	public void Click__Settings_()
	{
        
		WebElement elem = getWebElement(_Settings_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Settings_", "Click__Settings_ failed. Unable to locate object: " + _Settings_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Settings_", "Click__Settings_ failed. Unable to locate object: " + _Settings_Elem.toString());

			Assert.fail("Unable to locate object: " + _Settings_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Settings_");

		TestModellerLogger.PassStep(m_Driver, "Click__Settings_");
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
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_ctl00cPHchkDirectorsYear");

		TestModellerLogger.PassStep(m_Driver, "Click_ctl00cPHchkDirectorsYear");
	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress1
     * @name Enter ctl00$cPH$txtAddress1
     */
 	public void Enter_ctl00cPHtxtAddress1(String ctl00cPHtxtAddress1)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress1);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress2
     * @name Enter ctl00$cPH$txtAddress2
     */
 	public void Enter_ctl00cPHtxtAddress2(String ctl00cPHtxtAddress2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress2);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress2 " + ctl00cPHtxtAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress2 " + ctl00cPHtxtAddress2);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress3
     * @name Enter ctl00$cPH$txtAddress3
     */
 	public void Enter_ctl00cPHtxtAddress3(String ctl00cPHtxtAddress3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress3", "Enter_ctl00cPHtxtAddress3 failed. Unable to locate object: " + ctl00cPHtxtAddress3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress3", "Enter_ctl00cPHtxtAddress3 failed. Unable to locate object: " + ctl00cPHtxtAddress3Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress3Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress3 " + ctl00cPHtxtAddress3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress3 " + ctl00cPHtxtAddress3);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress4
     * @name Enter ctl00$cPH$txtAddress4
     */
 	public void Enter_ctl00cPHtxtAddress4(String ctl00cPHtxtAddress4)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress4", "Enter_ctl00cPHtxtAddress4 failed. Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress4", "Enter_ctl00cPHtxtAddress4 failed. Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress4 " + ctl00cPHtxtAddress4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress4 " + ctl00cPHtxtAddress4);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtRegFAPostCode
     * @name Enter ctl00$cPH$txtRegFAPostCode
     */
 	public void Enter_ctl00cPHtxtRegFAPostCode(String ctl00cPHtxtRegFAPostCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtRegFAPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode", "Enter_ctl00cPHtxtRegFAPostCode failed. Unable to locate object: " + ctl00cPHtxtRegFAPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode", "Enter_ctl00cPHtxtRegFAPostCode failed. Unable to locate object: " + ctl00cPHtxtRegFAPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtRegFAPostCodeElem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtRegFAPostCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode " + ctl00cPHtxtRegFAPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode " + ctl00cPHtxtRegFAPostCode);
 	}

     
	/**
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(_Save_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save_", "Click__Save_ failed. Unable to locate object: " + _Save_Elem.toString());

			Assert.fail("Unable to locate object: " + _Save_Elem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click__Save_");

		TestModellerLogger.PassStep(m_Driver, "Click__Save_");
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