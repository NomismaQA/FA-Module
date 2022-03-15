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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/392a0440-2409-4a5f-9151-24112994caef
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1407, profileId = 101272)
public class VerifywhetherdynamicpagenumberingoncontentspagearechangingautomaticallyFA69411_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411","Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411 - Default Profile"})
    @TestModellerPath(guid = "c122ccc0-1687-42dc-a1dd-2538bf08b2ba")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifywhetherdynamicpagenumberingoncontentspagearechangingautomaticallyFA69411_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411 _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411 = new pages.Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411(driver);
    TestModellerLogger.SetLastNodeGuid("563871a6-2c52-4b4d-abe1-adb9cb4619c1");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("93c5e72b-9868-4451-8d23-41f1370a3df3");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9bc226ec-0c96-44fd-a90a-cfa16ec2db37");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e7996450-2908-4d9b-addc-3fea855d5ece");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("5a40c65e-2390-43b0-ac9c-ddc361a7a18a");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9a58d437-aab2-468b-b304-1553181dc492");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7641d26e-9dc0-450f-856e-6674de7b19aa");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3e4d136c-47cd-4555-a818-98bb78090308");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ec395b30-abdb-4121-a98d-884a2015cbf1");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("79c578bf-7bb1-415e-b44b-a7ca2431457b");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ae92b89b-298f-4fa8-9c9a-e84268fb3af5");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("704de4f6-24ed-44a3-9014-d56bc9bede58");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("252532e1-e102-423e-850f-d659f07fdd3a");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ca92dc4e-22c3-4e29-bc5d-febaf4251858");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("de50c54c-f7d1-4617-a7cd-2594bc7c4eb5");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b0dc0458-10d6-4256-abdc-12175ab1c1b0");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("525a5ab6-1467-41e5-9e1e-84359f8006d7");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("1f9f01fb-3b8b-41b4-89e7-5ee345bdff20");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("01c435f0-4eb9-4c8b-90e7-5f82793519a2");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("a022dbca-7bf5-4c73-8676-b24c2606ce6c");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("fcb1cca0-04e5-449e-9413-4466df046fc9");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("15986c61-b27e-4c65-9bbd-238ffa34cda8");
    _Verify_whether_dynamic_page_numbering_on_contents_page_are_changing_automaticallyFA69411.Click_Full_Accounts();
    

    }

}
