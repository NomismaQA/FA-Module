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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ecad70e9-1549-42c7-8f0a-55f9e442fa34
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1356, profileId = 101223)
public class VerifyregistrationnumberappearingonCompanyInformationpageFA69713_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_Company_Information_pageFA69713","Verify_registration_number_appearing_on_Company_Information_pageFA69713 - Default Profile"})
    @TestModellerPath(guid = "c858eda7-e069-411c-90fe-ed79afc0a53b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberappearingonCompanyInformationpageFA69713_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_appearing_on_Company_Information_pageFA69713 _Verify_registration_number_appearing_on_Company_Information_pageFA69713 = new pages.Verify_registration_number_appearing_on_Company_Information_pageFA69713(driver);
    TestModellerLogger.SetLastNodeGuid("2a21771a-d2e6-485d-ba5f-3fa7afb4aa74");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c985057-9419-473e-8949-cae01bb00d0c");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("57231b03-f0a3-4e4e-90f4-b33fcac49913");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("9378bc07-deb0-472b-94ad-7d209935454a");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("3e21e76e-a354-4fb1-8cfc-a7a2bbcd32fc");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("5963b483-edf0-4473-9f8b-9fd5f3ef5d21");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("269a80d9-d86d-4972-b480-be1fbc87d4de");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b2ad06df-a1de-453e-ac68-c6b4a01eab90");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1c618fca-7796-470e-b7cc-fde3a1b722ef");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("cf1e9915-a9c2-4418-86df-0be0c1e0985c");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("7c377fdb-71f7-4d29-9677-eb4b0d7a9ef1");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("7e50085d-d554-47ec-8088-b2d358481de4");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Search_button2();
    
    TestModellerLogger.SetLastNodeGuid("04d54aaa-e2ca-41cf-a3d5-c665d8382c46");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click__ABC_LTD_();

    TestModellerLogger.SetLastNodeGuid("473e8505-4427-4459-ba5c-aa945ad244ff");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("baf644c0-d39b-4197-a983-7ac47bbcf6e8");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("2a32d3a7-2658-4dd3-96f7-5373060d923c");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a5fa1a96-19c5-43c6-9969-59ae16bb1cd2");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a58e1921-69f8-4d79-b087-ba44de26d9bd");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("5e0d1770-081d-4ec4-a80b-73c72fad6d76");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("24e57900-b36f-43f4-af8a-646cb99b0e4a");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("4ac79aca-4e10-4bf2-94c7-b9eca1b5791c");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("c57d3f46-1da3-4e5b-86d0-995cfea46bf1");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("e28943d6-e779-4263-abb7-36205037e88b");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("333a94b1-93ab-4d2b-af00-a970941a282f");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69713.Click_Filleted_Accounts();
    

    }

}
