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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8cfbc848-bd4b-4a05-b19e-643aaba7aeb8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1404, profileId = 101270)
public class VerifydynamicpagenumberingoncontentspageFA6949_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_dynamic_page_numbering_on_contents_pageFA6949","Verify_dynamic_page_numbering_on_contents_pageFA6949 - Default Profile"})
    @TestModellerPath(guid = "520d86fb-0e7e-400c-90a0-3ba20ec0dde2")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicpagenumberingoncontentspageFA6949_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_dynamic_page_numbering_on_contents_pageFA6949 _Verify_dynamic_page_numbering_on_contents_pageFA6949 = new pages.Verify_dynamic_page_numbering_on_contents_pageFA6949(driver);
    TestModellerLogger.SetLastNodeGuid("a32cd5e3-f55b-4744-a0ff-59d0ed929b08");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4b81324e-0d65-40f6-bfa2-6bb2c730f64c");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ca64b8c8-c2fc-40a7-98f6-0551de941cf2");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("64984772-fc90-42b3-be48-30faeb9308c9");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("28de461d-53e7-4cad-8824-bd34f0dd262d");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("7ebcbcc5-32fc-4c6c-bf2e-c00f24441a2c");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("fb1665a3-bed8-4b70-9238-f14187f0168f");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("4a32895b-2856-45f4-868a-5a05701aacb0");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("fdbc7231-ec44-4811-b98e-6348456c9a33");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("62018913-6c15-4133-84bf-20519f358f37");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed846279-1492-4d7a-84bd-a8b839daa2b4");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("702375e2-2890-4152-8f9f-754c9136bbc4");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e66b5f3c-8e70-4194-87d1-2c19767d0657");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("6b29a650-2a3c-42ce-b8b3-8c8046a600d4");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("957315e0-1d97-43f0-b04c-0f3320705ca8");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("87f8e9e7-784e-4356-97c2-9dba5022607d");
    _Verify_dynamic_page_numbering_on_contents_pageFA6949.Click_Full_Accounts();
    

    }

}
