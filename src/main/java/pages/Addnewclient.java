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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/8be71af1-af7f-4edb-9de8-fa53e1f8c76e
@TestModellerModule(guid = "8be71af1-af7f-4edb-9de8-fa53e1f8c76e")
public class Addnewclient extends BasePage
{
	public Addnewclient (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClientsElem = By.xpath("//SPAN[text()='Clients']");

	private By AddNewClientElem = By.id("ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd");

	private By Limited_CompanyElem = By.id("ctl00_ctl00_ParentContent_cPH_btnLimitedCompany");

	private By LimitedCompanyElem = By.id("ctl00_ctl00_ParentContent_cPH_ltBussinessName");

	private By BusinessnameElem = By.id("ctl00_ctl00_ParentContent_cPH_txtCompanyName");

	private By RegistrationNumberElem = By.id("ctl00_ctl00_ParentContent_cPH_txtRegNo");

	private By RegistrationDateElem = By.id("ctl00_ctl00_ParentContent_cPH_txtCRegDate");

	private By FirstNameElem = By.id("ctl00_ctl00_ParentContent_cPH_txtFirstName1");

	private By LastNameElem = By.id("ctl00_ctl00_ParentContent_cPH_txtLastName1");

	private By TickElem = By.id("ctl00_ctl00_ParentContent_cPH_chkIsEmployee");

	private By SaveButtonElem = By.id("ctl00_ctl00_ParentContent_cPH_btnSave");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100178")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
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
 	 * Click Add_New_Client
     * @name Click Add_New_Client
     */
	public void Click_AddNewClient()
	{
        
		WebElement elem = getWebElement(AddNewClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AddNewClient", "Click_AddNewClient failed. Unable to locate object: " + AddNewClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AddNewClient", "Click_AddNewClient failed. Unable to locate object: " + AddNewClientElem.toString());

			Assert.fail("Unable to locate object: " + AddNewClientElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AddNewClient");

		TestModellerLogger.PassStep(m_Driver, "Click_AddNewClient");
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
 	 * Click Limited_Company
     * @name Click Limited_Company
     */
	public void Click_LimitedCompany()
	{
        
		WebElement elem = getWebElement(LimitedCompanyElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_LimitedCompany", "Click_LimitedCompany failed. Unable to locate object: " + LimitedCompanyElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_LimitedCompany", "Click_LimitedCompany failed. Unable to locate object: " + LimitedCompanyElem.toString());

			Assert.fail("Unable to locate object: " + LimitedCompanyElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_LimitedCompany");

		TestModellerLogger.PassStep(m_Driver, "Click_LimitedCompany");
	}

      
	/**
 	 * Enter Business_name
     * @name Enter Business_name
     */
 	public void Enter_Businessname(String Businessname)
 	{
 	    
 		WebElement elem = getWebElement(BusinessnameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Businessname", "Enter_Businessname failed. Unable to locate object: " + BusinessnameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Businessname", "Enter_Businessname failed. Unable to locate object: " + BusinessnameElem.toString());

 			Assert.fail("Unable to locate object: " + BusinessnameElem.toString());
         }

 		elem.sendKeys(Businessname);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Businessname " + Businessname);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Businessname " + Businessname);
 	}

      
	/**
 	 * Enter Registration_Number
     * @name Enter Registration_Number
     */
 	public void Enter_RegistrationNumber(String RegistrationNumber)
 	{
 	    
 		WebElement elem = getWebElement(RegistrationNumberElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegistrationNumber", "Enter_RegistrationNumber failed. Unable to locate object: " + RegistrationNumberElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegistrationNumber", "Enter_RegistrationNumber failed. Unable to locate object: " + RegistrationNumberElem.toString());

 			Assert.fail("Unable to locate object: " + RegistrationNumberElem.toString());
         }

 		elem.sendKeys(RegistrationNumber);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegistrationNumber " + RegistrationNumber);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegistrationNumber " + RegistrationNumber);
 	}

      
	/**
 	 * Enter Registration_Date
     * @name Enter Registration_Date
     */
 	public void Enter_RegistrationDate(String RegistrationDate)
 	{
 	    
 		WebElement elem = getWebElement(RegistrationDateElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_RegistrationDate", "Enter_RegistrationDate failed. Unable to locate object: " + RegistrationDateElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_RegistrationDate", "Enter_RegistrationDate failed. Unable to locate object: " + RegistrationDateElem.toString());

 			Assert.fail("Unable to locate object: " + RegistrationDateElem.toString());
         }

 		elem.sendKeys(RegistrationDate);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_RegistrationDate " + RegistrationDate);

  		TestModellerLogger.PassStep(m_Driver, "Enter_RegistrationDate " + RegistrationDate);
 	}

      
	/**
 	 * Enter First_Name
     * @name Enter First_Name
     */
 	public void Enter_FirstName(String FirstName)
 	{
 	    
 		WebElement elem = getWebElement(FirstNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_FirstName failed. Unable to locate object: " + FirstNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_FirstName", "Enter_FirstName failed. Unable to locate object: " + FirstNameElem.toString());

 			Assert.fail("Unable to locate object: " + FirstNameElem.toString());
         }

 		elem.sendKeys(FirstName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_FirstName " + FirstName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_FirstName " + FirstName);
 	}

      
	/**
 	 * Enter Last_Name
     * @name Enter Last_Name
     */
 	public void Enter_LastName(String LastName)
 	{
 	    
 		WebElement elem = getWebElement(LastNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_LastName", "Enter_LastName failed. Unable to locate object: " + LastNameElem.toString());

 			Assert.fail("Unable to locate object: " + LastNameElem.toString());
         }

 		elem.sendKeys(LastName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_LastName " + LastName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_LastName " + LastName);
 	}

     
	/**
 	 * Click Tick
     * @name Click Tick
     */
	public void Click_Tick()
	{
        
		WebElement elem = getWebElement(TickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Tick", "Click_Tick failed. Unable to locate object: " + TickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Tick", "Click_Tick failed. Unable to locate object: " + TickElem.toString());

			Assert.fail("Unable to locate object: " + TickElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Tick");

		TestModellerLogger.PassStep(m_Driver, "Click_Tick");
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