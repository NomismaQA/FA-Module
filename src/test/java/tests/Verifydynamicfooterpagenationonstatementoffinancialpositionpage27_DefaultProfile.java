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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f9faf312-c1bb-48bd-8ffe-3f2fa9112826
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1133, profileId = 101024)
public class Verifydynamicfooterpagenationonstatementoffinancialpositionpage27_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27","Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27 - Default Profile"})
    @TestModellerPath(guid = "0df2466a-a012-4de0-b574-94f3e6767dc1")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydynamicfooterpagenationonstatementoffinancialpositionpage27_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27 _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27 = new pages.Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27(driver);
    TestModellerLogger.SetLastNodeGuid("94528860-e8be-48eb-97d1-d69446e7e474");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("be217f72-bf46-4614-9342-0646d89fe419");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("edf1a9c3-c51d-452f-9a8d-b65d38c4b296");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("86f75772-443e-41a9-a308-957f00715ee0");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b803ca52-3606-44c2-82dd-fdae8831ab77");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("368b68c0-c601-4ae6-9d5e-d8d1269f8db3");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("85993b47-5fb8-4dd8-903b-477c55941f50");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c0724e69-e0fe-4a41-94a8-e89a8848679f");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("51dada72-ddb3-4021-abbb-93e93db0694b");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("017c641c-633d-4286-8e10-9ecdc253c5c1");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("d4a5b801-e3fa-489f-96d5-786b877480e7");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("e453be85-fd10-4fa2-82f9-33b980faf0c0");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7d356b28-8f0d-4157-9740-c4ff37c0e54d");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("ac2ff14f-0011-4603-8e9c-ab79c7f1dfef");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("a2ca42a4-1bba-4303-a822-2ba5cebf646c");
//    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Settings1();

    TestModellerLogger.SetLastNodeGuid("7ab9eb47-5049-45b8-a739-b93a11409c92");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("8ad7c4bc-446e-46d5-8540-88bb45a9f75a");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("80d11132-2068-4997-a488-9ae5f094cbc4");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("ae4f2bcf-2329-4865-a274-e88195076a9f");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("62825b52-d55c-45fc-8c0e-8e79d3417093");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Save_Button();
    
    TestModellerLogger.SetLastNodeGuid("7ab9eb47-5049-45b8-a739-b93a11409c92");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e81bee71-74c5-4439-a24e-395891dde004");
    _Verify_dynamic_footer_pagenation_on_statement_of_financial_position_page27.Click_Filleted_Accounts();
    

    }

}
