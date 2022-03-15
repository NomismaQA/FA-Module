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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/10b5f181-391f-44ed-b5b7-d3245770ed21
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1004, profileId = 100903)
public class VerifydefaultstatusofMembersinterest64_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_default_status_of_Members_interest64","Verify_default_status_of_Members_interest64 - Default Profile"})
    @TestModellerPath(guid = "16fe6c25-1f72-4b06-9732-4fc5882a9999")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofMembersinterest64_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_default_status_of_Members_interest64 _Verify_default_status_of_Members_interest64 = new pages.Verify_default_status_of_Members_interest64(driver);
    TestModellerLogger.SetLastNodeGuid("a21506b7-5306-43b2-98cc-5904caefde7c");
    _Verify_default_status_of_Members_interest64.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("50579ef5-adfa-4b49-be2c-b1e651cdee58");
    _Verify_default_status_of_Members_interest64.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("570c600e-169e-4ed9-8eb5-35d739ecec73");
    _Verify_default_status_of_Members_interest64.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("bf6bc8cd-7692-4dba-a596-5744285ac30c");
    _Verify_default_status_of_Members_interest64.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("78469fa2-aec8-4183-9f8f-cfc51e532359");
    _Verify_default_status_of_Members_interest64.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a65940c7-1735-442a-8807-bc6b5e48295b");
    _Verify_default_status_of_Members_interest64.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ca1a8ada-e1f1-4462-8f24-1249477a26fd");
    _Verify_default_status_of_Members_interest64.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c38fdcda-536b-4850-a0fe-08805d9750ac");
    _Verify_default_status_of_Members_interest64.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("20028bd5-9f36-4aa6-b0b9-be63f72c8823");
    _Verify_default_status_of_Members_interest64.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("deb6d129-8c05-4e32-893b-d782352c209a");
    _Verify_default_status_of_Members_interest64.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("dfa02b8a-f98d-46bf-8228-45e54d3750f6");
    _Verify_default_status_of_Members_interest64.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("67daec9a-e30b-4d88-9be9-83722e68bfcb");
    _Verify_default_status_of_Members_interest64.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1327475b-4895-4f22-84b1-059023faa8b4");
    _Verify_default_status_of_Members_interest64.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("d9fb66d2-05fe-4257-a8a1-6c53b06fd9fc");
    _Verify_default_status_of_Members_interest64.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("b180b506-7266-488b-a287-52dd6da7e84a");
//    _Verify_default_status_of_Members_interest64.Click_Settings1();
    

    
    

    TestModellerLogger.SetLastNodeGuid("5fce05ff-2856-4161-9327-ddadef9c50ec");
    _Verify_default_status_of_Members_interest64.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("f59f6ba4-8369-4f9d-9157-6169883b9cb2");
    _Verify_default_status_of_Members_interest64.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("53b88bf6-bafa-4779-9ce5-e605dd95bea0");
    _Verify_default_status_of_Members_interest64.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("69b156d2-b565-4ebb-af3e-72188d1166ed");
    _Verify_default_status_of_Members_interest64.Select_ctl00cPHddStatus("In-active");
    

    TestModellerLogger.SetLastNodeGuid("ac4f4e1c-d5be-4fef-a701-75d28b812490");
    _Verify_default_status_of_Members_interest64.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("5fce05ff-2856-4161-9327-ddadef9c50ec");
    _Verify_default_status_of_Members_interest64.Click_Final_Accounts2();

    TestModellerLogger.SetLastNodeGuid("710172ab-939d-4181-8267-3b6c44b86bb9");
    _Verify_default_status_of_Members_interest64.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("967314d4-9d1f-4cb4-bdfe-5acf638adcea");
    _Verify_default_status_of_Members_interest64.Click_Statement_of_Financial_Position();
    

    }

}
