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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c468af33-0d32-4949-b4c6-83da9440e95d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 925, profileId = 100818)
public class VerifyheaderappearanceonDetailedIncomeStatementpage41_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Detailed_Income_Statement_page41","Verify_header_appearance_on_Detailed_Income_Statement_page41 - Default Profile"})
    @TestModellerPath(guid = "704ed9e5-8d00-4b4e-8256-0368635fe674")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonDetailedIncomeStatementpage41_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_Detailed_Income_Statement_page41 _Verify_header_appearance_on_Detailed_Income_Statement_page41 = new pages.Verify_header_appearance_on_Detailed_Income_Statement_page41(driver);
    TestModellerLogger.SetLastNodeGuid("9d94e130-d088-4b1a-821b-c79268ad803f");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8669e8e6-b497-40ed-a24d-ff4c899b245a");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("725f10e3-4444-437f-886e-f023cd01c2bc");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0baa04a6-234c-4326-97a8-b6a6d147a47c");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("aa5fa568-9a26-43be-9eb8-f54c127639fd");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c2b9f7a2-4211-4389-ae6f-37c21047e3f9");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ab51d4db-d260-4bf3-a2f7-e7bcfae9deea");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a150a6e7-0a3b-4116-bb8e-61ac06c20a20");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1d86fb97-81e1-40fd-a115-1f8e57a52d96");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("b8b7a46f-737b-4c89-88c0-6c1ff6ab11fd");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("508d0e31-1eee-4feb-be7a-10c665609a29");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("f6dcddba-91ef-4c8d-8aca-aac7453e426c");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("aa793f65-09f5-40b9-9804-03f2d681dafa");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("c6e0c0bc-1f53-439b-aa02-387bd3a7b5cd");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8dca90c7-88a1-4ea0-9108-43585311d17a");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e5741bd7-7686-47ac-a1dc-7ed660e6f72e");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("048d10ab-53a8-49af-940f-409a2363ca56");
    _Verify_header_appearance_on_Detailed_Income_Statement_page41.Click_Detailed_Income_Statement();
    

    }

}
