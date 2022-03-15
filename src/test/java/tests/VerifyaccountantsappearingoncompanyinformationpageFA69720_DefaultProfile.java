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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b81d07a2-bb92-4b14-afa1-e8c37d588bf1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1376, profileId = 101245)
public class VerifyaccountantsappearingoncompanyinformationpageFA69720_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_accountants_appearing_on_company_information_pageFA69720","Verify_accountants_appearing_on_company_information_pageFA69720 - Default Profile"})
    @TestModellerPath(guid = "8c4d4f8b-f729-4b5a-a46e-9000e38eeff0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyaccountantsappearingoncompanyinformationpageFA69720_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_accountants_appearing_on_company_information_pageFA69720 _Verify_accountants_appearing_on_company_information_pageFA69720 = new pages.Verify_accountants_appearing_on_company_information_pageFA69720(driver);
    TestModellerLogger.SetLastNodeGuid("4db207c9-cd03-4eff-9f6d-ad992c901986");
    _Verify_accountants_appearing_on_company_information_pageFA69720.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b8ca6864-33fc-4a87-a077-420fd0a883ac");
    _Verify_accountants_appearing_on_company_information_pageFA69720.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("32319023-0923-4b55-8959-78724cd29b81");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ce882af1-cdd4-4634-8128-443a99f0ae68");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("28b447e0-78e1-4c3d-8b60-f116e08f8c8d");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a3fda28f-e7a7-4577-896c-53ce3006b235");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("17be4d9e-bd3c-4493-853a-44cf8227fd51");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("5650ec45-7adf-4201-baaf-28aa15dcc327");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("cabe848b-80a0-432e-9350-ba1ce939a525");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("419ebc6a-a377-40a7-a1eb-7842e4fe5820");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ac6873d2-85cc-413e-9e61-45de63925456");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("91bdd604-2b17-4795-bd1b-107ea9d145dd");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0dc47a7a-c4fb-4601-9483-3976c16877ed");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("4ca802ca-ba67-43b1-87c9-5ccfe0a394f9");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("09138d9a-f9bc-4822-a855-5a810696b035");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("737d3f75-1a58-4c4c-98f5-edfeba67c64f");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Accounts_Settings();
    
    TestModellerLogger.SetLastNodeGuid("72b47424-d49c-49d7-8039-b6b1407560c8");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Add_Accountant_link();
    

    TestModellerLogger.SetLastNodeGuid("dfaee29f-b990-4459-8975-4bcb42d05d1a");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_AccountantName("ABC Associates");
    

    TestModellerLogger.SetLastNodeGuid("829ee6e5-93ca-4239-b8ff-50ea7c8c548f");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_AccountantsDescription("ACCA");
    

    TestModellerLogger.SetLastNodeGuid("bad74802-3fd6-4cb4-8948-99a7e4803d81");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_AddressLine1("Address1, Address2");
    

    TestModellerLogger.SetLastNodeGuid("d349cdd6-8f6a-430d-853f-2e0189511909");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_CityTown("Address3");
    

    TestModellerLogger.SetLastNodeGuid("974f5cd4-abb9-4866-b09d-9501c5863728");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_PostCode1("SW4 8EB");
    

    TestModellerLogger.SetLastNodeGuid("fc33eafc-2aba-4e37-8719-da816bd7abf2");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Set_To_Comapany_Level();
    

    TestModellerLogger.SetLastNodeGuid("4259c765-3d10-4be2-9deb-40562ed66139");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("8a637c67-f276-4fa5-95da-138da914db69");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Enter_CompanySecretary("Name1");
    

    TestModellerLogger.SetLastNodeGuid("97d39af4-027f-4950-ac9d-fc8f790d5fcd");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("1d100e69-a8f5-437c-a174-35f55bdbc602");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("bb2a5aed-a5bf-4738-866a-97a4e93a19c3");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("385ef7ab-678c-40f8-87c5-e6fff20554fc");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("96893bd3-a876-4cec-83ea-5ffd146ea233");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("05aa0b39-b569-401f-9177-3b5e359cfb6e");
    _Verify_accountants_appearing_on_company_information_pageFA69720.Click_Filleted_Accounts();
    

    }

}
