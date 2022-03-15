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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d28d09f6-34c4-48cf-af54-3eb43626df17
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1512, profileId = 101445)
public class FA7751_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"FA7751","FA7751 - Default Profile"})
    @TestModellerPath(guid = "2aaab434-465a-4a33-9794-62c60285def3")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FA7751_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.FA7751 _FA7751 = new pages.FA7751(driver);
    TestModellerLogger.SetLastNodeGuid("a192a950-94f8-46ca-a73c-a9c1a69b0712");
    _FA7751.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3f37cd94-7253-4af5-a022-7ea008f5f8ad");
    _FA7751.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _FA7751.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _FA7751.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _FA7751.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _FA7751.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _FA7751.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _FA7751.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA7751.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA7751.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA7751.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA7751.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _FA7751.Click__ABC_LTD_();
    

//    TestModellerLogger.SetLastNodeGuid("d5f810ff-3a3f-4f96-96e8-4ec3d6f32ed4");
//    _FA7751.Click__Accountant_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b6917762-0137-41f2-8d9d-3211a34873db");
//    _FA7751.Click_Attach1();
//
//    TestModellerLogger.SetLastNodeGuid("6953a99d-1d9c-4588-af85-bf602ac19d9e");
//    _FA7751.Enter_Upload1("");
//
//    TestModellerLogger.SetLastNodeGuid("141b698a-ba15-49a5-88e1-351b19f6bb03");
//    _FA7751.Select_Ledger_Code("Account Code");
//
//    TestModellerLogger.SetLastNodeGuid("7e75c68c-f16c-4fcc-a211-f71585f3aa10");
//    _FA7751.Select_Account_Name("Account Name");
//
//    TestModellerLogger.SetLastNodeGuid("c332b815-e135-4ca5-8cdb-e88ca5fd4c47");
//    _FA7751.Select_Balance("Balance");
//
//    TestModellerLogger.SetLastNodeGuid("46c8aba4-514c-4d20-9e27-4da896515d9e");
//    _FA7751.Click_Next_button();
//
//    TestModellerLogger.SetLastNodeGuid("38acbb86-7fc7-4808-97ec-56bb58baaae2");
//    _FA7751.Enter_Select_Date("26/05/2021");
//
//    TestModellerLogger.SetLastNodeGuid("8ba8dfee-5db6-421c-97ed-8cc28c712d13");
//    _FA7751.Click_Import_button();
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _FA7751.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
//    _FA7751.Click_Final_Accounts2();
    

//    TestModellerLogger.SetLastNodeGuid("0f8807f8-d062-4468-9b7b-2c8901d9cfe6");
//    _FA7751.Click__Settings_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2cd1be1f-47a0-4d70-90cd-186585b45eea");
//    _FA7751.Click_Accounts_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0752894-bc10-46bc-870e-e2071d3216db");
//    _FA7751.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("f620efbb-5984-4f3f-ab7b-fb14fb620b30");
    _FA7751.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("13b7476e-b979-4c07-9f5f-2db9c8f80021");
    _FA7751.Click_PositionsRight();
    

   TestModellerLogger.SetLastNodeGuid("3adef345-3e10-417a-b1aa-55625c60427d");
    _FA7751.Click_chkDirectorsYear();
    

   TestModellerLogger.SetLastNodeGuid("5f47d5da-2dd6-4875-ac80-5395430db03f");
   _FA7751.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA7751.Click_Full_Accounts();
    

//    TestModellerLogger.SetLastNodeGuid("b3aea287-9cef-489e-96ab-c8995af1cd85");
//    _FA7751.Click_Income_Statement();
    

