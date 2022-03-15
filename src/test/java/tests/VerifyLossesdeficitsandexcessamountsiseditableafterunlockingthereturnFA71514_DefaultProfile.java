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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/98d32312-0232-425f-be98-48c1cedfa8dc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1488, profileId = 101391)
public class VerifyLossesdeficitsandexcessamountsiseditableafterunlockingthereturnFA71514_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514","Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514 - Default Profile"})
    @TestModellerPath(guid = "390e49ed-8ce0-4341-9439-3acdb3bb93b7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyLossesdeficitsandexcessamountsiseditableafterunlockingthereturnFA71514_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514 _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514 = new pages.Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514(driver);
    TestModellerLogger.SetLastNodeGuid("9b182874-0b0e-4c6a-a240-18ec4a9c74e9");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b993e55a-9bdf-4967-b6ef-65e822d160b0");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8998e88c-0672-4677-ad1c-57cf0a4f0c27");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("99e07307-1f8b-412c-85e9-1d2e629d74b8");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0e4f2641-330a-4e88-be23-dd16a3f67d65");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d26ad7f7-025f-4b46-936f-7cf9e2ebb103");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("e5939878-fe10-4387-80c2-b10318509557");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("fa9cdb2b-2314-4226-bd20-1531ec91d829");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4f93dc66-a2b2-4d1f-861e-58c0c2a369de");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("8b75d22b-eb00-4e61-be91-a309010d3f86");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("51b20ab3-9cb8-4f43-a66c-fe155263b930");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("cdc4a476-b33b-4843-9d09-42ccf76b9744");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("9ee3303c-adaa-4d72-8206-ae2598a66638");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("e40471f7-65e9-4d8d-86cd-ec164dc95764");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("810cba80-a9e1-4633-ad8f-502247511afc");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("54fed875-ad0e-4082-a540-3ab2a34e3a44");
    _Verify_Losses_deficits_and_excess_amounts_is_editable_after_unlocking_the_returnFA71514.Click_Submit_CT600();
    

    }

}
