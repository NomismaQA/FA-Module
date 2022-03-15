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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/30512e0f-b322-44e7-bf16-e51a74d8936d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 814, profileId = 100703)
public class Fullaccountreport1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Fullaccountreport1201","Fullaccountreport1201 - Default Profile"})
    @TestModellerPath(guid = "989e6cb1-4519-45a8-9aeb-5f75263bd023")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Fullaccountreport1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
    
    	
        pages.Fullaccountreport1201 _Fullaccountreport1201 = new pages.Fullaccountreport1201(driver);
    TestModellerLogger.SetLastNodeGuid("55d9258d-0895-4062-a41a-9b47c6ee40e8");
    _Fullaccountreport1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c0d5e40c-cba4-4b79-a4a2-fa8ed38c59d4");
    _Fullaccountreport1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fe81cb20-cf9b-4d97-b003-84601726d304");
    _Fullaccountreport1201.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("595b8964-ea2a-4d67-bb4b-d58e989d6ddd");
    _Fullaccountreport1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a1ce7d1d-5913-40f7-87aa-6d8f7dd1b6d5");
    _Fullaccountreport1201.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("58909e54-dfe4-435e-8da3-49b95dc8c46f");
    _Fullaccountreport1201.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("017cbe31-3a0e-4108-94c3-15e401098cce");
    _Fullaccountreport1201.Enter_SearchAgentName("Nakul@@");
    

    TestModellerLogger.SetLastNodeGuid("4458ee19-c2cb-4f1d-8aa8-7c55d0763ffb");
    _Fullaccountreport1201.Click_Searchbutton_1();
    

    TestModellerLogger.SetLastNodeGuid("e1d733c7-2c87-4313-9c7f-d9297e73e188");
    _Fullaccountreport1201.Click_AgentName();
    

    TestModellerLogger.SetLastNodeGuid("14d3cdbb-02c8-492c-99c0-3f0c37a5724d");
    _Fullaccountreport1201.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("3979500f-f39a-469c-9f50-3ce746b479c0");
    _Fullaccountreport1201.Enter_Searchclientname("Test");
    

    TestModellerLogger.SetLastNodeGuid("b76eac9e-8c34-45da-a6ce-8b9c45a87f92");
    _Fullaccountreport1201.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("c14a1681-f640-4795-b1d0-09c345b5844f");
    _Fullaccountreport1201.Click_clientname();
    

    TestModellerLogger.SetLastNodeGuid("ac4077f1-6ae5-4a32-97f2-71e462a435b8");
    _Fullaccountreport1201.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("526848e8-6ac9-4104-9e3c-25dd1d5aad6e");
    _Fullaccountreport1201.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("7b410799-9189-4147-b1cb-3a109d43f531");
    _Fullaccountreport1201.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("c4097a30-5634-4436-b387-0ee0c2249f86");
    _Fullaccountreport1201.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("11029c3b-40c6-4d27-917f-24d734ee4f08");
    _Fullaccountreport1201.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("7b5e2571-db4b-4a29-b7c6-a6c5577b1e48");
    _Fullaccountreport1201.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("f4072275-d234-4e24-966e-af8ca8443abe");
    _Fullaccountreport1201.Click_Detailed_Income_Statement();
    

    }

}
