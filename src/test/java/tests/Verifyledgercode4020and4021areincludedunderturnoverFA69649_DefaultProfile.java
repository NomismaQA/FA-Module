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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cb4e0648-5b18-47af-9204-2e7246aacf8b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1299, profileId = 101170)
public class Verifyledgercode4020and4021areincludedunderturnoverFA69649_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649","Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649 - Default Profile"})
    @TestModellerPath(guid = "655f0821-97d9-448f-94e0-d35f639e0356")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode4020and4021areincludedunderturnoverFA69649_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649 _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649 = new pages.Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649(driver);
    TestModellerLogger.SetLastNodeGuid("b211354d-1f82-4451-aee1-8f4342cd7c32");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c29f8633-0d9d-4852-88ae-e6c0fd2b655f");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0d62e659-1d5b-4e63-97ad-2eb601cfcfcc");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("83ad457b-6af3-4879-b470-78485cb13346");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("99681096-ee8a-4b13-b992-c59db26fff91");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("734056eb-883f-4efc-a02e-ce9a55a05abb");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("0889a0c3-4e76-4853-b1dd-cd7180bb3d3c");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("71aa552a-8d8d-4510-9639-160b2306069e");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("95125fda-a5b6-456a-93c3-4205a92b25ef");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("dd6095d1-039e-4895-8516-31ea38323385");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("47fa69f2-ab37-4f73-9468-5d70dc77c9fb");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("d880f678-061b-4e14-b603-b4f14955ca02");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3fe6bd30-efbb-4911-9d85-9ff23ac449e6");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click__ABC_LTD_();
    
    
    TestModellerLogger.SetLastNodeGuid("4d14e769-0a57-4e40-9030-06272be2626c");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("03f62ea4-dd30-44ed-8f57-3c8a13a2670f");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("c7a10974-0c7b-4efa-9e39-b1e045ae1b92");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_Date("05/08/2020");
    

    TestModellerLogger.SetLastNodeGuid("9444f428-736d-4a93-aba0-d1ba2761c422");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("645b54f9-7e20-4122-8af9-fff2661e02b5");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_Description("Test");
    

    TestModellerLogger.SetLastNodeGuid("3c3ee717-4fbf-4368-99f6-eea81812570e");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount("4020");
    

    TestModellerLogger.SetLastNodeGuid("e1088b57-fd97-4d5d-80ca-ba9b1d6678f3");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_ctl00cPHrptRecordctl00txtCredit("2000");
    

    TestModellerLogger.SetLastNodeGuid("aa5c4218-4ecb-4675-9366-334a4b3f21fd");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount("4021");
    

    TestModellerLogger.SetLastNodeGuid("8f7d7405-3b60-4a50-adb1-f8a01ee5ccb7");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_ctl00cPHrptRecordctl01txtCredit("3000");
    

    TestModellerLogger.SetLastNodeGuid("90ffbeae-2bde-40e4-b464-ec55bb702548");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount("1300");
    

    TestModellerLogger.SetLastNodeGuid("f2a3afe1-e1dd-4063-a0e0-6c983d352249");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Enter_ctl00cPHrptRecordctl02txtDebit("5000");
    

    TestModellerLogger.SetLastNodeGuid("9848cff7-54cb-44b6-863c-65c066f23cbd");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Save1();
    
    TestModellerLogger.SetLastNodeGuid("b74d072a-3fb1-465f-bdd2-a305db2c4a10");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("89172dfc-fe85-4f5c-a23d-f6120021a054");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("c96299ad-1adb-4c38-a929-5d0e7031fc24");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("57d3c766-68f2-4576-b808-1716ecd1e245");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("bdc9567b-ff51-4bc6-ad96-7754a7ad4c63");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("3ffc35a9-a9a4-4349-ab99-ae8fe7321cbf");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("cd5f1cc7-d9c0-42a8-84c7-51b0f087744b");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("94cf6ca3-9c16-43a9-9b07-195da48ade6e");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("38135e84-b535-4f1e-9979-ebf3a2fdbe8b");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("8f046c97-65e1-4f13-9a8b-f5740041054a");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69649.Click_Full_Accounts();
    

    }

}
