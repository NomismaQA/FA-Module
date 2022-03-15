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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a7b762ba-9f11-44c0-b2ea-5009eab97e17
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1494, profileId = 101406)
public class VerifyFormCT600AiseditableafterunlockingthereturnFA71518_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518","Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518 - Default Profile"})
    @TestModellerPath(guid = "de8bb90c-274a-4ca7-9c50-6feffcf05f2d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyFormCT600AiseditableafterunlockingthereturnFA71518_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518 _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518 = new pages.Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518(driver);
    TestModellerLogger.SetLastNodeGuid("4599d218-f996-412e-88ba-291d4214c123");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("82984690-ec9a-4450-9c12-ecf1385aea4a");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8f854726-7bfb-48b9-89c3-c10d04ef16b8");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ac5fe3cc-42f7-4233-8490-a166cce43085");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("e3e79fe7-34e1-4fc5-ab75-7fda8f74a8ba");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6a4075cf-0500-41c8-a693-17186f45c238");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("55d0a40e-ddd7-4d87-8489-b7e44d92fe0e");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("782b8dec-c86b-4e5b-89e1-d99715a4f4ba");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("931ecb2a-a3c2-4889-97b2-740775d90025");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("6c8c1fc6-8887-4264-a30e-b669cc101696");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1785fa24-91e5-4a65-8be5-57884ae274e3");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("65eb2ce1-3219-4f93-a570-0d95db64cf87");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ddda196f-0841-4b53-8784-a1edfda2e0b9");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("ba7f6c8e-6679-4115-9be5-1e2be7d66389");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("b483eda6-ae84-4512-917c-805cb876114f");
    _Verify_Form_CT600A_is_editable_after_unlocking_the_returnFA71518.Click__CT600_Tax_Return_();
    

    }

}
