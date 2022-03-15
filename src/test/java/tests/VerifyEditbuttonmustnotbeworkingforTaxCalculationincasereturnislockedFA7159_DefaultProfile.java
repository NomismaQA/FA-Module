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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a8b10967-cc63-44af-b066-f70602d20615
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1481, profileId = 101370)
public class VerifyEditbuttonmustnotbeworkingforTaxCalculationincasereturnislockedFA7159_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159","Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159 - Default Profile"})
    @TestModellerPath(guid = "f60bf977-4bca-46a7-ac69-38830c21b8e5")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkingforTaxCalculationincasereturnislockedFA7159_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159 _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159 = new pages.Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159(driver);
    TestModellerLogger.SetLastNodeGuid("338482f6-aa6b-41ac-a23f-e5ab51b49b99");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("86948655-2ae5-4bd1-9363-09057515930f");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("32c05a15-0b33-44c9-b658-8eb724b9b3a3");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0234157e-1d8f-4075-b9b3-030967b2e8f8");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("e743e352-2c3a-4e34-a3bd-176e89b8d802");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0add60a5-269e-416b-bba2-3d9386902b15");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("fc2645e2-8a22-45b6-8ae9-a6e03435a8e1");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3f83d53f-4acd-4ac9-bf41-d5025be13065");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("39ab90b2-2a23-4224-b4fa-450468df36be");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("047bc0c8-928d-41bb-a3cb-a4330ddc6dc0");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("5bbb89ed-36a7-4861-b2f6-145ca0d7d481");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("8c9af9d4-0f36-4378-9801-6e03dd842187");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f4a49e9c-4eab-451a-a94a-cb4381015869");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("26203351-fb57-4147-be4f-684ee1173978");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("afb86013-584a-47b4-b6e5-5ae8aec8d112");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("03f2c17a-541d-4d40-98b7-88f33edafa45");
    _Verify_Edit_button_must_not_be_working_for_Tax_Calculation_in_case_return_is_lockedFA7159.Click_Submit_CT600();
    

   

  

    }

}
