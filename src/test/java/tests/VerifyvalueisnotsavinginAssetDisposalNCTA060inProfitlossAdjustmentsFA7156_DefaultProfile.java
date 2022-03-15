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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3e1b8271-6398-43c9-a1a7-37c3e990a576
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1476, profileId = 101358)
public class VerifyvalueisnotsavinginAssetDisposalNCTA060inProfitlossAdjustmentsFA7156_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156","Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156 - Default Profile"})
    @TestModellerPath(guid = "e9d0cb5f-f791-4127-9ae9-6ff4b9baf3b5")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyvalueisnotsavinginAssetDisposalNCTA060inProfitlossAdjustmentsFA7156_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156 _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156 = new pages.Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156(driver);
    TestModellerLogger.SetLastNodeGuid("e90c64cb-9fa3-483d-9345-b801088740e0");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec0aa800-bca0-4246-afd7-d60f3f20f733");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("908d614b-c3fb-4259-8531-4634ea8e4cc3");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0fefd5b2-0cb5-4171-ba26-6989dc8ab5ca");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("e7b529c0-5287-4951-8ee3-ddfb822e2d31");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ba70d85f-5ea2-40b1-af8a-e014a25ceeb9");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d0486dd9-3de6-4c06-b36d-bc49ab3608e3");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ae2c69cb-979d-4d9b-baaa-fd22e2677c22");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("e7108ad0-7c32-40ce-9d74-5b3b8132c309");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("13254f21-76cd-4ae6-90f7-172bc3eea833");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ad0339a8-0e1a-4347-abe3-e93af43777aa");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("107555e7-8832-4cdf-9379-db629590c578");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("21a6f484-10d7-4ab7-ac05-41e476288d91");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("6004f37e-3049-40f4-b294-8732fef3c966");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("c76dc255-6ae8-4b74-b05f-72e4b07f01b6");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("b10c0daa-3527-411b-b65f-204f133180b4");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click_CT_Adjustments_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4bcfd349-b9ee-441e-adf4-c488d8da9684");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click_ProfitLoss_Adjustments();
    

    TestModellerLogger.SetLastNodeGuid("0842bf5a-b365-470b-9717-48dcdfce5e11");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__Edit_();
    

    TestModellerLogger.SetLastNodeGuid("063f49be-4f79-40db-aab4-12f9a8551f93");
    _Verify_value_is_not_saving_in_Asset_Disposal_NCTA060_in_Profitloss_AdjustmentsFA7156.Click__Save_();
    

    }

}
