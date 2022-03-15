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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/92d986b0-2396-46ac-a159-e037aa53f2e0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1200, profileId = 101087)
public class VerifyaccountantsappearingoncompanyinformationpageFA69620_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_accountants_appearing_on_company_information_pageFA69620","Verify_accountants_appearing_on_company_information_pageFA69620 - Default Profile"})
    @TestModellerPath(guid = "989807f1-f391-4dbe-a983-14d99b92bfd7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyaccountantsappearingoncompanyinformationpageFA69620_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_accountants_appearing_on_company_information_pageFA69620 _Verify_accountants_appearing_on_company_information_pageFA69620 = new pages.Verify_accountants_appearing_on_company_information_pageFA69620(driver);
    TestModellerLogger.SetLastNodeGuid("c7d76d37-fc90-47d0-8c18-e07031ad4690");
    _Verify_accountants_appearing_on_company_information_pageFA69620.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("896f4382-03ea-404c-8e3b-bc24d84fb824");
    _Verify_accountants_appearing_on_company_information_pageFA69620.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0314f19b-8b34-419c-92d2-7e04b5c2ed44");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e800ddfc-e8b8-4ffd-8528-b3494a736959");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4b3f9d91-d492-498d-9b1f-1dbbdc493087");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f80b1f16-bb78-4e27-b045-0b926e66ea7e");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("25d2eccb-e47c-4a63-ad67-b6f13bf7e0d3");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("068c6b19-347e-456b-8314-f8088d36bb3a");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f746e466-56db-4c15-a47c-64ab3ce860e5");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("802e45f2-f025-4637-b622-c64a1480f693");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("011ce063-d30a-4d97-9849-a37638cbbf3e");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("13c4f493-541c-41e6-840d-1d4fd208f765");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cba4f3e2-98de-48c7-a0f7-e8397a1a7d94");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("54203254-7e98-4bcd-8f7a-5b0efb33d56e");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8eb7dd7e-4a3e-40a4-95b3-997d4f89e16c");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("b5fe7cc3-1680-435e-b754-9279ab99d8d1");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("72b47424-d49c-49d7-8039-b6b1407560c8");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Add_Accountant_link();
    

    TestModellerLogger.SetLastNodeGuid("dfaee29f-b990-4459-8975-4bcb42d05d1a");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_AccountantName("ABC Associates");
    

    TestModellerLogger.SetLastNodeGuid("829ee6e5-93ca-4239-b8ff-50ea7c8c548f");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_AccountantsDescription("ACCA");
    

    TestModellerLogger.SetLastNodeGuid("bad74802-3fd6-4cb4-8948-99a7e4803d81");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_AddressLine1("Address1, Address2");
    

    TestModellerLogger.SetLastNodeGuid("d349cdd6-8f6a-430d-853f-2e0189511909");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_CityTown("Address3");
    

    TestModellerLogger.SetLastNodeGuid("974f5cd4-abb9-4866-b09d-9501c5863728");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Enter_PostCode1("SW4 8EB");
    

    TestModellerLogger.SetLastNodeGuid("fc33eafc-2aba-4e37-8719-da816bd7abf2");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Set_To_Comapany_Level();
    

    TestModellerLogger.SetLastNodeGuid("9ab5343d-245d-42b7-b3b4-9ce7905f54d0");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("ed9d2c7f-6fd5-41ac-b79a-2ed75ccaec90");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("87a665af-eefb-48ac-b850-2af5acffe699");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("c723cdaa-2ce6-4410-806c-6f4ceeb36194");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("367f37dc-4e13-4a42-a315-1fc7de02910d");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("b82c1a0d-2fe5-4d25-912c-ed4f48064c60");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("6521d6d2-b1d6-4857-a8af-25441ed23ebe");
    _Verify_accountants_appearing_on_company_information_pageFA69620.Click_Full_Accounts();
    

    }

}
