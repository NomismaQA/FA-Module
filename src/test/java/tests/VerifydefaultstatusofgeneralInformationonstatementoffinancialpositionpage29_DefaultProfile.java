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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/278e2d99-360d-4467-a263-33cba0d74deb
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 916, profileId = 100809)
public class VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29","VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29 - Default Profile"})
    @TestModellerPath(guid = "84ce0905-587a-423d-8406-c4dcab08c8fd")
    public void GoToUrlAssertUrlPositiveEnterUsrnamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cPH() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        pages.VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29 _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29 = new pages.VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29(driver);
    TestModellerLogger.SetLastNodeGuid("492c45ff-c7f7-4fdd-a509-cf558712fceb");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("013c3d31-52cf-47f1-a394-3fc81b589d9e");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("88550b33-64f1-49fe-9d42-efa51e2e1ee5");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Enter_Usrname(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("82fe7960-c504-4142-81d4-bdae18759362");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("467949c6-88ff-4df1-a6e6-e3ccd1e8a839");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("0c77009a-0f23-4088-b2a7-b98ed3bd0ed1");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5fb2b2a5-68d9-46d5-9030-d10d6b9b4a82");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("22e33e0c-dbd2-454d-a9ec-a21a11b0c0dc");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("71956759-0007-4321-af40-45477f047ec3");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("2fd9d851-885e-452f-9e7b-3f0c8ee4480a");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("921f044f-68da-4e91-bb77-5b9557ba5df0");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("12b8e70d-919d-497e-ba60-2aeb41724298");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("79a578f9-758d-46c6-ae61-dc2e9db85a72");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("360083e7-1729-414a-a8a9-0efbd2d11bbd");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("cce0214f-1801-47c2-a457-e1c74ebe2f42");
//    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Settings1();
    
    TestModellerLogger.SetLastNodeGuid("0fb49d0d-8781-4459-a61b-3cad581a7acd");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("f49f0682-ba83-44bd-a673-46a95d8c7554");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a57457ff-5b3e-43d0-9b8e-59197bb8670f");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("d6e405a9-78c7-42ba-b586-6dd419e7d1a1");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Select_ctl00cPHddStatus("In-active");
    

    TestModellerLogger.SetLastNodeGuid("4212cc59-1917-4d21-b75f-8e6a18fa11fb");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("0fb49d0d-8781-4459-a61b-3cad581a7acd");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("771e4f47-8e21-41ed-b885-eea625316a76");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("37c4fe1a-ceec-410b-97b0-e4526436f738");
    _VerifydefaultstatusofgeneralInformationonstatementoffinancialpositionpage29.Click_Statement_of_Financial_Position();
    

    }

}
