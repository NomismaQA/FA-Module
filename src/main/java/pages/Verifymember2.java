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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e9629dca-e063-443b-aec0-6c6fc847e6f5
@TestModellerModule(guid = "e9629dca-e063-443b-aec0-6c6fc847e6f5")
public class Verifymember2 extends BasePage
{
	public Verifymember2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By ClientsElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ctl00ctl00ParentContentcPHFilterddlTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _Test_CoElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");

	private By Settings1Elem = By.xpath("//SPAN[contains(text(),'Settings')]");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By MembersElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbSoleTrader']");

	private By Add_MembersElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbSoleTrader_btnempAdd']");

	private By ctl00cPHtxtFirstNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFirstName']");

	private By ctl00cPHtxtLastNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtLastName']");

	private By ctl00cPHtxtAddress1Elem = By.xpath("//*[@class='col-sm-7 col-xs-7']/input[@name='ctl00$cPH$txtAddress1']");

	private By ctl00cPHtxtAddress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By ctl00cPHtxtAddress3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By ctl00cPHtxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By ctl00cPHtxtPersonJoiningDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPersonJoiningDate']");

	private By ctl00cPHtxtPersonLeavingDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPersonLeavingDate']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_AccountsElem = By.xpath("//*[@id=\"ctl00_SideMenu1_FA\"]/a/span");

