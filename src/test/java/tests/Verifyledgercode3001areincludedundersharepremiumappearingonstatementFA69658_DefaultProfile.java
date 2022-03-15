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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/470a0ba9-8ac3-4cf2-b961-45ef4cb9926f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1313, profileId = 101183)
public class Verifyledgercode3001areincludedundersharepremiumappearingonstatementFA69658_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658","Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658 - Default Profile"})
    @TestModellerPath(guid = "89f8dc71-88b5-4c93-98ea-03a7a3e4ba2b")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode3001areincludedundersharepremiumappearingonstatementFA69658_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658 _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658 = new pages.Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658(driver);
    TestModellerLogger.SetLastNodeGuid("0115329e-5f8b-4732-b3af-b5df3eb1d6b8");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4b4e27c6-b760-4317-a9a7-388ea8b5bdbd");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("211c57b8-c003-4779-8f6a-85a23f18959b");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("46759eb1-ea29-432f-9cac-2d14e882c4e0");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("45823e1b-b9ce-41e4-adc0-7daa97868b70");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a325b7d1-9a26-44c2-a475-c7c416d35161");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c39f2294-f382-451b-a53d-25c6d726ec54");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("5ff0dc26-f709-42a0-9154-1d664036c769");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4964d37c-57f1-4cb0-aefa-10fd8878c887");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("991e98ed-f3c8-4913-80cc-f49fa0d7f953");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("cbda6275-4b6f-45b7-afa2-f9d8e453f82d");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d2968750-0a1e-4027-9b51-c08c106b11c8");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ea662a95-bad5-433b-914e-81fb85d8beca");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("b8384bb1-c325-4dfb-a048-de1749ae9b6f");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("10fba3ca-f2c0-46f5-b458-ae88b8f9a976");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5522a938-20e4-4fa3-9b69-fbd9855f33ab");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Date("29/06/2020");
    

    TestModellerLogger.SetLastNodeGuid("847629ff-ad5d-4dd8-9609-86a89da38b7c");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("dc04b3be-8322-4701-8e68-4c218aa99f00");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Description("Test Demo");
    

    TestModellerLogger.SetLastNodeGuid("ce8c37eb-50c3-482f-b356-c294c9022091");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Account1("3001");
    

    TestModellerLogger.SetLastNodeGuid("fe1e9478-b0e3-4575-9282-191bfc42e122");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Credit3("500");
    

    TestModellerLogger.SetLastNodeGuid("8ddf34e1-1764-483c-b8b5-1951598851b3");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Account2("1300");
    

    TestModellerLogger.SetLastNodeGuid("fe106aae-c5b9-4ca0-bb43-37af8e6328f2");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Enter_Debit2("500");
    

    TestModellerLogger.SetLastNodeGuid("ec903117-78dc-4425-90f3-cbb9329327c2");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("708bce47-dfa3-43a8-a04c-f8d4332be256");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("9cf46aaa-1f26-4e85-85aa-a155e8930c01");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("cdc81283-ab51-45c0-91a5-a47da49ac3bb");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("dbf8a714-fdb7-459b-83fa-aeb824e2f20f");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("cb8f3817-f744-4e80-bee3-348206ad586c");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("61588295-3e87-48b4-b218-0292bb60ea42");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("7c14babe-1340-4a6a-b8e7-a663a1e22e7b");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("ebd5fa72-5350-4d0b-bc87-0f1fb27f02ff");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("21a6d436-0922-431a-9a47-9db3150b0e75");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f791cccf-3978-479c-88f3-43d936ed47ca");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69658.Click_Full_Accounts();
    

    }

}
