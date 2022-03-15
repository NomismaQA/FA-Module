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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/41fc6386-2615-453e-a5e2-aa1be82034d4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1442, profileId = 101316)
public class VerifythereportisacharteredaccountantonechangecontenttoAccountantsreportFA69448_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448","Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448 - Default Profile"})
    @TestModellerPath(guid = "d70abb8a-d08f-4440-8a80-5197cba416c4")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifythereportisacharteredaccountantonechangecontenttoAccountantsreportFA69448_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448 _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448 = new pages.Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448(driver);
    TestModellerLogger.SetLastNodeGuid("9407fd24-389a-4748-a40c-d1e238723ec7");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b68bc71b-d057-4c01-a75f-a52cbbe77f76");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("31ecd07f-9002-4cd0-9674-83222fc1310c");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ca847c2d-6589-4cf9-bd6d-134c876ab30b");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("35f513dd-88d0-4bf9-abc4-2cf4a7b13e40");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d35669a6-3692-44a0-8453-260f7e007a31");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("983f8f4e-b566-48e6-abb7-eb01aa94a0b5");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("782ea73d-d4c4-4bc2-ad50-d6f1bf404348");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a338c048-372b-4943-a5de-3f940af041fc");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("998a5e7b-b786-4cea-980f-41010fe6f70b");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f5aee8bb-5418-43a8-b94a-dbd3b2057acc");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("6a5531d5-6bbc-4d35-bcd5-c3cdb99d110e");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3b5c109a-5838-462f-b480-03ae6a909acb");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("1d3f1783-b5b6-4cbc-80e3-44f5295f3859");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("7fe8b039-2293-4f70-b8cd-cac4b447d05c");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("7a5dcfd7-3f67-4248-a82e-16b2f9184817");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("19c86d67-fbef-416f-8686-ed18c3e112c3");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("7d795c01-5b79-4d36-b627-676a965332dd");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("6f5226a1-a651-43ae-8a04-711463d297c5");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("60cc37c3-35ce-42f5-9675-6a02ed11f69d");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("5983d426-e59a-44b2-90c1-bb16374fa523");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("40bdeaab-2847-4bf5-8631-26b69e728f92");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("8c1b215b-60e5-44c5-9cd5-18f3f326d414");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Select_PageBreakAfterPageNumbersFrs102Short("1 - General Information");
    

    TestModellerLogger.SetLastNodeGuid("46168e29-2397-4e90-9865-8bfdce1e0979");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_ctl00cPHchkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("034fec4c-4aa9-492e-9af2-822cdb1b0431");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("ca4ecea1-1c63-4937-89ab-e46254449220");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3f481831-9f65-4f8d-94f0-9874fdc441ce");
    _Verify_the_report_is_a_chartered_accountant_one_change_content_to_Accountants_reportFA69448.Click_Full_Accounts();
    

    }

}
