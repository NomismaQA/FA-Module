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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/f46203bb-127d-4af8-918f-21e9a5c0e354
@TestModellerModule(guid = "f46203bb-127d-4af8-918f-21e9a5c0e354")
public class Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716 extends BasePage
{
	public Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716 (WebDriver driver)
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

	private By _Test_Systems_Ltd_Elem = By.xpath("//SPAN[contains(text(),'Test Systems Ltd')]");

	private By _Settings_Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_AccountMenu\"]/li[12]/a/span");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By Director_tabElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbDirector']");

	private By Add_DirectorElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbDirector_btndirAdd']");

	private By FirstNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFirstName']");

	private By LastNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtLastName']");

	private By ShareholderElem = By.xpath("//INPUT[@id='chkShareHolder']");

	private By DirectorJoiningDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDirectorJoiningDate']");

	private By Address1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By Address2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By Address3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By Address4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By PostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPostCode']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By _Accountant_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_accountantMenu']/A");

	private By Add_journal_entryElem = By.xpath("//A[@id='ctl00_cPH_btnAddJournalEntry']");

	private By DateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDate']");

	private By DescriptionElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDescription']");

	private By Account1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$AccountUC1$txtAccount']");

	private By Credit1Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl00$txtCredit']");

	private By Account2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$AccountUC1$txtAccount']");

	private By Debit2Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl01$txtDebit']");

	private By Account3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$AccountUC1$txtAccount']");

	private By Credit3Elem = By.xpath("//INPUT[@name='ctl00$cPH$rptRecord$ctl02$txtCredit']");

	private By Save2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By _Final_Accounts_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By _CT600_Tax_Return_Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_liCT600TaxReturn\"]/a/span");

	private By CT_ComputationElem = By.xpath("//*[@id=\"ctl00_SideMenu1_FinalAccountsCTComputation\"]/a");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6")) {
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
			Thread.sleep(15000);
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
			Thread.sleep(3000);
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
 	 * Click  Test Systems Ltd 
     * @name Click  Test Systems Ltd 
     */
	public void Click__Test_Systems_Ltd_()
	{
        
		WebElement elem = getWebElement(_Test_Systems_Ltd_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Test_Systems_Ltd_", "Click__Test_Systems_Ltd_ failed. Unable to locate object: " + _Test_Systems_Ltd_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Test_Systems_Ltd_", "Click__Test_Systems_Ltd_ failed. Unable to locate object: " + _Test_Systems_Ltd_Elem.toString());

			Assert.fail("Unable to locate object: " + _Test_Systems_Ltd_Elem.toString());
        }

		elem.click();
        ChangeWindow.tabswitch(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click__Test_Systems_Ltd_");

		TestModellerLogger.PassStep(m_Driver, "Click__Test_Systems_Ltd_");
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
 	 * Click Director_tab
     * @name Click Director_tab
     */
	public void Click_Director_tab()
	{
        
		WebElement elem = getWebElement(Director_tabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Director_tab", "Click_Director_tab failed. Unable to locate object: " + Director_tabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Director_tab", "Click_Director_tab failed. Unable to locate object: " + Director_tabElem.toString());

			Assert.fail("Unable to locate object: " + Director_tabElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Director_tab");

		TestModellerLogger.PassStep(m_Driver, "Click_Director_tab");
	}

     
	/**
 	 * Click Add Director
     * @name Click Add Director
     */
	public void Click_Add_Director()
	{
        
		WebElement elem = getWebElement(Add_DirectorElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Director", "Click_Add_Director failed. Unable to locate object: " + Add_DirectorElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Director", "Click_Add_Director failed. Unable to locate object: " + Add_DirectorElem.toString());

			Assert.fail("Unable to locate object: " + Add_DirectorElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_Director");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_Director");
	}

      
	/**
 	 * Enter FirstName
     * @name Enter FirstName
     */
 	public void Enter_FirstName(String FirstName)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(FirstNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_FirstName failed. Unable to locate object: " + FirstNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_FirstName failed. Unable to locate object: " + FirstNameElem.toString());

				Assert.fail("Unable to locate object: " + FirstNameElem.toString());
			 }
Thread.sleep(15000);
			elem.sendKeys(FirstName);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FirstName " + FirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FirstName " + FirstName);
 	}

      
	/**
 	 * Enter LastName
     * @name Enter LastName
     */
 	public void Enter_LastName(String LastName)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(LastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

 			Assert.fail("Unable to locate object: " + LastNameElem.toString());
         }

 		elem.sendKeys(LastName);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName " + LastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LastName " + LastName);
 	}

     
	/**
 	 * Click Shareholder
     * @name Click Shareholder
     */
	public void Click_Shareholder()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

		WebElement elem = getWebElement(ShareholderElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Shareholder", "Click_Shareholder failed. Unable to locate object: " + ShareholderElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Shareholder", "Click_Shareholder failed. Unable to locate object: " + ShareholderElem.toString());

			Assert.fail("Unable to locate object: " + ShareholderElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Shareholder");

		TestModellerLogger.PassStep(m_Driver, "Click_Shareholder");
	}

      
	/**
 	 * Enter DirectorJoiningDate
     * @name Enter DirectorJoiningDate
     */
 	public void Enter_DirectorJoiningDate(String DirectorJoiningDate)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DirectorJoiningDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DirectorJoiningDate", "Enter_DirectorJoiningDate failed. Unable to locate object: " + DirectorJoiningDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DirectorJoiningDate", "Enter_DirectorJoiningDate failed. Unable to locate object: " + DirectorJoiningDateElem.toString());

 			Assert.fail("Unable to locate object: " + DirectorJoiningDateElem.toString());
         }

 		elem.sendKeys(DirectorJoiningDate);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DirectorJoiningDate " + DirectorJoiningDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DirectorJoiningDate " + DirectorJoiningDate);
 	}

      
	/**
 	 * Enter Address1
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1)
 	{
 		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

				Assert.fail("Unable to locate object: " + Address1Elem.toString());
			 }
		Thread.sleep(5000);	
			elem.sendKeys(Address1);
			elem.sendKeys(Keys.ENTER);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+Address1+"'");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address1 " + Address1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address1 " + Address1);
 	}

      
	/**
 	 * Enter Address2
     * @name Enter Address2
     */
 	public void Enter_Address2(String Address2)
 	{
 		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

				Assert.fail("Unable to locate object: " + Address2Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(Address2);
			elem.sendKeys(Keys.ENTER);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+Address2+"'");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address2 " + Address2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address2 " + Address2);
 	}

      
	/**
 	 * Enter Address3
     * @name Enter Address3
     */
 	public void Enter_Address3(String Address3)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address3Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

				Assert.fail("Unable to locate object: " + Address3Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(Address3);
			elem.sendKeys(Keys.ENTER);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+Address3+"'");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address3 " + Address3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address3 " + Address3);
 	}

      
	/**
 	 * Enter Address4
     * @name Enter Address4
     */
 	public void Enter_Address4(String Address4)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address4Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

				Assert.fail("Unable to locate object: " + Address4Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(Address4);
			elem.sendKeys(Keys.ENTER);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+Address4+"'");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address4 " + Address4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address4 " + Address4);
 	}

      
	/**
 	 * Enter PostCode
     * @name Enter PostCode
     */
 	public void Enter_PostCode(String PostCode)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(PostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode", "Enter_PostCode failed. Unable to locate object: " + PostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + PostCodeElem.toString());
         }

 		elem.sendKeys(PostCode);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode " + PostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode " + PostCode);
 	}

     
	/**
 	 * Click Save1
     * @name Click Save1
     */
	public void Click_Save1()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

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
 	 * Click Add_journal_entry
     * @name Click Add_journal_entry
     */
	public void Click_Add_journal_entry()
	{
        
		WebElement elem = getWebElement(Add_journal_entryElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_journal_entry", "Click_Add_journal_entry failed. Unable to locate object: " + Add_journal_entryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_journal_entry", "Click_Add_journal_entry failed. Unable to locate object: " + Add_journal_entryElem.toString());

			Assert.fail("Unable to locate object: " + Add_journal_entryElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_journal_entry");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_journal_entry");
	}

      
	/**
 	 * Enter Date
     * @name Enter Date
     */
 	public void Enter_Date(String Date)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(DateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Date", "Enter_Date failed. Unable to locate object: " + DateElem.toString());

 			Assert.fail("Unable to locate object: " + DateElem.toString());
         }

 		elem.sendKeys(Date);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Date " + Date);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Date " + Date);
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
 	public void Enter_Account1(String Account1)
 	{
 		try {
			System.out.println();
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Account1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account1", "Enter_Account1 failed. Unable to locate object: " + Account1Elem.toString());

				Assert.fail("Unable to locate object: " + Account1Elem.toString());
			 }
			
elem.click();
Thread.sleep(1000);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ENTER);
//elem.click();
m_Driver.findElement(By.xpath("//*[starts-with(text(), '4000 - Sales')]")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Account1 " + Account1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Account1 " + Account1);
 	}

      
	/**
 	 * Enter Credit1
     * @name Enter Credit1
     */
 	public void Enter_Credit1(String Credit1)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Credit1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit1", "Enter_Credit1 failed. Unable to locate object: " + Credit1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit1", "Enter_Credit1 failed. Unable to locate object: " + Credit1Elem.toString());

				Assert.fail("Unable to locate object: " + Credit1Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(Credit1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Credit1 " + Credit1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Credit1 " + Credit1);
 	}

      
	/**
 	 * Enter Account2
     * @name Enter Account2
     */
 	public void Enter_Account2(String Account2)
 	{
 	    
		try {
			System.out.println();
	 	    m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Account2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account2", "Enter_Account2 failed. Unable to locate object: " + Account2Elem.toString());

				Assert.fail("Unable to locate object: " + Account2Elem.toString());
			 }

//elem.sendKeys("1321");
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ARROW_DOWN);
//elem.sendKeys(Keys.ENTER);
elem.click();
Thread.sleep(1000);
m_Driver.findElement(By.xpath("//*[starts-with(text(), '1321 - Demo  Demo1')]")).click();
		} catch (Exception e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Account2 " + Account2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Account2 " + Account2);
 	}

      
	/**
 	 * Enter Debit2
     * @name Enter Debit2
     */
 	public void Enter_Debit2(String Debit2)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Debit2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Debit2", "Enter_Debit2 failed. Unable to locate object: " + Debit2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Debit2", "Enter_Debit2 failed. Unable to locate object: " + Debit2Elem.toString());

				Assert.fail("Unable to locate object: " + Debit2Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(Debit2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Debit2 " + Debit2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Debit2 " + Debit2);
 	}

      
	/**
 	 * Enter Account3
     * @name Enter Account3
     */
 	public void Enter_Account3(String Account3)
 	{
 	    
		try {
			System.out.println();
	 	    m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Account3Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Account3", "Enter_Account3 failed. Unable to locate object: " + Account3Elem.toString());

				Assert.fail("Unable to locate object: " + Account3Elem.toString());
			 }
			
//			elem.sendKeys("1321");
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ARROW_DOWN);
//			elem.sendKeys(Keys.ENTER);
			elem.click();
			Thread.sleep(1000);
			m_Driver.findElement(By.xpath("//*[starts-with(text(), '1321 - Demo Demo2')]")).click();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Account3 " + Account3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Account3 " + Account3);
 	}

      
	/**
 	 * Enter Credit3
     * @name Enter Credit3
     */
 	public void Enter_Credit3(String Credit3)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

 		WebElement elem = getWebElement(Credit3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Credit3", "Enter_Credit3 failed. Unable to locate object: " + Credit3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Credit3", "Enter_Credit3 failed. Unable to locate object: " + Credit3Elem.toString());

 			Assert.fail("Unable to locate object: " + Credit3Elem.toString());
         }

 		elem.sendKeys(Credit3);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Credit3 " + Credit3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Credit3 " + Credit3);
 	}

     
	/**
 	 * Click Save2
     * @name Click Save2
     */
	public void Click_Save2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[4]/div/div[1]/div/div/div/div[1]/div/div/div/div[1]/div/div/div[2]/iframe")));

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
 	 * Click  CT600 Tax Return 
     * @name Click  CT600 Tax Return 
     */
	public void Click__CT600_Tax_Return_()
	{
        
		WebElement elem = getWebElement(_CT600_Tax_Return_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__CT600_Tax_Return_", "Click__CT600_Tax_Return_ failed. Unable to locate object: " + _CT600_Tax_Return_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__CT600_Tax_Return_", "Click__CT600_Tax_Return_ failed. Unable to locate object: " + _CT600_Tax_Return_Elem.toString());

			Assert.fail("Unable to locate object: " + _CT600_Tax_Return_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__CT600_Tax_Return_");

		TestModellerLogger.PassStep(m_Driver, "Click__CT600_Tax_Return_");
	}

     
	/**
 	 * Click CT Computation
     * @name Click CT Computation
     */
	public void Click_CT_Computation()
	{
        
		WebElement elem = getWebElement(CT_ComputationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_CT_Computation", "Click_CT_Computation failed. Unable to locate object: " + CT_ComputationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_CT_Computation", "Click_CT_Computation failed. Unable to locate object: " + CT_ComputationElem.toString());

			Assert.fail("Unable to locate object: " + CT_ComputationElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_CT_Computation");

		TestModellerLogger.PassStep(m_Driver, "Click_CT_Computation");
	}
}