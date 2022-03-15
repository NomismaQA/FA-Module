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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f8691146-68bc-4d98-afc7-127510818be8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1172, profileId = 101061)
public class VerifyregistrationnumberappearingoncoverpageFA6961_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
		String sTestCaseID=null;
		String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_cover_pageFA6961","Verify_registration_number_appearing_on_cover_pageFA6961 - Default Profile"})
    @TestModellerPath(guid = "7df83812-586f-4a1f-83a5-906365cff9f8")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberappearingoncoverpageFA6961_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_registration_number_appearing_on_cover_pageFA6961 _Verify_registration_number_appearing_on_cover_pageFA6961 = new pages.Verify_registration_number_appearing_on_cover_pageFA6961(driver);
    TestModellerLogger.SetLastNodeGuid("646e3ddd-733a-40a4-a38d-54258f643c3d");
    _Verify_registration_number_appearing_on_cover_pageFA6961.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ce70d101-5434-406f-8eab-601bd22ad5bd");
    _Verify_registration_number_appearing_on_cover_pageFA6961.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f826db11-b472-4a59-982c-494cf5bfa2b8");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("24a585f2-ff18-4a73-b835-b35c75406a3d");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ea5872ab-eeaf-4f31-827f-9ed90f6b9ff2");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("82dfe1b8-bb1f-4d4c-b9c6-2db73e7a4b35");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9c3221ad-043c-435e-bb20-7925bf692e59");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("10066bba-4fdf-4981-8693-752bcd1cf01e");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0d1aea58-3035-44aa-a551-4bfe2557a72d");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("df4ba7ea-acc2-4085-9314-182031854d50");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a19ae0a7-a239-4f02-84d5-2d95f478ce0e");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("0e779556-5d7f-4552-aece-d222bceb0a9d");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("51626abd-f157-437c-97fc-f7fed0b721d7");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click__Test_Systems_Ltd_();
    

    TestModellerLogger.SetLastNodeGuid("db892388-14e9-4c73-8335-357dfc3a8472");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("4d1a2c5a-2c13-4d6c-9081-eae5d61e9b97");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("e97fdf00-5e80-41f6-8ad7-b91687d1167f");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("0a933e26-6a58-40bc-aa3d-84d7ddd029df");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Adress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("bc3e576c-689f-4199-aab3-55daee9b757f");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("74b6ea05-e5df-48ff-9e89-5fbb8b93cf23");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("286d422d-5a5a-473e-aca9-777eedcc11a7");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("adb319ee-1ddf-4d86-9916-55964708a2e0");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("e099bcac-eddb-412b-8017-4fc507b2518b");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("97dad2bb-8772-433b-ba8d-f0cbc773cb9b");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c3654608-9823-4c6b-8604-c809d8202147");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("151a0abf-8ba4-409f-a857-f1f74d179baa");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("2b590b9c-d562-438f-ac35-ef8d39381a35");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("2d809f8a-2817-44f0-b194-c69e019bf438");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("5ace857d-2261-419b-9e8d-ba841ba2bbba");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_Authentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("879d30aa-c249-4642-92d0-815d36ad929e");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_CTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("90d5d6d1-7ecd-40d3-b278-77d1940fce49");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_CTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("d6d64705-0045-4d0b-a215-c6fb2d816ef9");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("ac622b2f-e449-4f2d-9770-24697442435c");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("4df44258-787d-467e-a585-d30e6693e8fd");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("0be8b9fe-b1a7-401c-b3f3-ec04a28d29d8");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("07df0706-4729-4d3e-8d19-585b041a9ff6");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("ff8a09cb-64bd-4981-9a05-7c67a278cc19");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("f3f40ad2-10f6-4810-bc9a-b7ca41e36e2d");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("1514d428-498a-4e84-bda1-68ee9abcbc33");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("a7ffafdb-28c6-4991-b328-abf7fe02eff2");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5caa6e5f-76be-44e5-bec8-0778c3cb3c04");
    _Verify_registration_number_appearing_on_cover_pageFA6961.Click_Full_Accounts();
    

    }

}
