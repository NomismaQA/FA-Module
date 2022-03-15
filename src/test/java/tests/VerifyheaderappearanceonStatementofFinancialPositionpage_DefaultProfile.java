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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c358b1a6-3ffb-4796-9e50-0e2f3dcd4786
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 901, profileId = 100793)
public class VerifyheaderappearanceonStatementofFinancialPositionpage_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"VerifyheaderappearanceonStatementofFinancialPositionpage","VerifyheaderappearanceonStatementofFinancialPositionpage - Default Profile"})
    @TestModellerPath(guid = "6035a2db-7bf9-42a8-ba79-878decc08cab")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonStatementofFinancialPositionpage_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.VerifyheaderappearanceonStatementofFinancialPositionpage _VerifyheaderappearanceonStatementofFinancialPositionpage = new pages.VerifyheaderappearanceonStatementofFinancialPositionpage(driver);
    TestModellerLogger.SetLastNodeGuid("1d594690-fe68-4eb2-ab53-49f48724888c");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("43298342-ba9d-40a2-a24f-e008a084da15");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bee5c821-5d91-4da8-bf6e-c5c76d01ea78");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c26b4ce8-7002-4afe-a7a4-51abf28e7960");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("1e6c0d10-5505-45f5-a622-cff6124b9b9e");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("fb01652e-c5e1-45f6-98c2-23abca64bc01");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b6910c30-263d-4afc-ad32-38a596a0518a");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("5dceeca2-9261-4b7e-91aa-45769693af7d");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("a2ec7be1-c5c4-4e2c-aac3-349ce023857c");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("3c3c4e25-30c7-405a-ad93-74362bfc7733");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("621a69ef-f5e5-4409-8986-72e4497a6fb8");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("2d856b21-9019-4e20-801c-e5e5986cd74d");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("dc39a65e-808d-445a-a6ab-b2cc14f62674");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("72dfbf1e-3808-4127-ad51-c26e69154e09");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("52276d78-c41d-4530-802a-b8465f6f83a1");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("de9705b7-b7f8-4285-827a-9f69d0bfebf6");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("f53d23a4-0ad5-4e17-aa9a-d62ea13cfddf");
    _VerifyheaderappearanceonStatementofFinancialPositionpage.Click_Cover_Page();
    

    }

}
