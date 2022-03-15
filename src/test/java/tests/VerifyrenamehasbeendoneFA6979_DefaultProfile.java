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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3d58b480-1908-43e1-a647-8b75c9af8764
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1349, profileId = 101216)
public class VerifyrenamehasbeendoneFA6979_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_rename_has_been_doneFA6979","Verify_rename_has_been_doneFA6979 - Default Profile"})
    @TestModellerPath(guid = "077d4957-9295-4780-8890-30c12664480a")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyrenamehasbeendoneFA6979_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_rename_has_been_doneFA6979 _Verify_rename_has_been_doneFA6979 = new pages.Verify_rename_has_been_doneFA6979(driver);
    TestModellerLogger.SetLastNodeGuid("0a5fc658-dd45-4e11-8fb6-e3dcbb6e1850");
    _Verify_rename_has_been_doneFA6979.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("572e0d46-46b9-47e2-86a0-43ea0a8ee243");
    _Verify_rename_has_been_doneFA6979.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("deb4d15a-0b78-4b3b-baed-1e89f6ac71f9");
    _Verify_rename_has_been_doneFA6979.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("40d02f31-6fa4-4141-acbe-ff6ac5a4700d");
    _Verify_rename_has_been_doneFA6979.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("739fb6c3-5c49-47bf-9c3c-c6938bdaeb5f");
    _Verify_rename_has_been_doneFA6979.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("3dce4ca9-6b16-4e17-aa75-d99a949f4f24");
    _Verify_rename_has_been_doneFA6979.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("dc29fbd7-a9a6-4f94-8763-6e95443c35d4");
    _Verify_rename_has_been_doneFA6979.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("41e43303-1d2f-49a8-8d6d-2147e32722c8");
    _Verify_rename_has_been_doneFA6979.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("504886d0-4490-4a43-b8b4-6d71fa0eb9b0");
    _Verify_rename_has_been_doneFA6979.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a0a7d6cc-4ce8-4004-a070-0c54c384297f");
    _Verify_rename_has_been_doneFA6979.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1f025c2b-2ac6-49fd-9463-e623cd651da9");
    _Verify_rename_has_been_doneFA6979.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("f31cdf40-223c-4f0b-8b35-2b3233b1697f");
    _Verify_rename_has_been_doneFA6979.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("da980885-a536-44c3-8dda-36a19bdd31a7");
    _Verify_rename_has_been_doneFA6979.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("e8f0bde6-ed10-49ea-9a8a-20321883c5e1");
    _Verify_rename_has_been_doneFA6979.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("337830f9-d4d7-4fe8-879d-30b2eb6dfe9d");
    _Verify_rename_has_been_doneFA6979.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ae697ee5-bdcd-45af-8a67-bb54ebf3c591");
    _Verify_rename_has_been_doneFA6979.Click_Filleted_Accounts();
    

    }

}
