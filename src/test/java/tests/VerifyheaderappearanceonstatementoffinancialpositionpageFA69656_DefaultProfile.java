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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/321fb489-0f07-4e34-a519-9a427205c048
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1323, profileId = 101191)
public class VerifyheaderappearanceonstatementoffinancialpositionpageFA69656_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_statement_of_financial_position_pageFA69656","Verify_header_appearance_on_statement_of_financial_position_pageFA69656 - Default Profile"})
    @TestModellerPath(guid = "2e5d25e5-3ef1-46f0-b262-e9071a44af4f")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonstatementoffinancialpositionpageFA69656_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_statement_of_financial_position_pageFA69656 _Verify_header_appearance_on_statement_of_financial_position_pageFA69656 = new pages.Verify_header_appearance_on_statement_of_financial_position_pageFA69656(driver);
    TestModellerLogger.SetLastNodeGuid("98ab146e-c6de-4d15-987c-d80894a3e07f");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d09d186-b2bd-4ad4-9e1f-5317bd99c6e8");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1ed73b45-0aea-4762-8eb1-3fbddcb793c1");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ec925e1c-8788-4eaf-8197-12c490689e08");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("5af1f6a6-b9ee-42c4-9a37-af72ffdd1039");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("50a70d22-c559-4898-a440-4c3f93d95baa");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a556b39d-6f12-45af-a58f-3cef3af63198");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("cce28b5a-703f-4be2-ae9f-8ef105ba09f2");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("bc836663-6e70-4ac1-ba7a-a5cf956cdff1");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("b3574c82-2694-46aa-9386-04a6baccfd28");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("621ab599-8fe7-4ebf-ad23-7101e3403a8e");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("55e97aa3-e591-429f-96bc-e65f22703503");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f031905b-f8c2-4219-b184-cb55c0bd10e7");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("f89d1645-79be-4c9a-9de5-e36038a9cd8b");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("7321d049-4cd4-48c6-b23d-fc615359ea5f");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("adbd5797-a033-4e59-9a3b-542ce76b1fdf");
    _Verify_header_appearance_on_statement_of_financial_position_pageFA69656.Click_Full_Accounts();
    

    }

}
