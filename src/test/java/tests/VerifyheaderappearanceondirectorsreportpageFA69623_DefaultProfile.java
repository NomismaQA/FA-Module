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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/dc8d0b39-7ff3-435a-92c0-ce398762ba8e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1216, profileId = 101101)
public class VerifyheaderappearanceondirectorsreportpageFA69623_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    @Test  (groups= {"Verify_header_appearance_on_directors_report_pageFA69623","Verify_header_appearance_on_directors_report_pageFA69623 - Default Profile"})
    @TestModellerPath(guid = "cf388b4f-c651-4fbe-9105-60761659e2ef")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceondirectorsreportpageFA69623_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_directors_report_pageFA69623 _Verify_header_appearance_on_directors_report_pageFA69623 = new pages.Verify_header_appearance_on_directors_report_pageFA69623(driver);
    TestModellerLogger.SetLastNodeGuid("1d796272-9596-4f0d-9d1b-6d1652eb434a");
    _Verify_header_appearance_on_directors_report_pageFA69623.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3983dfd8-4f2c-4689-a997-08891519495e");
    _Verify_header_appearance_on_directors_report_pageFA69623.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("58d3200d-c64e-4ff8-99d9-2e8f1604521e");
    _Verify_header_appearance_on_directors_report_pageFA69623.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("1a953de4-ce5f-48c6-9e0e-afcb69207543");
    _Verify_header_appearance_on_directors_report_pageFA69623.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("84f7ee79-80bc-4308-98fa-8bffbd690a86");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("be0acbea-0783-43ed-b184-7d5d71e0805f");
    _Verify_header_appearance_on_directors_report_pageFA69623.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("26130dac-0331-4f75-9e5d-b9704a5bf398");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c9db00d7-66e0-4d5e-baf7-f9e490e1f806");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("41daed54-2256-4817-84bd-3811b78f5f61");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("fe8dec98-3c2a-4c10-b26f-bf4ea9e18dd5");
    _Verify_header_appearance_on_directors_report_pageFA69623.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("850a94f3-4502-4ea4-9c60-b981b064dc9d");
    _Verify_header_appearance_on_directors_report_pageFA69623.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("3ce361fc-a3dc-41d7-814b-f258b79366f7");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2aa929d9-fd3a-4871-96eb-e767c1b6234e");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("072bddcd-867e-47ed-84e3-946ca32a5a44");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("02c68ed2-66e3-41bc-a783-52e93878f0d9");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f82fcb8f-e04f-4cea-9414-c1c9e4ceee36");
    _Verify_header_appearance_on_directors_report_pageFA69623.Click_Full_Accounts();
    

    }

}
