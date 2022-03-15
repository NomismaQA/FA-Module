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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ad460d75-998e-4026-aa9b-9b3135ef3b4f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1495, profileId = 101409)
public class VerifyEditbuttonmustnotbeworkinginCTOtherAdjustmentsifperiodislockedFA71519_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519","Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519 - Default Profile"})
    @TestModellerPath(guid = "eca1d155-3c62-4e04-8919-27c970167ec7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkinginCTOtherAdjustmentsifperiodislockedFA71519_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519 _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519 = new pages.Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519(driver);
    TestModellerLogger.SetLastNodeGuid("34073fa6-d3bd-4a04-b333-5983e0625764");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e9cf474e-9dcc-4efd-9917-8df07d7b8d43");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("063be63b-2319-471d-9ab5-b947d2279e07");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("7e513165-bae0-41cd-a31e-71a260c9e1e7");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("d7525536-cd31-4fa4-8b59-7b159f13c40d");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("bcd35ae0-4da1-4026-a031-32c32a4f9f65");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("465d1ce4-ff32-4739-9324-2ee15f0f08da");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ca4fb2a2-809d-4261-bfec-b2cb68f81c33");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0d521de0-8ffe-47f6-978c-35b4f4f2010e");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("24516a11-2c5b-4e53-aa2a-a8edbdf64722");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("690a9478-d953-4476-bca1-cae83fbbbc1a");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e17a4ac2-b2b1-482c-87b2-592236615cdd");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cb681143-1d37-4adc-9599-b7e2cb75ac29");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("5d1e9640-9e84-4b57-b701-c126b073f4f8");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("ef204cbe-5bd1-4b8d-9645-2a351e6141d9");
    _Verify_Edit_button_must_not_be_working_in_CT_Other_Adjustments_if_period_is_lockedFA71519.Click__CT600_Tax_Return_();
    

    }

}
