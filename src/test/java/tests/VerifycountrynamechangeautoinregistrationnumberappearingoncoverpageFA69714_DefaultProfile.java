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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5e7d0e4e-9aac-48b9-9f00-e4abeaebb19b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1359, profileId = 101224)
public class VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA69714_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714 - Default Profile"})
    @TestModellerPath(guid = "cfdd7c5a-1eb9-4108-a807-ed7d426e73a0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA69714_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714(driver);
    TestModellerLogger.SetLastNodeGuid("3d505669-5cf7-4516-bb19-582f723e3e45");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d4c46d5f-eb27-49b4-a33c-1c50c2447ebd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("dd18dc10-d64f-4ab2-b4b4-befa66c7a183");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("57fbe4d6-8266-409c-9d76-1e8f1467d9ee");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("779e8ff6-ad1e-4042-91c5-ed1ef5d7c07d");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("dcadd9aa-248b-4f34-98a5-22b8568232f4");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9d0f7238-ca85-4dde-a2fd-177920cf08f7");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b0624d94-3efa-4697-8db3-00a107e48d09");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("13ddb44f-1faf-4268-b8bf-567f541f8309");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("0a84dc85-cba1-40b9-b9a9-05d500188bbf");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e9d68f12-b7af-4463-b8ff-1024fe742848");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("ed59b2b8-78a1-419b-8678-9132ae2bc306");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("6305705d-b944-44f3-b0e7-54b85a67da68");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7720a21e-bc3e-41b4-9c12-2714e8ddff70");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("9735eaa7-44b8-476b-83b5-2d0ef9b11600");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("af7cd364-8127-406a-8b18-a944e22e408f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("83e7c6b6-8234-4a45-9fc5-3128978114fd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("9a40467d-4b48-43be-9d34-8425debf9b48");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("0d0563d3-a098-429b-b81f-25c3f505a050");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("e1eb18f5-b0c7-4627-b0c5-540c5c878092");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("f78974e5-7040-4007-87a0-c756dd36af66");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Enter_RegNo("NI121212");
    

    TestModellerLogger.SetLastNodeGuid("3ea2690e-41da-47d8-bb62-8f59e82bd921");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("5549ca94-46bf-4bfc-b56c-a9e2738eed21");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("94fcc43b-d7c2-420d-a951-52ec910c09e3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Settings2();
    
    TestModellerLogger.SetLastNodeGuid("7da9aebf-b3b7-4b8f-b7b5-1eae40c6e392");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Accounts_Settings();
    
    TestModellerLogger.SetLastNodeGuid("9ab5343d-245d-42b7-b3b4-9ce7905f54d0");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Edit2();
    
    TestModellerLogger.SetLastNodeGuid("79541c58-4085-4286-b980-3b29d8b86e0e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("144f1b47-0f6d-4ffb-a868-8e521731224f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("cc13f7d8-8859-40bc-af56-5f7ca91a5d72");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("75d9e2a1-8627-4b67-95aa-e7c213ec49e5");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("795707d4-0467-4e18-94f6-a2a303351f36");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("51e1e772-968a-43f0-b037-b4378d1bef8e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69714.Click_Filleted_Accounts();
    

    }

}
