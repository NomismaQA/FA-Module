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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/74e1b38e-e136-40bf-b783-d83cbc9f6dde
@TestModellerModule(guid = "74e1b38e-e136-40bf-b783-d83cbc9f6dde")
public class CostofSales11FA775 extends BasePage
{
	public CostofSales11FA775 (WebDriver driver)
	{
		super(driver);
	}


	private By UsernameElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[1]/div/input");

	private By PasswordElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[2]/div/input");

	private By Login_ButtonElem = By.xpath("//label[contains(.,'Remember me on this computer')]/../../../../div[4]/a");

	private By AgentNameElem = By.xpath("//*[@id=\"ctl00_cPHFilter_txtAgentName\"]");

	private By Search_button1Elem = By.xpath("//*[@id=\"ctl00_cPHFilter_btnSearch\"]");

	private By _Nakul_Elem = By.xpath("//*[@id=\"ctl00_divSubContent\"]/div[3]/div/div/div/div/table/tbody/tr[2]/td[1]");
	
	private By _Clients_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_SideMenu1_businessMenu\"]/a/span");

	private By SearchCompanyElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany\"]");

	private By FilterTypeElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_ddlType\"]");

	private By Search_button2Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_btnSearch\"]");

	private By _ABC_LTD_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");
	
	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");
	
	private By _Settings_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ReportingStdTypeElem = By.xpath("//label[normalize-space()= 'Company Reporting Standard']/../div/select");

	private By chkCharitDonationsElem = By.xpath("//INPUT[@name='ctl00$cPH$chkCharitDonations']");

	private By chkDirectorsYearElem = By.xpath("//label[normalize-space()= 'Include directors who served during the year ?']/../div/input");

	private By Save_ButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By _SaveElem = By.xpath("//BUTTON[contains(text(),'Save')]");
	
	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");
	
	private By Income_Statement_PageElem = By.xpath("//A[contains(text(),'Income Statement')]");
	
	private By _5533_Elem = By.xpath("//A[contains(text(),'(5,533)')]");


	
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

 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
 		
 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(ReportingStdType);
 		
 		
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);
 	}

     
	/**
 	 * Click chkCharitDonations
     * @name Click chkCharitDonations
     */
	public void Click_chkCharitDonations()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(chkCharitDonationsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkCharitDonations", "Click_chkCharitDonations failed. Unable to locate object: " + chkCharitDonationsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkCharitDonations", "Click_chkCharitDonations failed. Unable to locate object: " + chkCharitDonationsElem.toString());

			Assert.fail("Unable to locate object: " + chkCharitDonationsElem.toString());
        }

		elem.click();
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_chkCharitDonations");

		TestModellerLogger.PassStep(m_Driver, "Click_chkCharitDonations");
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
 	 * Click Save_Button
     * @name Click Save_Button
     */
	public void Click_Save_Button()
	{
        
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

		WebElement elem = getWebElement(Save_ButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save_Button", "Click_Save_Button failed. Unable to locate object: " + Save_ButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save_Button", "Click_Save_Button failed. Unable to locate object: " + Save_ButtonElem.toString());

			Assert.fail("Unable to locate object: " + Save_ButtonElem.toString());
        }

		elem.click();
        
		m_Driver.switchTo().defaultContent();
  	

		ExtentReportManager.passStep(m_Driver, "Click_Save_Button");

		TestModellerLogger.PassStep(m_Driver, "Click_Save_Button");
	}

     
	/**
 	 * Click  Save
     * @name Click  Save
     */
	public void Click__Save()
	{
        
		WebElement elem = getWebElement(_SaveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Save", "Click__Save failed. Unable to locate object: " + _SaveElem.toString());

			Assert.fail("Unable to locate object: " + _SaveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Save");

		TestModellerLogger.PassStep(m_Driver, "Click__Save");
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
Thread.sleep(5000);
			elem.click();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	

		ExtentReportManager.passStep(m_Driver, "Click_Income_Statement_Page");

		TestModellerLogger.PassStep(m_Driver, "Click_Income_Statement_Page");
	}


	/**
	 * Click  (5,533) 
* @name Click  (5,533) 
*/
	public void Click__5533_()
	{
   
		try {
			WebElement elem = getWebElement(_5533_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__5533_", "Click__5533_ failed. Unable to locate object: " + _5533_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__5533_", "Click__5533_ failed. Unable to locate object: " + _5533_Elem.toString());

				Assert.fail("Unable to locate object: " + _5533_Elem.toString());
			}
Thread.sleep(7000);
			elem.click();
			String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_divScroll\"]/div/table/tbody[2]/tr[10]")).getText();
			Assert.assertEquals(expected, "6090	Sales commission payable	253.00");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     	

		ExtentReportManager.passStep(m_Driver, "Click__5533_");

		TestModellerLogger.PassStep(m_Driver, "Click__5533_");
	}
}