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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/719d32b4-1a8d-4571-a5a3-a49332a7ad89
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 889, profileId = 100784)
public class Verifyaccountantonpartnershippage_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifyaccountantonpartnershippage","Verifyaccountantonpartnershippage - Default Profile"})
    @TestModellerPath(guid = "8f00ff71-8b07-41b3-8aea-ce27532fce48")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyaccountantonpartnershippage_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
   
     	
        pages.Verifyaccountantonpartnershippage _Verifyaccountantonpartnershippage = new pages.Verifyaccountantonpartnershippage(driver);
    TestModellerLogger.SetLastNodeGuid("a6bd7127-98fd-47c4-8994-849d607b7bc6");
    _Verifyaccountantonpartnershippage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("46fa3376-6869-4518-ae24-9c910605d8d9");
    _Verifyaccountantonpartnershippage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("37117e00-6fb5-4a84-a052-6eeaeed7d059");
    _Verifyaccountantonpartnershippage.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("596e02f9-7eb2-4758-a1d8-55950cf2446d");
    _Verifyaccountantonpartnershippage.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9269703f-8c3e-4f91-98a9-650d058cb0d3");
    _Verifyaccountantonpartnershippage.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("397553cf-f1e6-4dfe-8b94-b1cf6840fa9b");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("6725b6a7-b665-4495-9555-9f0189f95904");
    _Verifyaccountantonpartnershippage.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("88f04313-d27e-44de-b641-36a0d834911d");
    _Verifyaccountantonpartnershippage.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a2ec7be1-c5c4-4e2c-aac3-349ce023857c");
    _Verifyaccountantonpartnershippage.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("7462ba74-a77e-4ddb-ac28-153a8c5993f8");
    _Verifyaccountantonpartnershippage.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("00f0be1e-eb6a-4e06-8458-ca94c2f8b1e5");
    _Verifyaccountantonpartnershippage.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("98947ce9-53f4-44aa-99c1-73c28c77f1db");
    _Verifyaccountantonpartnershippage.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("12c59941-a2cb-4057-b3de-9c11789ef469");
    _Verifyaccountantonpartnershippage.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("ce02b12b-67f4-44d4-9ac0-e16641885a26");
    _Verifyaccountantonpartnershippage.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("16695a8f-5a32-48da-90ce-63862d6f14f2");
    _Verifyaccountantonpartnershippage.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("96bc3ba2-b476-4dd6-a248-7d44f42e35c0");
    _Verifyaccountantonpartnershippage.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("03d2679c-8102-4910-b066-82992d742170");
    _Verifyaccountantonpartnershippage.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("3a7f013f-6d13-4844-afb0-183c8c80520d");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAccountantName(sData[38]);
    

    TestModellerLogger.SetLastNodeGuid("4213072d-4e65-447d-a153-9d9cf4f89647");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAccountantsDescription(sData[39]);
    

    TestModellerLogger.SetLastNodeGuid("8e0f84f4-9500-49f7-adbe-b9cd9a83f77c");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAddressLine1(sData[40]);
    

    TestModellerLogger.SetLastNodeGuid("e5b321e1-9189-4414-a5e5-2183b51ee06e");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtCityTown(sData[41]);
    

    TestModellerLogger.SetLastNodeGuid("ba367f4e-beb6-4010-aa9e-a3167b00a01e");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtPostCode("SW4 8EB");
    

    TestModellerLogger.SetLastNodeGuid("04755ed0-335e-441c-803f-fb223e9f9fab");
    _Verifyaccountantonpartnershippage.Click_Set_To_Comapany_Level();
    

    TestModellerLogger.SetLastNodeGuid("0d980846-9926-4ed2-80e5-8bec409203f2");
    _Verifyaccountantonpartnershippage.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("7bd41336-d535-418f-a5e9-123a68f289e4");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("b7343392-ee0b-47e2-b935-63479e84d352");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("a6b02cf3-1ed1-45bb-b36c-6435ea8b08b4");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("cc4a47e5-8691-4996-910e-57e52949a712");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("db416176-cb42-412b-9f3b-ea3e798f6aba");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtCompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("4e2a931d-b9b0-494c-bac7-bde1274846c5");
    _Verifyaccountantonpartnershippage.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("42703a09-8ad5-4444-a105-0029a7da292d");
    _Verifyaccountantonpartnershippage.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("df33d21a-b0a8-4f58-b53c-5ba04b1d0812");
    _Verifyaccountantonpartnershippage.Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("09a90a27-d39f-452f-a5ab-ace1c4816273");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("9b11236c-ffff-48a0-8b86-df6e11fb5bd5");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("139f3d44-8a81-4572-bd78-15d78fb90bef");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("85b808cc-9020-4b76-9b20-de86e16b55fc");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("7ae92eeb-2976-4998-a9e1-2d25aaa85c7e");
    _Verifyaccountantonpartnershippage.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    
    TestModellerLogger.SetLastNodeGuid("fbe65859-b526-455b-8715-34ce37756837");
    _Verifyaccountantonpartnershippage.Click_Save_Button();
    
    
    TestModellerLogger.SetLastNodeGuid("8f8f59dc-feba-4a68-aa26-f141472a58ca");
    _Verifyaccountantonpartnershippage.Click_Final_Accounts_1();
    
    TestModellerLogger.SetLastNodeGuid("8f8f59dc-feba-4a68-aa26-f141472a58ca");
    _Verifyaccountantonpartnershippage.Click_Full_Accounts();

    TestModellerLogger.SetLastNodeGuid("81ecd13c-3834-4071-9fc6-63e1aa736b15");
    _Verifyaccountantonpartnershippage.Click_Partnership_Information();
    

    }

}
