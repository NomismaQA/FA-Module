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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/306d9511-2e93-4539-be7b-64cf0c3440e9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1147, profileId = 101037)
public class Verifydefaultstatusofguaranteesandotherfinancialcommitmentson33699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_default_status_of_guarantees_and_other_financial_commitments_on33699","Verify_default_status_of_guarantees_and_other_financial_commitments_on33699 - Default Profile"})
    @TestModellerPath(guid = "e70dc779-f958-4235-a213-3ef12cfe2845")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {

ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofguaranteesandotherfinancialcommitmentson33699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_default_status_of_guarantees_and_other_financial_commitments_on33699 _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699 = new pages.Verify_default_status_of_guarantees_and_other_financial_commitments_on33699(driver);
    TestModellerLogger.SetLastNodeGuid("8ec41e30-af2e-45bd-a745-d39d3722637c");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3c5f3b75-9352-473a-bac5-09700de79b3b");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("596f3609-ceb6-4251-b19f-58c174d44293");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4ffbca6c-4736-49cd-96ff-5d8911cb8705");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("602924e7-2df3-4e34-af07-d444e9d856b8");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6f8e7fb8-2f26-4e06-97e9-f482da65e0d0");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("fb263e35-993c-4be6-9f4e-7020aa5869d7");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("9afd28d7-e50e-4a08-9702-de470d0c1d23");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("2ead489e-b01d-4b96-8a39-65dc8859a970");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c5244c5b-0814-44c4-aa2a-962ee2c8184a");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("544180fe-8e31-44c9-9da9-cd8ba6904b5e");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("88def79a-a4c8-4f93-983d-15b63f46e823");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f0058cff-a75b-48ad-8fad-b8ce48dc2da3");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("6fb9a6b0-f11a-48bd-92ce-9e3a37d0fb58");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("2128b0eb-a336-4e33-9ed1-f37732d8680e");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("fd346477-304d-45a2-8f75-4e1ec3eb3320");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("2a9796a6-23b2-4e22-a3f3-19476fdd4a7f");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("351eeb22-803b-470c-8bd9-eaf2c51e9814");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("2481ceb5-6aaa-4a53-8452-1164c1cad576");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("5eef21cb-2811-42bc-b654-445c4b226f4b");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ee03632f-4ee0-4c1a-b581-ee0253684e37");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("9fdf9ca0-eb7f-42ed-8761-5fb619395dd0");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on33699.Click_Statement_of_Financial_Position();
    

    }

}
