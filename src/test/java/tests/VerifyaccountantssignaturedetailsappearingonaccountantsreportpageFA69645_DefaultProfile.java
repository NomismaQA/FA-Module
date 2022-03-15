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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0de59916-c680-443b-9421-932a05032897
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1295, profileId = 101166)
public class VerifyaccountantssignaturedetailsappearingonaccountantsreportpageFA69645_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645","Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645 - Default Profile"})
    @TestModellerPath(guid = "518958c3-1b44-4dd4-bb1a-8f2591777b4c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyaccountantssignaturedetailsappearingonaccountantsreportpageFA69645_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645 _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645 = new pages.Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645(driver);
    TestModellerLogger.SetLastNodeGuid("195e4c96-803e-49e2-9721-0e49a590a50d");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b48d6766-255c-4c33-8dce-8ff771e7088d");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7aded3c1-9f4d-4e20-8a11-30e3614db530");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("eedae394-d1ed-45c5-8d7c-0fb36844a262");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("91f0cb2a-bc24-47af-89cf-e365d283d134");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("8f993bd3-ac77-4903-99f1-b3c168015465");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("bd0629ab-f7eb-4623-a315-5b8f3a637c17");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("0bacbcc6-505f-4e18-9a02-c41ec8099f52");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("9e4d84f9-7328-4d9f-bb41-2914928568b9");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("536b2aeb-d48b-4d5a-93e1-d9aa35a37c1e");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1a9b72cd-c57f-4df7-8e79-274ee6480365");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d61f222b-be9c-41ef-91e6-9e9265e05f57");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("c32e39e1-cab0-4fb4-83f2-e5c7fa2594b9");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("52614f49-40cc-4d58-8f3b-42e424efb332");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("26d0ca4c-ff75-4542-9338-37f2bdc297eb");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("6b43ff9e-46e1-4bc8-95a7-bc45a1e085f0");
    _Verify_accountants_signature_details_appearing_on_accountants_report_pageFA69645.Click_Full_Accounts();
    

    }

}
