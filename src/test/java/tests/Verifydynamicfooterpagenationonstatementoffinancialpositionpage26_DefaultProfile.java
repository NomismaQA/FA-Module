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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3d435261-cdf5-41b7-bf3a-d5e1ee3c96ad
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1132, profileId = 101023)
public class Verifydynamicfooterpagenationonstatementoffinancialpositionpage26_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26","Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26 - Default Profile"})
    @TestModellerPath(guid = "a7e27b63-5821-40e0-a915-2d21705b4c0d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydynamicfooterpagenationonstatementoffinancialpositionpage26_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26 _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26 = new pages.Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26(driver);
    TestModellerLogger.SetLastNodeGuid("9af8025c-8cc8-4b44-b980-1bd734a1ddc1");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b0435ac2-9880-4ea8-9c6a-8c12d48b7a3f");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("14543742-89eb-404e-b007-138b3b7413f3");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e728cb34-a35d-441f-8699-b3ec798bb70f");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("15fc2051-5628-4a2d-a818-903fcfc11f1f");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("76de8984-aec6-45c5-a290-6b854b3cc94d");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b086e632-8390-4c33-8ed2-4925878aeb8d");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3e54b61d-b7e3-485e-959b-3272d1f0ecf5");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("6707058a-2b80-4ae6-a369-148fc99fc3ad");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("38404ef1-56c5-48ed-b723-fa572a3a6750");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b1b5f8e1-bf12-4e5b-97c6-259a2273e971");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("0287c513-ce25-40f2-9086-bc94ce44ce6b");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("8bfee76d-188b-4030-b498-4ec70a7647c8");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("19377cfc-f66d-4f52-be51-90fcf0b2fd60");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("4b46a3ca-60bd-4eea-acd0-870c6b752686");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Final_Accounts2();
    

TestModellerLogger.SetLastNodeGuid("2282365a-563c-40cf-bc85-116ef1935638");
_Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("bbb79afb-a42f-444b-819b-6375fcfcd396");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page26.Click_Partnership_Information();
    

    }

}
