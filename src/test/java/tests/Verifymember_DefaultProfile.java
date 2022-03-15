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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b67df80c-499b-4e65-8b75-7682399c4ba5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 872, profileId = 100751)
public class Verifymember_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifymember","Verifymember - Default Profile"})
    @TestModellerPath(guid = "8cf28b2e-9f0b-425f-986d-9b5198fbfa90")
    public void GoToUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cPHFiltertxt() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifymember_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifymember _Verifymember = new pages.Verifymember(driver);
    TestModellerLogger.SetLastNodeGuid("d83532d1-b37e-4b4b-b951-0d96bb596c6f");
    _Verifymember.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("30607d49-e2ce-4d59-976b-de2de9efac04");
    _Verifymember.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("051f5d18-9c64-4c25-bfb1-acd015e35ecf");
    _Verifymember.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("45a2c6aa-442f-46e7-91e1-99a4a7d4777a");
    _Verifymember.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("6b176718-49f1-4a3c-b499-7b7b5091a9af");
    _Verifymember.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b8c0fde8-a7fd-4ea0-a01c-2af48d8aeae2");
    _Verifymember.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("c85eeeb1-f14f-46e6-b326-cffab9a10823");
    _Verifymember.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("8692248f-5270-441b-8e38-aab028e07efa");
    _Verifymember.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("2a215629-7a26-4f60-9b73-936897bf127d");
    _Verifymember.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("3d5f8090-817d-4e51-afe1-3c5910b5b017");
    _Verifymember.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("229ed183-995d-4e49-9e30-909bd72676b6");
    _Verifymember.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("84ca6298-20a8-43fb-a3fb-e751db5f50d1");
    _Verifymember.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("32ec766d-2caa-4698-b373-c9df9b079889");
    _Verifymember.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("23bb721e-a269-4974-86a1-a339b2bb6dea");
    _Verifymember.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a342a50d-3b20-4ae9-a316-193510fd0142");
    _Verifymember.Click_Members();
    

    TestModellerLogger.SetLastNodeGuid("5bdc885a-2a66-4475-aadf-1ff00acb3dc9");
    _Verifymember.Click_Add_Members();
    

    TestModellerLogger.SetLastNodeGuid("d23c5ad4-61da-4771-82db-892fcd02cb59");
    _Verifymember.Enter_ctl00cPHtxtFirstName("ABC");
    

    TestModellerLogger.SetLastNodeGuid("1859fa68-8bbb-4ba2-8df1-b7004f09b116");
    _Verifymember.Enter_ctl00cPHtxtLastName("XYZ");
    

    TestModellerLogger.SetLastNodeGuid("d636148d-1623-4f8b-b0e4-60d3a730b5c2");
    _Verifymember.Enter_ctl00cPHtxtAddress1(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("5ce05766-bdf1-4410-b10e-631052f74849");
    _Verifymember.Enter_ctl00cPHtxtAddress2(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("ac5023eb-eb6b-465b-b54f-0f13ee1cfb43");
    _Verifymember.Enter_ctl00cPHtxtAddress3(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("254bd605-5c9f-4770-91c6-5f4894090e8d");
    _Verifymember.Enter_ctl00cPHtxtAddress4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("9fbae98e-7313-461a-81f5-b920ede91d5c");
    _Verifymember.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("e16a786e-43d1-48e4-844b-e399b0d27bc8");
    _Verifymember.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ef7407fa-2397-4cfe-9218-f1caac95a619");
    _Verifymember.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("880721e3-3e52-464b-90be-3fb56408d316");
    _Verifymember.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b5ad66d0-c93a-4251-9805-8cbc5811afbd");
    _Verifymember.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("5af929c6-84d8-4c04-a0e9-295836f957e0");
    _Verifymember.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    
    TestModellerLogger.SetLastNodeGuid("e63bd1da-f60f-4620-b4e1-263a9973e7cc");
    _Verifymember.Select_ctl00cPHddlAccountantReportFormat("Default");

    TestModellerLogger.SetLastNodeGuid("079750e7-9ed1-4f9c-a8b0-a45ea19e3d54");
    _Verifymember.Select_ctl00cPHddlSignatoryPartnerLmtd("ABC XYZ");
    

    TestModellerLogger.SetLastNodeGuid("9e500435-f2ed-4408-82e0-e141c743a4d0");
    _Verifymember.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();

    TestModellerLogger.SetLastNodeGuid("e3995342-4066-419a-a77c-cd4c1de4b7d2");
    _Verifymember.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("8b68f42b-8457-4a58-8004-3182ac66b6bb");
    _Verifymember.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("216f0437-56c4-4c80-97a7-604bba6ea5b4");
    _Verifymember.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("cb7d99c7-fdde-4600-bb3c-13e689682407");
    _Verifymember.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("1b793782-6e5c-44ce-89bb-2479d46b0a4d");
    _Verifymember.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("6792068a-414c-4fd6-ad54-0c6cac9bfb33");
    _Verifymember.Click_Save1();

   
    TestModellerLogger.SetLastNodeGuid("18abeafa-3e86-4035-89f0-9440a98ebe02");
    _Verifymember.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("54077058-ad3f-4c1b-91e9-2a4dec9f58a2");
    _Verifymember.Click_Full_Accounts();
    

    }

}
