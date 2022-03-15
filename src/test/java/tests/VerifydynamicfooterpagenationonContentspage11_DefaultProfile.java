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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/c375fcd1-7437-4a0e-b2c2-36f92b984a19
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1090, profileId = 100988)
public class VerifydynamicfooterpagenationonContentspage11_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_Contents_page11","Verify_dynamic_footer_pagenation_on_Contents_page11 - Default Profile"})
    @TestModellerPath(guid = "4b2738bd-663e-45bb-af09-b0e6af97e976")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicfooterpagenationonContentspage11_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_dynamic_footer_pagenation_on_Contents_page11 _Verify_dynamic_footer_pagenation_on_Contents_page11 = new pages.Verify_dynamic_footer_pagenation_on_Contents_page11(driver);
    TestModellerLogger.SetLastNodeGuid("d2563005-ae5c-4462-a099-c7a43cfc198b");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("0cb99dfc-157b-4fb6-b8c0-840b234ede9f");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f07b40f6-4239-48fb-a562-7e05f113c3ee");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("3676f3e0-c973-44d1-af18-303f713f0a66");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("c9ad13a2-afb8-4b3d-a92a-cfd744debc3e");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ea73d174-35e5-419e-ace1-263324e9b0d3");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9e5c0f7d-0eea-435d-b0b1-66d9993932fe");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("7af21c34-3f1b-4e9e-9bab-7ce22fc2f9bc");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("77d51dde-cbe9-4547-bb9a-4c49a2048cc3");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("9f9cb78c-934f-4884-9b4b-353a9d726e94");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("14f0eda3-d841-483f-8115-baabdc60f514");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("149521fc-ce8d-4abe-a43e-40e4c261bf09");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("be7444ba-0c24-4a4a-a597-995b42d46130");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("0d2f4d5b-53bf-486f-83ad-b90d7c6949df");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("095ef345-3cb0-4d61-9f78-73131487c070");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("7f40a2e8-e7e8-4a0f-ab86-59bef19b90b1");
    _Verify_dynamic_footer_pagenation_on_Contents_page11.Click_Filleted_Accounts();
    

    }

}
