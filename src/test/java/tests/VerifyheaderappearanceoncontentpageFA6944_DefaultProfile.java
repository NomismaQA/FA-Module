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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ac01474a-2901-4617-89ad-c01507efcefc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1401, profileId = 101268)
public class VerifyheaderappearanceoncontentpageFA6944_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_content_pageFA6944","Verify_header_appearance_on_content_pageFA6944 - Default Profile"})
    @TestModellerPath(guid = "4ce3afb6-8382-42d9-8af6-8889d73fd657")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceoncontentpageFA6944_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_content_pageFA6944 _Verify_header_appearance_on_content_pageFA6944 = new pages.Verify_header_appearance_on_content_pageFA6944(driver);
    TestModellerLogger.SetLastNodeGuid("fe59fb2d-a41a-4ff3-b2f6-3948930c9f9d");
    _Verify_header_appearance_on_content_pageFA6944.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9bb2a849-d861-4c38-b271-b6e2db9624c4");
    _Verify_header_appearance_on_content_pageFA6944.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("396ff5a6-03c8-452b-bc5d-d267d5f96624");
    _Verify_header_appearance_on_content_pageFA6944.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("621123c1-95d0-4e9a-8eaa-edd19d58c348");
    _Verify_header_appearance_on_content_pageFA6944.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("f18b9588-18d1-4e1a-8e5b-c531f68cf197");
    _Verify_header_appearance_on_content_pageFA6944.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("019ef951-9cb8-4d56-b4de-6c4ac6589bb6");
    _Verify_header_appearance_on_content_pageFA6944.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("38264653-8bd9-4860-ac67-5871ccf2d6f9");
    _Verify_header_appearance_on_content_pageFA6944.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("acc3c5b1-5b71-4879-80ee-bd0c9808aa5c");
    _Verify_header_appearance_on_content_pageFA6944.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a2c000b2-72a0-43c5-96f6-389c9369b589");
    _Verify_header_appearance_on_content_pageFA6944.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a4aacc05-d7df-4b4e-b4ac-e64d73d16b69");
    _Verify_header_appearance_on_content_pageFA6944.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6cee6370-b182-4acc-af04-5b370ff42b25");
    _Verify_header_appearance_on_content_pageFA6944.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("4455c122-6bd8-48b1-b4b7-55858ba4161e");
    _Verify_header_appearance_on_content_pageFA6944.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("939c29eb-f79a-4c09-a3a1-6f060f8c2a35");
    _Verify_header_appearance_on_content_pageFA6944.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("d2b41894-22e5-43a6-bd29-b7080700b158");
    _Verify_header_appearance_on_content_pageFA6944.Click__Final_Accounts__1();
    

    TestModellerLogger.SetLastNodeGuid("4edb2e7a-1850-48b6-9821-b9ea510ed9a9");
    _Verify_header_appearance_on_content_pageFA6944.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("81e414d7-809f-4eb6-a773-8d68bb104982");
    _Verify_header_appearance_on_content_pageFA6944.Click_Full_Accounts();
    

    }

}
