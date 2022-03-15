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
import utilities.ClosePopup;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/bd44b4ed-770c-4222-82e4-fa24e6c6ab15
@TestModellerModule(guid = "bd44b4ed-770c-4222-82e4-fa24e6c6ab15")
public class Cost_of_raw_materials_and_consumables2FA775 extends BasePage
{
	public Cost_of_raw_materials_and_consumables2FA775 (WebDriver driver)
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
	
	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");
	
	private By Final_Accounts2Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_liFinalAccounts\"]/a/span");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");
	
	private By Income_Statement_PageElem = By.xpath("//A[contains(text(),'Income Statement')]");
	
	private By Cost_of_raw_material_and_consumablesElem = By.xpath("//A[contains(text(),'(5,038)')]");


	
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
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"25492b86-0b6f-4e30-a873-609b228d5e19\"]"));
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
ClosePopup.ValidateAndPopUp(m_Driver);
		
{
		ExtentReportManager.passStep(m_Driver, "Click_Search_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button1");
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
Thread.sleep(2000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}
	
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
		
	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
	
	public void Click_Income_Statement_Page()
	{

		try {
			WebElement elem = getWebElement(Income_Statement_PageElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Income_Statement_Page", "Click_Income_Statement_Page failed. Unable to locate object: " + Income_Statement_PageElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Income_Statement_Page", "Click_Income_Statement_Page failed. Unable to locate object: " + Income_Statement_PageElem.toString());

				Assert.fail("Unable to locate object: " + Income_Statement_PageElem.toString());
			}
Thread.sleep(2000);
			elem.click();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement_Page");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement_Page");
	}
   
	/**
	 * Click Cost_of_raw_material_and_consumables
   * @name Click Cost_of_raw_material_and_consumables
   */
	public void Click_Cost_of_raw_material_and_consumables()
	{
      
		try {
			WebElement elem = getWebElement(Cost_of_raw_material_and_consumablesElem);

			if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Cost_of_raw_material_and_consumables", "Click_Cost_of_raw_material_and_consumables failed. Unable to locate object: " + Cost_of_raw_material_and_consumablesElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Cost_of_raw_material_and_consumables", "Click_Cost_of_raw_material_and_consumables failed. Unable to locate object: " + Cost_of_raw_material_and_consumablesElem.toString());

				Assert.fail("Unable to locate object: " + Cost_of_raw_material_and_consumablesElem.toString());
     }
Thread.sleep(5000);
			elem.click();
			Thread.sleep(5000);
			String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_divScroll\"]/div/table/tbody[2]/tr[2]")).getText();
			Assert.assertEquals(expected, "6015	Discount	249.00");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	

		ExtentReportManager.passStep(m_Driver, "Click_Cost_of_raw_material_and_consumables");

		TestModellerLogger.PassStep(m_Driver, "Click_Cost_of_raw_material_and_consumables");
	}
}