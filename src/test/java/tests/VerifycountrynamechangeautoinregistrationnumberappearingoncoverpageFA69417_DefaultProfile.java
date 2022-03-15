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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c2eaa5df-679a-4c90-8f95-f778fc7945af
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1416, profileId = 101281)
public class VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA69417_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417 - Default Profile"})
    @TestModellerPath(guid = "4bc607ee-4a6e-471d-a44d-7a3ee0b3584d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA69417_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417(driver);
    TestModellerLogger.SetLastNodeGuid("62f8af4d-8d94-4ce9-af03-4cea31074b0b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("997a3185-35e8-4d08-95f3-bca452bed227");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4089b852-126b-4202-a1d3-de14a7776a19");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("198727f1-150e-4600-883a-e3bfee6ebe69");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a6741c87-ab15-4b39-944c-dbbbcb34b75b");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("47063b0e-b560-4292-8038-0e06d9964d11");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b269a070-99f3-42ee-b4f9-54fd7ccb7ed9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("13d0c68e-5eaf-4fdb-9053-f0addad20c8a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("2ea61093-2ac4-480b-8163-7160e2513085");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c4b1c706-e578-4cbd-ba8f-a0702724e833");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Enter_SearchCompany(sData[4]);
    

    
    TestModellerLogger.SetLastNodeGuid("51bae12c-f8cd-4767-805e-450f87eb6efc");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c595301a-9af7-4225-8987-1911949f4268");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("70bde0c4-a496-4315-b62a-4d903c3668b7");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click__ABC_LTD_();
 

    TestModellerLogger.SetLastNodeGuid("06299208-e2e8-437c-b394-454a3b6cb17c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("c3654608-9823-4c6b-8604-c809d8202147");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("ec90a41d-4eea-4f0a-9095-b27e0d206c05");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("beee0eeb-e814-4872-9976-677710cf3034");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("823ea164-969d-4352-bde6-66c56bdc75c9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("5298baa3-4d23-40f0-824e-3352cb24d4ab");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("9cfdc718-373a-4649-b79b-7b689b248600");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("4c2bb332-5d87-444d-88b2-84bcbdcbe15c");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("1ac56e28-a846-437f-a8ea-1891fb24c4e9");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c28ca329-b197-40e3-80ec-23c35f57f126");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA69417.Click_Full_Accounts();
    

    }

}
