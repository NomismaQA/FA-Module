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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6ea9d474-4dd9-4d7f-a6cd-ddc82ab79141
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 904, profileId = 100797)
public class Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage","Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage - Default Profile"})
    @TestModellerPath(guid = "a5001c00-d2e8-4e3b-ab1f-afeb9da82c75")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifynotesappearanceonstatementoffinancialpositionpage_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage = new pages.Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage(driver);
    TestModellerLogger.SetLastNodeGuid("fcca5b74-1f9d-471e-9ae9-3659b9193b80");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a1cff7b4-b3b2-4714-93dc-04eef311b947");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("781f7561-8028-4980-bacf-5aadf5a28e14");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("9a19d826-5d52-4f0f-906b-e6dafd909f74");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("41e45d48-3ef0-48df-ba3b-d594bad47cdc");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("906381f8-d5cf-4371-b3eb-f06402a2e706");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("18f018a1-a322-4344-82ef-a2c4c9a63382");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7ca39a8c-3da3-4afe-9e56-cc80d63aedb6");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c7c25ce0-5486-4e33-8c81-5650fe605cad");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f5a8a7a7-1d6d-42aa-8634-ea471f107324");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("d6bfd403-2d68-4b72-a4af-d99f5d62f00f");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("30336201-c33e-408e-ba75-61edff59f9c2");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("c353bd33-02d4-42ba-b609-3f67fe9cab64");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("dddaec68-15aa-4ab7-a8a3-3b97d78fa797");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8cca1b6b-781c-4a8a-9bf0-caea28038784");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("a7210bc5-6c4d-4598-9ee9-c9bf382dc503");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("cdda95e0-ea9d-45a8-8f30-98d91a6b886d");
    _Verifybalancesheetfootnoteappearanceonstatementoffinancialpositionpage.Click_Statement_of_Financial_Position();
    

    }

}
