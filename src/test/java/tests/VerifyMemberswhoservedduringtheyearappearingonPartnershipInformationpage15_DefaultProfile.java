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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8664127f-c060-43af-9840-222244ec23fd
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1107, profileId = 101002)
public class VerifyMemberswhoservedduringtheyearappearingonPartnershipInformationpage15_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15","Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15 - Default Profile"})
    @TestModellerPath(guid = "1cb4ce07-c671-4435-83d1-c94bbcb67a24")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyMemberswhoservedduringtheyearappearingonPartnershipInformationpage15_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15 _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15 = new pages.Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15(driver);
    TestModellerLogger.SetLastNodeGuid("c11390e4-62df-4a27-9a88-c7741812472e");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("57c9ab1c-a834-4759-917a-e0cfa275498a");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1500f9ad-bb4d-4f39-ad81-605dc41b717b");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d4e7a27-35d8-467b-938e-a8b5e0b2e892");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("981f6f98-d205-4fe6-b693-dc3b34425e79");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c5961192-c6d2-4f2e-ab18-03ad5b9ae871");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7054c935-c056-461c-b7fe-f34cf3bd1652");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3a5a698e-6958-4c17-96e2-9c2545e6b960");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("65fcb3c5-bdd6-4dc5-bca3-231ebdfe8ef2");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("5bd81409-c34b-47e8-bbfb-b11b94d69492");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f535b175-7e78-4639-be26-d98ff338fc95");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("ecb3479b-dd05-4237-bd9f-9fae9caab867");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("469af231-4af4-46a6-810b-9ef8f097acae");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("d430e451-0e43-430a-903d-7dc33647b0e4");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("0183bb35-78d5-487b-9c09-f79e38d19fb4");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("6440bd12-b9f6-4f07-8fe3-280ad8f27ad5");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Members();
    

    TestModellerLogger.SetLastNodeGuid("de2b2ee6-eed2-4298-b157-36d88310115a");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Add_Members();
    

    TestModellerLogger.SetLastNodeGuid("9907e6bf-461a-47a0-8b54-d1b00fc1452c");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtFirstName("ABC");
    

    TestModellerLogger.SetLastNodeGuid("883a746d-8a3f-435c-bfdf-ff5d0af53cc7");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtLastName("XYZ");
    

    TestModellerLogger.SetLastNodeGuid("933d61c7-6148-444e-9f8d-aa30b69d3dde");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtPersonJoiningDate(sData[35]);
    

    TestModellerLogger.SetLastNodeGuid("7b35174e-404d-4272-add8-d6d3a4a3aaaf");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress1("Rolf Land");
    

    TestModellerLogger.SetLastNodeGuid("7593ba76-221f-41fb-9d96-df0d89a420ff");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress2("John Sqaure");
    
    TestModellerLogger.SetLastNodeGuid("6aff1a07-b7d2-4963-9eb1-3b4309e1717e");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress3("Near Post Office");
    

    TestModellerLogger.SetLastNodeGuid("ccbb0cfe-ae3c-4aaa-8bc3-15ff5a45f81d");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress4("London");
    

    TestModellerLogger.SetLastNodeGuid("ec43957b-8c0e-44ca-aeb5-15a73b382a92");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtPostCode("SW4 8EB");
    

    TestModellerLogger.SetLastNodeGuid("2e331600-bbdc-4d31-8fb9-0c36182021e5");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("d0fb8986-9234-412e-98a6-ad2faecbbe4d");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ecbb7dc3-1cc9-4e9a-bc6b-7630845a2f3f");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("f8562521-9e87-4450-814e-9ccacb99d4c0");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b74ebe5a-061d-4e99-bae2-50f17e7540c2");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("d7302f25-498a-4965-b1ae-d97eed6df088");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("3a61a157-7f49-4c90-b204-b1e954283493");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("70475b2f-6bd6-4c07-9064-356b0192c8b7");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("e5bbd080-995c-4880-b5da-7363d9661a48");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("7d9a84e5-0b60-42c6-b3f7-94e8e49303ff");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("0f32c5d7-bfec-4e52-86a0-8fc5995e9fe0");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("d02c2730-d4db-4664-8eff-6fda32d0d1f6");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress1_1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("0e9747fa-6fe2-4a69-b102-5c3e236eaf68");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress2_1(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("4eb74496-252e-425b-90bc-d2b532cbd6c6");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress3_1(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("f88200e4-8e24-4821-b6d2-556e57cba1af");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtAddress4_1(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("13f23f74-ac8b-48ce-9ea4-dbadc8c975f8");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("1ead78fa-79ec-4dcc-88b5-414f7b7d0a79");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("37819bb9-7fbb-4fd3-b01d-68e38ab32299");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0382e8b5-3b72-41f8-99a1-e1ca8f2b4346");
    _Verify_Members_who_served_during_the_year_appearing_on_Partnership_Information_page15.Click_Full_Accounts();
    

    }

}
