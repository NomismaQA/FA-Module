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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f0aa8b54-ff08-4691-bef0-bbf35b79bf4a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 926, profileId = 100819)
public class VerifyAccountantssignaturedetails43_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Accountants_signature_details43","Verify_Accountants_signature_details43 - Default Profile"})
    @TestModellerPath(guid = "7c6835ee-e911-4d4f-b115-ea19756162a7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyAccountantssignaturedetails43_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_Accountants_signature_details43 _Verify_Accountants_signature_details43 = new pages.Verify_Accountants_signature_details43(driver);
    TestModellerLogger.SetLastNodeGuid("2458ce6f-5170-4bcd-a8c0-9a109fa7606a");
    _Verify_Accountants_signature_details43.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d4232da5-1585-47fc-b9a8-2be531ab40bc");
    _Verify_Accountants_signature_details43.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ff0e20a0-cb46-4c8d-a6e7-086c7427827b");
    _Verify_Accountants_signature_details43.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("79150fd9-1d89-4719-84bc-30474cc85fe0");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("8f1e26a9-de44-461d-a838-496ed341ffba");
    _Verify_Accountants_signature_details43.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("749cc0c0-260d-413c-ac85-ff77380b3b8d");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b6ff40d3-722b-4f66-8b2a-9c0153cf385b");
    _Verify_Accountants_signature_details43.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("9c8528c4-312e-43b5-8902-b30ffe559fcc");
    _Verify_Accountants_signature_details43.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("87f25d85-a89b-46dd-95e3-f6b01bf7c6d0");
    _Verify_Accountants_signature_details43.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("9c93ea4c-fc2a-4a2b-88c6-80e21c6b267b");
    _Verify_Accountants_signature_details43.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("abc0ed4d-a018-4411-8184-77acd9e19ef6");
    _Verify_Accountants_signature_details43.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("612f6d21-0f4b-4281-a38c-2fd10ec15684");
    _Verify_Accountants_signature_details43.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("b36343d9-308e-449d-9a8b-05c4c87937bf");
    _Verify_Accountants_signature_details43.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("13a1e54c-3007-4be2-a30b-69e7285d3cd2");
    _Verify_Accountants_signature_details43.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("88f3f36f-d849-4d8f-973e-40591197d98b");
    _Verify_Accountants_signature_details43.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("a0048f93-9189-4128-8c82-6f12cccccdaf");
    _Verify_Accountants_signature_details43.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("fbd54a62-a151-4bb3-ba43-8ce8f0c0c375");
    _Verify_Accountants_signature_details43.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("d23fc477-34f3-4b8b-8829-fb1e72838e34");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHtxtAccountantName(sData[38]);
    

    TestModellerLogger.SetLastNodeGuid("8b791d25-4cd4-4143-aecb-fc51e672988a");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHtxtAccountantsDescription(sData[39]);
    

    TestModellerLogger.SetLastNodeGuid("0b9f6c99-b2ed-4ccf-9c22-6c239bc8616a");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHtxtAddressLine1(sData[40]);
    

    TestModellerLogger.SetLastNodeGuid("51891386-e696-4062-9107-61969c02a5d8");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHtxtCityTown(sData[41]);
    

    TestModellerLogger.SetLastNodeGuid("aabbb39f-5c7a-4e97-a47c-7bdb8c3ae15b");
    _Verify_Accountants_signature_details43.Enter_ctl00cPHtxtPostCode(sData[42]);
    

    TestModellerLogger.SetLastNodeGuid("d2108b12-e62e-4248-90df-2f002c60999d");
    _Verify_Accountants_signature_details43.Click_Set_To_Comapany_Level();
        

    TestModellerLogger.SetLastNodeGuid("e6880747-6b66-438c-9b56-57bc3c7fa24d");
    _Verify_Accountants_signature_details43.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("9ef45546-b666-4979-b50b-e41ae5340a1a");
    _Verify_Accountants_signature_details43.Click_Full_Accounts();
    

    }

}
