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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/597d4865-1bb1-4e24-8626-922db7ecebed
@TestModellerModule(guid = "597d4865-1bb1-4e24-8626-922db7ecebed")
public class Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16 extends BasePage
{
	public Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16 (WebDriver driver)
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

	private By _ABC_LLP_Elem = By.xpath("//SPAN[contains(text(),'ABC LLP')]");

	private By Settings1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_AccountMenu\"]/li[13]/a/span");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By MembersElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbSoleTrader']");

	private By Add_MembersElem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbSoleTrader_btnempAdd']");

	private By ctl00cPHtxtFirstNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFirstName']");

	private By ctl00cPHtxtLastNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtLastName']");

	private By ctl00cPHtxtPersonJoiningDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPersonJoiningDate']");

	private By ctl00cPHtxtAddress11Elem = By.xpath("//div[@class='col-sm-7 col-xs-7']/INPUT[@name='ctl00$cPH$txtAddress1'][@class='form-control']");

	private By ctl00cPHtxtAddress12Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By ctl00cPHtxtAddress13Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By ctl00cPHtxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By ctl00cPHtxtPostCode1Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtPostCode']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By Settings2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ctl00cPHtxtPrincipalactivityElem = By.xpath("//INPUT[@name='ctl00$cPH$txtPrincipalactivity']");

	private By ctl00cPHtxtAuthenticationElem = By.xpath("//INPUT[@name='ctl00$cPH$txtAuthentication']");

	private By ctl00cPHtxtCTdistrictElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTdistrict']");

	private By ctl00cPHtxtCTutrElem = By.xpath("//INPUT[@name='ctl00$cPH$txtCTutr']");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By ctl00cPHddlAccountantReportFormatElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlAccountantReportFormat']");

	private By radPreparedByPositionsRight_for_ctl00cPHPreparedByElem = By.xpath("//INPUT[@id='ctl00_cPH_radPreparedByPositionsRight']");

	private By ctl00cPHtxtAddress21Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress1']");

	private By ctl00cPHtxtAddress22Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress2']");

	private By ctl00cPHtxtAddress23Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress3']");

	private By ctl00cPHtxtAddress24Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtAddress4']");

	private By ctl00cPHtxtRegFAPostCode2Elem = By.xpath("//INPUT[@name='ctl00$cPH$txtRegFAPostCode']");

	private By Save2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");
	
	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");

	private By Partnership_InformationElem = By.xpath("/html/body/form/main/div/div[3]/div/div[3]/a[2]");


	
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
 	 * Click  ABC LLP 
     * @name Click  ABC LLP 
     */
	public void Click__ABC_LLP_()
	{
        
		try {
			WebElement elem = getWebElement(_ABC_LLP_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LLP_", "Click__ABC_LLP_ failed. Unable to locate object: " + _ABC_LLP_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LLP_", "Click__ABC_LLP_ failed. Unable to locate object: " + _ABC_LLP_Elem.toString());

				Assert.fail("Unable to locate object: " + _ABC_LLP_Elem.toString());
			}
Thread.sleep(5000);
			elem.click();
      ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   	

		ExtentReportManager.passStep(m_Driver, "Click__ABC_LLP_");

		TestModellerLogger.PassStep(m_Driver, "Click__ABC_LLP_");
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
 	 * Click Members
     * @name Click Members
     */
	public void Click_Members()
	{
        
		WebElement elem = getWebElement(MembersElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Members", "Click_Members failed. Unable to locate object: " + MembersElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Members", "Click_Members failed. Unable to locate object: " + MembersElem.toString());

			Assert.fail("Unable to locate object: " + MembersElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Members");

		TestModellerLogger.PassStep(m_Driver, "Click_Members");
	}

     
	/**
 	 * Click Add Members
     * @name Click Add Members
     */
	public void Click_Add_Members()
	{
        
		WebElement elem = getWebElement(Add_MembersElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_Members", "Click_Add_Members failed. Unable to locate object: " + Add_MembersElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_Members", "Click_Add_Members failed. Unable to locate object: " + Add_MembersElem.toString());

			Assert.fail("Unable to locate object: " + Add_MembersElem.toString());
        }

		elem.click();
          	

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
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtFirstName);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtLastName);
			Thread.sleep(5000);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtLastName " + ctl00cPHtxtLastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtLastName " + ctl00cPHtxtLastName);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPersonJoiningDate
     * @name Enter ctl00$cPH$txtPersonJoiningDate
     */
 	public void Enter_ctl00cPHtxtPersonJoiningDate(String ctl00cPHtxtPersonJoiningDate)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtPersonJoiningDateElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate", "Enter_ctl00cPHtxtPersonJoiningDate failed. Unable to locate object: " + ctl00cPHtxtPersonJoiningDateElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate", "Enter_ctl00cPHtxtPersonJoiningDate failed. Unable to locate object: " + ctl00cPHtxtPersonJoiningDateElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtPersonJoiningDateElem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtPersonJoiningDate);
	Thread.sleep(5000);		
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate " + ctl00cPHtxtPersonJoiningDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPersonJoiningDate " + ctl00cPHtxtPersonJoiningDate);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress11
     * @name Enter ctl00$cPH$txtAddress11
     */
 	public void Enter_ctl00cPHtxtAddress11(String ctl00cPHtxtAddress11)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress11Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress11", "Enter_ctl00cPHtxtAddress11 failed. Unable to locate object: " + ctl00cPHtxtAddress11Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress11", "Enter_ctl00cPHtxtAddress11 failed. Unable to locate object: " + ctl00cPHtxtAddress11Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress11Elem.toString());
			 }
			Thread.sleep(6000);

			
			
			Thread.sleep(6000);	
			elem.sendKeys(ctl00cPHtxtAddress11);
			Thread.sleep(6000);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress1').value='"+ctl00cPHtxtAddress11+"'");  

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress11 " + ctl00cPHtxtAddress11);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress11 " + ctl00cPHtxtAddress11);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress12
     * @name Enter ctl00$cPH$txtAddress12
     */
 	public void Enter_ctl00cPHtxtAddress12(String ctl00cPHtxtAddress12)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress12Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress12", "Enter_ctl00cPHtxtAddress12 failed. Unable to locate object: " + ctl00cPHtxtAddress12Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress12", "Enter_ctl00cPHtxtAddress12 failed. Unable to locate object: " + ctl00cPHtxtAddress12Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress12Elem.toString());
			 }
