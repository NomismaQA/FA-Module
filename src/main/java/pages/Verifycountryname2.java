package pages;

import pages.BasePage;

import java.awt.Window;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/c062330a-55ef-4b7c-9809-37e5f3e7fd78
@TestModellerModule(guid = "c062330a-55ef-4b7c-9809-37e5f3e7fd78")
public class Verifycountryname2 extends BasePage
{
	public Verifycountryname2 (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By SearchAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Searchbutton1Elem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By AgentnameElem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By ClientsElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A/SPAN[@class='side_nav_text']");

	private By SearchcompanyElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPHFilter_txtSearchCompany\"]");

	private By CompanyTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Searchbutton2Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _Friends_Test_CompanyElem = By.cssSelector("TD[onclick='navigateIn\\(this\\)']");

	private By Settings1Elem = By.xpath("//*[@id=\"ctl00_SideMenu1_AccountMenu\"]/li[13]/a/span");

	private By Edit1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnEdit']");

	private By GeneralElem = By.xpath("//SPAN[@id='__tab_ctl00_cPH_tbContainer_TbGeneral']");

	private By ContainerTbGeneraltxtRegNoElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtRegNo']");

	private By ContainerTbGeneraltxtAddress1Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress1']");

	private By ContainerTbGeneraltxtAddress2Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress2']");

	private By ContainerTbGeneraltxtAddress3Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress3']");

	private By ContainerTbGeneraltxtAddress4Elem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtAddress4']");

	private By ContainerTbGeneraltxtPostCodeElem = By.xpath("//INPUT[@name='ctl00$cPH$tbContainer$TbGeneral$txtPostCode']");

	private By Save1Elem = By.xpath("//A[@id='ctl00_cPH_tbContainer_TbGeneral_btnGSave']");

	private By Final_Accounts1Elem = By.xpath("//SPAN[contains(text(),'Final Accounts')]");

	private By Settings2Elem = By.xpath("//SPAN[contains(text(),'Settings')]");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']/IMG");

	private By ReportingStdTypeElem = By.xpath("//SELECT[@name='ctl00$cPH$ddlReportingStdType']");

	private By Save2Elem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By Final_Accounts2Elem = By.xpath("//SPAN[contains(text(),'Final Accounts')]");

	private By Full_AccountsElem = By.xpath("//A[contains(text(),'Full Accounts')]");
	
