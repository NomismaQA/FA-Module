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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/13b7a5e9-fd0f-4903-acdb-a4a3e05821ce
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1443, profileId = 101317)
public class VerifyrenamingoflastlineitemasperrequirementonIncomeStatementpageFA69455_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455","Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455 - Default Profile"})
    @TestModellerPath(guid = "6768806e-cec8-4ab5-ab20-f57724e5f9e1")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyrenamingoflastlineitemasperrequirementonIncomeStatementpageFA69455_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455 _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455 = new pages.Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455(driver);
    TestModellerLogger.SetLastNodeGuid("dc4d397e-062a-4f46-a8ae-4206209f856f");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("31171922-c010-4d65-8a67-f8cf1e14a739");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a6bdd717-21bb-4635-829f-4b39bad6465c");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("04d517c7-30e0-48d1-b7d8-69ad6103e7f6");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("60558897-87a6-42da-aa77-03bedbff71ca");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("5643c0b1-d09a-4323-ab7d-e2ab7989dda6");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a8474d6e-5813-444c-b8f4-4027f7a0b203");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c45bbb70-f1e9-4fa0-bc0e-2275a36825a7");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("36405094-923e-49c9-920f-3c189b5c19aa");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d8ffae15-b33a-4610-9607-29c046775f27");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1bce1c7b-2d46-4751-ba7d-3b1c5dada9fe");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e40a4168-443e-4924-929e-d8c34b345c1a");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ad2ca4d4-b5ec-49b4-b623-f77d973d5345");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a359e8a9-55a6-44cf-bf79-99ca54de1352");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ce34901d-9fb3-4ccb-be5f-4fff30f8cc10");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("615489a7-1cfd-4304-ac0a-c7f34faa62ca");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a597f311-aa8e-485b-bcb3-5d3c825eadd8");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("cc0e59d4-73a3-4e55-856a-abe61d206b7f");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("1e0675e6-6952-4781-85e1-08bebac4c938");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("79a44a0f-81b8-4702-b3b4-934bafdd2cc2");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("5269373e-f4c6-48bb-be99-403e5f557350");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("13904b95-7a49-4d41-aec2-8600cc512980");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("8229ecdb-65fb-4920-9368-19013bf6679a");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Select_PageBreakAfterPageNumbersFrs102Short("1 - General Information");
    

    TestModellerLogger.SetLastNodeGuid("524c9df2-2bb3-42c8-8d17-662fa484f4ac");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_ctl00cPHchkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("0742d45b-8391-4a1c-bdbf-048d6c8ec760");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("b70c397f-edf2-47ee-b1f6-fc4aae373dc2");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c7510b78-1539-46b5-92ca-c594272cf660");
    _Verify_renaming_of_last_line_item_as_per_requirement_on_Income_Statement_pageFA69455.Click_Full_Accounts();
    

    }

}
