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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ea7592f3-b88d-4699-b209-89849b475c17
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1431, profileId = 101305)
public class VerifyusercanremoveprincipalactivityaspertheirwishFA69431_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_remove_principal_activity_as_per_their_wishFA69431","Verify_user_can_remove_principal_activity_as_per_their_wishFA69431 - Default Profile"})
    @TestModellerPath(guid = "f0526f1a-7eb5-4a89-ad86-de0163acaa6b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanremoveprincipalactivityaspertheirwishFA69431_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_remove_principal_activity_as_per_their_wishFA69431 _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431 = new pages.Verify_user_can_remove_principal_activity_as_per_their_wishFA69431(driver);
    TestModellerLogger.SetLastNodeGuid("eacca312-f128-48df-b838-f1983af3fb70");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("899cc200-03b6-43d5-b617-d95283bd9c5d");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d9e1a5d5-2ce0-4fac-af35-cdd029d7a057");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4bfa8ce9-ce50-4e56-998c-c4ee9d4812c0");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a2182785-dc41-42ec-b712-629b5a04dcc7");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("857605a2-f506-440f-852a-6acfdeff32bc");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Enter_AgentName(sData[3]);
    
    TestModellerLogger.SetLastNodeGuid("05e14db5-a879-4927-b47f-b1b1245b26f0");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("60f26c6a-a921-4bb1-9939-6e211bdeee7b");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("155e80f2-b0a1-425a-b272-63b49deeadc0");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("cdff3f21-b24c-486b-8e8b-8f3688660dfb");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e67be1ee-a0b0-493a-a50b-7c6789d87051");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("03379f38-d82b-4877-b77c-9925e0695346");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("77ce78b8-7f11-4b05-8ad1-8520093970b9");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("8b9c1370-6c7b-4e60-8d2b-1977e7c54c18");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("5109503a-48fb-45bd-8d41-34a93f1c1297");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("eb878f96-e6cf-4e13-940a-ff3e9fb72009");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("8c10b002-7741-4ce7-94cd-6d058be8cc30");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5e663925-e216-45ec-8174-ae91b2bf9f63");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("83110082-a5a7-4360-aef2-6fc5c7f9a1e2");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("2620eef8-629e-49bd-b3f8-6ad20f81dd27");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("edc251e2-3f7b-4ec3-bd79-99a1b1adfd49");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_CharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("bb388d6b-592f-498b-9d8a-942a2068c109");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("3ab865d2-2524-42fe-b489-c4d2a5086d72");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9172c66e-5888-4e4e-808c-f4afc645cacb");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("70851f4a-7cc6-475e-8103-0a908a47ef2b");
    _Verify_user_can_remove_principal_activity_as_per_their_wishFA69431.Click_Full_Accounts();
    

    }

}
