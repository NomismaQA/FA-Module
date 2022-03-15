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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/12210c54-2b1c-4644-9f95-bd97f67d8ab0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1496, profileId = 101412)
public class VerifyCTOtherAdjustmentsiseditableafterunlockingthereturnFA71520_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520","Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520 - Default Profile"})
    @TestModellerPath(guid = "0ad2fd7c-4cdb-4503-a6b9-b452742a574d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyCTOtherAdjustmentsiseditableafterunlockingthereturnFA71520_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520 _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520 = new pages.Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520(driver);
    TestModellerLogger.SetLastNodeGuid("1c13a1bb-7828-4c8d-be33-d10795a96a1e");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7adcdcc0-1c18-4d62-b81a-d89ac7eab3ce");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3a743c40-aa94-4264-838b-284d16999c2a");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f8e8fe20-c9aa-47af-a4e8-5585f0432de6");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("767c39ec-6a63-48db-8c00-893a4aaf4fd2");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4cfb33ab-66e6-412b-98e3-868dd623ba85");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7cbc8ef5-e82f-4408-bb33-fb7afacab999");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("6dec2131-0ea1-4dae-ad2b-5c34db4781ad");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0fe0de3e-8c27-4708-bff7-f56a93798333");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("8e98d166-8680-42ff-9a3d-9e4479b06666");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0844669d-4244-48ab-8b0d-b76f7baa50c3");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("fd7f467e-2c13-460a-a326-fa30eec6ed8f");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("6385086b-fe58-4ab3-bf6e-9b867f06bba3");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("f47607ca-5556-4fa3-8320-6237013ebe3f");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("c46a1cbe-7462-43b9-bb43-3f4857237a8b");
    _Verify_CT_Other_Adjustments_is_editable_after_unlocking_the_returnFA71520.Click__CT600_Tax_Return_();
    

    }

}
