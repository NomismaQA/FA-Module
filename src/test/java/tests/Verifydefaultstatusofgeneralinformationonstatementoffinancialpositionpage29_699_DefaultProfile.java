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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/32707494-e837-4b97-aa17-799f1428d2ef
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1137, profileId = 101027)
public class Verifydefaultstatusofgeneralinformationonstatementoffinancialpositionpage29_699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;    

    
    @Test  (groups= {"Verify_default_status_of_general_information_on_statement_of_financial_position_page29","Verify_default_status_of_general_information_on_statement_of_financial_position_page29 - Default Profile"})
    @TestModellerPath(guid = "4dde0b16-4413-47fd-9800-c1a6d828e32c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofgeneralinformationonstatementoffinancialpositionpage29_699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_default_status_of_general_information_on_statement_of_financial_position_page29_699 _Verify_default_status_of_general_information_on_statement_of_financial_position_page29 = new pages.Verify_default_status_of_general_information_on_statement_of_financial_position_page29_699(driver);
    TestModellerLogger.SetLastNodeGuid("9700a832-d5bb-4f9f-bb27-3f60c2a9b204");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a93220d-25f0-4e70-afcb-2cda8d6d0e6f");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("665ad4b2-c304-4742-9a8b-b83190f0d339");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("709c2be0-a40d-4e97-94f0-43da3f488ec4");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("003cf3f0-b4c7-4ec5-ba37-f930f6bee09e");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("fd0ce53d-b153-4438-9178-4f47d30f2c3e");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("70e26185-0cc1-428c-bb35-07585f6e2daf");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b4a603e4-6159-46fd-b51c-ff0722bb8982");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ec2f34a8-ecd6-4767-9043-43d12437566d");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d6330aa2-4426-4075-bc18-0ac81e20b26f");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ed9d1d7e-977c-439d-8a3f-96a25efcec3d");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("a3b19e45-ff5d-4cda-b337-f07c02a34316");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ead3f8b8-cbb7-4875-a1c8-3c9bad925adf");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("6e799f47-fae5-443b-9207-74a7f77825a0");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d9b75049-b803-405f-a867-4d7850c960bf");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("62e8d133-7565-4ff3-a62b-4348a4c40e09");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("197cb5d6-745c-49fd-a62c-9c2ad5baf144");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("aa18c65f-9b31-443c-aeb0-1666452c6236");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Select_ctl00cPHddStatus("In-active");
    

    TestModellerLogger.SetLastNodeGuid("86abe8d9-b501-488e-8bbc-c602289d3811");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("96b4f3ff-122c-4576-887e-1401787683bb");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("cf033e44-7e50-4138-aa88-860df10fcc74");
    _Verify_default_status_of_general_information_on_statement_of_financial_position_page29.Click_Filleted_Accounts();
    

    }

}
