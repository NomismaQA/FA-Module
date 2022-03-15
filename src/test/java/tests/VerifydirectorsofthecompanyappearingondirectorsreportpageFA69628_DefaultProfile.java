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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2396345e-6b61-4e08-8a67-e8a996c3e4b5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1220, profileId = 101104)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69628_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628 - Default Profile"})
    @TestModellerPath(guid = "f76a9b3c-0e48-4005-b632-8b2a86af194f")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69628_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628(driver);
    TestModellerLogger.SetLastNodeGuid("483fd968-b0a4-4571-896e-00d3d5133b0c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb6c12c4-0052-4cff-b240-c28606be3835");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("89a0ee87-07a6-487d-b980-3d863931ee76");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ffbed653-c57a-40eb-bc98-96c5ce58cba1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8fa3b5b6-b27a-480b-8ca3-811f61c53fb6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("3e5cd80c-aaed-45f5-834e-587a4cb5d396");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f1ffecf-cfbd-403a-bf84-8239ff6e86db");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("42dde68e-60e1-4de7-a6a2-da15924ba219");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f8c7056b-5c70-4af5-8802-18e3655f2f67");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("7a2d1472-d2a8-4aa4-b355-779e5552e496");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a29d4751-5383-4d08-8e68-d39884e47c2f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d78ca1af-7aa8-420c-8c12-75626c4941be");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("bc395d80-dffb-4a75-8d97-0b6e24423542");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a53c0f2b-c226-4912-8851-fadd019d3ffa");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("a04be7c0-2dab-4c34-b689-f1b7667e5106");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("d2e943c2-78f6-4b2b-8c70-0a048f93a3ee");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("94eb5fe2-ebe9-4d99-95e1-4cf1c160b14e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("9d497dfa-8cab-444a-8f2a-587f59d115da");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_FirstName("ABC2");
    

    TestModellerLogger.SetLastNodeGuid("601fa83d-3e1e-40c5-a2e5-1087f515f79e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_LastName("XYZ2");
    

    TestModellerLogger.SetLastNodeGuid("bfbb7088-3791-4199-aeb9-a34de71f17dd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_NI_Number("123467890");
    

    TestModellerLogger.SetLastNodeGuid("7aacdac9-ec8b-42dd-b2fb-8bd9fcc5aced");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("c6e3cc8b-1866-46b5-880c-e8d4c768b2a3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_DirectorJoiningDate("01/07/2020");
    

    TestModellerLogger.SetLastNodeGuid("50aaa9ea-36c5-42f3-8efb-affb53cee38f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_DirectorLeavingDate("31/12/2020");
    

    TestModellerLogger.SetLastNodeGuid("4c89f4ab-a25d-411c-b8db-a7ab82b5d444");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("3d0bdf0c-2f4f-489c-b95d-9fcae3c9d546");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("3a426782-f4b2-4d3f-b5c9-280d70532ab7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("2233daf1-fa93-4e54-a30c-8e34664a821d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("bd73d100-06af-46ca-81fa-d50e9dc8e8eb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("41e7f8d0-c3a1-4b4e-b774-e8fafc1f0c31");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("4db565df-8134-4feb-894b-10c399b30b07");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b927c497-0d96-4832-8468-d8fbf9a9f5b0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("0c8386d2-3ffa-4552-a7c1-d6d89338b08b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("3def2d04-5dce-4fb6-aba6-50bb09a47b91");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("547596dd-58f2-4333-a4ff-6a2b3d926401");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("01add31e-0634-4ea0-b756-4823944582a4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("faaa168e-191e-4779-8cfb-c223c15ee4f7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("7cc5f036-3c7f-40b4-aba0-b406bd3139d3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("703f42c3-2754-4c19-8543-f2faf7cc26a1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("581a349c-5d26-4446-a873-17999620af23");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69628.Click_Full_Accounts();
    

    }

}
