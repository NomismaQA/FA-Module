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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3269a29f-6944-425f-9ca5-1126a1b6b601
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1693, profileId = 102006)
public class DetailedIncomeStatementRentalIncome_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"DetailedIncomeStatementRental_Income","DetailedIncomeStatementRental_Income - Default Profile"})
    @TestModellerPath(guid = "9c2d6db2-c096-4aa9-b797-f3a1d183ce1c")
    public void GoToUrlAssertUrlClickDetailedIncomeStatementClickRentalIncome() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="DetailedIncomeStatementRentalIncome_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.DetailedIncomeStatementRental_Income _DetailedIncomeStatementRental_Income = new pages.DetailedIncomeStatementRental_Income(driver);
    TestModellerLogger.SetLastNodeGuid("eafc1e70-58b5-494b-8126-5ebd03ba448f");
    _DetailedIncomeStatementRental_Income.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("898b7fb6-a3bd-42ca-91bf-ffc475dea333");
    _DetailedIncomeStatementRental_Income.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _DetailedIncomeStatementRental_Income.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _DetailedIncomeStatementRental_Income.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _DetailedIncomeStatementRental_Income.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _DetailedIncomeStatementRental_Income.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _DetailedIncomeStatementRental_Income.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _DetailedIncomeStatementRental_Income.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _DetailedIncomeStatementRental_Income.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _DetailedIncomeStatementRental_Income.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _DetailedIncomeStatementRental_Income.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _DetailedIncomeStatementRental_Income.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _DetailedIncomeStatementRental_Income.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _DetailedIncomeStatementRental_Income.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _DetailedIncomeStatementRental_Income.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _DetailedIncomeStatementRental_Income.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _DetailedIncomeStatementRental_Income.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _DetailedIncomeStatementRental_Income.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _DetailedIncomeStatementRental_Income.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("7c4bfac5-aa1f-46e8-9436-4398ccb4e053");
    _DetailedIncomeStatementRental_Income.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("60b6571b-e453-4ac5-a2ce-3046138d1d71");
    _DetailedIncomeStatementRental_Income.Click_Rental_Income();
    

    }

}