package page.factories;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

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
public class CT_Adjustment_ProfitLossTab extends BasePage
{
	String ActualAmortisationBalance;
	
	String ExpectedAmortisationBalance;
	
	public CT_Adjustment_ProfitLossTab (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickProfitLossAdjsmentTabElem = By.xpath("//*[@id='__tab_ctl00_cPH_tbContainer_TabPanel1']");

	private By getAmortisationBalanceElem = By.xpath("//*[contains(text(),'Amortisation')]/following::td[2]//input[2]");
	
	private By getCharitable_donationsBalanceElem = By.xpath("//*[contains(text(),'Charitable donations')]/following::td[2]//input[2]");
	
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
 	 * Click ClickProfitLossAdjsmentTabElem
     * @name Click ClickProfitLossAdjsmentTabElem
     */
	public void ClickProfitLossAdjsmentTab()
	{
        
		WebElement elem = getWebElement(ClickProfitLossAdjsmentTabElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickProfitLossAdjsmentTab", "ClickProfitLossAdjsmentTab failed. Unable to locate object: " + ClickProfitLossAdjsmentTabElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickProfitLossAdjsmentTab", "ClickProfitLossAdjsmentTab failed. Unable to locate object: " + ClickProfitLossAdjsmentTabElem.toString());

			Assert.fail("Unable to locate object: " + ClickProfitLossAdjsmentTabElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "ClickProfitLossAdjsmentTab");

		TestModellerLogger.PassStep(m_Driver, "ClickProfitLossAdjsmentTab");
	}

     
	/**
 	 * Enter getAmortisationBalance
	 * @throws Exception 
	 * @name Enter getAmortisationBalance
     */
	
 	public void getAmortisationBalance(String gettext) throws Exception
 	{
 	    
 		WebElement elem = getWebElement(getAmortisationBalanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getAmortisationBalance", "getAmortisationBalance failed. Unable to locate object: " + getAmortisationBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getAmortisationBalance", "getAmortisationBalance failed. Unable to locate object: " + getAmortisationBalanceElem.toString());

 			Assert.fail("Unable to locate object: " + getAmortisationBalanceElem.toString());
         }

 		TakeScreenshot.takeScreenshot(m_Driver, gettext+" Ledger value at FA page");
 		
 		 String AmortisationBalance=elem.getAttribute("value");
 		 
 		ActualAmortisationBalance=Float.parseFloat(AmortisationBalance);
 		
 		System.out.println("Value at CT_Adjustment_ProfitLossTab="+ActualAmortisationBalance);
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "getAmortisationBalance ");

