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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2b2f97dc-f336-4271-985c-6f835fe2c90a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1406, profileId = 101271)
public class VerifypagenumbersallotedtoadesignatedreportisappearingonthatpageFA69410_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410","Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410 - Default Profile"})
    @TestModellerPath(guid = "ec8eea77-d67b-49d2-a3ba-e7fe05e564d6")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifypagenumbersallotedtoadesignatedreportisappearingonthatpageFA69410_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410 _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410 = new pages.Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410(driver);
    TestModellerLogger.SetLastNodeGuid("b0ff2cb7-5766-4867-b64b-503145e10e4b");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ce6c3c3-42c3-4cb8-bff6-2bcde17b0bed");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("261e07f4-c01f-409d-b7d5-2b2fcab1baac");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4c9bceb9-bfb4-4ddc-8407-881190a22c8e");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8e0aa4e3-4a6b-4599-809e-f35db718750d");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c668679d-071e-4860-985d-c842d3c9f695");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("84efa075-572b-4758-97ed-279911f9793f");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f652f456-e710-4576-a73b-c033ab254010");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("8e88464c-102c-4f60-9eb4-c75b3ba687eb");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("af8db9f6-54f4-45b3-b962-2d4b6ff3af37");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("28430da9-7d8e-4dd7-bdc3-9c7682d45f81");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("b2780c62-23e9-4328-ab1f-b96b418e4745");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("b8a70377-0b76-4644-94b4-72ffb90d0ba2");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("8aa01f00-cdfa-4f86-a23e-6f3b6b346cbc");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("9466c3f1-28f9-4093-8385-eacece772b72");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("1642bb59-b084-4474-b8c3-6246bb94881d");
    _Verify_page_numbers_alloted_to_a_designated_report_is_appearing_on_that_pageFA69410.Click_Full_Accounts();
    

    }

}
