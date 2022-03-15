package page.factories;

import pages.BasePage;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.CalculateDatesRange;
import utilities.ChangeWindow;
import utilities.TakeScreenshot;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/a50235a3-00f3-427c-9b57-7357800017da
@TestModellerModule(guid = "a50235a3-00f3-427c-9b57-7357800017da")
public class BK_Settings extends BasePage
{
	static int TotalRange;
	
	static String FinancialYrName;
	
	static String returnjournalDate;
	
		
	public BK_Settings (WebDriver driver)
	{
		super(driver);
	}


	
	private By ClickBK_Setting_SideMenuElem = By.xpath("//*[@id='ctl00_SideMenu1_settingMenu']/a/span");

	private By Click_BK_Setting_AccountingPeriodElem = By.xpath("//*[@id='__tab_ctl00_cPH_tbContainer_TbAccPeriod']");
	
	private By getTotalAccountingPeriodElem = By.xpath("//th[starts-with(text(),'Period')]");
	
	private By getAccountPeriodLockedStatusElem = By.xpath("//th[starts-with(text(),'Locked')]/following::td[7]");
	
	private By getAccountPeriodClosedStatusElem = By.xpath("//th[starts-with(text(),'Closed')]/following::td[8]");
	
	private By Click_EditElem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnEdit']");
	
	private By Click_ChangeExistingyrElem = By.xpath("//a[@id='ctl00_cPH_tbContainer_TbAccPeriod_btnPreiodEdit']");

	private By Enter_PeriodNewStartDateElem = By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_txtStartDate']");

	private By Enter_PeriodNewEndDateElem = By.xpath("//*[@id='ctl00_cPH_rptrDisplayRecords_ctl00_txtEndDate']");

	private By Click_UpdateFinancialYrElem = By.xpath("//*[@id='ctl00_cpHeaderRight_btnSave']");

	private By getFinancialPeriodElem = By.xpath("//*[@id='ctl00_divSubContent']/div[3]/div/table/tbody/tr/td[1]");



	
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
 	 * Click ClickBK_Setting_SideMenuElem
     * @name Click ClickBK_Setting_SideMenuElem
     */
	public void ClickBK_Setting_SideMenu()
	{
        
		WebElement elem = getWebElement(ClickBK_Setting_SideMenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "ClickBK_Setting_SideMenu", "ClickBK_Setting_SideMenu failed. Unable to locate object: " + ClickBK_Setting_SideMenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "ClickBK_Setting_SideMenu", "ClickBK_Setting_SideMenu failed. Unable to locate object: " + ClickBK_Setting_SideMenuElem.toString());

			Assert.fail("Unable to locate object: " + ClickBK_Setting_SideMenuElem.toString());
        }

		//elem.click();
          jsExec.executeScript("arguments[0].click();", elem);	

		ExtentReportManager.passStep(m_Driver, "ClickBK_Setting_SideMenu");

