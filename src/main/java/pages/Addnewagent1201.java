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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/e7649c4d-1688-4212-957b-28e6da694c8f
@TestModellerModule(guid = "e7649c4d-1688-4212-957b-28e6da694c8f")
public class Addnewagent1201 extends BasePage
{
	public Addnewagent1201 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By _Add_Agent_Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnAdd']");

	private By AgentNameElem = By.xpath("//INPUT[@name='ctl00$cPH$txtFavLnkName']");

	private By chkIsActiveElem = By.xpath("//INPUT[@id='ctl00_cPH_chkIsActive']");

	private By TrialEndDateElem = By.xpath("//INPUT[@name='ctl00$cPH$txtEndDate']");

	private By chkIsTestElem = By.xpath("//INPUT[@id='ctl00_cPH_chkIsTest']");

	private By Enterprise_AllinoneElem = By.xpath("//INPUT[@id='ctl00_cPH_cblPackage_0']");

	private By BookkeepingElem = By.xpath("//INPUT[@id='ctl00_cPH_cblPackage_1']");

	private By Bookkeeping_PayrollElem = By.xpath("//INPUT[@id='ctl00_cPH_cblPackage_2']");

	private By Final_AccountsElem = By.xpath("//INPUT[@id='ctl00_cPH_cblPackage_3']");

	private By Self_AssessmentElem = By.xpath("//INPUT[@id='ctl00_cPH_cblPackage_4']");

	private By PayrollElem = By.xpath("//INPUT[@id='ctl00_cPH_cblPackage_5']");

	private By MaxAccountantUserElem = By.xpath("//INPUT[@name='ctl00$cPH$txt_AccUser']");

	private By MaxBussinessUserElem = By.xpath("//INPUT[@name='ctl00$cPH$txt_BusUser']");

	private By MaximumBusinessElem = By.xpath("//INPUT[@name='ctl00$cPH$txt_Bus']");

	private By chkaccinfoaccessElem = By.xpath("//INPUT[@id='ctl00_cPH_chkaccinfo']");

	private By ChkViewTypeElem = By.xpath("//INPUT[@id='ctl00_cPH_ChkViewType']");

