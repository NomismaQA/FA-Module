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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/27b42a6b-6099-4fa1-9c65-1e60b13692b5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1312, profileId = 101182)
public class Verifyledgercode7958areincludedunderlossgainonrevaluationreserveFA69654_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654","Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654 - Default Profile"})
    @TestModellerPath(guid = "6ef579a6-8799-4d07-8c4c-801d0970dc94")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode7958areincludedunderlossgainonrevaluationreserveFA69654_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654 _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654 = new pages.Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654(driver);
    TestModellerLogger.SetLastNodeGuid("36c6928e-9ada-40ad-a242-dbb880d9efcf");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("60cc3091-1269-47fb-b69d-c734b27b8b85");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bfb9a788-a3b8-4a45-a785-a9e660232876");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("cb783052-f05b-4fc8-ad2b-45689492263d");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("606ec34f-1664-4b91-83c1-e42e8d355e85");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1eb02f28-5f87-4c64-8cda-83ce871804ca");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d52717a5-f298-4dff-b1b1-d8d5a7972aad");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("1fb7a63e-724c-4944-afc0-702296fde532");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("cef9bc4e-3966-4840-a7d4-6685f5697e7c");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("57c0767e-b406-46dc-b299-d8562c5435da");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a99ab72c-9228-4d8e-abf9-3449a1474a3c");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("a40b9cdb-e287-4160-9995-bca36142ba97");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("06f9cb7a-fb84-4db0-b069-4cf72bb25b42");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("6b58f1c2-d789-4649-abeb-1fa3ed42e812");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("eb7352ce-695a-479c-ba78-1fc91afce67a");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("7ca1388b-a8a5-468d-beed-4683d56b8cac");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Date("26/06/2020");
    

    TestModellerLogger.SetLastNodeGuid("cf88924a-00db-4183-8dff-98166dcaebbe");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("e8e39756-4eac-4df7-a919-6fc1d6cd3b35");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Description("Test");
    

    TestModellerLogger.SetLastNodeGuid("c5cc2108-8bd5-4d51-b38a-12395fef6585");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Account1("7958");
    

    TestModellerLogger.SetLastNodeGuid("1a583947-8430-45d0-8b21-ccb7fdc199f5");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Debit1("1000");
    

    TestModellerLogger.SetLastNodeGuid("6b796593-7dbf-46cd-ad45-2b41d2d29cfc");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Account2("1300");
    

    TestModellerLogger.SetLastNodeGuid("10650393-9066-4614-b819-50237661141f");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Enter_Credit3("1000");
    

    TestModellerLogger.SetLastNodeGuid("0535252f-8866-4df0-895e-39a62ce47c18");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("981638a9-3402-44a1-93dc-3b412c0d5d3f");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("2fdbc64d-1078-45ac-9267-eb3628995c14");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("2ee51663-4a07-4e91-bc6e-88cfc97fc3f9");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("c255c068-f22f-4022-841a-bb0089879b63");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("886c71cb-fc6b-41d6-ab97-c2443bbfb650");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("6cc08f9c-86a1-4fe5-9b03-33216f500630");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("6183b9c0-11b8-442a-9c83-53e8f567688f");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("474544d8-a22c-465e-9a5d-341a91231a77");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("d75af8ef-2cc7-409f-b9e7-841bb0eab66c");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("d2da8bc8-8c4a-4689-8c2b-092d38f3f88a");
    _Verify_ledger_code_7958_are_included_under_loss_gain_on_revaluation_reserveFA69654.Click_Full_Accounts();
    

    }

}
