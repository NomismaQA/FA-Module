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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/47162b3b-bcf8-48da-87ca-a467cf6e2596
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1444, profileId = 101318)
public class VerifydynamicfooterpagenationonCompanyInformationpageFA69456_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456","Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456 - Default Profile"})
    @TestModellerPath(guid = "7b45851a-e53b-4e49-858c-7ad8a77980da")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicfooterpagenationonCompanyInformationpageFA69456_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456 _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456 = new pages.Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456(driver);
    TestModellerLogger.SetLastNodeGuid("2ec3953c-dffc-4428-baee-3bdfcc47d3ec");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7aaa8ec9-e7d9-40a2-88ad-681dece00b7d");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2fbdc294-d941-4955-bbdb-4b9f220f99c7");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b603c2f8-9d55-48db-a6c2-77b13bc991c5");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("070b569c-534d-4756-9d80-7cf35847bfd9");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("65c56d7e-a217-4c8d-9506-821e3e7dff22");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c8f63fa7-ee73-4879-9ee9-371eeae73db3");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c5ae7bde-c263-4b8b-95fa-4a52997f7f05");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("082c363d-d44a-4796-afbd-8ec0676d7ce3");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e78809a1-b9f9-4689-a4e1-a76072571222");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("d31b9bb1-1a6e-436f-923c-22ec76ee2502");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e43c5c7c-5426-4103-91f1-fb31f738419f");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("67f791d5-6f2c-44e0-a502-51380c52c5db");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("8a58136b-1518-45f1-8005-8775a48a38f6");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("28f4d4ec-6953-4c8f-811a-c69dfc69825a");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("7957b6fd-0028-444d-8c15-ffe83b451840");
    _Verify_dynamic_footer_pagenation_on_Company_Information_pageFA69456.Click_Full_Accounts();
    

    }

}
