package pages;

import pages.BasePage;
import org.openqa.selenium.By;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/48128ac7-6dc9-4d0b-977b-2284fcf6da0a
@TestModellerModule(guid = "48128ac7-6dc9-4d0b-977b-2284fcf6da0a")
public class Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651 extends BasePage
{
	public Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PaswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By AgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By SearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By FilterTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LTD_Elem = By.xpath("//SPAN[contains(text(),'ABC LTD')]");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By _Accountant_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By CurrencyElem = By.xpath("//SELECT[@name='ctl00$cPH$ddCurrency']");

	private By DescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDescription']");

	private By Account1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount']");

	private By Account2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$AccountUC1$txtAccount']");

	private By Account3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$AccountUC1$txtAccount']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By _Settings_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By _Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By radPreparedByPositionsRight_for_ctl00cPHPreparedByElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By chkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By _Save__1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By _Final_Accounts_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Debit1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtDebit']");

	private By Debit2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$txtDebit']");

	private By Credit3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$txtCredit']");


	
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
 	 * Enter Pasword
     * @name Enter Pasword
     */
 	public void Enter_Pasword(String Pasword)
 	{
 	    
 		WebElement elem = getWebElement(PaswordElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Pasword", "Enter_Pasword failed. Unable to locate object: " + PaswordElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Pasword", "Enter_Pasword failed. Unable to locate object: " + PaswordElem.toString());

 			Assert.fail("Unable to locate object: " + PaswordElem.toString());
         }

 		elem.sendKeys(Pasword);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Pasword " + Pasword);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Pasword " + Pasword);
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
 	 * Enter AgentName
     * @name Enter AgentName
     */
 	public void Enter_AgentName(String AgentName)
 	{
 	    
 		try {
 			handlepopup();
			WebElement elem = getWebElement(AgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				Assert.fail("Unable to locate object: " + AgentNameElem.toString());
			 }
Thread.sleep(15000);
			elem.sendKeys(AgentName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AgentName " + AgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AgentName " + AgentName);
 	}

 	public boolean handlepopup()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(15000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"640d624e-1dd6-4e57-b57e-a9e9cdc710ae\"]"));
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
        
		WebElement elem = getWebElement(Search_button1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button1", "Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button1", "Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

			Assert.fail("Unable to locate object: " + Search_button1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button1");
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
        ChangeWindow.tabswitch(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}

     
	/**
 	 * Click  Clients 
     * @name Click  Clients 
     */
	public void Click__Clients_()
	{
        
		try {
			handlepopup1();
			WebElement elem = getWebElement(_Clients_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
			}
Thread.sleep(15000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Clients_");

		TestModellerLogger.PassStep(m_Driver, "Click__Clients_");
	}

	public boolean handlepopup1()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(15000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[text()='Close']"));
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
 	 * Enter SearchCompany
     * @name Enter SearchCompany
     */
 	public void Enter_SearchCompany(String SearchCompany)
 	{
 	    
 		try {
 			handlepopup2();
			WebElement elem = getWebElement(SearchCompanyElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchCompany", "Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchCompany", "Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

				Assert.fail("Unable to locate object: " + SearchCompanyElem.toString());
			 }
Thread.sleep(10000);
			elem.sendKeys(SearchCompany);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchCompany " + SearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchCompany " + SearchCompany);
 	}

 	public boolean handlepopup2()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(10000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"53116807-e35f-4327-8588-7bcee00c209d\"]"));
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
 	 * Select FilterType
     * @name Select FilterType
     */
    public void Select_FilterType(String FilterType)
 	{
 	    
 		WebElement elem = getWebElement(FilterTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FilterType", "Select_FilterType failed. Unable to locate object: " + FilterTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FilterType", "Select_FilterType failed. Unable to locate object: " + FilterTypeElem.toString());

 			Assert.fail("Unable to locate object: " + FilterTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(FilterType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_FilterType " + FilterType);

 		TestModellerLogger.PassStep(m_Driver, "Select_FilterType " + FilterType);
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
 	 * Click  ABC LTD 
     * @name Click  ABC LTD 
     */
	public void Click__ABC_LTD_()
	{
        
		WebElement elem = getWebElement(_ABC_LTD_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

			Assert.fail("Unable to locate object: " + _ABC_LTD_Elem.toString());
        }

		elem.click();
        ChangeWindow.tabswitch(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LTD_");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LTD_");
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
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(DateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

				Assert.fail("Unable to locate object: " + DateElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(Date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
 	}

    
	/**
 	 * Select Currency
     * @name Select Currency
     */
    public void Select_Currency(String Currency)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(CurrencyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Currency", "Select_Currency failed. Unable to locate object: " + CurrencyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Currency", "Select_Currency failed. Unable to locate object: " + CurrencyElem.toString());

 			Assert.fail("Unable to locate object: " + CurrencyElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Currency);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_Currency " + Currency);

 		TestModellerLogger.PassStep(m_Driver, "Select_Currency " + Currency);
 	}

      
	/**
 	 * Enter Description
     * @name Enter Description
     */
 	public void Enter_Description(String Description)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DescriptionElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Description", "Enter_Description failed. Unable to locate object: " + DescriptionElem.toString());

 			Assert.fail("Unable to locate object: " + DescriptionElem.toString());
         }

 		elem.sendKeys(Description);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Description " + Description);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Description " + Description);
 	}

      
	/**
 	 * Enter Account1
     * @name Enter Account1
     */
 	public void Enter_Account1(String ctl00cPHrptRecordctl00AccountUC1txtAccount)
 	{
 		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));
		//	m_Driver.findElement(By.xpath("//*[@id='select2-ctl00_cPH_rptRecord_ctl00_ltAccount-container']/span[1]")).click();
			WebElement elem = getWebElement(Account1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount failed. Unable to locate object: " + Account1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount failed. Unable to locate object: " + Account1Elem.toString());

				Assert.fail("Unable to locate object: " + Account1Elem.toString());
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
 	public void Enter_Debit1(String ctl00cPHrptRecordctl00txtCredit)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Debit1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit", "Enter_ctl00cPHrptRecordctl00txtCredit failed. Unable to locate object: " + Debit1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl00txtCredit", "Enter_ctl00cPHrptRecordctl00txtCredit failed. Unable to locate object: " + Debit1Elem.toString());

				Assert.fail("Unable to locate object: " + Debit1Elem.toString());
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
 	public void Enter_Account2(String ctl00cPHrptRecordctl01AccountUC1txtAccount)
 	{
 		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Account2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount failed. Unable to locate object: " + Account2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount failed. Unable to locate object: " + Account2Elem.toString());

				Assert.fail("Unable to locate object: " + Account2Elem.toString());
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
 	public void Enter_Debit2(String ctl00cPHrptRecordctl01txtCredit)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Debit2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit", "Enter_ctl00cPHrptRecordctl01txtCredit failed. Unable to locate object: " + Debit2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl01txtCredit", "Enter_ctl00cPHrptRecordctl01txtCredit failed. Unable to locate object: " + Debit2Elem.toString());

				Assert.fail("Unable to locate object: " + Debit2Elem.toString());
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
 	public void Enter_Account3(String ctl00cPHrptRecordctl02AccountUC1txtAccount)
 	{
 	    
		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Account3Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount failed. Unable to locate object: " + Account3Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount", "Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount failed. Unable to locate object: " + Account3Elem.toString());

				Assert.fail("Unable to locate object: " + Account3Elem.toString());
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
 	public void Enter_Credit3(String ctl00cPHrptRecordctl02txtDebit)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Credit3Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02txtDebit", "Enter_ctl00cPHrptRecordctl02txtDebit failed. Unable to locate object: " + Credit3Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHrptRecordctl02txtDebit", "Enter_ctl00cPHrptRecordctl02txtDebit failed. Unable to locate object: " + Credit3Elem.toString());

				Assert.fail("Unable to locate object: " + Credit3Elem.toString());
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
 	 * Click  Save 
     * @name Click  Save 
     */
	public void Click__Save_()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

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
 	 * Click  
     * @name Click  
     */
	public void Click__()
	{
        
		WebElement elem = getWebElement(_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__", "Click__ failed. Unable to locate object: " + _Elem.toString());

			Assert.fail("Unable to locate object: " + _Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__");

		TestModellerLogger.PassStep(m_Driver, "Click__");
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
 	 * Click  Final Accounts 
     * @name Click  Final Accounts 
     */
	public void Click__Final_Accounts_()
	{
        
		WebElement elem = getWebElement(_Final_Accounts_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Final_Accounts_", "Click__Final_Accounts_ failed. Unable to locate object: " + _Final_Accounts_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Final_Accounts_", "Click__Final_Accounts_ failed. Unable to locate object: " + _Final_Accounts_Elem.toString());

			Assert.fail("Unable to locate object: " + _Final_Accounts_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Final_Accounts_");

		TestModellerLogger.PassStep(m_Driver, "Click__Final_Accounts_");
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