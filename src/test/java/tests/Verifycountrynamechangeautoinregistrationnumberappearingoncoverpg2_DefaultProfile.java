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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ee37c17e-dfc6-438e-bd16-8cb3f45a6f7e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1084, profileId = 100981)
public class Verifycountrynamechangeautoinregistrationnumberappearingoncoverpg2_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2 - Default Profile"})
    @TestModellerPath(guid = "de8152f8-5ef5-4dca-b74a-77e2f6af5e4e")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifycountrynamechangeautoinregistrationnumberappearingoncoverpg2_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2(driver);
    TestModellerLogger.SetLastNodeGuid("aa2b8f8f-54eb-4e35-88c9-6ba9c16a423a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5eea2e79-5c4c-49f3-a852-15ea8e605d6e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("10b7d550-aa25-409e-bd00-4b1e44aaaed7");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0cb4fe5e-4bd9-4855-bc75-0f6061440e67");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("49e0ad4c-c61e-4a8b-b4ae-c3c7e520cb5d");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("615f37b8-8752-41c4-9c1e-37ff26d49fa9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9fa207bf-8ea9-4f4a-ba73-1f6a7847458f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b151899f-8538-4eb3-9dc3-80987401e157");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("05bccc18-501f-49c6-9cba-92f4572e6777");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("adabeeeb-2125-4444-9304-0c9291ab0ecb");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6b19c377-7ef0-41e9-b15c-dcd93c14c8a1");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("50e1a279-c68a-4501-82b9-3c59f799807a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2c631083-6fb1-483b-82ba-d593e6d031dc");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click__Testing_Partners_();
    

    TestModellerLogger.SetLastNodeGuid("33e9f6fd-353b-494c-9e5b-edcf2eb6a33c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("12cf4ab5-d914-46af-a425-97dc8ca8bd88");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("84ba6286-ad73-44fe-ad94-e7cb27cfb2b5");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("86439ed6-be53-47b7-9093-32e4648be7ff");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("da904a40-6b53-4f10-a389-da7097ded8e3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("db44e1ec-8b35-4a97-94eb-d4e5171f87a3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("783fef29-cb53-41ff-a13e-bc7474e58e5c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("e93f6b67-5a57-4e70-b15d-6e5fe44b823a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtUTRNo_LLP("'8709572867");
    

    TestModellerLogger.SetLastNodeGuid("a727ac76-bf8f-465a-95da-f9c44dac253e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("3ee525f6-d746-4b8c-bfee-f908e8ca671c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("bf3ba062-0b61-4290-940a-79c8c757b8ec");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8616bfb5-3c53-429a-8ddb-a80765a17fdb");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("edd00cf0-99a0-4611-95dc-f3ae1313bec5");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("11e825bb-4e13-498c-81d2-938019528c45");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("858f4017-c9f5-4729-892f-8e11fd6075d5");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("57b2f4ca-8f36-41fe-8511-a375f6dd2016");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("99ef8d2f-3243-4bb3-be7e-4a3761afde09");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("ff9a3981-4ada-4530-97c9-1d8fc3ae7f16");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("5fd37dcd-a63a-4690-9db3-8dd018b8ef65");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("f32525fb-f14a-494d-a9d5-91c11801853f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("0f6ff708-4165-4383-9f14-97d9fb16d111");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c5989ee1-c9e3-42be-b2c6-eeee528a85bd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("f5e47f2b-11ac-42d3-9565-ccf7e9b6b942");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("dcde2f42-b5f3-4e43-aac1-1658f94f0471");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("79de67bc-5b4e-4c1d-8d65-afd6db14c9be");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("02a650a2-215f-4777-b908-c521236534ec");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("18f9c3a4-fa31-4ee2-990e-119c6e516b8f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("723b68f3-996a-417a-b049-eb8330560080");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e8de5a72-9833-47f8-997a-9ce60938e964");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("c0366512-d73d-4b04-b35d-7979599853da");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pg2.Click_Cover_Page();
    

    }

}
