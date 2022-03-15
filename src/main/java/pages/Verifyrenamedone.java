package pages;

import pages.BasePage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8db32fd8-05a5-4bd4-a83d-ff5c358950a3
@TestModellerModule(guid = "8db32fd8-05a5-4bd4-a83d-ff5c358950a3")
public class Verifyrenamedone extends BasePage
{
	public Verifyrenamedone (WebDriver driver)
	{
		super(driver);
	}


	
	private By UsernameElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By Login_ButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");

	private By ctl00cPHFiltertxtAgentNameElem = By.xpath("//INPUT[@name='ctl00$cPHFilter$txtAgentName']");

	private By Search_buttonElem = By.xpath("//A[@id='ctl00_cPHFilter_btnSearch']");

	private By _Nakul_Elem = By.xpath("//TD[contains(text(),'Nakul@@')]");

	private By ClientsElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A/SPAN[@class='side_nav_text']");

	private By ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By ctl00ctl00ParentContentcPHFilterddlTypeElem = By.xpath("//SELECT[@name='ctl00$ctl00$ParentContent$cPHFilter$ddlType']");

	private By Search_button_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _Test_CoElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");

	private By Final_Accounts1Elem = By.xpath("//SPAN[contains(text(),'Final Accounts')]");

	private By Final_Accounts2Elem = By.xpath("//SPAN[contains(text(),'Final Accounts')]");

	private By Full_AccountsElem = By.xpath("//*[@id=\"ctl00_SideMenu1_FAFullAccNameAccounts\"]/a");


	
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
 	    