	private By Report=By.xpath("//*[@id='ctl00_cPH_oldltCTPreview']/div/div/div[1]/table[1]/tbody/tr[1]/td");
	private By unablereport=By.xpath("	//*[@id='ctl00_cPH_oldltCTPreview']/div/div");


	
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
 	 * Enter Search_Agent_Name
     * @name Enter Search_Agent_Name
     */
 	public void Enter_SearchAgentName(String SearchAgentName)
 	{
 		try {
			handlepopup();
			WebElement elem = getWebElement(SearchAgentNameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_SearchAgentName", "Enter_SearchAgentName failed. Unable to locate object: " + SearchAgentNameElem.toString());

				Assert.fail("Unable to locate object: " + SearchAgentNameElem.toString());
			 }
			Thread.sleep(1000);
			handlepopup();
			elem.sendKeys(SearchAgentName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_SearchAgentName " + SearchAgentName);
 	}

 	public boolean handlepopup()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(1000);
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
	public void Click_Searchbutton1()
	{
        
		try {
			WebElement elem = getWebElement(Searchbutton1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbutton1", "Click_Searchbutton1 failed. Unable to locate object: " + Searchbutton1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbutton1", "Click_Searchbutton1 failed. Unable to locate object: " + Searchbutton1Elem.toString());

				Assert.fail("Unable to locate object: " + Searchbutton1Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Searchbutton1");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbutton1");
	}

     
	/**
 	 * Click Agentname
     * @name Click Agentname
     */
	public void Click_Agentname()
	{
        
		try {
			WebElement elem = getWebElement(AgentnameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Agentname", "Click_Agentname failed. Unable to locate object: " + AgentnameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Agentname", "Click_Agentname failed. Unable to locate object: " + AgentnameElem.toString());

				Assert.fail("Unable to locate object: " + AgentnameElem.toString());
			}
Thread.sleep(1000);
			elem.click();
			  	
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExtentReportManager.passStep(m_Driver, "Click_Agentname");

		TestModellerLogger.PassStep(m_Driver, "Click_Agentname");
	}

//	public boolean handlepopup()
//	{
//		boolean data=false;
//		try 
//		{
//			Thread.sleep(10000);
//			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"b9a519c5-eefc-9ffc-8726-14a814341197\"]/div"));
//			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
//			wait.until(ExpectedConditions.visibilityOf(ele));
//			ele.click();
//			System.out.println(true);
//			return true;
//		} catch (Exception e) 
//		{
//			System.out.println(false);
//			return data;
//		}
//	}
     
	/**
 	 * Click Clients
     * @name Click Clients
     */
	public void Click_Clients()
	{
        
		WebElement elem = getWebElement(ClientsElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

			Assert.fail("Unable to locate object: " + ClientsElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clients");

		TestModellerLogger.PassStep(m_Driver, "Click_Clients");
	}

      
	/**
 	 * Enter Searchcompany
     * @name Enter Searchcompany
     */
 	public void Enter_Searchcompany(String Searchcompany)
 	{
 	    
 		WebElement elem = getWebElement(SearchcompanyElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchcompany", "Enter_Searchcompany failed. Unable to locate object: " + SearchcompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchcompany", "Enter_Searchcompany failed. Unable to locate object: " + SearchcompanyElem.toString());

 			Assert.fail("Unable to locate object: " + SearchcompanyElem.toString());
         }

 		elem.sendKeys(Searchcompany);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Searchcompany " + Searchcompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Searchcompany " + Searchcompany);
 	}

    
	/**
 	 * Select CompanyType
     * @name Select CompanyType
     */
    public void Select_CompanyType(String CompanyType)
 	{
 	    
 		WebElement elem = getWebElement(CompanyTypeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_CompanyType", "Select_CompanyType failed. Unable to locate object: " + CompanyTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_CompanyType", "Select_CompanyType failed. Unable to locate object: " + CompanyTypeElem.toString());

 			Assert.fail("Unable to locate object: " + CompanyTypeElem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(CompanyType);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_CompanyType " + CompanyType);

 		TestModellerLogger.PassStep(m_Driver, "Select_CompanyType " + CompanyType);
 	}

     
	/**
 	 * Click Search_button2
     * @name Click Search_button2
     */
	public void Click_Searchbutton2()
	{
        
		WebElement elem = getWebElement(Searchbutton2Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbutton2", "Click_Searchbutton2 failed. Unable to locate object: " + Searchbutton2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbutton2", "Click_Searchbutton2 failed. Unable to locate object: " + Searchbutton2Elem.toString());

			Assert.fail("Unable to locate object: " + Searchbutton2Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Searchbutton2");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbutton2");
	}

     
	/**
 	 * Click  Friends Test Company
     * @name Click  Friends Test Company
     */
	public void Click__Friends_Test_Company()
	{
		try {
			handlepopup1();
			WebElement elem = getWebElement(_Friends_Test_CompanyElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Friends_Test_Company", "Click__Friends_Test_Company failed. Unable to locate object: " + _Friends_Test_CompanyElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Friends_Test_Company", "Click__Friends_Test_Company failed. Unable to locate object: " + _Friends_Test_CompanyElem.toString());

				Assert.fail("Unable to locate object: " + _Friends_Test_CompanyElem.toString());
			}
Thread.sleep(1000);
			elem.click();
			 	
ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExtentReportManager.passStep(m_Driver, "Click__Friends_Test_Company");

		TestModellerLogger.PassStep(m_Driver, "Click__Friends_Test_Company");
	}
	
	public boolean handlepopup1()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(5000);
			WebElement ele = m_Driver.findElement(By.xpath("//*[@id=\"7dccf84d-d39e-de97-fc27-8b41c77a2724\"]"));
			WebDriverWait wait = new WebDriverWait(m_Driver, 180);
			wait.until(ExpectedConditions.visibilityOf(ele));
			ele.click();
			System.out.println(true);
			return true;
		} 
		catch (Exception e) 
		{
			System.out.println(false);
			return data;
		}
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
//		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
//		 je.executeScript("arguments[0].scrollIntoView(true);",elem);
		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_General");

		TestModellerLogger.PassStep(m_Driver, "Click_General");
	}

      
	/**
 	 * Enter Container$TbGeneral$txtRegNo
     * @name Enter Container$TbGeneral$txtRegNo
     */
 	public void Enter_ContainerTbGeneraltxtRegNo(String ContainerTbGeneraltxtRegNo)
 	{
 	    
 		WebElement elem = getWebElement(ContainerTbGeneraltxtRegNoElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtRegNo", "Enter_ContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ContainerTbGeneraltxtRegNoElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtRegNo", "Enter_ContainerTbGeneraltxtRegNo failed. Unable to locate object: " + ContainerTbGeneraltxtRegNoElem.toString());

 			Assert.fail("Unable to locate object: " + ContainerTbGeneraltxtRegNoElem.toString());
         }
elem.clear();
 		elem.sendKeys(ContainerTbGeneraltxtRegNo);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContainerTbGeneraltxtRegNo " + ContainerTbGeneraltxtRegNo);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContainerTbGeneraltxtRegNo " + ContainerTbGeneraltxtRegNo);
 	}

      
	/**
 	 * Enter Container$TbGeneral$txtAddress1
     * @name Enter Container$TbGeneral$txtAddress1
     */
 	public void Enter_ContainerTbGeneraltxtAddress1(String ContainerTbGeneraltxtAddress1)
 	{
 	    
 		WebElement elem = getWebElement(ContainerTbGeneraltxtAddress1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress1", "Enter_ContainerTbGeneraltxtAddress1 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress1", "Enter_ContainerTbGeneraltxtAddress1 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress1Elem.toString());

 			Assert.fail("Unable to locate object: " + ContainerTbGeneraltxtAddress1Elem.toString());
         }

 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		
 		elem.sendKeys(ContainerTbGeneraltxtAddress1);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress1 " + ContainerTbGeneraltxtAddress1);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress1 " + ContainerTbGeneraltxtAddress1);
 	}

      
	/**
 	 * Enter Container$TbGeneral$txtAddress2
     * @name Enter Container$TbGeneral$txtAddress2
     */
 	public void Enter_ContainerTbGeneraltxtAddress2(String ContainerTbGeneraltxtAddress2)
 	{
 	    
 		WebElement elem = getWebElement(ContainerTbGeneraltxtAddress2Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress2", "Enter_ContainerTbGeneraltxtAddress2 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress2Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress2", "Enter_ContainerTbGeneraltxtAddress2 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress2Elem.toString());

 			Assert.fail("Unable to locate object: " + ContainerTbGeneraltxtAddress2Elem.toString());
         }

 		elem.sendKeys(ContainerTbGeneraltxtAddress2);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress2 " + ContainerTbGeneraltxtAddress2);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress2 " + ContainerTbGeneraltxtAddress2);
 	}

      
	/**
 	 * Enter Container$TbGeneral$txtAddress3
     * @name Enter Container$TbGeneral$txtAddress3
     */
 	public void Enter_ContainerTbGeneraltxtAddress3(String ContainerTbGeneraltxtAddress3)
 	{
 	    
 		WebElement elem = getWebElement(ContainerTbGeneraltxtAddress3Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress3", "Enter_ContainerTbGeneraltxtAddress3 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress3Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress3", "Enter_ContainerTbGeneraltxtAddress3 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress3Elem.toString());

 			Assert.fail("Unable to locate object: " + ContainerTbGeneraltxtAddress3Elem.toString());
         }

 		elem.sendKeys(ContainerTbGeneraltxtAddress3);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress3 " + ContainerTbGeneraltxtAddress3);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress3 " + ContainerTbGeneraltxtAddress3);
 	}

      
	/**
 	 * Enter Container$TbGeneral$txtAddress4
     * @name Enter Container$TbGeneral$txtAddress4
     */
 	public void Enter_ContainerTbGeneraltxtAddress4(String ContainerTbGeneraltxtAddress4)
 	{
 	    
 		WebElement elem = getWebElement(ContainerTbGeneraltxtAddress4Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress4", "Enter_ContainerTbGeneraltxtAddress4 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress4Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtAddress4", "Enter_ContainerTbGeneraltxtAddress4 failed. Unable to locate object: " + ContainerTbGeneraltxtAddress4Elem.toString());

 			Assert.fail("Unable to locate object: " + ContainerTbGeneraltxtAddress4Elem.toString());
         }

 		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		 je.executeScript("arguments[0].scrollIntoView(true);",elem);
		 
 		elem.sendKeys(ContainerTbGeneraltxtAddress4);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress4 " + ContainerTbGeneraltxtAddress4);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContainerTbGeneraltxtAddress4 " + ContainerTbGeneraltxtAddress4);
 	}

      
	/**
 	 * Enter Container$TbGeneral$txtPostCode
     * @name Enter Container$TbGeneral$txtPostCode
     */
 	public void Enter_ContainerTbGeneraltxtPostCode(String ContainerTbGeneraltxtPostCode)
 	{
 	    
 		WebElement elem = getWebElement(ContainerTbGeneraltxtPostCodeElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtPostCode", "Enter_ContainerTbGeneraltxtPostCode failed. Unable to locate object: " + ContainerTbGeneraltxtPostCodeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ContainerTbGeneraltxtPostCode", "Enter_ContainerTbGeneraltxtPostCode failed. Unable to locate object: " + ContainerTbGeneraltxtPostCodeElem.toString());

 			Assert.fail("Unable to locate object: " + ContainerTbGeneraltxtPostCodeElem.toString());
         }
