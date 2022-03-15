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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/69e781aa-2b93-4272-ac14-73b9d41e92ed
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1393, profileId = 101259)
public class VerifyregistrationnumberappearingoncoverpageFA6941_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_cover_pageFA6941","Verify_registration_number_appearing_on_cover_pageFA6941 - Default Profile"})
    @TestModellerPath(guid = "aec11c76-f3e7-4e88-a37a-10600cc84b38")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberappearingoncoverpageFA6941_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_appearing_on_cover_pageFA6941 _Verify_registration_number_appearing_on_cover_pageFA6941 = new pages.Verify_registration_number_appearing_on_cover_pageFA6941(driver);
    TestModellerLogger.SetLastNodeGuid("cc441a9e-620f-46b1-aad4-9cd1d33286cd");
    _Verify_registration_number_appearing_on_cover_pageFA6941.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9702b531-c41a-41db-94ec-d1565d6f66df");
    _Verify_registration_number_appearing_on_cover_pageFA6941.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("709c90cb-bf22-43ca-9fe9-57e30858ca6f");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("490ef034-3303-46e7-bc83-f418e0a620ee");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("f7e53f60-5aa9-49e0-8504-c6e521ca02f9");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("5996324b-f0b8-48fe-99d2-d6e0e36f780a");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("40102443-b7dc-443b-bfac-ef0bce51b5c6");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ab2ce2ac-c7c8-4d4e-8c44-93c19400055a");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("9ee9e6ef-800c-4f7e-b8c4-4f0ef3fee08b");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e1562d9f-22bb-4cbd-a486-eba6d9756a2d");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f1e45c05-4ad2-4e6b-83d1-474dcccdca4a");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("3e3dffaa-e4c2-46a0-99d1-a3344ac93b7a");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f1e7c51b-aa78-4ec8-adaf-18fc6fa18779");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("59b3f135-a4e4-41a3-83c0-c662af5d99c0");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("4557c9f3-ba3b-4526-b935-275c70d587bb");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e4b77ffa-04b5-43b6-9884-0b5163be4cfc");
    _Verify_registration_number_appearing_on_cover_pageFA6941.Click_Full_Accounts();
    

    }

}
