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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cc480337-f798-4151-b104-67628860dba1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1031, profileId = 100934)
public class Verifyledgercode4020and4021areincludedunderTurnover70_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

  
    @Test  (groups= {"Verify_ledger_code_4020_and_4021_are_included_under_Turnover70","Verify_ledger_code_4020_and_4021_are_included_under_Turnover70 - Default Profile"})
    @TestModellerPath(guid = "023523a8-bfd3-49ce-8847-93c259587468")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode4020and4021areincludedunderTurnover70_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_ledger_code_4020_and_4021_are_included_under_Turnover70 _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70 = new pages.Verify_ledger_code_4020_and_4021_are_included_under_Turnover70(driver);
    TestModellerLogger.SetLastNodeGuid("07a0d760-449b-4b5d-9db0-af129c934f94");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("71cd2f87-50a3-44f1-a3a6-98c613f3f55b");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fd779789-ac1b-4e04-b7fe-9a2990092636");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0a81cd66-12cb-40fb-b658-c968a41725ad");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("03725249-8366-44e8-84ec-62bb1f75dc72");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("cf598f3a-5037-49d5-b2dd-9be298f230fe");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b9db2862-a91f-4a41-a54e-b58c272fb22d");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7a2cef09-3068-408a-9102-4eae597d008c");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f1b5eb0b-2125-447a-a3f3-17506ddf99b8");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("850a507d-ac12-4e85-a4b5-cad0475abc03");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0034f04a-2ccf-4f31-8aaf-180da4948780");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("d7c54953-fb5e-4634-86f9-67c9f3213500");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0bbf231d-6e31-47bb-87fa-84e51c7de1f7");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("c42f9ab9-68f5-4211-919c-c61d3a801f5a");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("48f161bf-d29b-43b6-b93f-b02abc11dbb9");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Add_Journal_entry();
    

    TestModellerLogger.SetLastNodeGuid("460ed11a-3694-4287-8062-5f2fbfe33ae7");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtDate(sData[44]);
    

    TestModellerLogger.SetLastNodeGuid("d4ee0ea2-85ed-4693-b399-41cbfab7974b");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtDescription("testdemo");
    

    TestModellerLogger.SetLastNodeGuid("9ff338cd-349f-4158-9096-def286275d33");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Select_ctl00cPHddCurrency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("2b418d53-3b54-49a8-a646-871729f00a0c");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount("Data");
    

    TestModellerLogger.SetLastNodeGuid("c2f240e4-9c7a-4fc2-a758-68e4c35a04a7");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__4020_Flat_rate_saving();
    

    TestModellerLogger.SetLastNodeGuid("a900461b-46a5-4b32-a007-ead5fda4ca03");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHrptRecordctl00txtCredit("2000");
    

    TestModellerLogger.SetLastNodeGuid("644233d3-8b6b-4590-9150-ec44f1e6d5c3");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount("Data");
    

    TestModellerLogger.SetLastNodeGuid("f477b0d8-3173-483c-abf5-1676eb93854e");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__4021_Flat_rate_saving();
    

    TestModellerLogger.SetLastNodeGuid("5a1b301f-b330-4c37-9b4f-df194eba4ae2");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHrptRecordctl01txtCredit("3000");
    

    TestModellerLogger.SetLastNodeGuid("e40fd13f-5ded-47b5-a84e-a2d395bd3e5f");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount("Data");
    

    TestModellerLogger.SetLastNodeGuid("a05db6e9-14a4-47d7-8e9d-4d7f18d4a295");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHrptRecordctl02txtCredit("5000");
    

    TestModellerLogger.SetLastNodeGuid("94e4c1f9-c9d0-4dd3-81c9-14985f8ac748");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__1300_Other_debtors();
    

    TestModellerLogger.SetLastNodeGuid("12bb1eec-a17c-4728-9736-fe6198719d90");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("6fdf059d-3cab-47ab-96d0-1ff8339ed03e");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3438ece2-d87b-4adc-a4e1-28e3c0cd680b");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("88a76c60-2b5f-49b4-ae7c-b91c74ab93b1");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("e3efbcda-c5d7-4d3c-9b85-da6ced7a5755");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5c469893-a7c1-4a26-b339-59d43395a564");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("d2b72529-ecf2-4f2e-9d3e-31985f2eeccb");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("13052cb6-b84e-4e44-a9bc-8fbf0b0e321e");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Select_ctl00cPHddlSignatoryPartnerLmtd("John Wright");
    

    TestModellerLogger.SetLastNodeGuid("fa44c279-7be3-4258-a8d0-05e1b8d3783f");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e5ca3494-dcfc-4733-b4b8-3d74054db807");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("624fca6d-8efe-4ea5-ac82-e5778b190021");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_ctl00cPHchkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("be012004-902c-41c7-9663-2a143b995d78");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtAddress1("686 Heidenreich Camp, South Judd, Democratic People's Republic of Korea");
    

    TestModellerLogger.SetLastNodeGuid("7391295b-6847-4738-a106-a88cc1498105");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtAddress2("700 Rocky Lake, Dickinsonmouth, India");
    

    TestModellerLogger.SetLastNodeGuid("964531eb-47fc-4034-97fa-8b7d7059737b");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtAddress3("7421 Koss Route, West Callie, Australia");
    

    TestModellerLogger.SetLastNodeGuid("59fd8ba4-326f-40e0-803c-b8a9b93e485c");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtAddress4("88352 Brown Walks, Hettiehaven, Niger");
    

    TestModellerLogger.SetLastNodeGuid("85f9df1c-803f-4f9e-803a-295f9ba87fd6");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Enter_ctl00cPHtxtRegFAPostCode(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("9c52909c-6878-4bc9-bac4-428192c9971e");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("8373b858-e3cd-4fd1-9ee6-303f0081c29c");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("a5abc8fb-9c11-45fb-bf93-57892231c221");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("29470212-e6ea-49f9-9b51-a17937fdcda2");
    _Verify_ledger_code_4020_and_4021_are_included_under_Turnover70.Click_Detailed_Income_Statement();
    

    }

}
