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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/32344053-4fdf-44a9-ab53-7adc47c81c56
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1474, profileId = 101352)
public class VerifyRDexpenditureNCTA046inProfitlossAdjustmentsisnoteditableFA7154_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154","Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154 - Default Profile"})
    @TestModellerPath(guid = "0e39014e-438a-4788-8b16-098fa2a7ef1d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyRDexpenditureNCTA046inProfitlossAdjustmentsisnoteditableFA7154_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154 _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154 = new pages.Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154(driver);
    TestModellerLogger.SetLastNodeGuid("5203a139-1e54-4889-8018-f07f7a831462");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("08cbac7f-3c9b-4a36-93e5-823344880d7e");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("030ae9bd-b610-4c22-bf6f-7932927e3114");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("9f25ddfc-96d8-43fe-96e0-4227a571e949");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("d28b9087-b8c8-417c-bd11-82528e74db33");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d944bc29-bf79-430e-aad2-a08f8b50bbb7");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d4366d76-766d-44cc-91ff-e57a975524c5");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("425fee31-0f98-4e10-a5a4-d9c1ac700e5a");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("18228cbf-211b-47ef-ab67-5e970a37f2ca");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("1eaba3e6-4c64-4dd7-a963-a1bd2f5caf60");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a003da91-faa0-46c1-8126-b98e954671d4");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e259011c-f950-4522-9a4f-00e72c0e781d");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("dccede6e-c4b2-4e6f-9bf7-96cf0dddbc95");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("4af84107-6e32-4f6c-b1ce-9f3de50340df");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("660342bb-971e-4b47-9f41-8299c033f341");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("03a889c1-2123-4cc3-8e9a-4da95adff25f");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click_CT_Adjustments_Settings();
    

    TestModellerLogger.SetLastNodeGuid("cf83666c-df83-4e2c-9ce7-e82e50e1f59c");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__Edit_();
    

    TestModellerLogger.SetLastNodeGuid("c0486725-bcd1-452d-ad81-74041ecb8953");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Enter_NAC_046("100");
    

    TestModellerLogger.SetLastNodeGuid("2dba8d52-b781-4573-af7a-b2f78b811874");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("c9a3bad5-c517-40f9-9f47-073959615aa8");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("6affd5fd-8a32-48ac-b05a-b2e9cd740b26");
    _Verify_RD_expenditure_NCTA046_in_Profitloss_Adjustments_is_not_editableFA7154.Click_CT_Computation();
    

    }

}
