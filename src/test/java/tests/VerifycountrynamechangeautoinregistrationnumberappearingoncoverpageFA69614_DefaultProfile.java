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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e4edb086-70de-4ddd-9eca-c729ec099b20
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1184, profileId = 101074)
public class VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA69614_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614 - Default Profile"})
    @TestModellerPath(guid = "ba06d6bd-bb4a-46a9-af66-4b2558cc9aad")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA69614_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614(driver);
    TestModellerLogger.SetLastNodeGuid("eb80cab1-7f6b-4ef4-89d0-094305f96ff9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f14cc76d-9ae5-4960-97ec-ef8d05ce8ba5");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("54772c96-3613-42bb-8dc0-499b064ee226");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("973a8f99-5113-4948-85c8-2d0b698e1144");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("f5a4a545-92c1-4915-8ba6-ab3179b5371b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a65b2ee6-ed40-4883-9bca-50c3aa942867");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("713c8525-2d61-4c9f-9160-1a1381c1ad79");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("421789ef-40da-4c16-9a0e-d4fc75453e3b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("cf58a5ba-b84e-431d-9ca5-12f511030e36");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("859c3084-f915-4522-bb5a-9248168e7d34");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f3135a9e-d5ac-42ec-9eb7-365b99ad5119");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("8466d781-e9a6-4d57-9887-cd528a1bd691");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e3807a43-cb57-468b-8d42-2369e69d09d2");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7720a21e-bc3e-41b4-9c12-2714e8ddff70");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("9735eaa7-44b8-476b-83b5-2d0ef9b11600");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("af7cd364-8127-406a-8b18-a944e22e408f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("83e7c6b6-8234-4a45-9fc5-3128978114fd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("9a40467d-4b48-43be-9d34-8425debf9b48");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("0d0563d3-a098-429b-b81f-25c3f505a050");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("e1eb18f5-b0c7-4627-b0c5-540c5c878092");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("f78974e5-7040-4007-87a0-c756dd36af66");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_RegNo("NI121212");
    

    TestModellerLogger.SetLastNodeGuid("3ea2690e-41da-47d8-bb62-8f59e82bd921");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("cd8217ac-19c7-4163-aeeb-bdac4b4cff22");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("f03c08a0-800c-4707-9c67-0d4fe7793081");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("4100f299-78e7-4f61-94f6-15614280f1e3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("f562e2de-8624-4444-b59e-169e323b7339");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("220fc4d2-8fbc-48f9-8a98-251644caac15");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("0167ca5d-5727-45ad-a473-f57bde72b1fe");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Authentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("1756e09c-80fd-4043-a776-f901be51d5b6");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("15c9cb9d-89d6-4998-965b-f8dd66fb802a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("d1ab8882-0f32-4daf-80f9-edc19cc54d05");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address11(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("58ede762-2a5d-427f-8b33-3fec07dbc639");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address12(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("bb730bb2-f9fc-472c-81a4-093cb67929db");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address13(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("e2bc92b4-f6a8-4010-9ed9-efc7a6cd49a4");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_Address14(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("41801bf8-017d-4a7e-a120-877ca4956f3b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Enter_PostCode2(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("8c01e206-6458-4243-b25a-1add1cd5a590");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("af6af062-1182-4f96-a75c-c2a8391466c6");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("7bae6104-0788-4e3f-ae22-0a49c84eb873");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69614.Click_Full_Accounts();
    

    }

}
