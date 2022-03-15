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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a2234cfa-7228-4142-a154-2b4b9584204f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 927, profileId = 100820)
public class Verifythereportisntacharteredaccountantone44_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null; 

    
    @Test  (groups= {"Verify_the_report_isnt_a_chartered_accountant_one44","Verify_the_report_isnt_a_chartered_accountant_one44 - Default Profile"})
    @TestModellerPath(guid = "d487e3a5-17c4-48c6-ba4e-e6af13a7e722")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifythereportisntacharteredaccountantone44_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_the_report_isnt_a_chartered_accountant_one44 _Verify_the_report_isnt_a_chartered_accountant_one44 = new pages.Verify_the_report_isnt_a_chartered_accountant_one44(driver);
    TestModellerLogger.SetLastNodeGuid("423fd92b-2a42-4723-ba1b-00d57bbc3abb");
    _Verify_the_report_isnt_a_chartered_accountant_one44.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2a8b9c73-2637-4d96-902b-cc13fb46e888");
    _Verify_the_report_isnt_a_chartered_accountant_one44.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8d4810ef-c06a-4258-ae79-9bf826e93317");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5c16c97f-1c06-436d-9b99-3aa936404b04");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("7ad66b1d-e563-44c3-a852-097603d698d1");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("8a528e0e-6297-41e9-9faa-9cdd7ea7f3d6");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ecd8861c-5e66-4a11-8937-f1c96540bac6");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("e4e14c54-a7a3-43ee-b63c-bf9eb6d604f8");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b8d0e275-0484-4c87-a1df-4f465cc801e7");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c873927d-f13a-4d8f-9f31-28ed184b3a89");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("607c61c9-f8e0-465e-a318-8d354481acff");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("51f661ac-f03b-4196-b5d6-055da00da9dd");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("26250d22-50d7-4b3f-b2dc-2ac86b490537");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("333519b4-7172-4a32-8cb3-5d12b23be643");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("4d3649ca-669f-4c57-aa1c-e862a122e2fb");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("c9ba187f-636c-494e-9334-4f5b533f05ba");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("70194e03-dbb3-47cd-b378-5e0138ba728c");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("70320998-0f55-4e50-9d8a-99e1861ab6d2");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("76c9f367-6dfb-4c93-a631-53b26cf60937");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("62220288-40c8-4861-bc53-7a0c2a0204cd");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("54be94b0-259f-4c19-99bf-75873961f786");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("76da78e0-7b90-4a73-9f39-596ddef5d94f");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("ce765a39-31fc-4a3b-bd6a-9ca8ea7ceca2");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("31c64e71-1dc8-415f-8628-306fc0ad3f18");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("ba1a41a8-2756-4489-a892-a3ae6d4bf65d");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("8c86ca4f-587b-40b9-9157-cf739a366fff");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("fde2ec2f-e99d-4787-8c66-9135421d3b79");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("58024f84-55d4-48e6-b84c-a7984db4be05");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("4ada79d9-3719-4d15-9ad4-1ead9c363c69");
    _Verify_the_report_isnt_a_chartered_accountant_one44.Click_Full_Accounts();
    

    }

}