  		TestModellerLogger.PassStep(m_Driver, "getAmortisationBalance ");
 	}
 	
 	
 	public void getCharitable_donationsBalance(String gettext) throws Exception 
 	{
		
 		WebElement elem = getWebElement(getCharitable_donationsBalanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getCharitable_donationsBalance", "getCharitable_donationsBalance failed. Unable to locate object: " + getCharitable_donationsBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getCharitable_donationsBalance", "getCharitable_donationsBalance failed. Unable to locate object: " + getCharitable_donationsBalanceElem.toString());

 			Assert.fail("Unable to locate object: " + getCharitable_donationsBalanceElem.toString());
         }

 		TakeScreenshot.takeScreenshot(m_Driver, gettext+" Ledger value at FA page");
 		
 		 String AmortisationBalance=elem.getAttribute("value");
 		 System.out.println("The Name is ="+elem.getText());
 		 System.out.println("The value is = "+AmortisationBalance);
 		
 		 if(AmortisationBalance.contains(","))
 		 {
 			AmortisationBalance=AmortisationBalance.replace(",", "");
 		 }
 		 
 		ActualAmortisationBalance=AmortisationBalance;
 		
 		System.out.println("Value at CT_Adjustment_ProfitLossTab="+ActualAmortisationBalance);
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "getCharitable_donationsBalance ");

  		TestModellerLogger.PassStep(m_Driver, "getCharitable_donationsBalance ");
		
	}
 	
 	public void VerifyLedgerValue()
 	{
 		
 		try {
			ProfitAndLoss_Report returnob=new ProfitAndLoss_Report(m_Driver);
			
			String getLedgervalue=returnob.retunValue();
			System.out.println("Act value = "+getLedgervalue);
			
			if(getLedgervalue.contains("(") && getLedgervalue.contains(")"))
			{
				assertEquals(ActualAmortisationBalance, 0.0,"Ledger Balance was negative but found "+ActualAmortisationBalance);
			}
			
			else
			{
			
				ExpectedAmortisationBalance = getLedgervalue;
			
			 if(ExpectedAmortisationBalance.contains(","))
	 		 {
				 ExpectedAmortisationBalance=ExpectedAmortisationBalance.replace(",", "");
	 		 }
			
			System.out.println("I'm returned value:"+ExpectedAmortisationBalance);
			
			assertEquals(ActualAmortisationBalance, ExpectedAmortisationBalance,"Ledger Balance did not match in FA CT_Adjustment");
			
			}
			ExtentReportManager.passStep(m_Driver, "VerifyLedgerValue ");

	  		TestModellerLogger.PassStep(m_Driver, "VerifyLedgerValue ");
		} 
 		
 		catch (NumberFormatException e) 
 		{
			
			e.printStackTrace();
		}
 		
 	}
 	
 	
 	public void VerifyLedgerValuewithNull()
 	{
 		
 		try {
			ProfitAndLoss_Report returnob=new ProfitAndLoss_Report(m_Driver);
//			
//			String getLedgervalue=returnob.retunValue();
//			
//			ExpectedAmortisationBalance=Float.parseFloat(getLedgervalue);
//			
//			System.out.println("I'm returned value:"+ExpectedAmortisationBalance);
			
			float Expected=0;
			
			assertEquals(ActualAmortisationBalance, Expected,"Ledger Balance did not match");
			
			
			ExtentReportManager.passStep(m_Driver, "VerifyLedgerValue ");

	  		TestModellerLogger.PassStep(m_Driver, "VerifyLedgerValue ");
		} 
 		
 		catch (NumberFormatException e) 
 		{
			
			e.printStackTrace();
		}
 		
 	}


	public void checkLedgerEntryExpenditure(String Enter_tDate , String Enter_Description , String Clickaccountbox , String Enter_Debit , String Clickaccountbox2 , String Enter_Credit , String Enter_Description1) throws Exception 
	{
		
		int size=m_Driver.findElements(By.xpath("//*[contains(text(),'Charitable Donation')]")).size();
		
		if(size==0)
		{
			page.factories.Reconcilation _Reconcilation = new page.factories.Reconcilation(m_Driver);
			
			_Reconcilation.Click_AdvisoryTool();
			
			_Reconcilation.Click_plussign();
			
			page.factories.JournalEntry _JournalEntry = new page.factories.JournalEntry(m_Driver);
			
			TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
			  _JournalEntry.Enter_Enter_tDate(Enter_tDate);  //data5

			 Thread.sleep(1000);

			  TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
			  _JournalEntry.Select_Slect_Currency("GBP");

			  Thread.sleep(1000);

			  TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
			  _JournalEntry.Enter_Enter_Description(Enter_Description);   //data6

			  Thread.sleep(1000);

			  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
			  _JournalEntry.Enter_Clickaccountbox(Clickaccountbox);   //data7

			  Thread.sleep(1000);
			
			  TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
			  _JournalEntry.Enter_Enter_Debit(Enter_Debit);   //data8
			  Thread.sleep(1000);
					  
			  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
			  _JournalEntry.Enter_Clickaccountbox2(Clickaccountbox2);  //data9
			  Thread.sleep(1000);

			  TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
			  _JournalEntry.Enter_Enter_Credit(Enter_Credit);  //data10
			  Thread.sleep(1000);

			TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
			  _JournalEntry.Click_Click_Save_btn(Enter_Description1);Thread.sleep(5000);
			  Thread.sleep(1000);
		}
		
	}

     
	
}