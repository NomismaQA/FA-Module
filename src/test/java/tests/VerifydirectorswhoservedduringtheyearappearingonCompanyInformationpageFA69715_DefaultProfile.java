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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/334693a1-68af-4770-a265-e39fbb0d3bf9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1362, profileId = 101229)
public class VerifydirectorswhoservedduringtheyearappearingonCompanyInformationpageFA69715_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715","Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715 - Default Profile"})
    @TestModellerPath(guid = "38bd30a0-ea8d-4259-87d2-346a0956c694")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorswhoservedduringtheyearappearingonCompanyInformationpageFA69715_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715 _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715 = new pages.Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715(driver);
    TestModellerLogger.SetLastNodeGuid("12a7e333-1f66-44f3-ab22-3f3a37eca8fb");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21661fdd-2b16-4881-984a-cc6f88d82912");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d8cbc5c1-52fe-4b70-9ccc-b3cd19ef7dc1");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a82a24c8-a1df-4214-b0c1-87c6239eef72");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("346dce5c-3ad5-47e9-bae6-e6b187b0ee0b");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9d1b16da-dec4-4f1b-ac07-4ba651c765d6");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a1db0678-0d5a-4f0b-b8ea-0f6f07ed32f7");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("dc829fd4-2dbf-41a1-ab3b-95dc2654d41f");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("db1cda01-3242-44df-a274-7ed82095cddb");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("08bb4209-8322-405c-9a57-ccf1a0f17948");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0046c364-a801-48e3-bbdf-85cf12815eab");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("f4084524-f7cb-4fd6-a781-9fdbe928ff0c");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e1c63712-f100-4d40-8817-f60d4af80dd8");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("3f29eb23-005e-4447-aac2-96e2679e41d9");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("18136e57-f6a6-4031-a200-6337a9822835");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Director();
    

    TestModellerLogger.SetLastNodeGuid("d4ae1ae5-4211-4b73-9248-2b6edd5232cd");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4a2fc90a-dcf9-46a6-bfdd-f16ff4834099");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("a9c327f6-50d6-4954-8886-c8857f4de761");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_FirstName(sData[29]);
    

    TestModellerLogger.SetLastNodeGuid("f8b8b2ce-5651-4433-abe0-81d52080a559");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_LastName(sData[30]);
    

    TestModellerLogger.SetLastNodeGuid("a3db7e06-6754-4251-aef0-0ba1dbb4be5a");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_DirectorJoiningDate("01/08/2020");
    

    TestModellerLogger.SetLastNodeGuid("b400a18d-a81a-4072-8df1-25062207ecd0");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("653a49dd-2bc6-43a5-bf84-9d3105937b9b");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("60930b81-9b9c-4842-a480-9c36c15c51ad");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("95d69e09-fbbf-494e-8484-1af958fc325e");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("cd4f05f3-3e96-4eba-a6c9-a7b39dc1a738");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("896099c8-4c2a-40a2-a506-acdb6f50a94d");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("ea096e8b-4469-4835-9938-66d7b4d998bf");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3c5cb543-8568-4ca6-a637-3067749ced9f");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("1680ee72-10c5-487e-bfc8-ac5bd2fef482");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("26d69e01-3918-48d8-a689-d900e292b96b");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("aef2d328-386b-48aa-8a1c-dd3e7926f9f4");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("67add39b-cd5d-4f65-be89-0a3e66ec2b73");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("a9a55f55-3266-4958-be4c-b332eae66b86");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("46d89e82-27e2-4c1f-a6e4-5fb714d6393c");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("38b5e314-0626-4ee6-806e-bd190482ad1e");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("8e35f6dc-c028-4aee-bf71-4f916109b89e");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69715.Click_Filleted_Accounts();
    

    }

}
