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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/21d74211-15ad-4131-8b1c-988ca3863c61
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1479, profileId = 101361)
public class VerifyEditbuttonmustnotbeworkingforAboutthisreturnincasereturnislockedFA7157_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157","Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157 - Default Profile"})
    @TestModellerPath(guid = "82c5a670-210a-45dc-9cc1-7c242922f360")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkingforAboutthisreturnincasereturnislockedFA7157_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157 _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157 = new pages.Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157(driver);
    TestModellerLogger.SetLastNodeGuid("9c0837e8-5304-4741-9614-5896ca138b74");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2e29592e-dee8-4466-9786-10a252f38484");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8f0513b1-0418-4eee-abb7-8026615ba35b");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("664b0a31-69e3-4e47-80eb-9b8d29ad0050");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("6d6798a8-55fd-4c20-8dfc-9c8dc4a4fc8b");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("732a5e86-69e3-4c73-a4e1-9abed2258e6e");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8a0b1e4d-6e9d-4637-a6a4-073a9de63ebb");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("bc855957-709f-4aa6-9d83-90e47616048d");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("dbfa87b1-098b-464c-9b2d-a43feeaf878f");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("326bfde7-d048-4d4b-b1e3-c1b54aed622d");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e86c9c01-42b5-4402-b42c-66e17091d466");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("0980b7ad-701f-4adc-8725-89ac5b7bbf63");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("4f8a4b85-8c51-43d7-acfd-0f633b3bf734");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("1d015135-58cf-4373-b073-54778e1b92c2");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("e02b65c4-a0e0-4784-91cd-ec74dbfed150");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("354161d7-529e-4e9c-aa42-374c9271052b");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click_Submit_CT600();
    

    TestModellerLogger.SetLastNodeGuid("74e4b3be-1273-4770-ab18-8566acd08d62");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click_Unlock();
    

    TestModellerLogger.SetLastNodeGuid("d4578555-b3ba-49e4-bba6-f75d64ebde66");
    _Verify_Edit_button_must_not_be_working_for_About_this_return_in_case_return_is_lockedFA7157.Click_About_this_return();
    

    }

}
