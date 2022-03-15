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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/976e8fd4-6046-48cd-ae0e-585e19929d68
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 939, profileId = 100831)
public class VerifydefaultstatusofMembersbenefitsadvancescreditandguarantees58_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58","Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58 - Default Profile"})
    @TestModellerPath(guid = "bdf6c690-a27b-4b66-97fc-192ff838774d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofMembersbenefitsadvancescreditandguarantees58_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58 _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58 = new pages.Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58(driver);
    TestModellerLogger.SetLastNodeGuid("5611bf5c-a552-4fe6-b805-c181a881cbf1");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("84eccd76-6a01-4975-ac93-fe58c9433458");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d7663d4e-eb35-47d8-ab9d-9c7201919977");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("fd5b1c4c-0e82-4e79-b2e1-dff9f7ab96f2");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0ef7371f-9477-499a-9c62-12bae151b9e7");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("b7b28150-34c1-496d-8647-388c0fac4c9a");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d355aec3-135c-416f-9dcd-07aa3c558356");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("70cd5fa8-5027-4576-a4ef-e81f0412f41f");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("32fa209e-3cc8-445b-8f08-8d5a7172f026");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("8b1c77b5-8d2c-4fe2-bae5-f6c3721a04d5");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("37d8c628-fce4-48c1-812e-77d31c9b8185");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("826568a1-3602-432d-bce6-f8e4a2ea9b34");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("bfb45fbb-f3af-45ae-82c4-8321f0458888");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("e640412a-cd2b-4281-8c76-df2f6e20a02e");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("337d4d24-dadb-4ce9-b973-4bc9a74e2cb0");
//    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("3b44aa8a-2dc2-4051-9ff7-e4d7bd04e773");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("ac494ec3-928c-4a11-9f88-8166c81e648f");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d120a5c4-9e04-4130-8f13-4ae6d340dc06");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4bab395e-c586-4d6e-bd20-2441c303855c");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("8b929026-c4d3-4626-be40-28e73bde09b4");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("3b44aa8a-2dc2-4051-9ff7-e4d7bd04e773");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("55f8f588-bf48-450a-b22f-e076db449db1");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees58.Click_Full_Accounts();
    

    }

}
