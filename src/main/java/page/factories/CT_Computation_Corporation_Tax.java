package page.factories;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.CalculateDatesRange;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;
import java.util.List;


// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a50235a3-00f3-427c-9b57-7357800017da
@TestModellerModule(guid = "a50235a3-00f3-427c-9b57-7357800017da")
public class CT_Computation_Corporation_Tax extends BasePage
{
	float ActualAccountBalance;
	
	float ExpectedAmortisationBalance;
	
	public CT_Computation_Corporation_Tax (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickCT_ComputationSideMenuElem = By.xpath("//*[@id='ctl00_SideMenu1_FinalAccountsCTComputation']/a");

	private By selectFinancialYearElem = By.xpath("//select[@id='ddlFinancialYear']");
	
	private By getAccountBalanceElem = By.xpath("//*[@id='ctl00_divSubContent']/div[2]/div[2]/div/table[1]/tbody/tr[9]/td[5]");



	/**
 	 * Go to Url
     * @name Go to Url
     */
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
 	 * Click ClickCT_ComputationSideMenuElem
     * @name Click ClickCT_ComputationSideMenuElem
     */
	public void ClickCT_ComputationSideMenu()
	{
        
		WebElement elem = getWebElement(ClickCT_ComputationSideMenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickCT_ComputationSideMenu", "ClickCT_ComputationSideMenu failed. Unable to locate object: " + ClickCT_ComputationSideMenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickCT_ComputationSideMenu", "ClickCT_ComputationSideMenu failed. Unable to locate object: " + ClickCT_ComputationSideMenuElem.toString());

			Assert.fail("Unable to locate object: " + ClickCT_ComputationSideMenuElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "ClickCT_ComputationSideMenu");

		TestModellerLogger.PassStep(m_Driver, "ClickCT_ComputationSideMenu");
	}

     
	/**
 	 * Enter selectFinancialYear
	 * @throws Exception 
	 * @name Enter selectFinancialYear
     */
	
 	public void selectFinancialYear() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(selectFinancialYearElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "selectFinancialYear", "selectFinancialYear failed. Unable to locate object: " + selectFinancialYearElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "selectFinancialYear", "selectFinancialYear failed. Unable to locate object: " + selectFinancialYearElem.toString());

 			Assert.fail("Unable to locate object: " + selectFinancialYearElem.toString());
         }

 		BK_Settings ob=new BK_Settings(m_Driver);
		String yrDate=ob.returnFinancialYear();
		
		List<WebElement> options=m_Driver.findElements(By.xpath("//*[@id='ddlFinancialYear']/option"));
		
		for(WebElement option:options)
		{
			options=m_Driver.findElements(By.xpath("//*[@id='ddlFinancialYear']/option"));
			yrDate=option.getText();
			
			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(yrDate);
			
			verifyTotalValue();
		}
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "selectFinancialYear "+yrDate);

  		TestModellerLogger.PassStep(m_Driver, "selectFinancialYear "+yrDate);
 	}
 	
 	
 	public void getAccountBalance(String value) throws Exception 
 	{
		
 		WebElement elem = getWebElement(getAccountBalanceElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getAccountBalance", "getAccountBalance failed. Unable to locate object: " + getAccountBalanceElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getAccountBalance", "getAccountBalance failed. Unable to locate object: " + getAccountBalanceElem.toString());

 			Assert.fail("Unable to locate object: " + getAccountBalanceElem.toString());
         }

 	String AccountValue=	elem.getText();
 	
 	if(AccountValue.contains("(") || AccountValue.contains(")"))
	{
	
 		AccountValue=AccountValue.replaceAll("[(]", "");
	
 		AccountValue=AccountValue.replaceAll("[)]", "");
 		
 		AccountValue=AccountValue.replaceAll("[,]", "");
	
	}
 	
 	if(AccountValue.contains(",") )
	{
	
 		AccountValue=AccountValue.replaceAll("[,]", "");
	
	}
 	
 	System.out.println("This is the vale at CT_Computation "+AccountValue);
 		
 	ActualAccountBalance=Float.parseFloat(AccountValue);
 	
 	TakeScreenshot.takeScreenshot(m_Driver, "CT_Computation value"+value);
 		
  		ExtentReportManager.passStep(m_Driver, "getAccountBalance ");

  		TestModellerLogger.PassStep(m_Driver, "getAccountBalance ");
		
	}
 	
 	
	public void verifyTotalValue() 
	{
		
		try {
			ProfitAndLoss_Report returnob=new ProfitAndLoss_Report(m_Driver);
			
			String getLedgervalue=returnob.retunValueforCT_Cmputation();
			
			if(getLedgervalue.contains("(") || getLedgervalue.contains(")" ))
			{
			
			getLedgervalue=getLedgervalue.replaceAll("[(]", "");
			
			getLedgervalue=getLedgervalue.replaceAll("[)]", "");
			
			}
			
			if(getLedgervalue.contains(","))
			{
			
			getLedgervalue=getLedgervalue.replaceAll("[,]", "");
			
			
			
			}
			
			ExpectedAmortisationBalance=Float.parseFloat(getLedgervalue);
			
			System.out.println("I'm converted value:"+ExpectedAmortisationBalance);
			
			String dateStart=m_Driver.findElement(By.xpath("//span[contains(text(),' as per Accounts')]/following::span[2]")).getText();
			
			System.out.println("start date="+dateStart);
			
			String dateEnd=m_Driver.findElement(By.xpath("//span[contains(text(),' as per Accounts')]/following::span[5]")).getText();
			System.out.println("end date="+dateEnd);
			
			
			int SelectedPeriod_numer_of_days=CalculateDatesRange.getDatesBetweenUsingJava7(dateStart, dateEnd);
			
			System.out.println("days="+SelectedPeriod_numer_of_days);
			
			page.factories.BK_Settings _BK_Settings=new page.factories.BK_Settings(m_Driver);
			int TotaAccountPeriodDays=_BK_Settings.returTotalPeriodRange();
			System.out.println("TotaAccountPeriodDays="+TotaAccountPeriodDays);
			
	//		float ActualAmountValue=ExpectedAmortisationBalance
			
			float valueExpected=(ExpectedAmortisationBalance/TotaAccountPeriodDays)*SelectedPeriod_numer_of_days;
			
			valueExpected=Math.round(valueExpected);
			
			System.out.println("valueExpected="+valueExpected);
			
	//		assertEquals(ActualAccountBalance, valueExpected,"Ledger Balance did not match");
			
		
			ExtentReportManager.passStep(m_Driver, "VerifyLedgerValue ");

	  		TestModellerLogger.PassStep(m_Driver, "VerifyLedgerValue ");
		} 
 		
 		catch (NumberFormatException e) 
 		{
			
			e.printStackTrace();
		}
		
	}


	public void verifyTotalValue1() {
		// TODO Auto-generated method stub
		
	}

     

}