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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a3c95227-0f16-4f4a-a0e9-4bc17266daaa
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 983, profileId = 100875)
public class VerifydefaultstatusofGuaranteesandotherfinancialcommitments60_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_Guarantees_and_other_financial_commitments60","Verify_default_status_of_Guarantees_and_other_financial_commitments60 - Default Profile"})
    @TestModellerPath(guid = "bdd1938e-af0a-4d55-9c0a-a071228ab303")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofGuaranteesandotherfinancialcommitments60_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
 
        pages.Verify_default_status_of_Guarantees_and_other_financial_commitments60 _Verify_default_status_of_Guarantees_and_other_financial_commitments60 = new pages.Verify_default_status_of_Guarantees_and_other_financial_commitments60(driver);
    TestModellerLogger.SetLastNodeGuid("8a5de680-1288-4d80-96d1-4664bdde68d8");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("38579fa3-7922-460f-b4a3-4f319198803c");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e9518787-4fad-4d5f-8231-3038726685b4");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ba2c5eb9-73e4-4abb-a928-b191a5daf35b");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b716ba74-abec-4074-a70b-a965dac45a63");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("613b5fbe-b50a-4ba6-870d-f46f91b69c5e");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("efe8d88a-8b54-443c-b22b-54463d2c3656");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2a15cf23-a88a-46cf-9f8e-5919694ca53a");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("15caee52-9ade-4a60-9e10-6a8c71990057");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("ae780d10-3b34-4fe0-98d7-6f8bdf4d1a65");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("7bf68bbd-817b-4ebd-8e7a-d8b8dd74af11");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("10840e19-fc4d-4174-b856-927dadc362db");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("559db9ab-cc20-4d87-be14-11cd638ebd27");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("6e5e6159-6e4b-4e15-b643-d4c82f09c3ce");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("2bae215d-dcd8-4a5d-bbf0-780e6b0b7d8e");
//    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click__Settings_();
    

    
    

    TestModellerLogger.SetLastNodeGuid("e552c3de-2de6-477b-98aa-850c91fe2438");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("f5332dd7-a28b-4231-819e-21d580e9b4f0");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("e844240e-c1d7-441f-b045-8e07687d47c6");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("72fb7b0f-5149-4a40-b69c-3a134ae756ea");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("25448121-b256-43a4-bed9-d1b0c8da044e");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("e552c3de-2de6-477b-98aa-850c91fe2438");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("94ecc5ec-14bd-457f-a88a-7d60661ee69b");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments60.Click_Full_Accounts();
    

    }

}
