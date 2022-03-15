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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/00e14ad0-2d02-4e64-ac14-d649ef445618
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1419, profileId = 101286)
public class VerifydirectorswhoservedduringtheyearappearingonCompanyInformationpageFA69418_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418","Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418 - Default Profile"})
    @TestModellerPath(guid = "d8ea79b5-0b8c-4cb8-9e9e-c939dc5edced")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifytitlereport_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418 _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418 = new pages.Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418(driver);
    TestModellerLogger.SetLastNodeGuid("9ab14001-fec8-4a01-86aa-61b2b2af6f77");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("38c51830-f250-4ec2-831f-04c7e061ab15");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("896e68da-e88e-41ee-8cb7-883a0d7145a1");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("fa748389-81be-4bcf-a412-79d6348bff29");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a0c1ab95-ba27-482e-9474-74894ef0a1d6");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("67bc5ce7-8fa0-4ee9-a9b0-14bebd476725");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("e9ee818e-c334-4566-a039-c072077ccd50");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("02d86b11-a2b7-4bcd-ac76-e9634b89dd90");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c708cfcf-e7b0-417c-a0b3-314fa669aba5");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("9d8a0a30-3cf1-4747-aca1-3a3aa3ce09d9");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ca7500b3-d484-48d5-a423-a7fc5d527ff4");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("7f6adcce-ae32-43e5-ab0b-7706fe438e8e");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ebbfefa9-d955-4806-84e3-1d3ac537a43b");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("3f29eb23-005e-4447-aac2-96e2679e41d9");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("18136e57-f6a6-4031-a200-6337a9822835");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Director();
    

    TestModellerLogger.SetLastNodeGuid("d4ae1ae5-4211-4b73-9248-2b6edd5232cd");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4a2fc90a-dcf9-46a6-bfdd-f16ff4834099");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("a9c327f6-50d6-4954-8886-c8857f4de761");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_FirstName(sData[29]);
    

    TestModellerLogger.SetLastNodeGuid("f8b8b2ce-5651-4433-abe0-81d52080a559");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_LastName(sData[30]);
    

    TestModellerLogger.SetLastNodeGuid("a3db7e06-6754-4251-aef0-0ba1dbb4be5a");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_DirectorJoiningDate("01/08/2020");
    

    TestModellerLogger.SetLastNodeGuid("b400a18d-a81a-4072-8df1-25062207ecd0");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("653a49dd-2bc6-43a5-bf84-9d3105937b9b");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("60930b81-9b9c-4842-a480-9c36c15c51ad");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("95d69e09-fbbf-494e-8484-1af958fc325e");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("cd4f05f3-3e96-4eba-a6c9-a7b39dc1a738");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("896099c8-4c2a-40a2-a506-acdb6f50a94d");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Save1();


    TestModellerLogger.SetLastNodeGuid("30e21f89-09fb-400b-8d6a-269284cd6078");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Final_Accounts1();
    
    TestModellerLogger.SetLastNodeGuid("3c5cb543-8568-4ca6-a637-3067749ced9f");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("1680ee72-10c5-487e-bfc8-ac5bd2fef482");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("26d69e01-3918-48d8-a689-d900e292b96b");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("aef2d328-386b-48aa-8a1c-dd3e7926f9f4");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("67add39b-cd5d-4f65-be89-0a3e66ec2b73");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("a9a55f55-3266-4958-be4c-b332eae66b86");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("46d89e82-27e2-4c1f-a6e4-5fb714d6393c");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Save2();


    TestModellerLogger.SetLastNodeGuid("51e4fa9d-320f-483d-becb-fa8e379b11dc");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("959d8035-9360-4c27-a38a-1ae208a27843");
    _Verify_directors_who_served_during_the_year_appearing_on_Company_Information_pageFA69418.Click_Full_Accounts();
    

    }

}
