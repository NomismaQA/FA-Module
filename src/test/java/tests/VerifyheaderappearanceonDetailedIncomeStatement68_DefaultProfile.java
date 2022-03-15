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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/362222a3-3c4d-4637-a2d5-ddf3879087d7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1007, profileId = 100906)
public class VerifyheaderappearanceonDetailedIncomeStatement68_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    @Test  (groups= {"Verify_header_appearance_on_Detailed_Income_Statement68","Verify_header_appearance_on_Detailed_Income_Statement68 - Default Profile"})
    @TestModellerPath(guid = "e1b8eab1-2ab9-4c90-bee5-830176526674")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonDetailedIncomeStatement68_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_Detailed_Income_Statement68 _Verify_header_appearance_on_Detailed_Income_Statement68 = new pages.Verify_header_appearance_on_Detailed_Income_Statement68(driver);
    TestModellerLogger.SetLastNodeGuid("5a1ccbc7-9d6d-41fd-b20f-0a43513872c6");
    _Verify_header_appearance_on_Detailed_Income_Statement68.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("7e5c166a-b217-4575-9537-41fcee2026e9");
    _Verify_header_appearance_on_Detailed_Income_Statement68.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3928a688-8f5d-4314-81dc-27f840dd0878");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("40bb5e12-a6ae-4d82-8542-fd1f8f8854d2");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4cc3a5a7-99da-4675-bcbd-6ec4aa93ece3");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("7ec3421d-b2dc-4b51-ae2b-e3faee194eb1");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("c22b525f-0df3-424b-b87d-8b4c1a7fbfcf");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b31c9ff3-db30-45d4-be9c-8d71f2c6fb38");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("74e68dab-9a3c-4ad6-88c5-016bc756bddf");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c01c1872-8fa2-4f0d-b670-c3563a7187ec");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("0cc6fe1e-8f4d-479f-9be0-5f3f00db590d");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("fe1a682b-1011-49e4-9eb3-fba400b295fc");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7fff745d-34b3-4dc2-a4c4-a9d5cf698829");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("6688167b-b38e-4595-a2c3-402dbdc274e2");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3bead992-bcba-47e1-9715-a0e7454e81a6");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("59468cbe-e21c-4a15-8bd2-c4ea2683c296");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("fd715d2e-390f-4a58-ab21-358f4abd4787");
    _Verify_header_appearance_on_Detailed_Income_Statement68.Click_Detailed_Income_Statement();
    

    }

}
