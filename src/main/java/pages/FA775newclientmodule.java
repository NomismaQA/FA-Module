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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3740c500-9a92-49df-9402-905ec33fbd35
@TestModellerModule(guid = "3740c500-9a92-49df-9402-905ec33fbd35")
public class FA775newclientmodule extends BasePage
{
	public FA775newclientmodule (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//*[@id=\"ctl00_cPHFilter_txtAgentName\"]");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//*[@id=\"ctl00_divSubContent\"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");
	
	private By _Clients_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By SearchCompanyElem = By.xpath("//label[contains(.,'Client name:')]/../div/input");

	private By FilterTypeElem = By.xpath("//label[contains(.,'Status:')]/../select[1]");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LTD_Elem = By.xpath("//SPAN[contains(text(),'ABC LTD')]");
	
	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");
	
	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");
	
	private By Income_Statement_PageElem = By.xpath("//A[contains(text(),'Income Statement')]");
	
	private By Add_new_client_linkElem = By.xpath("//LI[@class='header_add_btn dropdown']/A");
	
	private By _New_Client_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_btnAdd']");

	private By Add_New_ClientElem = By.xpath("//*[@id=\"aspnetForm\"]/main/header/div/div[2]/ul/li[1]/a/img");

	private By LimitedElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']");

	private By Limited_CompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By CompanyNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By RegDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By FirstName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By LastName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Save_ButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By Settings1Elem = By.xpath("//A[contains(text(),'Settings')]");

	private By Accounting_PeriodElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbAccPeriod']");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By Add_Previous_YearElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbAccPeriod_btnPreiodAdd']");

	private By Import_FileElem = By.xpath("//A[contains(text(),'')]");

	private By Attach1Elem = By.xpath("//label[contains(.,'Upload CSV:')]/../div/input");

	private By Upload_ButtonElem = By.xpath("//INPUT[@name='ctl00$cPH$btnUploadeCSV']");


	
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
Thread.sleep(5000);
//			elem.sendKeys(AgentName);
jsExec.executeScript("arguments[0].value='"+AgentName+"';",elem);
			
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
			Thread.sleep(10000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id='25492b86-0b6f-4e30-a873-609b228d5e19']"));
			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			System.out.println(true);
			return true;
		} 
		catch (Exception e) 
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

	public void Click_Add_new_client_link()
	{
        
		try {
			handlepopup2();
			WebElement elem = getWebElement(Add_new_client_linkElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_new_client_link", "Click_Add_new_client_link failed. Unable to locate object: " + Add_new_client_linkElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_new_client_link", "Click_Add_new_client_link failed. Unable to locate object: " + Add_new_client_linkElem.toString());

				Assert.fail("Unable to locate object: " + Add_new_client_linkElem.toString());
			}
Thread.sleep(5000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_new_client_link");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_new_client_link");
	}
	
	public boolean handlepopup2()
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
 	 * Click Add_New_Client
     * @name Click Add_New_Client
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
 	 * Click Save_Button
     * @name Click Save_Button
     */
	public void Click_Save_Button()
	{
        
		WebElement elem = getWebElement(Save_ButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Button", "Click_Save_Button failed. Unable to locate object: " + Save_ButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Button", "Click_Save_Button failed. Unable to locate object: " + Save_ButtonElem.toString());

			Assert.fail("Unable to locate object: " + Save_ButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_Button");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Button");
	}

     
	/**
 	 * Click Settings1
     * @name Click Settings1
     */
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
 	 * Click Accounting Period
     * @name Click Accounting Period
     */
	public void Click_Accounting_Period()
	{
        
		WebElement elem = getWebElement(Accounting_PeriodElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounting_Period", "Click_Accounting_Period failed. Unable to locate object: " + Accounting_PeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounting_Period", "Click_Accounting_Period failed. Unable to locate object: " + Accounting_PeriodElem.toString());

			Assert.fail("Unable to locate object: " + Accounting_PeriodElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Accounting_Period");

		TestModellerLogger.PassStep(m_Driver, "Click_Accounting_Period");
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
 	 * Click Add Previous Year
     * @name Click Add Previous Year
     */
	public void Click_Add_Previous_Year()
	{
        
		WebElement elem = getWebElement(Add_Previous_YearElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Previous_Year", "Click_Add_Previous_Year failed. Unable to locate object: " + Add_Previous_YearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Previous_Year", "Click_Add_Previous_Year failed. Unable to locate object: " + Add_Previous_YearElem.toString());

			Assert.fail("Unable to locate object: " + Add_Previous_YearElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Previous_Year");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Previous_Year");
	}

     
	/**
 	 * Click Import_File
     * @name Click Import_File
     */
	public void Click_Import_File()
	{
        
		WebElement elem = getWebElement(Import_FileElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import_File", "Click_Import_File failed. Unable to locate object: " + Import_FileElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import_File", "Click_Import_File failed. Unable to locate object: " + Import_FileElem.toString());

			Assert.fail("Unable to locate object: " + Import_FileElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Import_File");

		TestModellerLogger.PassStep(m_Driver, "Click_Import_File");
	}

      
	/**
 	 * Enter Attach1
     * @name Enter Attach1
     */
 	public void Enter_Attach1(String Attach1)
 	{
 	    
 		WebElement elem = getWebElement(Attach1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Attach1", "Enter_Attach1 failed. Unable to locate object: " + Attach1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Attach1", "Enter_Attach1 failed. Unable to locate object: " + Attach1Elem.toString());

 			Assert.fail("Unable to locate object: " + Attach1Elem.toString());
         }

 		elem.sendKeys(Attach1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Attach1 " + Attach1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Attach1 " + Attach1);
 	}

     
	/**
 	 * Click Upload_Button
     * @name Click Upload_Button
     */
	public void Click_Upload_Button()
	{
        
		WebElement elem = getWebElement(Upload_ButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Upload_Button", "Click_Upload_Button failed. Unable to locate object: " + Upload_ButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Upload_Button", "Click_Upload_Button failed. Unable to locate object: " + Upload_ButtonElem.toString());

			Assert.fail("Unable to locate object: " + Upload_ButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Upload_Button");

		TestModellerLogger.PassStep(m_Driver, "Click_Upload_Button");
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
	public void Click__ABC_LTD_()
	{
        
		try {
			WebElement elem = getWebElement(_ABC_LTD_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				Assert.fail("Unable to locate object: " + _ABC_LTD_Elem.toString());
			}
Thread.sleep(3000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LTD_");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LTD_");
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
	
	public void Click_Income_Statement_Page()
	{
        
		try {
			WebElement elem = getWebElement(Income_Statement_PageElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Statement_Page", "Click_Income_Statement_Page failed. Unable to locate object: " + Income_Statement_PageElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Statement_Page", "Click_Income_Statement_Page failed. Unable to locate object: " + Income_Statement_PageElem.toString());

				Assert.fail("Unable to locate object: " + Income_Statement_PageElem.toString());
			}
Thread.sleep(5000);
			elem.click();
			String expected = m_Driver.findElement(By.xpath("//*[@id=\"disDiv\"]/div/div[9]/div/table[2]/tbody/tr[4]/td[5]/a")).getText();
			Assert.assertEquals(expected, "282,745");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement_Page");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement_Page");
	}
}