elem.clear();
 		elem.sendKeys(ContainerTbGeneraltxtPostCode);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ContainerTbGeneraltxtPostCode " + ContainerTbGeneraltxtPostCode);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ContainerTbGeneraltxtPostCode " + ContainerTbGeneraltxtPostCode);
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
		JavascriptExecutor je = (JavascriptExecutor)m_Driver;
		je.executeScript("arguments[0].scrollIntoView(true);",elem);
		
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
 		
		m_Driver.switchTo().defaultContent();

 		
 		ExtentReportManager.passStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ReportingStdType " + ReportingStdType);
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
		String expected = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[2]/div/table/tbody/tr[1]/td")).getText();
		Assert.assertEquals(expected, "Partnership Registration Number : NI121212 (Northern Ireland)");

//		WebElement elem1 = getWebElement(Report);
//		if(elem1==null)
//		{
//			WebElement unable = getWebElement(unablereport);
//			String unabletext = unable.getText();
//			Assert.assertEquals(unabletext, "Registered No");
//		}
//		else
//		{
//			String data =elem1.getText();
//		
//		
//				String[] dd = data.split(":");
//			System.out.println(dd[0]);
//			 Assert.assertEquals("Registered No", dd[0]);
//			 }
//		
//        String dd = m_Driver.findElement(By.xpath("//*[@id=\"ctl00_cPH_oldltCTPreview\"]/div/div/div[1]/table[1]/tbody/tr[1]/td")).getText();
//		String[] data = dd.split(":");
       
		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}