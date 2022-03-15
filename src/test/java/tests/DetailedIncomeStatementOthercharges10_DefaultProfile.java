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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8626dee9-34d8-45ee-9cb0-12ee4a21e5f8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1718, profileId = 102072)
public class DetailedIncomeStatementOthercharges10_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"DetailedIncomeStatementOther_charges10","DetailedIncomeStatementOther_charges10 - Default Profile"})
    @TestModellerPath(guid = "1db5381f-c31e-4e20-aad2-f27e481db2ea")
    public void GoToUrlAssertUrl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="DetailedIncomeStatementOthercharges10_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.DetailedIncomeStatementOther_charges10 _DetailedIncomeStatementOther_charges10 = new pages.DetailedIncomeStatementOther_charges10(driver);
    TestModellerLogger.SetLastNodeGuid("f9e7a75d-aed6-4e7f-a69d-4972041f0921");
    _DetailedIncomeStatementOther_charges10.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2a40d766-2670-4db7-bee5-1d6001fb7f96");
    _DetailedIncomeStatementOther_charges10.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _DetailedIncomeStatementOther_charges10.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _DetailedIncomeStatementOther_charges10.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _DetailedIncomeStatementOther_charges10.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _DetailedIncomeStatementOther_charges10.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _DetailedIncomeStatementOther_charges10.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _DetailedIncomeStatementOther_charges10.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _DetailedIncomeStatementOther_charges10.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _DetailedIncomeStatementOther_charges10.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _DetailedIncomeStatementOther_charges10.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _DetailedIncomeStatementOther_charges10.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _DetailedIncomeStatementOther_charges10.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _DetailedIncomeStatementOther_charges10.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _DetailedIncomeStatementOther_charges10.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _DetailedIncomeStatementOther_charges10.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _DetailedIncomeStatementOther_charges10.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _DetailedIncomeStatementOther_charges10.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _DetailedIncomeStatementOther_charges10.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("491ce789-6e7c-476b-8918-e54f946080cb");
    _DetailedIncomeStatementOther_charges10.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("29d25054-d171-4c20-b3f6-b9aa701f4749");
    _DetailedIncomeStatementOther_charges10.Click__Accountancy_Bookkeeping_and_Auditing_Fees_();
    

    }

}