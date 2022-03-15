package pages;

import pages.BasePage;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/7287c8e9-8ad4-46d3-aa33-d2aedd03a7a5
@TestModellerModule(guid = "7287c8e9-8ad4-46d3-aa33-d2aedd03a7a5")
public class FA775Newclient extends BasePage
{
	public FA775Newclient (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//*[@id=\"ctl00_cPHFilter_txtAgentName\"]");

	private By Search_button1Elem = By.xpath("//*[@id=\"ctl00_cPHFilter_btnSearch\"]");

	private By _Nakul_Elem = By.xpath("//*[@id=\"ctl00_divSubContent\"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");

	private By Add_client_linkElem = By.xpath("//LI[@class='header_add_btn dropdown']/A");

	private By _New_Client_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_btnAdd']");

	private By LimitedElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']");

	private By Limited_CompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By CompanyNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By RegDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By FirstName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By LastName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Save_Button1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");
	
	private By _Clients_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By SearchCompanyElem = By.xpath("//label[contains(.,'Client name:')]/../div/input");

	private By FilterTypeElem = By.xpath("//label[contains(.,'Status:')]/../select[1]");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");
	
	private By _New_Test_Ltd_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");
	
	private By _Accountant_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");
	
	private By Import_FileElem = By.xpath("//*[@id=\"ctl00_cPH_Divtab\"]/div/div/div[4]/div/div/div/div/table/tbody/tr[1]/td[2]/a");

	private By Attach1Elem = By.xpath("//A[contains(text(),'')]");

	private By Upload1Elem = By.xpath("//label[contains(.,'Upload CSV:')]/../div/input");

	private By Ledger_CodeElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By Account_NameElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By BalanceElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");

	private By Next_buttonElem = By.xpath("//A[@id='btnUpload']");
	
	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");
	
	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Income_StatementElem = By.xpath("//A[contains(text(),'Income Statement')]");

//	private By _ABC_LTD_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");


	
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
 			handlepopup();
			WebElement elem = getWebElement(AgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				Assert.fail("Unable to locate object: " + AgentNameElem.toString());
			 }
Thread.sleep(10000);
			elem.sendKeys(AgentName);
		} catch (Exception e) {
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
			Thread.sleep(5000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"25492b86-0b6f-4e30-a873-609b228d5e19\"]"));
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
 	 * Click Add_client_link
     * @name Click Add_client_link
     */
	public void Click_Add_client_link()
	{
        
		WebElement elem = getWebElement(Add_client_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_client_link", "Click_Add_client_link failed. Unable to locate object: " + Add_client_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_client_link", "Click_Add_client_link failed. Unable to locate object: " + Add_client_linkElem.toString());

			Assert.fail("Unable to locate object: " + Add_client_linkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_client_link");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_client_link");
	}

     
	/**
 	 * Click  New Client 
     * @name Click  New Client 
     */
	public void Click__New_Client_()
	{
        
		WebElement elem = getWebElement(_New_Client_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Client_", "Click__New_Client_ failed. Unable to locate object: " + _New_Client_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Client_", "Click__New_Client_ failed. Unable to locate object: " + _New_Client_Elem.toString());

			Assert.fail("Unable to locate object: " + _New_Client_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Client_");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Client_");
	}

     
	/**
 	 * Click Limited
     * @name Click Limited
     */
	public void Click_Limited()
	{
        
		WebElement elem = getWebElement(LimitedElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Limited", "Click_Limited failed. Unable to locate object: " + LimitedElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Limited", "Click_Limited failed. Unable to locate object: " + LimitedElem.toString());

			Assert.fail("Unable to locate object: " + LimitedElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Limited");

		TestModellerLogger.PassStep(m_Driver, "Click_Limited");
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
 	 * Enter CompanyName
     * @name Enter CompanyName
     */
 	public void Enter_CompanyName(String CompanyName)
 	{
 	    
 		WebElement elem = getWebElement(CompanyNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CompanyName", "Enter_CompanyName failed. Unable to locate object: " + CompanyNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CompanyName", "Enter_CompanyName failed. Unable to locate object: " + CompanyNameElem.toString());

 			Assert.fail("Unable to locate object: " + CompanyNameElem.toString());
         }

 		elem.sendKeys(CompanyName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CompanyName " + CompanyName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CompanyName " + CompanyName);
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
 	 * Enter FirstName1
     * @name Enter FirstName1
     */
 	public void Enter_FirstName1(String FirstName1)
 	{
 	    
 		WebElement elem = getWebElement(FirstName1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FirstName1", "Enter_FirstName1 failed. Unable to locate object: " + FirstName1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FirstName1", "Enter_FirstName1 failed. Unable to locate object: " + FirstName1Elem.toString());

 			Assert.fail("Unable to locate object: " + FirstName1Elem.toString());
         }

 		elem.sendKeys(FirstName1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FirstName1 " + FirstName1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FirstName1 " + FirstName1);
 	}

      
	/**
 	 * Enter LastName1
     * @name Enter LastName1
     */
 	public void Enter_LastName1(String LastName1)
 	{
 	    
 		WebElement elem = getWebElement(LastName1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName1", "Enter_LastName1 failed. Unable to locate object: " + LastName1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LastName1", "Enter_LastName1 failed. Unable to locate object: " + LastName1Elem.toString());

 			Assert.fail("Unable to locate object: " + LastName1Elem.toString());
         }

 		elem.sendKeys(LastName1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName1 " + LastName1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LastName1 " + LastName1);
 	}

     
	/**
 	 * Click Save_Button1
     * @name Click Save_Button1
     */
	public void Click_Save_Button1()
	{
        
		WebElement elem = getWebElement(Save_Button1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Button1", "Click_Save_Button1 failed. Unable to locate object: " + Save_Button1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Button1", "Click_Save_Button1 failed. Unable to locate object: " + Save_Button1Elem.toString());

			Assert.fail("Unable to locate object: " + Save_Button1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_Button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Button1");
	}
	
	public void Click__Clients_()
	{
        
		try {
			WebElement elem = getWebElement(_Clients_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
			}
Thread.sleep(5000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Clients_");

		TestModellerLogger.PassStep(m_Driver, "Click__Clients_");
	}

      
	/**
 	 * Enter SearchCompany
     * @name Enter SearchCompany
     */
 	public void Enter_SearchCompany(String SearchCompany)
 	{
 	    
 		try {
			WebElement elem = getWebElement(SearchCompanyElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchCompany", "Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchCompany", "Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

				Assert.fail("Unable to locate object: " + SearchCompanyElem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(SearchCompany);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchCompany " + SearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchCompany " + SearchCompany);
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
	public void Click__New_Test_Ltd_()
	{
        
		WebElement elem = getWebElement(_New_Test_Ltd_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Test_Ltd_", "Click__New_Test_Ltd_ failed. Unable to locate object: " + _New_Test_Ltd_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Test_Ltd_", "Click__New_Test_Ltd_ failed. Unable to locate object: " + _New_Test_Ltd_Elem.toString());

			Assert.fail("Unable to locate object: " + _New_Test_Ltd_Elem.toString());
        }

		elem.click();
        ChangeWindow.tabswitch(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click__New_Test_Ltd_");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Test_Ltd_");
	}
	
	public void Click__Accountant_()
	{
        
		try {
			WebElement elem = getWebElement(_Accountant_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Accountant_", "Click__Accountant_ failed. Unable to locate object: " + _Accountant_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Accountant_", "Click__Accountant_ failed. Unable to locate object: " + _Accountant_Elem.toString());

				Assert.fail("Unable to locate object: " + _Accountant_Elem.toString());
			}
Thread.sleep(3000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Accountant_");

		TestModellerLogger.PassStep(m_Driver, "Click__Accountant_");
	}

	public void Click_Import_File()
	{
        
		try {
			WebElement elem = getWebElement(Import_FileElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import_File", "Click_Import_File failed. Unable to locate object: " + Import_FileElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import_File", "Click_Import_File failed. Unable to locate object: " + Import_FileElem.toString());

				Assert.fail("Unable to locate object: " + Import_FileElem.toString());
			}
Thread.sleep(2000);	

elem.click();
ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Import_File");

		TestModellerLogger.PassStep(m_Driver, "Click_Import_File");
	}
     
	/**
 	 * Click Attach1
     * @name Click Attach1
     */
	public void Click_Attach1()
	{
        
		try {
			System.out.println();
			WebElement elem = getWebElement(Attach1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Attach1", "Click_Attach1 failed. Unable to locate object: " + Attach1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Attach1", "Click_Attach1 failed. Unable to locate object: " + Attach1Elem.toString());

				Assert.fail("Unable to locate object: " + Attach1Elem.toString());
			}
			m_Driver.switchTo().defaultContent();
			m_Driver.findElement(By.xpath("//*[@id=\"btnUploadeCSV\"]")).click();
			m_Driver.findElement(By.xpath("//*[@id=\"divSubContent\"]/div[4]/div[1]/div/div/div[1]/div")).click();
			Thread.sleep(2000);
			Robot robo= new Robot();
			StringSelection str=new StringSelection("C:\\Nomisma\\Nakul\\TestModeller-JavaSeleniumFramework-master\\Framework\\testdata\\TrialBalanceImportSample2017_1.csv");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

			robo.keyPress(KeyEvent.VK_ENTER);
			robo.keyRelease(KeyEvent.VK_ENTER);
			robo.keyPress(KeyEvent.VK_CONTROL);
			robo.keyPress(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_V);
			robo.keyRelease(KeyEvent.VK_CONTROL);
			

			robo.keyPress(KeyEvent.VK_ENTER);
			robo.delay(150);
			robo.keyRelease(KeyEvent.VK_ENTER);

			elem.click();
		} catch (HeadlessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Attach1");

		TestModellerLogger.PassStep(m_Driver, "Click_Attach1");
	}

      
	/**
 	 * Enter Upload1
     * @name Enter Upload1
     */
 	public void Enter_Upload1(String Upload1)
 	{
 	    
 		WebElement elem = getWebElement(Upload1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Upload1", "Enter_Upload1 failed. Unable to locate object: " + Upload1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Upload1", "Enter_Upload1 failed. Unable to locate object: " + Upload1Elem.toString());

 			Assert.fail("Unable to locate object: " + Upload1Elem.toString());
         }

 		elem.sendKeys(Upload1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Upload1 " + Upload1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Upload1 " + Upload1);
 	}

    
	/**
 	 * Select Ledger_Code
     * @name Select Ledger_Code
     */
    public void Select_Ledger_Code(String Ledger_Code)
 	{
 	    
 		WebElement elem = getWebElement(Ledger_CodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Ledger_Code", "Select_Ledger_Code failed. Unable to locate object: " + Ledger_CodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Ledger_Code", "Select_Ledger_Code failed. Unable to locate object: " + Ledger_CodeElem.toString());

 			Assert.fail("Unable to locate object: " + Ledger_CodeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Ledger_Code);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Ledger_Code " + Ledger_Code);

 		TestModellerLogger.PassStep(m_Driver, "Select_Ledger_Code " + Ledger_Code);
 	}

    
	/**
 	 * Select Account_Name
     * @name Select Account_Name
     */
    public void Select_Account_Name(String Account_Name)
 	{
 	    
 		WebElement elem = getWebElement(Account_NameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Account_Name", "Select_Account_Name failed. Unable to locate object: " + Account_NameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Account_Name", "Select_Account_Name failed. Unable to locate object: " + Account_NameElem.toString());

 			Assert.fail("Unable to locate object: " + Account_NameElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Account_Name);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Account_Name " + Account_Name);

 		TestModellerLogger.PassStep(m_Driver, "Select_Account_Name " + Account_Name);
 	}

    
	/**
 	 * Select Balance
     * @name Select Balance
     */
    public void Select_Balance(String Balance)
 	{
 	    
 		WebElement elem = getWebElement(BalanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Balance", "Select_Balance failed. Unable to locate object: " + BalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Balance", "Select_Balance failed. Unable to locate object: " + BalanceElem.toString());

 			Assert.fail("Unable to locate object: " + BalanceElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(Balance);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_Balance " + Balance);

 		TestModellerLogger.PassStep(m_Driver, "Select_Balance " + Balance);
 	}

     
	/**
 	 * Click Next_button
     * @name Click Next_button
     */
	public void Click_Next_button()
	{
        
		WebElement elem = getWebElement(Next_buttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Next_button", "Click_Next_button failed. Unable to locate object: " + Next_buttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Next_button", "Click_Next_button failed. Unable to locate object: " + Next_buttonElem.toString());

			Assert.fail("Unable to locate object: " + Next_buttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Next_button");

		TestModellerLogger.PassStep(m_Driver, "Click_Next_button");
	}
	
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
	
	public void Click_Final_Accounts2()
	{
        
		WebElement elem = getWebElement(Final_Accounts2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts1", "Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts1", "Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

			Assert.fail("Unable to locate object: " + Final_Accounts2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts1");
	}

     
	/**
 	 * Click Full Accounts
     * @name Click Full Accounts
     */
	public void Click_Full_Accounts()
	{
        
		try {
			WebElement elem = getWebElement(Full_AccountsElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Full_Accounts", "Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Full_Accounts", "Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

				Assert.fail("Unable to locate object: " + Full_AccountsElem.toString());
			}
Thread.sleep(2000);
			elem.click();
			String expected = m_Driver.findElement(By.xpath("//*[@id=\"disDiv\"]/div/div[9]/div/table[2]/tbody/tr[4]/td[5]/a/ix:nonfraction")).getText();
			Assert.assertEquals(expected, "282,745");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}

     
	/**
 	 * Click Income Statement
     * @name Click Income Statement
     */
	public void Click_Income_Statement()
	{
        
		try {
			WebElement elem = getWebElement(Income_StatementElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Statement", "Click_Income_Statement failed. Unable to locate object: " + Income_StatementElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Statement", "Click_Income_Statement failed. Unable to locate object: " + Income_StatementElem.toString());

				Assert.fail("Unable to locate object: " + Income_StatementElem.toString());
			}

			elem.click();
			Thread.sleep(5000);
			
			elem.click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement");
	}
}