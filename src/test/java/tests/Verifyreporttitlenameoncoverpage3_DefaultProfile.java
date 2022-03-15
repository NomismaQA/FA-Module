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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ad6a3cbb-b492-46a5-a29e-0bfb9c6962d2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1087, profileId = 100984)
public class Verifyreporttitlenameoncoverpage3_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_report_titlename_on_cover_page3","Verify_report_titlename_on_cover_page3 - Default Profile"})
    @TestModellerPath(guid = "36866a37-db2e-45c2-9950-800919e926b1")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyreporttitlenameoncoverpage3_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_report_titlename_on_cover_page3 _Verify_report_titlename_on_cover_page3 = new pages.Verify_report_titlename_on_cover_page3(driver);
    TestModellerLogger.SetLastNodeGuid("4fdefb13-5be0-4318-858c-800ee03362d6");
    _Verify_report_titlename_on_cover_page3.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8521e3b5-2029-49c8-9b37-6a8f19a06e88");
    _Verify_report_titlename_on_cover_page3.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5ffe0ac2-95bf-4043-8704-d10231aa03d1");
    _Verify_report_titlename_on_cover_page3.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("55b4c15b-3803-483d-a28a-daca14f0d9e7");
    _Verify_report_titlename_on_cover_page3.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("dae09d2e-999a-4768-984e-f1bc6994e5b3");
    _Verify_report_titlename_on_cover_page3.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("57d287b7-5acf-4dbf-b271-b9126656ef6f");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4c2d377c-0434-4822-b1e7-f208ef0c1d33");
    _Verify_report_titlename_on_cover_page3.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("0750ce81-09ad-433b-a994-209e35fae44a");
    _Verify_report_titlename_on_cover_page3.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("89dbb791-2a69-4c0f-a514-d87950e70954");
    _Verify_report_titlename_on_cover_page3.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("0ed2fae0-1ec8-46a6-8f0f-4b080d99844d");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b08ddabc-d8ac-4e78-9e6a-bb452c6d7283");
    _Verify_report_titlename_on_cover_page3.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("ea216c56-cd2b-427f-a2f7-f487be71881e");
    _Verify_report_titlename_on_cover_page3.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cf3108f4-858a-449f-80f7-f991b3bec6ce");
    _Verify_report_titlename_on_cover_page3.Click__Testing_Partners_();
    

    TestModellerLogger.SetLastNodeGuid("8d0f292b-2517-4915-a96e-83b56d778412");
    _Verify_report_titlename_on_cover_page3.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("19201835-be7d-455e-bfe8-90281e7f7a2e");
    _Verify_report_titlename_on_cover_page3.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("56b98aaf-7b2a-4624-ac03-eaef1d7f9538");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtCompanyName("ABC LLP");
    

    TestModellerLogger.SetLastNodeGuid("fcb44bab-a956-4171-a71c-1ae5f212f1b1");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("94c97613-58aa-4080-b3d8-b00e4b0fe5bf");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("d705734f-6639-4625-9949-6763493eb32e");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("2ef882aa-c618-43f4-8b39-4bfbe2b1ef99");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("aa795830-790e-4d45-923b-2050239fdd4c");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("2500c785-572a-4d83-9318-6a6b30fbe43d");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo("8709572867");
    

    TestModellerLogger.SetLastNodeGuid("cd8c21c8-ea1c-464f-958f-4aea81451252");
    _Verify_report_titlename_on_cover_page3.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("0f749e74-53a1-41bf-b23d-b1b5467df96d");
    _Verify_report_titlename_on_cover_page3.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("38614849-d296-48ef-a461-94779b893661");
    _Verify_report_titlename_on_cover_page3.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("b820d035-a84c-451b-9bc1-e1f9720b410c");
    _Verify_report_titlename_on_cover_page3.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0ca18ce6-3fed-4d18-ba72-33dee6dd5723");
    _Verify_report_titlename_on_cover_page3.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("72f6a6f8-0d22-4938-a773-d70e770970d2");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("021ad2ac-ba4f-4f2f-a868-7732ed5cf590");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("741419e4-3082-4a8d-8aa5-02539077a6ca");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("bd037de5-ac1a-4689-a45c-c74a117c3cad");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("1a3ced09-6062-46b1-ad45-6569765d2cd9");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("56e6e713-29dc-4dd3-bd0c-0b0ae5a0082c");
    _Verify_report_titlename_on_cover_page3.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("ffeb3176-7dd1-4944-9415-26b0f4d6df28");
    _Verify_report_titlename_on_cover_page3.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("50c61db8-cc1f-4bec-bb9b-656a3dea3951");
    _Verify_report_titlename_on_cover_page3.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("50ae8ec1-95ed-420d-ba2c-18a3e2e99e54");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("6b678606-1af0-4460-9870-635be00615a6");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("15785050-2a15-4a26-bed0-83fcfa82823c");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("63148b32-16be-4f86-99df-9a9d56679c9c");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("703d3bca-a604-4d7c-96d7-53137f40b299");
    _Verify_report_titlename_on_cover_page3.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("8a4bba77-9cc2-45db-ae7c-b98354e2f032");
    _Verify_report_titlename_on_cover_page3.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("fc52f1ae-b718-4abf-9984-f48a1fc2ac59");
    _Verify_report_titlename_on_cover_page3.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0f940ac3-278d-4c3f-b7c4-053c8ff39d84");
    _Verify_report_titlename_on_cover_page3.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("1ad8431c-fbdb-4cf0-9aee-7d40a94dfae8");
    _Verify_report_titlename_on_cover_page3.Click_Partnership_Information();
    

    }

}
