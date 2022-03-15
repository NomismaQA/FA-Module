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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e7a3f5ec-0e7f-4e68-87c1-73ff82b79329
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1292, profileId = 101163)
public class VerifyheaderappearanceonaccountantsreportpageFA69642_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_accountants_report_pageFA69642","Verify_header_appearance_on_accountants_report_pageFA69642 - Default Profile"})
    @TestModellerPath(guid = "c1585aa3-cee5-4a69-b158-78be664b4cc6")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonaccountantsreportpageFA69642_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_header_appearance_on_accountants_report_pageFA69642 _Verify_header_appearance_on_accountants_report_pageFA69642 = new pages.Verify_header_appearance_on_accountants_report_pageFA69642(driver);
    TestModellerLogger.SetLastNodeGuid("b3b38d83-7c3a-4166-9233-4f3c3a5fc4f6");
    _Verify_header_appearance_on_accountants_report_pageFA69642.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("29994f31-9ea5-4a9a-9c7a-5888437a6876");
    _Verify_header_appearance_on_accountants_report_pageFA69642.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a44e8c58-ef29-40e3-9a2a-36d14135afe9");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5b76bd6c-724c-4d19-95b2-9f51b320262c");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("2a30ec9b-eb00-41fb-998c-ade19c206fe3");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0a71b746-e0af-467c-81cf-600b73f5410e");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2a3c0a9f-39ca-44b3-9812-e482291802e5");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ba83d13c-c065-49c7-92ca-a41686a90893");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("acb1ca4c-7aab-408b-9d1e-efaf1ae49a8e");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("3bfca027-93c2-470e-b97f-2d3f48129a12");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("5de8d6a2-0a5f-4612-91ea-682cc9bcfe02");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("ec65052c-aef9-4913-9580-9a512c92c59c");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a49bb56a-0217-4d23-aae1-61c58cfddc10");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("d6eb6edd-fb1e-4e30-b846-d11372f1da4b");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("a8b0d3b9-701b-4a13-a48e-e7a40787724b");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ab143268-47a0-4599-a49c-c207595a3020");
    _Verify_header_appearance_on_accountants_report_pageFA69642.Click_Full_Accounts();
    

    }

}
