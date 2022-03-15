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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/278a5d52-47b1-4fec-8540-ba85668ae971
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1330, profileId = 101198)
public class VerifythissectiondoesnotformpartofcompanystatutoryfinancialstatementsFA69672_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672","Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672 - Default Profile"})
    @TestModellerPath(guid = "8be9bfb8-c4b4-4130-8eaf-0fc2a029303e")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordPositiveEnterAgentNameClickSearchbutton1Clic() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifythissectiondoesnotformpartofcompanystatutoryfinancialstatementsFA69672_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672 _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672 = new pages.Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672(driver);
    TestModellerLogger.SetLastNodeGuid("140bda87-0385-4b54-b254-d167149bf27e");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("572fe526-e032-4459-a6b4-2f0be50b530e");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("73bab28a-315d-4e80-ba74-1f2fa3f1e4af");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("cf01ccd4-b0b9-4215-a425-2d89772f0e8b");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Enter_Pasword(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("b576f79d-47b9-4684-aa13-805fd086451b");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click_Login_Button();

    TestModellerLogger.SetLastNodeGuid("26996a82-abec-4580-81eb-73953492e1c8");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2c269b50-d0d1-4a5f-9aa2-d58033fc0cdf");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ee41e536-11a1-4828-8841-49179d865f02");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ad5c6bf4-8b02-44e8-b06a-925a66b5aa8c");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("69236d8c-25d1-41a0-9e76-fbd6bd166635");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a00a428e-7113-456e-a54f-157577fa9c82");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("57a4b3c6-df22-475c-bf5d-c12a4481abad");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0892a3fd-9d55-45b3-b114-a2b3b0019d8b");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("7f5319d5-3fd7-40a3-a52c-177eee07bc8c");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c8e371e6-1d9b-47a6-961b-7dfbc63d0ad4");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("df1e1349-d8c4-41c0-8a1a-1bb01d611f87");
    _Verify_this_section_does_not_form_part_of_company_statutory_financial_statementsFA69672.Click_Full_Accounts();
    

    }

}
