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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/99a34ae2-8b56-4943-affb-d208bb88a011
@TestModellerModule(guid = "99a34ae2-8b56-4943-affb-d208bb88a011")
public class Loginnew extends BasePage
{
	public Loginnew (WebDriver driver)
	{
		super(driver);
	}


	
	private By ctl00cPHloginElem = By.xpath("//*[@id=\"ctl00_cPH_login\"]");

	private By ctl00cPHpassElem = By.xpath("//*[@id=\"ctl00_cPH_pass\"]");

	private By LoginElem = By.xpath("//*[@id=\"ctl00_cPH_btnLogin\"]");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=6f10cfc7-3a2d-4b30-aa25-4ede099c579c")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter ctl00$cPH$login
     * @name Enter ctl00$cPH$login
     */
 	public void Enter_ctl00cPHlogin(String ctl00cPHlogin)
 	{
 	    
 		WebElement elem = getWebElement(ctl00cPHloginElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_ctl00cPHlogin", "Enter_ctl00cPHlogin failed. Unable to locate object: " + ctl00cPHloginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_ctl00cPHlogin", "Enter_ctl00cPHlogin failed. Unable to locate object: " + ctl00cPHloginElem.toString());

 			Assert.fail("Unable to locate object: " + ctl00cPHloginElem.toString());
         }

 		elem.sendKeys(ctl00cPHlogin);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_ctl00cPHlogin " + ctl00cPHlogin);

  		TestModellerLogger.PassStep(m_Driver, "Enter_ctl00cPHlogin " + ctl00cPHlogin);
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
 	 * Click Login
     * @name Click Login
     */
	public void Click_Login()
	{
        
		WebElement elem = getWebElement(LoginElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Login", "Click_Login failed. Unable to locate object: " + LoginElem.toString());

			Assert.fail("Unable to locate object: " + LoginElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Login");

		TestModellerLogger.PassStep(m_Driver, "Click_Login");
	}
}