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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/84492e7e-749d-4697-bafa-2ee7949db0cd
@TestModellerModule(guid = "84492e7e-749d-4697-bafa-2ee7949db0cd")
public class Verify_accountants_appearing_on_company_information_pageFA69620 extends BasePage
{
	public Verify_accountants_appearing_on_company_information_pageFA69620 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

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

	private By Settings1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Add_Accountant_linkElem = By.xpath("//A[@id='A1']");

	private By AccountantNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAccountantName']");

	private By AccountantsDescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAccountantsDescription']");

	private By AddressLine1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddressLine1']");

	private By CityTownElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCityTown']");

	private By PostCode1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtPostCode']");

	private By Set_To_Comapany_LevelElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By PositionsRightElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By chkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By _Save_Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58";

        if (!currentUrl.equals("http://sandbox3.nomismasolution.co.uk/ssoui/Signin.aspx?token=f5b917d4-181c-41a1-8ab7-ae93557a5a58")) {
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
        
		try {
			WebElement elem = getWebElement(_Nakul_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				Assert.fail("Unable to locate object: " + _Nakul_Elem.toString());
			}
Thread.sleep(3000);
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
        
		try {
			WebElement elem = getWebElement(_ABC_LTD_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LTD_", "Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				Assert.fail("Unable to locate object: " + _ABC_LTD_Elem.toString());
			}
Thread.sleep(5000);
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
Thread.sleep(5000);
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
 	 * Click Add_Accountant_link
     * @name Click Add_Accountant_link
     */
	public void Click_Add_Accountant_link()
	{
        
		WebElement elem = getWebElement(Add_Accountant_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Accountant_link", "Click_Add_Accountant_link failed. Unable to locate object: " + Add_Accountant_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Accountant_link", "Click_Add_Accountant_link failed. Unable to locate object: " + Add_Accountant_linkElem.toString());

			Assert.fail("Unable to locate object: " + Add_Accountant_linkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Accountant_link");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Accountant_link");
	}

      
	/**
 	 * Enter AccountantName
     * @name Enter AccountantName
     */
 	public void Enter_AccountantName(String AccountantName)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(AccountantNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AccountantName", "Enter_AccountantName failed. Unable to locate object: " + AccountantNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AccountantName", "Enter_AccountantName failed. Unable to locate object: " + AccountantNameElem.toString());

				Assert.fail("Unable to locate object: " + AccountantNameElem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(AccountantName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AccountantName " + AccountantName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AccountantName " + AccountantName);
 	}

      
	/**
 	 * Enter AccountantsDescription
     * @name Enter AccountantsDescription
     */
 	public void Enter_AccountantsDescription(String AccountantsDescription)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(AccountantsDescriptionElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AccountantsDescription", "Enter_AccountantsDescription failed. Unable to locate object: " + AccountantsDescriptionElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AccountantsDescription", "Enter_AccountantsDescription failed. Unable to locate object: " + AccountantsDescriptionElem.toString());

				Assert.fail("Unable to locate object: " + AccountantsDescriptionElem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(AccountantsDescription);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AccountantsDescription " + AccountantsDescription);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AccountantsDescription " + AccountantsDescription);
 	}

      
	/**
 	 * Enter AddressLine1
     * @name Enter AddressLine1
     */
 	public void Enter_AddressLine1(String AddressLine1)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(AddressLine1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AddressLine1", "Enter_AddressLine1 failed. Unable to locate object: " + AddressLine1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AddressLine1", "Enter_AddressLine1 failed. Unable to locate object: " + AddressLine1Elem.toString());

				Assert.fail("Unable to locate object: " + AddressLine1Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(AddressLine1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AddressLine1 " + AddressLine1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AddressLine1 " + AddressLine1);
 	}

      
	/**
 	 * Enter CityTown
     * @name Enter CityTown
     */
 	public void Enter_CityTown(String CityTown)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(CityTownElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_CityTown", "Enter_CityTown failed. Unable to locate object: " + CityTownElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_CityTown", "Enter_CityTown failed. Unable to locate object: " + CityTownElem.toString());

				Assert.fail("Unable to locate object: " + CityTownElem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(CityTown);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_CityTown " + CityTown);

  		TestModellerLogger.PassStep(m_Driver, "Enter_CityTown " + CityTown);
 	}

      
	/**
 	 * Enter PostCode1
     * @name Enter PostCode1
     */
 	public void Enter_PostCode1(String PostCode1)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(PostCode1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode1", "Enter_PostCode1 failed. Unable to locate object: " + PostCode1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode1", "Enter_PostCode1 failed. Unable to locate object: " + PostCode1Elem.toString());

				Assert.fail("Unable to locate object: " + PostCode1Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(PostCode1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode1 " + PostCode1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode1 " + PostCode1);
 	}

     
	/**
 	 * Click Set To Comapany Level
     * @name Click Set To Comapany Level
     */
	public void Click_Set_To_Comapany_Level()
	{
        
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(Set_To_Comapany_LevelElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Set_To_Comapany_Level", "Click_Set_To_Comapany_Level failed. Unable to locate object: " + Set_To_Comapany_LevelElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Set_To_Comapany_Level", "Click_Set_To_Comapany_Level failed. Unable to locate object: " + Set_To_Comapany_LevelElem.toString());

				Assert.fail("Unable to locate object: " + Set_To_Comapany_LevelElem.toString());
			}
Thread.sleep(3000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Set_To_Comapany_Level");

		TestModellerLogger.PassStep(m_Driver, "Click_Set_To_Comapany_Level");
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
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(ReportingStdTypeElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ReportingStdType", "Select_ReportingStdType failed. Unable to locate object: " + ReportingStdTypeElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ReportingStdType", "Select_ReportingStdType failed. Unable to locate object: " + ReportingStdTypeElem.toString());

				Assert.fail("Unable to locate object: " + ReportingStdTypeElem.toString());
			 }

			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(ReportingStdType);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
        
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(PositionsRightElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_PositionsRight", "Click_PositionsRight failed. Unable to locate object: " + PositionsRightElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_PositionsRight", "Click_PositionsRight failed. Unable to locate object: " + PositionsRightElem.toString());

				Assert.fail("Unable to locate object: " + PositionsRightElem.toString());
			}
Thread.sleep(2000);
			elem.click();
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_chkDirectorsYear");

		TestModellerLogger.PassStep(m_Driver, "Click_chkDirectorsYear");
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
		String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[6]/div/table[2]/tbody/tr[51]")).getText();
		Assert.assertEquals(expected, "Accountants : ABC Associates");  	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}