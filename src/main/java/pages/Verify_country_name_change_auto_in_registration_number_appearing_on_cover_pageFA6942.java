package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/1db209a5-6efb-4853-be2b-17afa98f4df7
@TestModellerModule(guid = "1db209a5-6efb-4853-be2b-17afa98f4df7")
public class Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942 extends BasePage
{
	public Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//*[@id=\"ctl00_cPHFilter_txtAgentName\"]");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By SearchCompanyElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany\"]");

	private By FilterTypeElem = By.xpath("//label[contains(.,'Status:')]/../select[1]");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LTD_Elem = By.xpath("//SPAN[contains(text(),'ABC LTD')]");

	private By Settings1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_AccountMenu\"]/li[12]/a/span");

	private By GeneralElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbGeneral']");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress1Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress1']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress2']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress3Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress3']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress4']");

	private By ctl00cPHtbContainerTbGeneraltxtPostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtPostCode']");

	private By ctl00cPHtbContainerTbGeneraltxtRegNoElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtRegNo']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By Settings2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ReportingStdTypeElem = By.xpath("//label[contains(.,'Company Reporting Standard')]/../div/select");

	private By PositionsRightElem = By.xpath("//label[contains(.,'Position of Accountant Details Text in Report')]/../div/input[3]");

	private By chkDirectorsYearElem = By.xpath("//label[contains(.,'Include directors who served during the year ?')]/../div/input");

	private By Save2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");


	
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
 	 * Enter AgentName
     * @name Enter AgentName
     */
 	public void Enter_AgentName(String AgentName)
 	{
 	    
 		try {
			WebElement elem = getWebElement(AgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				Assert.fail("Unable to locate object: " + AgentNameElem.toString());
			 }
Thread.sleep(2000);
			elem.sendKeys(AgentName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AgentName " + AgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AgentName " + AgentName);
 	}

     
	/**
 	 * Click Search_button1
     * @name Click Search_button1
     */
	public void Click_Search_button1()
	{
        
		try {
			handlepopup();
			WebElement elem = getWebElement(Search_button1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button1", "Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button1", "Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

				Assert.fail("Unable to locate object: " + Search_button1Elem.toString());
			}
Thread.sleep(2000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button1");
	}

	public boolean handlepopup()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(5000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"8c68201b-8c10-4105-b35a-ae7726707716\"]"));
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
Thread.sleep(2000);
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
        
		try {
			handlepopup1();
			WebElement elem = getWebElement(_Clients_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
			}
Thread.sleep(2000);
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
			Thread.sleep(5000);
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
Thread.sleep(2000);
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
			Thread.sleep(5000);
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
        
		try {
			WebElement elem = getWebElement(_ABC_LTD_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				Assert.fail("Unable to locate object: " + _ABC_LTD_Elem.toString());
			}
Thread.sleep(2000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LTD_");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LTD_");
	}

	public void Click_Settings1()
	{
        
		WebElement elem = getWebElement(Settings1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings1", "Click_Settings1 failed. Unable to locate object: " + Settings1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings1", "Click_Settings1 failed. Unable to locate object: " + Settings1Elem.toString());

			Assert.fail("Unable to locate object: " + Settings1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings1");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings1");
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
 		elem.clear();
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
 		elem.clear();
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
 		elem.clear();
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
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress4);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

 		
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
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtPostCode);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode " + ctl00cPHtbContainerTbGeneraltxtPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode " + ctl00cPHtbContainerTbGeneraltxtPostCode);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtRegNo
	 * @param sData 
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtRegNo
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(String sData)
 	{
 	    
 		try {
			WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtRegNoElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo", "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo", "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());
			 }
			elem.clear();
Thread.sleep(2000);
			elem.sendKeys("NI121212");
			Thread.sleep(3000);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo ");

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo ");
 	}

     
	/**
 	 * Click Save1
     * @name Click Save1
     */
	public void Click_Save1()
	{
        
		WebElement elem = getWebElement(Save1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

			Assert.fail("Unable to locate object: " + Save1Elem.toString());
        }

		elem.click();
          	

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
		String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[2]/div/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(expected, "Company Registration Number : NI121212 (Northern Ireland)");  	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}