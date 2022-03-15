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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c800d2e4-8bf3-4e0d-8bf9-0c5f77c23207
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1328, profileId = 101196)
public class VerifyturnoverlineitemmustbeappearevenincaseofnovaluestoshowFA69668_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668","Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668 - Default Profile"})
    @TestModellerPath(guid = "23c7a5ae-2cd4-43f6-912d-34faa4782ba1")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyturnoverlineitemmustbeappearevenincaseofnovaluestoshowFA69668_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668 _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668 = new pages.Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668(driver);
    TestModellerLogger.SetLastNodeGuid("d9106ecd-8b36-43d9-9462-42a8aa69f237");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("db472bf3-7283-40e2-b8b0-fb8ed2f290c1");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("15b138bb-e686-420e-bf1e-afc961510ca3");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f66df51e-6857-43a3-be94-0ca2b3a6c31c");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0f1842a8-a5a6-429d-a1da-41b705fa6d3a");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9596d974-409e-4fd6-a26c-46dd66038b05");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("49dd95d1-fd08-4c2c-bff1-94fc8d513f27");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("db65e791-cd28-42a6-a8df-eab97b7de1cb");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("243a2935-10ac-45ac-8297-2f8f2b7a9aca");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("56020e72-06b5-4f68-80c7-bf68395473f0");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("36b170be-edd4-4bce-8b61-528fdecc82bd");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("843bd6a5-95b5-4cf3-bd9e-07d823891531");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("95bc1853-66e8-44c7-b0d5-cda3cd39509d");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("5347cf47-e5eb-41cc-b724-c8931303550e");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("565b4cb5-f361-4cd2-a701-c7e5383e30fb");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("25592dc0-8894-4980-9a1c-f7f30fd99440");
    _Verify_turnover_line_item_must_be_appear_even_in_case_of_no_values_to_showFA69668.Click_Full_Accounts();
    

    }

}
