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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2c3e9e13-b4b3-4ca9-815e-81c5b14d04f4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1471, profileId = 101343)
public class VerifylockandunlockbuttonstatusofSubmitscreenFA7151_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_lock_and_unlock_button_status_of_Submit_screenFA7151","Verify_lock_and_unlock_button_status_of_Submit_screenFA7151 - Default Profile"})
    @TestModellerPath(guid = "fce209d2-901c-4a81-a01f-acaee7a553d6")
    public void PositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNameClickSearchbutt() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifylockandunlockbuttonstatusofSubmitscreenFA7151_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		 
	pages.Verify_lock_and_unlock_button_status_of_Submit_screenFA7151 _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151 = new pages.Verify_lock_and_unlock_button_status_of_Submit_screenFA7151(driver);
	TestModellerLogger.SetLastNodeGuid("4e0c17f8-fe1a-41b9-87f2-1039b559838e");
	_Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.GoToUrl();
		    

	TestModellerLogger.SetLastNodeGuid("736a0959-4689-43db-ba6a-b08b390c27dd");
	_Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.AssertUrl();
		    

	TestModellerLogger.SetLastNodeGuid("5267f684-0512-4cfb-855f-3d51caa49b5e");
	_Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Enter_Username(sData[1]);
	
    

    TestModellerLogger.SetLastNodeGuid("a68116d7-4a83-4e4b-9b1e-059a7abf607e");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("5ed5f116-d828-476a-9092-942b61d955aa");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2808d40d-e256-491b-b5d1-7db2a6f5bfcf");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7f18a2fd-6b65-41b8-899f-f51b5afb278c");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("d1259c0c-b798-48d5-963c-123fd80fef02");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a6dc566d-c9d2-4282-a5d5-bc2c46c48f05");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("36b8e2c7-15bd-4056-974d-80e06c44af89");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ffd30831-75ad-4d2f-aebb-1bf047d91899");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("a81e56da-2fb8-4a63-ada8-d699b665cfa9");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7694a1ab-e36b-49e8-a626-5172cf265c6b");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("22ee8c87-e965-47dd-9f15-1a4cc9bab0c9");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("b80f3c67-8a25-4cff-954f-219870c8a4d1");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("dc15108f-dd12-4c6b-b82d-0b2b659d0d7d");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click_Submit_CT600();
    

    TestModellerLogger.SetLastNodeGuid("82988987-cde1-414e-84bf-f46e701fee8f");
    _Verify_lock_and_unlock_button_status_of_Submit_screenFA7151.Click_Lock();
    

    }

}
