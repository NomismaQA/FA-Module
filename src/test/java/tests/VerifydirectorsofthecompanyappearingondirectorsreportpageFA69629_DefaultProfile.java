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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2361a8d7-5df8-4ecb-a408-252350533169
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1226, profileId = 101105)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69629_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629 - Default Profile"})
    @TestModellerPath(guid = "009e5cbe-12ee-40de-b663-b5f8908d2a24")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69629_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629(driver);
    TestModellerLogger.SetLastNodeGuid("21521c19-87d6-48fe-be38-685bb3d35e0c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7e5bce4d-d143-4ce7-aff6-b413f12428c5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f5ad4ce2-7acd-4473-b22b-5d3d4a39e73c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f26088f4-480a-4ffd-a321-0eee0ec052d3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("1e0f73fe-6553-425b-9a07-82543030feeb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6a986895-740a-4987-ab24-5310d2b87992");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ed0b1f90-69b0-40f4-b825-00cf0d5d2579");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8bdc3acf-ffff-40f2-9775-5152975d85f1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b2db8878-868b-4ecb-8844-c4914d6040cb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a72d0ca1-ee8a-40fe-b0b0-1cf4a93f9c6d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("8bc4f484-7d5d-4026-8be4-becc7ed7ff20");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("6c72fa10-6998-4283-bd5b-6df2964f8355");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3690bd2f-7654-4dcb-8939-82d8f2c7f1ea");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("874b717a-cceb-45b5-a0df-a2bae19e8649");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("b6c52e71-a8fb-4b46-9476-3b760930361b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("bff39040-0821-4bda-bb51-670451055b2b");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("367a2a6c-301f-4fdf-9d0e-d44725af6941");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("421a2f2e-2390-4fcf-8c8e-41ee4cee3e7c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_FirstName("XYZ1");
    

    TestModellerLogger.SetLastNodeGuid("cf348143-4e75-4524-95bf-47e8d9e617b3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_LastName("ABC1");
    

    TestModellerLogger.SetLastNodeGuid("9a311107-401d-4d02-8742-5e9185bed2df");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("9ed4ad9d-1307-4aa0-b237-07751ef7a1d1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("63e91617-5106-4b6b-9c91-1497819c1eb3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_DirectorJoiningDate("01/05/2020");
    

    TestModellerLogger.SetLastNodeGuid("66b735f2-2863-4084-81b3-36ed646944e3");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("412fd4d9-7b9b-4b3e-ba84-2dfe71e5c39d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("f037fe47-6352-4c5c-90f5-1fc675626b5a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("a035e206-f2de-4200-b9c6-c2e001df12b6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("689ffe2b-77a5-4d0e-895b-b30c90e4999a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("42b66fda-45d3-44f3-8ba6-8db2d4d150c4");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("d85d0cc9-bf0a-4849-ada2-8d3aa29d77a5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("cbbb4042-e559-4be2-8923-153ed0f11d4d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("9929bb18-f5a4-447d-9f9f-5cab313fa988");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("87f240ab-a00a-4658-9ce1-70d18f2602e0");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("7d1f4700-ed92-44a7-b0d4-45642e8b28af");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("ac7f089d-c8b6-41cb-aa9d-2a91e941eb66");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("706efc03-597d-44e3-b56b-df3f08227ab5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("4409bf69-a958-43e0-81af-15c043adf922");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("7aa51a4a-0c29-4e8e-8ef5-9baa1253dabe");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("947ef8ae-6546-4e5b-9dca-f373a6a1605a");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69629.Click_Full_Accounts();
    

    }

}
