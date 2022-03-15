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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8e0c4b44-6c7f-493c-ad01-8f7cb67ab97e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1177, profileId = 101066)
public class VerifydynamicpagenumberingoncontentspageFA69610_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_dynamic_page_numbering_on_contents_pageFA69610","Verify_dynamic_page_numbering_on_contents_pageFA69610 - Default Profile"})
    @TestModellerPath(guid = "947a7ca4-f3c3-44b3-9b7f-bf18e67218c6")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterSearchA() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicpagenumberingoncontentspageFA69610_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        pages.Verify_dynamic_page_numbering_on_contents_pageFA69610 _Verify_dynamic_page_numbering_on_contents_pageFA69610 = new pages.Verify_dynamic_page_numbering_on_contents_pageFA69610(driver);
    TestModellerLogger.SetLastNodeGuid("da4485ae-380b-4ae9-b653-54f821b7502d");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e14b9c37-4150-43bb-8573-c2cb498b47a4");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ad072d0-2cc4-49cd-9b43-5ce21507b4ed");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5507f8de-d623-41b2-a235-98e8d409219c");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("63d9edfa-f57d-4b0b-bc10-a4ad1614d08d");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("88125c5d-8c12-4f2c-b147-e995b555a164");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_SearchAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c94d9fd0-7d98-4721-b5c5-69c83648413b");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ec72fac0-abbc-43a7-98a1-37d05217a98e");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("16156524-4381-4feb-a6d0-af5ed636d1a4");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("ec3ea130-d5cb-4f51-a043-567ffb134fa4");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6e21b151-43a5-43ff-9a86-ebeedf60d591");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("1b985e5c-d22f-4836-aa89-8903a692ffd1");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2b740544-c7d5-4536-8e84-c14ca97e762b");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("4e17f2e4-ad0b-4b7c-8e57-2957879025e4");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("60caef23-9c9b-46e5-a8ba-9cab22f50b40");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("22d5fd75-3b15-4762-bc68-439e24c3522d");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("85e18087-a792-47d8-83f6-a608a3d00993");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("8d39ed55-bac1-4afa-837c-b7395646914f");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("c5d17722-c524-4fa9-a266-ce145a389dc0");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Authenticationcode(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("7977319f-2a88-4f9c-8def-d64c7d71d007");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_CTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("a0ea98ca-ffe4-4a72-958e-7bcab0e2ce14");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_CT_UTR(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("6a2f9df6-680c-4b22-8b2b-afa5a8018894");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("c6eb1818-a4bd-4a85-8b68-4d564e6b6fdc");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("52d3568c-4873-432f-a88c-9511921e8175");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("aa5ea6b8-cb5a-451d-91fc-fe1b258c8030");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("729e22ed-15fe-49e5-85fe-dc5bf019c6fd");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("e672083c-9b39-43a1-835d-83d2147b8d3c");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("8d7f500b-226b-4470-85a2-f7e9bf24a66e");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("7a3c7061-7616-4926-998c-8cd7c09e675c");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("fc3b3a92-484d-42ac-a4ea-39894d22bc39");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("3155b27c-d9c9-4ff8-8c81-f50b592fb821");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5bbec760-d244-4c9e-9178-2ec854d8c85e");
    _Verify_dynamic_page_numbering_on_contents_pageFA69610.Click_Full_Accounts();
    

    }

}
