package LedgerCodeCTProfitLoss;

import reports.TestNGListener;
import tests.TestBase;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f950ee3e-df17-4040-ac47-3ee417b05ffe
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1286, profileId = 101160)
public class TC1_4LedgerCode_CTAdjstment_ProfitLoss_Amortisation extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void LedgerCode_CTAdjstment_ProfitLoss_AmortisationLedger_Negative() throws Exception
    {
        
    	sTestCaseID="TC001";
        Sheet="LedgerData";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        page.factories.loginpage _loginpage = new page.factories.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

    page.factories.agentpage _agentpage = new page.factories.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
//    
    
    _agentpage.get_randomAgent();

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentNamebyRandom();
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    
    
    page.factories.SearchClient _SearchClient2 = new page.factories.SearchClient(driver);

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  
  
  _SearchClient2.SelectServiceType(data[3]);
  
  _SearchClient2.selectLimited(data[4]);
  
  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  
  
  _SearchClient2.get_randomClient(data[3], data[4]);
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientNameRandom();
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
  
  page.factories.BK_Settings _BK_Settings=new page.factories.BK_Settings(driver);

  _BK_Settings.ClickBK_Setting_SideMenu();

  _BK_Settings.Click_BK_Setting_AccountingPeriod();

  _BK_Settings.FindAccountingPeriod(data[3] , data[4]);
 
//  _BK_Settings.getAccountingPeriod(data[5] , data[6]);
  
  _BK_Settings.getTotalAccountingPeriod();

 // page.factories.ReportsSideMenu _ReportsSideMenu=new page.factories.ReportsSideMenu(driver);
  page.factories.Reconcilation _Reconcilation = new page.factories.Reconcilation(driver);
  
  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _Reconcilation.Click_SideMenuReports();
 
  page.factories.ReportsSideMenu _ReportsSideMenu=new page.factories.ReportsSideMenu(driver);
  
  _ReportsSideMenu.ClickReports_Financial_ProfitLoss();
  

  


  _Reconcilation.SelectFinancialYear();

  
  page.factories.CT_Adjustment_ProfitLossTab _CT_Adjustment_ProfitLossTab=new page.factories.CT_Adjustment_ProfitLossTab(driver);
  
  _CT_Adjustment_ProfitLossTab.checkLedgerEntryExpenditure(data[5] , data[6] , data[7] , data[8] , data[9] , data[10] , data[7]);
  



  
  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _Reconcilation.Click_SideMenuReports();

  _Reconcilation.SelectFinancialYear();
  

  
  _ReportsSideMenu.ClickReports_Financial_ProfitLoss();

  
  page.factories.ProfitAndLoss_Report _ProfitAndLoss_Report=new page.factories.ProfitAndLoss_Report(driver);
   
  _ProfitAndLoss_Report.getCharitable_donationsLedger(data[7]);

  _ReportsSideMenu.Click_FASideMenu();

  
  page.factories.FA_PageSideMenu _FA_PageSideMenu=new page.factories.FA_PageSideMenu(driver);
  
  _FA_PageSideMenu.ClickCT600_Tax_Return();
  
  _FA_PageSideMenu.ClickCT_Adjustments();
  
  _CT_Adjustment_ProfitLossTab.ClickProfitLossAdjsmentTab();
  
  
  _CT_Adjustment_ProfitLossTab.getAmortisationBalance(data[6]);
  
  _CT_Adjustment_ProfitLossTab.VerifyLedgerValue();
  
  page.factories.CT_Computation_Corporation_Tax  _CT_Computation_Corporation_Tax=new page.factories.CT_Computation_Corporation_Tax(driver);
  
  _CT_Computation_Corporation_Tax.ClickCT_ComputationSideMenu();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[6]);
  
  _CT_Computation_Corporation_Tax.verifyTotalValue();
