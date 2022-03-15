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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/200a7634-3715-4020-9231-8fe6dc22c857
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1189, profileId = 101078)
public class VerifyregisteredofficeaddressappearingoncompanyinformationpageFA69618_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registered_office_address_appearing_on_company_information_pageFA69618","Verify_registered_office_address_appearing_on_company_information_pageFA69618 - Default Profile"})
    @TestModellerPath(guid = "d21ade69-d327-456e-84b7-222c668bfb7d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregisteredofficeaddressappearingoncompanyinformationpageFA69618_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_registered_office_address_appearing_on_company_information_pageFA69618 _Verify_registered_office_address_appearing_on_company_information_pageFA69618 = new pages.Verify_registered_office_address_appearing_on_company_information_pageFA69618(driver);
    TestModellerLogger.SetLastNodeGuid("87dab346-be0f-4dcc-8763-cb3edd4debc5");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0a73f4eb-bb69-40d7-8f8a-588b15bb057d");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("818280e1-35db-4fdc-8203-c02b3eb7bdc5");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e06a12f3-4924-409d-af92-799c61a3cd23");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("5702a3e9-50e4-4076-a5e7-de73d8301cd2");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d6657fbd-24e7-48e2-88b5-8f951cb2296d");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("19b65eba-1c88-463d-9366-68ca61fe19e1");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("14223f7b-b03d-454e-ad47-3dd8266db11c");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("cc0b8729-f179-4abf-9a42-eddc51e6fed5");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("cb8215b8-8e4d-43af-8e38-e2ee5f7fbf48");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("5099a899-1213-46f8-8ff9-de4bd5595c02");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("258c1d03-0e5a-4fab-bf4d-d8ebc0e9d48a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a8f799db-7a5e-4119-ae94-ac85a7e9301f");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("836b0d64-0196-47a1-b659-674ef628480d");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ca812eda-8d81-4f5a-852a-593b515ba6a2");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("a73fc5e0-4d77-4031-b6e3-c4a4c6979564");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b98544dd-ee5c-433f-b318-a5a6aa99e0c7");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("ec82eb52-5e99-43f0-9af4-3071ea397d1a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("93ac742f-3c45-49de-abc3-ea2552c83b63");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("03a19ea3-b700-485a-b385-4344f0ce3c2c");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("89ac8cb3-6cea-471f-a6a6-711005ec8157");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("fa47172d-43d2-45d9-9176-4a1ff372f279");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("87890494-cfea-4832-bac7-5dff56eb213e");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("18c3b175-fe7f-4b56-9a78-63c4a7453149");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("fb7e9991-2633-4b41-8934-3c3c91f06119");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("cb484539-22a1-417b-b006-cc72b25be6cc");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("186890e7-8a19-4cbb-8d98-0651e907c72a");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("8f48c14e-e62f-4c0a-a8fd-dc82b9954ebd");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("99c3bd5c-513d-4618-8f3d-151ae4075452");
    _Verify_registered_office_address_appearing_on_company_information_pageFA69618.Click_Full_Accounts();
    

    }

}
