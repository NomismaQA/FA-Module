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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c6bacaa7-6204-4158-acaa-362b757638ae
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1173, profileId = 101062)
public class VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA6962_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962","Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962 - Default Profile"})
    @TestModellerPath(guid = "8e62c552-2e7c-4308-a5fb-c28be2e61ba5")
    public void GoToUrlAssertUrlPositiveEnterPasswordClickLoginButtonPositiveEnterctl00cPHFiltertxtAgentNameCl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycountrynamechangeautoinregistrationnumberappearingoncoverpageFA6962_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962 _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962 = new pages.Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962(driver);
    TestModellerLogger.SetLastNodeGuid("64080026-7888-4143-84ea-6a0f1bf95f32");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b7cdd21d-a191-488e-9f29-b797b3eaa3d3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("f826db11-b472-4a59-982c-494cf5bfa2b8");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Username(sData[1]);

    TestModellerLogger.SetLastNodeGuid("d599d90f-8d25-43cf-bdd4-bf76d255984f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0321cc0b-53dc-403c-9f55-852d696667a6");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("5977adfd-db1f-4edd-905c-46e75e8badfc");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("230f45a9-866a-4310-b15c-9dd484a88285");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("621a522f-3191-4df3-b29b-6dfb4d74f265");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("dd7543fa-4b86-45b8-9e25-e09408758468");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("03ea3aae-e8ff-4af1-9cd1-dadb6994e31d");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b0b42fa5-e33d-43ac-8b02-8c7977242e4e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("f06ea2d7-2b70-4b46-b925-1daf28107f3e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("fcd81c81-406b-41cd-b21b-78ad33e33711");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click__Test_Systems_Ltd_();
    

    TestModellerLogger.SetLastNodeGuid("f5a5d66c-9759-4227-a662-586c4f5c8c04");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("16fc8e89-cb31-44a1-9e8c-119c3c03ebd8");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("447ec2b5-5057-407d-bc11-84b21652dea3");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("d44488b6-4936-4b17-8d4f-68aae5963c34");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Adress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("79a8f2e7-402b-42fa-a015-641f45dcef9f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("34a164e1-bc4c-4fa1-a421-e8d3da3392c6");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("b2a2fcbe-5b50-4156-a081-2c294d62481a");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("71e78fdf-5a68-4ac2-8afc-01f3ea4621c8");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("b683ee3f-c6cf-4177-ba1a-79b8b7b246d8");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("079de191-6210-46a8-98f6-368d6f4016d2");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("06b41bbb-8946-4892-94d5-f45870314491");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("66d81275-b92e-49aa-b4ef-7ae94a24cc7f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("6d12f753-638e-4f7f-a9b7-b69e7f7f2322");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("0554e8fb-8c5c-45f0-a21a-e53d59bdc589");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("6fc44b5a-e2b9-4f34-b7b2-9863444afeb6");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Authentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("f7221106-7862-4818-8c90-060a2dbdc904");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_CTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("33f3d35e-82ab-4d67-b08e-0aa5b19f260f");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_CTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("89161399-ec0d-4e96-8f01-b88c6146d5bd");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("44ab99cd-de7a-4296-8809-4fc1cd9a3763");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("bf90a0c8-0d63-46d9-af42-6a7480f46b1e");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address11(sData[29]);
    

    TestModellerLogger.SetLastNodeGuid("e91e3301-78db-47f3-a334-b8b5ebecbb5d");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address12(sData[30]);
    

    TestModellerLogger.SetLastNodeGuid("0f94a8a9-b9e6-4eaf-8735-538192ab0d41");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address13(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("43f72fb7-54f2-428c-9132-754786a429e4");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_Address14(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("26fd219e-c3ac-4a29-869c-07d6087c8b85");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Enter_PostCode2(sData[43]);
    

    TestModellerLogger.SetLastNodeGuid("6b44584c-aa27-41bd-8277-1c1380e04872");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("7504b46c-c669-4469-9abf-8f103132a457");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("ea6316d1-5909-48d9-ac41-c44616514c22");
    _Verify_country_name_change_auto_in_registration_number_appearing_on_cover_pageFA6962.Click_Full_Accounts();
    

    }

}
