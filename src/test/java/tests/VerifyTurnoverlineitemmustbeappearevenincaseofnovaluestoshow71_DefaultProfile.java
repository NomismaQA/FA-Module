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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4f147dae-66dd-4439-8870-9065be227721
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1033, profileId = 100936)
public class VerifyTurnoverlineitemmustbeappearevenincaseofnovaluestoshow71_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71","Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71 - Default Profile"})
    @TestModellerPath(guid = "586127a3-082b-4079-8014-e812b5706304")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyTurnoverlineitemmustbeappearevenincaseofnovaluestoshow71_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71 _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71 = new pages.Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71(driver);
    TestModellerLogger.SetLastNodeGuid("f5f0312a-6f48-49fd-98a4-ea4b3a3ecc00");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00236710-3d75-47da-8363-a0246b6838a0");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("39610dc2-4741-4a80-a7b4-df60ddd628cd");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("8be92185-097c-4d79-9471-9591744f52b0");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("aaa409b5-305e-47c6-aa1f-527312ed5c57");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2a16a8a9-969a-4317-8691-7527648c2bb2");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("16cd127c-84c1-444c-b6ff-d41095b14f7e");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("def32e42-5fe8-466a-a3d3-6573654e7f0d");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0f28612d-969b-44bd-8320-12abfa40abda");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("64edd44b-4c93-455f-947c-1d3d11731569");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6d427767-f800-46ba-ad73-bcefcca4d17b");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("e530ffa1-0a4d-436b-9f8e-f4faeb1b6ade");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d4d9a094-fd96-4095-b3ec-61c5b300140a");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("c19131e1-96e1-4d87-a286-e941c78e07da");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("10e28d0a-e0e3-4d13-a4ce-fc400499e801");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0d153117-99c8-40e3-b2ac-eb228f00c10f");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("b9dbad22-49f5-4837-a4dc-61882257bad4");
    _Verify_Turnover_line_item_must_be_appear_even_in_case_of_no_values_to_show71.Click_Detailed_Income_Statement();
    

    }

}
