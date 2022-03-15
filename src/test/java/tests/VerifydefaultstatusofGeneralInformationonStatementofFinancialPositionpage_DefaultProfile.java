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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7193658b-b589-4c3e-9d82-780108497832
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 915, profileId = 100808)
public class VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage","VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage - Default Profile"})
    @TestModellerPath(guid = "8850e75a-7945-45d8-af33-8b2bc5ac7c89")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage = new pages.VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage(driver);
    TestModellerLogger.SetLastNodeGuid("54466c8d-4b06-4d68-ade1-d56fa4690ff1");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8863d114-6015-4b5d-8f31-d1964b6f1516");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("28e7928c-661d-4f7e-a673-702dcc19a23f");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("262b51d8-ca4a-4480-90e6-241d8d45b03f");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("79ef1034-b6d8-498c-ba2d-d9bb5b9705bb");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("fb98fb44-380c-4b3c-b632-ef071a67ea1f");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("928e2593-6462-496d-90d8-093ef244166b");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b7c8a452-4904-481c-b042-140f9b4c97e7");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("24eaa83c-e192-4a90-8d7f-5c29a83f53f0");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("5c69a7b9-1daf-46fd-858c-febfacc736bb");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("649238a4-e5c2-4759-a9d0-8065a3146128");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("bfaf7e06-f82e-4dcd-9bea-c856c43b3a5a");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3be3b7dc-ead4-4a47-8022-653091c0b8ac");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("403fa4d9-5533-4a10-be4c-9c2f94e32511");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("434570f2-e281-49bb-a47b-feb57a5d964b");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("2520ead5-221b-464d-8170-0313916be105");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("f703ce84-5597-411f-ba32-1827047dcc7e");
    _VerifydefaultstatusofGeneralInformationonStatementofFinancialPositionpage.Click_Statement_of_Financial_Position();
    

    }

}
