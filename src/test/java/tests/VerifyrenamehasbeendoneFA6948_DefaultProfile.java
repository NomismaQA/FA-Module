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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/59047fbf-e191-4f91-9f91-283c9673cdfb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1403, profileId = 101269)
public class VerifyrenamehasbeendoneFA6948_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_rename_has_been_doneFA6948","Verify_rename_has_been_doneFA6948 - Default Profile"})
    @TestModellerPath(guid = "fc3ee03e-8840-450f-8da6-3919034781e0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyrenamehasbeendoneFA6948_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_rename_has_been_doneFA6948 _Verify_rename_has_been_doneFA6948 = new pages.Verify_rename_has_been_doneFA6948(driver);
    TestModellerLogger.SetLastNodeGuid("cf7ab2e7-e03b-4270-a46b-6d420821356f");
    _Verify_rename_has_been_doneFA6948.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2137f0e6-97b0-438b-92db-4fc08999bb32");
    _Verify_rename_has_been_doneFA6948.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f3ceaefe-0899-4e65-9118-7ce782da5d6b");
    _Verify_rename_has_been_doneFA6948.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("eed55ba2-927e-4f02-a951-ca8f5428c62b");
    _Verify_rename_has_been_doneFA6948.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("04704302-adde-44c9-b3b4-056232be6692");
    _Verify_rename_has_been_doneFA6948.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("691bfd8b-bfc9-4005-a90f-bf8d9d3d6093");
    _Verify_rename_has_been_doneFA6948.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("302262f4-854c-4efd-bd32-1dc60096b4dc");
    _Verify_rename_has_been_doneFA6948.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f29b7d60-b2e3-48cc-8a4c-8f9c673bcfc9");
    _Verify_rename_has_been_doneFA6948.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a1062d6e-2d57-4e60-9ebf-e6299ed9bc0a");
    _Verify_rename_has_been_doneFA6948.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d7916108-e128-4329-9220-2f81d24047f3");
    _Verify_rename_has_been_doneFA6948.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b72cd00c-a390-47f5-8f02-e6d3885cf3cb");
    _Verify_rename_has_been_doneFA6948.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e287b624-3d0f-4826-aec9-ab624f699b5c");
    _Verify_rename_has_been_doneFA6948.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("aa6e7526-6e22-4a7a-a9a8-262636f385b7");
    _Verify_rename_has_been_doneFA6948.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("3fb30fb4-9a15-4319-a69c-f63d84de2836");
    _Verify_rename_has_been_doneFA6948.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("e225cde8-df42-4bf2-97d0-2cf38e9173e1");
    _Verify_rename_has_been_doneFA6948.Click__Final_Accounts__1();
    

    TestModellerLogger.SetLastNodeGuid("e33b9e05-68d4-4977-823b-5f66482c52e2");
    _Verify_rename_has_been_doneFA6948.Click_Full_Accounts();
    

    }

}
