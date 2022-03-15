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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fa83860e-c137-4a41-8807-a24137934395
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1232, profileId = 101119)
public class VerifydirectorsofthecompanyappearingondirectorreportpageFA69632_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_director_report_pageFA69632","Verify_directors_of_the_company_appearing_on_director_report_pageFA69632 - Default Profile"})
    @TestModellerPath(guid = "985c52d6-3b5c-4f46-800d-e28cccee7311")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorreportpageFA69632_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_directors_of_the_company_appearing_on_director_report_pageFA69632 _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632 = new pages.Verify_directors_of_the_company_appearing_on_director_report_pageFA69632(driver);
    TestModellerLogger.SetLastNodeGuid("23d87025-566f-4b2a-b7bf-41fcb50779b3");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("27a77ee3-2cec-4761-a52c-be3cae506354");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("31411ddd-e3e0-4eda-848a-f81f700d3376");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4479a378-7043-452c-841f-a4305233aad7");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9e7d3d3c-097e-40fc-8d42-6cb3c485b016");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43a5cff0-dfa1-43e9-bf89-25a207bae2d5");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("f8fc9580-18ae-48cd-b224-699d643cdb7d");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("541b4282-469a-42de-bd85-c9fb1e43fbe8");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("08128f62-4ffd-4097-8980-0e52bd8e8c68");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("604d0606-291f-4b0c-8b97-59ae1742066d");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0597e95e-6cce-41e9-b2a8-316b8b003370");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("2855476a-f3f2-4812-a9dd-33f9aef5d7f9");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("98b8ffcf-34ea-4141-a228-895285834265");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7b9d6ed5-e64b-429a-9c45-8f4f89c05d1f");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("1bdab9a4-0da8-472c-b6fd-d26ad0667a2e");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("25aa37e3-35b1-427e-b614-05acb02fc8c9");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("009e423d-64de-4fd5-b91f-593aeb207eac");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("b033e66c-c5a0-448b-96b3-8fb6104c6092");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_FirstName("ABC2");
    

    TestModellerLogger.SetLastNodeGuid("4c2ab14b-a8f4-4886-969e-5c012421e9b0");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_LastName("XYZ2");
    

    TestModellerLogger.SetLastNodeGuid("2c4021f4-6089-4225-a449-0dcccfeb0caf");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("2838038b-be75-4337-bacc-34f27dcbe1ba");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("3b228008-360e-4b3c-af01-7e26fbf7a4e6");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_DirectorJoiningDate("21/05/2020");
    

    TestModellerLogger.SetLastNodeGuid("30f8878c-ca64-4235-be27-83f3b70a0b1e");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_DirectorLeavingDate("31/12/2020");
    

    TestModellerLogger.SetLastNodeGuid("8f3e6872-3cee-4f1e-b8a0-5b6a967abef8");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("8c3c04d5-4df1-48b7-bd8c-04e18780e8d4");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("14303622-6408-47b3-97a7-1c21c444a947");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("3de1c317-a06a-4b00-91c5-029694242bd3");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("94cf86e0-95a4-4b1f-931e-17d31ee76e85");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("d6fd3ba9-a943-469f-802e-5c4d0e5df2cf");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("b564306c-9b71-492b-aa62-93346af1571c");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("be277bc4-9a8e-43ae-b422-d627176cd329");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("bfcb115b-b445-4d1f-ba2d-30d703d76d27");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b0ac7881-fb84-4bfb-9ff6-0e5d2d9833a7");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("f437ad84-ea98-4185-80af-abd7cfe563fc");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("ba0554b5-6af3-43f0-92f6-50847cff830f");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("8b8e5d45-f16d-4d76-9b7b-886fd488ba9b");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("693ea75e-dc06-40ed-9315-9c3d5a84a8e9");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("a0162c41-bc45-4a01-beb2-37c0d3a771b9");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("9ddba196-ea81-4809-90d6-0ac4f80abfeb");
    _Verify_directors_of_the_company_appearing_on_director_report_pageFA69632.Click_Full_Accounts();
    

    }

}