	private By ChkCreditcontrolaccessElem = By.xpath("//INPUT[@id='ctl00_cPH_ChkCredit']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_cPH_btnSave']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=4d4ad7a1-fb7f-4540-b868-485437c16bfa");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=4d4ad7a1-fb7f-4540-b868-485437c16bfa");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=4d4ad7a1-fb7f-4540-b868-485437c16bfa");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=4d4ad7a1-fb7f-4540-b868-485437c16bfa";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=4d4ad7a1-fb7f-4540-b868-485437c16bfa")) {
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
	public void Click_LoginButton()
	{
        
		WebElement elem = getWebElement(LoginButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LoginButton", "Click_LoginButton failed. Unable to locate object: " + LoginButtonElem.toString());

			Assert.fail("Unable to locate object: " + LoginButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LoginButton");

		TestModellerLogger.PassStep(m_Driver, "Click_LoginButton");
	}

     
	/**
 	 * Click  Add Agent 
     * @name Click  Add Agent 
     */
	public void Click__Add_Agent_()
	{
        
		WebElement elem = getWebElement(_Add_Agent_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Add_Agent_", "Click__Add_Agent_ failed. Unable to locate object: " + _Add_Agent_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Add_Agent_", "Click__Add_Agent_ failed. Unable to locate object: " + _Add_Agent_Elem.toString());

			Assert.fail("Unable to locate object: " + _Add_Agent_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Add_Agent_");

		TestModellerLogger.PassStep(m_Driver, "Click__Add_Agent_");
	}

      
	/**
 	 * Enter Agent_Name
     * @name Enter Agent_Name
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
 	 * Click chkIsActive
     * @name Click chkIsActive
     */
	public void Click_chkIsActive()
	{
        
		WebElement elem = getWebElement(chkIsActiveElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkIsActive", "Click_chkIsActive failed. Unable to locate object: " + chkIsActiveElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkIsActive", "Click_chkIsActive failed. Unable to locate object: " + chkIsActiveElem.toString());

			Assert.fail("Unable to locate object: " + chkIsActiveElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkIsActive");

		TestModellerLogger.PassStep(m_Driver, "Click_chkIsActive");
	}

      
	/**
 	 * Enter Trial_End_Date
     * @name Enter Trial_End_Date
     */
 	public void Enter_TrialEndDate(String TrialEndDate)
 	{
 	    
 		WebElement elem = getWebElement(TrialEndDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_TrialEndDate", "Enter_TrialEndDate failed. Unable to locate object: " + TrialEndDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_TrialEndDate", "Enter_TrialEndDate failed. Unable to locate object: " + TrialEndDateElem.toString());

 			Assert.fail("Unable to locate object: " + TrialEndDateElem.toString());
         }

 		elem.sendKeys(TrialEndDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_TrialEndDate " + TrialEndDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_TrialEndDate " + TrialEndDate);
 	}

     
	/**
 	 * Click chkIsTest
     * @name Click chkIsTest
     */
	public void Click_chkIsTest()
	{
        
		WebElement elem = getWebElement(chkIsTestElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkIsTest", "Click_chkIsTest failed. Unable to locate object: " + chkIsTestElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkIsTest", "Click_chkIsTest failed. Unable to locate object: " + chkIsTestElem.toString());

			Assert.fail("Unable to locate object: " + chkIsTestElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkIsTest");

		TestModellerLogger.PassStep(m_Driver, "Click_chkIsTest");
	}

     
	/**
 	 * Click Enterprise (All-in-one)
     * @name Click Enterprise (All-in-one)
     */
	public void Click_Enterprise_Allinone()
	{
        
		WebElement elem = getWebElement(Enterprise_AllinoneElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Enterprise_Allinone", "Click_Enterprise_Allinone failed. Unable to locate object: " + Enterprise_AllinoneElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Enterprise_Allinone", "Click_Enterprise_Allinone failed. Unable to locate object: " + Enterprise_AllinoneElem.toString());

			Assert.fail("Unable to locate object: " + Enterprise_AllinoneElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Enterprise_Allinone");

		TestModellerLogger.PassStep(m_Driver, "Click_Enterprise_Allinone");
	}

     
	/**
 	 * Click Bookkeeping
     * @name Click Bookkeeping
     */
	public void Click_Bookkeeping()
	{
        
		WebElement elem = getWebElement(BookkeepingElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bookkeeping", "Click_Bookkeeping failed. Unable to locate object: " + BookkeepingElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bookkeeping", "Click_Bookkeeping failed. Unable to locate object: " + BookkeepingElem.toString());

			Assert.fail("Unable to locate object: " + BookkeepingElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bookkeeping");

		TestModellerLogger.PassStep(m_Driver, "Click_Bookkeeping");
	}

     
	/**
 	 * Click Bookkeeping + Payroll
     * @name Click Bookkeeping + Payroll
     */
	public void Click_Bookkeeping_Payroll()
	{
        
		WebElement elem = getWebElement(Bookkeeping_PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Bookkeeping_Payroll", "Click_Bookkeeping_Payroll failed. Unable to locate object: " + Bookkeeping_PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Bookkeeping_Payroll", "Click_Bookkeeping_Payroll failed. Unable to locate object: " + Bookkeeping_PayrollElem.toString());

			Assert.fail("Unable to locate object: " + Bookkeeping_PayrollElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Bookkeeping_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Bookkeeping_Payroll");
	}

     
	/**
 	 * Click Final Accounts
     * @name Click Final Accounts
     */
	public void Click_Final_Accounts()
	{
        
		WebElement elem = getWebElement(Final_AccountsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts", "Click_Final_Accounts failed. Unable to locate object: " + Final_AccountsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts", "Click_Final_Accounts failed. Unable to locate object: " + Final_AccountsElem.toString());

			Assert.fail("Unable to locate object: " + Final_AccountsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts");
	}

     
	/**
 	 * Click Self Assessment
     * @name Click Self Assessment
     */
	public void Click_Self_Assessment()
	{
        
		WebElement elem = getWebElement(Self_AssessmentElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Self_Assessment", "Click_Self_Assessment failed. Unable to locate object: " + Self_AssessmentElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Self_Assessment", "Click_Self_Assessment failed. Unable to locate object: " + Self_AssessmentElem.toString());

			Assert.fail("Unable to locate object: " + Self_AssessmentElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Self_Assessment");

		TestModellerLogger.PassStep(m_Driver, "Click_Self_Assessment");
	}

     
	/**
 	 * Click Payroll
     * @name Click Payroll
     */
	public void Click_Payroll()
	{
        
		WebElement elem = getWebElement(PayrollElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Payroll", "Click_Payroll failed. Unable to locate object: " + PayrollElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Payroll", "Click_Payroll failed. Unable to locate object: " + PayrollElem.toString());

			Assert.fail("Unable to locate object: " + PayrollElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Payroll");

		TestModellerLogger.PassStep(m_Driver, "Click_Payroll");
	}

      
	/**
 	 * Enter Max_Accountant_User
     * @name Enter Max_Accountant_User
     */
 	public void Enter_MaxAccountantUser(String MaxAccountantUser)
 	{
 	    
 		WebElement elem = getWebElement(MaxAccountantUserElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_MaxAccountantUser", "Enter_MaxAccountantUser failed. Unable to locate object: " + MaxAccountantUserElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_MaxAccountantUser", "Enter_MaxAccountantUser failed. Unable to locate object: " + MaxAccountantUserElem.toString());

 			Assert.fail("Unable to locate object: " + MaxAccountantUserElem.toString());
         }

 		elem.sendKeys(MaxAccountantUser);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_MaxAccountantUser " + MaxAccountantUser);

  		TestModellerLogger.PassStep(m_Driver, "Enter_MaxAccountantUser " + MaxAccountantUser);
 	}

      
	/**
 	 * Enter Max_Bussiness_User
     * @name Enter Max_Bussiness_User
     */
 	public void Enter_MaxBussinessUser(String MaxBussinessUser)
 	{
 	    
 		WebElement elem = getWebElement(MaxBussinessUserElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_MaxBussinessUser", "Enter_MaxBussinessUser failed. Unable to locate object: " + MaxBussinessUserElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_MaxBussinessUser", "Enter_MaxBussinessUser failed. Unable to locate object: " + MaxBussinessUserElem.toString());

 			Assert.fail("Unable to locate object: " + MaxBussinessUserElem.toString());
         }

 		elem.sendKeys(MaxBussinessUser);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_MaxBussinessUser " + MaxBussinessUser);

  		TestModellerLogger.PassStep(m_Driver, "Enter_MaxBussinessUser " + MaxBussinessUser);
 	}

      
	/**
 	 * Enter Maximum_Business
     * @name Enter Maximum_Business
     */
 	public void Enter_MaximumBusiness(String MaximumBusiness)
 	{
 	    
 		WebElement elem = getWebElement(MaximumBusinessElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_MaximumBusiness", "Enter_MaximumBusiness failed. Unable to locate object: " + MaximumBusinessElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_MaximumBusiness", "Enter_MaximumBusiness failed. Unable to locate object: " + MaximumBusinessElem.toString());

 			Assert.fail("Unable to locate object: " + MaximumBusinessElem.toString());
         }

 		elem.sendKeys(MaximumBusiness);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_MaximumBusiness " + MaximumBusiness);

  		TestModellerLogger.PassStep(m_Driver, "Enter_MaximumBusiness " + MaximumBusiness);
 	}

     
	/**
 	 * Click chkaccinfo_access
     * @name Click chkaccinfo_access
     */
	public void Click_chkaccinfoaccess()
	{
        
		WebElement elem = getWebElement(chkaccinfoaccessElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_chkaccinfoaccess", "Click_chkaccinfoaccess failed. Unable to locate object: " + chkaccinfoaccessElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_chkaccinfoaccess", "Click_chkaccinfoaccess failed. Unable to locate object: " + chkaccinfoaccessElem.toString());

			Assert.fail("Unable to locate object: " + chkaccinfoaccessElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_chkaccinfoaccess");

		TestModellerLogger.PassStep(m_Driver, "Click_chkaccinfoaccess");
	}

     
	/**
 	 * Click ChkViewType
     * @name Click ChkViewType
     */
	public void Click_ChkViewType()
	{
        
		WebElement elem = getWebElement(ChkViewTypeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ChkViewType", "Click_ChkViewType failed. Unable to locate object: " + ChkViewTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ChkViewType", "Click_ChkViewType failed. Unable to locate object: " + ChkViewTypeElem.toString());

			Assert.fail("Unable to locate object: " + ChkViewTypeElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ChkViewType");

		TestModellerLogger.PassStep(m_Driver, "Click_ChkViewType");
	}

     
	/**
 	 * Click ChkCredit_control_access
     * @name Click ChkCredit_control_access
     */
	public void Click_ChkCreditcontrolaccess()
	{
        
		WebElement elem = getWebElement(ChkCreditcontrolaccessElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ChkCreditcontrolaccess", "Click_ChkCreditcontrolaccess failed. Unable to locate object: " + ChkCreditcontrolaccessElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ChkCreditcontrolaccess", "Click_ChkCreditcontrolaccess failed. Unable to locate object: " + ChkCreditcontrolaccessElem.toString());

			Assert.fail("Unable to locate object: " + ChkCreditcontrolaccessElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_ChkCreditcontrolaccess");

		TestModellerLogger.PassStep(m_Driver, "Click_ChkCreditcontrolaccess");
	}

     
	/**
 	 * Click Save_Button
     * @name Click Save_Button
     */
	public void Click_SaveButton()
	{
        
		WebElement elem = getWebElement(SaveButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SaveButton", "Click_SaveButton failed. Unable to locate object: " + SaveButtonElem.toString());

			Assert.fail("Unable to locate object: " + SaveButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SaveButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SaveButton");
	}
}