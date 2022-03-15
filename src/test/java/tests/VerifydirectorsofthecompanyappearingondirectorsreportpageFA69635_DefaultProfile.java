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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d648ba8f-b40b-42bf-a289-ba527d56fcd4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1237, profileId = 101124)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69635_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635 - Default Profile"})
    @TestModellerPath(guid = "5c8e5eb3-5645-4d8d-af31-3b6dd3d470a7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {

    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69635_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635(driver);
    TestModellerLogger.SetLastNodeGuid("deaf7c74-531c-41fb-b317-39615b52af29");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c206077f-3507-4941-b22b-4965d685ee92");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("810c924a-a265-49b6-b56d-52c036f23060");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("06727875-d8bf-408d-a1bc-c0858924913f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("bf8eec16-2a96-474d-9358-ac9ac7b64447");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2f8f9550-e2ce-4c9e-8686-b5d987eb5ac3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8152f622-416e-4652-a4db-9a6d4018735f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ec3be789-a17f-472b-b3e0-f53a28a27d10");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("3ba737e3-25c9-430d-a4c0-7447e6a6fd58");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("6a9f2fe2-92ec-496a-bfad-ff8011d6e160");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0e18de80-ae0c-483b-abfb-070c20f86dce");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c6518049-783e-4142-891b-7284251942a6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0e1fa1c5-b0a6-4db9-9388-193465aaef9a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("ce060b24-a462-4e4c-869d-1a7649aad8fe");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("c06e3dc3-4538-4496-a6b7-2457d23a12d0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("1d955bde-349f-4adf-b5d9-4f669f13e651");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("b8ff4d8a-10cf-4d87-9235-e18d1d445143");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("82bb6303-6f51-4809-b2d6-392915e77eac");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_FirstName("ABC1");
    

    TestModellerLogger.SetLastNodeGuid("f75d6561-bdf7-488d-a71d-db7448a2a47c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_LastName("XYZ1");
    

    TestModellerLogger.SetLastNodeGuid("6003e93b-1446-40b9-a34b-08f02fbba7a5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("bcfa1128-a89f-4163-996d-8f64d5bdf012");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("b5f79099-bdc2-48bc-87d7-f5c215b5647a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_DirectorJoiningDate("01-06-2020");
    

    TestModellerLogger.SetLastNodeGuid("24d01aa6-3d4a-4dad-8416-0a72198c04c0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_DirectorLeavingDate("31-12-2020");
    

    TestModellerLogger.SetLastNodeGuid("d1a7da50-e577-4eaa-b95a-b45c1ba9b1eb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("c59ea66a-c2e9-4d97-80d4-93b4fb5cc5ac");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("874e2b32-8667-415d-bf41-c18b0e125d41");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("5aae8a7b-67eb-4c96-ac19-3ba630dc492c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("e6d52940-4339-4a83-b76d-6ff3630b7ea3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("7ef9eb0f-5daa-4ce9-91c0-21d7fbc19e13");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("5f575f2d-c3fd-433a-8301-2bbdd2e2a215");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("516d6653-5878-48ca-aa4e-cb090245aa0b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("3e4128d6-94b6-4231-9a8b-4d7a13050afe");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("3bffa501-c86e-432f-8f66-1ba62e253a33");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("e0a1771e-5b1a-4b76-9f39-6ad0519c3c57");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("58eddc1b-d4bf-4ee7-9fc8-8051040e0fb9");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("557b4e4a-a8e5-4aa9-9f6a-3645ec9a988f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("cc14af25-8bdf-4a4a-8ed0-bc3bd332049e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("954bd9e1-d4e3-48e2-9281-fde7824e29bc");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("253eee06-1451-48f2-a109-1262489abdc7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69635.Click_Full_Accounts();
    

    }

}
