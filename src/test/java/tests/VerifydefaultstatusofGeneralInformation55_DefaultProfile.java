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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/82558e5c-e927-4fc5-a693-fd78eec636cb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 935, profileId = 100828)
public class VerifydefaultstatusofGeneralInformation55_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_General_Information55","Verify_default_status_of_General_Information55 - Default Profile"})
    @TestModellerPath(guid = "058b3fb9-7058-4b8a-96a5-8ce3309a6081")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofGeneralInformation55_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_default_status_of_General_Information55 _Verify_default_status_of_General_Information55 = new pages.Verify_default_status_of_General_Information55(driver);
    TestModellerLogger.SetLastNodeGuid("b0231cf8-d91c-4595-8e62-feee93f0a742");
    _Verify_default_status_of_General_Information55.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1c3ef1d8-c3aa-460d-9963-8ae8705a70d4");
    _Verify_default_status_of_General_Information55.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2652c78b-54a9-411d-947a-b2dcc72968e6");
    _Verify_default_status_of_General_Information55.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2395a730-be8d-4657-a587-f929b74c2b8d");
    _Verify_default_status_of_General_Information55.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a4386d36-ecd9-4478-9d2b-3859940e59b0");
    _Verify_default_status_of_General_Information55.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("b8e6b710-3a30-4ef4-89f1-95b1ddc3ee6e");
    _Verify_default_status_of_General_Information55.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("592943cc-edf0-4c57-b8ab-9126f10770d8");
    _Verify_default_status_of_General_Information55.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("fb5ecaf5-ec04-489a-93ff-8f6a86d04261");
    _Verify_default_status_of_General_Information55.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("8b77c697-6ddf-42f3-9808-aa330b56ae97");
    _Verify_default_status_of_General_Information55.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("72568eb1-c61a-4480-83a6-887a5742ef52");
    _Verify_default_status_of_General_Information55.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("489e15a0-f24f-4e7f-bfc9-ef35079c3431");
    _Verify_default_status_of_General_Information55.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("c220e79d-77d8-4143-a597-ece3c9d41024");
    _Verify_default_status_of_General_Information55.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2d124093-e29f-4e08-9fa0-d7ff078fcb24");
    _Verify_default_status_of_General_Information55.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("5db41e70-4639-4753-9080-5201016b8b60");
    _Verify_default_status_of_General_Information55.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d09fabff-b6ea-4425-9e4f-b13f2d9d80d4");
    _Verify_default_status_of_General_Information55.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ca4c12cc-388f-4010-af2f-3e0016384423");
    _Verify_default_status_of_General_Information55.Click_Full_Accounts();
    

    }

}
