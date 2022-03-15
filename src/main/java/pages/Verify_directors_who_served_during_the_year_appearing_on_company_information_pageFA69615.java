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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/94bb5a5a-5b53-4b3d-9552-210dffc113c3
@TestModellerModule(guid = "94bb5a5a-5b53-4b3d-9552-210dffc113c3")
public class Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615 extends BasePage
{
	public Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615 (WebDriver driver)
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

	private By Settings1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_AccountMenu\"]/li[12]/a/span");

	private By Director_tabElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbDirector']");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By Add_DirectorElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbDirector_btndirAdd']");

	private By FirstNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFirstName']");

	private By LastNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtLastName']");

	private By Address1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By Address2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By Address3Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By Address4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By PostCode1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtPostCode']");

	private By DirectorJoiningDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtDirectorJoiningDate']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By Settings2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By PositionsRightElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By chkDirectorsYearElem = By.xpath("//INPUT[@name='ctl00$cPH$chkDirectorsYear']");

	private By Address11Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By Address12Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By Address13Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By Address4_1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

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
Thread.sleep(3000);
			elem.sendKeys(FirstName);
			Thread.sleep(3000);
		} catch (Exception e) {
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
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(LastNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

				Assert.fail("Unable to locate object: " + LastNameElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(LastName);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName " + LastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LastName " + LastName);
 	}

      
	/**
 	 * Enter Address1
     * @name Enter Address1
     */
 	public void Enter_Address1(String Address1)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address1", "Enter_Address1 failed. Unable to locate object: " + Address1Elem.toString());

				Assert.fail("Unable to locate object: " + Address1Elem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(Address1);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
			Thread.sleep(3000);
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
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address2", "Enter_Address2 failed. Unable to locate object: " + Address2Elem.toString());

				Assert.fail("Unable to locate object: " + Address2Elem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(Address2);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
			Thread.sleep(3000);
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
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address3Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address3", "Enter_Address3 failed. Unable to locate object: " + Address3Elem.toString());

				Assert.fail("Unable to locate object: " + Address3Elem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(Address3);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
			Thread.sleep(3000);
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
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(Address4Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address4", "Enter_Address4 failed. Unable to locate object: " + Address4Elem.toString());

				Assert.fail("Unable to locate object: " + Address4Elem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(Address4);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address4 " + Address4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address4 " + Address4);
 	}

      
	/**
 	 * Enter PostCode1
     * @name Enter PostCode1
     */
 	public void Enter_PostCode1(String PostCode1)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(PostCode1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode1", "Enter_PostCode1 failed. Unable to locate object: " + PostCode1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode1", "Enter_PostCode1 failed. Unable to locate object: " + PostCode1Elem.toString());

				Assert.fail("Unable to locate object: " + PostCode1Elem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(PostCode1);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode1 " + PostCode1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode1 " + PostCode1);
 	}

      
	/**
 	 * Enter DirectorJoiningDate
     * @name Enter DirectorJoiningDate
     */
 	public void Enter_DirectorJoiningDate(String DirectorJoiningDate)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(DirectorJoiningDateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_DirectorJoiningDate", "Enter_DirectorJoiningDate failed. Unable to locate object: " + DirectorJoiningDateElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_DirectorJoiningDate", "Enter_DirectorJoiningDate failed. Unable to locate object: " + DirectorJoiningDateElem.toString());

				Assert.fail("Unable to locate object: " + DirectorJoiningDateElem.toString());
			 }
Thread.sleep(3000);
			elem.sendKeys(DirectorJoiningDate);
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_DirectorJoiningDate " + DirectorJoiningDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_DirectorJoiningDate " + DirectorJoiningDate);
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
	public void Click_Settings2()
	{
        
		WebElement elem = getWebElement(Settings2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Settings2", "Click_Settings2 failed. Unable to locate object: " + Settings2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Settings2", "Click_Settings2 failed. Unable to locate object: " + Settings2Elem.toString());

			Assert.fail("Unable to locate object: " + Settings2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Settings2");

		TestModellerLogger.PassStep(m_Driver, "Click_Settings2");
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
 	 * Click Edit2
     * @name Click Edit2
     */
	public void Click_Edit2()
	{
        
		WebElement elem = getWebElement(Edit2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Edit2", "Click_Edit2 failed. Unable to locate object: " + Edit2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Edit2", "Click_Edit2 failed. Unable to locate object: " + Edit2Elem.toString());

			Assert.fail("Unable to locate object: " + Edit2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Edit2");

		TestModellerLogger.PassStep(m_Driver, "Click_Edit2");
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
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);
 	}

     
	/**
 	 * Click PositionsRight'
     * @name Click PositionsRight'
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
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
        
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
 	 * Enter Address11
     * @name Enter Address11
     */
 	public void Enter_Address11(String Address11)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(Address11Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address11", "Enter_Address11 failed. Unable to locate object: " + Address11Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address11", "Enter_Address11 failed. Unable to locate object: " + Address11Elem.toString());

				Assert.fail("Unable to locate object: " + Address11Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(Address11);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address11 " + Address11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address11 " + Address11);
 	}

      
	/**
 	 * Enter Address12
     * @name Enter Address12
     */
 	public void Enter_Address12(String Address12)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(Address12Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address12", "Enter_Address12 failed. Unable to locate object: " + Address12Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address12", "Enter_Address12 failed. Unable to locate object: " + Address12Elem.toString());

				Assert.fail("Unable to locate object: " + Address12Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(Address12);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address12 " + Address12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address12 " + Address12);
 	}

      
	/**
 	 * Enter Address13
     * @name Enter Address13
     */
 	public void Enter_Address13(String Address13)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(Address13Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address13", "Enter_Address13 failed. Unable to locate object: " + Address13Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address13", "Enter_Address13 failed. Unable to locate object: " + Address13Elem.toString());

				Assert.fail("Unable to locate object: " + Address13Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(Address13);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address13 " + Address13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address13 " + Address13);
 	}

      
	/**
 	 * Enter Address4
     * @name Enter Address4
     */
 	public void Enter_Address4_1(String Address4)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(Address4_1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Address4_1", "Enter_Address4_1 failed. Unable to locate object: " + Address4_1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Address4_1", "Enter_Address4_1 failed. Unable to locate object: " + Address4_1Elem.toString());

				Assert.fail("Unable to locate object: " + Address4_1Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(Address4);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Address4_1 " + Address4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Address4_1 " + Address4);
 	}

      
	/**
 	 * Enter PostCode2
     * @name Enter PostCode2
     */
 	public void Enter_PostCode2(String PostCode2)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

			WebElement elem = getWebElement(PostCode2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_PostCode2", "Enter_PostCode2 failed. Unable to locate object: " + PostCode2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_PostCode2", "Enter_PostCode2 failed. Unable to locate object: " + PostCode2Elem.toString());

				Assert.fail("Unable to locate object: " + PostCode2Elem.toString());
			 }
Thread.sleep(3000);
elem.clear();
			elem.sendKeys(PostCode2);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_PostCode2 " + PostCode2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_PostCode2 " + PostCode2);
 	}

     
	/**
 	 * Click Save2
     * @name Click Save2
     */
	public void Click_Save2()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

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
}