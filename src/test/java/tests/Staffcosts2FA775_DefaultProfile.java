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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/89b48af8-07b8-4f78-9eb0-70630f936c7e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1574, profileId = 101646)
public class Staffcosts2FA775_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Staff_costs2FA775","Staff_costs2FA775 - Default Profile"})
    @TestModellerPath(guid = "b614964b-9fc2-45b6-a902-300fbce1c0b2")
    public void GoToUrlAssertUrlClickStaffCosts() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Staffcosts2FA775_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Staff_costs2FA775 _Staff_costs2FA775 = new pages.Staff_costs2FA775(driver);
    TestModellerLogger.SetLastNodeGuid("4eb8b5d5-6fca-4b63-9594-4e18597431b8");
    _Staff_costs2FA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("03496672-bd9c-4a42-ae64-a29e3674d990");
    _Staff_costs2FA775.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _Staff_costs2FA775.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _Staff_costs2FA775.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _Staff_costs2FA775.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _Staff_costs2FA775.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _Staff_costs2FA775.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _Staff_costs2FA775.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _Staff_costs2FA775.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _Staff_costs2FA775.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _Staff_costs2FA775.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _Staff_costs2FA775.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _Staff_costs2FA775.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _Staff_costs2FA775.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _Staff_costs2FA775.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _Staff_costs2FA775.Click_Full_Accounts();
    
    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _Staff_costs2FA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("d7dfd195-db2e-4223-bd5c-3aa08fd9a18b");
    _Staff_costs2FA775.Click_Staff_Costs();
    

    }

}