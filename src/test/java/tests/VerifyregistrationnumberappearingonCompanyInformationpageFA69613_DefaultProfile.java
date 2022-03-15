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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c66bf89d-20c3-4260-b816-f3eb024e3814
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1182, profileId = 101072)
public class VerifyregistrationnumberappearingonCompanyInformationpageFA69613_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_Company_Information_pageFA69613","Verify_registration_number_appearing_on_Company_Information_pageFA69613 - Default Profile"})
    @TestModellerPath(guid = "fbe4016f-fa33-4ec9-96d5-782b6affa443")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberappearingonCompanyInformationpageFA69613_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_registration_number_appearing_on_Company_Information_pageFA69613 _Verify_registration_number_appearing_on_Company_Information_pageFA69613 = new pages.Verify_registration_number_appearing_on_Company_Information_pageFA69613(driver);
    TestModellerLogger.SetLastNodeGuid("72d47c88-6e66-4ac3-860a-5d1fa6755650");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("56b09a98-9c4d-4259-90cf-83d9623c538b");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("644cf891-8607-471b-b4a1-560fcd438e09");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("65a3a352-3fd0-4a62-833d-59aee1bae1db");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("58fb5d6a-15c8-46c2-bcda-c2644c4ee29e");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f183ca5a-41e7-41ba-9943-a1d8e9742225");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("bbecd6ec-d902-4874-be30-06b492fb5597");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("33b09855-701a-46cf-b8dc-cb330d42ad03");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("011236df-e17a-47fd-adab-ebb17d8cdb26");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("0561df57-a55d-455f-817e-029311a2da6e");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a6552572-e620-407d-99df-4f943cff8f24");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("825fd5b7-a6e5-4367-9f84-fd66b6168f34");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("26d5883a-f96a-4e64-bce4-793370372a45");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("ebfeafc8-cef3-4539-923a-967d26d9b918");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("63a435a7-27f2-42f3-be88-d3cf1bb5884f");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("e4cc2cba-4141-4486-88f5-04e8df391055");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("21b768f5-c8bc-4451-9110-6fa793e3505d");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("356f03c3-f231-4939-95af-df17b3ec6088");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("dae4e610-e89e-4f17-bf40-3259b76cf964");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("3373de1d-593c-4832-9c59-1022aed6ef44");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_PostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("c46cc5f8-1ca3-47a1-8a9a-25d9626bd5a0");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("21bffcee-9d98-4877-bb62-007c90e17f6b");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("d43ba6de-070e-42d4-8468-86a9dc56a6d5");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("5129a5d7-8a93-4c87-8acd-09af86b5d1aa");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("51110580-ec49-4d88-a81e-b90e982fda1d");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("356a0afd-e117-4be4-9d5a-c991cee72b2c");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("d89b4b1d-15ca-4cfe-a48d-ca1952958b6a");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("0edd0000-7b40-4ae9-a49a-5beafe1d9aed");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("5484f454-e6e3-49c0-96c4-b83767ab8ccb");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("a770fd7e-817d-479c-91b7-5b016bd94145");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address11(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("dfa07742-590b-4717-9ada-04c4bf739608");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address12(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("b478d196-c3f6-45e5-bcae-a0f8b4ea2aeb");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address13(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("ded7a31b-c76e-4f85-b92d-703f747dd0a3");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_Address4_1(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("87fd8ebf-be71-4dbc-a061-67bd8c354fd9");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Enter_PostCode2(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("e9064482-e4c0-4c55-bbcf-7cf6e9a4b75f");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("a9e2864c-4a70-4fe1-9a77-334e91f46163");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("126e95b3-dc11-46c8-af29-e10eb779fe90");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69613.Click_Full_Accounts();
    

    }

}
