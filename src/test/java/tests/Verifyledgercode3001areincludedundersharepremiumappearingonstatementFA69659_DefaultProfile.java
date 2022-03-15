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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9366e9a7-b1d0-4dc6-a93d-f61ea8b77ae1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1314, profileId = 101184)
public class Verifyledgercode3001areincludedundersharepremiumappearingonstatementFA69659_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659","Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659 - Default Profile"})
    @TestModellerPath(guid = "9a735a06-998b-43f1-845e-d7b3d6789f8a")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode3001areincludedundersharepremiumappearingonstatementFA69659_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659 _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659 = new pages.Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659(driver);
    TestModellerLogger.SetLastNodeGuid("d5fea276-fc49-4adb-a8dc-3e7349fe07dc");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1f44c820-980d-4601-9557-36bbad528dc7");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0f82cc27-7eea-44b2-92ff-421aa7e111d8");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("add176c9-e521-44ec-8c28-8b74dd4c3f43");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("1ed19af5-2fc9-4913-ac9c-d9c82d2096eb");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("21db904e-bfdb-41b2-b9f9-53e3409fcd33");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4794c790-322b-4055-82a7-385d21604fdf");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a2ecd452-e151-4056-b4c3-2287a8824a48");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d2dde06b-712c-4322-9dc8-c8554fe1902a");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("5bb875d6-e62c-42b2-a56e-7b93a9a5b6c8");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("771f593e-0c82-41a8-8e18-a9036d71bbce");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("689c5825-1436-498b-bed6-d38dbcd930d5");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e9d4b35a-04fc-42cf-90fd-0759816fc6d5");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("08b6552d-b314-4894-9041-889d494999f5");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("8caf876c-eccd-48e4-829f-db7e23c01b1c");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("9bf05102-6492-4815-8feb-b3b9ce014c5d");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Date("16/10/1992");
    

    TestModellerLogger.SetLastNodeGuid("b0656454-bd52-48b2-aaad-b66bedd15e9c");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("2a074915-5a3b-4016-b992-b44fc3309a80");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Description("Testing");
    

    TestModellerLogger.SetLastNodeGuid("086d56d0-a321-425a-8b2d-2f131bfc044f");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Account1("3001");
    

    TestModellerLogger.SetLastNodeGuid("687b7e5e-baf0-4ae5-b538-f01e6bbcefba");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Credit3("1000");
    

    TestModellerLogger.SetLastNodeGuid("56ca4fbe-7a9b-4e2a-9849-c3a2be69b084");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Account2("1300");
    

    TestModellerLogger.SetLastNodeGuid("fb673b32-6896-43cb-9078-a46eacb9c9f5");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Enter_Debit2("1000");
    

    TestModellerLogger.SetLastNodeGuid("1eba19bd-e558-4562-9afd-60229518343d");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("6b1a2998-620b-4d02-97f0-4b550394af81");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d5ac3efa-3f39-4c2a-be09-6aca7d62f553");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("59d9fca5-6031-44cb-bf09-2d0d22d03e1b");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d4defd24-29ec-4537-a8ca-398627a3d163");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("e2118111-1958-4960-8cc4-195e59c4a8db");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("de23ebd6-58f5-4360-9ca4-9b20b7d7db1d");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("31e7ba9d-14ed-4ac9-9922-9b17908514a6");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("de33b943-b281-44be-ac20-b5698c936992");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("5b31e5fa-52b7-4f2a-a8bb-3fb5c53711d6");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("8bad0bed-08ef-497a-9a36-f2479206db3e");
    _Verify_ledger_code_3001_are_included_under_share_premium_appearing_on_statementFA69659.Click_Full_Accounts();
    

    }

}
