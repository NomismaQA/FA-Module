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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b554ce7d-aaf4-46af-823c-a372ade7bad9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 874, profileId = 100753)
public class Verifypartnershipsecretary_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifypartnershipsecretary","Verifypartnershipsecretary - Default Profile"})
    @TestModellerPath(guid = "dd6aabf9-0211-4a2f-8a2e-f6bdb404b094")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifypartnershipsecretary_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verifypartnershipsecretary _Verifypartnershipsecretary = new pages.Verifypartnershipsecretary(driver);
    TestModellerLogger.SetLastNodeGuid("46b4ff2b-4724-462c-9bca-938396464d22");
    _Verifypartnershipsecretary.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6dce77ee-1e02-44af-a3ca-6f319e70ab1a");
    _Verifypartnershipsecretary.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ae6f1956-9838-4ba7-b2ce-db35c073a416");
    _Verifypartnershipsecretary.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ccf6bbdb-a0b7-4273-bceb-1b6971a52469");
    _Verifypartnershipsecretary.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("557e4487-4df4-4131-8520-78795620781f");
    _Verifypartnershipsecretary.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a1c2d926-c36a-44e4-9159-a5e9ff9f5a2d");
    _Verifypartnershipsecretary.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1170aa55-e56f-4186-a9b9-ef9c395d89f5");
    _Verifypartnershipsecretary.Click_Search();
    

    TestModellerLogger.SetLastNodeGuid("5592df85-cefb-43b5-8a6e-e097f83f583c");
    _Verifypartnershipsecretary.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("e165fdb5-3f7e-4159-87b7-ead14df79a3f");
    _Verifypartnershipsecretary.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("ed09b817-fffe-4733-8988-b26788b039f0");
    _Verifypartnershipsecretary.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("c97acbf9-db5f-442d-afd4-8578f0a2b413");
    _Verifypartnershipsecretary.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("063c7879-bae6-4647-8f0f-9c3e529cf51b");
    _Verifypartnershipsecretary.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("72ad6010-fda3-4204-9e41-c8b7dc5ee6f3");
    _Verifypartnershipsecretary.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("991b64dd-674e-4d48-bca2-5b17a6c3a831");
    _Verifypartnershipsecretary.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fac8be3a-a677-45a7-a9c8-145672528ea1");
    _Verifypartnershipsecretary.Click_Settings();
    
    TestModellerLogger.SetLastNodeGuid("ba6c619d-0522-475e-8e04-3ca5882fddcb");
    _Verifypartnershipsecretary.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("235572b4-2eef-4b5b-9b3e-0a82a5985473");
    _Verifypartnershipsecretary.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2a01b6d4-2c12-4c72-8a45-5d8453ede386");
    _Verifypartnershipsecretary.Enter_ctl00cPHtxtCompanySecretary(sData[37]);
    

    TestModellerLogger.SetLastNodeGuid("21a579ea-ea48-4b9d-9dae-97f6c9b45068");
    _Verifypartnershipsecretary.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("81f2e764-fe64-4f34-a73a-1dba7c62d91d");
    _Verifypartnershipsecretary.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("d325cd12-2b97-4d94-b874-03c159bc6177");
    _Verifypartnershipsecretary.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("1e6455a6-67d8-47c2-a8eb-b1ac97bb2159");
    _Verifypartnershipsecretary.Click_Full_Accounts();
    

    }

}
