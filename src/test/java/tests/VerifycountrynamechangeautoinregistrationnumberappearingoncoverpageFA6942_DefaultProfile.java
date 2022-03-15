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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/52dc619e-06a2-42a4-b249-999dcc51c661
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1397, profileId = 101263)
public class VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA6942_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942 - Default Profile"})
    @TestModellerPath(guid = "12c8e0fe-3b33-437a-8d19-c67d0c13c0fa")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA6942_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942(driver);
    TestModellerLogger.SetLastNodeGuid("78a227e5-363f-4239-96aa-9b3311c366a3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f0e87f94-6f31-4909-a47b-f05d6cdba3d9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3bb6b6ce-ca32-4996-ab32-79a50b2493fe");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("016aeeb3-2758-4d6c-92ed-789a2fbf7e25");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("f7c3b4dd-68d0-4487-a5d2-7e18778e8148");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("588e1a1f-964b-4a3b-90c0-27b4ee5c3d94");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("47037df8-7e83-40e0-ad35-e2257ed87cf0");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3ed84b1c-6490-4501-8a59-2b1af846dc74");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("db2a9f75-ea7c-4c36-bf52-f862bb37c8ef");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("13b0ca25-c9c8-4cad-af38-88b9f2e273cd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("2cc29adc-3299-41f6-9cdd-a7c8566bb22c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("5c9a66ed-6191-4f5f-ab68-40e4a9d0ea1e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("5b9bbd52-3dbb-45b3-b78c-341881bbf90c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("29aae89b-9873-4fc3-937b-137c6d979b68");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("8b54f94c-6879-498a-93e4-776bb47c5f22");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("5842e7b1-345d-4f62-9fb0-9773d2439f3d");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("aa45af9d-ef79-43d5-b1b9-0e59fe4dd415");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("a9969911-f4fd-42a4-b43e-9b7a1dbc591e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("4a77140d-0d17-4fa6-a900-22e4fd9c4b98");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("e5739a06-17cb-41c8-b43d-257f481e2317");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("59f125cd-67c5-4058-9b5a-af9423ff8a61");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("60efc296-0ce9-4076-9b8f-45c430a08ce1");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("7091dfdb-3c4e-4080-9f6c-742057f9aa5b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("070b66ba-37e8-48d1-ad1c-9d58800b2554");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3ef98176-6109-4fe8-bf36-a363cab66bad");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("35aaf80e-3f53-4d0e-9254-ea9ce038d241");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6942.Click_Full_Accounts();
    

    }

}
