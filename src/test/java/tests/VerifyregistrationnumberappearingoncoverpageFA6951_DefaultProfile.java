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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3d3b9c74-d531-4866-9bc8-c7fd02b0b5b2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1448, profileId = 101331)
public class VerifyregistrationnumberappearingoncoverpageFA6951_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_cover_pageFA6951","Verify_registration_number_appearing_on_cover_pageFA6951 - Default Profile"})
    @TestModellerPath(guid = "ae09bf79-78ee-448f-a9e6-91d7b977c8fb")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberappearingoncoverpageFA6951_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_appearing_on_cover_pageFA6951 _Verify_registration_number_appearing_on_cover_pageFA6951 = new pages.Verify_registration_number_appearing_on_cover_pageFA6951(driver);
    TestModellerLogger.SetLastNodeGuid("487fb8ab-745a-4d95-b00d-14197432f0d4");
    _Verify_registration_number_appearing_on_cover_pageFA6951.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ad25ac40-cfa9-447b-97e2-5cc2807e32b3");
    _Verify_registration_number_appearing_on_cover_pageFA6951.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("02b95912-648f-477e-9527-e7b82de11bf9");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c88b2d87-ddd6-48e8-8264-ee503b460823");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("275cc4bb-7d2a-425d-a6f1-334800cbfa03");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("3cd99d50-e6c6-49a6-bc68-e7340c4580d0");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4bede3ba-5074-4d32-b7c3-938f35f3c49e");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("fdf156ee-7b8c-4b01-8adb-c5201e1ad407");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f2497423-a148-4e90-8a03-cba4a47abdd3");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("1cdb73b1-37bb-4ebb-bc07-ce43443adcc7");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e6f9896d-c9c7-4207-b0c1-2350f7ece6d1");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("9f7b1425-9aff-48f4-a91c-7b13b191734d");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("4001c885-0b24-4c7f-946e-1fab29c99735");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click__ABC_LTD_();    

    TestModellerLogger.SetLastNodeGuid("601443fd-fdbb-45de-8dbc-11d2b2ea0ed6");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click_Final_Accounts1();
       

    TestModellerLogger.SetLastNodeGuid("f1891e66-97cb-4bee-8b34-f5d4e6114493");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e82d8d36-33f1-4b8f-aa78-cd939736c046");
    _Verify_registration_number_appearing_on_cover_pageFA6951.Click_Filleted_Accounts();
    

    }

}