		TestModellerLogger.PassStep(m_Driver, "ClickBK_Setting_SideMenu");
	}

     
	/**
 	 * Enter Click_BK_Setting_AccountingPeriod
	 * @throws Exception 
	 * @name Enter Click_BK_Setting_AccountingPeriod
     */
	
 	public void Click_BK_Setting_AccountingPeriod() throws Exception
 	{
 	    
 		WebElement elem = getWebElement(Click_BK_Setting_AccountingPeriodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_BK_Setting_AccountingPeriod", "Click_BK_Setting_AccountingPeriod failed. Unable to locate object: " + Click_BK_Setting_AccountingPeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_BK_Setting_AccountingPeriod", "Click_BK_Setting_AccountingPeriod failed. Unable to locate object: " + Click_BK_Setting_AccountingPeriodElem.toString());

 			Assert.fail("Unable to locate object: " + Click_BK_Setting_AccountingPeriodElem.toString());
         }

 		jsExec.executeScript("arguments[0].click();", elem);
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Click_BK_Setting_AccountingPeriod ");

  		TestModellerLogger.PassStep(m_Driver, "Click_BK_Setting_AccountingPeriod ");
 	}
 	
 	
 	
 	/**
 	 * Searching table and getting Accounting period
 	 * @throws InterruptedException 
 	 * 
 	 */
 	public void getAccountingPeriod(String NewStartDate , String NewEndDate) throws InterruptedException
 	{
 		
 		int tableSize=m_Driver.findElements(By.xpath("//*[@id='dvPeriod']/div/div[2]/div/div/table/tbody/tr")).size();
 		
 		System.out.println("Table size of accounting period="+tableSize);
 		
 		if(tableSize==1)
 		{
 			
 			WebElement elem1 = getWebElement(getAccountPeriodLockedStatusElem);
 			String lockedStatus=elem1.getText();
 			if(lockedStatus.equalsIgnoreCase("Yes"))
 			{
 				
 				
 			}
 			
 			WebElement elem2=getWebElement(getAccountPeriodClosedStatusElem);
 			String closedStatus=elem2.getText();
 			if(closedStatus.equalsIgnoreCase("Yes"))
 			{
 				
 				
 			}
 			
 			WebElement elem3=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Closed')]/following::td[2]"));
 	
 	 		System.out.println("This is value="+elem3.getText());
 	 		
 	 		String TotalPeriod=elem3.getText();
 	 		
 	 		String[] arrayDate=TotalPeriod.split(" ");
 	 		
 	 		LocalDate todaysDate = LocalDate.now();
 	        System.out.println("This is system date"+todaysDate);
 	 		

 	 		
 	 		String sDate="09-02-2022";
 //	 		sDate=sDate.replace('/', '-');
 	 		String eDate=arrayDate[2];
 	 		eDate=eDate.replace('/', '-');
 	 		System.out.println("eDate="+eDate);

 	 		 TotalRange=CalculateDatesRange.getDatesBetweenUsingJava7(sDate, eDate);
 			
 			System.out.println("This is the value i want="+TotalRange);
 			
 			if(TotalRange==1)
 			{
 				WebElement elemEdit = getWebElement(Click_EditElem);
 				elemEdit.click();
 				Thread.sleep(1000);
 				
 				WebElement elemChengeExistingYr = getWebElement(Click_ChangeExistingyrElem);
 				elemChengeExistingYr.click();
 				
 				WebElement newStartDateelem = getWebElement(Enter_PeriodNewStartDateElem);
 				for(int i=0; i<12;i++)
 				{
 					newStartDateelem.sendKeys(Keys.BACK_SPACE);
 				}
 				newStartDateelem.sendKeys(NewStartDate);
 				
 				
 				WebElement newEndDateelem = getWebElement(Enter_PeriodNewEndDateElem);
 				for(int i=0; i<12;i++)
 				{
 					newEndDateelem.sendKeys(Keys.BACK_SPACE);
 				}
 				newEndDateelem.sendKeys(NewEndDate);
 				
 				WebElement updateButton= getWebElement(Click_UpdateFinancialYrElem);
 				updateButton.click();
 				
 				WebElement getPeriodName= getWebElement(getFinancialPeriodElem);
 				FinancialYrName=getPeriodName.getText();
 				
 				System.out.println("FinancialYrName"+FinancialYrName);
 				
 			}
 			
 		}
 
 		if(tableSize>1)
 		{
 			
 			WebElement elem1=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Locked')]/following::tr["+tableSize+"]/td[7]"));
 			String lockedStatus=elem1.getText();
 			if(lockedStatus.equalsIgnoreCase("Yes"))
 			{
 				WebElement elemEdit = getWebElement(Click_EditElem);
 				elemEdit.click();
 				Thread.sleep(1000);
 				m_Driver.findElement(By.xpath("//th[starts-with(text(),'Locked')]/following::tr["+tableSize+"]/td[9]/a")).click();
 				
 				
 				
 			}
 			
 			
 			WebElement elem2=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Locked')]/following::tr["+tableSize+"]/td[8]"));
 			String closedStatus=elem2.getText();
 			if(closedStatus.equalsIgnoreCase("Yes"))
 			{
 				
 				
 			}
 			
 			
 		}
 		
 	}
 	
 	
 	/**
 	 * Return financial year name
 	 */
 	public String returnFinancialYear()
 	{
 		return FinancialYrName;
 	}
 	
 	
 	
 	/**
 	 * 
 	 * @param getPeriod
 	 * @throws Exception
 	 */
 	public void getTotalAccountingPeriod() throws Exception 
 	{
		
 		WebElement elem = getWebElement(getTotalAccountingPeriodElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "getTotalAccountingPeriod", "getTotalAccountingPeriod failed. Unable to locate object: " + getTotalAccountingPeriodElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "getTotalAccountingPeriod", "getTotalAccountingPeriod failed. Unable to locate object: " + getTotalAccountingPeriodElem.toString());

 			Assert.fail("Unable to locate object: " + getTotalAccountingPeriodElem.toString());
         }

 		elem=m_Driver.findElement(By.xpath("//td[contains(text(),'"+FinancialYrName+"')]/following::td[1]"));
 		
 		System.out.println("This is the path="+elem);
 		System.out.println("This is value="+elem.getText());
 		
 		String TotalPeriod=elem.getText();
 		
 		String[] arrayDate=TotalPeriod.split(" ");
 		

 		
 		String sDate=arrayDate[0];
 		sDate=sDate.replace('/', '-');
 		String eDate=arrayDate[2];
 		returnjournalDate=eDate;
 		eDate=eDate.replace('/', '-');
 		System.out.println("eDate="+eDate);
 		
 		 TotalRange=CalculateDatesRange.getDatesBetweenUsingJava7(sDate, eDate);
 		
 		
 		
  		ExtentReportManager.passStep(m_Driver, "getTotalAccountingPeriod ");

  		TestModellerLogger.PassStep(m_Driver, "getTotalAccountingPeriod ");
		
	}
 	
 	/*Returning total date range
 	 * 
 	 * 
 	 */
 	public int returTotalPeriodRange()
 	{
 		System.out.println("This is total range in retun method"+TotalRange);
		return TotalRange;
 		
 		
 	}
 	
 	
 	/*Returning date for journal entry
 	 * 
 	 * 
 	 */
 	public String getDateforJournalEntry()
 	{
 		System.out.println("This is total range in retun method"+TotalRange);
		return returnjournalDate;
 		
 		
 	}

