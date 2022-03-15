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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/30f37b39-6e31-40df-adbb-6166346279d9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 992, profileId = 100886)
public class VerifydefaultstatusofMembersinterest63_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_Members_interest63","Verify_default_status_of_Members_interest63 - Default Profile"})
    @TestModellerPath(guid = "9b9c60a3-87d5-4177-bca5-2eebc16cbd35")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofMembersinterest63_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_default_status_of_Members_interest63 _Verify_default_status_of_Members_interest63 = new pages.Verify_default_status_of_Members_interest63(driver);
    TestModellerLogger.SetLastNodeGuid("28f0e77f-fdfb-46dc-afa7-a8ed50387ceb");
    _Verify_default_status_of_Members_interest63.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("aed4da13-243c-4781-9ba1-e3b435c42098");
    _Verify_default_status_of_Members_interest63.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f93c2c2e-8e88-435b-a0fc-445207406177");
    _Verify_default_status_of_Members_interest63.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("9c649aca-5f2c-4204-8ff8-b81b716929f0");
    _Verify_default_status_of_Members_interest63.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("cf670bb0-3cf9-45d9-a462-f21571eda1c9");
    _Verify_default_status_of_Members_interest63.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("7013d4e8-a5c7-442a-9f75-f03a9d4212e7");
    _Verify_default_status_of_Members_interest63.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8d8fc0a5-4632-40b8-811b-928d3073ee6e");
    _Verify_default_status_of_Members_interest63.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8ced46a8-c408-4f12-95e8-79d14776722d");
    _Verify_default_status_of_Members_interest63.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ef5bcc99-6d79-4a7c-9001-3d82af86d979");
    _Verify_default_status_of_Members_interest63.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d782ce16-a4e8-46a6-be21-f836d434acdf");
    _Verify_default_status_of_Members_interest63.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("5dc1c718-12cc-4bc4-a12a-cd8ad933ec8d");
    _Verify_default_status_of_Members_interest63.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("714a4b6b-cff9-4439-85d4-ae4ade106b53");
    _Verify_default_status_of_Members_interest63.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0e6726d9-0adb-41e0-b222-bd65bcdddea1");
    _Verify_default_status_of_Members_interest63.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("f8a3a55c-3aa1-4499-8e9f-bd7eed9405f2");
    _Verify_default_status_of_Members_interest63.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("2eea5039-0e71-4369-a250-7fb175d92318");
    _Verify_default_status_of_Members_interest63.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("191ed414-8e34-43a1-a4ae-6ba3e52b9e1b");
    _Verify_default_status_of_Members_interest63.Click_Full_Accounts();
    

    }

}
