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

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a8a6e1c4-7cfb-466a-a637-f11f65b75ebd
@TestModellerModule(guid = "a8a6e1c4-7cfb-466a-a637-f11f65b75ebd")
public class DetailedIncomeStatementOther_charges29 extends BasePage
{
	public DetailedIncomeStatementOther_charges29 (WebDriver driver)
	{
		super(driver);
	}


	
	private By Detailed_Income_StatementElem = By.xpath("//A[@class='list-group-item js-anchor-link el-selection']");

	private By _Bad_Debts_Elem = By.xpath("//TD[@class='t el-selection']");


	
	public void GoToUrl()
	{
		m_Driver.get("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705";

        if (!currentUrl.equals("https://nomisma.cloud.testinsights.io/app/#!/test-modeller/100705")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click Detailed Income Statement
     * @name Click Detailed Income Statement
     */
	public void Click_Detailed_Income_Statement()
	{
        
		WebElement elem = getWebElement(Detailed_Income_StatementElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Detailed_Income_Statement", "Click_Detailed_Income_Statement failed. Unable to locate object: " + Detailed_Income_StatementElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Detailed_Income_Statement", "Click_Detailed_Income_Statement failed. Unable to locate object: " + Detailed_Income_StatementElem.toString());

			Assert.fail("Unable to locate object: " + Detailed_Income_StatementElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_Detailed_Income_Statement");

		TestModellerLogger.PassStep(m_Driver, "Click_Detailed_Income_Statement");
	}

     
	/**
 	 * Click  Bad Debts 
     * @name Click  Bad Debts 
     */
	public void Click__Bad_Debts_()
	{
        
		WebElement elem = getWebElement(_Bad_Debts_Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click__Bad_Debts_", "Click__Bad_Debts_ failed. Unable to locate object: " + _Bad_Debts_Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click__Bad_Debts_", "Click__Bad_Debts_ failed. Unable to locate object: " + _Bad_Debts_Elem.toString());

			Assert.fail("Unable to locate object: " + _Bad_Debts_Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click__Bad_Debts_");

		TestModellerLogger.PassStep(m_Driver, "Click__Bad_Debts_");
	}
}