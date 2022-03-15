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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7a53686e-25ea-47ff-943e-09604257c5af
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1348, profileId = 101215)
public class VerifyheaderappearanceonContentpageFA6978_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Content_pageFA6978","Verify_header_appearance_on_Content_pageFA6978 - Default Profile"})
    @TestModellerPath(guid = "7af86ad9-0c56-4b41-85da-dc9870707512")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonContentpageFA6978_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_header_appearance_on_Content_pageFA6978 _Verify_header_appearance_on_Content_pageFA6978 = new pages.Verify_header_appearance_on_Content_pageFA6978(driver);
    TestModellerLogger.SetLastNodeGuid("236b868e-6958-4386-94ef-743344bda93b");
    _Verify_header_appearance_on_Content_pageFA6978.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("20e00ac1-a387-4296-ad88-f21785f593f8");
    _Verify_header_appearance_on_Content_pageFA6978.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0d6667d-ad20-49dc-a105-6b86fedaa028");
    _Verify_header_appearance_on_Content_pageFA6978.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("6b20e557-5c11-4255-80a8-fdd9665f2ca1");
    _Verify_header_appearance_on_Content_pageFA6978.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("083e9232-3f91-4921-8d32-bb8762817e2e");
    _Verify_header_appearance_on_Content_pageFA6978.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9a931432-c714-4f0a-9c03-f5deac7a435e");
    _Verify_header_appearance_on_Content_pageFA6978.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("402fb6b5-4710-47b7-90d2-f0f537df397a");
    _Verify_header_appearance_on_Content_pageFA6978.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("88964b1b-58a5-4770-b2f9-d507a4b49b75");
    _Verify_header_appearance_on_Content_pageFA6978.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("639ee3c9-19d6-4c23-b5d3-2e7b3c53998a");
    _Verify_header_appearance_on_Content_pageFA6978.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a11b0da6-94a0-4f88-81a9-6dc2ecfa02da");
    _Verify_header_appearance_on_Content_pageFA6978.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("45c16777-8e0f-47b3-8f2e-61535db143e9");
    _Verify_header_appearance_on_Content_pageFA6978.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("29206c55-14e7-45da-8c4b-37b86b6701de");
    _Verify_header_appearance_on_Content_pageFA6978.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("04d54aaa-e2ca-41cf-a3d5-c665d8382c46");
    _Verify_header_appearance_on_Content_pageFA6978.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("bde40b62-82d8-4288-9c96-b84f559c0cd3");
    _Verify_header_appearance_on_Content_pageFA6978.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("5b41b4f1-62f8-4707-a0f9-0b00c314bab1");
    _Verify_header_appearance_on_Content_pageFA6978.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e92ccb82-b465-4a5c-813a-7039905bed1b");
    _Verify_header_appearance_on_Content_pageFA6978.Click_Filleted_Accounts();
    

    }

}
