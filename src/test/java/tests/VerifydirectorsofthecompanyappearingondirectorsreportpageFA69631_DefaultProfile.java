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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/04faa915-ed88-4980-bfac-5f9079a35cf8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1230, profileId = 101115)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69631_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631 - Default Profile"})
    @TestModellerPath(guid = "f5f1efc7-6687-4986-b74b-1d82f2f3f19f")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69631_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631(driver);
    TestModellerLogger.SetLastNodeGuid("c15ab6a0-0ebb-4538-a5b8-7e230e782d75");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("060811b6-d552-4c24-be18-26ebf28e71dd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e28876ef-9c7a-429a-bf3d-9a873e09536c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2837a1f4-32ca-43ad-8d15-5f922de8824a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("7cb1949d-ca2e-4e9c-b9cd-119572de4c57");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("eaf05e6b-4f87-4464-9112-dce6ca43b715");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2b9c8106-8327-4efc-abb7-04ab4831323a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("bf1c892c-70a3-4959-85de-f68f86d5d53b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("5f0cf032-eaa2-463c-8a8b-b3406f2f2ca9");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("60b54097-7f36-40f1-950c-587f54b1c5ba");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("9f973e14-b5ad-49ba-91a9-142141aeac23");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("80c1d2c5-dd6e-461d-bb74-def589e2be5b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("222e36a3-9f3c-49af-bb53-02287731ee6d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a8d8c4fe-a0a5-451d-8ef7-256ffbdd0e7a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("3e04c8e3-7d3d-4a11-b320-1223c9f9ccb6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("3b0e973d-dfb4-415f-a008-e9681f2da17c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5643d2b8-69ba-462c-861a-ca7443bfb370");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("67dc3051-2a4a-46ff-a419-67b4545db0f3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_FirstName("ABC1");
    

    TestModellerLogger.SetLastNodeGuid("63227184-4c02-478c-97c2-c8681ae1a24f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_LastName("XYZ2");
    

    TestModellerLogger.SetLastNodeGuid("887c8558-39a1-491f-b06c-dbc36fd264d3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("56a55175-c214-4f70-ae81-2d964d3aa2a1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("579c8805-dbf2-44dc-b8c6-a2f8c771075d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_DirectorJoiningDate("01/08/2020");
    

    TestModellerLogger.SetLastNodeGuid("4d97e8a8-8fb7-4bd9-ad44-6ce95ce67def");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_DirectorLeavingDate("31/12/2020");
    

    TestModellerLogger.SetLastNodeGuid("bfa0df2e-aca0-443a-a070-a3000e8c8301");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("d4460346-7d89-414e-850d-886dbb89b07a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("b776b183-1c13-4f45-927c-f904ba5daced");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("80ffedc1-81b6-4a00-808e-6010174d4988");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("d4e48940-a500-4e8f-b5d3-8e58b9b4b150");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("e95a8a7a-05a8-41cb-94b9-508cb00f1e81");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("5302aa4e-dd40-4817-90b5-569a1471b046");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ea619b78-b7f8-4e39-ab1a-0773d2f0c506");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("9b5aa962-a21c-4d9d-994b-3dff3e3144be");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("94f3ed59-18ca-491e-a48f-9b5e0400184b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("b6a889ec-17b9-42c9-a58e-4bf632ef7410");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("f4dde3f7-22f5-450b-aaf7-f21d84e76bca");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("b00c39c3-988d-4cd3-8d2e-0054f4cdd7c4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("7fa0b025-55da-4776-96e1-48e7fa664a9d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("69d61f21-7867-4495-9ee0-6e1d3b562a4f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f1cc2e40-e0db-464b-8f27-6ece9c2f1d20");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69631.Click_Full_Accounts();
    

    }

}
