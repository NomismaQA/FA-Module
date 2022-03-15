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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a7de0419-5c2e-427a-8b17-6aae0b1b61ef
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1113, profileId = 101009)
public class VerifypartnershipsecretaryappearingonPartnershipInformationpage17_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_partnership_secretary_appearing_on_Partnership_Information_page17","Verify_partnership_secretary_appearing_on_Partnership_Information_page17 - Default Profile"})
    @TestModellerPath(guid = "30b8fca0-0621-40ec-a7dd-95002bac64f8")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifypartnershipsecretaryappearingonPartnershipInformationpage17_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_partnership_secretary_appearing_on_Partnership_Information_page17 _Verify_partnership_secretary_appearing_on_Partnership_Information_page17 = new pages.Verify_partnership_secretary_appearing_on_Partnership_Information_page17(driver);
    TestModellerLogger.SetLastNodeGuid("1118028f-957a-4da2-9616-8f45abd058bd");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b19da751-5dbc-4cdb-b219-a320ea6003f6");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ea321bd2-b10a-4ebc-9134-b250ef982747");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("01c7587a-f71e-4906-9d71-738c9b78cb57");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("49a687a8-b889-47ea-a970-f188295096ad");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f798475e-c65b-4a23-8be6-75a31e1e93fb");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8e8bd861-642b-4e5a-b241-b144bae321d5");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("fd0a9f75-68c9-4a32-b383-a85389cbf3f2");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ba97156c-126a-40f3-9369-b4663c4ab8c9");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c2f84f6a-da55-444a-b698-96eb686d9b97");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("af717551-a715-4846-a3ee-525956bffd27");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("9134a7dd-5cde-4e40-bef6-675825a8bc8f");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("6f4627eb-cdd2-466c-be57-f0da3d2b0180");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("bdc19537-5c47-41d6-b51b-3fb1bc998b39");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d09eef9c-86df-4f47-bffb-015c9dfbca36");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("ba6c619d-0522-475e-8e04-3ca5882fddcb");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b0258dac-b526-45fc-b488-061528932dc5");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("e67d9cb2-38cc-4238-9f94-aad014e84140");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("19b6e44a-1d37-4ae4-bc80-f952500ca7f0");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("a0500c60-844f-4410-b5b1-c10aafb6794d");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("4c01408c-b5eb-45e2-961a-6357247e0661");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("e7a51eb8-9d7e-44c1-a757-7a7f9c947057");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("a4a80a52-5bcd-467e-9740-45460b8fe640");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("35a36853-dfdf-43c5-bef9-e889c9e68646");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("a4772a44-abbf-45a7-9a4d-a6819004c2b4");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("41dc73f9-579c-4aa9-ae4a-80af135d6c1b");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("4f4639d9-9700-4f12-ae5c-6ed2f1e4805e");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("c9eaa3ee-1447-4857-8d66-e7d20e7eb342");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("9abe4889-935b-472c-b0aa-edf68e31d703");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("bc502f31-9ab9-4b2a-a60e-8f6b2949f642");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("fbe65859-b526-455b-8715-34ce37756837");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("6ac215da-6a08-4ef1-9b08-ed8829c3886d");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("caaf987d-1ee6-47bf-a03d-0374cfd43ff0");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("f21038ca-b0b9-4117-9114-00bb6b191931");
    _Verify_partnership_secretary_appearing_on_Partnership_Information_page17.Click_Partnership_Information();
    

    }

}
