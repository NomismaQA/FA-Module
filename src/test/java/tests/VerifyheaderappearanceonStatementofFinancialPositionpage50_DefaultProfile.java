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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e15a81b1-9734-4de7-87df-8c73b289a264
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 929, profileId = 100822)
public class VerifyheaderappearanceonStatementofFinancialPositionpage50_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Statement_of_Financial_Position_page50","Verify_header_appearance_on_Statement_of_Financial_Position_page50 - Default Profile"})
    @TestModellerPath(guid = "ac5facab-7d2b-42e5-843b-b962606571f9")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonStatementofFinancialPositionpage50_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_Statement_of_Financial_Position_page50 _Verify_header_appearance_on_Statement_of_Financial_Position_page50 = new pages.Verify_header_appearance_on_Statement_of_Financial_Position_page50(driver);
    TestModellerLogger.SetLastNodeGuid("edccd9c5-5834-44e2-b921-3a7a318187ed");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("924cc35f-8a75-45f3-ad73-8067193f050c");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b539e533-3a5c-4488-812a-9455d7f3df2b");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("7e1ab2a3-5014-495e-b16c-3f9fa413d6a5");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9c1c8f3f-9e38-4738-9a77-6b725375c2a0");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("e3ac9551-3cbd-466b-92c7-54c967aa5857");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7d6180ca-c6b6-4f25-82ae-10fe0ce9ccdb");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("70b4491c-c9a8-4fba-bf42-7f89e4e42dfb");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("e75b1bfa-da2c-4e0a-927a-dbaf8a528301");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("233ae548-22b4-4085-8ca0-79d53a181b38");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("4cef32ac-8fab-4c72-8424-102e706ee839");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("a490d2ae-4f69-4369-9702-5afb8d4b68a8");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d08756d2-2f87-4bf8-bc75-c45add2a5a5a");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("fe225f78-066a-44fa-a2c6-6a9dc3947447");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b1388535-3eaa-41ee-96e6-a8bba63c332d");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ac8e133c-0ccb-4c0f-80c4-948f5b2ba894");
    _Verify_header_appearance_on_Statement_of_Financial_Position_page50.Click_Full_Accounts();
    

    }

}
