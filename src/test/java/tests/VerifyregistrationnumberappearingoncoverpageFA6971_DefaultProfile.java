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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3c630f0b-8360-467a-9141-69146a2df668
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1342, profileId = 101209)
public class VerifyregistrationnumberappearingoncoverpageFA6971_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registration_number_appearing_on_cover_pageFA6971","Verify_registration_number_appearing_on_cover_pageFA6971 - Default Profile"})
    @TestModellerPath(guid = "3cd0f3e5-77d0-4413-90d9-d58141334278")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyregistrationnumberappearingoncoverpageFA6971_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_appearing_on_cover_pageFA6971 _Verify_registration_number_appearing_on_cover_pageFA6971 = new pages.Verify_registration_number_appearing_on_cover_pageFA6971(driver);
    TestModellerLogger.SetLastNodeGuid("00e8ec3a-d3c9-4235-8eb0-604f2802941f");
    _Verify_registration_number_appearing_on_cover_pageFA6971.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0082c6e5-4da7-4443-bf0d-f748596b7cb6");
    _Verify_registration_number_appearing_on_cover_pageFA6971.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("324f85cf-5c5f-4f4e-b6e7-f9a288b17075");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4621d0d9-0900-4161-b6ee-9c1223bfb1f1");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0837a5be-a535-4a89-b9e6-556b34f4b1db");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("7c15a3b2-f896-41dc-91f8-2aa8443220be");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("181049bc-b1b7-4567-b6d3-5524ecbe998c");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("6c3be686-4fe2-4d93-b066-f6e99d9f06e3");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("98f9019a-93ec-47fb-848c-38d36ea85a07");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("cd183299-89f5-4830-938c-cd751b431a19");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("83ee72ee-1cc5-4878-97ae-3f660d3b779e");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("6606e507-6281-4078-a5ac-7137138dfb1b");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("3a34fe54-6b57-4a97-a6bb-64b3234c71f0");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("2fb5b215-fd94-423d-830f-ed43325a5896");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("418ff892-1832-451e-85f2-e8868679c6e8");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_General();
    
    TestModellerLogger.SetLastNodeGuid("4d1a2c5a-2c13-4d6c-9081-eae5d61e9b97");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("57878789-ff61-4a3e-9d21-988ddf09ead7");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("0e08cae2-f3e2-4533-a3e8-3cff483dc701");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("5c53b2e8-19ac-48fe-a69c-b7b38920669e");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("ee8d6045-28ca-45dc-ab2d-7902a40fbe24");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("8a6b592a-314d-4598-bd86-931f3a3f6dbb");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("cb14b5f2-b430-4911-9f13-35eca78472d8");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("cddca129-2000-40f2-8eef-eedae70e00d5");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c3654608-9823-4c6b-8604-c809d8202147");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("ec90a41d-4eea-4f0a-9095-b27e0d206c05");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("beee0eeb-e814-4872-9976-677710cf3034");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("823ea164-969d-4352-bde6-66c56bdc75c9");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("5298baa3-4d23-40f0-824e-3352cb24d4ab");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("9cfdc718-373a-4649-b79b-7b689b248600");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("4c2bb332-5d87-444d-88b2-84bcbdcbe15c");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("b7f10441-be22-439c-8244-5c0693c6ea7a");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("7c03f0b6-2bf7-4a13-a006-d8b2d09787de");
    _Verify_registration_number_appearing_on_cover_pageFA6971.Click_Filleted_Accounts();
    

    }

}
