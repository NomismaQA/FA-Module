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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/33b463d1-1f31-4292-bffb-5a3c45856658
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1188, profileId = 101077)
public class VerifyregisteredofficeaddressappearingoncompanyinformationpageFA69617_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registered_office_address_appearing_on_company_information_pageFA69617","Verify_registered_office_address_appearing_on_company_information_pageFA69617 - Default Profile"})
    @TestModellerPath(guid = "504fcfde-5d8f-44eb-a9eb-4919c4b0c8b7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregisteredofficeaddressappearingoncompanyinformationpageFA69617_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_registered_office_address_appearing_on_company_information_pageFA69617 _Verify_registered_office_address_appearing_on_company_information_pageFA69617 = new pages.Verify_registered_office_address_appearing_on_company_information_pageFA69617(driver);
    TestModellerLogger.SetLastNodeGuid("3387d9fb-c3d6-47e6-9597-7840dd157ab8");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8cd6bf84-f998-4827-80e9-def65c856a16");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bb2629a5-d060-4912-971f-1422e071bad9");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c78be31b-bd2d-41a8-be93-5ea84b2b95f1");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("6af3fb7f-178c-4cb3-801c-737c3ad6ef6e");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("4b835617-fdbd-4579-a8b8-a7a9b9fa7900");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("88ebafa2-5029-41fc-b310-6da8bc12c49f");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("5b82136e-caa3-473f-8ae4-bf6ea6fad470");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c5a996d6-9830-4654-900f-3d8503f118f6");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("4fda6580-876d-4064-9717-9513c0209a43");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c043542b-cbef-41a0-877d-e85ff2c68fbe");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e971ef76-81e5-4a39-9725-8e48f8834e54");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2fd11440-41c9-4471-9916-dfd430c7b0ba");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("2f3d9528-9e57-4574-9024-823479b6178f");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("7de27f36-6e09-4a93-948f-d7c9f4025866");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("fdbd9ef9-8df1-41ae-868c-342d1bb93210");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("8302d73d-52b4-40e5-a1c5-03acda0e42ae");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("91d8302d-92c2-4f62-9c00-ca3aa3b81130");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("26784302-45b8-4cc7-84c7-85d013a02043");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Authentication_code(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("fe9d0528-5423-4ea1-9bbe-b070cb93d521");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_CompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("75ff1d98-504e-4dff-b746-b8faa8c454f0");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("4aee71f8-01c2-4944-9d33-b1f5278a51ba");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("2c04eca9-e759-43ae-9549-6273c48e97c5");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("ae03a55a-e73c-4a7c-bcd8-1dcf5f158d39");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("b050f25b-9ca3-4941-a8c9-0e8b4f478643");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("a235f78e-c18b-4bd3-8f9d-73b892324b64");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("5aacb78e-fb21-45c2-899e-42a034eede1a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("19791101-6198-4aee-b9b3-ea11ab5a49c8");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("7e81d17d-c389-4fe8-96ac-fe3b0f84b282");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("2a56954d-4e30-4938-9e27-0b42a4f8a1b7");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("19b1861a-023e-4809-a14c-f0ac7933f6dc");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69617.Click_Full_Accounts();
    

    }

}
