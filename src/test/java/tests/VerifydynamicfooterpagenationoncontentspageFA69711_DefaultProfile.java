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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/65c23b99-572e-4966-abfb-50bbca1bc4e6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1350, profileId = 101217)
public class VerifydynamicfooterpagenationoncontentspageFA69711_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_contents_pageFA69711","Verify_dynamic_footer_pagenation_on_contents_pageFA69711 - Default Profile"})
    @TestModellerPath(guid = "f992b174-06f7-4003-9b35-c6e027bd9a37")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicfooterpagenationoncontentspageFA69711_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_dynamic_footer_pagenation_on_contents_pageFA69711 _Verify_dynamic_footer_pagenation_on_contents_pageFA69711 = new pages.Verify_dynamic_footer_pagenation_on_contents_pageFA69711(driver);
    TestModellerLogger.SetLastNodeGuid("ddb2a96c-02dd-451f-b590-0598a5c74d75");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d64ab0b3-6503-4097-9809-95ff0c580f57");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5f18b0be-d4c0-4e07-bf1c-fa05b75c8f6c");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f33ef7b7-a0d6-439e-b756-97fb77616f3c");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ad92a2f1-f8af-44b0-96d8-7dac909a68cd");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0d965d9c-8ae0-4c8e-84c4-ae8069ae18b3");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("46ba02fe-7834-4cb9-8d9f-211802c7883d");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f35aec99-ba4b-4286-8ba7-2e4c30e5e2b1");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c57ad9fc-413f-4115-8956-ebb0eed34c85");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a31e10b0-503b-4d5f-a7dd-27a867fcf43b");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("5e4cb322-899c-4976-bcc4-4b984d3d1995");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("4ae1d6f3-1711-4737-a575-7caec434735b");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("93e8e43b-6d72-431a-ba60-0a2fe4a57e5f");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7df4c65e-9dc0-4df3-8e8d-6a3370b176d7");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("131af75a-1bd7-425f-bfa7-ad8be70f30ec");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("1b397ffd-1bb8-4316-a1c9-b3f4d81ac5bc");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69711.Click_Filleted_Accounts();
    

    }

}
