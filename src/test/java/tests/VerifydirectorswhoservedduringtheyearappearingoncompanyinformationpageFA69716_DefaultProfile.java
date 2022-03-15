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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/1ae7b81b-c780-48b0-8216-ffe0f2bff5fd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1364, profileId = 101231)
public class VerifydirectorswhoservedduringtheyearappearingoncompanyinformationpageFA69716_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716","Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716 - Default Profile"})
    @TestModellerPath(guid = "df1a6d95-7c60-4fe8-bfa8-9b0f6a07db23")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorswhoservedduringtheyearappearingoncompanyinformationpageFA69716_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716 _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716 = new pages.Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716(driver);
    TestModellerLogger.SetLastNodeGuid("0eb24520-bfc8-4e5b-8c88-6d45fe836a14");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e3b27ca2-a030-4b53-94e4-2cb306f31182");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6d0c2309-0722-42d2-827b-6e3052fbc8ee");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("28fe2f08-8537-452c-8e94-063303aed6d8");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ee4de3da-cb5d-4cb2-8d07-11d03bada9c3");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("652f22be-a5d4-4bef-916a-4b3f93c07305");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("16289103-54b9-4274-ae27-780831eef16e");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2c54ec8f-d443-47cf-bb5e-10afb9d9abf1");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4a69675f-dd3c-4f18-acb1-83f2acec85f7");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("955bdfda-6ffa-4f7c-a169-2e0224a77d96");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("2eb538da-9f92-4321-a411-8979015c5d15");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c30eeb66-86f0-490f-97a5-6d640452899e");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f3df62ba-b641-48df-8365-2bed8be0e80d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("de3c942d-efb4-4bde-a74b-1d343be11108");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("cc703fd8-5f23-48cb-b527-ee6abf2faf2d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Director();
    

    TestModellerLogger.SetLastNodeGuid("eb08fea7-b6b0-40e0-93e6-7c0c182d8692");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("21d96cb1-838f-436d-9990-4c613c2c9bc0");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("95411e52-5d19-4eac-9710-95ffd500274e");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_FirstName("XYZ");
    

    TestModellerLogger.SetLastNodeGuid("6c51aa3f-1cf5-462f-a0be-7b5dc71b717a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_LastName("ABC");
    

    TestModellerLogger.SetLastNodeGuid("f879357c-46b2-4997-ae30-611708afeb89");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_DirectorJoiningDate("15/08/2020");
    

    TestModellerLogger.SetLastNodeGuid("4ac0aeee-db31-485f-b7b8-f42f1d902044");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("688a147e-2dae-47e7-82b9-42c8c38a5b0a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("ccb15e7d-01f7-4499-807c-27e264b1e9bd");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("2578d16f-52b3-47fa-a4bd-6fc71ff52fdf");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("02c8c9b0-ff6d-4bcf-98a0-a76600800dca");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("24ff3888-c2c3-43a6-8f99-d8fd5e429a5d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("d1666cfc-2b1d-4f61-926f-668ae7fd3a7c");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("84f7a52d-e873-4e0a-9480-c4f0cf7aeedc");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("b1adccd3-bcec-484b-a40d-662cad1a3d58");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("dc1a30a2-1b6b-4ed5-830c-cb43942b5325");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("796caba0-1c6f-434f-8176-33205768e31a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("6221bf28-1dbe-4f35-a77f-0a5f9774afdd");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("fc083eea-bde6-4d77-b219-e2da61f4c6cf");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("089618d9-7855-4bdf-82df-c2acd6868eb7");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("7a569cfe-1e5f-46a3-b174-75199c54c7b3");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("37a5e40a-72f4-431a-8b99-2745d4d03797");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69716.Click_Filleted_Accounts();
    

    }

}
