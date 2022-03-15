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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cd3d8bbc-e5f7-4c90-896d-71153d1061ef
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1320, profileId = 101189)
public class VerifynotenumbermentionedonIncomestatementhashyperlinkwhichredirectFA69655_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655","Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655 - Default Profile"})
    @TestModellerPath(guid = "6a15ffea-23f3-43e3-97b5-614696158967")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifynotenumbermentionedonIncomestatementhashyperlinkwhichredirectFA69655_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655 _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655 = new pages.Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655(driver);
    TestModellerLogger.SetLastNodeGuid("0fed27fa-f990-4af0-b192-ec1fc2122734");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b7a5ebfd-1803-4fb1-977a-a95756b7e1ae");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9f65b64d-37f4-4034-bc75-081ba6927af1");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("dd128bc6-6b9f-4b2c-8199-9a71740e2567");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("30fe3fe2-f063-438b-89a4-62c9b4f6c1e2");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2cc8bc69-72ec-417a-8571-37dda34edd4e");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("582c49e1-62ea-42cc-a5d4-3c713affd807");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("fb817aa2-e964-4d9f-9969-747dd23b1a5d");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("063b298c-a654-4409-940e-e448bae6e941");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("54dea9ed-67eb-4d80-a6a5-88e7ff0f4967");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0cb0e92d-5270-4c6d-a28d-c3f9a0deb2cd");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("26d0f05a-6c01-43a1-b22d-f560d4cb84b6");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0fe835e2-722d-4351-92dd-e2cac35dab2b");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("111c0c5f-2663-4f6d-911e-d17a35cd57b5");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d2b47d12-ced3-447d-969c-63bd4cbd30de");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("32147786-a264-42ed-aaf8-12d94f4c46fc");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69655.Click_Full_Accounts();
    

    }

}
