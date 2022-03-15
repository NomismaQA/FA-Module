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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/523fe025-1f0e-43a4-b471-c94eda0cdf96
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1121, profileId = 101016)
public class Verifyheaderappearanceonstatementoffinancialpositionpage23_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_statement_of_financial_position_page23","Verify_header_appearance_on_statement_of_financial_position_page23 - Default Profile"})
    @TestModellerPath(guid = "0c2a436e-764a-4d44-b606-8b6e8816de73")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyheaderappearanceonstatementoffinancialpositionpage23_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_header_appearance_on_statement_of_financial_position_page23 _Verify_header_appearance_on_statement_of_financial_position_page23 = new pages.Verify_header_appearance_on_statement_of_financial_position_page23(driver);
    TestModellerLogger.SetLastNodeGuid("a3f2ef1d-c8e4-4b64-90b6-a4421f3190dc");
    _Verify_header_appearance_on_statement_of_financial_position_page23.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d720cfef-3d91-4185-bddd-f93df2a45cd1");
    _Verify_header_appearance_on_statement_of_financial_position_page23.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a65565f1-77e9-472f-8cee-812bee0e4410");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b58164b2-1ffa-4a15-8846-c5f8e2beea33");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("74ff2f06-9bc3-4ac7-8c59-ff5116b72083");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f99f4d95-d3a1-4ec4-9250-5f696d42f217");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("fef80122-cce4-4b92-9e26-26728e136c93");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b1b5baf5-7b7d-4e2c-bee5-3b6a53d0b07a");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("467b86ed-e215-4a7e-bb56-b93854c6e246");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("fd7a0bb9-4ad5-4943-ae55-421f5e0353a0");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("d67e88d5-f10a-4533-b294-6a7f2eed44ba");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("3b0d7227-b963-4e9d-a960-590c26d920b6");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e853f828-eb1c-41d8-80d2-06f9fa729800");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("98b44602-2bbd-46ec-bdab-92034a30d3ce");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("440876df-230b-4b10-9dec-21b3855c138b");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("31f58d9c-2ed3-4b80-828c-8d25e84b2114");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("aba40d01-721e-4ed4-a0be-640256088a42");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("4c80c10d-5385-4f11-893b-8bc8a8be41ff");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("b2c8332d-405f-49ae-b340-6116d444015c");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("95cc5649-cf7a-41f8-a80b-2b49a399d894");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("123f519a-6744-4055-960f-c7706b6f41b1");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("4c3edbe5-6a7f-4151-971e-112f32a7dd15");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("507149c0-eee9-4dc4-82c0-9b8e98989791");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("8d8fd390-75bd-40bb-8716-876edf3724fb");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("6dc00912-cc38-4b4a-9420-dbbcd2d271a5");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("e85e4ae2-047f-4ef6-9d2a-7ef8d6c01b32");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("e544637a-e4d5-4e28-8a10-9db810f47f98");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("e9b12ba7-a5c4-4dd9-9cab-9a98276a4037");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("624c32f7-7a1a-49e9-b780-d1d53463a42a");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("f6abd81e-ef6b-4563-8d44-34f0e7f6ae32");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("26da9847-1658-4d11-b3ed-330d69e5f762");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("f77541f0-e32e-4c63-b842-f13ddf6dbfae");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("4616a29f-5b75-4bc0-ad28-7d47d74c1a24");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("b8eea1d3-f1e4-4bfe-bf34-9b17f9493682");
    _Verify_header_appearance_on_statement_of_financial_position_page23.Click_Partnership_Information();
    

    }

}
