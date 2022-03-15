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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8ba0bfb4-f301-40dc-adb1-d1b34be70667
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1077, profileId = 100977)
public class Verifyregistrationnumberappearingoncoverpage1_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    @Test  (groups= {"Verify_registration_number_appearing_on_cover_page1","Verify_registration_number_appearing_on_cover_page1 - Default Profile"})
    @TestModellerPath(guid = "4bdcf75f-55c8-46c6-a96e-d6c955445031")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyregistrationnumberappearingoncoverpage1_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_registration_number_appearing_on_cover_page1 _Verify_registration_number_appearing_on_cover_page1 = new pages.Verify_registration_number_appearing_on_cover_page1(driver);
    TestModellerLogger.SetLastNodeGuid("8a8666dd-8ae8-4b15-a7cb-9d92d512e347");
    _Verify_registration_number_appearing_on_cover_page1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("523605d0-b3f8-4467-b318-0757fcee4653");
    _Verify_registration_number_appearing_on_cover_page1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc3702e9-5655-498e-8362-97e9196dc6bd");
    _Verify_registration_number_appearing_on_cover_page1.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("af98687d-ec86-4c5f-af21-7e3929107146");
    _Verify_registration_number_appearing_on_cover_page1.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("62f8bab2-a530-4fa9-9f55-8e344ea96549");
    _Verify_registration_number_appearing_on_cover_page1.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("3b6559e4-d7a2-4df0-9c05-772815b93e67");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("91f735e1-c918-4138-b912-fefa7b80b55b");
    _Verify_registration_number_appearing_on_cover_page1.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b8a6aff5-e2f9-4a24-97d8-9d66a19e5325");
    _Verify_registration_number_appearing_on_cover_page1.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a9f05e99-3d5e-4b2c-9b20-921e49f0abb2");
    _Verify_registration_number_appearing_on_cover_page1.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("bad9d0f8-be59-4c6e-ba16-19feac05a488");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6ed39619-6131-4683-b083-514d1e62a8ae");
    _Verify_registration_number_appearing_on_cover_page1.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("b82f14b1-9d98-49bf-bd8b-c99409d38d4f");
    _Verify_registration_number_appearing_on_cover_page1.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("c0678967-49dc-4c42-82aa-e606b91600b3");
    _Verify_registration_number_appearing_on_cover_page1.Click__Testing_Partners_();
    

    TestModellerLogger.SetLastNodeGuid("79472a0e-f5b6-470e-b38f-17ecfd1e3e41");
    _Verify_registration_number_appearing_on_cover_page1.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("09fec849-7141-4877-9ee8-e9517d866ee0");
    _Verify_registration_number_appearing_on_cover_page1.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4648d485-0d2c-493d-8c22-0652526bee50");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("ac880bfb-8c0f-446d-a6c8-a837fb5d66b2");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("db770399-edbd-41b7-8286-a13fd49a8a22");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("4a7acfab-5fc4-439b-b490-f7a02cad5035");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("29d3c647-588f-4798-8055-9f229935d39c");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("6c5a0e93-9ae2-4f85-880e-9e412fba5f79");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("ce12ee87-c241-4192-b814-7c8c53297123");
    _Verify_registration_number_appearing_on_cover_page1.Click_Save_Button1();
    

    TestModellerLogger.SetLastNodeGuid("2b34b070-73c0-4238-a0a8-d5995515b20d");
    _Verify_registration_number_appearing_on_cover_page1.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("0c5ac990-aa80-47c6-b7ce-2e90180df192");
    _Verify_registration_number_appearing_on_cover_page1.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("b4444788-39b9-4dfe-9d04-d6031dbdcf40");
    _Verify_registration_number_appearing_on_cover_page1.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("352ad797-9eeb-4dd8-97d3-6b819b93b72c");
    _Verify_registration_number_appearing_on_cover_page1.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("59cae849-8b9e-4f1f-ad3e-0b4837cef92e");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("549e1c5f-0f85-4553-a974-156e6cacbdf5");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("e628e1ff-ef92-4175-a8b3-7bbda04ee04d");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("70f02673-1c15-45b9-8863-9f74975ca925");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("f4036b48-3c22-480a-bb00-94fe864b74c5");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("945eb5ff-bf1f-4ef0-a8bf-1bc98d83b149");
    _Verify_registration_number_appearing_on_cover_page1.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("128a0d4d-ccd2-438d-834c-df8fa36d49b7");
    _Verify_registration_number_appearing_on_cover_page1.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("4df44258-787d-467e-a585-d30e6693e8fd");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("0be8b9fe-b1a7-401c-b3f3-ec04a28d29d8");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("07df0706-4729-4d3e-8d19-585b041a9ff6");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("ff8a09cb-64bd-4981-9a05-7c67a278cc19");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("f3f40ad2-10f6-4810-bc9a-b7ca41e36e2d");
    _Verify_registration_number_appearing_on_cover_page1.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("035af19a-8848-45c1-af25-30221fe762f9");
    _Verify_registration_number_appearing_on_cover_page1.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("c806752f-b126-4000-bd68-e748c3d5afc2");
    _Verify_registration_number_appearing_on_cover_page1.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("584ea166-290c-4c88-b1a1-2d92b245ed79");
    _Verify_registration_number_appearing_on_cover_page1.Click_Filleted_Accounts();
    

    }

}
