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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9dacf7a6-fe64-4f85-96e8-fcb3f31a9258
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1415, profileId = 101280)
public class VerifyregistrationnumberappearingonCompanyInformationpageFA69416_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_Company_Information_pageFA69416","Verify_registration_number_appearing_on_Company_Information_pageFA69416 - Default Profile"})
    @TestModellerPath(guid = "1746beda-8650-4bbe-8d7f-cda1b500a9f5")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifytitlereport_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_appearing_on_Company_Information_pageFA69416 _Verify_registration_number_appearing_on_Company_Information_pageFA69416 = new pages.Verify_registration_number_appearing_on_Company_Information_pageFA69416(driver);
    TestModellerLogger.SetLastNodeGuid("95067f86-f376-40a8-8191-29400096fc40");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5652ace4-c9bc-4766-8025-aa1867f77333");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("da94fe29-8048-4cdd-a21e-16b2018f3094");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("426cad2e-0007-4988-aeac-3e477e9a5848");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ca80a0bc-e584-430b-b6ca-ed9f17488845");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("e5902f42-95a9-4f7a-a8c1-8ffbd0e5e1d8");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a79a99fe-c441-4dd1-b3db-86e04ac188ba");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("734874d6-3e83-46e9-8e7b-8eec6051e384");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("edf90c5f-328a-43ca-89cc-d7dccc2cf1d0");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("20430c31-b080-4dad-8c51-916fbc850dbb");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("296bf5b3-5b8b-4a7c-bbaa-b1cbc9164af1");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("2a7f5b5a-f380-4ade-896a-1bee2f052411");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e94d81a5-4a4f-4dbd-bc1b-e342aea6429d");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click__ABC_LTD_();
    
    TestModellerLogger.SetLastNodeGuid("2fb5b215-fd94-423d-830f-ed43325a5896");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("418ff892-1832-451e-85f2-e8868679c6e8");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_General();
    
    TestModellerLogger.SetLastNodeGuid("4d1a2c5a-2c13-4d6c-9081-eae5d61e9b97");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("57878789-ff61-4a3e-9d21-988ddf09ead7");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("0e08cae2-f3e2-4533-a3e8-3cff483dc701");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("5c53b2e8-19ac-48fe-a69c-b7b38920669e");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("ee8d6045-28ca-45dc-ab2d-7902a40fbe24");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("8a6b592a-314d-4598-bd86-931f3a3f6dbb");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Enter_RegNo("12121212");
    

    TestModellerLogger.SetLastNodeGuid("cb14b5f2-b430-4911-9f13-35eca78472d8");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("f3c50116-3b8c-42cb-8e7d-377cce3ab510");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Final_Accounts1();
    
    
    TestModellerLogger.SetLastNodeGuid("c3654608-9823-4c6b-8604-c809d8202147");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("ec90a41d-4eea-4f0a-9095-b27e0d206c05");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("beee0eeb-e814-4872-9976-677710cf3034");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("823ea164-969d-4352-bde6-66c56bdc75c9");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("5298baa3-4d23-40f0-824e-3352cb24d4ab");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("9cfdc718-373a-4649-b79b-7b689b248600");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("4c2bb332-5d87-444d-88b2-84bcbdcbe15c");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Save2();

    TestModellerLogger.SetLastNodeGuid("d5be6275-b982-4fb7-8899-73ce6610a970");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("bc2f0218-6a3b-4dd8-bd2f-bb068a607857");
    _Verify_registration_number_appearing_on_Company_Information_pageFA69416.Click_Full_Accounts();
    

    }

}
