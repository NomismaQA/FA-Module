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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4f799a69-101f-48ae-b13e-478695591e65
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1483, profileId = 101376)
public class VerifyTaxCalculationiseditableafterunlockingthereturnFA71510_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510","Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510 - Default Profile"})
    @TestModellerPath(guid = "f656b0a6-8f5f-4c0f-87a2-095921a40f10")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyTaxCalculationiseditableafterunlockingthereturnFA71510_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510 _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510 = new pages.Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510(driver);
    TestModellerLogger.SetLastNodeGuid("34c4481a-8f62-4d0a-9217-e361e579f014");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7329b88c-0ddd-47a3-916e-a1a03c4dda05");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c85c1435-4cd0-49d6-9d8a-a6ff1292479c");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ea5961b3-d28e-405c-9762-b49a2c89881f");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("2c9d1a4f-7306-4b4f-a384-2f82da2a7ec6");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("955f3451-116f-4593-bf4e-bf53374cfb11");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4af24ca3-cacb-4db8-8041-b79db81000e9");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2cfac0f2-8e04-48f1-8c24-a40136fc5600");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("15a69810-b15a-4ad7-bf72-000057e402f0");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("57ff158d-b736-41df-ac5f-338bb520679c");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c3f90a76-6963-4768-b864-2bead5b99366");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("0d0245ca-90cb-4f43-bef0-95f471b71a1a");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("b09d9a3b-ab2d-4bf3-a643-fd2a35277e9e");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("38e66fd5-4c63-48e8-941e-3c20672c1c42");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("9621c897-a27e-43b8-bbb8-81705058a381");
    _Verify_Tax_Calculation_is_editable_after_unlocking_the_returnFA71510.Click__CT600_Tax_Return_();
    

   
    }

}
