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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cd7a82f4-6ece-41f8-8b10-383c398c5d61
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 931, profileId = 100825)
public class Verifybalancesheetfootnoteappearance52_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_balance_sheet_footnote_appearance52","Verify_balance_sheet_footnote_appearance52 - Default Profile"})
    @TestModellerPath(guid = "f7ee34bb-a076-4e63-a08d-3f04d5d21f31")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifybalancesheetfootnoteappearance52_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_balance_sheet_footnote_appearance52 _Verify_balance_sheet_footnote_appearance52 = new pages.Verify_balance_sheet_footnote_appearance52(driver);
    TestModellerLogger.SetLastNodeGuid("f491fb6a-d65d-4f77-92b9-04f6b1eca342");
    _Verify_balance_sheet_footnote_appearance52.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("091d375d-74dd-477a-9879-653b6907048f");
    _Verify_balance_sheet_footnote_appearance52.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("00c8a47b-da4c-489c-b076-c0f93b0e2a4b");
    _Verify_balance_sheet_footnote_appearance52.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("58f8fe73-2907-42b2-8f35-6b8a0a465347");
    _Verify_balance_sheet_footnote_appearance52.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("357e85dc-0e78-4d31-a738-010fd72e5dc6");
    _Verify_balance_sheet_footnote_appearance52.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("5aab9608-5928-46c7-a06b-cbd4a5385b63");
    _Verify_balance_sheet_footnote_appearance52.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("9c957af3-0c46-426c-b389-51fcd0b45a03");
    _Verify_balance_sheet_footnote_appearance52.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("997731ca-dded-49fd-b43a-989bfc994326");
    _Verify_balance_sheet_footnote_appearance52.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("f851b00d-b194-4d9a-94f5-7dbc73b03cef");
    _Verify_balance_sheet_footnote_appearance52.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("42ff72ff-8b80-4150-bf7a-d1307bad88a0");
    _Verify_balance_sheet_footnote_appearance52.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("783a44ac-756a-48da-a84b-d5b3bca35335");
    _Verify_balance_sheet_footnote_appearance52.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("e6881e70-53c5-4166-b73b-7c80f274bda4");
    _Verify_balance_sheet_footnote_appearance52.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("36ab568e-31ef-417c-9a8e-5b5bcb186e9a");
    _Verify_balance_sheet_footnote_appearance52.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("3a630d4f-8848-4fd1-907f-2f4d2f29bd2e");
    _Verify_balance_sheet_footnote_appearance52.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("af4da68c-88b7-4f77-916c-3edcd65ab648");
    _Verify_balance_sheet_footnote_appearance52.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("afa9f3c5-164a-47f8-b364-e09217f0ee12");
    _Verify_balance_sheet_footnote_appearance52.Click_Full_Accounts();
    

    }

}
