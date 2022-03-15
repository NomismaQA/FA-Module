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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2aceabb2-0dbc-4686-b466-79ebc3c23cd2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1326, profileId = 101194)
public class VerifydynamicfooterpagenationonstatementoffinancialpositionpageFA69662_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662","Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662 - Default Profile"})
    @TestModellerPath(guid = "6504a260-d0bb-468f-b038-206ed18f45ae")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicfooterpagenationonstatementoffinancialpositionpageFA69662_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662 _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662 = new pages.Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662(driver);
    TestModellerLogger.SetLastNodeGuid("ff24ef91-2ea6-47ed-bbdd-5c5e92b23a62");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("793f814e-0c8c-4117-83aa-e98e0208c363");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("63c8babf-1d63-4cf9-954a-03f7f2e28657");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("34e18592-bc55-4f54-b17f-2da69386ddb0");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("7462c772-66e3-4850-8e0f-3a60a62128d8");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("b87fb78b-3d5c-4e43-a7e2-025bf020dcac");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2a4f4c5b-d3b8-4dee-8cfc-9d9675f914cc");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a58c3c63-53c6-4f4f-ada6-6b7ed3de3d44");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("40bd10a8-771c-411e-ab9b-d0c30dd71032");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c27f8a30-ff7e-43e8-8b48-36f70582a84e");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("986185f5-f031-416a-9d24-8d7e30c8c724");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("bc77b086-664a-434a-aa6a-45bc5d611a11");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("b7b1abe0-8215-4988-b047-b30597dc7102");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("0f01e5e7-8c35-4ec8-82d4-0d5984d59bc2");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("48781944-b286-4f53-8414-d5fdd2463482");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("7c891054-52ef-47c6-98f9-e9cecb4cdb2b");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_pageFA69662.Click_Full_Accounts();
    

    }

}
