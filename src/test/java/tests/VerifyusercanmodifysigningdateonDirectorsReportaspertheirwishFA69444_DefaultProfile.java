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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7bf5eb22-101d-4d68-9f9d-8a223bb60d14
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1437, profileId = 101312)
public class VerifyusercanmodifysigningdateonDirectorsReportaspertheirwishFA69444_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444","Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444 - Default Profile"})
    @TestModellerPath(guid = "507b76ea-a182-4bb2-8b3e-275757ba30f8")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanmodifysigningdateonDirectorsReportaspertheirwishFA69444_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444 _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444 = new pages.Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444(driver);
    TestModellerLogger.SetLastNodeGuid("5be7d3f0-bf80-43e9-bff1-70d5fdca76ef");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bcb6e19c-0f03-46e2-b6c5-60eb75a7e8a0");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4248207f-a548-45d7-99df-0eb8d842222f");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ad6453fb-4beb-46a2-8647-420713bb28b1");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("93b11d03-51c4-4241-8834-9fcac4ceb9a5");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4ba72ae7-eb09-4477-9b8f-993d41161e51");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8b14142f-7db2-422c-9703-664469ba4bd4");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2f4caf8b-52ed-4e35-8850-39c96fa0b9a0");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1815b032-24d2-4791-ac1d-19ca6d006985");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("3203892d-42f0-4a2e-9e63-b72d07971e20");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("53c25273-05fc-408e-9fc7-776aec10edc1");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("ff6f1cc0-a57c-4639-b0bb-d3a5aaa26581");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("65c211d2-efa6-4ead-b3a7-d69633d92f9d");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("1a68cd28-8559-4b5e-b224-d7a089472f7f");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("27b21bcf-72a0-4412-8625-6ff86f16390c");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("5a98a207-fede-4359-864d-bc0d7082bc48");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("59466cfc-f815-4af8-8a6c-03fb272945e9");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("b5eff1a9-158e-428b-a44d-e3f5867026e1");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("7b782454-bb83-4f91-9915-83830a5e22c7");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("182a87b7-835e-4e14-87d0-fede7b1f39a1");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("3edd1b1b-8b28-43ed-88f4-583f8577dd22");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("a0781450-a790-455a-92d3-6ba5f3621de2");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_CharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("805cba69-fa80-4d88-9ea9-2d3d5ab4b731");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("188ce758-e337-4427-b31f-f776be3b5199");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("26215fb4-3870-47ca-80c3-862c3cf3772f");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0b32dfad-251d-4f95-b343-e5a20a5243d7");
    _Verify_user_can_modify_signing_date_on_Directors_Report_as_per_their_wishFA69444.Click_Full_Accounts();
    

    }

}
