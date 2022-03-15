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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/62c8750b-9fa2-487c-bea8-3e93e2e6c0b5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1480, profileId = 101367)
public class VerifyAboutthisreturniseditableafterunlockingthereturnFA7158_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158","Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158 - Default Profile"})
    @TestModellerPath(guid = "32028eb8-9ee3-41ae-b627-0a786628d6a3")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyAboutthisreturniseditableafterunlockingthereturnFA7158_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158 _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158 = new pages.Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158(driver);
    TestModellerLogger.SetLastNodeGuid("ff1e03c1-6d8a-4d1b-abaf-dd163a3d2d77");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("018b5149-6302-439c-b916-031966c01dd6");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4030bc01-ec2e-4884-9657-1ea6c261f623");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a7d1792d-2921-402f-b5c6-4c8a5f17f57f");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("aa944020-00bb-4020-b68e-e2ea8eca8265");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("94f87296-7171-48c0-b05d-93156c55b792");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a57fe3a7-ff44-4df2-8900-00779aeda307");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("523cfa1e-58c6-466a-b544-5ef4d8405123");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("18228cbf-211b-47ef-ab67-5e970a37f2ca");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a2768722-4b2f-4cb2-a198-8602d1014216");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0e79db5f-ec09-4b87-a29b-24c832b8cb4c");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("bac4a211-0229-4213-9f8e-d631894b5910");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("75756100-fcdb-44da-b44f-e0660c815ecb");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("e8b90f97-99b1-4b90-bc8b-5374603a9742");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("cca66c6d-723a-4fe7-b4a9-0479b4e1a9a2");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("4f216518-b3e2-49ab-9bf8-ccbe45bdb2f7");
    _Verify_About_this_return_is_editable_after_unlocking_the_returnFA7158.Click_Submit_CT600();
    

    

    }

}
