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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/526dfa96-0c3e-423c-9ca6-3b192145bcd6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1366, profileId = 101232)
public class VerifycompanysecretaryappearingoncompanyInformationpageFA69717_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_company_secretary_appearing_on_company_Information_pageFA69717","Verify_company_secretary_appearing_on_company_Information_pageFA69717 - Default Profile"})
    @TestModellerPath(guid = "d7b7da9d-9083-4543-b40c-f40bb0e56c64")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifycompanysecretaryappearingoncompanyInformationpageFA69717_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_company_secretary_appearing_on_company_Information_pageFA69717 _Verify_company_secretary_appearing_on_company_Information_pageFA69717 = new pages.Verify_company_secretary_appearing_on_company_Information_pageFA69717(driver);
    TestModellerLogger.SetLastNodeGuid("10041712-dbf2-4263-b352-84260b1156b9");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e4416a7c-60e8-43db-b108-8e16da73bdee");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0b89e848-2c07-4d80-85c3-5b364435fff3");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d1d5de1b-f43b-4707-9998-18cdb62b4fb2");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a4a2ebd2-86be-4922-94d1-df610b72776e");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("e7195b0a-fea3-43e3-be54-52aac459346b");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("30524eae-a497-4634-8b8b-52d03d69879a");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("47cd51c8-1c97-4e3d-905f-68c7a09f1d59");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("128ac912-edaf-4c59-8bba-2f3fabda7ea5");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("4cabecb1-5b36-431f-92e0-72e58bcdac2c");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6922b43f-c04c-4bb5-849d-16727059b691");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("10c6d280-4c4d-4e62-9ca4-582b1b25086f");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e21b5345-b320-441b-b1d4-090fe9173227");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("157569b3-b28d-40a4-b93b-12d28b26f8e5");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("6838b175-3176-4e73-914f-8068d678b649");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("571d2bf1-20bf-4ff8-827a-8cc24ccb1ec1");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("eff321ea-b2d2-4837-8c59-071c013ac7a5");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("05275064-2bd9-47b3-8991-8bc605859c91");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Enter_CompanySecretary("Name1");
    

    TestModellerLogger.SetLastNodeGuid("dc7a9538-964e-4212-b7ad-7fa7365309d0");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("4382110d-e8a4-4c11-95f6-177a2c2d226b");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("195b9a8e-28b3-479f-bcdc-209867237811");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("881206d3-10a4-4795-b3fb-6313608f11e3");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("3d96e09a-ee52-4997-b38e-e82aab6ade10");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5a4528a3-c5d8-4109-8c62-40e7ebada6fd");
    _Verify_company_secretary_appearing_on_company_Information_pageFA69717.Click_Filleted_Accounts();
    

    }

}
