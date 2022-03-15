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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/822bf084-2132-4676-809f-4024aa051515
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1142, profileId = 101034)
public class Verifydefaultstatusofmembersbenefitsadvancescreditandguarantees31699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699","Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699 - Default Profile"})
    @TestModellerPath(guid = "398afb78-5ef6-4335-8d0a-3bf11646de18")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersbenefitsadvancescreditandguarantees31699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699 _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699 = new pages.Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699(driver);
    TestModellerLogger.SetLastNodeGuid("996c90c0-d127-489e-88ec-dcd8edbfdfad");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("90fc51e9-8ab1-4f5e-bc33-bc60516a4baf");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d301d14-99b7-41a4-9568-b5e04fa75158");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d30fc481-6413-48ed-bdbc-fc25627731dc");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ef996131-f35b-45ed-b665-ff59ef94d0f7");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0d5da363-3afb-4671-a950-29a6cdba1f04");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5e6464c1-0b74-43e9-8ef4-2e1f2f4cf18a");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7c1d6d10-d3d8-40a1-8be0-b6a6a784acf6");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f09b6588-ca2f-41d9-9636-a64a96bcf9ba");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("fd7e9dd6-feec-4755-be6a-060bb1dee56a");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("d4a02685-0e13-4d4b-94f2-82a7c51428e8");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("507b71d1-5690-425e-b5ae-554ecfd06c49");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3b866980-e5c3-419f-82b1-56f4a838a85b");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("e9c26880-cd14-4ed9-9c0f-ef6b014a3ba4");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("42327896-645c-428c-b665-dc12956ba06e");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("7abdc4b5-df5c-411a-8136-500dbe6ce8d7");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("46570142-fb81-4191-80bd-d7a05bd3aa38");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("2aba263a-c72c-49a3-b48f-80477bfb2a81");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("1d872492-2e88-4c7a-83c6-6f33e53f726e");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("02820df9-8a5b-43a4-aa46-1a80c08db7d8");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("25bfc33a-b05c-4941-886c-97721db810f4");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("3888db1c-773f-48f9-852f-b834a508dbc3");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees31699.Click_Statement_of_Financial_Position();
    

    }

}
