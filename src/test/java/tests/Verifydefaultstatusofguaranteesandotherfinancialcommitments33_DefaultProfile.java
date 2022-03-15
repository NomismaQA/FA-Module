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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/fde6c92f-d4fe-4166-88e0-35e63bf9f801
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 920, profileId = 100813)
public class Verifydefaultstatusofguaranteesandotherfinancialcommitments33_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_guarantees_and_other_financial_commitments33","Verify_default_status_of_guarantees_and_other_financial_commitments33 - Default Profile"})
    @TestModellerPath(guid = "23ac6c85-2042-4e62-b001-2f34f5d21043")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofguaranteesandotherfinancialcommitments33_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        pages.Verify_default_status_of_guarantees_and_other_financial_commitments33 _Verify_default_status_of_guarantees_and_other_financial_commitments33 = new pages.Verify_default_status_of_guarantees_and_other_financial_commitments33(driver);
    TestModellerLogger.SetLastNodeGuid("ececa642-8a1c-4e89-afca-103da2a8ec24");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0d0924c-31dd-45d4-a35d-e0b095de71e8");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("88ecac06-dcfb-4568-ab82-7a069f18e4e6");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d909b72c-9bac-4ad5-8e5a-f1ba9afaa01d");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("d50a3562-c44f-43ea-8100-e7bac466fd70");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("22539d51-06b2-4e52-a5e2-4355115a36f3");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2debcc34-4d37-46ff-a076-9320a2658cc5");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2fe34dc3-5d82-4320-bcc4-a40a5391d410");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("3cbfa4fc-638d-4959-884a-6cc9dbd6556b");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f371e0fe-0f77-43fe-b42c-31aa749a19aa");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("feb09282-2915-4c08-a9ba-e865d5763938");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("cd06f224-4ed8-4faa-bef3-be5399a4c619");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Search_button1_1();
    

    TestModellerLogger.SetLastNodeGuid("3f9d7db0-e435-4095-bc39-00ed5306163e");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("35ee01e0-308a-4dd4-856a-e07833c2aa48");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("fa451bd4-aa06-4c23-a6c8-2777f573e5d0");
//    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("46cbc6bf-eff3-415c-9586-8e4186fb15ee");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("e6534941-b014-4ec5-8c24-9eda5e136ad5");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("34ea916f-1166-43cf-ad42-565610c939da");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("7cf7f863-e9c9-496e-9f6b-46bd462824e0");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("52fa34a4-3712-4319-aeed-619e0d3e7e57");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("46cbc6bf-eff3-415c-9586-8e4186fb15ee");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("13700a9b-500a-4465-b4ae-6648d9459fe8");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("23d52133-ad6f-417c-a32c-bf96bacdca16");
    _Verify_default_status_of_guarantees_and_other_financial_commitments33.Click_Statement_of_Financial_Position();
    

    }

}
