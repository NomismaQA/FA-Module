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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/695c8954-2918-4f42-9eaa-9deb1c09130c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1253, profileId = 101138)
public class VerifyusercanaddremovedonationnoteaspertheirwishFA69639_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639","Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639 - Default Profile"})
    @TestModellerPath(guid = "061e9080-30ce-402d-82e4-3e18d02bb114")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanaddremovedonationnoteaspertheirwishFA69639_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639 _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639 = new pages.Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639(driver);
    TestModellerLogger.SetLastNodeGuid("dae50885-0f0a-441c-9761-be513740f3f6");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("65b4d39a-52ca-4d59-8ffc-22d0e3de7911");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("13eae6b0-3fc7-4803-b80f-464a19604e07");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("3058bd62-1f81-4789-8be6-fd215aab38f3");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("256545b7-43ad-494a-8730-1119b679db1a");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f8bfa3b2-82e2-4a9c-9dc8-7713228eed64");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("813dfd98-0cd7-4d21-8a7a-d37e365c4aac");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("644d644f-3094-4eaa-a979-56368d3eb08d");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7ebe70ee-3da4-4320-a045-b70ddfdaf691");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("4554c85f-1212-41be-9f2e-8c2c26931d56");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("55a818cd-c456-40c3-ac20-86f3b014dd3e");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("18b5670f-7dc7-45ca-8009-82f59b669d28");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a1ef3305-d6ba-4ca9-9d18-aebf90334fef");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("8996e6c8-cc66-4a86-a881-fc70abd4015c");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("91c4436b-67cf-406c-b5a1-d45b948c86fd");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Settings1();
    
    TestModellerLogger.SetLastNodeGuid("01c7c00f-8ea3-4c23-9da1-6d8f299caefc");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Accounts_Settings();
    
    TestModellerLogger.SetLastNodeGuid("f726ab62-fe3c-4868-a7ae-35d7750ce799");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Edit1();
    
    
    TestModellerLogger.SetLastNodeGuid("68811727-9dd9-44c6-a0e0-3d69762454d3");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("b122fc28-395c-4b50-8af3-d99686b0e1b5");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("45f41ef2-8b5d-47f4-bbf7-db9a04f56ceb");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("01ae71fd-4466-4bfb-9e09-7fa7755a1307");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("7dbfec2a-e409-4060-9ef1-9b0a8548cdcd");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("b5440438-a5f2-4e0e-9a13-2337aa6bdedc");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b652d764-81ec-44aa-a7a0-24112e5c1870");
    _Verify_user_can_add_remove_donation_note_as_per_their_wishFA69639.Click_Full_Accounts();
    

    }

}
