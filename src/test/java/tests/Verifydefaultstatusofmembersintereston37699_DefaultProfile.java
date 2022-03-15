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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cd07a6bb-68bc-4347-8e72-75937d8f7000
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1151, profileId = 101041)
public class Verifydefaultstatusofmembersintereston37699_DefaultProfile extends TestBase
{
    
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_default_status_of_members_interest_on37699","Verify_default_status_of_members_interest_on37699 - Default Profile"})
    @TestModellerPath(guid = "8b871885-1355-433e-aa6c-bf9a6dcd1d0c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersintereston37699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_members_interest_on37699 _Verify_default_status_of_members_interest_on37699 = new pages.Verify_default_status_of_members_interest_on37699(driver);
    TestModellerLogger.SetLastNodeGuid("9f789d5d-c41f-4b57-a25c-8d15fa85f945");
    _Verify_default_status_of_members_interest_on37699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("06132c58-1753-4ad9-b05d-6a0e596123f9");
    _Verify_default_status_of_members_interest_on37699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("924d2684-6abc-4282-96b4-2d6e8fce88e1");
    _Verify_default_status_of_members_interest_on37699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f0c6a82d-1fe5-45fb-9408-da679bbb5b67");
    _Verify_default_status_of_members_interest_on37699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("7028c0e1-42ae-43b5-83c8-4c4b1f8179ea");
    _Verify_default_status_of_members_interest_on37699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("81255fc8-edaf-4ecb-a6e0-a1a31ef64f45");
    _Verify_default_status_of_members_interest_on37699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("78f9b0ae-33f3-426a-a1ad-12dc4c33f6b8");
    _Verify_default_status_of_members_interest_on37699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c68dcc6b-0931-4164-92cd-b97413035336");
    _Verify_default_status_of_members_interest_on37699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b4b64666-aec8-4420-af09-94b67b066d69");
    _Verify_default_status_of_members_interest_on37699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("be6e1b3c-9302-4ab3-a19d-128e4472a343");
    _Verify_default_status_of_members_interest_on37699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ececbc4d-cf8f-4bb3-9de3-7e6061485e33");
    _Verify_default_status_of_members_interest_on37699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("bc528aa2-2024-447a-822f-e39229ead099");
    _Verify_default_status_of_members_interest_on37699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1ff1f1c8-cd7f-4e8c-813f-f6632ac5ad05");
    _Verify_default_status_of_members_interest_on37699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("d9a3bbc0-598a-4e07-831e-78f52ec10097");
    _Verify_default_status_of_members_interest_on37699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("76085756-158e-4040-88f6-b819ef2604e6");
    _Verify_default_status_of_members_interest_on37699.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("91d27e1e-1cea-4f79-a60a-96317cf473b6");
    _Verify_default_status_of_members_interest_on37699.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("413988a5-e36d-4861-b399-a9122561213b");
    _Verify_default_status_of_members_interest_on37699.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("afd0229c-76f4-4811-be85-0de921ee11d0");
    _Verify_default_status_of_members_interest_on37699.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("96f7837b-f469-4113-b112-80fed0d406d0");
    _Verify_default_status_of_members_interest_on37699.Click_Save();
    

    TestModellerLogger.SetLastNodeGuid("fa7ad2af-6d76-4ee2-9891-bf4de625dbaf");
    _Verify_default_status_of_members_interest_on37699.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("01f7688f-0b96-477b-bae3-c96a170753ca");
    _Verify_default_status_of_members_interest_on37699.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("80b27abe-cde4-4f19-9ff2-fd0f933d6e99");
    _Verify_default_status_of_members_interest_on37699.Click_Statement_of_Financial_Position();
    

    }

}