Thread.sleep(5000);
elem.click();
			elem.sendKeys(ctl00cPHtxtAddress12);
			Thread.sleep(5000);
			JavascriptExecutor jsExecutor = (JavascriptExecutor) m_Driver;  
			//set the text
			jsExecutor.executeScript("document.getElementById('ctl00_cPH_txtAddress2').value='"+ctl00cPHtxtAddress12+"'");

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress12 " + ctl00cPHtxtAddress12);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress12 " + ctl00cPHtxtAddress12);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress13
     * @name Enter ctl00$cPH$txtAddress13
     */
 	public void Enter_ctl00cPHtxtAddress13(String ctl00cPHtxtAddress13)
 	{
 	    
		try {
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress13Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress13", "Enter_ctl00cPHtxtAddress13 failed. Unable to locate object: " + ctl00cPHtxtAddress13Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress13", "Enter_ctl00cPHtxtAddress13 failed. Unable to locate object: " + ctl00cPHtxtAddress13Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress13Elem.toString());
			 }
Thread.sleep(5000);
elem.sendKeys(Keys.ENTER);
			elem.sendKeys(ctl00cPHtxtAddress13);
			Thread.sleep(5000);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress13 " + ctl00cPHtxtAddress13);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress13 " + ctl00cPHtxtAddress13);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress4
     * @name Enter ctl00$cPH$txtAddress4
     */
 	public void Enter_ctl00cPHtxtAddress4(String ctl00cPHtxtAddress4)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtAddress4Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress4", "Enter_ctl00cPHtxtAddress4 failed. Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress4", "Enter_ctl00cPHtxtAddress4 failed. Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress4Elem.toString());
			 }
