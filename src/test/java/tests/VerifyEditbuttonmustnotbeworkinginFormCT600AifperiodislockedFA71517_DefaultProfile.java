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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/849d60c8-a13c-457a-998a-980366d83705
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1493, profileId = 101403)
public class VerifyEditbuttonmustnotbeworkinginFormCT600AifperiodislockedFA71517_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517","Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517 - Default Profile"})
    @TestModellerPath(guid = "a1ccbf87-b946-46d1-ac4c-dec3f5557366")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkinginFormCT600AifperiodislockedFA71517_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517 _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517 = new pages.Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517(driver);
    TestModellerLogger.SetLastNodeGuid("4be48fa3-2977-4731-baf9-0464c2247587");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d61b5e67-09a8-4773-8d4a-f63b7e7d2b89");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("90bdb99a-4ed5-4ed9-86e6-5db46b540799");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b3605f3c-af5c-46b2-9892-3e43f17b6800");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("6a58bb17-3682-4927-9d25-70a7ae742d47");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0c9f55d7-7e33-43ff-943c-6599544e60f5");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("dcf84239-8969-4b23-bfc7-bae2ce93c68b");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("325c29c9-9fbc-4664-850c-bfb265d5a845");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ad45b93a-31df-420b-9d81-2036d804cde1");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f2054a25-c66b-4458-a511-2b764818996f");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("5103ec08-09dc-4d4f-b007-304b647fef51");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("0f5d2ddc-cf4b-4d0f-b5ad-2b85d6d07baa");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("5e736d7f-532f-475e-9424-5f475594b79f");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("105f5f5d-45f3-4d2e-a104-89a6839bf5ef");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("31053922-5bfc-462e-b52d-9158980ccb2a");
    _Verify_Edit_button_must_not_be_working_in_Form_CT600A_if_period_is_lockedFA71517.Click__CT600_Tax_Return_();
    

    }

}