 		try {
			WebElement elem = getWebElement(UsernameElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Username", "Enter_Username failed. Unable to locate object: " + UsernameElem.toString());

				Assert.fail("Unable to locate object: " + UsernameElem.toString());
			 }
			
			Thread.sleep(2000);
			elem.sendKeys(Username);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
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
Thread.sleep(1000);
			elem.sendKeys(ctl00cPHFiltertxtAgentName);
		} catch (Exception e) {
			
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
 	 * Click Search_button
     * @name Click Search_button
     */
	public void Click_Search_button()
	{
        
		try {
			handlepopup1();
			WebElement elem = getWebElement(Search_buttonElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button", "Click_Search_button failed. Unable to locate object: " + Search_buttonElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button", "Click_Search_button failed. Unable to locate object: " + Search_buttonElem.toString());

				Assert.fail("Unable to locate object: " + Search_buttonElem.toString());
			}
Thread.sleep(1000);
handlepopup();
			elem.click();
			
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button");
	}
	
	public boolean handlepopup1()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(1000);
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
 	 * Click  Nakul@@ 
     * @name Click  Nakul@@ 
     */
	public void Click__Nakul_()
	{
        
		try {
			handlepopup11();
			WebElement elem = getWebElement(_Nakul_Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Nakul_", "Click__Nakul_ failed. Unable to locate object: " + _Nakul_Elem.toString());

				Assert.fail("Unable to locate object: " + _Nakul_Elem.toString());
			}
			Thread.sleep(1000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
		
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Nakul_");

		TestModellerLogger.PassStep(m_Driver, "Click__Nakul_");
	}

	public boolean handlepopup11()
	{
		boolean data=false;
		try 
		{
			Thread.sleep(1000);
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
 	 * Click Clients
     * @name Click Clients
     */
	public void Click_Clients()
	{
        
		try {
			WebElement elem = getWebElement(ClientsElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Clients", "Click_Clients failed. Unable to locate object: " + ClientsElem.toString());

				Assert.fail("Unable to locate object: " + ClientsElem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Clients");

		TestModellerLogger.PassStep(m_Driver, "Click_Clients");
	}

      
	/**
 	 * Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     * @name Enter ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany
     */
 	public void Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(String ctl00ctl00ParentContentcPHFiltertxtSearchCompany)
 	{
 	    
 		try {
			WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany", "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());

				Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFiltertxtSearchCompanyElem.toString());
			 }
Thread.sleep(2000);
			elem.sendKeys(ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany " + ctl00ctl00ParentContentcPHFiltertxtSearchCompany);
 	}

    
	/**
 	 * Select ctl00$ctl00$ParentContent$cPHFilter$ddlType
     * @name Select ctl00$ctl00$ParentContent$cPHFilter$ddlType
     */
    public void Select_ctl00ctl00ParentContentcPHFilterddlType(String ctl00ctl00ParentContentcPHFilterddlType)
 	{
 	    
 		try {
			WebElement elem = getWebElement(ctl00ctl00ParentContentcPHFilterddlTypeElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType", "Select_ctl00ctl00ParentContentcPHFilterddlType failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType", "Select_ctl00ctl00ParentContentcPHFilterddlType failed. Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());

				Assert.fail("Unable to locate object: " + ctl00ctl00ParentContentcPHFilterddlTypeElem.toString());
			 }

			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(ctl00ctl00ParentContentcPHFilterddlType);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType " + ctl00ctl00ParentContentcPHFilterddlType);

 		TestModellerLogger.PassStep(m_Driver, "Select_ctl00ctl00ParentContentcPHFilterddlType " + ctl00ctl00ParentContentcPHFilterddlType);
 	}

     
	/**
 	 * Click Search_button
     * @name Click Search_button
     */
	public void Click_Search_button_1()
	{
        
		try {
			WebElement elem = getWebElement(Search_button_1Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Search_button_1", "Click_Search_button_1 failed. Unable to locate object: " + Search_button_1Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Search_button_1", "Click_Search_button_1 failed. Unable to locate object: " + Search_button_1Elem.toString());

				Assert.fail("Unable to locate object: " + Search_button_1Elem.toString());
			}
Thread.sleep(1000);
			elem.click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Search_button_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Search_button_1");
	}
	
	

     
	/**
 	 * Click  Test & Co
     * @name Click  Test & Co
     */
	public void Click__Test_Co()
	{
        
		try {
			WebElement elem = getWebElement(_Test_CoElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Test_Co", "Click__Test_Co failed. Unable to locate object: " + _Test_CoElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Test_Co", "Click__Test_Co failed. Unable to locate object: " + _Test_CoElem.toString());

				Assert.fail("Unable to locate object: " + _Test_CoElem.toString());
			}
Thread.sleep(2000);
			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click__Test_Co");

		TestModellerLogger.PassStep(m_Driver, "Click__Test_Co");
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

			elem.click();
			ChangeWindow.tabswitch(m_Driver);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts1");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts1");
	}

     
	/**
 	 * Click Final Accounts2
     * @name Click Final Accounts2
     */
	public void Click_Final_Accounts2()
	{
        
		try {
			WebElement elem = getWebElement(Final_Accounts2Elem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Final_Accounts2", "Click_Final_Accounts2 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Final_Accounts2", "Click_Final_Accounts2 failed. Unable to locate object: " + Final_Accounts2Elem.toString());

				Assert.fail("Unable to locate object: " + Final_Accounts2Elem.toString());
			}
Thread.sleep(2000);
			elem.click();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Final_Accounts2");

		TestModellerLogger.PassStep(m_Driver, "Click_Final_Accounts2");
	}

     
	/**
 	 * Click Full Accounts
     * @name Click Full Accounts
     */
	public void Click_Full_Accounts()
	{
        
		try {
			System.out.println();
			WebElement elem = getWebElement(Full_AccountsElem);

			if (elem == null) {
				ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Full_Accounts", "Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

				TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Full_Accounts", "Click_Full_Accounts failed. Unable to locate object: " + Full_AccountsElem.toString());

				Assert.fail("Unable to locate object: " + Full_AccountsElem.toString());
			}
			Thread.sleep(2000);
			elem.click();
			CopyOnWriteArrayList<String>list=new CopyOnWriteArrayList<String>();
		//	list.add("ABC LLP");
			list.add("Partnership information");
			list.add("Member's Report");
			list.add("Accountant's Report");
			list.add("Income Statement");
			list.add("Statement of Financial Position");
			list.add("Detailed Income Statement");
			int count=0;
			 List<WebElement> data = m_Driver.findElements(By.xpath("//*[@id='ctl00_cPH_oldltCTPreview']/div/div/div[1]/div[3]/table[1]/tbody/tr"));
			for(WebElement dd:data)
			{
				count++;
				if(count>=3)
				{
					for(String outt:list)
					{
						String out = dd.getText();
						int len = out.length();
						String dataa = out.substring(0, len-2);
						Assert.assertEquals(outt, dataa.trim());
						list.remove(outt);
						break;
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          	

		ExtentReportManager.passStep(m_Driver, "Click_Full_Accounts");

		TestModellerLogger.PassStep(m_Driver, "Click_Full_Accounts");
	}
}