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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/479a2362-1595-43dc-9581-11256d94eeb6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1098, profileId = 100996)
public class VerifyregistrationnumberapearingonPartnershipInformationpage13_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_apearing_on_Partnership_Information_page13","Verify_registration_number_apearing_on_Partnership_Information_page13 - Default Profile"})
    @TestModellerPath(guid = "0029bf28-b46f-4364-8bd6-d48cd0cd77ea")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberapearingonPartnershipInformationpage13_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_apearing_on_Partnership_Information_page13 _Verify_registration_number_apearing_on_Partnership_Information_page13 = new pages.Verify_registration_number_apearing_on_Partnership_Information_page13(driver);
    TestModellerLogger.SetLastNodeGuid("c2748d81-7aaa-46cc-ad3d-9f15eeab6258");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5596c908-32a7-4ef8-a838-f3b3872ce745");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("de2e0649-421f-4b4d-b4b2-5990d506f033");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4bf9afa5-d3b5-4305-8b34-eed5e9fcb462");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("73bbd319-04e2-4f82-9835-1b37706f8752");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0f8b30a7-307e-4bf1-885f-8e7f60fb08b7");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("154e613e-a298-424c-8846-8184d93e1805");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("11e64eab-dd6c-4e1d-ae86-5d5024de171b");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("457c766a-fa69-49f5-97cf-b20779a54137");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f8314160-9abd-4515-9e9d-4e6fbfcaede1");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("3f04f6df-51e6-498e-83c9-e6b54252316a");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("f217f79a-a31f-432b-9933-0c0a6e3b022c");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("c9f96213-d599-471d-b113-4c266ebbc505");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("b0fc22be-d55d-4d10-a9a9-4afd87eef191");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("7c9eca48-6629-4f08-aae3-de0e2208e004");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5e2a2967-a67c-4234-9d27-a0e57f633ef8");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("b83f9bc5-d726-4223-abf8-bcb45a1f0998");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("591fcaf2-0ff3-4edb-b8f4-23a5845fb5f9");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("56056efc-b358-46ad-b137-5321c726fe10");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("6c10b625-aefd-4df5-96f3-d4dbe830368f");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("a7eeb11a-8d03-4e8e-91f0-57a95a6745b4");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("7b8c854f-0039-46c9-9e12-32d386ce882a");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("1fb9c753-2600-4ee4-ba5d-35b379a4bdb9");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("bbd193af-211f-4122-9284-6b8ef489f674");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("9ea2b8fd-4b81-4015-bce8-d91d0ef88002");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("1a05b0b8-5580-44f4-b9f9-25052ab033a2");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("57406057-beb8-497d-9e18-09e2c323158f");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("209e3c17-7896-46cd-bbc2-1f02d1ddef51");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("b3004e81-b4fb-4fd7-8b2f-996ec7c5d55f");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("5ac56563-092a-4cdd-a1cb-d2bb4a863ae6");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("eb2dc9db-c484-402d-bb9d-9395091f238c");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("ccbe0f93-0a0f-4800-85f8-ebeb5ca1f300");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("57b1bc22-57a6-45ad-afb5-a0976ecbb01d");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("01bc166a-b597-4835-a7bf-4cc6fe924ff5");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("b8681501-6cfa-4aa5-979d-8b53c0a127c4");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("06291922-977c-43e0-b64f-23be2bd9d6db");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("df718627-d063-4354-ae94-b47ee0234d6e");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("48ad7aed-bbed-46dd-879d-4e8afb23f0ee");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("4f66d823-803e-4fd0-8aa4-8b86563fd38a");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("930f9fef-eab7-43c4-8a72-fd72fa0a1b58");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("b8175e1d-99e6-4588-bebe-655caf0c566d");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("5998155a-544c-4e05-97ce-b27fdfa19f9d");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("dfc2f7b8-0776-421f-9076-a4d9954566a5");
    _Verify_registration_number_apearing_on_Partnership_Information_page13.Click_Filleted_Accounts();
    

    }

}
