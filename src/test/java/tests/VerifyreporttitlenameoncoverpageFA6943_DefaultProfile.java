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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2bc3a3a8-989b-4174-b957-38d60bb536c4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1400, profileId = 101267)
public class VerifyreporttitlenameoncoverpageFA6943_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_report_title_name_on_cover_pageFA6943","Verify_report_title_name_on_cover_pageFA6943 - Default Profile"})
    @TestModellerPath(guid = "6fff06f5-1c76-461f-9025-650024d6bb0d")
    public void GoToUrlAssertUrlPositiveEnterAgentNameClickSearchbutton1ClickNakulClickClientsPositiveEnterSe() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyreporttitlenameoncoverpageFA6943_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_report_title_name_on_cover_pageFA6943 _Verify_report_title_name_on_cover_pageFA6943 = new pages.Verify_report_title_name_on_cover_pageFA6943(driver);
    TestModellerLogger.SetLastNodeGuid("9e05dec8-e12d-4134-a3e5-adbc4fca9af4");
    _Verify_report_title_name_on_cover_pageFA6943.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c237984f-8c68-469d-9e27-c5cdb0972a66");
    _Verify_report_title_name_on_cover_pageFA6943.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("942e7746-ec8b-4d66-bd77-3be2d5b27fc7");
    _Verify_report_title_name_on_cover_pageFA6943.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("9b37d873-1883-4895-bde2-19068efd2819");
    _Verify_report_title_name_on_cover_pageFA6943.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("119e2d18-0cfd-44aa-9221-f3493d11dec4");
    _Verify_report_title_name_on_cover_pageFA6943.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("33d0e9bb-9abb-4f4a-a615-a452a074dfca");
    _Verify_report_title_name_on_cover_pageFA6943.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5f56122d-0f1b-4d37-be74-535cbfba1028");
    _Verify_report_title_name_on_cover_pageFA6943.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("980779ad-1f93-4c32-9ad1-a549dcd5aa14");
    _Verify_report_title_name_on_cover_pageFA6943.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("e5b92774-f0c7-4f6f-b159-4e2fce6b36cb");
    _Verify_report_title_name_on_cover_pageFA6943.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c0397436-6afb-4f93-9f88-fad7c318f501");
    _Verify_report_title_name_on_cover_pageFA6943.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("368193a0-acad-4743-8615-ec98cb92dba3");
    _Verify_report_title_name_on_cover_pageFA6943.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("40a1be27-01ca-456b-b87c-96d32dd2a42d");
    _Verify_report_title_name_on_cover_pageFA6943.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("64a612fe-59da-4599-bca9-8e9b6fb24c4b");
    _Verify_report_title_name_on_cover_pageFA6943.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _Verify_report_title_name_on_cover_pageFA6943.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ab643967-b40b-41b3-ba4a-41f4276cdbea");
    _Verify_report_title_name_on_cover_pageFA6943.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("03a38a66-7943-4b35-b3ca-69c5a5ee4ba6");
    _Verify_report_title_name_on_cover_pageFA6943.Click_Full_Accounts();
    

    }

}