//    TestModellerLogger.SetLastNodeGuid("029134de-7921-4327-9b86-525df7383dd0");
//    _FA7751.Select_Select_Financial_Year("Jul 2020 - Jul 2021");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d0249b17-34c7-47de-8d4b-ac132eb19e15");
//    _FA7751.Click_Ledger_Code_Value();
    

    }

    @Test  (groups= {"FA7751","FA7751 - Default Profile"})
    @TestModellerPath(guid = "05070733-1917-4493-bfaa-be78f8b7f1ad")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa1()
    {
        
        pages.FA7751 _FA7751 = new pages.FA7751(driver);
    TestModellerLogger.SetLastNodeGuid("a192a950-94f8-46ca-a73c-a9c1a69b0712");
    _FA7751.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3f37cd94-7253-4af5-a022-7ea008f5f8ad");
    _FA7751.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("70b1c4ae-cc5b-4316-a1c0-83b3242cbb95");
    _FA7751.Enter_Username("Admin");
    

    TestModellerLogger.SetLastNodeGuid("c58d2c59-d86a-432b-a02d-b23f1730c517");
    _FA7751.Enter_Password("sandbox@admin");
    

    TestModellerLogger.SetLastNodeGuid("6cc4b076-5f94-4224-b387-6075ec1c757b");
    _FA7751.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1f15a5db-de1d-421c-a162-a1b870fc0350");
    _FA7751.Enter_AgentName("Nakul");
    

    TestModellerLogger.SetLastNodeGuid("a6506a58-e800-45e5-aa59-9db690d52b8c");
    _FA7751.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3f2f34b5-6926-4f87-9d5f-47b2ff367618");
    _FA7751.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA7751.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA7751.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA7751.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA7751.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _FA7751.Click__ABC_LTD_();
    

//    TestModellerLogger.SetLastNodeGuid("d5f810ff-3a3f-4f96-96e8-4ec3d6f32ed4");
//    _FA7751.Click__Accountant_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b6917762-0137-41f2-8d9d-3211a34873db");
//    _FA7751.Click_Attach1();
//    
//
//   TestModellerLogger.SetLastNodeGuid("6953a99d-1d9c-4588-af85-bf602ac19d9e");
//    _FA7751.Enter_Upload1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("141b698a-ba15-49a5-88e1-351b19f6bb03");
//    _FA7751.Select_Ledger_Code("Account Code");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7e75c68c-f16c-4fcc-a211-f71585f3aa10");
//    _FA7751.Select_Account_Name("Account Name");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c332b815-e135-4ca5-8cdb-e88ca5fd4c47");
//    _FA7751.Select_Balance("Balance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("46c8aba4-514c-4d20-9e27-4da896515d9e");
//    _FA7751.Click_Next_button();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38acbb86-7fc7-4808-97ec-56bb58baaae2");
//    _FA7751.Enter_Select_Date("44341");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ba8dfee-5db6-421c-97ed-8cc28c712d13");
//    _FA7751.Click_Import_button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("0f8807f8-d062-4468-9b7b-2c8901d9cfe6");
//    _FA7751.Click__Settings_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2cd1be1f-47a0-4d70-90cd-186585b45eea");
//    _FA7751.Click_Accounts_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0752894-bc10-46bc-870e-e2071d3216db");
//    _FA7751.Click_Edit1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f620efbb-5984-4f3f-ab7b-fb14fb620b30");
//    _FA7751.Select_ReportingStdType("MicroEntity (FRS 105)");
//    
//
//    TestModellerLogger.SetLastNodeGuid("13b7476e-b979-4c07-9f5f-2db9c8f80021");
//    _FA7751.Click_PositionsRight();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3adef345-3e10-417a-b1aa-55625c60427d");
//    _FA7751.Click_chkDirectorsYear();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f47d5da-2dd6-4875-ac80-5395430db03f");
//    _FA7751.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA7751.Click_Full_Accounts();
    

//    TestModellerLogger.SetLastNodeGuid("b3aea287-9cef-489e-96ab-c8995af1cd85");
//    _FA7751.Click_Income_Statement();
    

//    TestModellerLogger.SetLastNodeGuid("029134de-7921-4327-9b86-525df7383dd0");
//    _FA7751.Select_Select_Financial_Year("Jul 2019 - Jul 2020");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d0249b17-34c7-47de-8d4b-ac132eb19e15");
//    _FA7751.Click_Ledger_Code_Value();
    

    }

    @Test  (groups= {"FA7751","FA7751 - Default Profile"})
    @TestModellerPath(guid = "c997d4ce-541e-4c66-a8ce-3c39d4a2c6fc")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa2()
    {
        
        pages.FA7751 _FA7751 = new pages.FA7751(driver);
    TestModellerLogger.SetLastNodeGuid("a192a950-94f8-46ca-a73c-a9c1a69b0712");
    _FA7751.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3f37cd94-7253-4af5-a022-7ea008f5f8ad");
    _FA7751.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("70b1c4ae-cc5b-4316-a1c0-83b3242cbb95");
    _FA7751.Enter_Username("Admin");
    

    TestModellerLogger.SetLastNodeGuid("c58d2c59-d86a-432b-a02d-b23f1730c517");
    _FA7751.Enter_Password("sandbox@admin");
    

    TestModellerLogger.SetLastNodeGuid("6cc4b076-5f94-4224-b387-6075ec1c757b");
    _FA7751.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1f15a5db-de1d-421c-a162-a1b870fc0350");
    _FA7751.Enter_AgentName("Nakul");
    

    TestModellerLogger.SetLastNodeGuid("a6506a58-e800-45e5-aa59-9db690d52b8c");
    _FA7751.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3f2f34b5-6926-4f87-9d5f-47b2ff367618");
    _FA7751.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA7751.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA7751.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA7751.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA7751.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _FA7751.Click__ABC_LTD_();
    

//    TestModellerLogger.SetLastNodeGuid("d5f810ff-3a3f-4f96-96e8-4ec3d6f32ed4");
//    _FA7751.Click__Accountant_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b6917762-0137-41f2-8d9d-3211a34873db");
//    _FA7751.Click_Attach1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6953a99d-1d9c-4588-af85-bf602ac19d9e");
//    _FA7751.Enter_Upload1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("141b698a-ba15-49a5-88e1-351b19f6bb03");
//    _FA7751.Select_Ledger_Code("Account Code");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7e75c68c-f16c-4fcc-a211-f71585f3aa10");
//    _FA7751.Select_Account_Name("Account Name");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c332b815-e135-4ca5-8cdb-e88ca5fd4c47");
//    _FA7751.Select_Balance("Balance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("46c8aba4-514c-4d20-9e27-4da896515d9e");
//    _FA7751.Click_Next_button();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38acbb86-7fc7-4808-97ec-56bb58baaae2");
//    _FA7751.Enter_Select_Date("44341");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ba8dfee-5db6-421c-97ed-8cc28c712d13");
//    _FA7751.Click_Import_button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("0f8807f8-d062-4468-9b7b-2c8901d9cfe6");
//    _FA7751.Click__Settings_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2cd1be1f-47a0-4d70-90cd-186585b45eea");
//    _FA7751.Click_Accounts_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0752894-bc10-46bc-870e-e2071d3216db");
//    _FA7751.Click_Edit1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f620efbb-5984-4f3f-ab7b-fb14fb620b30");
//    _FA7751.Select_ReportingStdType("MicroEntity (FRS 105)");
//    
//
//    TestModellerLogger.SetLastNodeGuid("13b7476e-b979-4c07-9f5f-2db9c8f80021");
//    _FA7751.Click_PositionsRight();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3adef345-3e10-417a-b1aa-55625c60427d");
//    _FA7751.Click_chkDirectorsYear();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f47d5da-2dd6-4875-ac80-5395430db03f");
//    _FA7751.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA7751.Click_Full_Accounts();
    

//    TestModellerLogger.SetLastNodeGuid("b3aea287-9cef-489e-96ab-c8995af1cd85");
//    _FA7751.Click_Income_Statement();
//    
//
//    TestModellerLogger.SetLastNodeGuid("029134de-7921-4327-9b86-525df7383dd0");
//    _FA7751.Select_Select_Financial_Year("Jul 2018 - Jul 2019");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d0249b17-34c7-47de-8d4b-ac132eb19e15");
//    _FA7751.Click_Ledger_Code_Value();
    

    }

    @Test  (groups= {"FA7751","FA7751 - Default Profile"})
    @TestModellerPath(guid = "4d40acbf-ef77-4581-bc74-ef503b8c4340")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa3()
    {
        
        pages.FA7751 _FA7751 = new pages.FA7751(driver);
    TestModellerLogger.SetLastNodeGuid("a192a950-94f8-46ca-a73c-a9c1a69b0712");
    _FA7751.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3f37cd94-7253-4af5-a022-7ea008f5f8ad");
    _FA7751.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("70b1c4ae-cc5b-4316-a1c0-83b3242cbb95");
    _FA7751.Enter_Username("Admin");
    

    TestModellerLogger.SetLastNodeGuid("c58d2c59-d86a-432b-a02d-b23f1730c517");
    _FA7751.Enter_Password("sandbox@admin");
    

    TestModellerLogger.SetLastNodeGuid("6cc4b076-5f94-4224-b387-6075ec1c757b");
    _FA7751.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1f15a5db-de1d-421c-a162-a1b870fc0350");
    _FA7751.Enter_AgentName("Nakul");
    

    TestModellerLogger.SetLastNodeGuid("a6506a58-e800-45e5-aa59-9db690d52b8c");
    _FA7751.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3f2f34b5-6926-4f87-9d5f-47b2ff367618");
    _FA7751.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA7751.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA7751.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA7751.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA7751.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _FA7751.Click__ABC_LTD_();
    

//    TestModellerLogger.SetLastNodeGuid("d5f810ff-3a3f-4f96-96e8-4ec3d6f32ed4");
//    _FA7751.Click__Accountant_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b6917762-0137-41f2-8d9d-3211a34873db");
//    _FA7751.Click_Attach1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6953a99d-1d9c-4588-af85-bf602ac19d9e");
//    _FA7751.Enter_Upload1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("141b698a-ba15-49a5-88e1-351b19f6bb03");
//    _FA7751.Select_Ledger_Code("Account Code");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7e75c68c-f16c-4fcc-a211-f71585f3aa10");
//    _FA7751.Select_Account_Name("Account Name");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c332b815-e135-4ca5-8cdb-e88ca5fd4c47");
//    _FA7751.Select_Balance("Balance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("46c8aba4-514c-4d20-9e27-4da896515d9e");
//    _FA7751.Click_Next_button();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38acbb86-7fc7-4808-97ec-56bb58baaae2");
//    _FA7751.Enter_Select_Date("44341");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ba8dfee-5db6-421c-97ed-8cc28c712d13");
//    _FA7751.Click_Import_button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("0f8807f8-d062-4468-9b7b-2c8901d9cfe6");
//    _FA7751.Click__Settings_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2cd1be1f-47a0-4d70-90cd-186585b45eea");
//    _FA7751.Click_Accounts_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0752894-bc10-46bc-870e-e2071d3216db");
//    _FA7751.Click_Edit1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f620efbb-5984-4f3f-ab7b-fb14fb620b30");
//    _FA7751.Select_ReportingStdType("MicroEntity (FRS 105)");
//    
//
//    TestModellerLogger.SetLastNodeGuid("13b7476e-b979-4c07-9f5f-2db9c8f80021");
//    _FA7751.Click_PositionsRight();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3adef345-3e10-417a-b1aa-55625c60427d");
//    _FA7751.Click_chkDirectorsYear();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f47d5da-2dd6-4875-ac80-5395430db03f");
//    _FA7751.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA7751.Click_Full_Accounts();
    

//    TestModellerLogger.SetLastNodeGuid("b3aea287-9cef-489e-96ab-c8995af1cd85");
//    _FA7751.Click_Income_Statement();
//    
//
//    TestModellerLogger.SetLastNodeGuid("029134de-7921-4327-9b86-525df7383dd0");
//    _FA7751.Select_Select_Financial_Year("Jul 2017 - Jul 2018");
//   
//
//   TestModellerLogger.SetLastNodeGuid("d0249b17-34c7-47de-8d4b-ac132eb19e15");
//   _FA7751.Click_Ledger_Code_Value();
    

    }

    @Test  (groups= {"FA7751","FA7751 - Default Profile"})
    @TestModellerPath(guid = "f8ce892d-5c2d-4875-83dc-931ae7983826")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa4()
    {
        
        pages.FA7751 _FA7751 = new pages.FA7751(driver);
    TestModellerLogger.SetLastNodeGuid("a192a950-94f8-46ca-a73c-a9c1a69b0712");
    _FA7751.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3f37cd94-7253-4af5-a022-7ea008f5f8ad");
    _FA7751.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("70b1c4ae-cc5b-4316-a1c0-83b3242cbb95");
    _FA7751.Enter_Username("Admin");
    

    TestModellerLogger.SetLastNodeGuid("c58d2c59-d86a-432b-a02d-b23f1730c517");
    _FA7751.Enter_Password("sandbox@admin");
    

    TestModellerLogger.SetLastNodeGuid("6cc4b076-5f94-4224-b387-6075ec1c757b");
    _FA7751.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1f15a5db-de1d-421c-a162-a1b870fc0350");
    _FA7751.Enter_AgentName("Nakul");
    

    TestModellerLogger.SetLastNodeGuid("a6506a58-e800-45e5-aa59-9db690d52b8c");
    _FA7751.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3f2f34b5-6926-4f87-9d5f-47b2ff367618");
    _FA7751.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _FA7751.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _FA7751.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _FA7751.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _FA7751.Click_Search_button2();
    
    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _FA7751.Click__ABC_LTD_();
    

//    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
//    _FA7751.Click__ABC_LTD_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("d5f810ff-3a3f-4f96-96e8-4ec3d6f32ed4");
//    _FA7751.Click__Accountant_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("b6917762-0137-41f2-8d9d-3211a34873db");
//    _FA7751.Click_Attach1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("6953a99d-1d9c-4588-af85-bf602ac19d9e");
//    _FA7751.Enter_Upload1("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("141b698a-ba15-49a5-88e1-351b19f6bb03");
//    _FA7751.Select_Ledger_Code("Account Code");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7e75c68c-f16c-4fcc-a211-f71585f3aa10");
//    _FA7751.Select_Account_Name("Account Name");
//    
//
//    TestModellerLogger.SetLastNodeGuid("c332b815-e135-4ca5-8cdb-e88ca5fd4c47");
//    _FA7751.Select_Balance("Balance");
//    
//
//    TestModellerLogger.SetLastNodeGuid("46c8aba4-514c-4d20-9e27-4da896515d9e");
//    _FA7751.Click_Next_button();
//    
//
//    TestModellerLogger.SetLastNodeGuid("38acbb86-7fc7-4808-97ec-56bb58baaae2");
//    _FA7751.Enter_Select_Date("44341.608732997687");
//    
//
//    TestModellerLogger.SetLastNodeGuid("8ba8dfee-5db6-421c-97ed-8cc28c712d13");
//    _FA7751.Click_Import_button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("0f8807f8-d062-4468-9b7b-2c8901d9cfe6");
//    _FA7751.Click__Settings_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("2cd1be1f-47a0-4d70-90cd-186585b45eea");
//    _FA7751.Click_Accounts_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("c0752894-bc10-46bc-870e-e2071d3216db");
//    _FA7751.Click_Edit1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("f620efbb-5984-4f3f-ab7b-fb14fb620b30");
//    _FA7751.Select_ReportingStdType("MicroEntity (FRS 105)");
//    
//
//    TestModellerLogger.SetLastNodeGuid("13b7476e-b979-4c07-9f5f-2db9c8f80021");
//    _FA7751.Click_PositionsRight();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3adef345-3e10-417a-b1aa-55625c60427d");
//    _FA7751.Click_chkDirectorsYear();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5f47d5da-2dd6-4875-ac80-5395430db03f");
//    _FA7751.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _FA7751.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _FA7751.Click_Full_Accounts();
    

//    TestModellerLogger.SetLastNodeGuid("b3aea287-9cef-489e-96ab-c8995af1cd85");
//    _FA7751.Click_Income_Statement();
//    
//
//    TestModellerLogger.SetLastNodeGuid("029134de-7921-4327-9b86-525df7383dd0");
//    _FA7751.Select_Select_Financial_Year("Jul 2020 - Jul 2021");
//    
//
//    TestModellerLogger.SetLastNodeGuid("d0249b17-34c7-47de-8d4b-ac132eb19e15");
//    _FA7751.Click_Ledger_Code_Value();

    }

}
