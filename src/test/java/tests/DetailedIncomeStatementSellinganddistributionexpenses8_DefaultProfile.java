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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/30f4a584-4372-48ca-b12e-4c72fb1b102f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1703, profileId = 102036)
public class DetailedIncomeStatementSellinganddistributionexpenses8_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"DetailedIncomeStatementSelling_and_distribution_expenses8","DetailedIncomeStatementSelling_and_distribution_expenses8 - Default Profile"})
    @TestModellerPath(guid = "369857e4-701e-441b-865c-5a7aeed0f449")
    public void GoToUrlAssertUrlClickDetailedIncomeStatementClickRentalIncome() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="DetailedIncomeStatementSellinganddistributionexpenses8_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.DetailedIncomeStatementSelling_and_distribution_expenses8 _DetailedIncomeStatementSelling_and_distribution_expenses8 = new pages.DetailedIncomeStatementSelling_and_distribution_expenses8(driver);
    TestModellerLogger.SetLastNodeGuid("e40272e0-b9cc-4615-b16e-49afdde98f03");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("af08b06d-c7b8-48b2-86fd-75b3cddda67a");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("223b6ef6-77f8-4804-b7c9-8efe87061326");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("b7441be9-6bbf-42ed-9878-ad4524e39dc2");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Rental_Income();

    TestModellerLogger.SetLastNodeGuid("8765325d-fa5f-480f-837b-073720bac8f4");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("ddd99b5f-8483-4dbe-9f8c-1abd13abc47b");
    _DetailedIncomeStatementSelling_and_distribution_expenses8.Click_Rental_Income();
    

    }

}