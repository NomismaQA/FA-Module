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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/97c13a90-d344-453a-8e92-417a60bc46c1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1298, profileId = 101169)
public class VerifyheaderappearanceonIncomestatementpageFA69648_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Income_statement_pageFA69648","Verify_header_appearance_on_Income_statement_pageFA69648 - Default Profile"})
    @TestModellerPath(guid = "8381aa2e-d576-4af1-8f40-db405e28bccb")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonIncomestatementpageFA69648_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_header_appearance_on_Income_statement_pageFA69648 _Verify_header_appearance_on_Income_statement_pageFA69648 = new pages.Verify_header_appearance_on_Income_statement_pageFA69648(driver);
    TestModellerLogger.SetLastNodeGuid("3de7acc2-8b37-46b1-aab8-ef9b13c2b665");
    _Verify_header_appearance_on_Income_statement_pageFA69648.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5387771b-d616-46ba-afc2-331d0754d924");
    _Verify_header_appearance_on_Income_statement_pageFA69648.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8e1f4a9d-0028-4cc8-9596-f0649c47467d");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b1ac81b6-d8d6-40e1-bd9c-195bb3407575");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("87a1f886-0fc9-405d-94d3-48ea4e374698");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("642ff75a-0171-4d15-ac8f-20b18074cb7a");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("94137db3-158d-487e-94c6-fba4906d0578");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("bb94797c-29eb-4c34-a4ec-bdf2be100e99");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("bb94797c-29eb-4c34-a4ec-bdf2be100e99");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("904cb643-d4f3-4b97-a2e7-d244d5426816");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1a1b80d5-3fac-4928-bf99-6a4d5463db7b");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("36ac17ac-b2e3-4def-b676-f2dd00d7b16c");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("06bdce64-eb08-4ee0-b2cb-f0520b9824ed");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a33a35a8-8b31-4e80-bdc5-ecf6b60215eb");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c708f5b4-ec89-450a-a7fc-63b59fd52d6f");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("672f891e-68b2-4324-a1eb-1fb43bda0abb");
    _Verify_header_appearance_on_Income_statement_pageFA69648.Click_Full_Accounts();
    

    }

}
