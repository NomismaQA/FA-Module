package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/838d09bd-d7c5-46fb-ba79-3b67c984e1b4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1017, profileId = 100922)
public class Verifyledgercode4020and4021areincludedunderTurnover69_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_4020_and_4021_are_included_under_Turnover69","Verify_ledger_code_4020_and_4021_are_included_under_Turnover69 - Default Profile"})
    @TestModellerPath(guid = "bea43c3d-0929-4f3f-82d5-5563b773878b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode4020and4021areincludedunderTurnover69_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_ledger_code_4020_and_4021_are_included_under_Turnover69 _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69 = new pages.Verify_ledger_code_4020_and_4021_are_included_under_Turnover69(driver);
    TestModellerLogger.SetLastNodeGuid("c03decb4-a31c-4ef4-ab12-7343d5865bab");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1fafba88-ff43-476c-8763-26b9f69f17a1");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f9bbd5df-1ec0-4cc6-a1b2-4989f878fb58");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d43aecfb-9666-4f7f-8cbd-56194e62a3c7");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0ce36261-85e8-4598-8a8f-2548ebda0083");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("604a0c92-7b2b-4293-89f0-292f6253d578");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b808a9cf-7a87-4d10-a6bb-5cc86435ea43");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("f92a4100-ab3a-41ab-b58b-4ebc405513e3");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1b7ff2ba-c630-433f-8c10-b3617c93bc78");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("becb607e-a985-49be-bafc-133633e98f61");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f866610c-f473-486f-a456-84535ac654c1");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("a2216570-2094-4d62-96b6-76ed343832df");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Searchbutton1();
    

    TestModellerLogger.SetLastNodeGuid("0bab6ddb-0b19-4f54-bf80-69fdc87355e4");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("5c66efcd-29e8-4722-8fb9-4a30970770e3");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("3f9e5f90-3fc9-4aea-8529-dcb8d9f2088e");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Addbutton1();
    

    TestModellerLogger.SetLastNodeGuid("473857cf-48c6-424e-9f5e-a0b4ce811a5a");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtDate("05/08/2020");
    

    TestModellerLogger.SetLastNodeGuid("7cc0fa8a-7b6a-4c2d-877a-9b3686cd6452");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtDescription("Test");
    

    TestModellerLogger.SetLastNodeGuid("77279f77-8484-4e6d-9430-46542b44e2d1");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Select_ctl00cPHddCurrency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("8f7773e0-ec8d-44fb-bfa7-14fd6f727bd8");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount("4020");
    

    TestModellerLogger.SetLastNodeGuid("ee551439-5ad5-4859-9164-5a7552802aae");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHrptRecordctl00txtCredit("2000");
    

    TestModellerLogger.SetLastNodeGuid("6feac9b9-d62c-4c33-a7d1-dfd857210d1d");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount("4021");
    

    TestModellerLogger.SetLastNodeGuid("715cf10d-757b-484a-aa5c-1163d7a49f31");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHrptRecordctl01txtCredit("3000");
    

    TestModellerLogger.SetLastNodeGuid("9c78bef0-0df3-4d78-bbc2-e6c5e64139f7");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount("1300");
    

    TestModellerLogger.SetLastNodeGuid("71fbca37-8c86-4fb1-a840-f124b92767ea");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHrptRecordctl02txtDebit("5000");
    

    TestModellerLogger.SetLastNodeGuid("75283a3e-7b26-42bc-863a-f85f220e748a");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("1f29d6b7-4a5b-453c-813c-96c79750fecb");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b56a645b-2b68-427a-b141-17e943a2e8c3");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("f2467e41-b230-43f1-8df9-6bec4fd7a56d");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("89110fa6-9177-456d-a9af-06ea38ca7a68");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("f0eb4e32-f655-4f14-b6aa-3daed5dc6564");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("37361e51-5513-4a85-a40d-2bc4cafeb100");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("a3071fa0-5011-4f2a-94a3-8e9f78e66bf9");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("0a2d28d6-02ab-4177-87d8-bb4d9f6afb32");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("6b8110bb-5b7d-486d-9686-d62b990a6091");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("585ea5a4-68b1-4a27-a366-340d2622b4da");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("988c0622-0e86-47dd-abf2-c9beb1a8000c");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("557a1a10-3c7e-4c93-9c7b-cf7a3bd2d1ca");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("27e53524-cf11-45a2-920c-02da2b1d2233");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("3366acee-d196-49a8-877f-e3782b30cd30");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_ctl00cPHchkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("42c2a9cd-01b9-4e54-a890-78b3bdd22bf3");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_ctl00cPHchkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("12bc8fb9-1437-4390-828d-e6ba5e4d097d");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("d4faa9d0-d9ba-4929-8d2f-ce25ffae69f8");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("9bacfb38-0908-430a-8b6e-26d5220a28c3");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d585d754-f663-4131-be86-5935a9f645af");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover69.Click_Detailed_Income_Statement();
    

    }

}
