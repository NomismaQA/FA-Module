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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a514158e-c8cb-48a0-8a6d-9eb491341678
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1234, profileId = 101123)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69634_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634 - Default Profile"})
    @TestModellerPath(guid = "7e2718d2-e187-4e6a-91e7-5a11a2751393")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69634_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634(driver);
    TestModellerLogger.SetLastNodeGuid("331078ed-429f-478f-8d44-8274d7138acf");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94f4e646-1454-4bf6-8491-f77fa6f5e8d0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1cefeb08-e3d8-47fa-bac8-7d1c4651264d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("19313817-23c8-4fb2-ac65-ad0d0917d493");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("82f43298-2a33-4afc-b3a0-04142d3c2974");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("64ec047d-c7b8-4642-b79a-84b102c48408");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5760cf99-4d82-4be2-96d0-e9cb5f46c3e6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("262b37cd-7968-4a4d-b450-4b9ef3985a3b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("23cdd6d9-a35d-4df3-9a52-2665d3404371");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("eae5f2a5-faf5-45fa-b110-3fb13ad5fad4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("173c6f39-1e13-4543-9119-860501a04e22");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d4cd2925-0f12-43e4-839b-f2ba4bfc94a1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d2c97d13-5d25-4953-8329-5860b7af08f7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("88899ab5-8058-4f17-963d-3833a89c23c6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("1270d497-4d97-496f-81a0-6ba0e6c9ba44");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("9eaea9c5-da66-4b62-a124-4be0b69acb81");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a7efbb10-738f-4384-93a9-c0cf794a28fa");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("b54e33da-65b9-4bf1-a63d-e3abead5f08e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_FirstName("ABC2");
    

    TestModellerLogger.SetLastNodeGuid("bb57b91e-4ad0-4f2b-98e4-cce456cf8e3e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_LastName("XYZ2");
    

    TestModellerLogger.SetLastNodeGuid("3e7c0e6b-f32f-47ea-8a63-9780dbe044b7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("2d33f909-22ec-4747-bc6f-27cd52812c35");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("f0ce4ca2-c6ba-497a-9f49-b6a806c562be");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_DirectorJoiningDate("01-07-2020");
    

    TestModellerLogger.SetLastNodeGuid("89dad290-b451-4032-bb8e-c792d36f7a78");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_DirectorLeavingDate("31-12-2020");
    

    TestModellerLogger.SetLastNodeGuid("13d412b1-5008-443c-9b93-392acf243247");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("f61e4c9b-7b35-4d44-b005-1cd83d4c0cb3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("ea02aba3-b42c-4fb8-ac9d-7403b0ebdd8d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("ba7847f1-3993-4356-891d-608980a47c0c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("87f7e49e-2684-4ecb-9b38-ec4d49fcb5a6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("dc505320-c560-4031-a003-fae9a9328257");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("dadd4bd6-cdf7-40a4-910a-4d4dc28cfad8");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b81cac4c-f6e5-4dff-a2a1-668bb08d950d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("d0ccd5e9-ceb3-4803-81e9-c394160fef6d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b3a7f9ed-867b-405f-8e48-eba350d8fc28");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("cce4a73d-76cd-4d2d-9aef-426e6ce26175");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("d70e8aa4-129a-49bc-b9bd-d4bd35c2054a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("e8cfa77f-e3a6-43da-82f3-1634e060523d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("92434494-16e5-4e1c-9d61-9c7257b5a569");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("105a6134-f511-4249-8f9e-9ac3e3326adb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("d5666d8a-95a5-4bb7-9488-ad1bbd3760e0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69634.Click_Full_Accounts();
    

    }

}
