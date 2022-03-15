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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/55668dc6-8986-4369-94d6-b7e593486d36
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1305, profileId = 101176)
public class Verifyledgercode7959and7960areincludedunderlossgainonchangesinprovisionFA69651_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651","Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651 - Default Profile"})
    @TestModellerPath(guid = "03bef98c-88e2-49b6-acb0-5b1871737b49")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode7959and7960areincludedunderlossgainonchangesinprovisionFA69651_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651 _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651 = new pages.Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651(driver);
    TestModellerLogger.SetLastNodeGuid("06f9617e-bb97-4f5c-af68-3edae1fc636c");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("28e8be40-57fa-4933-9d91-119dcb5a8f26");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0c9f9e04-f501-4b5e-8c09-ef34b6b56490");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("750e739d-9284-4fd1-a9b7-8ae7930b7cee");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("cb774b77-a134-46c4-8b26-05a7e05f6988");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4846c6fe-f71d-438d-9f34-cf87a0acde3f");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ed4bf118-b286-4133-8e72-625d336a4591");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("1fbfc117-a778-41bc-8e64-4047a5019cd6");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("83d9845b-b4e6-4488-b13c-ab0bfdc5cf47");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("b0426938-2129-4833-97bd-d7071c068492");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("9e3f7087-7c8d-4eb3-89a6-72a333c90796");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("ee4f24d8-7bc8-4943-8093-f9d26ac80ee7");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2d0508c8-dbca-49a0-98d8-98de26ef4d19");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("86486663-e79f-4ecf-8671-08e2a62a6b6e");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("c297168a-8068-4ee5-9112-95e74ba5cbee");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("28820913-8f76-4d25-88ea-f98e66749835");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Date("31/07/2020");
    

    TestModellerLogger.SetLastNodeGuid("3647142c-e4d4-4baa-82ff-ab4fc8fba138");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("8f2fe155-d843-4508-a541-5b4585a6dfb1");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Description("Test7959");
    

    TestModellerLogger.SetLastNodeGuid("2974225d-f75b-4128-97d4-bdf6b54a60bc");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Account1("7959");
    

    TestModellerLogger.SetLastNodeGuid("05284f69-7d05-4105-8cf2-b4b7c0bace6b");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Debit1("1000");
    

    TestModellerLogger.SetLastNodeGuid("deadc03a-4850-44e5-a32a-852c4b237325");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Account2("7960");
    

    TestModellerLogger.SetLastNodeGuid("6c77d141-d40f-41a0-925a-fc6582de8d15");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Debit2("1500");
    

    TestModellerLogger.SetLastNodeGuid("19037544-35b6-4add-8ae5-a1c7c78c180e");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Account3("1300");
    

    TestModellerLogger.SetLastNodeGuid("ab0412b7-0f3c-4f3d-a0b8-12b37d620cf4");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Enter_Credit3("2500");
    

    TestModellerLogger.SetLastNodeGuid("11c05dc8-9112-4873-926c-0372781ce578");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("bf6cece4-1e39-4a5b-8ec4-73397bdb41f7");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b7976626-1835-41f7-a574-ecaabe8f1358");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("d688c984-9768-4e40-85f2-381e9754a6a1");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("65c1efe1-0d42-43b8-b07c-402b0ff757f8");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__();
    

    TestModellerLogger.SetLastNodeGuid("ea301dc3-622d-437b-be52-2b40727b89fe");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Select_ctl00cPHddlReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("6aa33d6f-3e31-4ba5-8861-d6a676747a13");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("53de3ea7-911c-41a8-b4a6-1e9195c7dd6d");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("ab3e72dc-4408-4669-966c-02afd7d02867");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Save__1();
    

    TestModellerLogger.SetLastNodeGuid("12698d78-a386-46ac-b048-9a80c16f51ea");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("06718d18-4900-41ed-9f8d-891e09b702e0");
    _Verify_ledger_code_7959_and_7960_are_included_under_loss_gain_on_changes_in_provisionFA69651.Click_Full_Accounts();
    

    }

}
