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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f559e3d9-2f51-4d64-869d-fdd235b445d0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1489, profileId = 101394)
public class VerifyEditbuttonmustnotbeworkingforOverpaymentsandrepaymentsincasereturnFA71515_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515","Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515 - Default Profile"})
    @TestModellerPath(guid = "2e97c49b-e265-4ac9-ad8a-e7552704db9c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkingforOverpaymentsandrepaymentsincasereturnFA71515_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515 _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515 = new pages.Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515(driver);
    TestModellerLogger.SetLastNodeGuid("92c52535-8456-4322-9929-f2faead0295d");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9fad6d61-2dd8-424d-a84e-acab41860a26");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("be5e2b5c-cc50-45b9-9b72-7a1a0ead1ab3");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ea67f974-4a5a-4804-84ae-03a9ff120726");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("bd6cfce4-24d5-4805-bcd5-e9742dcf9488");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0fb8bd07-7646-400e-8016-dde78565141f");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9923a186-e257-444a-a6fd-d51493b95528");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("078a29f3-a9ef-4209-a039-7a3bc0edd2db");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ae98f1f3-b961-4789-9cd7-6ad149426939");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("983d1fba-98a2-4da6-9d86-624ff6e76be5");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1bfdf168-5bdd-49b6-8902-085ae99a81fd");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("eb29dc9f-ab8b-4507-870e-5927bc52d4d5");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2638276d-feac-4ee4-b572-76897e6f3b08");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("3679cbc6-e92d-4341-b93d-67396f0010ea");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("9a239c13-71a4-457c-ba41-3e9836da39a2");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("c7410fac-c9a0-4435-bafe-8b6fcd812cd8");
    _Verify_Edit_button_must_not_be_working_for_Overpayments_and_repayments_in_case_returnFA71515.Click_Submit_CT600();
    

    }

}
