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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/91f77f3f-774c-4bb3-a5ac-ae3b68788429
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1433, profileId = 101307)
public class VerifyusercanaddremoveCharitableDonationaspertheirwishFA69433_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433","Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433 - Default Profile"})
    @TestModellerPath(guid = "adedf76e-96c5-4225-979f-8bf005e0f491")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {

ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanaddremoveCharitableDonationaspertheirwishFA69433_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433 _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433 = new pages.Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433(driver);
    TestModellerLogger.SetLastNodeGuid("32270f7d-668a-4656-8017-86c4d4790813");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e31c0e9c-e559-4cd6-a631-281d3bbce9cd");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d5efd7cb-04ce-40bf-9615-08587f061d1e");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("8bc4f682-16de-4773-bc81-5637f68c1ab3");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("e3beae7e-0e76-4fd9-9f7f-47bb90d5096c");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ad38230a-b35b-487b-ab18-fa00533b7879");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c887d4de-1cfc-4cf6-be37-8124bda4c603");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("e3d020e7-a676-4298-a921-3d9c0e74a8bc");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d7171bb2-165b-4a71-9b94-0cfd32a31711");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("bb0ecd95-012e-4b6d-a796-26b4d2402a54");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("259ba8a5-95ad-4844-a639-6d46367c969b");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("57ee59c0-09f2-4171-b4d1-6c8a663211e5");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3b591a8a-931f-4532-a68a-cb86d8951472");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("d7940eea-2500-4989-8482-b8fc3bb9e546");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("a7875585-46c0-422d-b66b-6d08d78dea48");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("47ead950-0ef2-4645-8774-e58b3c76c703");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("466c3660-f320-4dd4-81fb-399a87181d87");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("c1a09d7f-bfee-4d24-9c17-2ea0230f7635");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("9b57d383-e171-4dd3-a42d-59bba59f5efb");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("52e8fd58-01a6-4f4b-95cb-28c3e972cf7d");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("4c55089c-fd9d-4416-89a3-9698bd4fb781");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_CharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("76ef1c00-3ff9-4264-aaa4-cb0331427e2a");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("613180aa-fe05-4e66-8c4a-3edc4e63a55a");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("da175ae4-8fa0-4e0c-b693-ad8f968f277b");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e279aeed-81fb-4160-87c8-79ca5b3c8f9e");
    _Verify_user_can_add_remove_Charitable_Donation_as_per_their_wishFA69433.Click_Full_Accounts();
    

    }

}