	private By Settings2Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_liSettings\"]/ul/li[2]/a");

	private By Accounts_SettingsElem = By.xpath("//*[@id=\\\"ctl00_SideMenu1_liSettings\\\"]/ul/li[2]/a");

	private By Edit2Elem = By.xpath("//*[@id=\"ctl00_cPH_linkFinalAccount\"]");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By Save2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_liFinalAccounts\"]/a/span");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=7d90652c-19ab-48cf-bfed-16f45e5f7540");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=7d90652c-19ab-48cf-bfed-16f45e5f7540");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=7d90652c-19ab-48cf-bfed-16f45e5f7540");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=7d90652c-19ab-48cf-bfed-16f45e5f7540";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=7d90652c-19ab-48cf-bfed-16f45e5f7540")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Username
     * @name Enter Username
     */
 	public void Enter_Username(String Username)
 	{
 	    
 		try {
			WebElement elem = getWebElement(UsernameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

				Assert.fail("Unable to locate object: " + UsernameElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(Username);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);
 	}

      
	/**
 	 * Enter Password
     * @name Enter Password
     */
 	public void Enter_Password(String Password)
 	{
 	    
 		try {
			WebElement elem = getWebElement(PasswordElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password", "Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

				Assert.fail("Unable to locate object: " + PasswordElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(Password);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
 	}

     
	/**
 	 * Click Login_Button
     * @name Click Login_Button
     */
	public void Click_Login_Button()
	{
        
		try {
			WebElement elem = getWebElement(Login_ButtonElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login_Button", "Click_Login_Button failed. Unable to locate object: " + Login_ButtonElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login_Button", "Click_Login_Button failed. Unable to locate object: " + Login_ButtonElem.toString());

				Assert.fail("Unable to locate object: " + Login_ButtonElem.toString());
			}

			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

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
 	 * Click Clients
     * @name Click Clients
     */
	public void Click_Clients()
	{
        
		try {
			WebElement elem = getWebElement(ClientsElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

				Assert.fail("Unable to locate object: " + ClientsElem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clients");

		TestModellerLogger.PassStep(m_Driver, "Click_Clients");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(String ctl00ctl00ParentContentcPHFiltertxtSearchCompany)
 	{
 	    
 		try {
			WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

				Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlType
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlType
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlType(String ctl00ctl00ParentContentcPHFilterddlType)
 	{
 	    
 		try {
			WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlTypeElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType", "Select_ctl00ctl00ParentContentcPHFilterddlType failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType", "Select_ctl00ctl00ParentContentcPHFilterddlType failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());

				Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());
			 }

			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlType);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType " + ctl00ctl00ParentContentcPHFilterddlType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType " + ctl00ctl00ParentContentcPHFilterddlType);
 	}

     
	/**
 	 * Click Search_button2
     * @name Click Search_button2
     */
	public void Click_Search_button2()
	{
        
		try {
			WebElement elem = getWebElement(Search_button2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button2", "Click_Search_button2 failed. Unable to locate object: " + Search_button2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button2", "Click_Search_button2 failed. Unable to locate object: " + Search_button2Elem.toString());

				Assert.fail("Unable to locate object: " + Search_button2Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button2");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button2");
	}

     
	/**
 	 * Click  Test & Co
     * @name Click  Test & Co
     */
	public void Click__Test_Co()
	{
        
		try {
			WebElement elem = getWebElement(_Test_CoElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Test_Co", "Click__Test_Co failed. Unable to locate object: " + _Test_CoElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Test_Co", "Click__Test_Co failed. Unable to locate object: " + _Test_CoElem.toString());

				Assert.fail("Unable to locate object: " + _Test_CoElem.toString());
			}
Thread.sleep(1000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Test_Co");

		TestModellerLogger.PassStep(m_Driver, "Click__Test_Co");
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
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings1");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings1");
	}

     
	/**
 	 * Click Edit1
     * @name Click Edit1
     */
	public void Click_Edit1()
	{
        
		try {
			WebElement elem = getWebElement(Edit1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit1", "Click_Edit1 failed. Unable to locate object: " + Edit1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit1", "Click_Edit1 failed. Unable to locate object: " + Edit1Elem.toString());

				Assert.fail("Unable to locate object: " + Edit1Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit1");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit1");
	}

     
	/**
 	 * Click Members
     * @name Click Members
     */
	public void Click_Members()
	{
        
		try {
			WebElement elem = getWebElement(MembersElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Members", "Click_Members failed. Unable to locate object: " + MembersElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Members", "Click_Members failed. Unable to locate object: " + MembersElem.toString());

				Assert.fail("Unable to locate object: " + MembersElem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Members");

		TestModellerLogger.PassStep(m_Driver, "Click_Members");
	}

     
	/**
 	 * Click Add Members
     * @name Click Add Members
     */
	public void Click_Add_Members()
	{
        
		try {
			WebElement elem = getWebElement(Add_MembersElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Members", "Click_Add_Members failed. Unable to locate object: " + Add_MembersElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Members", "Click_Add_Members failed. Unable to locate object: " + Add_MembersElem.toString());

				Assert.fail("Unable to locate object: " + Add_MembersElem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Members");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Members");
	}

      
	/**
 	 * Enter ctl00$cPH$txtFirstName
     * @name Enter ctl00$cPH$txtFirstName
     */
 	public void Enter_ctl00cPHtxtFirstName(String ctl00cPHtxtFirstName)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtFirstNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtFirstName", "Enter_ctl00cPHtxtFirstName failed. Unable to locate object: " + ctl00cPHtxtFirstNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtFirstName", "Enter_ctl00cPHtxtFirstName failed. Unable to locate object: " + ctl00cPHtxtFirstNameElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtFirstNameElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(ctl00cPHtxtFirstName);
			
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtFirstName " + ctl00cPHtxtFirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtFirstName " + ctl00cPHtxtFirstName);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtLastName
     * @name Enter ctl00$cPH$txtLastName
     */
 	public void Enter_ctl00cPHtxtLastName(String ctl00cPHtxtLastName)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtLastNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtLastName", "Enter_ctl00cPHtxtLastName failed. Unable to locate object: " + ctl00cPHtxtLastNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtLastName", "Enter_ctl00cPHtxtLastName failed. Unable to locate object: " + ctl00cPHtxtLastNameElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtLastNameElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(ctl00cPHtxtLastName);
			
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtLastName " + ctl00cPHtxtLastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtLastName " + ctl00cPHtxtLastName);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress1
     * @name Enter ctl00$cPH$txtAddress1
     */
 	public void Enter_ctl00cPHtxtAddress1(String ctl00cPHtxtAddress1)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress1", "Enter_ctl00cPHtxtAddress1 failed. Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress1Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtAddress1);
			Thread.sleep(5000);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+ctl00cPHtxtAddress1+"'");  
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			 je.executeScript("arguments[0].scrollIntoView(true);",elem);
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress1 " + ctl00cPHtxtAddress1);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress2
     * @name Enter ctl00$cPH$txtAddress2
     */
 	public void Enter_ctl00cPHtxtAddress2(String ctl00cPHtxtAddress2)
 	{
 		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress2", "Enter_ctl00cPHtxtAddress2 failed. Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress2Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtAddress2);
			Thread.sleep(5000);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+ctl00cPHtxtAddress2+"'");  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
 		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress3Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress3", "Enter_ctl00cPHtxtAddress3 failed. Unable to locate object: " + ctl00cPHtxtAddress3Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress3", "Enter_ctl00cPHtxtAddress3 failed. Unable to locate object: " + ctl00cPHtxtAddress3Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress3Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtAddress3);
			
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
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
 		m_Driver.switchTo().defaultContent();
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress4", "Enter_ctl00cPHtxtAddress4 failed. Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress4", "Enter_ctl00cPHtxtAddress4 failed. Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());
         }

 		elem.sendKeys(ctl00cPHtxtAddress4);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress4 " + ctl00cPHtxtAddress4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress4 " + ctl00cPHtxtAddress4);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPersonJoiningDate
     * @name Enter ctl00$cPH$txtPersonJoiningDate
     */
 	public void Enter_ctl00cPHtxtPersonJoiningDate(String ctl00cPHtxtPersonJoiningDate)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtPersonJoiningDateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate", "Enter_ctl00cPHtxtPersonJoiningDate failed. Unable to locate object: " + ctl00cPHtxtPersonJoiningDateElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate", "Enter_ctl00cPHtxtPersonJoiningDate failed. Unable to locate object: " + ctl00cPHtxtPersonJoiningDateElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtPersonJoiningDateElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(ctl00cPHtxtPersonJoiningDate);
			
			m_Driver.switchTo().defaultContent();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate " + ctl00cPHtxtPersonJoiningDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate " + ctl00cPHtxtPersonJoiningDate);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPersonLeavingDate
     * @name Enter ctl00$cPH$txtPersonLeavingDate
     */
 	public void Enter_ctl00cPHtxtPersonLeavingDate(String ctl00cPHtxtPersonLeavingDate)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtPersonLeavingDateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPersonLeavingDate", "Enter_ctl00cPHtxtPersonLeavingDate failed. Unable to locate object: " + ctl00cPHtxtPersonLeavingDateElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPersonLeavingDate", "Enter_ctl00cPHtxtPersonLeavingDate failed. Unable to locate object: " + ctl00cPHtxtPersonLeavingDateElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtPersonLeavingDateElem.toString());
			 }
Thread.sleep(1000);
			elem.sendKeys(ctl00cPHtxtPersonLeavingDate);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			 je.executeScript("arguments[0].scrollIntoView(true);",elem);	
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPersonLeavingDate " + ctl00cPHtxtPersonLeavingDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPersonLeavingDate " + ctl00cPHtxtPersonLeavingDate);
 	}

     
	/**
 	 * Click Save1
     * @name Click Save1
     */
	public void Click_Save1()
	{
        
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Save1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

				Assert.fail("Unable to locate object: " + Save1Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
			
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
  	

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
Thread.sleep(1000);
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
 	 * Click Settings2
     * @name Click Settings2
     */
	public void Click_Settings2()
	{
        
		try {
			WebElement elem = getWebElement(Settings2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings2", "Click_Settings2 failed. Unable to locate object: " + Settings2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings2", "Click_Settings2 failed. Unable to locate object: " + Settings2Elem.toString());

				Assert.fail("Unable to locate object: " + Settings2Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings2");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings2");
	}

     
	/**
 	 * Click Accounts Settings
     * @name Click Accounts Settings
     */
	public void Click_Accounts_Settings()
	{
        
		try {
			WebElement elem = getWebElement(Accounts_SettingsElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Accounts_Settings", "Click_Accounts_Settings failed. Unable to locate object: " + Accounts_SettingsElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Accounts_Settings", "Click_Accounts_Settings failed. Unable to locate object: " + Accounts_SettingsElem.toString());

				Assert.fail("Unable to locate object: " + Accounts_SettingsElem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Accounts_Settings");

		TestModellerLogger.PassStep(m_Driver, "Click_Accounts_Settings");
	}

     
	/**
 	 * Click Edit2
     * @name Click Edit2
     */
	public void Click_Edit2()
	{
        
		try {
			WebElement elem = getWebElement(Edit2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit2", "Click_Edit2 failed. Unable to locate object: " + Edit2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit2", "Click_Edit2 failed. Unable to locate object: " + Edit2Elem.toString());

				Assert.fail("Unable to locate object: " + Edit2Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit2");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit2");
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
 	 * Click Save2
     * @name Click Save2
     */
	public void Click_Save2()
	{
        
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(Save2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save2", "Click_Save2 failed. Unable to locate object: " + Save2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save2", "Click_Save2 failed. Unable to locate object: " + Save2Elem.toString());

				Assert.fail("Unable to locate object: " + Save2Elem.toString());
			}
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			 je.executeScript("arguments[0].scrollIntoView(true);",elem);

			elem.click();
			
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save2");

		TestModellerLogger.PassStep(m_Driver, "Click_Save2");
	}

     
	/**
 	 * Click Final Accounts
     * @name Click Final Accounts
     */
	public void Click_Final_Accounts()
	{
        
		try {
			WebElement elem = getWebElement(Final_AccountsElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts", "Click_Final_Accounts failed. Unable to locate object: " + Final_AccountsElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts", "Click_Final_Accounts failed. Unable to locate object: " + Final_AccountsElem.toString());

				Assert.fail("Unable to locate object: " + Final_AccountsElem.toString());
			}

			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts");
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
Thread.sleep(1000);		
elem.click();
String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[1]/div[3]/table[3]/tbody/tr[15]/td[3]")).getText();
Assert.assertEquals(expected, "Members who served during the year ABC XYZ");

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}