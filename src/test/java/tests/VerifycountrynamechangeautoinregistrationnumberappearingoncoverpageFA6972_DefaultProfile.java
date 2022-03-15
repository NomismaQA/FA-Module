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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5cc25850-2537-4ccf-8080-7a644276e8ee
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1344, profileId = 101210)
public class VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA6972_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972 - Default Profile"})
    @TestModellerPath(guid = "32d3ec34-e0cf-4585-88bb-fddbedaa13a0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA6972_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972(driver);
    TestModellerLogger.SetLastNodeGuid("594edcb5-2e3f-4bf9-9ecb-62dd12f733d7");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("76038c40-a967-4cc5-a3c8-1c8c2d45fb94");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("70a3d7bd-f7cf-4374-9ea2-bb38679bd9f9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("8cb67838-44c7-4aff-98d5-55f291dfe882");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9e7ebe6e-0d70-43ad-864f-19ca8291874f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43bf8490-7f91-4438-b70c-494ebedbc9a5");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c1bf93d3-f645-4569-9000-aea4d055bd2a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("42c296b7-b1c0-4eda-909c-0b6680fdd6d9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("97f9015b-c60e-4999-a348-6580102197af");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("5228fc0b-5e7d-4a1a-9ccb-fe95ddac5f47");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("38d74691-93e9-4ddf-a02c-8c6977d55d86");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("1f1afac3-fa07-4fad-afb7-511a4a461f9f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ddbef667-9a88-45ed-a3f1-9b3f40d1510c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("41047738-2a3a-489f-bbf6-67c3de79d8fb");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("23feffdb-7097-43b2-bdb6-8a6d37e0af7b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("174ddca4-dda1-4129-8191-37efd306a354");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("d8aaf285-0987-4905-8d30-de3c3a4b2de7");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("8047b1fd-6e4e-460e-8c4e-6446b1936b23");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("7e614d63-24b5-4fa7-a63b-efa20a9a28f1");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("7901014f-2a86-4761-9c0f-11584861389c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("2baabce5-cb11-4253-b4c3-7b984c9b07fe");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("2882b126-a6b5-4bff-b7ef-848de22c8d99");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("c75f7579-0530-4692-8472-a20e2d52c2f1");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("1330f4dd-bcf0-4a53-a8ed-00461cb431ff");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("e984612b-8c3e-437b-afbb-ce68089c36dd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("6e2ed01e-849a-4d52-b8c9-cb163b4afdf3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("d06059bc-2943-4028-866d-225c473ca501");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("64394360-585d-49b6-8c83-58cea6974381");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("6e920a9c-939d-4183-ba7b-2931c39b38ef");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("82a1021b-d91e-4522-a4e8-9aedb61307c2");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("ca28d099-c961-49a3-b15c-7ef8308e3f01");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ea799f98-27fc-4cab-bd56-b4a76f72ea0d");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6972.Click_Filleted_Accounts();
    

    }

}
