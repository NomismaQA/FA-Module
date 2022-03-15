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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/5bffba83-74eb-4f2e-8701-61d09b9c15f0
@TestModellerModule(guid = "5bffba83-74eb-4f2e-8701-61d09b9c15f0")
public class Verify_default_status_of_members_interest37 extends BasePage
{
	public Verify_default_status_of_members_interest37 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By ctl00cPHpassElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By _Clients_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ctl00ctl00ParentContentcPHFilterddlTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LLPElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By _Settings_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Note_Templates_SettingsElem = By.xpath("//*[@id=\"ctl00_SideMenu1_liFinalAccounts\"]/ul/li[4]/a");

	private By Edit1Elem = By.xpath("//*[@id=\"ctl00_cPH_rptrDisplayRecords_ctl04_lnkEdit\"]/img");

	private By ctl00cPHddStatusElem = By.xpath("//SELECT[@name='ctl00$cPH$ddStatus']");

	private By SaveElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Statement_of_Financial_PositionElem = By.xpath("//A[contains(text(),'Statement of Financial Position')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=ad32c290-c10b-4a9b-bd06-932ebe3f1c0c");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=ad32c290-c10b-4a9b-bd06-932ebe3f1c0c");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=ad32c290-c10b-4a9b-bd06-932ebe3f1c0c");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=ad32c290-c10b-4a9b-bd06-932ebe3f1c0c";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=ad32c290-c10b-4a9b-bd06-932ebe3f1c0c")) {
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
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"b83e6fb6-2315-75b7-6980-b666b95c97d0\"]/div"));
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
Thread.sleep(1000);
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
			handlepopup1();
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
	
	public boolean handlepopup1()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(1000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"7dccf84d-d39e-de97-fc27-8b41c77a2724\"]"));
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
Thread.sleep(3000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        	

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
	public void Click__ABC_LLP()
	{
        
		WebElement elem = getWebElement(_ABC_LLPElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LLP", "Click__ABC_LLP failed. Unable to locate object: " + _ABC_LLPElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LLP", "Click__ABC_LLP failed. Unable to locate object: " + _ABC_LLPElem.toString());

			Assert.fail("Unable to locate object: " + _ABC_LLPElem.toString());
        }

		elem.click();
        ChangeWindow.tabswitch(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LLP");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LLP");
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
 	 * Click Note Templates Settings
     * @name Click Note Templates Settings
     */
	public void Click_Note_Templates_Settings()
	{
        
		WebElement elem = getWebElement(Note_Templates_SettingsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Note_Templates_Settings", "Click_Note_Templates_Settings failed. Unable to locate object: " + Note_Templates_SettingsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Note_Templates_Settings", "Click_Note_Templates_Settings failed. Unable to locate object: " + Note_Templates_SettingsElem.toString());

			Assert.fail("Unable to locate object: " + Note_Templates_SettingsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Note_Templates_Settings");

		TestModellerLogger.PassStep(m_Driver, "Click_Note_Templates_Settings");
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
 	 * Select ctl00$cPH$ddStatus
     * @name Select ctl00$cPH$ddStatus
     */
    public void Select_ctl00cPHddStatus(String ctl00cPHddStatus)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHddStatusElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddStatus", "Select_ctl00cPHddStatus failed. Unable to locate object: " + ctl00cPHddStatusElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddStatus", "Select_ctl00cPHddStatus failed. Unable to locate object: " + ctl00cPHddStatusElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddStatusElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddStatus);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddStatus " + ctl00cPHddStatus);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddStatus " + ctl00cPHddStatus);
 	}

     
	/**
 	 * Click Save
     * @name Click Save
     */
	public void Click_Save()
	{
        
		WebElement elem = getWebElement(SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save", "Click_Save failed. Unable to locate object: " + SaveElem.toString());

			Assert.fail("Unable to locate object: " + SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save");

		TestModellerLogger.PassStep(m_Driver, "Click_Save");
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
String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[14]/div/table[2]/tbody/tr[15]/td[1]")).getText();
Assert.assertEquals(expected, "Member's other interests");
	
	
	

		ExtentReportManager.passStep(m_Driver, "Click_Statement_of_Financial_Position");

		TestModellerLogger.PassStep(m_Driver, "Click_Statement_of_Financial_Position");
	}
}