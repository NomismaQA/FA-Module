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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6ed6ef66-9f8e-4a75-a096-038477f8bba2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1355, profileId = 101221)
public class VerifydynamicpagenumberingoncontentspageFA69710_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_dynamic_page_numbering_on_contents_pageFA69710","Verify_dynamic_page_numbering_on_contents_pageFA69710 - Default Profile"})
    @TestModellerPath(guid = "eaaeb1d2-1541-4e3b-9c38-370a2cc21312")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicpagenumberingoncontentspageFA69710_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_dynamic_page_numbering_on_contents_pageFA69710 _Verify_dynamic_page_numbering_on_contents_pageFA69710 = new pages.Verify_dynamic_page_numbering_on_contents_pageFA69710(driver);
    TestModellerLogger.SetLastNodeGuid("98e4a506-28c4-4817-a726-ef6a36c2a052");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9dc378b8-4c2f-4a3d-b0d0-ce28577b6332");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("621716ea-a2cc-48ad-b7c9-85caa0314e33");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("28e7926f-89c3-4403-a967-be8f2363a0c8");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("31b9f950-6ade-4513-8f43-270a64d3ee8e");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("25018f99-bb21-4b5d-8709-772c12d2c285");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9308ce93-1e53-49a6-b845-8a9be0043ec5");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("e805f650-81d7-434f-bccb-8c828004330b");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("fbea7b20-0aa3-4324-a7be-c63bfc2df1cb");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("250f55ac-8b8f-4a94-9b17-55df47f1bb37");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("050ae1c6-35be-4904-8deb-03e28ec2cae4");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("6f18d964-6cfb-4486-9353-90707278e5a8");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Search_button2();
    
    
    TestModellerLogger.SetLastNodeGuid("04d54aaa-e2ca-41cf-a3d5-c665d8382c46");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("e9043952-8ccf-486a-b6c2-a88f2a90188d");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3e63e65c-5a37-41d0-bdc6-8c225db5b346");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("2637a203-e081-4258-8f96-7c5008cbd42c");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("8442d666-1f1c-48d0-8eb8-9fb1b22caa3f");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("0750fbb3-898e-451f-83a1-ca994693506f");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("52f09449-51bb-42c8-a17b-3961b276ac7e");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("584b0ca4-3c6f-49ea-b3a9-a03b2fab12a0");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("a21f26b9-7b84-4b39-9f2a-80822a658f46");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("d53cfcb8-db09-4812-b9e1-081057b4de24");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("67c96455-a752-476f-863f-bb86f5a0faa4");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ee123b08-b082-4aa0-8764-c4667cfa7856");
    _Verify_dynamic_page_numbering_on_contents_pageFA69710.Click_Filleted_Accounts();
    

    }

}
