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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fa0e2256-77a4-4c70-9ffa-d1e89f0a950b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1127, profileId = 101022)
public class Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage25_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25","Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25 - Default Profile"})
    @TestModellerPath(guid = "b014f8b0-35fb-4fdf-81dc-835d9a155955")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage25_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25 _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25 = new pages.Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25(driver);
    TestModellerLogger.SetLastNodeGuid("9c159ca0-ba47-4965-ad70-a05f4c444fc1");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ea83c86d-d2ee-4540-9b84-ddeca04e3dac");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("935ad769-2be5-4fbc-85de-521ecbe67271");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c905d0b4-f0b0-446a-8ee3-686aa168cbf9");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("3e8a26f0-7861-4048-9b23-6d8b4515904f");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("e6575c95-2e4c-4f68-9c85-13c361da884f");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("18317cf6-16ee-4e37-9467-3f291c791dd7");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f840068f-9fa8-4f3b-bd62-fb33746e19d8");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("029b3533-484b-4ea1-8376-ad7d45c1c669");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("9ae132aa-4c64-42ab-b7cf-c3862d5a8346");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0b263d4e-d598-4e0e-a220-f0da6cfc1ecb");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("4281802a-00d8-406c-907a-61b4679b9f2a");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("52ab7fcc-6b69-4c72-9119-cc6e80333492");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("aa8c6757-a1c9-4f1a-989d-cc66162504d9");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("058f773a-b87f-4aca-a057-f48a1dd11da5");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("2282365a-563c-40cf-bc85-116ef1935638");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Filleted_Accounts();

    TestModellerLogger.SetLastNodeGuid("151dd781-3b99-4b08-bd49-05b4e878a7c4");
    _Verify_balance_sheet_footnote_appearance_on_statement_of_financial_position_page25.Click_Partnership_Information();
    

    }

}
