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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/972d4cad-a71d-4a25-b9de-89d512e493b9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 937, profileId = 100830)
public class VerifydefaultstatusofMembersbenefitsadvancescreditandguarantees57_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57","Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57 - Default Profile"})
    @TestModellerPath(guid = "7858c1ea-2d04-4b5b-904c-2d45c2c1954a")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofMembersbenefitsadvancescreditandguarantees57_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57 _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57 = new pages.Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57(driver);
    TestModellerLogger.SetLastNodeGuid("06496550-76bd-407f-9f7b-a32cb393f072");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a843e598-ff8d-496e-8e7f-a357f4dc8734");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e1b0d6d4-d3e9-40bd-a3d3-a9619f6b39e0");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f285c3ec-aab1-4436-b788-91b3f088f50f");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("d522bd90-b101-42ae-9c12-fda9bddaeff1");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("93b9bccc-beec-44d2-a4f8-2856607f2ced");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4ee7fb35-e245-4fd0-9e58-bf2ee41c19eb");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8e6123f0-0ff3-4f13-add6-0114796fee08");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f149cff1-c978-4cde-8a4e-6313b620e0ef");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f7ef9565-fcf8-44c6-9d4c-1750b4651ae9");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("332a2206-e758-4fbf-afe6-6fbce3143a7b");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("7c9dd61e-fa11-40c2-afdc-e0a08d04ddc4");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("089bf959-ede1-4791-9242-130c8f2713a2");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("2f461e74-615d-4ef5-93b8-46a787404cc5");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("6d2a7719-82d7-4a1f-b3f0-bdc9ce1a8b67");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("28c147cc-6528-498c-b777-e9d121ab8082");
    _Verify_default_status_of_Members_benefits_advances_credit_and_guarantees57.Click_Full_Accounts();
    

    }

}
