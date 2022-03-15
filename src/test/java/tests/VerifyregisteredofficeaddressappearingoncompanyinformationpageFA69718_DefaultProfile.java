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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cb739247-587d-420b-b8ad-6586b063d2ca
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1370, profileId = 101234)
public class VerifyregisteredofficeaddressappearingoncompanyinformationpageFA69718_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_registered_office_address_appearing_on_company_information_pageFA69718","Verify_registered_office_address_appearing_on_company_information_pageFA69718 - Default Profile"})
    @TestModellerPath(guid = "7562305c-b413-45a0-9ffb-09f2d5e75c46")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregisteredofficeaddressappearingoncompanyinformationpageFA69718_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_registered_office_address_appearing_on_company_information_pageFA69718 _Verify_registered_office_address_appearing_on_company_information_pageFA69718 = new pages.Verify_registered_office_address_appearing_on_company_information_pageFA69718(driver);
    TestModellerLogger.SetLastNodeGuid("1b88e8f3-0deb-4b4c-a4d7-f68ca68f2b88");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("accabcd9-6f52-4e45-8b3c-429bacda652a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("49b74438-c1ca-4391-9538-9851c98f6dfd");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d5134aea-59a6-45c2-8457-c0a8e3c3e1a2");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("04b1968c-4b6a-4a45-a9b0-380530ff800f");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("bf44758b-4a6c-4cc7-aadf-b05998aa1300");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("d9228e23-f6e2-4d3d-a331-7361140a7e8a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("30bf7255-3ead-422a-8ac2-2a37689fd8b9");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("76cea764-1ca0-4e7f-9474-1755f7280c86");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("de27c60f-5ff1-4e4f-81d8-198b9f063fbe");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("39fdc3c3-00e2-4f56-8904-7c80a0da83f8");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("a25748f3-24fc-4c28-af20-c5a1723409c6");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("10124b42-b6ae-4ab0-97c0-54a9114cbcf8");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("d0e9a0a7-c6ad-459b-a4ab-3112238c02ef");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("cdc63ad8-aa8c-4539-ac88-139a3cc10bc7");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("cf58f696-5e85-481f-9e1d-a4fb5d824a77");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a00b8c63-3e1b-41c8-a4fa-d19f519b1694");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4096b61a-da12-4087-ae48-1fd5c205789d");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Enter_CompanySecretary("Name1");
    

    TestModellerLogger.SetLastNodeGuid("a85e2bd0-d56d-4b52-b322-9025bc8e4109");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("4490c421-0a72-40c0-b13a-46f63d8d2f2a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("6307db22-8c3f-49a2-b81e-94bb83a80856");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("d7de5889-d31b-4c6b-a377-c0aea2c8ee8c");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("ed1563ce-a498-49dd-aae5-9d70fed310df");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("9815e431-ce96-4980-9784-0c79b93fa242");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69718.Click_Filleted_Accounts();
    

    }

}
