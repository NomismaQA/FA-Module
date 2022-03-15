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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/899ae32f-5af4-484c-9be5-130dbaf8fa71
@TestModellerModule(guid = "899ae32f-5af4-484c-9be5-130dbaf8fa71")
public class Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511 extends BasePage
{
	public Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//label[contains(.,'Name:')]/../input");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//*[@id=\"ctl00_divSubContent\"]/div[3]/div/div/table/tbody/tr[2]/td[1]");

	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By SearchCompanyElem = By.xpath("//label[contains(.,'Client name:')]/../div/input");

	private By FilterTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _ABC_LTD_Elem = By.xpath("//SPAN[contains(text(),'ABC LTD')]");

	private By _Final_Accounts_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By _CT600_Tax_Return_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liCT600TaxReturn']/A");

	private By Submit_CT600Elem = By.xpath("//A[contains(text(),'Submit CT600')]");


	
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
 	 * Enter AgentName
     * @name Enter AgentName
     */
 	public void Enter_AgentName(String AgentName)
 	{
 	    
 		try {
			WebElement elem = getWebElement(AgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				Assert.fail("Unable to locate object: " + AgentNameElem.toString());
			 }
Thread.sleep(5000);
			elem.sendKeys(AgentName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_AgentName " + AgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_AgentName " + AgentName);
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
        
		try {
			handlepopup1();
			WebElement elem = getWebElement(_Clients_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_", "Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				Assert.fail("Unable to locate object: " + _Clients_Elem.toString());
			}
Thread.sleep(10000);
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
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"f7ca7b5b-44b5-f94c-c042-99628d10ddd6\"]"));
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
 	 * Click  Final Accounts 
     * @name Click  Final Accounts 
     */
	public void Click__Final_Accounts_()
	{
        
		try {
			WebElement elem = getWebElement(_Final_Accounts_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Final_Accounts_", "Click__Final_Accounts_ failed. Unable to locate object: " + _Final_Accounts_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Final_Accounts_", "Click__Final_Accounts_ failed. Unable to locate object: " + _Final_Accounts_Elem.toString());

				Assert.fail("Unable to locate object: " + _Final_Accounts_Elem.toString());
			}
Thread.sleep(5000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

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
 	 * Click Submit CT600
     * @name Click Submit CT600
     */
	public void Click_Submit_CT600()
	{
        
		WebElement elem = getWebElement(Submit_CT600Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Submit_CT600", "Click_Submit_CT600 failed. Unable to locate object: " + Submit_CT600Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Submit_CT600", "Click_Submit_CT600 failed. Unable to locate object: " + Submit_CT600Elem.toString());

			Assert.fail("Unable to locate object: " + Submit_CT600Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Submit_CT600");

		TestModellerLogger.PassStep(m_Driver, "Click_Submit_CT600");
	}
}