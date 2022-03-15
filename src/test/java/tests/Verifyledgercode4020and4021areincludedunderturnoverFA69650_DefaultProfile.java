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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9b858889-47a9-46dd-8c77-0ff339029718
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1302, profileId = 101171)
public class Verifyledgercode4020and4021areincludedunderturnoverFA69650_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650","Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650 - Default Profile"})
    @TestModellerPath(guid = "74a08a86-8bc1-4823-9f75-9361fb56e8d6")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyledgercode4020and4021areincludedunderturnoverFA69650_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650 _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650 = new pages.Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650(driver);
    TestModellerLogger.SetLastNodeGuid("00b7a211-2395-4341-81e5-88f139255c6f");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bfbbeef4-68d5-4db1-b1c7-2f7a18b9bd51");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("54f9e646-d4c2-4819-99ab-57fcbe1cb163");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("01627fa0-c1a6-4808-8584-c9552b9d1ed3");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("75b43e0b-f2a8-483a-be2d-b7094118e97f");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4e646faa-f4af-42ee-a4ee-1698d95db489");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c5b0aac6-390a-4fa2-84be-db9e645d78bd");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("d5023e46-94dd-4462-b4e4-b99ab71072ee");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("3479ad33-e1b8-4c1c-b878-45c7ce305f45");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("4180cfe5-7e9a-418e-a2ab-212f5a33e317");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c96f36cf-ea48-434d-bb0c-03a1385cd6e9");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("92dc2a1b-9b12-453e-b97b-20cf90518963");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("db8a167c-e1cc-4692-9895-51e92ea93944");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a8b10c8d-e01f-4391-adb2-8ded7d799d3d");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("a77bd525-0000-4075-a134-51c5a617d24f");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a3418024-2665-4ee8-ab1c-7d889811f9e4");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_Date("17/10/2020");
    

    TestModellerLogger.SetLastNodeGuid("a4232971-3b7d-4240-88f0-bd4dc9adb0cc");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("dc78dba1-4911-48c3-bd8c-45d9c03b16b3");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_Description("Test123");
    

    TestModellerLogger.SetLastNodeGuid("1d06befc-cacf-4c67-b67d-dd36c06a2ca7");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_ctl00cPHrptRecordctl00AccountUC1txtAccount("4020");
    

    TestModellerLogger.SetLastNodeGuid("0d83e545-0e4c-4199-a9b3-f5bc768b3409");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_ctl00cPHrptRecordctl00txtCredit("3000");
    

    TestModellerLogger.SetLastNodeGuid("1f8d03b2-22f3-4afe-8f83-a35fd0068ba7");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_ctl00cPHrptRecordctl01AccountUC1txtAccount("4021");
    

    TestModellerLogger.SetLastNodeGuid("3b6dcd90-3c6d-4647-a605-181146ba0d41");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_ctl00cPHrptRecordctl01txtCredit("4000");
    

    TestModellerLogger.SetLastNodeGuid("38ce8ade-1587-46bd-a5d2-62c94765361c");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_ctl00cPHrptRecordctl02AccountUC1txtAccount("1300");
    

    TestModellerLogger.SetLastNodeGuid("a086cae5-d24a-451b-9bb6-89a2500a0299");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Enter_ctl00cPHrptRecordctl02txtDebit("7000");
    

    TestModellerLogger.SetLastNodeGuid("5838ee66-c765-45cb-a18c-50dc139ec09a");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Save1();
    
    
    TestModellerLogger.SetLastNodeGuid("6e1054f9-62f0-4ce9-aae3-071514b0ee4e");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Final_Accounts1();

    TestModellerLogger.SetLastNodeGuid("60cef65c-3770-4d92-9f76-c55a99a116ed");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a817e589-a9f1-4988-b25e-c538f728ce59");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("05cccaf5-979a-449e-8e50-938fa9292f96");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("8204da4f-9b3f-4a67-a598-3e896cfaf342");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("4399f6de-1f55-435b-8b3f-ac82334d38c4");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("19bf92c8-60d0-4f9f-ba08-669d635e7769");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("e69e741b-0027-4d0c-a382-072430d7a970");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("c05f9963-8fac-4b95-83db-f06cf605e8d7");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e6b493a2-c8f9-4c42-98ed-b65dd30aca2f");
    _Verify_ledger_code_4020_and_4021_are_included_under_turnoverFA69650.Click_Full_Accounts();
    

    }

}
