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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47e82757-1651-4498-a0bb-b6b56bc74e8a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1381, profileId = 101248)
public class VerifyheaderappearanceondirectorsreportpageFA69723_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_directors_report_pageFA69723","Verify_header_appearance_on_directors_report_pageFA69723 - Default Profile"})
    @TestModellerPath(guid = "6fd2780b-bd7a-40e3-a224-4b9ce9e20c60")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceondirectorsreportpageFA69723_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_header_appearance_on_directors_report_pageFA69723 _Verify_header_appearance_on_directors_report_pageFA69723 = new pages.Verify_header_appearance_on_directors_report_pageFA69723(driver);
    TestModellerLogger.SetLastNodeGuid("040b0259-23c1-4531-9124-25049cfc2342");
    _Verify_header_appearance_on_directors_report_pageFA69723.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c1f2195c-ddf4-43d1-b2c3-c3b245bc03c8");
    _Verify_header_appearance_on_directors_report_pageFA69723.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e250b39-a289-4c05-88e0-f70e82cae3a0");
    _Verify_header_appearance_on_directors_report_pageFA69723.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("84773149-a0bf-485d-ad48-c9c29b0fce88");
    _Verify_header_appearance_on_directors_report_pageFA69723.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("2b33f2e4-bf7f-46ad-a3d7-bd429cad2412");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d2b3150c-d4f9-473e-8c84-f08e4841a8cf");
    _Verify_header_appearance_on_directors_report_pageFA69723.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c67e63e2-5c3b-4758-9309-b47867a6ab8e");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a7542f96-91ee-4ddc-a5a3-0c7decb787ea");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("5085bb47-cbe7-470a-8399-67c3f052ba99");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("7c329de4-6a37-4041-be83-471fb0ab4579");
    _Verify_header_appearance_on_directors_report_pageFA69723.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("8d469e74-7bdf-40af-b751-9b6a72d01507");
    _Verify_header_appearance_on_directors_report_pageFA69723.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("9b910542-3b11-4b1c-8869-9bbac4fd3739");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("62045085-159a-4d1f-b177-91793cc49f57");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("c1c7948f-a2ab-421b-bc6e-824acf9f9761");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("576fec53-ced9-4c1f-9a1b-74ac55e9b2a8");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("92bcc214-b646-40ab-8df5-034fee7db1b3");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("35ddbe55-c231-4633-a1ab-ecbfbda8cfc8");
    _Verify_header_appearance_on_directors_report_pageFA69723.Enter_CompanySecretary("Name1");
    

    TestModellerLogger.SetLastNodeGuid("24956ddc-7ec4-4125-8830-d6e58c33bfef");
    _Verify_header_appearance_on_directors_report_pageFA69723.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("4ffc7f6a-16a3-4d8e-bf99-0bb1fe07d2ea");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("68bf012a-1ffb-410c-9b7f-31e95728f80f");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("e844d761-27c0-4aa2-950a-387b78745559");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("22049ccc-5635-410b-8b95-662cb25acd1d");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ecfa2ba6-cda2-4ea4-b739-a07e3d12c62a");
    _Verify_header_appearance_on_directors_report_pageFA69723.Click_Filleted_Accounts();
    

    }

}
