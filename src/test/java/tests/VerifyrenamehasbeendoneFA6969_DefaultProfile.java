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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d9a75922-4e56-46f8-a028-4783c51ae194
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1176, profileId = 101065)
public class VerifyrenamehasbeendoneFA6969_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_rename_has_been_doneFA6969","Verify_rename_has_been_doneFA6969 - Default Profile"})
    @TestModellerPath(guid = "d907d972-080e-4a56-90a1-b9d670546838")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyrenamehasbeendoneFA6969_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_rename_has_been_doneFA6969 _Verify_rename_has_been_doneFA6969 = new pages.Verify_rename_has_been_doneFA6969(driver);
    TestModellerLogger.SetLastNodeGuid("e69eb971-c42b-4bbc-a968-b9b12736a342");
    _Verify_rename_has_been_doneFA6969.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d7012a93-28a6-4860-9c75-d7654eb01893");
    _Verify_rename_has_been_doneFA6969.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("50bba253-01ee-4631-8485-ecc6b8b2c0b3");
    _Verify_rename_has_been_doneFA6969.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4e8d379e-5e01-4c36-b04a-6e70cfb84e7b");
    _Verify_rename_has_been_doneFA6969.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("51c075f5-302b-4cca-b174-71c78ad20c0a");
    _Verify_rename_has_been_doneFA6969.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("62f423c7-e3b1-427b-9616-a69735e1ed3f");
    _Verify_rename_has_been_doneFA6969.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2b124c23-98b2-4e19-8ca1-4c3081c69c4f");
    _Verify_rename_has_been_doneFA6969.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("239b3e3e-59dc-4a05-b320-bf8be5206ba3");
    _Verify_rename_has_been_doneFA6969.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d6aa1809-bfb1-4d27-9d13-7efdae39873c");
    _Verify_rename_has_been_doneFA6969.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("3e0ecf22-808e-4c3b-947d-1d00e6de5a6d");
    _Verify_rename_has_been_doneFA6969.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b3c08236-e17f-43d0-b7d4-5e72d215a303");
    _Verify_rename_has_been_doneFA6969.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("b36f60e9-00d6-41af-93c1-5225b75658e6");
    _Verify_rename_has_been_doneFA6969.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cb3b7209-811f-4606-974f-59cb1e489b1a");
    _Verify_rename_has_been_doneFA6969.Click__Test_Systems_Ltd_();
    

    TestModellerLogger.SetLastNodeGuid("65cf209e-e2af-41a3-9c72-6dbdc9c96703");
    _Verify_rename_has_been_doneFA6969.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c25471b6-7362-479c-b815-948254b521d5");
    _Verify_rename_has_been_doneFA6969.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("23c0ec9c-dec5-4216-93c7-22293586fc68");
    _Verify_rename_has_been_doneFA6969.Click_Full_Accounts();
    

    }

}
