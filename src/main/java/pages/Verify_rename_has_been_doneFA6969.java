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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/3181dbe8-82e8-4a0b-8d91-8185fe1aa78c
@TestModellerModule(guid = "3181dbe8-82e8-4a0b-8d91-8185fe1aa78c")
public class Verify_rename_has_been_doneFA6969 extends BasePage
{
	public Verify_rename_has_been_doneFA6969 (WebDriver driver)
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

	private By SearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By FilterTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _Test_Systems_Ltd_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");

	private By Settings1Elem = By.xpath("//A[contains(text(),'Settings')]");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By Address1Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress1']");

	private By Adress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress2']");

	private By Address3Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress3']");

	private By Address4Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress4']");

	private By PostCode1Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtPostCode']");

	private By RegNoElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtRegNo']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By Settings2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By PrincipalactivityElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPrincipalactivity']");

	private By AuthenticationElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAuthentication']");

	private By CTdistrictElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTdistrict']");

	private By CTutrElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTutr']");

	private By ReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By chkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By Address11Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By Address12Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By Address13Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By Address14Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By PostCode2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtRegFAPostCode']");

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
			Thread.sleep(3000);
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
 	 * Enter SearchCompany
     * @name Enter SearchCompany
     */
 	public void Enter_SearchCompany(String SearchCompany)
 	{
 	    
 		WebElement elem = getWebElement(SearchCompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchCompany", "Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchCompany", "Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

 			Assert.fail("Unable to locate object: " + SearchCompanyElem.toString());
         }

 		elem.sendKeys(SearchCompany);
 		
 		
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
 	 * Click Settings1
     * @name Click Settings1
     */
	

     
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
 	 * Click Settings2
     * @name Click Settings2
     */
	

     
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
		String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[4]/div")).getText();
		Assert.assertEquals(expected, "CONTENTS	PAGE\r\n" + 
				"Company information	3\r\n" + 
				"Directors' report	4\r\n" + 
				"Directors' responsibilities statement	5\r\n" + 
				"Accountant's Report	6\r\n" + 
				"Income Statement	7\r\n" + 
				"Statement of Financial Position	8\r\n" + 
				"Notes to the Financial Statements	9 - 11\r\n" + 
				"The following do not form part of the statutory financial statements:\r\n" + 
				"Detailed Income Statement	12");

          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}