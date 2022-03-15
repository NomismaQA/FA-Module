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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2e6cf1ca-6049-4d73-9ef5-70d2fe3a7f07
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1327, profileId = 101195)
public class VerifyheaderappearanceondetailedincomestatementpageFA69665_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_header_appearance_on_detailed_income_statement_pageFA69665","Verify_header_appearance_on_detailed_income_statement_pageFA69665 - Default Profile"})
    @TestModellerPath(guid = "9f58db15-fba9-4a1a-a088-9865c4f4b74c")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceondetailedincomestatementpageFA69665_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_detailed_income_statement_pageFA69665 _Verify_header_appearance_on_detailed_income_statement_pageFA69665 = new pages.Verify_header_appearance_on_detailed_income_statement_pageFA69665(driver);
    TestModellerLogger.SetLastNodeGuid("46d7a859-0fec-45fb-a035-fdea8d2cb1d1");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c47a9755-ce66-440b-8595-621824e63c5c");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("99df8864-7720-46ad-9d10-854c8a7711ef");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("13486e0c-267a-437b-ba7f-d36c97938b25");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("afd418fa-560c-40a1-8da0-9667634b547d");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("79cc1865-cc4a-4dd3-96e7-ea359c457dce");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8ee4353d-3364-4ef6-9fd6-afb617ae2aa8");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a57f57e6-9083-45d6-adca-4f57c721d6d2");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("577f67c8-4336-4636-931f-519c80b0d912");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f8db759f-9396-47d9-aab7-ea96db983c84");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("860bc4b3-446e-41a2-a9ea-492a3503f025");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("60cf3c98-dfe7-4407-adc9-06211b2d3d65");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e4425eae-2786-4500-baad-61562b593115");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("dc95bf5d-38a3-47ad-8bf5-8f0ac1c09171");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("e9f83460-0c52-4791-8eb9-61a7eaa41bd6");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("6f284e47-6143-4fe1-a860-057117c817c2");
    _Verify_header_appearance_on_detailed_income_statement_pageFA69665.Click_Full_Accounts();
    

    }

}
