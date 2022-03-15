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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8be905f2-0b57-4ea6-a809-fa8f045fe2a0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1517, profileId = 101490)
public class FA775Newclient_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    

//    TestModellerLogger.SetLastNodeGuid("b3aea287-9cef-489e-96ab-c8995af1cd85");
//    _FA775Newclient.Click_Income_Statement();
    
//    TestModellerLogger.SetLastNodeGuid("d5f810ff-3a3f-4f96-96e8-4ec3d6f32ed4");
//    _FA775Newclient.Click__Accountant_();
//    
//    TestModellerLogger.SetLastNodeGuid("70c6734d-83f1-47fd-9e1c-ff837017ecbd");
//    _FA775Newclient.Click_Import_File();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b6917762-0137-41f2-8d9d-3211a34873db");
//    _FA775Newclient.Click_Attach1();
//
//    TestModellerLogger.SetLastNodeGuid("6953a99d-1d9c-4588-af85-bf602ac19d9e");
//    _FA775Newclient.Enter_Upload1("");
//
//    TestModellerLogger.SetLastNodeGuid("141b698a-ba15-49a5-88e1-351b19f6bb03");
//    _FA775Newclient.Select_Ledger_Code("Account Code");
//
//    TestModellerLogger.SetLastNodeGuid("7e75c68c-f16c-4fcc-a211-f71585f3aa10");
//    _FA775Newclient.Select_Account_Name("Account Name");
//
//    TestModellerLogger.SetLastNodeGuid("c332b815-e135-4ca5-8cdb-e88ca5fd4c47");
//    _FA775Newclient.Select_Balance("Balance");
//
//    TestModellerLogger.SetLastNodeGuid("46c8aba4-514c-4d20-9e27-4da896515d9e");
//    _FA775Newclient.Click_Next_button();
    
    
    

    }

    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa1() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa11() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa111() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa1111() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa11111() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa111111() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
    @Test  (groups= {"FA775Newclient","FA775Newclient - Default Profile"})
    @TestModellerPath(guid = "e2f29d4a-adbe-4781-87da-e4ec62632993")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa1111111() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA775Newclient_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FA775Newclient _FA775Newclient = new pages.FA775Newclient(driver);
    TestModellerLogger.SetLastNodeGuid("434728c9-7e07-4760-910b-87255cb354ae");
    _FA775Newclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e7fe213-8500-4a7a-8d11-643c2a31a449");
    _FA775Newclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("832ff57c-6f88-4905-89dc-b2c8fc1930e2");
    _FA775Newclient.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ebd977cf-c8f2-4495-a077-64fed4c0fd42");
    _FA775Newclient.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4c1be55e-cb75-4dbc-900d-e514a893d329");
    _FA775Newclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("43471214-d59e-4ba1-9046-a00e2bd99538");
    _FA775Newclient.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2f834f2a-897b-403c-826c-334664c28b38");
    _FA775Newclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("018a765d-ed50-4953-abaf-1325917791fd");
    _FA775Newclient.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA775Newclient.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA775Newclient.Enter_SearchCompany("New Test");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA775Newclient.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA775Newclient.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _FA775Newclient.Click__New_Test_Ltd_();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA775Newclient.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA775Newclient.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA775Newclient.Click_Full_Accounts();
    
}
    
}
