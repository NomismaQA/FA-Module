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
import utilities.ChangeWindow;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/fcc40f05-e9af-4f57-a9b7-edb35739d75a
@TestModellerModule(guid = "fcc40f05-e9af-4f57-a9b7-edb35739d75a")
public class Clientadd extends BasePage
{
	public Clientadd (WebDriver driver)
	{
		super(driver);
	}


	
	private By BusinessesElem = By.xpath("//SPAN[contains(text(),'Businesses')]");

	private By _New_ClientElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cpHeaderRight_btnAdd']");

	private By Limited_CompanyElem = By.xpath("//H4[contains(text(),'Limited Company')]");

	private By Limited_Company_1Elem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_ltBussinessName']");

	private By BusinessnameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCompanyName']");

	private By RegistrationNumberElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtRegNo']");

	private By RegistrationDateElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtCRegDate']");

	private By FirstNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtFirstName1']");

	private By LastNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPH$txtLastName1']");

	private By if_director_is_also_an_employee_in_the_companybuttonElem = By.xpath("//INPUT[@id='ctl00_ctl00_ParentContent_cPH_chkIsEmployee']");

	private By SaveButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPH_btnSave']");

	private By SearchclientElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By SearchbuttonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By _DITYA_SOFTWARES_LTD_Elem = By.xpath("//SPAN[@class='border-btm-dotted']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx";

        if (!currentUrl.equals("http://sandbox.nomismasolution.co.uk/AgentUI/Default.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Businesses
     * @name Click Businesses
     */
	public void Click_Businesses()
	{
        
		WebElement elem = getWebElement(BusinessesElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Businesses", "Click_Businesses failed. Unable to locate object: " + BusinessesElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Businesses", "Click_Businesses failed. Unable to locate object: " + BusinessesElem.toString());

			Assert.fail("Unable to locate object: " + BusinessesElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Businesses");

		TestModellerLogger.PassStep(m_Driver, "Click_Businesses");
	}

     
	/**
 	 * Click  New Client
     * @name Click  New Client
     */
	public void Click__New_Client()
	{
        
		WebElement elem = getWebElement(_New_ClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__New_Client", "Click__New_Client failed. Unable to locate object: " + _New_ClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__New_Client", "Click__New_Client failed. Unable to locate object: " + _New_ClientElem.toString());

			Assert.fail("Unable to locate object: " + _New_ClientElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__New_Client");

		TestModellerLogger.PassStep(m_Driver, "Click__New_Client");
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
 	 * Click Limited Company
     * @name Click Limited Company
     */
	public void Click_Limited_Company_1()
	{
        
		WebElement elem = getWebElement(Limited_Company_1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Limited_Company_1", "Click_Limited_Company_1 failed. Unable to locate object: " + Limited_Company_1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Limited_Company_1", "Click_Limited_Company_1 failed. Unable to locate object: " + Limited_Company_1Elem.toString());

			Assert.fail("Unable to locate object: " + Limited_Company_1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Limited_Company_1");

		TestModellerLogger.PassStep(m_Driver, "Click_Limited_Company_1");
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
 	 * Click if director is also an employee in the company_button
     * @name Click if director is also an employee in the company_button
     */
	public void Click_if_director_is_also_an_employee_in_the_companybutton()
	{
        
		WebElement elem = getWebElement(if_director_is_also_an_employee_in_the_companybuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_if_director_is_also_an_employee_in_the_companybutton", "Click_if_director_is_also_an_employee_in_the_companybutton failed. Unable to locate object: " + if_director_is_also_an_employee_in_the_companybuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_if_director_is_also_an_employee_in_the_companybutton", "Click_if_director_is_also_an_employee_in_the_companybutton failed. Unable to locate object: " + if_director_is_also_an_employee_in_the_companybuttonElem.toString());

			Assert.fail("Unable to locate object: " + if_director_is_also_an_employee_in_the_companybuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_if_director_is_also_an_employee_in_the_companybutton");

		TestModellerLogger.PassStep(m_Driver, "Click_if_director_is_also_an_employee_in_the_companybutton");
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

      
	/**
 	 * Enter Search_client
     * @name Enter Search_client
     */
 	public void Enter_Searchclient(String Searchclient)
 	{
 	    
 		WebElement elem = getWebElement(SearchclientElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Searchclient", "Enter_Searchclient failed. Unable to locate object: " + SearchclientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Searchclient", "Enter_Searchclient failed. Unable to locate object: " + SearchclientElem.toString());

 			Assert.fail("Unable to locate object: " + SearchclientElem.toString());
         }

 		elem.sendKeys(Searchclient);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Searchclient " + Searchclient);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Searchclient " + Searchclient);
 	}

     
	/**
 	 * Click Search_button
     * @name Click Search_button
     */
	public void Click_Searchbutton()
	{
        
		WebElement elem = getWebElement(SearchbuttonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Searchbutton", "Click_Searchbutton failed. Unable to locate object: " + SearchbuttonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Searchbutton", "Click_Searchbutton failed. Unable to locate object: " + SearchbuttonElem.toString());

			Assert.fail("Unable to locate object: " + SearchbuttonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Searchbutton");

		TestModellerLogger.PassStep(m_Driver, "Click_Searchbutton");
	}

     
	/**
 	 * Click  DITYA SOFTWARES LTD 
     * @name Click  DITYA SOFTWARES LTD 
     */
	public void Click__DITYA_SOFTWARES_LTD_()
	{
        
		WebElement elem = getWebElement(_DITYA_SOFTWARES_LTD_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__DITYA_SOFTWARES_LTD_", "Click__DITYA_SOFTWARES_LTD_ failed. Unable to locate object: " + _DITYA_SOFTWARES_LTD_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__DITYA_SOFTWARES_LTD_", "Click__DITYA_SOFTWARES_LTD_ failed. Unable to locate object: " + _DITYA_SOFTWARES_LTD_Elem.toString());

			Assert.fail("Unable to locate object: " + _DITYA_SOFTWARES_LTD_Elem.toString());
        }

		elem.click();
		ChangeWindow.tabswitch(m_Driver);
          	

		ExtentReportManager.passStep(m_Driver, "Click__DITYA_SOFTWARES_LTD_");

		TestModellerLogger.PassStep(m_Driver, "Click__DITYA_SOFTWARES_LTD_");
	}
}