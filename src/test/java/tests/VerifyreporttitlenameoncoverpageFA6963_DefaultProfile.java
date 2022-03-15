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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6f68b375-3414-4542-bd90-de4c383a0a1b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1174, profileId = 101063)
public class VerifyreporttitlenameoncoverpageFA6963_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_report_titlename_on_cover_pageFA6963","Verify_report_titlename_on_cover_pageFA6963 - Default Profile"})
    @TestModellerPath(guid = "2170fa7a-6822-4e54-961a-5e2364b3f731")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyreporttitlenameoncoverpageFA6963_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_report_titlename_on_cover_pageFA6963 _Verify_report_titlename_on_cover_pageFA6963 = new pages.Verify_report_titlename_on_cover_pageFA6963(driver);
    TestModellerLogger.SetLastNodeGuid("cc0905f6-de9f-4ae6-9988-60d05721b42f");
    _Verify_report_titlename_on_cover_pageFA6963.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("da8d1195-9ca7-4e97-8138-be9fe927778c");
    _Verify_report_titlename_on_cover_pageFA6963.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2af022d1-7ccd-491b-aa41-89c5e8088396");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0e65d733-da1f-4a62-bdc8-34b8c6b15000");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ab6853e2-f466-4695-831b-b7c929afc906");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("8833e52f-ea3b-4512-88cc-b4408bf892fe");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("acc63aa3-0e5a-48c0-8d86-bf32b042c246");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7ce34f19-e38f-432f-b315-fd2b5ae5412a");
    _Verify_report_titlename_on_cover_pageFA6963.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("e694ff00-9819-43ff-80a0-077bb4d68d6a");
    _Verify_report_titlename_on_cover_pageFA6963.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("be7a304c-8803-4053-a7b6-5e27047bcf88");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("bda5e1b5-2756-43e8-81e7-9a94cbaa5ab4");
    _Verify_report_titlename_on_cover_pageFA6963.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("44d43b9e-f2ce-4702-b5cb-f79725efe6e6");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2e6b002e-8273-4380-83ba-ef1361d259c8");
    _Verify_report_titlename_on_cover_pageFA6963.Click__Test_Systems_Ltd_();
    

    TestModellerLogger.SetLastNodeGuid("9108d57d-8fd4-4a63-bace-8b191681e5bd");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("9d2be29e-fe93-42a4-903a-f0b5db8a081d");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Edit1();
    
    TestModellerLogger.SetLastNodeGuid("56b98aaf-7b2a-4624-ac03-eaef1d7f9538");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_ctl00cPHtbContainerTbGeneraltxtCompanyName("ABC LTD");
    

    TestModellerLogger.SetLastNodeGuid("8905b064-c9dd-4929-851b-5880a11f335b");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("582c6d34-875c-4d54-a634-d3cc3e216abc");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Adress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("9282e812-8245-44f8-a09a-aad2be6a1b78");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("b4b1ec9f-f468-47a9-adf7-f7f8aa3e3501");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("d979d8d3-c574-48a3-a523-085abc39366a");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("eac665dc-18cd-47a0-926f-bebbe6fac05f");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("59929e6c-968d-4193-85ab-b51af8a69cc1");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("8df1a015-d6b8-46b8-af9d-6d657f23bb65");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("edc07553-bed8-4388-a97b-99283a17d218");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("f3267e73-c46d-4f09-ba08-f64296ef0aa5");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("44ab4e87-795c-40f0-bbcf-65c4b0106789");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("dd7dbeb9-deff-44fd-a302-8a17cc2f16d1");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("45edb392-5492-4450-9f7d-1a485b022bb4");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Authentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("4084d7df-692f-4fc7-93d3-1de06af49ce2");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_CTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("a76e4cf0-e5ca-4f84-8b80-83040cd45f1a");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_CTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("52f34947-6185-4e19-8a28-43728f5282de");
    _Verify_report_titlename_on_cover_pageFA6963.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("70cd326f-c338-422f-b9f3-7e07b89e3e71");
    _Verify_report_titlename_on_cover_pageFA6963.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("60300799-79c9-4650-afaa-f0c327a51167");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address11(sData[29]);
    

    TestModellerLogger.SetLastNodeGuid("14310d2c-a920-4164-864d-0f12563ad976");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address12(sData[30]);
    

    TestModellerLogger.SetLastNodeGuid("67d1f434-edf7-4f5e-b4c0-e5259ed5f4aa");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address13(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("397589f8-ad15-44fb-a2b6-ddaa224f6d9f");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_Address14(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("6da71872-5b39-4b78-b164-2c7ef3e1aa69");
    _Verify_report_titlename_on_cover_pageFA6963.Enter_PostCode2(sData[43]);
    

    TestModellerLogger.SetLastNodeGuid("61f1af72-b8a3-4c7c-a491-3641d521150f");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("a83e9918-6649-435b-b6ea-5cbe6f4f30d9");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("4955b449-b3b6-4bd6-8c6e-51e13812ffe1");
    _Verify_report_titlename_on_cover_pageFA6963.Click_Full_Accounts();
    

    }

}
