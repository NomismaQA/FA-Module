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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fa0c2b99-f864-4b04-9475-055ea2784b57
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1408, profileId = 101273)
public class VerifyifuserinsertnotesinNotestotheAccountsandbreakitintotwopagesFA69412_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412","Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412 - Default Profile"})
    @TestModellerPath(guid = "8f3c26b6-cc02-433e-b92a-163e07d0a272")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyifuserinsertnotesinNotestotheAccountsandbreakitintotwopagesFA69412_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412 _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412 = new pages.Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412(driver);
    TestModellerLogger.SetLastNodeGuid("af9d6fbd-91cc-459e-8eab-e252512d75c6");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1ce6afaa-7338-420f-8643-a36ad6923b1b");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0be4752d-2a5a-4aaa-84ef-38e017776d93");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("67ba1832-2b0c-4f50-9531-7d641db67c6a");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("d4916b0d-fb1e-4d88-b47e-a0c63a52e046");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ccf00bee-dd14-46b0-a109-892ed018926d");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("382cdc72-a1b9-419e-bec6-762f30935e0a");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3636de6b-634e-49c9-9b7f-b6f090369248");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d69fb5c8-5328-4ece-9283-0b6c91ae8ec6");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("b7573ee0-933a-4a0b-b142-64f88fe95572");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e3d91198-2247-40d0-b24a-b8fa6c3b3569");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("81b7ac3a-acf5-4aff-90f4-ba49bed732d8");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("40f49463-f6b2-4951-add4-9d0252d5d117");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7ad2b91c-05ee-4742-a112-43fca6d411ea");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click_Final_Accounts1();
    
     
    TestModellerLogger.SetLastNodeGuid("6f3a0f87-0da3-4ff3-8382-7d86dd9def1d");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("59086a60-ca3d-4cc4-adff-b8c2ea8a34ac");
    _Verify_if_user_insert_notes_in_Notes_to_the_Accounts_and_break_it_into_two_pagesFA69412.Click_Full_Accounts();
    

    }

}
