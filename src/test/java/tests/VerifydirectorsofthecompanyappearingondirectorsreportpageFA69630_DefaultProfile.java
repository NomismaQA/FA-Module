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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8f3c16b2-810c-4262-a094-0930d1349a43
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1228, profileId = 101111)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69630_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630 - Default Profile"})
    @TestModellerPath(guid = "e858492c-3801-45d8-ac72-20ac31edcb14")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69630_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630(driver);
    TestModellerLogger.SetLastNodeGuid("289f6b12-9e3c-4665-b41c-56eca86d5d63");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c16ca611-55b7-4d3c-b5ef-893e155d2bd0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f105da9b-ff04-4421-86ad-3fedc1c58582");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("8e374938-b41a-4da0-97b0-0ea4f053acab");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("473a6b6c-73b4-4e96-8e1d-09564f4150b4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2792ef28-be42-42c3-b7a1-14ecf9d6365e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("bd9d1997-a497-49f4-a365-37c5dd027489");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("80c4c2db-616a-4486-9ded-cb9107b4b6d4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("9828f2bd-bf1f-489f-90d3-442c9a33177e");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("75302fe3-1a85-4d11-8b20-aae304b06940");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("886723ae-a91f-4539-a508-7b78ca56b313");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d67efa7e-3eb1-4e09-ac4b-8e8274b45aed");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a48727c6-ef07-4b23-ad75-731e8daeb61c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("4f117196-c7f0-4024-ba9d-3899e3d238f1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("06949d4d-e9f7-4668-8cd3-424a05d286a2");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("24b801ef-3d5a-41b8-9677-f5acbfa9d709");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("c1568b17-631a-4bb6-b280-ad551190d75d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("54ebab40-ec5c-4b67-8f97-9fdbc0a95c7b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_FirstName("ABC2");
    

    TestModellerLogger.SetLastNodeGuid("dd157af6-f74b-4404-bf03-ac4787cc6c9b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_LastName("XYZ2");
    

    TestModellerLogger.SetLastNodeGuid("25057bfb-49f1-40a8-afc1-4ea976c2bf6a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("f0706daa-b56e-4625-9487-91fe13646c69");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("08b896b1-12fb-4b36-8804-275ae2dc1dc0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_DirectorJoiningDate("01/07/2020");
    

    TestModellerLogger.SetLastNodeGuid("07a0508c-f9a3-42d8-ad1f-37a99ebe3953");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_DirectorLeavingDate("31/01/2021");
    

    TestModellerLogger.SetLastNodeGuid("f52a2ea2-12f2-4fb7-bfc6-0d463e8e5e0f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("f6099ff1-acb9-46ae-b298-cb62d23be512");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("3fd8df0c-0c9f-4781-b097-4a79000225e5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("c5f842cd-16bd-4be5-96d2-dd20eacf106d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("9512baf3-fd89-4b44-b914-eebe9654080b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("e3267abe-a183-4d04-8d1f-0cb9b00fa830");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("02fe96a5-b7fc-4519-8b0a-4acd89342690");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("91d27e7e-5bb0-41e1-aa3a-b433e556af33");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("cdeb50c8-6dc8-476d-84a8-94ca2bc38a4a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("2ce04112-7cb2-4bf5-b79a-f096aff44af0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("90f62c8e-ea57-4827-8f05-47d19c6451b3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("58aa3eb1-50f1-4dc1-9734-447d167a8a18");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("e1b03a8d-549e-4e82-8065-8b8927a8ebfd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("0f807fad-6b2b-43c9-9579-0b2d5420f961");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("7d846c45-b3b5-49dc-b812-c0ece1d44cbd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("86593820-c300-4b51-8e65-fbe633453f04");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69630.Click_Full_Accounts();
    

    }

}
