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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3f93b009-38d5-43b7-b48a-933db236d5c5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1475, profileId = 101355)
public class VerifyRDenhancedallowanceNCTA045inProfitlossAdjustmentsisnoteditableFA7155_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155","Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155 - Default Profile"})
    @TestModellerPath(guid = "951b7072-908d-4839-870c-df0d86b3f362")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEntercPasswordClickLoginButtonPositiveEnterAgentN() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyRDenhancedallowanceNCTA045inProfitlossAdjustmentsisnoteditableFA7155_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
       pages.Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155 _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155 = new pages.Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155(driver);
    TestModellerLogger.SetLastNodeGuid("5e78fb93-be96-4168-8783-0692cfe2cbbd");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("46521512-6786-4b91-8596-89436db66dca");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ec1a93d7-22e2-4d65-9695-8d2a15f67045");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("775a6b9e-151c-4c8c-8e54-01d656374189");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Enter_cPassword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("bc8a0231-67fb-4470-b222-6c4e323840a8");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("caa45da8-c2c3-4cef-a699-4431efa54c98");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d0201650-4209-47cc-a359-fc80791b1653");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b4a8e1d7-3fd2-4bcb-a585-d9d5287ebceb");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("68c21a95-5cc6-4310-a152-89e6cb59f56d");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a3f273ac-755d-4760-8b0f-daf897b3658a");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("379e8ed1-fce8-4490-921b-5817660aba82");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("7bc03831-74e1-4d20-8fb4-d7c1837ab25f");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1418628b-193a-41b4-9270-d4cb7e84f913");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("6004f37e-3049-40f4-b294-8732fef3c966");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("4e94d9aa-c850-4174-ab54-ebdfc1ad1228");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("eddeb975-01ce-4ff2-a8c4-0a59613d444e");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click_CT_Adjustments_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4d65c2e7-f398-4ac3-875d-a7eb1e497eec");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__Edit_();
    

    TestModellerLogger.SetLastNodeGuid("0275453c-4dd3-4bac-875f-1414ad37b0cf");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Enter_NCA046("500");
    

    TestModellerLogger.SetLastNodeGuid("1d7eba06-4c8d-4ed6-bf2c-c324b5f083ea");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("3ea74488-cc39-4279-88e9-f88e6d9d1025");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("6b771f29-f880-437c-af37-25d5aa60ac7b");
    _Verify_RD_enhanced_allowanceNCTA045_in_Profitloss_Adjustments_is_not_editableFA7155.Click_CT_Computation();
    

    }

}
