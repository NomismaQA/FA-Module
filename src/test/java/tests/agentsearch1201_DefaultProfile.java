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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f7f4af83-341f-4380-a85a-89b2fb6a815d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 799, profileId = 100689)
public class agentsearch1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"agentsearch1201","agentsearch1201 - Default Profile"})
    @TestModellerPath(guid = "e4d9732e-4ef8-4d5b-9fe8-ddcc1086f189")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="agentsearch1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
    	
    	
        pages.agentseach1201 _agentseach1201 = new pages.agentseach1201(driver);
    TestModellerLogger.SetLastNodeGuid("bcc183c3-57d4-4f30-8582-af44565b0fcb");
    _agentseach1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("60bf0134-070c-44a0-8d70-a8fcebaaece0");
    _agentseach1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("34a8b8f7-42ec-4307-80f0-a7a4b0007a82");
    _agentseach1201.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a8707e42-9332-448a-9bf3-6a0fe776f1f6");
    _agentseach1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("afb5bb47-a387-4c8c-bd7e-d6136f25f9ab");
    _agentseach1201.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("5ac47fd9-17a9-4dec-96e3-833ac1403d35");
    _agentseach1201.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("22b5a79a-e05e-4996-a3e1-0ae876788236");
    _agentseach1201.Enter_SearchAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("076bb68d-41ca-47ad-9f5d-a58415aae58c");
    _agentseach1201.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("0b1076ed-21c8-444e-9e8f-639f1f8dd9cc");
    _agentseach1201.Click_AgentName();
    

    }

}