Thread.sleep(5000);
elem.click();
			elem.sendKeys(ctl00cPHtxtAddress4);
			Thread.sleep(5000);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress4 " + ctl00cPHtxtAddress4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress4 " + ctl00cPHtxtAddress4);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtPostCode1
     * @name Enter ctl00$cPH$txtPostCode1
     */
 	public void Enter_ctl00cPHtxtPostCode1(String ctl00cPHtxtPostCode1)
 	{
 	    
		try {
			m_Driver.switchTo().defaultContent();
			m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/form/main/div[11]/div[3]/div/div[6]/div/div/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div/div/div[2]/iframe")));

			WebElement elem = getWebElement(ctl00cPHtxtPostCode1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPostCode1", "Enter_ctl00cPHtxtPostCode1 failed. Unable to locate object: " + ctl00cPHtxtPostCode1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPostCode1", "Enter_ctl00cPHtxtPostCode1 failed. Unable to locate object: " + ctl00cPHtxtPostCode1Elem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtxtPostCode1Elem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(ctl00cPHtxtPostCode1);
			Thread.sleep(5000);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);

			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPostCode1 " + ctl00cPHtxtPostCode1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPostCode1 " + ctl00cPHtxtPostCode1);
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
Thread.sleep(5000);
			elem.click();
			
			m_Driver.switchTo().defaultContent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
 	 * Enter ctl00$cPH$txtPrincipalactivity
     * @name Enter ctl00$cPH$txtPrincipalactivity
     */
 	public void Enter_ctl00cPHtxtPrincipalactivity(String ctl00cPHtxtPrincipalactivity)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtPrincipalactivityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtPrincipalactivity);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity " + ctl00cPHtxtPrincipalactivity);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity " + ctl00cPHtxtPrincipalactivity);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAuthentication
     * @name Enter ctl00$cPH$txtAuthentication
     */
 	public void Enter_ctl00cPHtxtAuthentication(String ctl00cPHtxtAuthentication)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAuthenticationElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAuthentication);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAuthentication " + ctl00cPHtxtAuthentication);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAuthentication " + ctl00cPHtxtAuthentication);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCTdistrict
     * @name Enter ctl00$cPH$txtCTdistrict
     */
 	public void Enter_ctl00cPHtxtCTdistrict(String ctl00cPHtxtCTdistrict)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCTdistrictElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtCTdistrict);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCTdistrict " + ctl00cPHtxtCTdistrict);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCTdistrict " + ctl00cPHtxtCTdistrict);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCTutr
     * @name Enter ctl00$cPH$txtCTutr
     */
 	public void Enter_ctl00cPHtxtCTutr(String ctl00cPHtxtCTutr)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCTutrElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtCTutr);
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCTutr " + ctl00cPHtxtCTutr);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCTutr " + ctl00cPHtxtCTutr);
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
 	 * Select ctl00$cPH$ddlAccountantReportFormat
     * @name Select ctl00$cPH$ddlAccountantReportFormat
     */
    public void Select_ctl00cPHddlAccountantReportFormat(String ctl00cPHddlAccountantReportFormat)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHddlAccountantReportFormatElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00cPHddlAccountantReportFormat", "Select_ctl00cPHddlAccountantReportFormat failed. Unable to locate object: " + ctl00cPHddlAccountantReportFormatElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00cPHddlAccountantReportFormat", "Select_ctl00cPHddlAccountantReportFormat failed. Unable to locate object: " + ctl00cPHddlAccountantReportFormatElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHddlAccountantReportFormatElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ctl00cPHddlAccountantReportFormat);
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00cPHddlAccountantReportFormat " + ctl00cPHddlAccountantReportFormat);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00cPHddlAccountantReportFormat " + ctl00cPHddlAccountantReportFormat);
 	}

     
	/**
 	 * Click 'radPreparedByPositionsRight' for 'ctl00$cPH$PreparedBy''
     * @name Click 'radPreparedByPositionsRight' for 'ctl00$cPH$PreparedBy''
     */
	public void Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(radPreparedByPositionsRight_for_ctl00cPHPreparedByElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy", "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy failed. Unable to locate object: " + radPreparedByPositionsRight_for_ctl00cPHPreparedByElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy", "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy failed. Unable to locate object: " + radPreparedByPositionsRight_for_ctl00cPHPreparedByElem.toString());

			Assert.fail("Unable to locate object: " + radPreparedByPositionsRight_for_ctl00cPHPreparedByElem.toString());
        }

		elem.click();
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy");

		TestModellerLogger.PassStep(m_Driver, "Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy");
	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress21
     * @name Enter ctl00$cPH$txtAddress21
     */
 	public void Enter_ctl00cPHtxtAddress21(String ctl00cPHtxtAddress21)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress21Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress21", "Enter_ctl00cPHtxtAddress21 failed. Unable to locate object: " + ctl00cPHtxtAddress21Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress21", "Enter_ctl00cPHtxtAddress21 failed. Unable to locate object: " + ctl00cPHtxtAddress21Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress21Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress21);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress21 " + ctl00cPHtxtAddress21);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress21 " + ctl00cPHtxtAddress21);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress22
     * @name Enter ctl00$cPH$txtAddress22
     */
 	public void Enter_ctl00cPHtxtAddress22(String ctl00cPHtxtAddress22)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress22Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress22", "Enter_ctl00cPHtxtAddress22 failed. Unable to locate object: " + ctl00cPHtxtAddress22Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress22", "Enter_ctl00cPHtxtAddress22 failed. Unable to locate object: " + ctl00cPHtxtAddress22Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress22Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress22);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress22 " + ctl00cPHtxtAddress22);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress22 " + ctl00cPHtxtAddress22);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress23
     * @name Enter ctl00$cPH$txtAddress23
     */
 	public void Enter_ctl00cPHtxtAddress23(String ctl00cPHtxtAddress23)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress23Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress23", "Enter_ctl00cPHtxtAddress23 failed. Unable to locate object: " + ctl00cPHtxtAddress23Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress23", "Enter_ctl00cPHtxtAddress23 failed. Unable to locate object: " + ctl00cPHtxtAddress23Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress23Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress23);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress23 " + ctl00cPHtxtAddress23);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress23 " + ctl00cPHtxtAddress23);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAddress24
     * @name Enter ctl00$cPH$txtAddress24
     */
 	public void Enter_ctl00cPHtxtAddress24(String ctl00cPHtxtAddress24)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAddress24Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress24", "Enter_ctl00cPHtxtAddress24 failed. Unable to locate object: " + ctl00cPHtxtAddress24Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAddress24", "Enter_ctl00cPHtxtAddress24 failed. Unable to locate object: " + ctl00cPHtxtAddress24Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAddress24Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtAddress24);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAddress24 " + ctl00cPHtxtAddress24);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAddress24 " + ctl00cPHtxtAddress24);
 	}

      
	/**
 	 * Enter ctl00$cPH$txtRegFAPostCode2
     * @name Enter ctl00$cPH$txtRegFAPostCode2
     */
 	public void Enter_ctl00cPHtxtRegFAPostCode2(String ctl00cPHtxtRegFAPostCode2)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtRegFAPostCode2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode2", "Enter_ctl00cPHtxtRegFAPostCode2 failed. Unable to locate object: " + ctl00cPHtxtRegFAPostCode2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode2", "Enter_ctl00cPHtxtRegFAPostCode2 failed. Unable to locate object: " + ctl00cPHtxtRegFAPostCode2Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtRegFAPostCode2Elem.toString());
         }
elem.clear();
 		elem.sendKeys(ctl00cPHtxtRegFAPostCode2);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode2 " + ctl00cPHtxtRegFAPostCode2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtRegFAPostCode2 " + ctl00cPHtxtRegFAPostCode2);
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
			String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[1]/div[3]/table[3]/tbody/tr[4]/td[3]")).getText();
			Assert.assertEquals(expected, "Partnership Secretary  Name1");

		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
     
	/**
 	 * Click Partnership Information
     * @name Click Partnership Information
     */
	public void Click_Partnership_Information()
	{
        
		WebElement elem = getWebElement(Partnership_InformationElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Partnership_Information", "Click_Partnership_Information failed. Unable to locate object: " + Partnership_InformationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Partnership_Information", "Click_Partnership_Information failed. Unable to locate object: " + Partnership_InformationElem.toString());

			Assert.fail("Unable to locate object: " + Partnership_InformationElem.toString());
        }

		elem.click();
		String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[6]/div/table[2]/tbody/tr[3]/td[3]")).getText();
		Assert.assertEquals(expected, "123 !@#");  	

		ExtentReportManager.passStep(m_Driver, "Click_Partnership_Information");

		TestModellerLogger.PassStep(m_Driver, "Click_Partnership_Information");
	}
}