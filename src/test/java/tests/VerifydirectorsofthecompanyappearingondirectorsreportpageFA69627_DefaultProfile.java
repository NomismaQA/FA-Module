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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/08c62410-3fd0-45ac-904e-4a325454d9c9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1218, profileId = 101102)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69627_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627 - Default Profile"})
    @TestModellerPath(guid = "690c528b-7bf3-4f39-9cc1-b54ea75be182")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69627_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627(driver);
    TestModellerLogger.SetLastNodeGuid("254ec669-e2c4-457b-bb47-3da6cc34067f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a4595406-feb8-4fa6-9aee-040f761980ab");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("291ed51c-e287-4a54-ad4e-9ea9404200e3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("6899c2e8-bc88-4fe2-9248-e84223b5df9a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("fab88cb7-7b70-4aa3-8133-e0a7fa01100a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("b05c6135-63d2-4897-9e37-f54603c35123");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("06de2ca7-6a34-4a9b-9a99-b0f2b017306f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("83542468-3f04-4683-b177-1f5fa3cfd151");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b71cdc35-723c-4cb9-b529-b42ae772c026");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e5beec32-d958-443e-aacc-1f9886ac9bad");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e7f812cd-fcb2-451b-b53b-b5a149041d54");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("01a73c6d-3ecd-4937-b525-ac505059035f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("580cdf99-fe8c-4a11-b2ea-a3ba7ac17a0b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("eeb3ca29-bdc1-4b69-835a-13935171c26f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("684f739f-1fb6-4fe5-ad67-1bf5bff33c96");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("5847a0a0-95c2-46b2-8672-960673c195d5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("927812a2-48e8-4e1d-9958-aa0188a07a23");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("2a934830-640a-4409-88df-f19305fe37c7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_FirstName("ABC2");
    

    TestModellerLogger.SetLastNodeGuid("94326730-90f5-4afa-99c2-5032ab7f9e59");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_LastName("XYZ1");
    

    TestModellerLogger.SetLastNodeGuid("c58c487e-e214-467d-af31-bde165de23e1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("18516dda-8c2e-4a8d-91a8-38fc2c770bad");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("d780d12d-999a-4743-a2c5-99db83a12d3d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_DirectorJoiningDate("18/05/2020");
    

    TestModellerLogger.SetLastNodeGuid("bbb15704-cee4-40b5-8083-6b83ae1ddf62");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_DirectorLeavingDate("31/12/2020");
    

    TestModellerLogger.SetLastNodeGuid("96104b09-3fa3-444e-bb3f-0c703db63ce2");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("7cf117c5-3f96-4518-ab0d-b892f488aa48");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("c4d6a735-bef0-4157-a898-8b8b8c1c04d4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("ade5c4c4-5727-4c4e-9320-9964a8d13725");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("2735acbe-d20b-462f-8791-3ae66de0bc08");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("cd0b7440-5398-4737-a3c6-7270ed62704d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("bce1cfa1-a545-4c46-92e9-a335238f8f7a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("0e8ef54f-0f78-4107-9eb8-90ed8977db12");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("7f598c71-48f5-4564-a7e8-6fa7b5185bd2");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("9aa62f84-732b-4a79-9e4b-18a13578b386");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("5625fe4b-45ce-4e2c-a065-ea128b56f86f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("4118723c-af02-44c0-9ee3-18ab03d4c155");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("3682e286-8b63-4a8a-ac73-c039dc714c1e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("e8a4ab0a-214f-4270-99a9-b903750e8c7d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("b45b722c-0bc1-4fbf-9032-74d0c0ea59bf");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("97971681-0bc8-41e8-98b0-0aba347c6b4e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69627.Click_Full_Accounts();
    

    }

}
