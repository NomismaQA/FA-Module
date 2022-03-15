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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/48cc2e90-c8e3-4bbc-bfd6-8f951c8f9f25
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 884, profileId = 100772)
public class Verifyregisteredofficeaddress_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifyregisteredofficeaddress","Verifyregisteredofficeaddress - Default Profile"})
    @TestModellerPath(guid = "c307feaa-8d77-4e55-b09d-7b2f886a734e")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyregisteredofficeaddress_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifyregisteredofficeaddress _Verifyregisteredofficeaddress = new pages.Verifyregisteredofficeaddress(driver);
    TestModellerLogger.SetLastNodeGuid("dde6268b-f0e4-4d4b-a4d5-607b1149a9cc");
    _Verifyregisteredofficeaddress.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7f0c706f-c25a-4b4c-bec0-b9eee7c760d1");
    _Verifyregisteredofficeaddress.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9ba83723-61e7-4e03-a08f-5dd9234797ea");
    _Verifyregisteredofficeaddress.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("caaa4b1c-9280-4b1f-9962-c2e4eb397069");
    _Verifyregisteredofficeaddress.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("534d68c2-96ea-4f35-8a0e-49a8c36b310a");
    _Verifyregisteredofficeaddress.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("793a5ac8-4fce-4bde-88eb-76a0a77f82fe");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("83b6e9cc-631d-4bed-8200-33d112488c5e");
    _Verifyregisteredofficeaddress.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("9c48caad-d34e-4e26-8719-4c7b2c612a70");
    _Verifyregisteredofficeaddress.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d9fc9c19-bf23-4135-b44d-de334bf0fd51");
    _Verifyregisteredofficeaddress.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("bb5ec908-3987-4967-9575-08775bb146fb");
    _Verifyregisteredofficeaddress.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("71bfc9d1-d5b8-4168-ab54-f2f74340b4a5");
    _Verifyregisteredofficeaddress.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("e5810644-53d4-4d2d-a2f5-a8c5036e6b6e");
    _Verifyregisteredofficeaddress.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d4fc5f24-4b21-4655-a3b8-cb364537bbad");
    _Verifyregisteredofficeaddress.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("4b22bd24-7c53-4675-b11d-1389d0264686");
    _Verifyregisteredofficeaddress.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("9696e551-f8a4-4d9c-9902-7acb9a05176d");
    _Verifyregisteredofficeaddress.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("323058f5-79de-4476-9d2f-ed21f9e2e233");
    _Verifyregisteredofficeaddress.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("f31b3daa-887f-4a79-9dff-b6a402254cb4");
    _Verifyregisteredofficeaddress.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("73fd5b7e-7580-4f47-acd2-da7ecdffbea7");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("1fb4447f-1d65-4f92-bec8-b7cedbf5314d");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("6c544c7e-cf31-4025-9f10-6de1eeca2c29");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("f2da8787-5232-4b73-bd09-6129b87ba2fe");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("e0fe2288-6ea0-4922-b35b-80a6887adad1");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("94687530-6cb9-45d5-ac8a-4df75c9d4ba6");
    _Verifyregisteredofficeaddress.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("e971da9e-6c75-47a9-8f86-19bef4fea5bd");
    _Verifyregisteredofficeaddress.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("449b9fa4-7e69-4c4c-a1ea-b79d972e20ad");
    _Verifyregisteredofficeaddress.Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("e3995342-4066-419a-a77c-cd4c1de4b7d2");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("8b68f42b-8457-4a58-8004-3182ac66b6bb");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("216f0437-56c4-4c80-97a7-604bba6ea5b4");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("cb7d99c7-fdde-4600-bb3c-13e689682407");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("1b793782-6e5c-44ce-89bb-2479d46b0a4d");
    _Verifyregisteredofficeaddress.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("6792068a-414c-4fd6-ad54-0c6cac9bfb33");
    _Verifyregisteredofficeaddress.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("081fac6c-79e3-4d49-ad5b-dbd46b9cbf84");
    _Verifyregisteredofficeaddress.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("aa877a61-3179-47c2-a1b0-487455578aa8");
    _Verifyregisteredofficeaddress.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("352a6dbe-78f4-4348-b691-f941aab6494b");
   _Verifyregisteredofficeaddress.Click_Partnership_Information();

    }

}
