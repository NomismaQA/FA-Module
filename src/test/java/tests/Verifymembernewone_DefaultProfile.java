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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/995fb057-410e-4613-91c2-e5621feaf15e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1071, profileId = 100971)
public class Verifymembernewone_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;   

    
    @Test  (groups= {"Verifymembernewone","Verifymembernewone - Default Profile"})
    @TestModellerPath(guid = "e3ca94f6-6f2e-4009-b06f-1067fffe6990")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifymembernewone_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verifymembernewone _Verifymembernewone = new pages.Verifymembernewone(driver);
    TestModellerLogger.SetLastNodeGuid("5131c2ed-7b6c-4812-88ff-edcaaa0d97fa");
    _Verifymembernewone.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8064be6b-7af5-4af1-bfb4-fccfdc59d87b");
    _Verifymembernewone.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4019afc5-7017-4a48-b227-151d0ec9f8dc");
    _Verifymembernewone.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c7112260-2d02-4c8f-b547-8315f568c91c");
    _Verifymembernewone.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("af66c5c9-6c16-4f4d-850f-19ad45db4cc1");
    _Verifymembernewone.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9ed0e3eb-b5a0-477c-9303-92034c94d3e9");
    _Verifymembernewone.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("81845932-78a1-4ca9-9c7c-b9ba1f3e4840");
    _Verifymembernewone.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("f04f0d40-3919-4dbb-909d-fcc6797e5819");
    _Verifymembernewone.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d93d4ba8-2da1-45f8-905e-70bd3427b196");
    _Verifymembernewone.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("1b11a8d7-e2d4-489b-9b92-beb64a746e03");
    _Verifymembernewone.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("51364bf5-573a-482e-a5d2-c5ba4524d09b");
    _Verifymembernewone.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("43e19e46-af8f-4530-9ac3-83f378947e8e");
    _Verifymembernewone.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("ae58bfea-c90b-4773-9f12-e26786b37052");
    _Verifymembernewone.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("b12c24ae-c412-4859-a6ca-acaedc83ed42");
    _Verifymembernewone.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("18d7b205-ab3d-4b37-9525-fef8c1a6c549");
    _Verifymembernewone.Click_Members();
    

    TestModellerLogger.SetLastNodeGuid("a93ef758-beb5-467f-92e5-9453de1daf65");
    _Verifymembernewone.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("aa234a53-d3bf-43e7-95d1-9dfd145ffb7b");
    _Verifymembernewone.Click_Add_Members();
    

    TestModellerLogger.SetLastNodeGuid("baf36f40-25d2-477e-903a-1f9244821d4d");
    _Verifymembernewone.Enter_ctl00cPHtxtFirstName(sData[29]);
    

    TestModellerLogger.SetLastNodeGuid("7bbd08de-b9f8-47cf-a78b-e96b95c8c0fd");
    _Verifymembernewone.Enter_ctl00cPHtxtLastName(sData[30]);
    

    TestModellerLogger.SetLastNodeGuid("8f1ad436-bd0f-4e45-a62e-652988f14975");
    _Verifymembernewone.Enter_ctl00cPHtxtPersonJoiningDate(sData[35]);
    

    TestModellerLogger.SetLastNodeGuid("d3385756-4f44-490a-9f59-4426216eb9dd");
    _Verifymembernewone.Enter_Memberaddress1(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("9873d543-acf4-475e-9225-ef93cb2c6b88");
    _Verifymembernewone.Enter_Memberaddress2(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("ca250cc7-434a-443e-b351-3e897401ef60");
    _Verifymembernewone.Enter_Memberaddress3(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("44d7c18d-e65d-4e62-8147-c882c19bf5de");
    _Verifymembernewone.Enter_Memberaddress4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("0df80a31-2330-4f6e-8426-30ee8b7c21bd");
    _Verifymembernewone.Enter_ctl00cPHtxtPostCode("WC2N 5DU");
    

    TestModellerLogger.SetLastNodeGuid("6af9929f-0647-4240-9eea-a60336a5a9e2");
    _Verifymembernewone.Click_Save1();

    TestModellerLogger.SetLastNodeGuid("e5da00aa-5fed-4634-9543-3be94e944021");
    _Verifymembernewone.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("292fb132-b291-4570-9d7d-475caace9206");
    _Verifymembernewone.Click_Settings2();
    
    TestModellerLogger.SetLastNodeGuid("b4444788-39b9-4dfe-9d04-d6031dbdcf40");
    _Verifymembernewone.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a679fe56-4d0f-49cd-9566-b052572411d1");
    _Verifymembernewone.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("59cae849-8b9e-4f1f-ad3e-0b4837cef92e");
    _Verifymembernewone.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("549e1c5f-0f85-4553-a974-156e6cacbdf5");
    _Verifymembernewone.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("e628e1ff-ef92-4175-a8b3-7bbda04ee04d");
    _Verifymembernewone.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("70f02673-1c15-45b9-8863-9f74975ca925");
    _Verifymembernewone.Enter_ctl00cPHtxtCTutr(sData[19]);
    
    TestModellerLogger.SetLastNodeGuid("aeb4fa8c-c2c5-40b0-a17c-46ac897382b2");
    _Verifymembernewone.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    
    TestModellerLogger.SetLastNodeGuid("128a0d4d-ccd2-438d-834c-df8fa36d49b7");
    _Verifymembernewone.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("4df44258-787d-467e-a585-d30e6693e8fd");
    _Verifymembernewone.Enter_ctl00cPHtxtAddress1(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("0be8b9fe-b1a7-401c-b3f3-ec04a28d29d8");
    _Verifymembernewone.Enter_ctl00cPHtxtAddress2(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("07df0706-4729-4d3e-8d19-585b041a9ff6");
    _Verifymembernewone.Enter_ctl00cPHtxtAddress3(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("ff8a09cb-64bd-4981-9a05-7c67a278cc19");
    _Verifymembernewone.Enter_ctl00cPHtxtAddress4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("f3f40ad2-10f6-4810-bc9a-b7ca41e36e2d");
    _Verifymembernewone.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("035af19a-8848-45c1-af25-30221fe762f9");
    _Verifymembernewone.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("c806752f-b126-4000-bd68-e748c3d5afc2");
    _Verifymembernewone.Click_Final_Accounts2();    

    TestModellerLogger.SetLastNodeGuid("c8c2538e-d318-44b3-9d20-81efba028231");
    _Verifymembernewone.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("18f371b0-a9ca-4b33-b170-6f87a4fff3d5");
    _Verifymembernewone.Click_Partnership_Information();
    

    }

}
