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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d31bd127-de7f-4c39-9789-be16bea7a3d4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 936, profileId = 100829)
public class VerifydefaultstatusofGeneralInformation56_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_default_status_of_General_Information56","Verify_default_status_of_General_Information56 - Default Profile"})
    @TestModellerPath(guid = "f2547ff0-3a01-423f-bb99-f3cdb0bd4548")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofGeneralInformation56_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_General_Information56 _Verify_default_status_of_General_Information56 = new pages.Verify_default_status_of_General_Information56(driver);
    TestModellerLogger.SetLastNodeGuid("2dc795fd-9f57-4b46-a190-eec6d1672109");
    _Verify_default_status_of_General_Information56.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("62b61bb6-db5a-42fc-b382-31cc05678041");
    _Verify_default_status_of_General_Information56.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fa86dd9f-14b7-43d5-b930-870d25218781");
    _Verify_default_status_of_General_Information56.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2d862488-b247-4ede-9b3f-102c418fa291");
    _Verify_default_status_of_General_Information56.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("77f84414-731c-47e1-97fc-8dd02d5c39db");
    _Verify_default_status_of_General_Information56.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("7d57ecfb-3981-4d30-b617-6a4c7e439787");
    _Verify_default_status_of_General_Information56.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9bd2a04b-e119-480b-be0b-f90db9bce4ed");
    _Verify_default_status_of_General_Information56.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("75008ade-8fa6-40cf-bf4d-8e80422090c6");
    _Verify_default_status_of_General_Information56.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f53fbfd7-4d60-441e-843c-63b5267680dd");
    _Verify_default_status_of_General_Information56.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("495fad7f-3032-4874-b169-2b390243282b");
    _Verify_default_status_of_General_Information56.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("4be006c6-2729-4ec6-b196-b4b9bdc25c0a");
    _Verify_default_status_of_General_Information56.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("ddea6ff9-bc00-4bef-9ee4-66982d17fbde");
    _Verify_default_status_of_General_Information56.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("97a8197c-7525-4770-a4f9-3391ae1bdb7a");
    _Verify_default_status_of_General_Information56.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("f37646f2-d048-4796-83d4-5f1dfba8c52e");
    _Verify_default_status_of_General_Information56.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("2f79132e-b6e6-4df1-83ee-8b6595291c2f");
//    _Verify_default_status_of_General_Information56.Click__Settings_();
    

    
    

    TestModellerLogger.SetLastNodeGuid("8cf765e9-551f-4af7-8a28-0ccb15ed81ba");
    _Verify_default_status_of_General_Information56.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("62a49323-f478-403b-9e22-4160853d3401");
    _Verify_default_status_of_General_Information56.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("724124ca-611e-464f-9c65-54554763819a");
    _Verify_default_status_of_General_Information56.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("7c6b9ffb-d56f-451e-a096-47b7ebde5bf1");
    _Verify_default_status_of_General_Information56.Select_ctl00cPHddStatus("In-active");
    

    TestModellerLogger.SetLastNodeGuid("a7d0e047-39e7-4d80-ba16-19fea6269a45");
    _Verify_default_status_of_General_Information56.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("8cf765e9-551f-4af7-8a28-0ccb15ed81ba");
    _Verify_default_status_of_General_Information56.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("6f1747c1-446e-4aa7-9631-983bbc5d8101");
    _Verify_default_status_of_General_Information56.Click_Full_Accounts();
    

    }

}
