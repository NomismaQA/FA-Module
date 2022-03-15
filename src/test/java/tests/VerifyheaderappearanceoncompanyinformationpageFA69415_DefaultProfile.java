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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/26de7a01-36a6-463a-b76c-efbeb9282ab2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1414, profileId = 101279)
public class VerifyheaderappearanceoncompanyinformationpageFA69415_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_company_information_pageFA69415","Verify_header_appearance_on_company_information_pageFA69415 - Default Profile"})
    @TestModellerPath(guid = "ae33a55b-b399-4305-9616-83beba4e73a8")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceoncompanyinformationpageFA69415_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_header_appearance_on_company_information_pageFA69415 _Verify_header_appearance_on_company_information_pageFA69415 = new pages.Verify_header_appearance_on_company_information_pageFA69415(driver);
    TestModellerLogger.SetLastNodeGuid("3dd53aa3-154d-4b46-a0aa-9e544655b604");
    _Verify_header_appearance_on_company_information_pageFA69415.GoToUrl();
    
    
    TestModellerLogger.SetLastNodeGuid("5a3e5ee5-7dd4-4e15-8b49-1041669e0c43");
    _Verify_header_appearance_on_company_information_pageFA69415.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("48bd1afe-c043-4776-b5f1-98ea31937e41");
    _Verify_header_appearance_on_company_information_pageFA69415.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2c98942f-dbc4-4549-8c64-36c0c83d7281");
    _Verify_header_appearance_on_company_information_pageFA69415.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ff4b5a3d-2e8a-4cb7-937e-d5b6de88840d");
    _Verify_header_appearance_on_company_information_pageFA69415.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1394f9c6-aeee-47b6-8d28-8f333b70b5d8");
    _Verify_header_appearance_on_company_information_pageFA69415.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("dd371921-7359-40ef-9a80-d489d65db276");
    _Verify_header_appearance_on_company_information_pageFA69415.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("83dc5fe8-4a8d-407f-ac2d-f729849397d8");
    _Verify_header_appearance_on_company_information_pageFA69415.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b485c704-c01c-4ae7-bde8-da441067fbd1");
    _Verify_header_appearance_on_company_information_pageFA69415.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f0115685-07e4-4dca-8ca9-c633c6c0ec6b");
    _Verify_header_appearance_on_company_information_pageFA69415.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("bef5c334-7321-403e-8529-e8467e4d67cb");
    _Verify_header_appearance_on_company_information_pageFA69415.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("130ca193-f804-48a5-a0d0-e37552eff8d8");
    _Verify_header_appearance_on_company_information_pageFA69415.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("9c7b3ceb-2212-4965-b7ee-cd1d646d2bb5");
    _Verify_header_appearance_on_company_information_pageFA69415.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("94a749e9-9ee6-4d33-bef4-240aa5fd9609");
    _Verify_header_appearance_on_company_information_pageFA69415.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8714e4b7-2b54-47ce-a5b4-3aa5b14d5eca");
    _Verify_header_appearance_on_company_information_pageFA69415.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("7e140b2d-58ab-474e-acc3-d93348c425ca");
    _Verify_header_appearance_on_company_information_pageFA69415.Click_Full_Accounts();
    

    }

}
