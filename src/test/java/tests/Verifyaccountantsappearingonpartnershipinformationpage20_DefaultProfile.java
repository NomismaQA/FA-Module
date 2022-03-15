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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4473391b-dfc7-4ed6-82a6-3bde66b20c5e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1120, profileId = 101015)
public class Verifyaccountantsappearingonpartnershipinformationpage20_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_accountants_appearing_on_partnership_information_page20","Verify_accountants_appearing_on_partnership_information_page20 - Default Profile"})
    @TestModellerPath(guid = "5f5e2309-96eb-4310-901d-9a2d21050332")
    public void GoToUrlAssertUrlPositiveEnterctl00cPHFiltertxtAgentNameClickSearchbutton1ClickNakulClickClient() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyaccountantsappearingonpartnershipinformationpage20_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_accountants_appearing_on_partnership_information_page20 _Verify_accountants_appearing_on_partnership_information_page20 = new pages.Verify_accountants_appearing_on_partnership_information_page20(driver);
    TestModellerLogger.SetLastNodeGuid("acdbe75c-ab8a-441a-9c01-9f2f8b335a11");
    _Verify_accountants_appearing_on_partnership_information_page20.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a25de9a2-ec36-4650-8886-2d0070a9ef57");
    _Verify_accountants_appearing_on_partnership_information_page20.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("0c897799-05cf-4a34-854d-ee78400059a4");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e81da4de-8990-4634-b509-25dff43d93e8");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9afce299-8828-4e36-94ee-771833d2e6cb");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d436b062-7540-4ec9-9197-328f40285850");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d1d10112-1658-4423-903a-e24b9304734c");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("956d7b06-a667-432c-b80a-803e50018319");
    _Verify_accountants_appearing_on_partnership_information_page20.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("9fa93330-6efc-43bd-a3f2-03739317b125");
    _Verify_accountants_appearing_on_partnership_information_page20.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e1d0bf74-9f46-4430-9d52-ddf4409ccbed");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f1e947c7-8e6f-4e29-a3b6-eab7f903654f");
    _Verify_accountants_appearing_on_partnership_information_page20.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("2aece07d-5164-429e-811c-d45f27f8c096");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("b09f15a4-62de-441e-b1f7-cdc265a0d5fa");
    _Verify_accountants_appearing_on_partnership_information_page20.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("db106a43-d3e6-4c36-b7dd-e0163ca23c20");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("5110e4f3-8058-4b41-8632-33a92a3a1761");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("70fd1094-5b8d-4e4c-91e5-10117964a9e3");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("2e99314f-c394-4e30-b875-2589e98656c3");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("66045211-8551-427c-a731-9537713b4455");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("79caeedc-062a-4e1d-abd3-7170c9c2d708");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("dbc59173-18fb-480d-bf2b-49bfa7b30795");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("fe8e9a66-f350-4164-967b-a4c3482abf44");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("8d4a3ab1-8bab-49df-9f89-ff7364aefbbb");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("d3f037b4-123d-41cf-b43e-21b4c7d4a728");
    _Verify_accountants_appearing_on_partnership_information_page20.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("bd076f44-bf43-45f5-9099-a0f595a6da81");
    _Verify_accountants_appearing_on_partnership_information_page20.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("047ba6dc-2995-4022-9c98-cefc4b763c0b");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("2b4fa5f1-85b4-4e52-9eca-fa07e8db37c4");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("e5d49b94-351c-4ee8-87dd-2d6eebaccc7b");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("82183715-f6b2-45e9-9504-c1a848a8a783");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("694f12e0-23a6-4218-acab-812883195f72");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("bdc6425a-c154-4cb8-a3fe-4f06bf41be60");
    _Verify_accountants_appearing_on_partnership_information_page20.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("65e7b5d6-3bb9-4d47-82f8-9c15b2f0972f");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("4912ee0b-bd00-4503-b487-839077481f64");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c30e6707-bd68-422d-84b2-c50322913dd4");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("7b02438f-4a24-47c8-bae2-4528b3cff324");
    _Verify_accountants_appearing_on_partnership_information_page20.Click_Partnership_Information();
    

    }

}
