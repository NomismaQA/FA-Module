package NewLedgerCodeCTPftLos;

import org.testng.annotations.Test;

import ie.curiositysoftware.testmodeller.TestModellerPath;
import tests.TestBase;
import utilities.ExcelData;
import utilities.testmodeller.TestModellerLogger;

public class TC01LedgerCode_7511CharitableDonations extends TestBase
{
    
	public String sTestCaseID=null;
    String[] data=null;
    String Sheet = null;

    
    @Test  (priority=1,enabled=true, groups= {"LeaverSubscript","LeaverSubscript - Default Profile"})
    @TestModellerPath(guid = "90798a2f-7a6d-4763-802e-d996fa55fb26")
    public void LedgerCode_CTAdjstment_ProfitLoss_CharitableDonations_Debit() throws Exception
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
//        TestModellerLogger.SetLastNodeGuid("9d764fa4-2232-4391-89cb-5d0e20c339cd");
//        _agentpage.GoToUrl();
    //    
    //
//        TestModellerLogger.SetLastNodeGuid("a4abffa1-0fff-44cd-8673-bcc89cb31158");
//        _agentpage.AssertUrl();
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
     

      
      _BK_Settings.getTotalAccountingPeriod();

  
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
      Thread.sleep(2000);
      
      _CT_Adjustment_ProfitLossTab.getCharitable_donationsBalance(data[6]);
      
     _CT_Adjustment_ProfitLossTab.VerifyLedgerValue();
      
      page.factories.CT_Computation_Corporation_Tax  _CT_Computation_Corporation_Tax=new page.factories.CT_Computation_Corporation_Tax(driver);
      
      _CT_Computation_Corporation_Tax.ClickCT_ComputationSideMenu();
      
          _CT_Computation_Corporation_Tax.selectFinancialYear();
      
      _CT_Computation_Corporation_Tax.getAccountBalance(data[6]);
      
      /*   _CT_Computation_Corporation_Tax.verifyTotalValue();
      
      */
      
    }
    }    