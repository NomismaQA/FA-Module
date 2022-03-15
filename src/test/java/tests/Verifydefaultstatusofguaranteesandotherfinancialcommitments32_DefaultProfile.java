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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/97afeb49-d434-49f4-8157-364836a02206
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 919, profileId = 100812)
public class Verifydefaultstatusofguaranteesandotherfinancialcommitments32_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifydefaultstatusofguaranteesandotherfinancialcommitments32","Verifydefaultstatusofguaranteesandotherfinancialcommitments32 - Default Profile"})
    @TestModellerPath(guid = "869c980a-3e46-4f25-9e1f-1d423632f748")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofguaranteesandotherfinancialcommitments32_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifydefaultstatusofguaranteesandotherfinancialcommitments32 _Verifydefaultstatusofguaranteesandotherfinancialcommitments32 = new pages.Verifydefaultstatusofguaranteesandotherfinancialcommitments32(driver);
    TestModellerLogger.SetLastNodeGuid("2219845b-727b-49b3-8d7e-62c5e444e742");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("857c9382-005f-48db-bf69-3f7ad1b42a1d");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2dee949b-7929-4803-888d-7392706b970b");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("982f3313-7294-41a9-8684-ac3aa6fdb722");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b5c6755c-c71f-4835-aea7-b8c447bde67d");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f7c90bcf-c4b7-4b6f-9ead-f34bc2fe9164");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("e264f7c6-5220-4ca9-a75d-aa5442a3d655");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b219c0c7-c917-4c1d-834d-c42b8146baac");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("96c818d7-1b03-483c-aee0-dead531a14ec");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("996ae8e6-fa43-48c6-9286-d519bd4fbef0");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("689f1e1f-bdb0-4c90-b0b5-e908a40da6a8");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("fd90494c-7b4f-424d-b334-69b14b28ffdb");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7f54b33d-c520-4948-a095-485ff2a6b952");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("80b1de4d-eaff-4c96-acf3-1f44662049f6");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("6f9d3441-eb4f-4eb4-a2f2-ddb7375ba88d");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f934f060-3fd5-401a-a7e7-532d36cf0af9");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dc101f16-de37-4fe8-b538-9d8d87f9fa59");
    _Verifydefaultstatusofguaranteesandotherfinancialcommitments32.Click_Statement_of_Financial_Position();
    

    }

}
