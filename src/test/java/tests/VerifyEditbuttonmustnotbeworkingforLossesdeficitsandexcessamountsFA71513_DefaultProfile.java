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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/5a606674-e2a3-4c75-94d2-de8d2d1648da
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1487, profileId = 101388)
public class VerifyEditbuttonmustnotbeworkingforLossesdeficitsandexcessamountsFA71513_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513","Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513 - Default Profile"})
    @TestModellerPath(guid = "0bf3462f-75e1-4c15-8e1c-8d78372ed668")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyEditbuttonmustnotbeworkingforLossesdeficitsandexcessamountsFA71513_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513 _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513 = new pages.Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513(driver);
    TestModellerLogger.SetLastNodeGuid("8dc44523-3b49-4578-bd74-75c9a99390fe");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e050bc0-7b34-4325-9db5-13550888417a");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e80688a-12f9-4771-b0aa-41f33dab26bc");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("27453184-333a-4984-ad75-8c43ab464c8c");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("cb83cb8f-15df-425a-91d8-1d64fb0d6f2f");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c031eb95-90bc-49db-a8cb-20b5efb53b6a");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("af76ad78-f486-4e83-ae2d-a46b2a1edf85");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("872f7259-bf6a-48fb-a962-daf6ff56c068");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4e5460b0-cf34-4098-be68-3d45fb8e5c83");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a5b93d28-b7cd-4510-b6a5-6c715e683b46");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e4ef4204-6eff-4378-803d-e10ee7a87613");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("ab6b8105-53bd-488c-bba5-2b0d33ffcacc");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("da8e8228-282b-4d12-ac24-bcaf295fd63e");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("27a272bd-d8e9-43ca-927a-c0bed2eabc60");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("70f83efd-b3b8-4992-875a-09b6cdab4f82");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("8375bea3-d9f1-441e-b8cd-dd9d179d2d90");
    _Verify_Edit_button_must_not_be_working_for_Losses_deficits_and_excess_amountsFA71513.Click_Submit_CT600();
    

    }

}
