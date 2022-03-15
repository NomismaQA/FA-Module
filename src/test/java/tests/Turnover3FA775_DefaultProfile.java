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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b5415bc6-0b7b-4cec-bdd5-d2e289207184
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1532, profileId = 101535)
public class Turnover3FA775_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Turnover3FA775","Turnover3FA775 - Default Profile"})
    @TestModellerPath(guid = "55d585e2-bc43-4db2-bc19-39781ae320b9")
    public void GoToUrlAssertUrl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Turnover3FA775_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Turnover3FA775 _Turnover3FA775 = new pages.Turnover3FA775(driver);
    TestModellerLogger.SetLastNodeGuid("e3b610b0-a28f-4024-8c1b-e9139fda3d9b");
    _Turnover3FA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("da7ada97-012f-431f-baec-af0f0b91cd16");
    _Turnover3FA775.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _Turnover3FA775.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _Turnover3FA775.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _Turnover3FA775.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _Turnover3FA775.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _Turnover3FA775.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _Turnover3FA775.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _Turnover3FA775.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _Turnover3FA775.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _Turnover3FA775.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _Turnover3FA775.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _Turnover3FA775.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _Turnover3FA775.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _Turnover3FA775.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _Turnover3FA775.Click_Full_Accounts();
    
    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _Turnover3FA775.Click_Income_Statement_Page();
    
//    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
//    _Turnover3FA775.Click_Turnover_value();

    }
    

    }


