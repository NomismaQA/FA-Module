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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4388362e-296d-4eba-9631-1b9e50f7e4aa
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1666, profileId = 101922)
public class Tax6FA775_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Tax6FA775","Tax6FA775 - Default Profile"})
    @TestModellerPath(guid = "e110e2f1-0344-4098-bcea-8700030beeda")
    public void GoToUrlAssertUrl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Tax6FA775_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Tax6FA775 _Tax6FA775 = new pages.Tax6FA775(driver);
    TestModellerLogger.SetLastNodeGuid("36d1dfb6-1ec4-405e-a60f-17e8fdb85516");
    _Tax6FA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fa09ba82-f27c-45ee-a138-9a351cd876bd");
    _Tax6FA775.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _Tax6FA775.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _Tax6FA775.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _Tax6FA775.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _Tax6FA775.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _Tax6FA775.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _Tax6FA775.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _Tax6FA775.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _Tax6FA775.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _Tax6FA775.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _Tax6FA775.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _Tax6FA775.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _Tax6FA775.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _Tax6FA775.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _Tax6FA775.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _Tax6FA775.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _Tax6FA775.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _Tax6FA775.Click_Full_Accounts();
    
    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _Tax6FA775.Click_Income_Statement_Page();
    
//    TestModellerLogger.SetLastNodeGuid("e890f0fb-0b49-45d4-abd2-06f41ec29727");
//    _Tax6FA775.Click_Tax();

    }

}