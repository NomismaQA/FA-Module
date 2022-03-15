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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/75a00c8a-e8d6-46cf-a551-dae1624536e2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1422, profileId = 101291)
public class VerifyheaderappearanceondirectorsreportpageFA69428_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_directors_report_pageFA69428","Verify_header_appearance_on_directors_report_pageFA69428 - Default Profile"})
    @TestModellerPath(guid = "e30b65d4-fc63-41e6-ac6c-90987fdcec1c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceondirectorsreportpageFA69428_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_header_appearance_on_directors_report_pageFA69428 _Verify_header_appearance_on_directors_report_pageFA69428 = new pages.Verify_header_appearance_on_directors_report_pageFA69428(driver);
    TestModellerLogger.SetLastNodeGuid("0178e204-9ab7-47e0-be28-4275f7b317cf");
    _Verify_header_appearance_on_directors_report_pageFA69428.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e2e834e2-d747-4020-8884-9953d9446031");
    _Verify_header_appearance_on_directors_report_pageFA69428.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("05f41fe0-3af1-44fe-af0f-21e733bc499a");
    _Verify_header_appearance_on_directors_report_pageFA69428.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("243db326-b36c-421f-b235-c54916c90898");
    _Verify_header_appearance_on_directors_report_pageFA69428.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("02e7df40-3032-4e9e-8841-9c096e4cd70f");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("e73acb24-6a29-480e-b889-e7b72540d29e");
    _Verify_header_appearance_on_directors_report_pageFA69428.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("da71ad21-4b2a-4733-a839-41b23583e878");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a3580f74-6524-43d6-b49a-9e6f5c336f44");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("602a691c-bb53-461b-ba1e-e1d3b4e0095b");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d824547d-2408-4960-9b6b-8a1cba7ad9a4");
    _Verify_header_appearance_on_directors_report_pageFA69428.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("19d6199b-89e9-4a87-a339-b3c0e5187cc0");
    _Verify_header_appearance_on_directors_report_pageFA69428.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("cc924386-c5e4-4555-a48d-483341eaffcc");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a3673527-fafa-4eeb-a47f-5a1b9e0dbf59");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("0e733c08-56ac-48ba-8723-490d8a541a5a");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("f7c80ab9-13f5-4335-885a-8fb6971b4090");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5d93a64f-bcae-4e35-b92a-7d3e951a02dd");
    _Verify_header_appearance_on_directors_report_pageFA69428.Click_Full_Accounts();
    

    }

}
