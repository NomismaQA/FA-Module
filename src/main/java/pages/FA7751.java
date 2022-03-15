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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/194f4e62-2bd7-47bc-9e81-629eea578c90
@TestModellerModule(guid = "194f4e62-2bd7-47bc-9e81-629eea578c90")
public class FA7751 extends BasePage
{
	public FA7751 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//*[@id=\"ctl00_cPHFilter_txtAgentName\"]");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By _Clients_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By SearchCompanyElem = By.xpath("//label[contains(.,'Client name:')]/../div/input");

	private By FilterTypeElem = By.xpath("//label[contains(.,'Status:')]/../select[1]");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LTD_Elem = By.xpath("//SPAN[contains(text(),'ABC LTD')]");

	private By _Accountant_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");

	private By Attach1Elem = By.xpath("//A[contains(text(),'')]");

	private By Upload1Elem = By.xpath("//label[contains(.,'Upload CSV:')]/../div/input");

	private By Ledger_CodeElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl02$ddlMappedCol']");

	private By Account_NameElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl03$ddlMappedCol']");

	private By BalanceElem = By.xpath("//SELECT[@name='ctl00$cPH$gvCSVColumn$ctl04$ddlMappedCol']");

	private By Next_buttonElem = By.xpath("//A[@id='btnUpload']");

	private By Select_DateElem = By.xpath("//label[contains(.,'Date:')]/../div/input");

	private By Import_buttonElem = By.xpath("//A[@id='ctl00_cpHFooter_btnImport']");
	
	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By _Settings_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ReportingStdTypeElem = By.xpath("//label[contains(.,'Company Reporting Standard')]/../div/select");

	private By PositionsRightElem = By.xpath("//label[contains(.,'Position of Accountant Details Text in Report')]/../div/input[3]");

	private By chkDirectorsYearElem = By.xpath("//label[contains(.,'Include directors who served during the year ?')]/../div/input");

	private By Save_ButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Income_StatementElem = By.xpath("//A[contains(text(),'Income Statement')]");

	private By Select_Financial_YearElem = By.xpath("//SELECT[@name='ctl00$ddlFinancialYear']");

	private By Ledger_Code_ValueElem = By.xpath("/html/body/form/main/div/div[3]/div/div[2]/div/div/div[10]/div/table[2]/tbody/tr[4]/td[5]/a");


	
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
			Thread.sleep(5000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"25492b86-0b6f-4e30-a873-609b228d5e19\"]"));
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
Thread.sleep(3000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Accountant_");

		TestModellerLogger.PassStep(m_Driver, "Click__Accountant_");
	}

     
	/**
 	 * Click Attach1
     * @name Click Attach1
     */
	public void Click_Attach1()
	{
        
		WebElement elem = getWebElement(Attach1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Attach1", "Click_Attach1 failed. Unable to locate object: " + Attach1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Attach1", "Click_Attach1 failed. Unable to locate object: " + Attach1Elem.toString());

			Assert.fail("Unable to locate object: " + Attach1Elem.toString());
        }

		elem.click();
          	

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

      
	/**
 	 * Enter Select_Date
     * @name Enter Select_Date
     */
 	public void Enter_Select_Date(String Select_Date)
 	{
 	    
 		try {
			WebElement elem = getWebElement(Select_DateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Select_Date", "Enter_Select_Date failed. Unable to locate object: " + Select_DateElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Select_Date", "Enter_Select_Date failed. Unable to locate object: " + Select_DateElem.toString());

				Assert.fail("Unable to locate object: " + Select_DateElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(Select_Date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Select_Date " + Select_Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Select_Date " + Select_Date);
 	}

     
	/**
 	 * Click Import_button
     * @name Click Import_button
     */
	public void Click_Import_button()
	{
        
		WebElement elem = getWebElement(Import_buttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Import_button", "Click_Import_button failed. Unable to locate object: " + Import_buttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Import_button", "Click_Import_button failed. Unable to locate object: " + Import_buttonElem.toString());

			Assert.fail("Unable to locate object: " + Import_buttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Import_button");

		TestModellerLogger.PassStep(m_Driver, "Click_Import_button");
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
 	 * Click Save_Button
     * @name Click Save_Button
     */
	public void Click_Save_Button()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Save_ButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Button", "Click_Save_Button failed. Unable to locate object: " + Save_ButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Button", "Click_Save_Button failed. Unable to locate object: " + Save_ButtonElem.toString());

			Assert.fail("Unable to locate object: " + Save_ButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_Button");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Button");
	}

     
	/**
 	 * Click Final Accounts1
     * @name Click Final Accounts1
     */
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
//		String expected = m_Driver.findElement(By.xpath("//*[@id=\"disDiv\"]/div/div[9]/div/table[2]/tbody/tr[4]/td[5]/a")).getText();
//		Assert.assertEquals(expected, "282,745");
//		int a=Integer.parseInt(expected);
//		System.out.println(a);
//		Assert.assertEquals(a, expected);
          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}

     
	/**
 	 * Click Income Statement
     * @name Click Income Statement
     */
//	public void Click_Income_Statement()
//	{
//        
//		WebElement elem = getWebElement(Income_StatementElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Statement", "Click_Income_Statement failed. Unable to locate object: " + Income_StatementElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Statement", "Click_Income_Statement failed. Unable to locate object: " + Income_StatementElem.toString());
//
//			Assert.fail("Unable to locate object: " + Income_StatementElem.toString());
//        }
//
//		elem.click();
//		  	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement");
//	}

    
	/**
 	 * Select Select_Financial_Year
     * @name Select Select_Financial_Year
     */
//    public void Select_Select_Financial_Year(String Select_Financial_Year)
// 	{
// 	    
// 		try {
//			WebElement elem = getWebElement(Select_Financial_YearElem);
//
//			if (elem == null) {
//				ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Select_Financial_Year", "Select_Select_Financial_Year failed. Unable to locate object: " + Select_Financial_YearElem.toString());
//
//				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Select_Financial_Year", "Select_Select_Financial_Year failed. Unable to locate object: " + Select_Financial_YearElem.toString());
//
//				Assert.fail("Unable to locate object: " + Select_Financial_YearElem.toString());
//			 }
//
//			
//			Select dropdown = new Select(elem);
//			m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ddlFinancialYear\"]")).click();
//			m_Driver.findElement(By.xpath("//*[@id=\"ctl00_ddlFinancialYear\"]/option[2]")).click();
//
//			dropdown.selectByVisibleText(Select_Financial_Year);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
// 		
// 		
// 		ExtentReportManager.passStep(m_Driver, "Select_Select_Financial_Year " + Select_Financial_Year);
//
// 		TestModellerLogger.PassStep(m_Driver, "Select_Select_Financial_Year " + Select_Financial_Year);
// 	}

     
//	/**
// 	 * Click Ledger_Code_Value
//     * @name Click Ledger_Code_Value
//     */
//	public void Click_Ledger_Code_Value()
//	{
//        
//		WebElement elem = getWebElement(Ledger_Code_ValueElem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Ledger_Code_Value", "Click_Ledger_Code_Value failed. Unable to locate object: " + Ledger_Code_ValueElem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Ledger_Code_Value", "Click_Ledger_Code_Value failed. Unable to locate object: " + Ledger_Code_ValueElem.toString());
//
//			Assert.fail("Unable to locate object: " + Ledger_Code_ValueElem.toString());
//        }
//
//		elem.click();
//          	
//
//		ExtentReportManager.passStep(m_Driver, "Click_Ledger_Code_Value");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Ledger_Code_Value");
//	}
}