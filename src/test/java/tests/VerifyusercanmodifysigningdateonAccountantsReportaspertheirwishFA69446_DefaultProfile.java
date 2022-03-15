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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/239ae92b-9770-4c22-a351-67165b3e8078
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1440, profileId = 101314)
public class VerifyusercanmodifysigningdateonAccountantsReportaspertheirwishFA69446_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446","Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446 - Default Profile"})
    @TestModellerPath(guid = "d78e2033-224d-483b-9791-6ab1af6e5d50")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifytitlereport_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446 _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446 = new pages.Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446(driver);
    TestModellerLogger.SetLastNodeGuid("08abadac-02f1-4909-b243-be6946dc0336");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4e17f6bf-b6b0-4845-945e-772dfb1f8af7");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3644b3b0-0edd-49f2-8615-4ae6a7d9ad58");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("06627f33-a49c-4b1f-a01b-53ef7894b248");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b841eb7a-f25d-49c7-943d-a6f4b9653539");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ee2dcfa0-2046-4b01-b83f-b9015c2fb097");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5c2735c4-9789-4c9a-a92d-566cf1bc5d7a");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("e689f1c1-b8fb-4e4b-adf1-09438e8640f7");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("45c05cde-1170-482a-8708-40bcfd3da96a");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d4845380-2fa3-488f-b4c2-54db7c911242");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("712667da-fa0e-451d-b32a-34834e9975be");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("bc9d87c7-3ca3-4103-b5a0-b69003ecb054");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("70c29043-3d9f-4cae-9206-aac871fa80b7");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7374dee3-e1d6-4a01-89f0-f245c3f6c431");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ced4e542-aa2c-45ea-94c3-442633c3e473");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("22f2d8bd-abfd-4db3-b6a2-3de2bf57c309");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("dd4f2406-cac5-49ed-9ae3-9661611076f1");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a40363cb-76f6-4bac-afd0-7ce67d698c71");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("8b0182c1-7006-42f0-ba95-8c30f9b613aa");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("fe54f3cd-b223-4376-9707-fdf8ccb2ccb7");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("1e168b60-ab66-45e8-8328-3e2ab6c5501f");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("e84f8997-6fa2-4b3a-b7a2-a402eff417f1");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("926d3e0f-6599-4356-a504-377ce5d2b860");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Select_PageBreakAfterPageNumbersFrs102Short("1 - General Information");
    

    TestModellerLogger.SetLastNodeGuid("80ae0bb4-2cb8-4d2e-923f-d1a9a1e84eeb");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_ctl00cPHchkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("08c24d7c-b694-49ec-8b07-4843e3b2819e");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("7d7ac0ef-23f1-4f78-a3c3-46f145d60239");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("761884b5-6dc9-44ee-87ed-4303142ffb35");
    _Verify_user_can_modify_signing_date_on_Accountants_Report_as_per_their_wishFA69446.Click_Full_Accounts();
    

    }

}
