package page.factories;

import pages.BasePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import ie.curiositysoftware.testmodeller.TestModellerModule;
import utilities.ChangeWindow;
import utilities.ClosePopup;
import utilities.GetRandomElementfromList;
import utilities.reports.ExtentReportManager;
import utilities.testmodeller.TestModellerLogger;

// https://nomisma.cloud.testinsights.io/app/#!/module-collection/guid/d12caecf-93fa-44c3-bb99-f59752ceb900
@TestModellerModule(guid = "d12caecf-93fa-44c3-bb99-f59752ceb900")
public class SearchClient extends BasePage
{
	
	
	static String selectedclient;
	
	public SearchClient(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	
	
	private By ClientsClickElem = By.xpath("//LI[@id='ctl00_ctl00_ParentContent_SideMenu1_businessMenu']/A");

	private By EnterClientNameElem = By.xpath("//INPUT[@name='ctl00$ctl00$ParentContent$cPHFilter$txtSearchCompany']");

	private By SearchButtonElem = By.xpath("//A[@id='ctl00_ctl00_ParentContent_cPHFilter_btnSearch']");

	private By ClickOnClientElem = By.xpath("//*[@id=\"ctl00_ctl00_ParentContent_cPH_rptrDisplayRecords_ctl00_rowCompany\"]/td[1]/span");
	
	private By SelectLimitedTypeElem = By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlType']");
	
	private By SelectServiceTypeElem = By.xpath("//select[@id='ctl00_ctl00_ParentContent_cPHFilter_ddlService']");


	
	public void GoToUrl()
	{
		m_Driver.get("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");

		ExtentReportManager.passStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
		
		TestModellerLogger.PassStepWithScreenshot(m_Driver, "Go to URL", "Go to URL - http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx");
	}

     
	/**
 	 * AssertUrl
     * @name AssertUrl
     */
   public void AssertUrl()
    {
        String currentUrl = m_Driver.getCurrentUrl();
        String expectedUrl = "http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx";

        if (!currentUrl.equals("http://sandbox4.nomismasolution.co.uk/AgentUI/Company.aspx")) {
            Assert.fail("Expecting URL - "  + expectedUrl + " Found " + currentUrl);
        }
    }

     
	/**
 	 * Click ClientsClick
	 * @throws InterruptedException 
     * @name Click ClientsClick
     */
	public void Click_ClientsClick() throws InterruptedException
	{
        
		WebElement elem = getWebElement(ClientsClickElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + ClientsClickElem.toString());

			Assert.fail("Unable to locate object: " + ClientsClickElem.toString());
        }
		
	

		ClosePopup.ValidateAndPopUp(m_Driver);
		jsExec.executeScript("arguments[0].click();", elem);
          	

		ExtentReportManager.passStep(m_Driver, "Click_ClientsClick");

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsClick");
	}
	
	
	/**
 	 * Select SelectServiceType
	 * @throws InterruptedException 
     * @name Select SelectServiceType
     */
	public void SelectServiceType(String servicetype)
	{
		WebElement elem = getWebElement(SelectServiceTypeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + SelectServiceTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + SelectServiceTypeElem.toString());

			Assert.fail("Unable to locate object: " + SelectServiceTypeElem.toString());
        }
		
		Select dropdown = new Select(elem);

		dropdown.selectByVisibleText(servicetype);
		
