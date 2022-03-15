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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0e220e35-e7fb-4040-94da-2cb8f0c35cb9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1696, profileId = 102015)
public class DetailedIncomeStatementSellinganddistributionexpenses1_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"DetailedIncomeStatementSelling_and_distribution_expenses1","DetailedIncomeStatementSelling_and_distribution_expenses1 - Default Profile"})
    @TestModellerPath(guid = "c57ec57b-b4fa-4a6c-9e98-67817adb93fb")
    public void GoToUrlAssertUrlClickDetailedIncomeStatementClickRentalIncome() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="DetailedIncomeStatementSellinganddistributionexpenses1_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.DetailedIncomeStatementSelling_and_distribution_expenses1 _DetailedIncomeStatementSelling_and_distribution_expenses1 = new pages.DetailedIncomeStatementSelling_and_distribution_expenses1(driver);
    TestModellerLogger.SetLastNodeGuid("983d1af8-eeed-4fa6-8f0a-fc8f798c1d03");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("192c44c7-1d53-467e-8cff-5d21342c89e5");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("e18af7a5-5f41-46e3-92a9-3dc1147bc5dc");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5d6cd591-8162-4ed9-8f16-5bdfd0cfbddc");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("c6506071-6847-46d4-8f5e-9627b64db102");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Login_Button();
    
    TestModellerLogger.SetLastNodeGuid("289b699b-0b32-4b9c-b9dd-943da5f2bf80");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("395ecadf-18d5-4964-ab89-6d115da30eef");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("602217ff-2a35-4f13-a412-285f88bf3aff");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click__Nakul_();
    
    TestModellerLogger.SetLastNodeGuid("7bb2f99c-5efe-4c1f-829b-8a4c924115cb");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("89017b0c-cc09-447a-aeb2-653edef6b0f4");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Enter_SearchCompany("ABC");
    

    TestModellerLogger.SetLastNodeGuid("a4edfd86-f2ec-4266-b6e4-617902e92444");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("c8298df8-a3a6-4c0a-aa1e-5c755aa9bb36");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1cbb244d-5df3-42ac-91b3-df9617f6bead");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("de839ccd-e405-4d82-b47b-527d348d9486");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click__Reports_();
    

    TestModellerLogger.SetLastNodeGuid("1c58fcbb-db5d-4f7c-9599-2969625ee872");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Trial_Balance();
    

    TestModellerLogger.SetLastNodeGuid("b6d5585f-32db-4dd2-998b-8a5a79795f69");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Select_Add_Financial_Year("Apr 2020 - Apr 2021");
    
    
    TestModellerLogger.SetLastNodeGuid("1655b791-1c11-4e17-8acb-67a464489864");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("2ffa5f82-1c63-43c1-8e42-c63aa6c7ae10");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f6ac2050-6f16-498c-94b1-053ea55f9372");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("0d765b84-ab97-4fb6-a75e-5b91dbd06017");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("563d08f2-f5bd-4115-b9dc-ea84e13219ed");
    _DetailedIncomeStatementSelling_and_distribution_expenses1.Click_Rental_Income();
    

    }

}