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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d118a62f-f825-4f31-8be0-997588f6b899
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1149, profileId = 101039)
public class Verifydefaultstatusofaveragenumberofemployeeson35699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_average_number_of_employees_on35699","Verify_default_status_of_average_number_of_employees_on35699 - Default Profile"})
    @TestModellerPath(guid = "82213358-fab9-4e99-bb00-36c1863e722f")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofaveragenumberofemployeeson35699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_default_status_of_average_number_of_employees_on35699 _Verify_default_status_of_average_number_of_employees_on35699 = new pages.Verify_default_status_of_average_number_of_employees_on35699(driver);
    TestModellerLogger.SetLastNodeGuid("1eea34a5-0770-4004-b6ff-27cc7cae4cbf");
    _Verify_default_status_of_average_number_of_employees_on35699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ee6ff25-b19f-4df5-bbec-3f4a4774a4ef");
    _Verify_default_status_of_average_number_of_employees_on35699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a857cc3a-36f0-4508-a1a7-039f3b0b07e3");
    _Verify_default_status_of_average_number_of_employees_on35699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b4ecdb40-10a7-4bc3-8a8c-bf6c02b4aa6e");
    _Verify_default_status_of_average_number_of_employees_on35699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("3ff7dac7-e444-483d-b2e8-e707262dc4c4");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("833cf854-c9df-41de-bbf9-7b56fb2c3b01");
    _Verify_default_status_of_average_number_of_employees_on35699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("44b93d2b-d0e1-45c8-949e-3a622e39980c");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("1d89412c-3ad5-40a7-9ac1-0b7801e2e9dc");
    _Verify_default_status_of_average_number_of_employees_on35699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4f0f0b4d-b3fc-42e1-b90c-a39ed636d0cc");
    _Verify_default_status_of_average_number_of_employees_on35699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("26d23e07-cb12-41bf-b03b-b80307c6e04b");
    _Verify_default_status_of_average_number_of_employees_on35699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c8f5bf30-6501-4045-89f4-fb8dc6e76ee7");
    _Verify_default_status_of_average_number_of_employees_on35699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("0ced5410-70e2-43f0-868e-f19f6011a1f0");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("77437fd8-0a6e-48fe-9595-df6887bf02fb");
    _Verify_default_status_of_average_number_of_employees_on35699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("c64e9da3-d575-46e8-8e66-904da974d2ab");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("5883d2e1-7fa9-444f-b4f7-d6a0119f58b8");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("8ec326a9-871b-4403-b550-7489ce65546b");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("1a26d820-f657-44ca-bbc2-56629b93f5e6");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("fca3e794-a597-4a08-89ae-ba770be05a3b");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("7d09b312-a70f-4fbc-9ed6-f06dab8a7c9f");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c91c0c44-14a0-4f8b-83f8-010a88ac5237");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("4579bead-20a3-45c8-91f0-7e11495d4b87");
    _Verify_default_status_of_average_number_of_employees_on35699.Click_Statement_of_Financial_Position();
    

    }

}
