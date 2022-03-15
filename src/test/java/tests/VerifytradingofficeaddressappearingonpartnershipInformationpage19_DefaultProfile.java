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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c3bb4c4a-1cba-47e9-9fe1-ab6b811b3c40
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1119, profileId = 101014)
public class VerifytradingofficeaddressappearingonpartnershipInformationpage19_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_trading_office_address_appearing_on_partnership_Information_page19","Verify_trading_office_address_appearing_on_partnership_Information_page19 - Default Profile"})
    @TestModellerPath(guid = "9c554176-c0a1-4b03-916c-bec161558072")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifytradingofficeaddressappearingonpartnershipInformationpage19_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        pages.Verify_trading_office_address_appearing_on_partnership_Information_page19 _Verify_trading_office_address_appearing_on_partnership_Information_page19 = new pages.Verify_trading_office_address_appearing_on_partnership_Information_page19(driver);
    TestModellerLogger.SetLastNodeGuid("3de57b4b-05c8-4bd3-a6f6-faf5ff9f6863");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("cec3107b-22a9-4509-87b1-8f594e3e4c70");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0c897799-05cf-4a34-854d-ee78400059a4");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e81da4de-8990-4634-b509-25dff43d93e8");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9afce299-8828-4e36-94ee-771833d2e6cb");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("8d69cfa6-2b9b-441c-89a8-8de6c0a925a7");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("425b8279-996e-4f7b-a46f-a1d7c43238fe");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("1cb8af08-dd43-4508-ac44-51e7a7318edf");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("6e2b9e09-4914-485d-9a72-d807a088c2ec");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a289158f-cec6-40cf-a22a-ce9cd0b92d39");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("9d75dd78-a64a-4d4a-acf9-1e8a00aa6cec");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("9e3fc6ed-674c-4eac-8624-4088bf363cd0");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e6f5f28f-ba67-475f-97f6-10206bd9e6af");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("1523db05-3c7c-4064-8785-c8998daeee91");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("97606779-872c-4525-91a1-dbb224f8deb8");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("7da9aebf-b3b7-4b8f-b7b5-1eae40c6e392");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("9a01ec31-b15f-4420-8da0-1e775514cd56");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("6a3079e7-0a04-453b-b16a-c1c8656918ed");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("dd20b12a-e919-43f8-bcc0-c3d2bc07bc0e");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("564be201-7041-4a1a-9b62-809aa522e62b");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("e6a528bf-4f46-40e3-887f-cdbc1cc43d71");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("0f7ea5a5-eee4-47a7-8823-81a6ef507d2f");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("1695af5f-a5f3-45c0-bd4b-692381ab0705");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("0009d0b2-9337-4304-b0f2-e19260fa9291");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Select_ctl00cPHddlAccountantReportFormat("Default");
    
    TestModellerLogger.SetLastNodeGuid("eec1f812-c050-4d90-bb13-e4968d5e79da");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("1bd10728-d942-4dbc-b100-30062f4327d0");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("f8c167c9-2857-4e2d-a57a-47627c0fd9e5");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("d8d764e4-3db1-479c-add9-0f78f3b7aaf0");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("a91636c6-99fa-47c1-a5cd-20f7c3a3529f");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("1ee5a67b-85e4-4705-93c7-ca01bbc7fc2e");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("6691bce8-2e9b-4c3b-bec4-7bb2e681ed57");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("dcf07a3b-751b-4cc3-9c7f-83b4922b08e8");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("d61c604b-bdb6-49e7-8890-bdbf35115d6b");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("d7f785fc-93b3-4288-b723-d918d2637593");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dbaafffd-986b-434a-8df7-1dd847f6483f");
    _Verify_trading_office_address_appearing_on_partnership_Information_page19.Click_Partnership_Information();
    

    }

}