		ExtentReportManager.passStep(m_Driver, "Click_ClientsClick" +servicetype);

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsClick" +servicetype);
		
	}
	
	
	/**
 	 * Select SelectLimitedType
	 * @throws InterruptedException 
     * @name Select SelectLimitedType
     */
	public void selectLimited(String type)
	{
		WebElement elem = getWebElement(SelectLimitedTypeElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + SelectLimitedTypeElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClientsClick", "Click_ClientsClick failed. Unable to locate object: " + SelectLimitedTypeElem.toString());

			Assert.fail("Unable to locate object: " + SelectLimitedTypeElem.toString());
        }
		
		Select dropdown = new Select(elem);

		dropdown.selectByVisibleText(type);
		
		ExtentReportManager.passStep(m_Driver, "Click_ClientsClick" +type);

		TestModellerLogger.PassStep(m_Driver, "Click_ClientsClick" +type);
		
	}
	
	
	public void get_randomClient(String service , String type) throws InterruptedException 
	{
	
		
		List<WebElement> ClientOptions=m_Driver.findElements(By.xpath("//tr/td[1]"));
		
		while(ClientOptions.size()==0)
		{
			
			//m_Driver.close();
			
			ChangeWindow.tabs(0);
			
			m_Driver.navigate().refresh();
			
			page.factories.agentpage _agentpage = new page.factories.agentpage(m_Driver);
//		    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//		    _agentpage.GoToUrl();
		//    
		//
//		    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//		    _agentpage.AssertUrl();
		//    
		    
		    _agentpage.get_randomAgent();

		    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
		    _agentpage.Enter_SearchAgentNamebyRandom();
		    

		    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
		    _agentpage.Click_ClickSearch();
		    

		    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
		    _agentpage.Click_ClickAgent();
		    
		    Click_ClientsClick();
		    
		    SelectServiceType(service);
		    
		    selectLimited(type);
		    
		    Click_SearchButton();
		    
		    
		     ClientOptions=m_Driver.findElements(By.xpath("//tr/td[1]"));
		    
		 
		}
		
		GetRandomElementfromList randobj=new GetRandomElementfromList();
		WebElement randElement=randobj.getRandomElement(ClientOptions);
		
		
		
		selectedclient=randElement.getText();
		
		System.out.println(selectedclient);
		
			
	}

      
	/**
 	 * Enter EnterClientName
     * @name Enter EnterClientName
     */
 	public void Enter_EnterClientName(String EnterClientName)
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }

 		elem.sendKeys(EnterClientName);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterClientName " + EnterClientName);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterClientName " + EnterClientName);
 	}
 	
 	
 	/**
 	 * Enter EnterClientName
     * @name Enter EnterClientName
     */
 	public void Enter_EnterClientNameRandom()
 	{
 	    
 		WebElement elem = getWebElement(EnterClientNameElem);

 		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Enter_EnterClientName", "Enter_EnterClientName failed. Unable to locate object: " + EnterClientNameElem.toString());

 			Assert.fail("Unable to locate object: " + EnterClientNameElem.toString());
         }

 		elem.sendKeys(selectedclient);
 		
 		
  		ExtentReportManager.passStep(m_Driver, "Enter_EnterClientName " + selectedclient);

  		TestModellerLogger.PassStep(m_Driver, "Enter_EnterClientName " + selectedclient);
 	}

     
	/**
 	 * Click SearchButton
     * @name Click SearchButton
     */
	public void Click_SearchButton()
	{
        
		WebElement elem = getWebElement(SearchButtonElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_SearchButton", "Click_SearchButton failed. Unable to locate object: " + SearchButtonElem.toString());

			Assert.fail("Unable to locate object: " + SearchButtonElem.toString());
        }

		elem.click();
          	

		ExtentReportManager.passStep(m_Driver, "Click_SearchButton");

		TestModellerLogger.PassStep(m_Driver, "Click_SearchButton");
	}

     
	/**
 	 * Click ClickOnClient
     * @name Click ClickOnClient
     */
	public void Click_ClickOnClient()
	{
        
		WebElement elem = getWebElement(ClickOnClientElem);

		if (elem == null) {
    		ExtentReportManager.failStepWithScreenshot(m_Driver, "Click_ClickOnClient", "Click_ClickOnClient failed. Unable to locate object: " + ClickOnClientElem.toString());

    		TestModellerLogger.FailStepWithScreenshot(m_Driver, "Click_ClickOnClient", "Click_ClickOnClient failed. Unable to locate object: " + ClickOnClientElem.toString());

			Assert.fail("Unable to locate object: " + ClickOnClientElem.toString());
        }

		elem.click();
		
		ChangeWindow.tabswitch(m_Driver);
          	
		ClosePopup.ValidateAndPopUp(m_Driver);
		ExtentReportManager.passStep(m_Driver, "Click_ClickOnClient");

		TestModellerLogger.PassStep(m_Driver, "Click_ClickOnClient");
	}
}