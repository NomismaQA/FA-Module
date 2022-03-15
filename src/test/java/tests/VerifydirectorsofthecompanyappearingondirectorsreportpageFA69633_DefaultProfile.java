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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4e54c565-fe65-4460-bdf9-92049322b1dc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1233, profileId = 101120)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69633_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633 - Default Profile"})
    @TestModellerPath(guid = "7c960e9c-73e5-49b7-a701-4c8b1111d951")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {

    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69633_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633(driver);
    TestModellerLogger.SetLastNodeGuid("37a2b94c-3218-494f-8e4e-d1a9114e0bba");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8d7cf001-70ce-434e-a8df-b246953e9f18");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("90098824-99fb-45f5-b75c-58b80909537c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d8db4559-1f7e-43c1-8eab-499c0c9215fd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("020dbc4b-e96a-4ad6-829d-f82a51a425e1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6623876b-4150-4442-9310-7f67802d775a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("89f3978e-470e-4a4c-96e6-7b96e1c47889");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("32d73069-9cd9-4830-91e0-94011447e114");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("134bbc3d-2719-42a7-b993-db6b0f47d301");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("7767bb68-72c8-46fb-89f4-ab75822eb59d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("afd8b742-70b2-485d-812d-e4dc326de1de");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("4c09670d-5d36-447c-a2d0-0e0e32306979");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("41d2f450-7b80-46a9-8078-18f6a2eac361");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("df3b1f55-cce4-4e5b-b545-65cadaea02e5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("86a5738a-64a4-4c5d-a588-39182b2d823a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("c917c3f8-bfd2-4803-90e1-e342de4bd9e5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("8af49564-c29a-407f-bfab-85349106eb60");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("552f793b-e051-4bcd-8a33-c84c95a785f8");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_FirstName("ABC1");
    

    TestModellerLogger.SetLastNodeGuid("f90cc00f-15b4-4446-9231-fffae3d4e545");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_LastName("XYZ1");
    

    TestModellerLogger.SetLastNodeGuid("f67ef520-d161-4312-953f-553bcb7c7305");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("c0cdbe15-c956-42b6-9805-63b523e50b95");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("b98318b3-ff61-4052-9919-d2baa1105da7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_DirectorJoiningDate("26/05/2020");
    

    TestModellerLogger.SetLastNodeGuid("1bc0526e-2c80-4f9b-9a94-11599b0b61a8");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_DirectorLeavingDate("31/12/2020");
    

    TestModellerLogger.SetLastNodeGuid("a4286422-4219-4754-abf5-ae7fb04f609a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("a20c6e4f-32ef-43c9-b4d3-76ec1606fd6d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("0024c116-1359-42eb-9c96-2b95d7a73d5c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("35e46c54-4a8d-426d-a29b-cc630eb8ec3c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("46226756-b0c8-457b-b0f3-80d79205875f");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("45d00cba-b56e-4c6b-8063-7f5894ef1421");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("c140c5c4-102e-4f94-8986-8cdc1b281407");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("0038da3b-e04c-4e73-9033-54818e2bcc4b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("041f18a7-531f-404d-9cc8-23027750cc01");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("af6d4e17-80f9-44e7-9165-a2eaa0d02d6b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("33eeef33-4465-4d02-af65-8e82391e51cd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("f40f9ad1-7ba4-4115-a0c4-a8737291e2db");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f13f6a2a-eb95-4d30-af74-7366698d557a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("52ab21b2-4a9a-4445-8f68-7d770a267a29");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("c87e4136-34a7-4959-be50-de3b3998d014");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("799a4952-d456-4624-aa5a-905e533cf8c6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69633.Click_Full_Accounts();
    

    }

}
