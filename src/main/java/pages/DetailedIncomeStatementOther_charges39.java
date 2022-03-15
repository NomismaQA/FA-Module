package pages;

import pages.BasePage;

import java.util.ArrayList;

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
import utilities.ExcelUtilsdemo;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/505bb96b-d91d-4377-88a4-50cd2fce6887
@TestModellerModule(guid = "505bb96b-d91d-4377-88a4-50cd2fce6887")
public class DetailedIncomeStatementOther_charges39 extends BasePage
{
	public DetailedIncomeStatementOther_charges39 (WebDriver driver)
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

	private By _Reports_Elem = By.xpath("//A[@href='../AccountUI/Report.aspx?FYCode=53174&CompanyCode=13249']");

	private By Trial_BalanceElem = By.xpath("/html/body/form/main/div[11]/div[3]/div/div[3]/div/div/div[1]/div/div/div/div/div[1]/table/tbody/tr[3]/td/a");

	private By Add_Financial_YearElem = By.xpath("//SELECT[@name='ctl00$ddlFinancialYear']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By Final_Accounts2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liFinalAccounts']/A");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");
	
	private By Detailed_Income_StatementElem = By.xpath("//A[contains(text(),'Detailed Income Statement')]");

	private By _Accountancy_Bookkeeping_and_Auditing_Fees_Elem = By.xpath("//TD[contains(text(),'Accountancy, Bookkeeping and Auditing Fees')]");


	
	public void GoToUrl() {
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL",
				"http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6");

		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL",
				"http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6");
	}

	/**
	 * AssertUrl
	 * 
	 * @name AssertUrl
	 */
	public void AssertUrl() {
		String currentUrl = m_Driver.getCurrentUrl();
		String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6";

		if (!currentUrl.equals(
				"http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=9692e818-9583-41a5-bb76-e606ac6438a6")) {
			Assert.fail("Expecting URL - " + expectedUrl + " Found " + currentUrl);
		}
	}

	public void Enter_Username(String Username) {

		WebElement elem = getWebElement(UsernameElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username",
					"Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username",
					"Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

			Assert.fail("Unable to locate object: " + UsernameElem.toString());
		}

		elem.sendKeys(Username);

		ExtentReportManager.passStep(m_Driver, "Enter_Username " + Username);

		TestModellerLogger.PassStep(m_Driver, "Enter_Username " + Username);
	}

	/**
	 * Enter Password
	 * 
	 * @name Enter Password
	 */
	public void Enter_Password(String Password) {

		WebElement elem = getWebElement(PasswordElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Password",
					"Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Password",
					"Enter_Password failed. Unable to locate object: " + PasswordElem.toString());

			Assert.fail("Unable to locate object: " + PasswordElem.toString());
		}

		elem.sendKeys(Password);

		ExtentReportManager.passStep(m_Driver, "Enter_Password " + Password);

		TestModellerLogger.PassStep(m_Driver, "Enter_Password " + Password);
	}

	/**
	 * Click Login_Button
	 * 
	 * @name Click Login_Button
	 */
	public void Click_Login_Button() {

		WebElement elem = getWebElement(Login_ButtonElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login_Button",
					"Click_Login_Button failed. Unable to locate object: " + Login_ButtonElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login_Button",
					"Click_Login_Button failed. Unable to locate object: " + Login_ButtonElem.toString());

			Assert.fail("Unable to locate object: " + Login_ButtonElem.toString());
		}

		elem.click();

		ExtentReportManager.passStep(m_Driver, "Click_Login_Button");

		TestModellerLogger.PassStep(m_Driver, "Click_Login_Button");
	}

	/**
	 * Enter AgentName
	 * 
	 * @name Enter AgentName
	 */
	public void Enter_AgentName(String AgentName) {

		try {
			handlepopup1();
			WebElement elem = getWebElement(AgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_AgentName",
						"Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_AgentName",
						"Enter_AgentName failed. Unable to locate object: " + AgentNameElem.toString());

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

	public boolean handlepopup1() {
		boolean data = false;
		try {
			Thread.sleep(10000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"c5dab210-d7ce-cc0f-c3d1-305a557eda28\"]"));
			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			System.out.println(true);
			return true;
		} catch (Exception e) {
			System.out.println(false);
			return data;
		}
	}

	/**
	 * Click Search_button1
	 * 
	 * @name Click Search_button1
	 */
	public void Click_Search_button1() {

		try {
			WebElement elem = getWebElement(Search_button1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button1",
						"Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button1",
						"Click_Search_button1 failed. Unable to locate object: " + Search_button1Elem.toString());

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
	 * Click Nakul@@
	 * 
	 * @name Click Nakul@@
	 */
	public void Click__Nakul_() {

		try {
			handlepopup2();
			WebElement elem = getWebElement(_Nakul_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nakul_",
						"Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nakul_",
						"Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				Assert.fail("Unable to locate object: " + _Nakul_Elem.toString());
			}
			Thread.sleep(10000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}

	public boolean handlepopup2() {
		boolean data = false;
		try {
			Thread.sleep(10000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"c1adb149-35e3-412e-aaed-90409abd5247\"]"));
			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			System.out.println(true);
			return true;
		} catch (Exception e) {
			System.out.println(false);
			return data;
		}
	}

	public void Click__Clients_() {

		try {
			handlepopup3();
			WebElement elem = getWebElement(_Clients_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Clients_",
						"Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Clients_",
						"Click__Clients_ failed. Unable to locate object: " + _Clients_Elem.toString());

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

	public boolean handlepopup3() {
		boolean data = false;
		try {
			Thread.sleep(10000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"861c5dc3-bdbe-477f-97b2-c5b619f59cc2\"]"));
			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			System.out.println(true);
			return true;
		} catch (Exception e) {
			System.out.println(false);
			return data;
		}
	}
	/**
	 * Enter SearchCompany
	 * 
	 * @name Enter SearchCompany
	 */
	public void Enter_SearchCompany(String SearchCompany) {

		try {
			WebElement elem = getWebElement(SearchCompanyElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchCompany",
						"Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchCompany",
						"Enter_SearchCompany failed. Unable to locate object: " + SearchCompanyElem.toString());

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
	 * 
	 * @name Select FilterType
	 */
	public void Select_FilterType(String FilterType) {

		WebElement elem = getWebElement(FilterTypeElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_FilterType",
					"Select_FilterType failed. Unable to locate object: " + FilterTypeElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_FilterType",
					"Select_FilterType failed. Unable to locate object: " + FilterTypeElem.toString());

			Assert.fail("Unable to locate object: " + FilterTypeElem.toString());
		}

		Select dropdown = new Select(elem);

		dropdown.selectByVisibleText(FilterType);

		ExtentReportManager.passStep(m_Driver, "Select_FilterType " + FilterType);

		TestModellerLogger.PassStep(m_Driver, "Select_FilterType " + FilterType);
	}

	/**
	 * Click Search_button2
	 * 
	 * @name Click Search_button2
	 */
	public void Click_Search_button2() {

		WebElement elem = getWebElement(Search_button2Elem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button2",
					"Click_Search_button2 failed. Unable to locate object: " + Search_button2Elem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button2",
					"Click_Search_button2 failed. Unable to locate object: " + Search_button2Elem.toString());

			Assert.fail("Unable to locate object: " + Search_button2Elem.toString());
		}

		elem.click();

		ExtentReportManager.passStep(m_Driver, "Click_Search_button2");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button2");
	}

	/**
	 * Click ABC LTD
	 * 
	 * @name Click ABC LTD
	 */
	public void Click__ABC_LTD_() {

		try {
			WebElement elem = getWebElement(_ABC_LTD_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__ABC_LTD_",
						"Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__ABC_LTD_",
						"Click__ABC_LTD_ failed. Unable to locate object: " + _ABC_LTD_Elem.toString());

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

	public void Click__Reports_() {

		WebElement elem = getWebElement(_Reports_Elem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Reports_",
					"Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Reports_",
					"Click__Reports_ failed. Unable to locate object: " + _Reports_Elem.toString());

			Assert.fail("Unable to locate object: " + _Reports_Elem.toString());
		}

		elem.click();

		ExtentReportManager.passStep(m_Driver, "Click__Reports_");

		TestModellerLogger.PassStep(m_Driver, "Click__Reports_");
	}

	/**
	 * Click Trial Balance
	 * 
	 * @name Click Trial Balance
	 */
	public void Click_Trial_Balance() {

		WebElement elem = getWebElement(Trial_BalanceElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Trial_Balance",
					"Click_Trial_Balance failed. Unable to locate object: " + Trial_BalanceElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Trial_Balance",
					"Click_Trial_Balance failed. Unable to locate object: " + Trial_BalanceElem.toString());

			Assert.fail("Unable to locate object: " + Trial_BalanceElem.toString());
		}

		elem.click();

		ExtentReportManager.passStep(m_Driver, "Click_Trial_Balance");

		TestModellerLogger.PassStep(m_Driver, "Click_Trial_Balance");
	}

	/**
	 * Select Add_Financial_Year
	 * 
	 * @name Select Add_Financial_Year
	 */
	public void Select_Add_Financial_Year(String Add_Financial_Year) {

		WebElement elem = getWebElement(Add_Financial_YearElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_Add_Financial_Year",
					"Select_Add_Financial_Year failed. Unable to locate object: " + Add_Financial_YearElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_Add_Financial_Year",
					"Select_Add_Financial_Year failed. Unable to locate object: " + Add_Financial_YearElem.toString());

			Assert.fail("Unable to locate object: " + Add_Financial_YearElem.toString());
		}

		Select dropdown = new Select(elem);

		dropdown.selectByVisibleText(Add_Financial_Year);

		ExtentReportManager.passStep(m_Driver, "Select_Add_Financial_Year " + Add_Financial_Year);

		TestModellerLogger.PassStep(m_Driver, "Select_Add_Financial_Year " + Add_Financial_Year);
	}

//	/**
//	 * Click  Final Accounts 
//    * @name Click  Final Accounts 
//    */
//	public void Click__Final_Accounts_()
//	{
//       
//		WebElement elem = getWebElement(_Final_Accounts_Elem);
//
//		if (elem == null) {
//   		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Final_Accounts_", "Click__Final_Accounts_ failed. Unable to locate object: " + _Final_Accounts_Elem.toString());
//
//   		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Final_Accounts_", "Click__Final_Accounts_ failed. Unable to locate object: " + _Final_Accounts_Elem.toString());
//
//			Assert.fail("Unable to locate object: " + _Final_Accounts_Elem.toString());
//       }
//
//		elem.click();
//         	
//
//		ExtentReportManager.passStep(m_Driver, "Click__Final_Accounts_");
//
//		TestModellerLogger.PassStep(m_Driver, "Click__Final_Accounts_");
//	}

	public void Click_Final_Accounts1() {

		WebElement elem = getWebElement(Final_Accounts1Elem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts1",
					"Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts1Elem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts1",
					"Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts1Elem.toString());

			Assert.fail("Unable to locate object: " + Final_Accounts1Elem.toString());
		}

		elem.click();
		ChangeWindow.tabswitch(m_Driver);

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts1");
	}

	public void Click_Final_Accounts2() {

		WebElement elem = getWebElement(Final_Accounts2Elem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts1",
					"Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts1",
					"Click_Final_Accounts1 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

			Assert.fail("Unable to locate object: " + Final_Accounts2Elem.toString());
		}

		elem.click();

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts1");
	}

	/**
	 * Click Full Accounts
	 * 
	 * @name Click Full Accounts
	 */
	public void Click_Full_Accounts() {

		WebElement elem = getWebElement(Full_AccountsElem);

		if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Full_Accounts",
					"Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Full_Accounts",
					"Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

			Assert.fail("Unable to locate object: " + Full_AccountsElem.toString());
		}

		elem.click();

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}

     
	/**
 	 * Click Detailed Income Statement
     * @name Click Detailed Income Statement
     */
	public void Click_Detailed_Income_Statement()
	{
        
		WebElement elem = getWebElement(Detailed_Income_StatementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Detailed_Income_Statement", "Click_Detailed_Income_Statement failed. Unable to locate object: " + Detailed_Income_StatementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Detailed_Income_Statement", "Click_Detailed_Income_Statement failed. Unable to locate object: " + Detailed_Income_StatementElem.toString());

			Assert.fail("Unable to locate object: " + Detailed_Income_StatementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Detailed_Income_Statement");

		TestModellerLogger.PassStep(m_Driver, "Click_Detailed_Income_Statement");
	}

     
	/**
 	 * Click  Accountancy, Bookkeeping and Auditing Fees 
     * @name Click  Accountancy, Bookkeeping and Auditing Fees 
     */
	public void Click__Accountancy_Bookkeeping_and_Auditing_Fees_()
	{
        
		try {
//			WebElement elem = getWebElement(_Accountancy_Bookkeeping_and_Auditing_Fees_Elem);
//
//			if (elem == null) {
//				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Accountancy_Bookkeeping_and_Auditing_Fees_", "Click__Accountancy_Bookkeeping_and_Auditing_Fees_ failed. Unable to locate object: " + _Accountancy_Bookkeeping_and_Auditing_Fees_Elem.toString());
//
//				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Accountancy_Bookkeeping_and_Auditing_Fees_", "Click__Accountancy_Bookkeeping_and_Auditing_Fees_ failed. Unable to locate object: " + _Accountancy_Bookkeeping_and_Auditing_Fees_Elem.toString());
//
//				Assert.fail("Unable to locate object: " + _Accountancy_Bookkeeping_and_Auditing_Fees_Elem.toString());
//			}

			System.out.println();
			ArrayList<String>tabs= new ArrayList<String>(m_Driver.getWindowHandles());
			m_Driver.switchTo().window(tabs.get(3));
			String expected = m_Driver.findElement(By.xpath("//*[@id=\"disDiv\"]/div/div[13]/div/table[2]/tbody/tr[49]/td[1]")).getText();
			Thread.sleep(5000);
			System.out.println(expected);
			String actualdata = m_Driver.findElement(By.xpath("//*[@id=\"disDiv\"]/div/div[13]/div/table[2]/tbody/tr[49]/td[1]")).getText();
			
			//elem.click();
			Thread.sleep(3000);
			m_Driver.switchTo().window(tabs.get(2));
					//	elem.click();
						Thread.sleep(5000);
						//String expected = m_Driver.findElement(By.xpath("//*[@id=\"disDiv\"]/div/div[9]/div/table[2]/tbody/tr[25]/td[3]/a/ix:nonfraction")).getText();
						Assert.assertEquals(expected, actualdata);
						
						ArrayList<String>datata=new ArrayList<String>();
						for(int i=3;i<=360;i++)
						{
						
							if(i==7||i==15||i==28||i==104||i==112||i==258||i==263||i==281||i==287||i==289||i==293||i==304||i==325||i==343||i==351||i==354)
							{
								i++;
							}
							
						
							datata.add(m_Driver.findElement(By.xpath("//*[@id='table1']/tbody[2]/tr["+i+"]/td[2]")).getText());
						}
							ArrayList<String>list= new ArrayList<String>();
							String path="C:\\Nomisma\\Nakul\\TestModeller-JavaSeleniumFramework-master\\Framework\\testdata\\Detailed P&L Report (1).xlsx";
							for(int i=144;i<=160;i++)
							{
								
								
								list.add(ExcelUtilsdemo.getRaddata(path, i, 0));
							}
						
							 boolean flag=false;
			  for(String dd:list) 
			  {
				 
				  for(String dd1:datata)
				  { 
					  if(dd.equals(dd1))
					  {
						  Assert.assertEquals(dd, dd1);
						  flag=true;
					  }
				  }
			  }
			  if(flag==false)
			  {
				  Assert.assertEquals(flag, true);
			  }						
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
          						
		
          	

		ExtentReportManager.passStep(m_Driver, "Click__Accountancy_Bookkeeping_and_Auditing_Fees_");

		TestModellerLogger.PassStep(m_Driver, "Click__Accountancy_Bookkeeping_and_Auditing_Fees_");
	


}
}