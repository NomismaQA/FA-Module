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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/0f196470-cb20-4c4b-ac13-34f8bafc75b1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 933, profileId = 100826)
public class Verifydynamicfooterpagenation53_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
 

    
    @Test  (groups= {"Verify_dynamic_footer_pagenation53","Verify_dynamic_footer_pagenation53 - Default Profile"})
    @TestModellerPath(guid = "17a6b5c0-0eb9-434b-9005-a7efb6236ca7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginPositiveEnterctl00cPHF() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydynamicfooterpagenation53_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_dynamic_footer_pagenation53 _Verify_dynamic_footer_pagenation53 = new pages.Verify_dynamic_footer_pagenation53(driver);
    TestModellerLogger.SetLastNodeGuid("406e348e-3bc8-4902-b6fb-3797ff5f9db7");
    _Verify_dynamic_footer_pagenation53.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("604dd571-bd7b-497f-9a0c-40119e95e210");
    _Verify_dynamic_footer_pagenation53.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4af13eab-19e2-4ff7-b568-9b02af440904");
    _Verify_dynamic_footer_pagenation53.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("61a09885-af5b-45ca-808c-1446d40ec8b9");
    _Verify_dynamic_footer_pagenation53.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("34ec85fe-9e86-4214-98ab-8c54008c4f1c");
    _Verify_dynamic_footer_pagenation53.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("a718dbda-cb2b-43e4-9378-0d8de14eeb6c");
    _Verify_dynamic_footer_pagenation53.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("8bedf12a-251f-4d8c-a566-0b7d13a6c339");
    _Verify_dynamic_footer_pagenation53.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("db010414-aa04-495c-ac33-95605eb8a40f");
    _Verify_dynamic_footer_pagenation53.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7a99c2ee-6a5b-4867-9582-9acf2350eacd");
    _Verify_dynamic_footer_pagenation53.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e95e9d1d-88a9-40b6-b0ac-1b2a2b5caa36");
    _Verify_dynamic_footer_pagenation53.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b8466cd4-9933-4205-a727-6570137e410d");
    _Verify_dynamic_footer_pagenation53.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("1f068025-a0e5-40c4-ae35-5f394dc8815f");
    _Verify_dynamic_footer_pagenation53.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7c482177-1a70-4545-9e23-e34fc1f35675");
    _Verify_dynamic_footer_pagenation53.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("74134dd0-e233-4251-b45f-bf17652b5724");
    _Verify_dynamic_footer_pagenation53.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8e5221d3-e56a-4f89-9b35-6344ccc0b807");
    _Verify_dynamic_footer_pagenation53.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("114f8992-b2f2-48ce-98bf-7941597c389b");
    _Verify_dynamic_footer_pagenation53.Click_Full_Accounts();
    

    }

}
