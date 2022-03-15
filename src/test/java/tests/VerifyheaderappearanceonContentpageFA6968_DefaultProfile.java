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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/39c7cb20-0213-4aef-9dec-e1af920b4f79
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1175, profileId = 101064)
public class VerifyheaderappearanceonContentpageFA6968_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_header_appearance_on_Content_pageFA6968","Verify_header_appearance_on_Content_pageFA6968 - Default Profile"})
    @TestModellerPath(guid = "8758c3e8-0036-4c78-bd5d-e6326ed16f7b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {

    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonContentpageFA6968_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_Content_pageFA6968 _Verify_header_appearance_on_Content_pageFA6968 = new pages.Verify_header_appearance_on_Content_pageFA6968(driver);
    TestModellerLogger.SetLastNodeGuid("2387ea3f-0ae8-4f50-8f7c-1c717e8d76b2");
    _Verify_header_appearance_on_Content_pageFA6968.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2708e5d3-52cd-4f93-8558-ff05121f03b7");
    _Verify_header_appearance_on_Content_pageFA6968.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("df99e5c4-e013-4fef-94c6-92b0f84bc4e9");
    _Verify_header_appearance_on_Content_pageFA6968.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d6e9f2be-721a-4c3c-b20e-5be3f0ea72d1");
    _Verify_header_appearance_on_Content_pageFA6968.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8ae5050c-c9a1-4474-9253-955187562a82");
    _Verify_header_appearance_on_Content_pageFA6968.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("73ea770d-d551-437f-b20e-65c3729a7cad");
    _Verify_header_appearance_on_Content_pageFA6968.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("733eed2c-23f7-4a11-ac4d-3fb0aa136bc5");
    _Verify_header_appearance_on_Content_pageFA6968.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3e9b5df2-cdd4-446e-8bcb-aaab0fe27317");
    _Verify_header_appearance_on_Content_pageFA6968.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1e46902f-78e1-4cd5-b780-7074e8c64fb6");
    _Verify_header_appearance_on_Content_pageFA6968.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c277a885-b884-4d02-a536-02acd938ad36");
    _Verify_header_appearance_on_Content_pageFA6968.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a575d8ac-bb18-46d2-b8b4-012db236b763");
    _Verify_header_appearance_on_Content_pageFA6968.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("17d0d834-4683-4475-b37d-d1c58e4dc72c");
    _Verify_header_appearance_on_Content_pageFA6968.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("17920a0d-8603-464a-a6dd-2167f8f1afcb");
    _Verify_header_appearance_on_Content_pageFA6968.Click__Test_Systems_Ltd_();
    

    TestModellerLogger.SetLastNodeGuid("769e1b67-8331-43e0-9f0d-2e7f342f8dc3");
    _Verify_header_appearance_on_Content_pageFA6968.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("62c74d25-83b6-41c8-9247-a78927b4aa67");
    _Verify_header_appearance_on_Content_pageFA6968.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3a0c54ef-3d86-41a1-af50-aac3d337a27d");
    _Verify_header_appearance_on_Content_pageFA6968.Click_Full_Accounts();
    

    }

}
