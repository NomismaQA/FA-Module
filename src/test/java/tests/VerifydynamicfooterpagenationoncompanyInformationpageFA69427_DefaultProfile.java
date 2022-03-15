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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/25a6e393-8fbd-47f8-8019-e88f49cc9446
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1424, profileId = 101294)
public class VerifydynamicfooterpagenationoncompanyInformationpageFA69427_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427","Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427 - Default Profile"})
    @TestModellerPath(guid = "d1f9fae2-b677-483c-92bf-7090681db7f9")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicfooterpagenationoncompanyInformationpageFA69427_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427 _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427 = new pages.Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427(driver);
    TestModellerLogger.SetLastNodeGuid("9cac9864-c302-4f2f-859f-74a14ec4ab37");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("af679791-5092-4b58-aa3b-5d064933f588");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb229664-986f-43f8-91ec-c10c138dcbec");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a49a4490-8975-4b90-b5ed-6083f2e0692e");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("12f8bd8d-df95-4dac-a0e5-5794aad8ad69");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("1a88bd15-fa3f-4dba-9181-c7ab3946a00f");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8bc48b52-736f-41a8-bd3b-a0e3efab6f99");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("64dc7622-b08e-44d9-9464-cefbaa679ace");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0cb653b6-bff8-4cc9-aee9-09b2898c1592");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("27b3e79b-d20a-43bf-be72-6b704eb17371");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("227d6545-402f-4cb3-80c9-b27bdd8e237f");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("16b85e10-2af4-4ba9-85d0-b2cdf0b713c4");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("caf87d40-a8ae-41eb-a51f-f0771b0a61e0");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("128daff9-3e3c-4cd7-bb4b-875b2bd60713");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("7cb470f9-321e-42e7-b38c-27434ab67b77");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f9c67972-8fc8-473d-bb5e-ba8b3ea08395");
    _Verify_dynamic_footer_pagenation_on_company_Information_pageFA69427.Click_Full_Accounts();
    

    }

}
