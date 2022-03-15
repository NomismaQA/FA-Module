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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b22a6d59-357c-4bf1-a815-cb5a5c51b4e4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 921, profileId = 100814)
public class Verifydefaultstatusofaveragenumberofemployees34_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifydefaultstatusofaveragenumberofemployees34","Verifydefaultstatusofaveragenumberofemployees34 - Default Profile"})
    @TestModellerPath(guid = "0a9fe372-93a5-445d-be6c-0745f5c34298")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofaveragenumberofemployees34_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verifydefaultstatusofaveragenumberofemployees34 _Verifydefaultstatusofaveragenumberofemployees34 = new pages.Verifydefaultstatusofaveragenumberofemployees34(driver);
    TestModellerLogger.SetLastNodeGuid("e75ec420-6fc8-4868-a4ba-2b59e8df4505");
    _Verifydefaultstatusofaveragenumberofemployees34.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("df069a94-390a-45ba-8b2d-00f053234b54");
    _Verifydefaultstatusofaveragenumberofemployees34.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("30e9b894-2ee7-46c5-8d0c-427aaaceb5f2");
    _Verifydefaultstatusofaveragenumberofemployees34.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("06766e29-7317-42d0-bb58-15a16dcc91b8");
    _Verifydefaultstatusofaveragenumberofemployees34.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("aa088efe-22ea-4a08-a302-50e85b6caa61");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d2988f90-e85f-499d-97d8-92d7879744c9");
    _Verifydefaultstatusofaveragenumberofemployees34.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("a1c6aa9c-e495-439e-9048-8f4f222de63e");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("454fe162-bb1b-465a-9094-915c04ce5f89");
    _Verifydefaultstatusofaveragenumberofemployees34.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("8f3e1d57-b018-44c7-95e0-88547e6edb53");
    _Verifydefaultstatusofaveragenumberofemployees34.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c302ad3d-ff2a-4434-b2f1-0338d703e1d5");
    _Verifydefaultstatusofaveragenumberofemployees34.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("20a36e3d-b3c4-45d7-80cf-00e6061a005c");
    _Verifydefaultstatusofaveragenumberofemployees34.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("e77766a0-055a-47b5-8e30-f54133a46649");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2ce72c08-b922-4a93-b2fb-3e42a7fd9079");
    _Verifydefaultstatusofaveragenumberofemployees34.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("c813b57d-0688-4421-9b10-b6269b784d06");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("a78a5b5b-aba7-4f2b-9a06-c235f942591b");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0652edbb-9580-42b7-918f-ccc5ef2e9405");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("65b0ffa0-6166-4a8e-bb4c-214ed01333a5");
    _Verifydefaultstatusofaveragenumberofemployees34.Click_Statement_of_Financial_Position();
    

    }

}
