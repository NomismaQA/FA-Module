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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/62bfcd62-dcde-4d7c-a222-96e8d9203525
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1412, profileId = 101274)
public class VerifyifuserremovenotesinNotestotheAccountsandbringitdownitintoonepageFA69413_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413","Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413 - Default Profile"})
    @TestModellerPath(guid = "01f5d48b-70bd-4c0a-b935-e347314a2975")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyifuserremovenotesinNotestotheAccountsandbringitdownitintoonepageFA69413_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413 _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413 = new pages.Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413(driver);
    TestModellerLogger.SetLastNodeGuid("2a62c465-8f78-4a42-8a9c-50595a73a91f");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b916ffd-0903-42aa-9e63-5e97caa0a85f");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("24777012-0266-4dfa-9d48-53a2d7cb7e37");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("42dc31cc-f9f2-46b2-9b33-c4f7a3291cf4");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("746fe686-86ea-42ec-b32c-06ff924c10fa");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("047c35a8-b9b1-4f51-b7d5-43c849230293");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8361fbc5-e799-4fc0-b63f-a961b8a04ec2");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("180c9d38-910d-4729-bb14-de3ff004b48b");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ad672db0-abc3-4284-a24e-93348aee230a");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("56a43226-679a-4869-9d14-a4bb12ee6f23");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b080a906-ffad-40c2-acfd-8520b527fae3");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("3aa4133b-7645-41cf-a300-fc7f425aa86d");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1275eae6-1ea7-440b-8472-37c154579d5e");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("f5f3444f-a086-42cd-9e1e-580b25bcd6d8");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5c7c5b5c-fc76-429d-98ff-5cc802948e1b");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("81e6d0c9-cd3f-44a5-9816-f9ce84b9470b");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("bf13cfb1-1b98-406e-b76c-bf53531e4dc1");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("36fcb501-0d91-4750-bd95-69aa89b2dbc7");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Select_Status("Active");
    

    TestModellerLogger.SetLastNodeGuid("dccb3a2f-5f01-4858-8eaa-cfc29521cf6c");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("8e7b811e-25d1-431d-a37a-7a40ffd644ea");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Final_Accounts2_1();
    

    TestModellerLogger.SetLastNodeGuid("68607f29-b774-427a-97f9-4d389354c7f9");
    _Verify_if_user_remove_notes_in_Notes_to_the_Accounts_and_bring_it_down_it_into_one_pageFA69413.Click_Full_Accounts();
    

    }

}
