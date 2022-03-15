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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/05941fd2-476f-48df-9d74-64e65221bd1e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 800, profileId = 100690)
public class Addnewagent1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Addnewagent1201","Addnewagent1201 - Default Profile"})
    @TestModellerPath(guid = "575b782c-2adb-4a6f-a7e1-94325ad5ca39")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAddAgentPositi() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Addnewagent1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Addnewagent1201 _Addnewagent1201 = new pages.Addnewagent1201(driver);
    TestModellerLogger.SetLastNodeGuid("0466c382-09ed-4950-9de2-755d392f6d0d");
    _Addnewagent1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4f57ecf0-f735-412b-ab02-5970d610c4e2");
    _Addnewagent1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f31e6f75-8764-4134-b38e-8e7b9853c6a7");
    _Addnewagent1201.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c81d7f1f-67bd-4103-8f1d-9f09b7ac8926");
    _Addnewagent1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("ee6b5f59-1237-43bb-8009-67b0ed097a0f");
    _Addnewagent1201.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("c36cdeb8-3d53-48ae-b803-ccde0d19ea36");
    _Addnewagent1201.Click__Add_Agent_();
    

    TestModellerLogger.SetLastNodeGuid("233e51b9-56a4-482b-bd80-26868df769e8");
    _Addnewagent1201.Enter_AgentName(sData[11]);
    

    TestModellerLogger.SetLastNodeGuid("fe11f968-ff4d-41ff-a12f-6e2e6486b201");
    _Addnewagent1201.Click_chkIsActive();
    

    TestModellerLogger.SetLastNodeGuid("b1015633-bb3b-4586-9465-ebf56d8b3fc5");
    _Addnewagent1201.Enter_TrialEndDate(sData[12]);
    

    TestModellerLogger.SetLastNodeGuid("d6d4ceac-9ff3-421c-bdac-f8a953949767");
    _Addnewagent1201.Click_chkIsTest();
    

    TestModellerLogger.SetLastNodeGuid("da9bd066-a056-44cf-924b-2278ded2071a");
    _Addnewagent1201.Click_Enterprise_Allinone();
    

    TestModellerLogger.SetLastNodeGuid("c787638a-32a2-407c-ace4-c80f401ec6bf");
    _Addnewagent1201.Click_Bookkeeping();
    

    TestModellerLogger.SetLastNodeGuid("2c4107b3-030b-4d63-82fd-a13b467ef297");
    _Addnewagent1201.Click_Bookkeeping_Payroll();
    

    TestModellerLogger.SetLastNodeGuid("d48cfde5-171b-4769-9210-79a4f9669896");
    _Addnewagent1201.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("151f9d31-09f6-439d-9a3c-beaca5f33c64");
    _Addnewagent1201.Click_Self_Assessment();
    

    TestModellerLogger.SetLastNodeGuid("8a10ccde-1780-4949-bba9-8857219bdf54");
    _Addnewagent1201.Click_Payroll();
    

    TestModellerLogger.SetLastNodeGuid("7624dabc-8d32-401e-b633-7d2dae27f234");
    _Addnewagent1201.Enter_MaxAccountantUser(sData[13]);
    

    TestModellerLogger.SetLastNodeGuid("9b567728-d6c3-4b88-918d-ca724e2290e3");
    _Addnewagent1201.Enter_MaxBussinessUser(sData[14]);
    

    TestModellerLogger.SetLastNodeGuid("afac342a-a4d8-4219-ac03-3e628becf59b");
    _Addnewagent1201.Enter_MaximumBusiness(sData[15]);
    

    TestModellerLogger.SetLastNodeGuid("2eaed457-aa79-43d1-98dc-e0a91f0cd9e5");
    _Addnewagent1201.Click_chkaccinfoaccess();
    

    TestModellerLogger.SetLastNodeGuid("a52204b3-83eb-4021-a5d0-a170ba174525");
    _Addnewagent1201.Click_ChkViewType();
    

    TestModellerLogger.SetLastNodeGuid("372f7a3e-9f89-4a12-82f4-d103e79bcc08");
    _Addnewagent1201.Click_ChkCreditcontrolaccess();
    

    TestModellerLogger.SetLastNodeGuid("0b08cfa0-df70-4951-8789-d88e939d8705");
    _Addnewagent1201.Click_SaveButton();
    

    }

}
