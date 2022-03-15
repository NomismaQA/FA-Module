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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/50cf322e-a8a0-420d-bb85-4ceb95917ad2
@TestModellerModule(guid = "50cf322e-a8a0-420d-bb85-4ceb95917ad2")
public class CompanySetting extends BasePage
{
	public CompanySetting (WebDriver driver)
	{
		super(driver);
	}


	
	private By _Settings_Elem = By.xpath("//LI[@id='ctl00_SideMenu1_liSettings']/A");

	private By Accounts_SettingsElem = By.xpath("//A[contains(text(),'Accounts Settings')]");

	private By Edit2Elem = By.xpath("//A[@id='ctl00_cPH_linkFinalAccount']");

	private By ReportingStdTypeElem = By.xpath("//label[normalize-space()= 'Company Reporting Standard']/../div/select");

	private By chkCharitDonationsElem = By.xpath("//INPUT[@name='ctl00$cPH$chkCharitDonations']");

	private By chkDirectorsYearElem = By.xpath("//label[normalize-space()= 'Include directors who served during the year ?']/../div/input");

	private By Save_ButtonElem = By.xpath("//A[@id='ctl00_cphFooter_btnSave']");

	private By _SaveElem = By.xpath("//BUTTON[contains(text(),'Save')]");


	
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
 	 * Click  Settings 
     * @name Click  Settings 
     */
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
}