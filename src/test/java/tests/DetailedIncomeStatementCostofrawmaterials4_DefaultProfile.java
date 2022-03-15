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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a96f87be-836a-41b2-a7b7-62688626c15c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1687, profileId = 101988)
public class DetailedIncomeStatementCostofrawmaterials4_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"DetailedIncomeStatementCostofrawmaterials4","DetailedIncomeStatementCostofrawmaterials4 - Default Profile"})
    @TestModellerPath(guid = "2d6cdbc2-c981-437a-b08c-76f4ec4a3b0b")
    public void GoToUrlAssertUrlClickDetailedIncomeStatementClickClosingStock() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="DetailedIncomeStatementCostofrawmaterials4_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.DetailedIncomeStatementCostofrawmaterials4 _DetailedIncomeStatementCostofrawmaterials4 = new pages.DetailedIncomeStatementCostofrawmaterials4(driver);
    TestModellerLogger.SetLastNodeGuid("40499753-c05b-4c32-b3b0-c1c7b774b790");
    _DetailedIncomeStatementCostofrawmaterials4.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("732d299c-ad4d-46dc-b074-4dfd107c6b5a");
    _DetailedIncomeStatementCostofrawmaterials4.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _DetailedIncomeStatementCostofrawmaterials4.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _DetailedIncomeStatementCostofrawmaterials4.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _DetailedIncomeStatementCostofrawmaterials4.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _DetailedIncomeStatementCostofrawmaterials4.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _DetailedIncomeStatementCostofrawmaterials4.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _DetailedIncomeStatementCostofrawmaterials4.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _DetailedIncomeStatementCostofrawmaterials4.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _DetailedIncomeStatementCostofrawmaterials4.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _DetailedIncomeStatementCostofrawmaterials4.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _DetailedIncomeStatementCostofrawmaterials4.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("c021734a-a3ae-4153-8db2-86cd6833748e");
    _DetailedIncomeStatementCostofrawmaterials4.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("8f991242-6c25-435c-b704-06dbcca5aed1");
    _DetailedIncomeStatementCostofrawmaterials4.Click__Closing_Stock_();
    

    }

}