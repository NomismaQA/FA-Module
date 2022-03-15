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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/eb9ad0da-b51f-4123-a48b-2d41781ba579
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1351, profileId = 101218)
public class VerifyheaderappearanceonCompanyInformationpageFA69712_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Company_Information_pageFA69712","Verify_header_appearance_on_Company_Information_pageFA69712 - Default Profile"})
    @TestModellerPath(guid = "bd3ab830-e90c-4f8a-9668-78bf30454a01")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonCompanyInformationpageFA69712_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_header_appearance_on_Company_Information_pageFA69712 _Verify_header_appearance_on_Company_Information_pageFA69712 = new pages.Verify_header_appearance_on_Company_Information_pageFA69712(driver);
    TestModellerLogger.SetLastNodeGuid("fc31fc11-f248-45d2-aecf-51dfe8186e0c");
    _Verify_header_appearance_on_Company_Information_pageFA69712.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94528575-fa34-48ab-be4e-b874e759d055");
    _Verify_header_appearance_on_Company_Information_pageFA69712.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3179e902-ef53-478b-8039-71bd1e682b91");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e28b8696-00b5-4671-97cf-ac398662f8fe");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("741b4660-093f-45ad-80c1-8cc480f1a215");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a2823570-c8c7-4bb4-acb6-d5dd865fbdc5");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("794b6fef-df83-45b6-bba0-aaa87955b5c8");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f0cffc6b-e375-4613-a6f3-087ee424eb8f");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("5f53d214-e2a9-4d88-b4c4-7ef4203d74c8");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f328d3d5-5de8-413c-a710-cdcbe3ae344a");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("feffa3e0-6d97-4ff9-a128-f48fb13ee437");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d3ffea3e-7674-46f3-b647-0749ceccb754");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("4dacbbbd-abfd-4732-b939-99733f3abccb");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("59e48aa7-01a2-4018-ac90-25e6c659890c");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c9ce2708-2d0e-4b54-a4f4-4c97a65af4d3");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b441d11d-d8df-439f-8d0c-8b238b3bffeb");
    _Verify_header_appearance_on_Company_Information_pageFA69712.Click_Filleted_Accounts();
    

    }

}
