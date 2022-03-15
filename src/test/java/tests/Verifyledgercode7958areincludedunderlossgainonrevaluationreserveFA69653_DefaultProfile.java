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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/899b4a92-2152-419b-bb0c-637ff2a91a92
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1310, profileId = 101181)
public class Verifyledgercode7958areincludedunderlossgainonrevaluationreserveFA69653_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653","Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653 - Default Profile"})
    @TestModellerPath(guid = "c2d1e892-c0d0-4c4e-adee-3fedc79fae55")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode7958areincludedunderlossgainonrevaluationreserveFA69653_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653 _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653 = new pages.Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653(driver);
    TestModellerLogger.SetLastNodeGuid("cf60e634-4996-4088-9d4d-8d148a70b8ee");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7f115c0f-d6f3-47ed-a9d1-bddf569d9620");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6dc60ea2-39da-4e2f-9d73-39296261f4d6");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2463daca-5bf0-4a6d-a6a5-5bebb0636a0a");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("06d41884-9de7-4b0b-a7a7-7480c76246eb");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("065bc4a9-c355-42ba-88b4-ddc1a02644d5");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("bbe81fa3-bb06-4126-8a93-dd77977bd9fb");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a4ebc7e0-e211-441b-ac5f-21a4577c05b7");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("44eabfe4-25b9-4a10-9f49-b0e31046a250");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("519cb07f-1702-4ae2-a27c-aeabacae650e");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("cb95c6de-bfcc-4fc1-9ad4-90a287af9351");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("22ab46f5-2b24-4aaf-a973-d0d2f53fcad2");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e9ece649-a4c2-4a7a-8e48-ef9aff988ffa");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("15ad0b6c-131d-4092-b696-91ffb41f7b8d");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("dcaa0013-73b7-4e33-ba82-d5148c95fe27");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("ec0b41c2-e0a2-4e23-81b3-d21b018039cd");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Date("05/07/2020");
    

    TestModellerLogger.SetLastNodeGuid("aa28dfed-d95f-4e5a-b38e-92486b18cdb5");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("798803b4-c962-4b13-a5d4-3c9465b3b912");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Description("Test");
    

    TestModellerLogger.SetLastNodeGuid("6b796593-7dbf-46cd-ad45-2b41d2d29cfc");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Account1(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("c4f33ddc-7385-4920-bf97-aeabc2bae57d");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Debit1("700");
    
    TestModellerLogger.SetLastNodeGuid("6b796593-7dbf-46cd-ad45-2b41d2d29cfc");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Account2(sData[6]);
        

    TestModellerLogger.SetLastNodeGuid("1fcf75c8-47ed-4863-bc30-ccad66aacc29");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Enter_Credit3("700");
    

    TestModellerLogger.SetLastNodeGuid("1706ab8a-a754-43b3-bf4b-8759c057c906");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("2e902032-2de3-4ada-a02c-61fe8fc9077c");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("96007849-0132-4605-adeb-40f4d5f18937");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("b5746de4-6770-4273-9930-b13251c8d399");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("76836f16-a645-4e5f-b2d9-b284234ed79f");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("2f088e5b-1139-4a54-9c38-6da772aa50da");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("f98d90eb-a095-49a5-b69e-bd1f388870d1");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("d96dfd9c-22ef-4882-9358-3cb10ae81647");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("c7b09762-c514-4032-a7ef-2bde68f5e5f6");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("4b51106a-8f19-4fee-addd-674eadce9fb7");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("a03d4199-7037-464d-a086-d2e2a6a555b3");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69653.Click_Full_Accounts();
    

    }

}
