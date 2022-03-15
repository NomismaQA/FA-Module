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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/edf9933a-e28a-4e61-a5e8-87d4e3e50568
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1472, profileId = 101346)
public class VerifyCTAdjustmentsscreenisnoteditableafterlockingtheperiodFA7152_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152","Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152 - Default Profile"})
    @TestModellerPath(guid = "e2e258b3-4da4-45e0-b819-c93f1b33f72c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyCTAdjustmentsscreenisnoteditableafterlockingtheperiodFA7152_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152 _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152 = new pages.Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152(driver);
    TestModellerLogger.SetLastNodeGuid("4e0c17f8-fe1a-41b9-87f2-1039b559838e");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("736a0959-4689-43db-ba6a-b08b390c27dd");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5267f684-0512-4cfb-855f-3d51caa49b5e");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("3fa74c07-5c40-4aea-b83e-1176dff54e57");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("f09db7f4-7c1b-48b0-ad9f-610d60e182db");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("5a4d6bcd-3ab3-40bf-9dba-8bdf114dc420");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2964d72c-1e32-4458-a3c7-226e27d4465c");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7cb246d6-1cb8-407d-b593-1cbc372b2bbc");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7b6e58c9-f116-418e-b122-2a6422c3fa48");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("d4dd7745-1e11-49a6-8106-9c3b26452301");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("abab0f51-cebe-4753-8936-82d273c0d4fd");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c41c2a19-aa07-4033-a7d5-6821b2ee2805");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("66b9e387-a7ee-49c2-8272-55ccf6788aca");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("657d4f31-3bbf-428e-851c-ff835874dcb9");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("81163666-92e8-4cb3-b459-910234c11561");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("d76c98e8-81b0-4453-9359-d7be95180ed8");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click_Submit_CT600();
    

    TestModellerLogger.SetLastNodeGuid("665f0d29-4f4a-4fd3-9785-98a5599cac49");
    _Verify_CT_Adjustments_screen_is_not_editable_after_locking_the_periodFA7152.Click_Lock();
    

    }

}
