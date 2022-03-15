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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e8ef6b6f-e088-4668-bddb-56b49afc2c4c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1186, profileId = 101075)
public class VerifydirectorswhoservedduringtheyearappearingoncompanyinformationpageFA69615_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615","Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615 - Default Profile"})
    @TestModellerPath(guid = "44787bca-ed5a-407e-91dd-a6ecf25d6bec")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydirectorswhoservedduringtheyearappearingoncompanyinformationpageFA69615_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615 _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615 = new pages.Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615(driver);
    TestModellerLogger.SetLastNodeGuid("1d1385de-a206-446b-99ea-77b678c98ffa");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d9b12957-a845-4fef-bb5b-d87d12cb94e2");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f6f793cf-8d1e-49c0-be77-666bf7d1abbd");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("950fcc44-6fb7-4efa-877a-c7fab0d2f6fc");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4148fcb3-b594-423a-8673-0189376ad0ea");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("088d5be2-a576-427f-9ec8-775dd0c68bad");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("818dce3e-37ee-4167-9a64-e76e2690d51d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("55ac76b2-8816-4b93-8cf7-69e7aa6362af");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b2ac5b14-68b6-4414-90f3-05d50ec611b7");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("ff0cf1f6-936f-4f60-8db4-792f3275be93");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("7def5a50-f930-4fbc-ac29-f968f2743890");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("2cd326c8-79e3-4477-bf5f-1ef636db810e");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("b0111a28-cd57-44ea-b1d6-7f49103c5302");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("1635e9b8-97a1-4056-a3d3-ae1be2b33000");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("c061874a-256d-4c96-869c-dd8cc69da583");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("c29eaeea-a54f-4927-a7fb-85912a94b784");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("8232c0b5-4a86-4b4f-b28c-3ad6d4ec9d46");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("479e596a-8a63-4c2a-aba6-1bcf29c196ee");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_FirstName(sData[55]);
    

    TestModellerLogger.SetLastNodeGuid("bba5b213-c2ab-4761-ae34-5f60f0c773a6");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_LastName(sData[56]);
    

    TestModellerLogger.SetLastNodeGuid("e2ba1806-4cd5-4985-8ba7-901bcd65da50");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("5ad052dc-f92a-40f2-be14-219623921d8a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("4ccc0e62-acbb-4f47-af43-cf114ac023e4");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("a0185f6c-1536-4388-b3a2-b4d11d5b0b65");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("1a953768-f8ed-4b84-95ef-604d04b8a981");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("ae29fb6a-033a-4777-8797-e76bcd80ff6a");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_DirectorJoiningDate(sData[57]);
    

    TestModellerLogger.SetLastNodeGuid("73482aaf-2fb9-4673-ac71-1134682e81c1");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("392bf89f-1966-4c81-82a8-5036a8c79014");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("61da321b-7b53-4886-be96-e56a9ac62298");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("dca34097-e75b-485c-893c-458c81efc113");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("51e76470-e3c4-405d-b297-3371f60bcfd5");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("f3944f4e-442b-47ec-b4e3-ee2f33c5c321");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("27c265c3-c2f4-4b0a-89a7-92dfd9b3ff1f");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("1e4d5f15-7388-4e51-86ec-632170da34fa");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("ef91813b-b56f-471b-851c-66bf499ae17d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address11(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("1162cfb7-6168-476a-a421-a38838b40867");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address12(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("972ab522-9529-4a2b-a6bf-9b988f0a8cbc");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address13(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("817687ee-4558-4517-b31a-89a02d4c6810");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_Address4_1(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("c3f7ffcf-687d-4572-9b0c-3463c820682d");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Enter_PostCode2(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("ba762188-13b9-42ec-b9c7-ec5e19bec561");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("7facbb86-75ba-4a61-ac23-9380efd4d95c");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ed0ea0de-4a85-4491-94e4-930b9d4455ef");
    _Verify_directors_who_served_during_the_year_appearing_on_company_information_pageFA69615.Click_Full_Accounts();
    

    }

}
