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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b3940bab-edf3-4a5a-b618-84ba222b466b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1515, profileId = 101484)
public class FA775newclientmodule_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"FA775newclientmodule","FA775newclientmodule - Default Profile"})
    @TestModellerPath(guid = "41ce235d-36db-48ea-986b-2bd5ab7e3441")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775newclientmodule_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.FA775newclientmodule _FA775newclientmodule = new pages.FA775newclientmodule(driver);
    TestModellerLogger.SetLastNodeGuid("94585f37-511f-45c0-a60f-2839b3d36cd6");
    _FA775newclientmodule.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("dd60d0a4-d480-4b32-9693-eb7d9d32763e");
    _FA775newclientmodule.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _FA775newclientmodule.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _FA775newclientmodule.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _FA775newclientmodule.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _FA775newclientmodule.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _FA775newclientmodule.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _FA775newclientmodule.Click__Nakul_();
    
//    TestModellerLogger.SetLastNodeGuid("f320602a-22cc-4323-be1d-cfd1078d2429");
//    _FA775newclientmodule.Click_Add_new_client_link();
//
//    TestModellerLogger.SetLastNodeGuid("6dde6a70-b015-4674-b740-699d051a7f37");
//    _FA775newclientmodule.Click__New_Client_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d83dfd3c-b65c-42c7-a98f-dbc0d3c096c2");
//    _FA775newclientmodule.Click_Limited();
//    
//
//    TestModellerLogger.SetLastNodeGuid("954abf56-ab99-47c2-86cf-ac137442e41d");
//    _FA775newclientmodule.Click_Limited_Company();
//    
//
//    TestModellerLogger.SetLastNodeGuid("eca0d35b-9095-4ca0-8794-98241bc8a5d3");
//    _FA775newclientmodule.Enter_CompanyName(sData[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("f86ce2bc-65e4-44b7-ad61-e11f19d92350");
//    _FA775newclientmodule.Enter_RegNo(sData[6]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("97289125-d715-42ba-a85e-6697cb93820d");
//    _FA775newclientmodule.Enter_RegDate(sData[7]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("e61b8380-f8cd-4872-93b5-ee00400f4317");
//    _FA775newclientmodule.Enter_FirstName1(sData[8]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("e886ce21-1751-4b87-9e53-cd481f81c12c");
//    _FA775newclientmodule.Enter_LastName1(sData[9]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("5b0fa4c7-bd39-4113-b410-635208d0de4f");
//    _FA775newclientmodule.Click_Save_Button();
    

//    TestModellerLogger.SetLastNodeGuid("166bf229-27b3-46d1-a413-9fcbef40ff15");
//    _FA775newclientmodule.Click_Settings1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("801a29b7-b12a-4837-8988-a0c6e8248202");
//    _FA775newclientmodule.Click_Accounting_Period();
//    
//
//    TestModellerLogger.SetLastNodeGuid("e688a595-96a9-4026-94c8-3c05d055422c");
//    _FA775newclientmodule.Click_Edit1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("55bbf4c9-68c2-4b50-88e3-bf8d03f4edbe");
//    _FA775newclientmodule.Click_Add_Previous_Year();
//    
//
//    TestModellerLogger.SetLastNodeGuid("70c6734d-83f1-47fd-9e1c-ff837017ecbd");
//    _FA775newclientmodule.Click_Import_File();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3350f66a-33dc-4672-a089-7979ac9979b4");
//    _FA775newclientmodule.Enter_Attach1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d90e9480-b2ea-41af-8073-c0c30e681f8b");
//    _FA775newclientmodule.Click_Upload_Button();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775newclientmodule.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775newclientmodule.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775newclientmodule.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775newclientmodule.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _FA775newclientmodule.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775newclientmodule.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775newclientmodule.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775newclientmodule.Click_Full_Accounts();
    
    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
   _FA775newclientmodule.Click_Income_Statement_Page();

    }

}
