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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/068f45c6-fed6-4424-858c-8438fa0f108a
@TestModellerModule(guid = "068f45c6-fed6-4424-858c-8438fa0f108a")
public class Login1201 extends BasePage
{
	public Login1201 (WebDriver driver)
	{
		super(driver);
	}


	
	private By LoginElem = By.xpath("//INPUT[@name='ctl00$cPH$login']");

	private By PasswordElem = By.xpath("//INPUT[@name='ctl00$cPH$pass']");

	private By LoginButtonElem = By.xpath("//A[@id='ctl00_cPH_btnLogin']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=72ae3dde-60a3-4c11-8100-2e12e60da96b");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=72ae3dde-60a3-4c11-8100-2e12e60da96b");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=72ae3dde-60a3-4c11-8100-2e12e60da96b");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=72ae3dde-60a3-4c11-8100-2e12e60da96b";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/ssoui/Signin.aspx?token=72ae3dde-60a3-4c11-8100-2e12e60da96b")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

      
	/**
 	 * Enter Login
     * @name Enter Login
     */
 	public void Enter_Login(String Login)
 	{
 	    
 		WebElement elem = getWebElement(LoginElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_Login", "Enter_Login failed. Unable to locate object: " + LoginElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_Login", "Enter_Login failed. Unable to locate object: " + LoginElem.toString());

 			Assert.fail("Unable to locate object: " + LoginElem.toString());
         }

 		elem.sendKeys(Login);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_Login " + Login);

  		TestModellerLogger.PassStep(m_Driver, "Enter_Login " + Login);
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
}