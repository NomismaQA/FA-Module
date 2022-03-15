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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9447c78a-df9c-4198-b935-36f8f157ba54
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1239, profileId = 101126)
public class VerifydirectorsofthecompanyappearingondirectorsreportpageFA69636_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636","Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636 - Default Profile"})
    @TestModellerPath(guid = "c6e845f3-2778-46a9-bde3-c28ee6948ff8")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorsofthecompanyappearingondirectorsreportpageFA69636_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636 _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636 = new pages.Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636(driver);
    TestModellerLogger.SetLastNodeGuid("0554c559-768e-4d83-8063-86632e3983b8");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("26bc7b09-e512-419f-9533-289db4df3aef");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ecd0f426-3363-48dd-ba59-1b3953d72abf");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("677f0146-c7bf-4a58-8e08-e3d502a23deb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("105c30da-1573-403c-ba7b-16e574ce63a6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f1febca6-087a-46c4-b1bf-e0d178333b4c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("e6cfefaa-d18f-493b-be07-3ca12c69cde8");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8ba2e5d1-aed8-486a-997c-cd79dc5fe70c");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("17ce9735-5113-4b86-8997-3408ec8d8331");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("93763407-db8d-4ed5-bdb5-cd29763300cb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("bff4d742-2664-42e2-91d7-b69414366b48");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("fdd4a73b-1fbf-43dc-ba0e-9d62c87415ba");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("27b30bd0-76cf-4531-aba1-e7cd98c09e4d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a446ee86-9f9c-48fc-8224-e951b7eb3cf1");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("b4e4f729-da87-408a-9350-73eb0d5c2cf6");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("956fd783-a344-4d04-858a-505e2aaeabbe");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a780e05a-4357-45d3-9380-dfe19384d1bb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("1e6002f8-cc6d-4fc0-a56d-739ac7f5fb7d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_FirstName("ABC1");
    

    TestModellerLogger.SetLastNodeGuid("6e9272f3-6f0c-40b1-9ad6-52935c95bff5");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_LastName("XYZ1");
    

    TestModellerLogger.SetLastNodeGuid("83631dbf-47ed-437c-b21a-dce6d48f5eb2");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_NI_Number("1234567890");
    

    TestModellerLogger.SetLastNodeGuid("eef8a187-ee3b-441f-bd12-2c6fe6cc11a7");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Shareholder_Button();
    

    TestModellerLogger.SetLastNodeGuid("6d024d57-78c6-46f2-8bb4-75550abbf726");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_DirectorJoiningDate("05/06/2020");
    

    TestModellerLogger.SetLastNodeGuid("641f0391-55bf-432d-bcf1-19caac5081d9");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_DirectorLeavingDate("31/12/2020");
    

    TestModellerLogger.SetLastNodeGuid("ccb27f43-289c-4bab-a8e2-d6f7c0a7b1dc");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_Address1("Test1");
    

    TestModellerLogger.SetLastNodeGuid("84e61f78-016e-4b9b-911a-650cdd504936");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_Address2("Test2");
    

    TestModellerLogger.SetLastNodeGuid("1c3edad7-002b-4f20-abde-959e869325cf");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_Address3("Test3");
    

    TestModellerLogger.SetLastNodeGuid("fdc6e674-995f-45ac-a20f-a818f246da37");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_Address4("Test4");
    

    TestModellerLogger.SetLastNodeGuid("d3261a10-e6c6-4f52-a00c-902154bd14b8");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Enter_PostCode("WC1N 3AE");
    

    TestModellerLogger.SetLastNodeGuid("3530d92a-c8ba-4542-8013-30108b75ca81");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("c8b9eaf6-65ef-4007-aba7-9e376ccc5984");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b3a98b00-6b1c-45e8-be46-81abf6a56c8d");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Settings1_1();
    

    TestModellerLogger.SetLastNodeGuid("01c7c00f-8ea3-4c23-9da1-6d8f299caefc");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("f726ab62-fe3c-4868-a7ae-35d7750ce799");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("b937f124-dfd0-46ad-9147-6de420bd0eff");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("08569e4d-2831-4c3e-b1d3-7eabdee5f5cb");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("7b474fe9-9e5c-48f2-93bf-408cf5f504ac");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("e790086d-04c6-4667-9dd1-f9b94d3c42bd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("323999cb-c4e7-4b1d-bc71-aeb972fbe316");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c1b26b75-40da-42dd-a32c-0d14f8966ddd");
    _Verify_directors_of_the_company_appearing_on_directors_report_pageFA69636.Click_Full_Accounts();
    

    }

}
