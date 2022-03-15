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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/95883401-9cc3-40ce-80e4-6be137858df8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 989, profileId = 100883)
public class VerifydefaultstatusofAveragenumberofemployees61_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;    

    
    @Test  (groups= {"Verify default status of Average number of employees61","Verify default status of Average number of employees61 - Default Profile"})
    @TestModellerPath(guid = "0cb2faaf-b311-423b-a20a-32bec2ddb97b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofAveragenumberofemployees61_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_default_status_of_Average_number_of_employees61 _Verify_default_status_of_Average_number_of_employees61 = new pages.Verify_default_status_of_Average_number_of_employees61(driver);
    TestModellerLogger.SetLastNodeGuid("11f8eac4-3cd8-45c5-aea7-42c633de8b7a");
    _Verify_default_status_of_Average_number_of_employees61.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b1d3589f-37f6-47e2-8297-118d7f2eca7b");
    _Verify_default_status_of_Average_number_of_employees61.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d6bcb067-62f9-48dd-9913-b998771b65a2");
    _Verify_default_status_of_Average_number_of_employees61.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("bb23bd66-fb5d-4d6d-b2bf-2935d20c38cc");
    _Verify_default_status_of_Average_number_of_employees61.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("09ff47bc-c8eb-4d97-ab39-5cedbced8d14");
    _Verify_default_status_of_Average_number_of_employees61.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f6f9a2e0-81b6-4338-8c48-855edb78c4cd");
    _Verify_default_status_of_Average_number_of_employees61.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1d2d4862-10aa-44fd-ac97-99847454309c");
    _Verify_default_status_of_Average_number_of_employees61.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("cccd7724-4651-459d-bdb1-cd88f503982c");
    _Verify_default_status_of_Average_number_of_employees61.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("67cf7efc-8e6c-4e48-9614-fe8967e32e4c");
    _Verify_default_status_of_Average_number_of_employees61.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("98422938-ffed-4a7d-ae7d-9c08ff7292de");
    _Verify_default_status_of_Average_number_of_employees61.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("12b53a02-c708-437b-916a-cf2ccc8c9eb6");
    _Verify_default_status_of_Average_number_of_employees61.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("5032fa67-7be8-450e-baf1-6a37e2a630bd");
    _Verify_default_status_of_Average_number_of_employees61.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("18bac0bd-d95a-41d6-b4af-a8ab69e27ad6");
    _Verify_default_status_of_Average_number_of_employees61.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("9ff478e2-576c-43e4-9e1f-acd6d51954f8");
    _Verify_default_status_of_Average_number_of_employees61.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("71c3fc25-4317-41b4-835d-b1659a559d37");
    _Verify_default_status_of_Average_number_of_employees61.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3a3580cc-d689-4005-920d-05acfaf68dd5");
    _Verify_default_status_of_Average_number_of_employees61.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("3e21c160-dc14-4932-a67b-3595c3dd33c6");
    _Verify_default_status_of_Average_number_of_employees61.Click_Statement_of_Financial_Position();
    

    }

}
