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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/acbaa656-3480-43fe-a4a4-b61f7b6188a3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1324, profileId = 101192)
public class VerifynotenumbermentionedonIncomestatementhashyperlinkwhichredirectFA69657_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657","Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657 - Default Profile"})
    @TestModellerPath(guid = "da41b320-50a4-4fa8-8aea-c6fa79dc7c01")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifynotenumbermentionedonIncomestatementhashyperlinkwhichredirectFA69657_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657 _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657 = new pages.Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657(driver);
    TestModellerLogger.SetLastNodeGuid("96f2b0bc-c212-4065-a0e7-bc5651f1bd9a");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("db14f558-3cf8-4f9b-9807-b8d155ffc656");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("23b81843-4767-49d2-b942-07a4ed3782aa");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("6b2c8062-c090-4d52-b0f5-b4fa9e29a214");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("d73d8f4e-7f0f-49c8-aa0b-28ff67ebac83");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f2bc3717-a689-4ad5-8738-006c07b75f3d");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a51e2ad5-ff9a-4f02-9ce8-05f2baae44a8");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("0d37a2a9-e3db-4ece-b67d-a3e661d4a8d2");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7723974f-d760-4f1c-a307-b5e38cdf69f1");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("927d47f1-2cad-4814-8358-462cd26be67f");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("14d5df8c-1c5c-458b-b52f-ea970d69e21e");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("1b1de34e-6c83-4b4c-b0f1-2d5ab2c0f36d");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("42da80fd-240c-40ce-9b3a-907846fb60f4");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("24337ae3-144c-49a0-bd7e-a5c5b82941f1");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("a5b47717-6093-43b4-9a78-f86d90cb0142");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("74cac3b9-e1e3-4b63-9945-f4dc7689e72d");
    _Verify_note_number_mentioned_on_Income_statement_has_hyperlink_which_redirectFA69657.Click_Full_Accounts();
    

    }

}
