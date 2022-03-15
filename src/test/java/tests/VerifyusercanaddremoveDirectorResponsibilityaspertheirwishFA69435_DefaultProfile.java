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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f867adb2-0b92-4dae-8b84-4f6b9f4bdfc2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1436, profileId = 101311)
public class VerifyusercanaddremoveDirectorResponsibilityaspertheirwishFA69435_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435","Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435 - Default Profile"})
    @TestModellerPath(guid = "9d55cc23-c457-4b6a-a7bb-7f53c7a1bd7a")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanaddremoveDirectorResponsibilityaspertheirwishFA69435_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435 _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435 = new pages.Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435(driver);
    TestModellerLogger.SetLastNodeGuid("eff3db20-0c10-4732-805e-623ad46fc70d");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bbb95b8e-6bb1-4ff1-98ce-3de7e221fe98");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ce4738e6-4a16-4e58-9f4c-5226d259b453");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("069418d4-643a-4487-a7e5-b7f1fcd7399a");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("911ab64a-c2d7-4ed9-a66e-616fca04d28a");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4c758a74-c360-4f52-a5e4-9717b12448f4");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a04dcd72-2dfc-4d47-9aab-a471629e20b8");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("860d4a7e-a3e6-4ccc-af6a-8c6dd3775aa3");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("2dd32f35-f27d-49ec-bb79-478a8d97face");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e616f178-3912-4675-a212-b9780536bb7c");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("17564cec-7113-49c0-93bb-9e1d9ea84cac");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("9484200f-87ed-4d5f-ba31-83b8059a16bd");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e62f5d51-48e5-4363-8612-976a940a1a49");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("90a6e3ca-1a7b-46ac-a3ea-3e358a5708a1");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("cbdc3c85-2123-4b91-bfd1-4ad3e05fec7c");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("306070f2-506f-40c5-910e-7a16cdf09de9");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("79fcf78b-e3b2-46e3-b8e1-4a3e24883d17");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4ca9d51c-a04a-42cc-a8d3-b502af963e42");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("bd8ece9d-5283-46de-8a8c-29610b5b3612");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("6b2fc808-2f35-4c95-bb9c-c8de77751013");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("43420cb4-7eeb-4869-8b1e-4b62b1d39402");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_CharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("3734b922-fc87-4740-800c-a0ed51faf140");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("a85880e1-7e45-4ba4-be29-f687917ca3a9");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("830a9c25-14bd-459b-9a0a-8bddbd6ec583");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b031b2e0-1b9b-4ce4-82fd-ad7875018c86");
    _Verify_user_can_add_remove_Director_Responsibility_as_per_their_wishFA69435.Click_Full_Accounts();
    

    }

}