/**
 * @throws Exception
 * 
 */
	public void FindAccountingPeriod(String service , String type) throws Exception 
	{
	//Find Table size	
		int tableSize=m_Driver.findElements(By.xpath("//*[@id='dvPeriod']/div/div[2]/div/div/table/tbody/tr")).size();
 		System.out.println("Table size of accounting period="+tableSize);
 		boolean condition=false;
 		while(condition==false)
 			
 		{
 	//check future date validation for period
 		for(int i=1; i<=tableSize; i++)
 		{
 			
 			//Validate period
 			WebElement period=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Closed')]/following::tr["+i+"]/td[2]"));
 	 	
	 		System.out.println("This is period="+period.getText());
	 		
	 		String TotalPeriod=period.getText();
	 		
	 		String[] arrayDate=TotalPeriod.split(" ");
	 		
	 		LocalDate todaysDate = LocalDate.now();
	        System.out.println("This is system date"+todaysDate);
	
	 		String sDate=arrayDate[2];
	 		sDate=sDate.replace('/', '-');
	 		String eDate="09-02-2022";
	 		//eDate=eDate.replace('/', '-');
	 		//System.out.println("eDate="+eDate);

	 		 TotalRange=CalculateDatesRange.getDatesBetweenUsingJava7(sDate, eDate);

			System.out.println("This is the value in TotalRange want="+TotalRange);
			
			
			//Check Locked Period
			String LockedStatus=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Closed')]/following::tr["+i+"]/td[7]")).getText();
			System.out.println("This is Locked status"+LockedStatus);
			
			
			//check Closed status
			String ClosedStatus=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Closed')]/following::tr["+i+"]/td[8]")).getText();
			System.out.println("This is Locked status"+ClosedStatus);
			
			
			if(TotalRange>1 && LockedStatus.equalsIgnoreCase("No") && ClosedStatus.equalsIgnoreCase("No"))
			{
				FinancialYrName=m_Driver.findElement(By.xpath("//th[starts-with(text(),'Closed')]/following::tr["+i+"]/td[1]")).getText();
				System.out.println("This is what u want"+FinancialYrName);
				condition=true;
				
				break;
				
			}
			
			
			
			
			
 		
 		}
 		
 		if(condition==false)
		{
			//m_Driver.close();
	 		ChangeWindow.tabs(1);
	 		
	 		page.factories.SearchClient _SearchClient2 = new page.factories.SearchClient(m_Driver);
	 		m_Driver.navigate().refresh();
	 		
	 		_SearchClient2.SelectServiceType(service);
	 		  
	 		  _SearchClient2.selectLimited(type);
	 		  
	 		  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
	 		  _SearchClient2.Click_SearchButton();
	 		  
	 		  
	 		  _SearchClient2.get_randomClient("Bookeeping", "Limited");
	 		  

	 		  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
	 		  _SearchClient2.Enter_EnterClientNameRandom();
	 		  

	 		  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
	 		  _SearchClient2.Click_SearchButton();
	 		  

	 		  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
	 		  _SearchClient2.Click_ClickOnClient();
	 		  
	 	
	 		 ClickBK_Setting_SideMenu();
	 		  
	 		 Click_BK_Setting_AccountingPeriod();
	 		 
	 		 
	 		 tableSize=m_Driver.findElements(By.xpath("//*[@id='dvPeriod']/div/div[2]/div/div/table/tbody/tr")).size();
	  		System.out.println("Table size of accounting period="+tableSize);
	 		
		}
 		
	}
		
	}
 	

}