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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a64be7f9-5281-47e7-b782-c6ad33f3384b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1492, profileId = 101397)
public class VerifyOverpaymentsandrepaymentsiseditableafterunlockingthereturnFA71516_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516","Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516 - Default Profile"})
    @TestModellerPath(guid = "fc7d4e26-ff20-4cc0-8174-0410442d1464")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyOverpaymentsandrepaymentsiseditableafterunlockingthereturnFA71516_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
    	
        pages.Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516 _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516 = new pages.Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516(driver);
    TestModellerLogger.SetLastNodeGuid("2ac59f90-edac-4de0-8abf-78cb0d5354e1");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4052e0f-3e35-4190-96c9-2ed353543d95");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("65fabc9c-c22b-4fc8-a833-167f6d3a8e50");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("52b20677-44cf-4642-894c-9e22b4954d0d");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("2a27e4ac-4a66-4b75-857c-a4a33ab14425");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2f21a6de-04d2-4856-9e93-3bf7514eaac4");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d032f432-3d9a-4bc1-8712-5c33312890cb");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("fd83ba10-52ca-4443-8d9b-4b48e6b53f8c");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b7fe268c-41a9-4653-88ff-3e60702a4bc4");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("7229ab8a-2403-44f0-bc5c-172a47a3cec2");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("7a52c8b8-787f-4ffd-9e5f-f5cb2954431c");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e7034071-cd71-4828-bb47-9d46bbadbbe5");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d19c7a6a-4cca-4439-9642-104cadece24b");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("45b7aed0-7379-4bcc-b180-2b490bc155b1");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("8f133db7-d21e-4f8e-8546-d42285fab5ea");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("57fb4f5e-bdbb-4c28-bd11-01dc0e577300");
    _Verify_Overpayments_and_repayments_is_editable_after_unlocking_the_returnFA71516.Click_Submit_CT600();
    

    }

}
