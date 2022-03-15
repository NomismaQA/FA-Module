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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8fe7bfa3-5d9a-4944-bcd6-061f6160a450
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1420, profileId = 101288)
public class VerifyItemsunderDirectorReportinReportSettingstabsforLimitedcompanyFA69429_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429","Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429 - Default Profile"})
    @TestModellerPath(guid = "ca0245aa-3ab3-4f5a-9bd0-4487530e21b5")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyItemsunderDirectorReportinReportSettingstabsforLimitedcompanyFA69429_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429 _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429 = new pages.Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429(driver);
    TestModellerLogger.SetLastNodeGuid("f61f6364-7242-4ba3-8104-f33de1faf670");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4cd4cc0a-924d-4dea-abb3-d6772f29e7f2");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("12e37656-f0e7-4430-8f3f-ff50005dae6e");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ce09c41e-2cf7-4f1f-8380-07b8878793a5");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8f2fa26a-6460-438f-b3f9-d759f0f8f1dd");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("89a36874-5284-4d2a-a836-fbb0f11116aa");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a938d901-ca82-47ee-b6ae-29bcdcf14c8e");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("caa976e0-9b77-420d-bff3-c64f557460ae");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("617dd9a4-2cab-4244-94a2-f439ce694a96");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("349303e2-db6e-42f3-b2a1-7880de6e202c");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c7d901bb-dc0a-46b4-9495-563b84225015");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("1d47e7ac-a131-4f29-aeab-f39594cdd844");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2d454786-1a63-469d-b43f-851f327ab77d");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("241b3c08-e603-40dd-bbbe-732ba54e6b03");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("80313c82-715e-4ed7-9e46-4c7d8b782ca8");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("4e383450-67a6-43ba-82ff-8c15d28798f4");
    _Verify_Items_under_Director_Report_in_Report_Settings_tabs_for_Limited_companyFA69429.Click_Full_Accounts();
    

    }

}
