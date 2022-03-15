package page.factories;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a50235a3-00f3-427c-9b57-7357800017da
@TestModellerModule(guid = "a50235a3-00f3-427c-9b57-7357800017da")
public class ProfitAndLoss_Report extends BasePage
{
	static String LedgerCodeValue;
	
	static String valueForCT_Computation;
	
	public ProfitAndLoss_Report (WebDriver driver)
	{
		super(driver);
	}


	
	private By getValue7603AmortisationLedgerElem = By.xpath("//span[starts-with(text(),'Amortisation of Goodwill')]/following::td[2]/a");
	
	private By getValueExpenditureElem = By.xpath("//*[@id='profitlossdata']/tbody/tr[10]/td[1]/div[2]");
	
	private By getCharitable_donationsLedgerElem = By.xpath("//*[@id='profitlossdata']/tbody/tr[10]/td[3]");//span[starts-with(text(),'Charitable Donations')]/following::td[2]/a



	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/PayrollUI/Popup/CompanyEditor.aspx?Action=Edit&PayrollCompanyCode=11984&TaxYearCode=7")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click getValue7603AmortisationLedgerElem
	 * @throws Exception 
	 * @name Click getValue7603AmortisationLedgerElem
     */
	public void getValue7603AmortisationLedger(String ledgercodeof) throws Exception
	{
        
		WebElement elem = getWebElement(getValue7603AmortisationLedgerElem);
		
		WebElement Expenditureelem= getWebElement(getValueExpenditureElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getValue7603AmortisationLedger", "getValue7603AmortisationLedger failed. Unable to locate object: " + getValue7603AmortisationLedgerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getValue7603AmortisationLedger", "getValue7603AmortisationLedger failed. Unable to locate object: " + getValue7603AmortisationLedgerElem.toString());

			Assert.fail("Unable to locate object: " + getValue7603AmortisationLedgerElem.toString());
        }
		
		
		valueForCT_Computation=Expenditureelem.getText();
		
		jsExec.executeScript("arguments[0].scrollIntoView();",m_Driver.findElement(By.xpath("//*[@id='profitlossdata']/tbody/tr[10]/td[1]/div[2]")));
	
		TakeScreenshot.takeScreenshot(m_Driver, ledgercodeof+" vale at profitLoss Report page");
		
		
		
		Thread.sleep(1000);
		LedgerCodeValue= elem.getText();
		System.out.println(LedgerCodeValue);

		ExtentReportManager.passStep(m_Driver, "getValue7603AmortisationLedger");

		TestModellerLogger.PassStep(m_Driver, "getValue7603AmortisationLedger");
	}
	
	
	public void getCharitable_donationsLedger(String ledgercodeof) throws Exception 
	{
		
		WebElement elem = getWebElement(getCharitable_donationsLedgerElem);
		
		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getCharitable_donationsLedger", "getCharitable_donationsLedger failed. Unable to locate object: " + getCharitable_donationsLedgerElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getCharitable_donationsLedger", "getCharitable_donationsLedger failed. Unable to locate object: " + getCharitable_donationsLedgerElem.toString());

			Assert.fail("Unable to locate object: " + getCharitable_donationsLedgerElem.toString());
        }
		
		jsExec.executeScript("arguments[0].scrollIntoView();",m_Driver.findElement(By.xpath("//*[@id='profitlossdata']/tbody/tr[10]/td[1]/div[2]")));
		
		TakeScreenshot.takeScreenshot(m_Driver, ledgercodeof+" vale at profitLoss Report page");
		
    	Thread.sleep(1000);
		LedgerCodeValue= elem.getText();
		System.out.println(LedgerCodeValue);

		ExtentReportManager.passStep(m_Driver, "getCharitable_donationsLedger");

		TestModellerLogger.PassStep(m_Driver, "getCharitable_donationsLedger");
		
	}
	
	
	public String retunValue()
	{
		System.out.println("I'm in return method:"+LedgerCodeValue);
		return LedgerCodeValue;
		
	}
	
	public String retunValueforCT_Cmputation()
	{
		System.out.println("I'm in return method:"+valueForCT_Computation);
		return valueForCT_Computation;
		
	}


}