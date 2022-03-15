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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b9ea5f52-c657-42f7-ab4d-321a0dc395c1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1135, profileId = 101025)
public class Verifydefaultstatusofgeneralinformationonstatementoffinancialpositionpage28_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_general_information_on_statement_of_financial_position_page28","Verify_default_status_of_general_information_on_statement_of_financial_position_page28 - Default Profile"})
    @TestModellerPath(guid = "56b2fbc4-cd3e-4b7c-8841-1419f8fe654e")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofgeneralinformationonstatementoffinancialpositionpage28_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_default_status_of_general_information_on_statement_of_financial_position_page28 _Verify_default_status_of_general_information_on_statement_of_financial_position_page28 = new pages.Verify_default_status_of_general_information_on_statement_of_financial_position_page28(driver);
    TestModellerLogger.SetLastNodeGuid("0fa17ca3-acf3-4d01-a0a7-5416577d8f07");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("02cbd085-d986-4dd6-8d46-e181128e46c4");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("942e7746-ec8b-4d66-bd77-3be2d5b27fc7");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("9b37d873-1883-4895-bde2-19068efd2819");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("119e2d18-0cfd-44aa-9221-f3493d11dec4");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("958334d0-5d2d-44de-b4ac-5e2c68b631d2");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("f3b78ad5-cc9e-4fe3-8218-a3ac107149f3");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7b34e927-e9d5-4fe3-b8b5-70604403c9a9");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("324609ff-c351-407f-85f7-beee87067952");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c2eaa060-7147-4c5e-9843-b3035a1f80e9");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("2a9b215f-292a-4fa8-8f1a-5e453a5cc55f");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("7908cac6-1ab8-4e9a-b617-7b7617988509");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cd5a0318-0864-416b-93a2-0918b72f15b7");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("9bef9ba7-f717-450b-a7e3-06b6373424cf");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ad6b0c8a-66d0-433d-9ec0-9a8ee790d46c");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("5e269bbb-de7e-4f06-bd47-f1ebe1db74e7");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a2a1b6a1-1509-4f6b-afa4-df3772fdbcab");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("4ca19328-dc52-4eda-81c9-06de96901d3d");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("0967b1e3-a53f-4ed9-b141-c9fb3c0a835e");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("a2544331-8359-4de2-a7e4-77edc587d48e");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0a98bfe1-e68e-4ac7-b806-d265acd75d2b");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page28.Click_Filleted_Accounts();
    

    }

}
