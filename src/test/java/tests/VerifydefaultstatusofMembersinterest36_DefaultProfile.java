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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/51bad4da-d766-4459-b679-e961ae83f500
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 923, profileId = 100816)
public class VerifydefaultstatusofMembersinterest36_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_Members_interest36","Verify_default_status_of_Members_interest36 - Default Profile"})
    @TestModellerPath(guid = "c43f88c5-f7b6-463d-86d1-7d93c466f96a")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofMembersinterest36_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_Members_interest36 _Verify_default_status_of_Members_interest36 = new pages.Verify_default_status_of_Members_interest36(driver);
    TestModellerLogger.SetLastNodeGuid("2e8cb5f2-69d5-451b-8592-ebd518ee03d7");
    _Verify_default_status_of_Members_interest36.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1bc5f544-feb6-454d-816a-21aeef627fba");
    _Verify_default_status_of_Members_interest36.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("eea9445d-763d-4923-8e4f-36035ae0a1e8");
    _Verify_default_status_of_Members_interest36.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("63aa71ab-0504-45e6-9582-75d3459b4ab0");
    _Verify_default_status_of_Members_interest36.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("54f249ec-13ec-4d8d-898a-d980a5c5ce6d");
    _Verify_default_status_of_Members_interest36.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a853f97e-0fd0-4be6-805c-7189a3d8709a");
    _Verify_default_status_of_Members_interest36.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("6ed746b1-958a-49a6-bfa3-6fff91c8af5a");
    _Verify_default_status_of_Members_interest36.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("bede2c90-3f77-4a4d-9452-23bbb0bb5936");
    _Verify_default_status_of_Members_interest36.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d5742dca-bd65-4327-a9bc-3997ad0411ef");
    _Verify_default_status_of_Members_interest36.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("97df1c47-d70a-4452-bad1-9a5d9c5cc52e");
    _Verify_default_status_of_Members_interest36.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c40c132b-ec4d-4ed9-a30e-2b90dcbdaddb");
    _Verify_default_status_of_Members_interest36.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("8cc5ea71-1910-4eea-bf94-743a4a71a0c3");
    _Verify_default_status_of_Members_interest36.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("fc5a356c-fe7f-4016-b979-5f0d98318092");
    _Verify_default_status_of_Members_interest36.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("576cb23d-4184-4e2f-bdc7-02cfe7c5314f");
    _Verify_default_status_of_Members_interest36.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("94a0de32-418a-4789-87f8-598f844d4cc3");
    _Verify_default_status_of_Members_interest36.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("1111ccd0-e8f7-42d9-ad12-1c67ca7216d9");
    _Verify_default_status_of_Members_interest36.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("b5ceec97-9431-4ca8-ae01-ed8776d6010f");
    _Verify_default_status_of_Members_interest36.Click_Statement_of_Financial_Position();
    

    }

}
