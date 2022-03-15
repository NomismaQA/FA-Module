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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/17992a04-f855-4a80-8aca-2851cf97e2c9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 924, profileId = 100817)
public class Verifydefaultstatusofmembersinterest37_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null; 

    
    @Test  (groups= {"Verify_default_status_of_members_interest37","Verify_default_status_of_members_interest37 - Default Profile"})
    @TestModellerPath(guid = "f987a07b-0711-41f0-8184-c65a7db2e6e0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersinterest37_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_members_interest37 _Verify_default_status_of_members_interest37 = new pages.Verify_default_status_of_members_interest37(driver);
    TestModellerLogger.SetLastNodeGuid("ecc5d5b8-4f51-4473-80e3-cf64a94f639d");
    _Verify_default_status_of_members_interest37.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a9a83d8f-31e4-4c5c-a33e-3ecf96f79dfd");
    _Verify_default_status_of_members_interest37.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("6359a361-5301-4f87-93ac-9a4fd8dec313");
    _Verify_default_status_of_members_interest37.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("f7c1afcf-524f-4487-a2ba-0f368988e2a3");
    _Verify_default_status_of_members_interest37.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("7a503f8c-929d-4fbb-ab7d-2710f1ba4142");
    _Verify_default_status_of_members_interest37.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a0241536-35a6-40a4-8bbe-0106f54a43f6");
    _Verify_default_status_of_members_interest37.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("bc973ec1-06f6-44c6-af00-9b2f0ca1a28c");
    _Verify_default_status_of_members_interest37.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a1218a62-730e-4e6c-adfc-4be5f948a0c5");
    _Verify_default_status_of_members_interest37.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("338f7ef2-53e2-46d2-8512-046e161f00e3");
    _Verify_default_status_of_members_interest37.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c45f6000-c7d7-4643-b5c7-e3129ba02d6d");
    _Verify_default_status_of_members_interest37.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("99273f9a-83b2-4b4a-8f12-03225d61b628");
    _Verify_default_status_of_members_interest37.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("ad3c2d66-2649-44bd-a51f-2f9b1ebd2db3");
    _Verify_default_status_of_members_interest37.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("66816ea9-a630-4cf7-b15b-c32948a65ed3");
    _Verify_default_status_of_members_interest37.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("072ceeca-ea82-4d49-8519-db4eb9174b41");
    _Verify_default_status_of_members_interest37.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("1cb14ccc-7dbd-469f-bca8-7fde62f3d61f");
//    _Verify_default_status_of_members_interest37.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("37b0779d-20c5-4581-a9d7-a2a087e61ba7");
    _Verify_default_status_of_members_interest37.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("efd18ba1-5614-4ba9-8028-38a59dd044e1");
    _Verify_default_status_of_members_interest37.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("cc95ef81-b881-42e5-8c05-99a1961fa6ef");
    _Verify_default_status_of_members_interest37.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("279faa5a-b358-43a0-8618-10a316ec5425");
    _Verify_default_status_of_members_interest37.Select_ctl00cPHddStatus("Active");
    
    TestModellerLogger.SetLastNodeGuid("37b0779d-20c5-4581-a9d7-a2a087e61ba7");
    _Verify_default_status_of_members_interest37.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("05da7d8f-066a-4370-996a-0a4b360b1e4b");
    _Verify_default_status_of_members_interest37.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ea01139e-b55d-404f-8962-ddb7121841ec");
    _Verify_default_status_of_members_interest37.Click_Statement_of_Financial_Position();
    

    }

}
