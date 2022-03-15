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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9b5fcc36-d4c8-418e-b457-8b47db5e261d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 903, profileId = 100795)
public class Verifynotesappearanceonstatementoffinancialpositionpage_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifynotesappearanceonstatementoffinancialpositionpage","Verifynotesappearanceonstatementoffinancialpositionpage - Default Profile"})
    @TestModellerPath(guid = "bc4a4a47-fa0b-4df1-a962-b7235c135dd2")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifynotesappearanceonstatementoffinancialpositionpage_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifynotesappearanceonstatementoffinancialpositionpage _Verifynotesappearanceonstatementoffinancialpositionpage = new pages.Verifynotesappearanceonstatementoffinancialpositionpage(driver);
    TestModellerLogger.SetLastNodeGuid("fa8dc234-3cbd-4fea-bc0f-6ab3993db296");
    _Verifynotesappearanceonstatementoffinancialpositionpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("25ee585a-4d8b-4682-8091-ec9512fe30b2");
    _Verifynotesappearanceonstatementoffinancialpositionpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("16fa6b4d-5008-42a6-a91f-b2ba5374e37d");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("5efc976b-84a2-488a-94af-dfd57fb08f96");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("de9aa740-fff2-4ffd-9c92-5c3a1515154a");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a64d590f-9ae5-4bc0-abea-930c9ce27152");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4e49aa6a-9343-43eb-9701-fc232a3a25bc");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("e8a1c48d-776e-47e7-bdcc-c803fe5c7205");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ec52decb-190b-4bf7-82bf-453f11c367a9");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e623aec5-1d89-40d4-86fe-f861fe737232");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b54410bf-54d1-46bf-b7f0-6045654e1be6");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("64488734-5818-4f0c-aab6-a46ec11ac6db");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("70b06268-36a2-408a-b335-2d18797a778b");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("c28b2830-8a50-4358-b3fa-ba78f8febcf5");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("31db426a-2bbf-420f-80ff-b57bf50f51fe");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("18d2eb11-693f-4fe3-905c-4db9f011a4f1");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("8aec6100-de0c-468c-b40d-cdd74cae8aa6");
    _Verifynotesappearanceonstatementoffinancialpositionpage.Click_Statement_of_Financial_Position();
    

    }

}
