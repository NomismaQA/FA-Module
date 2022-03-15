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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/201af613-d6f0-4f4b-bcdd-8851b321040c
@TestModellerModule(guid = "201af613-d6f0-4f4b-bcdd-8851b321040c")
public class Verifyregistrationnoappearingoncoverpage extends BasePage
{
	public Verifyregistrationnoappearingoncoverpage (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By ctl00cPHpassElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Search_button1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By _Clients_Elem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ctl00ctl00ParentContentcPHFilterddlTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _Test_Demo1_Elem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");

	private By Settings1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_AccountMenu\"]/li[13]/a/span");

	private By GeneralElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbGeneral']");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress1Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress1']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress2']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress3Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress3']");

	private By ctl00cPHtbContainerTbGeneraltxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress4']");

	private By ctl00cPHtbContainerTbGeneraltxtPostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtPostCode']");

	private By ctl00cPHtbContainerTbGeneraltxtRegNoElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtRegNo']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");

	private By Final_Accounts1Elem = By.xpath("//LI[@id='ctl00_SideMenu1_FA']/A");

	private By Settings2Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ctl00cPHtxtPrincipalactivityElem = By.xpath("//*[@id=\"ctl00_cPH_txtPrincipalactivity\"]");

	private By ctl00cPHtxtAuthenticationElem = By.xpath("//*[@id=\"ctl00_cPH_txtAuthentication\"]");

	private By ctl00cPHtxtCTdistrictElem = By.xpath("//*[@id=\"ctl00_cPH_txtCTdistrict\"]");

	private By ctl00cPHtxtCTutrElem = By.xpath("//*[@id=\"ctl00_cPH_txtCTutr\"]");

	private By ctl00cPHtxtCompanySecretaryElem = By.xpath("//*[@id=\"ctl00_cPH_txtCompanySecretary\"]");

	private By ctl00cPHddlReportingStdTypeElem = By.xpath("//*[@id=\"ctl00_cPH_ddlReportingStdType\"]");

	private By ctl00cPHddlAccountantReportFormatElem = By.xpath("//*[@id=\"ctl00_cPH_ddlAccountantReportFormat\"]");

	private By ctl00cPHddlSignatoryPartnerLmtdElem = By.xpath("//*[@id=\"ctl00_cPH_ddlSignatoryPartnerLmtd\"]");

	private By radPreparedByPositionsRight_for_ctl00cPHPreparedByElem = By.xpath("//*[@id=\"ctl00_cPH_radPreparedByPositionsRight\"]");

	private By Save2Elem = By.xpath("//*[@id=\"ctl00_cphFooter_btnSave\"]");

	private By Final_Accounts2Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_liFinalAccounts\"]/a/span");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");


	
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
 	 * Enter ctl00$cPH$pass
     * @name Enter ctl00$cPH$pass
     */
 	public void Enter_ctl00cPHpass(String ctl00cPHpass)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHpassElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHpass", "Enter_ctl00cPHpass failed. Unable to locate object: " + ctl00cPHpassElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHpass", "Enter_ctl00cPHpass failed. Unable to locate object: " + ctl00cPHpassElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHpassElem.toString());
         }

 		elem.sendKeys(ctl00cPHpass);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHpass " + ctl00cPHpass);
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
Thread.sleep(1000);
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
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"b83e6fb6-2315-75b7-6980-b666b95c97d0\"]/div"));
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
Thread.sleep(10000);
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
 	 * Click  Test Demo1 
     * @name Click  Test Demo1 
     */
	public void Click__Test_Demo1_()
	{
        
		WebElement elem = getWebElement(_Test_Demo1_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Test_Demo1_", "Click__Test_Demo1_ failed. Unable to locate object: " + _Test_Demo1_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Test_Demo1_", "Click__Test_Demo1_ failed. Unable to locate object: " + _Test_Demo1_Elem.toString());

			Assert.fail("Unable to locate object: " + _Test_Demo1_Elem.toString());
        }

		elem.click();
        ChangeWindow.tabswitch(m_Driver);  	

		ExtentReportManager.passStep(m_Driver, "Click__Test_Demo1_");

		TestModellerLogger.PassStep(m_Driver, "Click__Test_Demo1_");
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
 	 * Click General
     * @name Click General
     */
	public void Click_General()
	{
        
		WebElement elem = getWebElement(GeneralElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_General", "Click_General failed. Unable to locate object: " + GeneralElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_General", "Click_General failed. Unable to locate object: " + GeneralElem.toString());

			Assert.fail("Unable to locate object: " + GeneralElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_General");

		TestModellerLogger.PassStep(m_Driver, "Click_General");
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
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress1
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress1
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(String ctl00cPHtbContainerTbGeneraltxtAddress1)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress1Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress1Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 " + ctl00cPHtbContainerTbGeneraltxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress1 " + ctl00cPHtbContainerTbGeneraltxtAddress1);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress2
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress2
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(String ctl00cPHtbContainerTbGeneraltxtAddress2)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress2Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 " + ctl00cPHtbContainerTbGeneraltxtAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress2 " + ctl00cPHtbContainerTbGeneraltxtAddress2);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress3
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress3
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(String ctl00cPHtbContainerTbGeneraltxtAddress3)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress3Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress3Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 " + ctl00cPHtbContainerTbGeneraltxtAddress3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress3 " + ctl00cPHtbContainerTbGeneraltxtAddress3);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress4
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtAddress4
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(String ctl00cPHtbContainerTbGeneraltxtAddress4)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtAddress4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4", "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress4Elem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtAddress4Elem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtAddress4);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 " + ctl00cPHtbContainerTbGeneraltxtAddress4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtAddress4 " + ctl00cPHtbContainerTbGeneraltxtAddress4);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtPostCode
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtPostCode
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(String ctl00cPHtbContainerTbGeneraltxtPostCode)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode", "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode", "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtPostCodeElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ctl00cPHtbContainerTbGeneraltxtPostCode);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode " + ctl00cPHtbContainerTbGeneraltxtPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtPostCode " + ctl00cPHtbContainerTbGeneraltxtPostCode);
 	}

      
	/**
 	 * Enter ctl00$cPH$tbContainer$TbGeneral$txtRegNo
	 * @param sData 
     * @name Enter ctl00$cPH$tbContainer$TbGeneral$txtRegNo
     */
 	public void Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(String sData)
 	{
 	    
 		try {
			WebElement elem = getWebElement(ctl00cPHtbContainerTbGeneraltxtRegNoElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo", "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo", "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());

				Assert.fail("Unable to locate object: " + ctl00cPHtbContainerTbGeneraltxtRegNoElem.toString());
			 }
			elem.clear();
Thread.sleep(5000);
			elem.sendKeys("OC121212");
			Thread.sleep(3000);
			JavascriptExecutor je = (JavascriptExecutor)m_Driver;
			je.executeScript("arguments[0].scrollIntoView(true);",elem);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo ");

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtbContainerTbGeneraltxtRegNo ");
 	}

     
	/**
 	 * Click Save1
     * @name Click Save1
     */
	public void Click_Save1()
	{
        
		WebElement elem = getWebElement(Save1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Save1", "Click_Save1 failed. Unable to locate object: " + Save1Elem.toString());

			Assert.fail("Unable to locate object: " + Save1Elem.toString());
        }

		elem.click();
          	

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
 	 * Enter ctl00$cPH$txtPrincipalactivity
	 * @param sData 
     * @name Enter ctl00$cPH$txtPrincipalactivity
     */
 	public void Enter_ctl00cPHtxtPrincipalactivity(String sData)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtPrincipalactivityElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity", "Enter_ctl00cPHtxtPrincipalactivity failed. Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtPrincipalactivityElem.toString());
         }
 		
 		elem.sendKeys();
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity ");

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtPrincipalactivity ");
 	}

      
	/**
 	 * Enter ctl00$cPH$txtAuthentication
	 * @param sData 
     * @name Enter ctl00$cPH$txtAuthentication
     */
 	public void Enter_ctl00cPHtxtAuthentication(String sData)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtAuthenticationElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtAuthentication", "Enter_ctl00cPHtxtAuthentication failed. Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtAuthenticationElem.toString());
         }
 		
 		elem.sendKeys();
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtAuthentication ");

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtAuthentication ");
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCTdistrict
	 * @param sData 
     * @name Enter ctl00$cPH$txtCTdistrict
     */
 	public void Enter_ctl00cPHtxtCTdistrict(String sData)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCTdistrictElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTdistrict", "Enter_ctl00cPHtxtCTdistrict failed. Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCTdistrictElem.toString());
         }
 		
 		elem.sendKeys();
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCTdistrict ");

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCTdistrict ");
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCTutr
	 * @param sData 
     * @name Enter ctl00$cPH$txtCTutr
     */
 	public void Enter_ctl00cPHtxtCTutr(String sData)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCTutrElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCTutr", "Enter_ctl00cPHtxtCTutr failed. Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCTutrElem.toString());
         }
 		
 		elem.sendKeys();
 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCTutr ");

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCTutr ");
 	}

      
	/**
 	 * Enter ctl00$cPH$txtCompanySecretary
     * @name Enter ctl00$cPH$txtCompanySecretary
     */
 	public void Enter_ctl00cPHtxtCompanySecretary(String ctl00cPHtxtCompanySecretary)
 	{
 	    
		m_Driver.switchTo().frame(getWebElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div[2]/div[1]/iframe")));

 		WebElement elem = getWebElement(ctl00cPHtxtCompanySecretaryElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCompanySecretary", "Enter_ctl00cPHtxtCompanySecretary failed. Unable to locate object: " + ctl00cPHtxtCompanySecretaryElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHtxtCompanySecretary", "Enter_ctl00cPHtxtCompanySecretary failed. Unable to locate object: " + ctl00cPHtxtCompanySecretaryElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHtxtCompanySecretaryElem.toString());
         }
 		elem.clear();
 		elem.sendKeys(ctl00cPHtxtCompanySecretary);
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

 		
		m_Driver.switchTo().defaultContent();

 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHtxtCompanySecretary " + ctl00cPHtxtCompanySecretary);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHtxtCompanySecretary " + ctl00cPHtxtCompanySecretary);
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
 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);

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
 	 * Select ctl00$cPH$ddlSignatoryPartnerLmtd
     * @name Select ctl00$cPH$ddlSignatoryPartnerLmtd
     */
   

     
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
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
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
      	
		String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[2]/div/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(expected, "Partnership Registration Number : OC121212 (England and Wales)");

		

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}