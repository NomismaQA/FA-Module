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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2e3f1dc1-b5b9-4a4d-8ad5-e0f49c7cc0f3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1413, profileId = 101278)
public class VerifyheaderappearanceoncompanyinformationpageFA69414_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_header_appearance_on_company_information_pageFA69414","Verify_header_appearance_on_company_information_pageFA69414 - Default Profile"})
    @TestModellerPath(guid = "5aa5f80a-4a42-487a-a11f-7622c014f1d7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceoncompanyinformationpageFA69414_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_company_information_pageFA69414 _Verify_header_appearance_on_company_information_pageFA69414 = new pages.Verify_header_appearance_on_company_information_pageFA69414(driver);
    TestModellerLogger.SetLastNodeGuid("a7c0c276-004e-401a-83d3-b8bd0f54ef5e");
    _Verify_header_appearance_on_company_information_pageFA69414.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1603a302-0d64-4534-86bf-51fe875dafa3");
    _Verify_header_appearance_on_company_information_pageFA69414.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2954e3ec-2758-4995-92eb-1eba5c8a63e7");
    _Verify_header_appearance_on_company_information_pageFA69414.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("48db6742-e5d6-4a8a-98d1-e67416af1990");
    _Verify_header_appearance_on_company_information_pageFA69414.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("75cccf9f-fb3a-40ec-994b-d6f244e0d679");
    _Verify_header_appearance_on_company_information_pageFA69414.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("bb0b674c-b159-45bd-8d71-63a863e7d270");
    _Verify_header_appearance_on_company_information_pageFA69414.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("98c1220b-8423-4d2a-ab37-f135bda2564c");
    _Verify_header_appearance_on_company_information_pageFA69414.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f0015084-0410-4498-a342-84ab318ce937");
    _Verify_header_appearance_on_company_information_pageFA69414.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("91f8ba61-c475-43a4-b095-6a04cc5060ef");
    _Verify_header_appearance_on_company_information_pageFA69414.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("76237527-d604-4ba3-a24b-4f4211095ca5");
    _Verify_header_appearance_on_company_information_pageFA69414.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("71db6f29-ba8f-4c00-bf95-56a2160b546a");
    _Verify_header_appearance_on_company_information_pageFA69414.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("09a280a7-5965-4c1f-9672-80efe495e43a");
    _Verify_header_appearance_on_company_information_pageFA69414.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ce5b8ac7-fd8b-4322-99b2-2a4bc31cb672");
    _Verify_header_appearance_on_company_information_pageFA69414.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("a216f56a-256d-4487-88f9-91b74a30a88f");
    _Verify_header_appearance_on_company_information_pageFA69414.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b2ec1b96-93ea-4ea1-a10a-6b81cf12bda7");
    _Verify_header_appearance_on_company_information_pageFA69414.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3fffc366-8038-4e34-9f4d-dcdbca04e8bd");
    _Verify_header_appearance_on_company_information_pageFA69414.Click_Full_Accounts();
    

    }

}
