package page.factories;

import pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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

// http://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/ae1a1fe9-2c6b-4b2b-9008-59046981bac7
@TestModellerModule(guid = "ae1a1fe9-2c6b-4b2b-9008-59046981bac7")
public class Reconcilation extends BasePage
{
	public Reconcilation (WebDriver driver)
	{
		super(driver);
	}
	//@id='ctl00_cPH_rptrReconcile_ctl00_rptrDebitCredit_ctl124_cbSelect
	private By AcntantleftmenuElem = By.xpath("//*[@id='ctl00_SideMenu1_accountantMenu']/a/span");

	private By RepertsLeftMenuElem = By.xpath("//*[@id='ctl00_SideMenu1_reportMenu']/a/span");

	private By plussignElem = By.xpath("//*[@id='ctl00_cPH_btnAddJournalEntry']");

	private By SelectAccountType1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccountType']");

	private By SelectAccount1Elem = By.xpath("//SELECT[@name='ctl00$cPHFilter$ddlAccount']");

	private By View_Reconciled_button1Elem = By.xpath("//A[@id='ctl00_cpHeaderRight_btnReconciled']");
	
	private By Slect_FinancialYearElem = By.xpath("//SELECT[@id='ctl00_ddlFinancialYear']");
	

	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
//   public void AssertUrl()
//    {
//        String currentUrl = m_Driver.getCurrentUrl();
//        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3";
//
//        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AccountUI/Reconcile.aspx?FYCode=52444&CompanyCode=13236&s=3")) {
//            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
//        }
//    }

     
	/**
 	 * Click Acntantleftmenu
     * @name Click Acntantleftmenu
     */
	public void Click_SideMenuReports()
	{
        
		WebElement elem = getWebElement(RepertsLeftMenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SideMenuReports", "Click_AdvisoryTool failed. Unable to locate object: " + RepertsLeftMenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SideMenuReports", "Click_AdvisoryTool failed. Unable to locate object: " + RepertsLeftMenuElem.toString());

			Assert.fail("Unable to locate object: " + RepertsLeftMenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SideMenuReports");

		TestModellerLogger.PassStep(m_Driver, "Click_SideMenuReports");
	}
	
	
	/**
 	 * Click Acntantleftmenu
     * @name Click Acntantleftmenu
     */
	public void Click_AdvisoryTool()
	{
        
		WebElement elem = getWebElement(AcntantleftmenuElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_AdvisoryTool", "Click_AdvisoryTool failed. Unable to locate object: " + AcntantleftmenuElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_AdvisoryTool", "Click_AdvisoryTool failed. Unable to locate object: " + AcntantleftmenuElem.toString());

			Assert.fail("Unable to locate object: " + AcntantleftmenuElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_AdvisoryTool");

		TestModellerLogger.PassStep(m_Driver, "Click_AdvisoryTool");
	}
	
	
	public void SelectFinancialYear() 
	{
		
		WebElement elem = getWebElement(Slect_FinancialYearElem);

			if (elem == null) {
			ExtentReportManager.failStepWithScreenshot(m_Driver, "SelectFinancialYear", "SelectFinancialYear failed. Unable to locate object: " + Slect_FinancialYearElem.toString());

			TestModellerLogger.FailStepWithScreenshot(m_Driver, "SelectFinancialYear", "SelectFinancialYear failed. Unable to locate object: " + Slect_FinancialYearElem.toString());

				Assert.fail("Unable to locate object: " + Slect_FinancialYearElem.toString());
	     }

			BK_Settings ob=new BK_Settings(m_Driver);
			String yrDate=ob.returnFinancialYear();
			
			System.out.println("Returned financial year="+yrDate);
			
			Select dropdown = new Select(elem);

			dropdown.selectByVisibleText(yrDate);
			
			
			ExtentReportManager.passStep(m_Driver, "SelectFinancialYear " + yrDate);

			TestModellerLogger.PassStep(m_Driver, "SelectFinancialYear " + yrDate);
		
		
	}

     
	/**
 	 * Click Reconcilationlink1
	 * @throws InterruptedException 
     * @name Click Reconcilationlink1
     */
//	public void Click_Reconcilationlink1() throws InterruptedException
//	{
//        
//		WebElement elem = getWebElement(Reconcilationlink1Elem);
//
//		if (elem == null) {
//    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_Reconcilationlink1", "Click_Reconcilationlink1 failed. Unable to locate object: " + Reconcilationlink1Elem.toString());
//
//    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_Reconcilationlink1", "Click_Reconcilationlink1 failed. Unable to locate object: " + Reconcilationlink1Elem.toString());
//
//			Assert.fail("Unable to locate object: " + Reconcilationlink1Elem.toString());
//        }
//
//		elem.click();
//		Thread.sleep(2000);
//
//		ExtentReportManager.passStep(m_Driver, "Click_Reconcilationlink1");
//
//		TestModellerLogger.PassStep(m_Driver, "Click_Reconcilationlink1");
//	}

     
	/**
 	 * Click plussign
	 * @throws InterruptedException 
     * @name Click plussign
     */
	public void Click_plussign() throws InterruptedException
	{
        
		WebElement elem = getWebElement(plussignElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_plussign", "Click_plussign failed. Unable to locate object: " + plussignElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_plussign", "Click_plussign failed. Unable to locate object: " + plussignElem.toString());

			Assert.fail("Unable to locate object: " + plussignElem.toString());
        }

		JavascriptExecutor jse = (JavascriptExecutor)m_Driver;
		jse.executeScript("arguments[0].click()", elem);
		

	ExtentReportManager.passStep(m_Driver, "Click_plussign");

		TestModellerLogger.PassStep(m_Driver, "Click_plussign");
	}

    
	/**
 	 * Select SelectAccountType1
     * @name Select SelectAccountType1
     */
    public void Select_SelectAccountType1(String SelectAccountType1)
 	{
 	    
 		WebElement elem = getWebElement(SelectAccountType1Elem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectAccountType1", "Select_SelectAccountType1 failed. Unable to locate object: " + SelectAccountType1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectAccountType1", "Select_SelectAccountType1 failed. Unable to locate object: " + SelectAccountType1Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectAccountType1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectAccountType1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectAccountType1 " + SelectAccountType1);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectAccountType1 " + SelectAccountType1);
 	}

    
	/**
 	 * Select SelectAccount1
     * @name Select SelectAccount1
     */
    public void Select_SelectAccount1(String SelectAccount1)
 	{
 	    
 		WebElement elem = getWebElement(SelectAccount1Elem);
 		

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Select_SelectAccount1", "Select_SelectAccount1 failed. Unable to locate object: " + SelectAccount1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Select_SelectAccount1", "Select_SelectAccount1 failed. Unable to locate object: " + SelectAccount1Elem.toString());

 			Assert.fail("Unable to locate object: " + SelectAccount1Elem.toString());
         }

 		Select dropdown = new Select(elem);

 		dropdown.selectByVisibleText(SelectAccount1);
 		
 		
 		ExtentReportManager.passStep(m_Driver, "Select_SelectAccount1 " + SelectAccount1);

 		TestModellerLogger.PassStep(m_Driver, "Select_SelectAccount1 " + SelectAccount1);
 	}

     
	/**
 	 * Click View Reconciled button1
     * @name Click View Reconciled button1
     */
	public void Click_View_Reconciled_button1()
	{
        
		WebElement elem = getWebElement(View_Reconciled_button1Elem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_View_Reconciled_button1", "Click_View_Reconciled_button1 failed. Unable to locate object: " + View_Reconciled_button1Elem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_View_Reconciled_button1", "Click_View_Reconciled_button1 failed. Unable to locate object: " + View_Reconciled_button1Elem.toString());

			Assert.fail("Unable to locate object: " + View_Reconciled_button1Elem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_View_Reconciled_button1");

		TestModellerLogger.PassStep(m_Driver, "Click_View_Reconciled_button1");
	}
}