package pages;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/43309fdf-178c-440e-b984-082e4b97a61a
@TestModellerModule(guid = "43309fdf-178c-440e-b984-082e4b97a61a")
public class NewTestclient extends BasePage
{
	public NewTestclient (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//label[contains(.,'Name:')]/../input");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By Add_client_linkElem = By.xpath("//LI[@class='header_add_btn dropdown']/A");

	private By _New_Client_Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_btnAdd']");

	private By LimitedElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnLimitedCompany']");

	private By Limited_CompanyElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By CompanyNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegNoElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By RegDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By FirstName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By LastName1Elem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By Save_Button1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By _New_Test_Ltd_Elem = By.xpath("//SPAN[contains(text(),'New Test Ltd')]");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705")) {
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
 	    
 		WebElement elem = getWebElement(AgentNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName", "Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

 			Assert.fail("Unable to locate object: " + AgentNameElem.toString());
         }

 		elem.sendKeys(AgentName);
 		
 		
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
        
		WebElement elem = getWebElement(_Nakul_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

			Assert.fail("Unable to locate object: " + _Nakul_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}

     
	/**
 	 * Click Add_client_link
     * @name Click Add_client_link
     */
	public void Click_Add_client_link()
	{
        
		WebElement elem = getWebElement(Add_client_linkElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Add_client_link", "Click_Add_client_link failed. Unable to locate object: " + Add_client_linkElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Add_client_link", "Click_Add_client_link failed. Unable to locate object: " + Add_client_linkElem.toString());

			Assert.fail("Unable to locate object: " + Add_client_linkElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Add_client_link");

		TestModellerLogger.PassStep(m_Driver, "Click_Add_client_link");
	}

     
	/**
 	 * Click  New Client 
     * @name Click  New Client 
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
 	 * Click Save_Button1
     * @name Click Save_Button1
     */
	public void Click_Save_Button1()
	{
        
		WebElement elem = getWebElement(Save_Button1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Button1", "Click_Save_Button1 failed. Unable to locate object: " + Save_Button1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Button1", "Click_Save_Button1 failed. Unable to locate object: " + Save_Button1Elem.toString());

			Assert.fail("Unable to locate object: " + Save_Button1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Save_Button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Button1");
	}

     
	/**
 	 * Click  New Test Ltd 
     * @name Click  New Test Ltd 
     */
	public void Click__New_Test_Ltd_()
	{
        
		WebElement elem = getWebElement(_New_Test_Ltd_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Test_Ltd_", "Click__New_Test_Ltd_ failed. Unable to locate object: " + _New_Test_Ltd_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Test_Ltd_", "Click__New_Test_Ltd_ failed. Unable to locate object: " + _New_Test_Ltd_Elem.toString());

			Assert.fail("Unable to locate object: " + _New_Test_Ltd_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Test_Ltd_");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Test_Ltd_");
	}
}