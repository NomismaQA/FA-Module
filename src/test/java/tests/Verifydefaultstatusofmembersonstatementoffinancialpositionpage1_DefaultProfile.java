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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/1f51d91d-193c-4a62-8677-e3dd671b5dcc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 917, profileId = 100810)
public class Verifydefaultstatusofmembersonstatementoffinancialpositionpage1_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null; 

    
    @Test  (groups= {"Verifydefaultstatusofmembersonstatementoffinancialpositionpage1","Verifydefaultstatusofmembersonstatementoffinancialpositionpage1 - Default Profile"})
    @TestModellerPath(guid = "ac26a4a4-9dd1-49f2-a7e9-71b073ff88c8")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersonstatementoffinancialpositionpage1_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifydefaultstatusofmembersonstatementoffinancialpositionpage1 _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1 = new pages.Verifydefaultstatusofmembersonstatementoffinancialpositionpage1(driver);
    TestModellerLogger.SetLastNodeGuid("d1355141-6fba-4452-bef9-dd3611f44c2f");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("391460db-5335-4c59-a18d-f37c44d1e12b");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("668eb6a4-645a-4c93-b466-f7ed13c351b9");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("67155296-b40b-4e47-acf0-39bc4adfade4");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8df83d72-7ed9-498b-83e2-fb1771595ced");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6366f3e9-aa3a-461a-86c6-b0257e905757");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("06887ce1-a1f2-4ba0-bf61-1f2fe24beb1a");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7c7c694e-8f7a-48cb-92e3-ab1b912fc19a");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("5e67a193-0974-4c1b-92e5-5675e1757619");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("29eeb732-c5f8-4e8b-85b6-02e7a83eafb0");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("435cbac2-a860-4bd0-8301-8de86e131c4e");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("61ffdc45-c28c-4a46-bcb3-be6600794c77");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("15466cfe-aded-4497-a30d-8a37531a91ad");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("bbf3bd29-e165-41ac-9b6b-81b15732066b");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c677214f-2a0e-4b56-9ea0-9066d3fbdb67");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("34ff0cd7-7df2-4617-af8e-6d7ac15ba9e9");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("a8ff6adf-4800-481c-9fc3-a4cea6b92e07");
    _Verifydefaultstatusofmembersonstatementoffinancialpositionpage1.Click_Statement_of_Financial_Position();
    

    }

}
