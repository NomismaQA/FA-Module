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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d84a4410-839f-4707-ac53-c83940c975f7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1308, profileId = 101179)
public class Verifyledgercode7959and7960areincludedunderlossgainonchangesinprovisionFA69652_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652","Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652 - Default Profile"})
    @TestModellerPath(guid = "c8df5e40-9bb1-4069-ac2c-e1a7923906d7")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode7959and7960areincludedunderlossgainonchangesinprovisionFA69652_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652 _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652 = new pages.Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652(driver);
    TestModellerLogger.SetLastNodeGuid("28379907-068b-4eb9-9501-b2e60541237f");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a841098f-bfcc-4777-9b9e-e0fbd8427e14");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e1e4e025-50a7-4894-92f2-644486f17e6e");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ecad76cb-1ee4-4ff0-9c99-436dae7028b9");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("fdc69950-c969-4660-9b45-ec2bac687743");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("953139a2-6180-4c04-bfae-bc55f85ef890");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("33e34cec-6e74-4303-976f-9276148a548e");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c7f101a6-5bf9-4bfc-b1a2-749ca60e4459");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ce26eea3-4ea6-4034-b857-8194b000c2ac");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("20a78082-5a37-402f-b6db-b474a091d0a6");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("cc37844d-4382-4216-9d36-89f8f509fcf7");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("ac696c54-1b79-46ec-9837-c0a7a99ef0b0");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ae6c536c-a8fa-4702-ad88-94897395f56a");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("79c80df8-d08d-465e-b9b6-b4d04ca99520");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("cfa3a57d-c57c-46ee-8800-937c55f26124");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("9843d6be-61aa-4821-9d7d-65252d37e2a1");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Date("04/06/2020");
    

    TestModellerLogger.SetLastNodeGuid("10c25480-5f18-4cf5-a602-bfb8712588d1");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("86cb5ad2-a62a-44ac-b036-2f0a7187a6ce");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Description("Test");
    

    TestModellerLogger.SetLastNodeGuid("ac879d5c-7959-4adb-b541-65a21a9ee6da");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Account1("7959");
    

    TestModellerLogger.SetLastNodeGuid("ba8bd85c-dfeb-4563-a092-068162585b3c");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Debit1("1100");
    

    TestModellerLogger.SetLastNodeGuid("3b1e548a-bb02-4f7a-b0da-7e60ee8e713b");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Account2("7960");
    

    TestModellerLogger.SetLastNodeGuid("11c3e687-91bc-47fc-b291-9b096da4fa03");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Debit2("1600");
    

    TestModellerLogger.SetLastNodeGuid("5b55792b-eac2-47dd-a84d-56bceac9a359");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Account3("1300");
    

    TestModellerLogger.SetLastNodeGuid("4e6fa9f3-fb50-43db-9d46-966ee4d4de14");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Enter_Credit3("2700");
    

    TestModellerLogger.SetLastNodeGuid("cda1c94c-1f7f-48be-b560-39adf4e68af1");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("ac5f7f60-f835-4a6a-9f80-11fde4b92a51");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("fd359b48-37c4-40b6-b5dc-9e4fc46a3c6a");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("79dc4817-a151-4927-8d38-656074a142d6");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("407e4e02-198e-499a-a702-fa61e0202509");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("bfa65f90-e5ed-4685-aa8b-c5dd587f1a27");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("ed8e4fc3-5fa1-4c99-be8f-5956d1b02691");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("63681e05-ff2c-478b-a86f-1e5708ca9694");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("f02d15e8-428f-4a37-bf96-90554e1881af");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("bb2b1ae2-7f69-477a-af73-ca9096606ad6");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("2f541568-b5f5-4260-97b3-c2b468c301ab");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69652.Click_Full_Accounts();
    

    }

}
