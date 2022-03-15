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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a29e517a-4093-4db8-9af5-7a5d83bdfea6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1101, profileId = 101001)
public class Verifycountrynamechangeautoinregistrationnumberapearingoncoverpage14_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14","Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14 - Default Profile"})
    @TestModellerPath(guid = "54615e60-109e-47a8-945a-27cb69ef58df")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifycountrynamechangeautoinregistrationnumberapearingoncoverpage14_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14 _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14 = new pages.Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14(driver);
    TestModellerLogger.SetLastNodeGuid("756be34e-7217-477a-9cd7-30cf5372aa04");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c52e8cd0-72fa-4d32-8364-f21ad8f65d8e");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f8a92049-b38d-4b82-a7bf-b9d4a53290c4");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b8f35174-b841-43df-9b9a-8b27ebcc18ca");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8f760f60-368c-48ab-8bb3-9503c70b8e68");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("94c01da2-a258-4dbb-9249-23530d261195");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5b27f79b-ee49-4234-9f1f-febdce1f20ab");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("9227dad0-f74a-4a31-bb00-c1f88ef62c7f");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4c459a2c-7f3f-4ff9-9797-be5353e62287");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("eacf7d0a-5120-4aa6-928c-ff344a84e05f");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    
    TestModellerLogger.SetLastNodeGuid("6ade3ffc-f4b9-4c95-83fb-c4d8b64a4484");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");

    TestModellerLogger.SetLastNodeGuid("d44f0408-7a65-411d-a440-51a5766c865c");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("997a0543-7e59-456c-afbe-1d8ad0fff717");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("18256a03-5d22-4aa5-b32c-a815d8750403");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("a459edf6-4fc7-4e57-aa91-e29faa858ebe");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("93cd31ee-9227-4993-be76-c185fbe0ea07");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("5d7a2089-4957-499e-bbdc-8b4b1305931a");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("3fa6cd62-7779-419a-8dae-06c873e8d3cd");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("e19ebb14-72ca-466f-84c5-7890fe5514e4");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("c1e33e00-a456-4089-9d96-c95bcc1f7570");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("9842e198-a529-4496-9745-3226ec10b97d");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("9952a3fe-bd6f-432b-86ef-4c5c33ca2147");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtUTRNo_LLP("8709572867");
    

    TestModellerLogger.SetLastNodeGuid("90c65e93-b3aa-40ea-94ff-63e136b96745");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo("NI121212");
    

    TestModellerLogger.SetLastNodeGuid("e3796ec5-ca73-4639-96b5-c218c403204e");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("e02cf474-846c-4860-8ed2-89c849c698f9");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("2a168dff-be75-4c20-b54a-db5da3dcfbcf");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("1136e52b-1413-4cfc-a7f5-29111f443e5a");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("c0c36c53-5313-4564-bbe0-e5773dc66d56");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("1fdbee34-5ceb-4f69-a61c-9c0826275209");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("e9f3a226-185a-469e-b980-5a10c8223c9d");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("6b4c6498-08f8-4a12-84c6-dee63d542fcb");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("8862a05b-683e-4e21-9762-23cb8cfc6a68");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("26d4d38f-0347-4834-8b20-d5769622e204");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("977de8c7-fc4c-462b-bb2a-9d50c9c19c1b");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("f2ab3c24-3604-4be9-af67-40695d0d7efe");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("d5f5e8c5-59cf-4d68-a522-0ee244b27ad2");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("1f61a6cd-11c2-4e93-8487-198ad476e6e5");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("d2e32a95-d9f9-4f11-95a5-ed9855f3858a");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("edf349bc-1657-478b-ac0a-73da330577a1");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("2eb9e986-c750-4f30-aeab-d225c915e766");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("b4d50f98-e508-4baa-b9ef-a1398d861a41");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("c37c0d2a-2cc9-4feb-870b-12f32fd10b57");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b4b8dbfe-fce3-4a2e-8f85-a0637d2982da");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("0e745b95-4913-413c-80e3-9844ee617430");
    _Verify_country_name_change_auto_in_registration_number_apearing_on_cover_page14.Click_Partnership_Information();
    

    }

}
