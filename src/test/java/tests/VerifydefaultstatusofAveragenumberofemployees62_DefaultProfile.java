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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/68db8f13-7397-4e30-9fd8-96a85a432aa3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 991, profileId = 100885)
public class VerifydefaultstatusofAveragenumberofemployees62_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify default status of Average number of employees62","Verify default status of Average number of employees62 - Default Profile"})
    @TestModellerPath(guid = "a982aa24-14a1-4d70-9438-1c430a5565ac")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofAveragenumberofemployees62_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_Average_number_of_employees62 _Verify_default_status_of_Average_number_of_employees62 = new pages.Verify_default_status_of_Average_number_of_employees62(driver);
    TestModellerLogger.SetLastNodeGuid("968449cd-d412-42b3-b710-7d8d3140d853");
    _Verify_default_status_of_Average_number_of_employees62.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("45765a5e-29fc-4dce-8514-902dfe1134cd");
    _Verify_default_status_of_Average_number_of_employees62.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0a4eb3a-003a-4bda-9d6d-d96d39359fd8");
    _Verify_default_status_of_Average_number_of_employees62.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("cdb40e47-4d56-48d4-8be2-946e48399de2");
    _Verify_default_status_of_Average_number_of_employees62.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("98ec999e-4919-44b1-b1ab-8349a1341716");
    _Verify_default_status_of_Average_number_of_employees62.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4c862f80-9156-4405-b74f-c21cd09660b9");
    _Verify_default_status_of_Average_number_of_employees62.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("e672e129-49b1-4a06-9fb3-1a4b50a9c556");
    _Verify_default_status_of_Average_number_of_employees62.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("4672b707-b1f7-4349-9da5-cc6a49a38b33");
    _Verify_default_status_of_Average_number_of_employees62.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("1372fdd7-c1bb-44e4-b82b-ad797da7ab28");
    _Verify_default_status_of_Average_number_of_employees62.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a1aa0409-9776-4842-8d1c-5628255ae20e");
    _Verify_default_status_of_Average_number_of_employees62.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6aefc9a3-510f-4dac-976d-69f86ee59a7d");
    _Verify_default_status_of_Average_number_of_employees62.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("63995d32-5272-4ba5-8ba1-944af44b6896");
    _Verify_default_status_of_Average_number_of_employees62.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("36d52373-14ff-473f-881a-869150172215");
    _Verify_default_status_of_Average_number_of_employees62.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("da1a2881-b41d-4ea4-a125-723c988333bc");
    _Verify_default_status_of_Average_number_of_employees62.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("60ec4447-6cdd-45cb-a7aa-c534793fcb17");
//    _Verify_default_status_of_Average_number_of_employees62.Click__Settings_();
    

    
    

    TestModellerLogger.SetLastNodeGuid("9a0418d0-1e1a-40e6-ad62-fae806ce54f4");
    _Verify_default_status_of_Average_number_of_employees62.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("98f67e81-053d-4e5f-87d6-87c4af6aea60");
    _Verify_default_status_of_Average_number_of_employees62.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("bd084791-b9b2-4fce-a21e-efb4b28aad18");
    _Verify_default_status_of_Average_number_of_employees62.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("7926673b-7aad-4ad5-ae06-9097b4f08ada");
    _Verify_default_status_of_Average_number_of_employees62.Click_Save_Button();
    
    TestModellerLogger.SetLastNodeGuid("9a0418d0-1e1a-40e6-ad62-fae806ce54f4");
    _Verify_default_status_of_Average_number_of_employees62.Click_Final_Accounts2();
    
    

    TestModellerLogger.SetLastNodeGuid("f0752e57-6fd3-4eb1-a9a2-343849790fc3");
    _Verify_default_status_of_Average_number_of_employees62.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("232c8af0-1bc0-41fc-b35c-77aba8e844dd");
    _Verify_default_status_of_Average_number_of_employees62.Click_Statement_of_Financial_Position();
    

    }

}
