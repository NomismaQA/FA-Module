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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4066f086-9fae-4c52-8198-15b51b46b0c4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1441, profileId = 101315)
public class VerifyusercanaddremoveAccountantsReportaspertheirwishFA69447_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447","Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447 - Default Profile"})
    @TestModellerPath(guid = "ba743f86-ee70-40b1-9437-79a8c5760a91")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanaddremoveAccountantsReportaspertheirwishFA69447_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447 _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447 = new pages.Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447(driver);
    TestModellerLogger.SetLastNodeGuid("76187f6c-ec09-42c8-81fb-0bd8c2a1a8d6");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5f0b92e7-4eaa-41db-85fb-d01be902525d");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("dc29500d-e195-42fe-918e-6908e0b2bc21");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c3c36883-01f7-4366-945f-0cf59656a237");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("f76b4d29-03d6-45ce-846c-4447e221a522");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("423489a8-8f70-4dad-872b-c8e9a37238dd");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1cd62916-5ee2-4a91-99bf-0886b6a92eb6");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("16e75807-17be-4bb4-8162-c128d570a97f");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ff4728fe-0b25-49d1-b3fe-f733ea2ea74a");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("115755c3-bb15-4b7d-afd6-791cbe3bb206");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6a4b640f-44cb-4609-a3f7-9455b7fa41fc");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e651f345-7e79-4216-ae42-0d80b732f3ae");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d56e9487-1e22-4094-803e-935f2e2b8faf");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("95eea310-f7f0-4e6f-8349-c68d9a4439af");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("e48cc7bd-ea0d-4ede-90c0-226c1d511122");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("8725ba13-bd96-4865-9ec8-a8da53c66163");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("21ddbe50-a886-48c7-8e1a-21ba284cb5c7");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("aa609019-b70c-4b81-8af2-319f44193c20");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("2939e73f-c47a-41f8-98d4-9d07a67e76da");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("da700f50-9b5f-47a0-b183-2e04e66c751a");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("41743b06-fda6-4f16-8127-9f5fe28d3f38");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("357c5bae-42c4-4c8e-8c7a-a52c88d5104a");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("04b05632-efeb-458c-a8e5-9487b237a44d");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Select_PageBreakAfterPageNumbersFrs102Short("1 - General Information");
    

    TestModellerLogger.SetLastNodeGuid("c6887d0e-ee4f-4fbb-bb42-131bb12e82ac");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_ctl00cPHchkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("cb16c50d-1873-408c-975a-11a10bb4072f");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("3d6000d1-9a1c-4d53-985e-ec055853403b");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("d4eb8f35-27c2-442c-aa35-ff58db5b9412");
    _Verify_user_can_add_remove_Accountants_Report_as_per_their_wishFA69447.Click_Full_Accounts();
    

    }

}
