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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e8133624-5fba-4188-8d11-8833edb2c38f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1701, profileId = 102030)
public class DetailedIncomeStatementSellinganddistributionexpenses6_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"DetailedIncomeStatementSelling_and_distribution_expenses6","DetailedIncomeStatementSelling_and_distribution_expenses6 - Default Profile"})
    @TestModellerPath(guid = "e33c0e61-c374-42eb-8162-9c97f9e2825d")
    public void GoToUrlAssertUrlClickDetailedIncomeStatementClickRentalIncome() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="DetailedIncomeStatementSellinganddistributionexpenses6_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.DetailedIncomeStatementSelling_and_distribution_expenses6 _DetailedIncomeStatementSelling_and_distribution_expenses6 = new pages.DetailedIncomeStatementSelling_and_distribution_expenses6(driver);
    TestModellerLogger.SetLastNodeGuid("e73ec520-0a00-4567-ac5f-9aaea270648d");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d0e163fb-b0ce-4ae9-a2cd-845966fdacab");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("c0b89331-0ff6-4110-8b7a-03bdc7280268");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e85baa7d-1fe9-4cf2-89e6-da3d90fee606");
    _DetailedIncomeStatementSelling_and_distribution_expenses6.Click_Rental_Income();
    

    }

}