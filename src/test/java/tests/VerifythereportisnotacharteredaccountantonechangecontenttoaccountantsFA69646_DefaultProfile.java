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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6907322d-54c6-4367-bd26-e5d10b75fb58
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1297, profileId = 101168)
public class VerifythereportisnotacharteredaccountantonechangecontenttoaccountantsFA69646_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646","Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646 - Default Profile"})
    @TestModellerPath(guid = "93e940c2-363f-4104-86ae-f522abcc5077")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifythereportisnotacharteredaccountantonechangecontenttoaccountantsFA69646_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646 _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646 = new pages.Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646(driver);
    TestModellerLogger.SetLastNodeGuid("2e1ad66c-b59e-43cb-b364-b9eb2f33ee33");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7a488734-116a-48c2-9b0f-8339841899d5");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4adcf94d-33e0-446c-b1da-5a7a6a79791d");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a941750e-936d-4974-bd15-c3cb401827e6");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("67a46ada-f8bd-4c05-9f51-21a291888b28");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("b3ed7eaf-d06e-41af-96ec-103c8bae5d4d");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("52a0a6e9-24c6-4631-bce1-325c04549d40");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("5a8f0d05-d5af-482e-8cab-c8e89afd9d8c");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("456bfa85-b8a4-4723-8741-55aa3d120b8a");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e53cd27d-5d09-493a-93b5-1c26837a31cc");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0cd4a052-92a9-4079-a3e1-1f7524f0004d");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("9f530642-8d0c-43bc-abee-4ac1804089f9");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a487a8bb-6b9f-46a9-aac0-4b6a6ad15435");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a9ed9a9a-6c78-4edb-aecb-6c7a0bab0dc2");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d88dc896-7e08-4d03-b086-369bfc99fac4");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("89c53960-47c4-4cc0-98f6-5a38f5d57303");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4b662c8a-0fa5-4f4c-9b0b-cb3c0f5b759d");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("7658f60e-242a-44ba-be42-8717002d9718");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("8c96c11c-0e2a-4bce-a1ea-d27062b75719");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("8ae854ad-608e-45c4-a98b-0002c9aa33a8");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("a001c2ac-7cbb-498e-91f2-d60722141143");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("93f9ece5-6453-483a-aadb-359f00bc3e8a");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("8c08478a-8e47-4d44-8ab8-9e66925d6c5d");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c7faeec1-ea20-4aba-92a9-50c63a29b181");
    _Verify_the_report_is_not_a_chartered_accountant_one_change_content_to_accountantsFA69646.Click_Full_Accounts();
    

    }

}
