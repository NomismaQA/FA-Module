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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f6c7a6d0-e35d-4cb3-a5d9-b2ceb3240965
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1325, profileId = 101193)
public class VerifybalancesheetfootnoteappearanceonstatementoffinancialpositionpageFA69661_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661","Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661 - Default Profile"})
    @TestModellerPath(guid = "23bcbfde-d94d-4410-8ace-c1d47423b3fa")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifybalancesheetfootnoteappearanceonstatementoffinancialpositionpageFA69661_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661 _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661 = new pages.Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661(driver);
    TestModellerLogger.SetLastNodeGuid("b7c48363-06d5-487b-9819-481d8e52e36c");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("89fb36a2-d576-4842-b465-6a1d8a898ec3");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fd51c27b-4900-460f-b203-7d900b958501");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("00954ac4-ff18-4f98-960b-9d49436e9437");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("06ce4afc-0f62-4474-aacc-f543d0d9c132");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6f46007f-f22f-4ef1-b50c-a19a597c7270");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d3666df4-2192-482d-9f2c-4013965089d0");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2aaa5b24-2ad0-4136-9baa-b12767605f4e");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d4f43d5b-fd65-43ac-a3a2-535a6370aae7");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("68cbe1b2-056d-4a82-9e43-c1b7968dccdc");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f6ea8721-673e-4c05-a468-ad6f848e9fd3");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("5c5d6d91-2348-4cf1-8bee-88b400374c57");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("bc13a13d-0f0d-49e3-88a0-c118e26936c5");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("2c53ad18-7107-4f5f-a810-7ec96295cbac");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3a891186-35e6-42be-89b7-30c7b26fdf9f");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("27eebc36-5129-4b89-8c5e-b2d3d8b26409");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_pageFA69661.Click_Full_Accounts();
    

    }

}
