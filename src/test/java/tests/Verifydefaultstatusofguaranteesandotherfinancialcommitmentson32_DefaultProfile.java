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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9b753ce1-4e66-4b67-9f28-5aa8606f83d1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1146, profileId = 101036)
public class Verifydefaultstatusofguaranteesandotherfinancialcommitmentson32_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
 

    
    @Test  (groups= {"Verify_default_status_of_guarantees_and_other_financial_commitments_on32","Verify_default_status_of_guarantees_and_other_financial_commitments_on32 - Default Profile"})
    @TestModellerPath(guid = "64300aff-3eb5-4bf3-b21d-9674146f3ea6")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofguaranteesandotherfinancialcommitmentson32_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_guarantees_and_other_financial_commitments_on32 _Verify_default_status_of_guarantees_and_other_financial_commitments_on32 = new pages.Verify_default_status_of_guarantees_and_other_financial_commitments_on32(driver);
    TestModellerLogger.SetLastNodeGuid("c71045bd-81be-45bc-80ff-4e4d189ec593");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("47cf7695-4447-47e2-94b8-72ca144b6355");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d4318a55-3d13-452f-8239-f94020ac60fc");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("6cd66705-0dcc-4912-9942-e46ebbe2d354");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("eefd0de9-c1a9-4011-b920-4c7e8de47c62");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("876b8adc-1131-42d0-bf0e-1d9bea22d883");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("3b05b20a-f76a-4caf-813d-7fafbc1d1d6e");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("6515539d-f103-4b6e-9f8f-1d6918ddb535");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("f09b6588-ca2f-41d9-9636-a64a96bcf9ba");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("5a3273cf-6751-49b4-98ff-64429ba9d945");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("7ded00e1-3230-422f-9b30-dc26c3f6fa72");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("6f3c7288-6740-4421-af55-044f6e0dda79");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("368fe483-4f06-4d35-86cd-1f1a4147c5bd");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("dffc8440-a017-449a-85c1-4bad72acbd06");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c5c9eb21-b189-4ae6-9bc3-625adcbb9495");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("a20dd3ce-abe6-4338-94d4-0f52f1dd9002");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("c493c9d4-1a15-4f33-8d95-156a5ff77838");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("dfa5e86f-20d0-4f0d-a9b0-640813d03e69");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("319834f8-3475-4b9b-a8d2-3c07f1279821");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("3908f6b9-827f-4ddb-882f-f152e5518e86");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("2282365a-563c-40cf-bc85-116ef1935638");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Filleted_Accounts();

    
    TestModellerLogger.SetLastNodeGuid("42cc75a7-c981-4467-97aa-60b2a4db5455");
    _Verify_default_status_of_guarantees_and_other_financial_commitments_on32.Click_Statement_of_Financial_Position();
    

    }

}
