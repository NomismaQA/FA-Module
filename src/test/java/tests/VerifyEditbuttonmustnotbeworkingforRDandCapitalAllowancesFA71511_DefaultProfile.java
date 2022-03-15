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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5118126e-fa18-430b-a6c9-40cbf42967aa
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1485, profileId = 101382)
public class VerifyEditbuttonmustnotbeworkingforRDandCapitalAllowancesFA71511_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511","Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511 - Default Profile"})
    @TestModellerPath(guid = "60be37c8-63c5-4691-9fde-dc19d45d9501")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkingforRDandCapitalAllowancesFA71511_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511 _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511 = new pages.Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511(driver);
    TestModellerLogger.SetLastNodeGuid("bc996d70-b03c-4766-96a5-ff071eed645f");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f35ab3bd-52b5-4cd4-bb4f-752aeab2a8ce");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("18d7ed66-c07d-443c-add7-615445d91e26");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("bb930ef3-f449-45d4-a883-beb7daa58b3a");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("07b76fcf-07dd-4e92-b181-5005cd0ea944");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9285dcbe-17c3-46ae-b99f-036b5e721118");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("6df0af9a-7c24-4686-9eb4-601716f81708");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("50d863c4-660d-47b5-9416-5709e0ddda96");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1aa7e4dc-769b-4aa6-91c9-d478a449b796");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("31bd7e2e-cc58-4ec9-a2fd-caf56975c5e7");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("d3e45a10-51fa-46a0-8fb8-1636568fc99d");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("892f8861-492d-4c6b-9bbb-3445b3417e22");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0f5ab4fc-b115-47aa-9974-01a5b0cc8292");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("e50a0b1b-65a2-40ae-9204-fbd56b5c1d09");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("20e39cf6-1ad8-4511-9e06-88975b66b565");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("522224e2-7f4b-48ba-894e-7f00d4e22db5");
    _Verify_Edit_button_must_not_be_working_for_RD_and_Capital_AllowancesFA71511.Click_Submit_CT600();
    

    }

}
