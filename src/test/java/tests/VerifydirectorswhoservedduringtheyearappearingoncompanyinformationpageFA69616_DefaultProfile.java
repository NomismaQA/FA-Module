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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f22bde92-a500-4152-bbb7-3af8598fe014
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1187, profileId = 101076)
public class VerifydirectorswhoservedduringtheyearappearingoncompanyinformationpageFA69616_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616","Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616 - Default Profile"})
    @TestModellerPath(guid = "379a3fdd-da80-4510-a333-95e392e517f1")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorswhoservedduringtheyearappearingoncompanyinformationpageFA69616_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        
        pages.Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616 _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616 = new pages.Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616(driver);
    TestModellerLogger.SetLastNodeGuid("92d29134-1fe2-4174-8419-c81cf4a7cbc7");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3aa586a7-20ea-40d8-8fc8-c00aca2a7d59");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d203b5a2-59f1-42fe-9a37-9fd69591b45d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("629e3b90-278e-4277-bace-5002f259a234");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("548b5727-a7f6-478e-bf18-27e6cc6f5f9a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("b0bac122-0aeb-4cfc-945f-50520ac7dad5");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("0a530fdb-5039-4442-a134-da3863312712");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8ccf7bef-233d-4ef7-8855-e4abb89390d8");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("52a76944-efc9-4967-96b9-4ac705f5bb31");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("5c2bcc31-2598-4c2c-8538-8040fc6f4ef0");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("aaef935f-6e91-4b0a-b99a-0de8c4f70f77");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("dca475ae-9388-48f0-b3f1-9649e45d2bb1");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("99d206fb-0157-4429-9c30-8eefda576d5a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("d2c68739-9811-4296-8825-b03826d30b7e");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("ae8066f6-beb8-4031-8e81-c93c1305a8bb");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("b51c1ac9-c709-4ee8-8a7f-a97b1bd4bdd6");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("56fb8626-b6ae-405b-9f2b-a15c36009115");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("034b8509-d08f-4e33-b162-481108987467");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_FirstName("123");
    

    TestModellerLogger.SetLastNodeGuid("e652bb61-a04e-4fa0-bdf3-cf351bad355c");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_LastName("!@#");
    

    TestModellerLogger.SetLastNodeGuid("4008d907-ba9d-4ce6-92cf-9ceae4894a46");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("57bd89f6-659c-4847-a656-4f5196779d1d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("2e4cee4f-e200-4830-86a2-aa2d471f2192");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("a1612815-0a81-41b0-9349-46abcf41bb02");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address4(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("477154fa-4f98-4fbc-8ceb-b5ac0dc9071f");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("72772a72-3e11-4d36-8462-59dceb0b2b6d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_DirectorJoiningDate(sData[57]);
    

    TestModellerLogger.SetLastNodeGuid("72b70ea4-c8d1-4782-8898-decb20db27ac");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_DirectorLeavingDate("31-03-2021");
    

    TestModellerLogger.SetLastNodeGuid("c47b71ee-b1e9-4476-8028-4cf913bd8af8");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("01bd8dad-b26b-43f7-acd1-bab3c2a3a990");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("9f154171-cbb6-4b66-9d70-75171169f149");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("0369f353-278f-4e73-acb3-ac84cfbacc6a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0a6ea898-4545-4d1e-8e49-d0a908985b78");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("44d7456a-e8f9-4a56-839b-fabdb0c8f06d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("3f1bbfc9-5907-4bf1-8dc8-e39795107028");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("b25c5b12-cfa4-46d6-87ef-f7b2994e1942");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("8050e4f7-242d-4108-a2bb-49bcf8ba1ec0");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address11(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("67d78143-1ba4-4de3-bcba-97b06e5ca703");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address12(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("fd78d35a-5004-438f-b63e-fec67a8b3d32");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address13(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("d628e763-64cf-4b9b-992d-16c15e6c99df");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_Address14(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("c441966c-00e6-496e-8ead-8e4d8c515d96");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Enter_PostCode2(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("87734492-d460-488b-bd4f-1971ea55663d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("caccd722-652b-4402-b53e-de7464e889e5");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("a9f9656c-f878-455f-9084-c8036fd615f7");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69616.Click_Full_Accounts();
    

    }

}
