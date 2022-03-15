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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/1da8e9d3-dc6e-4ed8-a60f-480d898da0a0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1148, profileId = 101038)
public class Verifydefaultstatusofaveragenumberofemployeeson34699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_default_status_of_average_number_of_employees_on34699","Verify_default_status_of_average_number_of_employees_on34699 - Default Profile"})
    @TestModellerPath(guid = "242abc02-e27b-4696-a32b-de301f37af51")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {

ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofaveragenumberofemployeeson34699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        pages.Verify_default_status_of_average_number_of_employees_on34699 _Verify_default_status_of_average_number_of_employees_on34699 = new pages.Verify_default_status_of_average_number_of_employees_on34699(driver);
    TestModellerLogger.SetLastNodeGuid("97a1ae8c-5f3b-4109-8537-b3f345d3a8f4");
    _Verify_default_status_of_average_number_of_employees_on34699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("20952f70-6ba7-4385-aecb-f17e37c0737d");
    _Verify_default_status_of_average_number_of_employees_on34699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d38c3dae-0c2c-488f-b659-3b40b9e7b0d5");
    _Verify_default_status_of_average_number_of_employees_on34699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("fc50bd14-5937-4ac4-ac83-70e26c6b4488");
    _Verify_default_status_of_average_number_of_employees_on34699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("419fa0b7-3109-4d7e-82b7-d07035ca1512");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1c232988-15a0-48a6-a5b7-a1d2f3fa0c3c");
    _Verify_default_status_of_average_number_of_employees_on34699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("cc66677c-a4fb-488c-a728-9b34dec3b325");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("426132a8-dbb7-4082-b493-3cb8fc7adc13");
    _Verify_default_status_of_average_number_of_employees_on34699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("617ce3f1-1021-4258-babe-5b9e1d652e5e");
    _Verify_default_status_of_average_number_of_employees_on34699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("2b4cd567-c0b3-4660-9005-76a56f95e17a");
    _Verify_default_status_of_average_number_of_employees_on34699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("78427048-7d16-49dc-a4cd-77d21c62a220");
    _Verify_default_status_of_average_number_of_employees_on34699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("25afcf13-0183-4b90-ad6e-310961543ffe");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f377e300-0457-4369-ad5e-76e950559bdf");
    _Verify_default_status_of_average_number_of_employees_on34699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("ba92246a-2748-4a7a-a6f2-2de7a5c4c384");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("289704b7-98ab-4251-84dd-0038f950f900");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("976daf91-61b5-4369-b362-bbfdc1d6c5d9");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("e71c4018-38e4-42cb-9e31-0e319b8f4456");
    _Verify_default_status_of_average_number_of_employees_on34699.Click_Statement_of_Financial_Position();
    

    }

}
