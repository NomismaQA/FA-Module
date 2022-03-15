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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/50fd0de6-ee75-4ab0-9cc7-d05abce64c98
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1486, profileId = 101385)
public class VerifyRDandCapitalAllowanceiseditableafterunlockingthereturnFA71512_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512","Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512 - Default Profile"})
    @TestModellerPath(guid = "cb185250-2f2d-4bb7-b672-a3c3c9333f5a")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyRDandCapitalAllowanceiseditableafterunlockingthereturnFA71512_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512 _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512 = new pages.Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512(driver);
    TestModellerLogger.SetLastNodeGuid("609ba8bd-54e0-4394-83bd-ac227a60cb9b");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2993fb01-c9f6-4908-95cd-784432742a04");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9ab5ce6e-066e-457c-9fb1-20a9d23e579c");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c06b86c7-21ac-4b1c-9141-5f38c4a9a487");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("c688ef9d-f284-411b-b2a3-67d35f6e2913");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4fe2d9fb-4b15-40d6-844f-fdbf89c0298e");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2ff87908-ff4b-469b-a4a5-7ab431786f71");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("40454d5f-4a2a-4d80-af15-cef419441682");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f68b0e0f-2380-40c1-9671-484166b7ec95");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("b421dea8-351f-4698-abbf-31a3b52874cc");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("20738758-561f-47ed-a5d7-7dc4082a9834");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("691be652-73b5-4beb-a368-01534e64316f");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("5582cc59-ca4c-444d-b02e-0199d32eee20");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("79d9d3e9-16bd-4fa4-87f5-8c7ce4c3ead3");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("b039d66b-bd1d-4ffd-91c5-9db71d915d49");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("7f577238-a42d-4403-a118-9413d0362fb7");
    _Verify_RD_and_Capital_Allowance_is_editable_after_unlocking_the_returnFA71512.Click_Submit_CT600();
    

    }

}