//  
//  _CT_Computation_Corporation_Tax.selectFinancialYear();
//  
//  _CT_Computation_Corporation_Tax.getAccountBalance(data[6]);
//  
//  _CT_Computation_Corporation_Tax.verifyTotalValue();
  

    }
    
    
    @Test  (priority=2,enabled=false, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void LedgerCode_CTAdjstment_ProfitLoss_AmortisationLedger_debit() throws Exception
    {
        
    	sTestCaseID="TC002";
        Sheet="LedgerData";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        page.factories.loginpage _loginpage = new page.factories.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

    page.factories.agentpage _agentpage = new page.factories.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    page.factories.SearchClient _SearchClient2 = new page.factories.SearchClient(driver);
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
  
  page.factories.BK_Settings _BK_Settings=new page.factories.BK_Settings(driver);
  
  _BK_Settings.ClickBK_Setting_SideMenu();
  
  _BK_Settings.Click_BK_Setting_AccountingPeriod();
  
  _BK_Settings.getTotalAccountingPeriod();
  
  
  page.factories.Reconcilation _Reconcilation = new page.factories.Reconcilation(driver);




  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_AdvisoryTool();
  
  _Reconcilation.SelectFinancialYear();
  
  
  page.factories.JournalEntry _JournalEntry = new page.factories.JournalEntry(driver);

  
//  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
//  _JournalEntry.SelectFinancialYear(data[6]);


  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
  _JournalEntry.Click_plusiconclick();



  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  _JournalEntry.Enter_Enter_tDate(data[6]);

  // TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  // _JournalEntry.Enter_Reverse_Date(data[6]);

  TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
  _JournalEntry.Select_Slect_Currency("GBP");



  TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
  _JournalEntry.Enter_Enter_Description(data[7]);



  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox(data[8]);



  TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
  _JournalEntry.Enter_Enter_Debit(data[9]);

  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[20]);

  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox2(data[10]);



  TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
  _JournalEntry.Enter_Enter_Credit(data[11]);



//  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
//  _JournalEntry.Enter_Clickaccountbox3(data[13]);
//
//  _JournalEntry.Enter_Enter_Debit_3(data[14]);

  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[23]);

  TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
  _JournalEntry.Click_Click_Save_btn(data[7]);
  
  
  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _Reconcilation.Click_SideMenuReports();
  
  _Reconcilation.SelectFinancialYear();
  
  
  page.factories.ReportsSideMenu _ReportsSideMenu=new page.factories.ReportsSideMenu(driver);
  
  _ReportsSideMenu.ClickReports_Financial_ProfitLoss();
  
  
  page.factories.ProfitAndLoss_Report _ProfitAndLoss_Report=new page.factories.ProfitAndLoss_Report(driver);
   
  _ProfitAndLoss_Report.getValue7603AmortisationLedger(data[7]);
  
  _ReportsSideMenu.Click_FASideMenu();
  
  
  page.factories.FA_PageSideMenu _FA_PageSideMenu=new page.factories.FA_PageSideMenu(driver);
  
  _FA_PageSideMenu.ClickCT600_Tax_Return();
  
  _FA_PageSideMenu.ClickCT_Adjustments();
  
  
  page.factories.CT_Adjustment_ProfitLossTab _CT_Adjustment_ProfitLossTab=new page.factories.CT_Adjustment_ProfitLossTab(driver);
  
  _CT_Adjustment_ProfitLossTab.ClickProfitLossAdjsmentTab();
  
  _CT_Adjustment_ProfitLossTab.getAmortisationBalance(data[7]);
  
  _CT_Adjustment_ProfitLossTab.VerifyLedgerValue();
  
  
  page.factories.CT_Computation_Corporation_Tax  _CT_Computation_Corporation_Tax=new page.factories.CT_Computation_Corporation_Tax(driver);
  
  _CT_Computation_Corporation_Tax.ClickCT_ComputationSideMenu();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[7]);
  
  _CT_Computation_Corporation_Tax.verifyTotalValue();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[7]);
  
  _CT_Computation_Corporation_Tax.verifyTotalValue();
  

    }
    
    
    @Test  (priority=3,enabled=false, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void LedgerCode_CTAdjstment_ProfitLoss_AmortisationLedger_credit() throws Exception
    {
        
    	sTestCaseID="TC003";
        Sheet="LedgerData";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        page.factories.loginpage _loginpage = new page.factories.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

    page.factories.agentpage _agentpage = new page.factories.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    page.factories.SearchClient _SearchClient2 = new page.factories.SearchClient(driver);
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
  
  page.factories.BK_Settings _BK_Settings=new page.factories.BK_Settings(driver);
  
  _BK_Settings.ClickBK_Setting_SideMenu();
  
  _BK_Settings.Click_BK_Setting_AccountingPeriod();
  
  _BK_Settings.getTotalAccountingPeriod();
  
  
  page.factories.Reconcilation _Reconcilation = new page.factories.Reconcilation(driver);




  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_AdvisoryTool();
  
  _Reconcilation.SelectFinancialYear();
  
  
  page.factories.JournalEntry _JournalEntry = new page.factories.JournalEntry(driver);

  
//  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
//  _JournalEntry.SelectFinancialYear(data[6]);


  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
  _JournalEntry.Click_plusiconclick();



  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  _JournalEntry.Enter_Enter_tDate(data[6]);

  // TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  // _JournalEntry.Enter_Reverse_Date(data[6]);

  TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
  _JournalEntry.Select_Slect_Currency("GBP");



  TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
  _JournalEntry.Enter_Enter_Description(data[7]);



  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox(data[8]);



  TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
  _JournalEntry.Enter_Enter_Debit(data[9]);

  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[20]);

  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox2(data[10]);



  TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
  _JournalEntry.Enter_Enter_Credit(data[11]);



//  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
//  _JournalEntry.Enter_Clickaccountbox3(data[13]);
//
//  _JournalEntry.Enter_Enter_Debit_3(data[14]);

  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[23]);

  TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
  _JournalEntry.Click_Click_Save_btn(data[7]);
  
  
  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _Reconcilation.Click_SideMenuReports();
  
  _Reconcilation.SelectFinancialYear();
  
  
  page.factories.ReportsSideMenu _ReportsSideMenu=new page.factories.ReportsSideMenu(driver);
  
  _ReportsSideMenu.ClickReports_Financial_ProfitLoss();
  
  
  page.factories.ProfitAndLoss_Report _ProfitAndLoss_Report=new page.factories.ProfitAndLoss_Report(driver);
   
  _ProfitAndLoss_Report.getValue7603AmortisationLedger(data[7]);
  
  _ReportsSideMenu.Click_FASideMenu();
  
  
  page.factories.FA_PageSideMenu _FA_PageSideMenu=new page.factories.FA_PageSideMenu(driver);
  
  _FA_PageSideMenu.ClickCT600_Tax_Return();
  
  _FA_PageSideMenu.ClickCT_Adjustments();
  
  
  page.factories.CT_Adjustment_ProfitLossTab _CT_Adjustment_ProfitLossTab=new page.factories.CT_Adjustment_ProfitLossTab(driver);
  
  _CT_Adjustment_ProfitLossTab.ClickProfitLossAdjsmentTab();
  
  _CT_Adjustment_ProfitLossTab.getAmortisationBalance(data[7]);
  
  _CT_Adjustment_ProfitLossTab.VerifyLedgerValue();
  
  page.factories.CT_Computation_Corporation_Tax  _CT_Computation_Corporation_Tax=new page.factories.CT_Computation_Corporation_Tax(driver);
  
  _CT_Computation_Corporation_Tax.ClickCT_ComputationSideMenu();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[7]);
  
  _CT_Computation_Corporation_Tax.verifyTotalValue();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[7]);
  
  _CT_Computation_Corporation_Tax.verifyTotalValue();
  

    }
    
    
    @Test  (priority=4,enabled=false, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void LedgerCode_CTAdjstment_ProfitLoss_AmortisationLedger_Null() throws Exception
    {
        
    	sTestCaseID="TC004";
        Sheet="LedgerData";
     data = ExcelData.toReadExcelData(sTestCaseID, Sheet);
    	
        page.factories.loginpage _loginpage = new page.factories.loginpage(driver);
    TestModellerLogger.SetLastNodeGuid("46d36c40-f463-4658-bf9a-c79bfad8b6ba");
    _loginpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cb52d2ac-5b4b-448d-9864-0fc96932d277");
    _loginpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a3b75c02-20d9-486b-b363-d5655bc9c912");
    _loginpage.Enter_EnterUsername(data[1]);
    

    TestModellerLogger.SetLastNodeGuid("a87badd2-779d-47bb-adfe-a3d7a64299d2");
    _loginpage.Enter_Enterpassword(data[2]);
    

    TestModellerLogger.SetLastNodeGuid("8873965d-a051-4318-86c1-ad117dfc5c1b");
    _loginpage.Click_LoginButton();
    

    page.factories.agentpage _agentpage = new page.factories.agentpage(driver);
//    TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//    _agentpage.GoToUrl();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//    _agentpage.AssertUrl();
//    

    TestModellerLogger.SetLastNodeGuid("4f74cb0a-4c80-4c19-a49b-294b2920cf03");
    _agentpage.Enter_SearchAgentName(data[3]);
    

    TestModellerLogger.SetLastNodeGuid("517550e6-7acd-4c1d-9b49-bf6981f10361");
    _agentpage.Click_ClickSearch();
    

    TestModellerLogger.SetLastNodeGuid("490bbd4a-e083-4fd8-bf70-3b7573453dea");
    _agentpage.Click_ClickAgent();
    
    page.factories.SearchClient _SearchClient2 = new page.factories.SearchClient(driver);
//  TestModellerLogger.SetLastNodeGuid("5109b3b9-fd11-4c3e-9e95-128d58e64fd2");
//  _SearchClient2.GoToUrl();
//  
//
//  TestModellerLogger.SetLastNodeGuid("16e008e9-3c96-4262-9f3a-45fd436c0a2f");
//  _SearchClient2.AssertUrl();
  

  TestModellerLogger.SetLastNodeGuid("d82ac6ca-f61c-496d-9f11-2157531adeac");
  _SearchClient2.Click_ClientsClick();
  

  TestModellerLogger.SetLastNodeGuid("e4ef0d77-6b3e-4242-9036-0ecc563f2183");
  _SearchClient2.Enter_EnterClientName(data[4]);
  

  TestModellerLogger.SetLastNodeGuid("7410f7b2-6b7b-407e-853d-04dfe3f71d18");
  _SearchClient2.Click_SearchButton();
  

  TestModellerLogger.SetLastNodeGuid("cb45072d-4571-4568-919f-0da22372503c");
  _SearchClient2.Click_ClickOnClient();
  
  
  page.factories.BK_Settings _BK_Settings=new page.factories.BK_Settings(driver);
  
  _BK_Settings.ClickBK_Setting_SideMenu();
  
  _BK_Settings.Click_BK_Setting_AccountingPeriod();
  
  _BK_Settings.getTotalAccountingPeriod();
  
  
  page.factories.Reconcilation _Reconcilation = new page.factories.Reconcilation(driver);




  TestModellerLogger.SetLastNodeGuid("5fa7c856-5fe6-458c-94fd-c74460dd9b1f");
  _Reconcilation.Click_AdvisoryTool();
  
  _Reconcilation.SelectFinancialYear();
  
  
  page.factories.JournalEntry _JournalEntry = new page.factories.JournalEntry(driver);

  
//  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
//  _JournalEntry.SelectFinancialYear(data[6]);


  TestModellerLogger.SetLastNodeGuid("6147744d-5b4e-4fbe-b7a3-333858b16f4a");
  _JournalEntry.Click_plusiconclick();



  TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  _JournalEntry.Enter_Enter_tDate(data[6]);

  // TestModellerLogger.SetLastNodeGuid("e9c9ea8e-b958-43ca-8728-3b429b4aaecb");
  // _JournalEntry.Enter_Reverse_Date(data[6]);

  TestModellerLogger.SetLastNodeGuid("82bd70b7-b343-40f6-959b-ab6331ed8fbe");
  _JournalEntry.Select_Slect_Currency("GBP");



  TestModellerLogger.SetLastNodeGuid("94504f9f-098b-42ad-82b3-a743456020fc");
  _JournalEntry.Enter_Enter_Description(data[7]);



  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox(data[8]);



  TestModellerLogger.SetLastNodeGuid("9bffefbc-952c-4681-b0f1-4d6cdd9abcb1");
  _JournalEntry.Enter_Enter_Debit(data[9]);

  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[20]);

  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _JournalEntry.Enter_Clickaccountbox2(data[10]);



  TestModellerLogger.SetLastNodeGuid("248e3484-b1c0-489f-b3aa-53b8d02b9c80");
  _JournalEntry.Enter_Enter_Credit(data[11]);



//  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
//  _JournalEntry.Enter_Clickaccountbox3(data[13]);
//
//  _JournalEntry.Enter_Enter_Debit_3(data[14]);

  // TestModellerLogger.SetLastNodeGuid("2876ec19-50d6-4414-9db3-998398799181");
  // _JournalEntry.Enter_Enter_Note(data[23]);

  TestModellerLogger.SetLastNodeGuid("e322cae3-c645-4e40-989d-753f1b48ea5a");
  _JournalEntry.Click_Click_Save_btn(data[7]);
  
  
  TestModellerLogger.SetLastNodeGuid("cb49d4cd-87fd-4a49-afab-fd5672342bd1");
  _Reconcilation.Click_SideMenuReports();
  
  _Reconcilation.SelectFinancialYear();
  
  
  page.factories.ReportsSideMenu _ReportsSideMenu=new page.factories.ReportsSideMenu(driver);
  
  _ReportsSideMenu.ClickReports_Financial_ProfitLoss();
  
  
  page.factories.ProfitAndLoss_Report _ProfitAndLoss_Report =new page.factories.ProfitAndLoss_Report(driver);
   
//  _ProfitAndLoss_Report.getValue7603AmortisationLedger();
  
  _ReportsSideMenu.Click_FASideMenu();
  
  
  page.factories.FA_PageSideMenu _FA_PageSideMenu=new page.factories.FA_PageSideMenu(driver);
  
  _FA_PageSideMenu.ClickCT600_Tax_Return();
  
  _FA_PageSideMenu.ClickCT_Adjustments();
  
  
  page.factories.CT_Adjustment_ProfitLossTab _CT_Adjustment_ProfitLossTab=new page.factories.CT_Adjustment_ProfitLossTab(driver);
  
  _CT_Adjustment_ProfitLossTab.ClickProfitLossAdjsmentTab();
  
  _CT_Adjustment_ProfitLossTab.getAmortisationBalance(data[7]);
  
  _CT_Adjustment_ProfitLossTab.VerifyLedgerValuewithNull();
  
  page.factories.CT_Computation_Corporation_Tax  _CT_Computation_Corporation_Tax=new page.factories.CT_Computation_Corporation_Tax(driver);
  
  _CT_Computation_Corporation_Tax.ClickCT_ComputationSideMenu();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[7]);
  
 // _CT_Computation_Corporation_Tax.verifyTotalValue();
  
  _CT_Computation_Corporation_Tax.selectFinancialYear();
  
  _CT_Computation_Corporation_Tax.getAccountBalance(data[7]);
  
  _CT_Computation_Corporation_Tax.verifyTotalValue1();
  

    }
    
   
}
