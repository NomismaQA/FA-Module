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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/81734483-8efa-4f65-8e9d-60ef2c05fbec
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 808, profileId = 100697)
public class Searchclient1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Searchclient1201","Searchclient1201 - Default Profile"})
    @TestModellerPath(guid = "d2206a03-fd9b-44f4-aa7d-110cda3d9e17")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Searchclient1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
	   
    	
    	
    	
        pages.Searchclient1201 _Searchclient1201 = new pages.Searchclient1201(driver);
    TestModellerLogger.SetLastNodeGuid("f83b8ac7-1b18-49be-bc4f-761cd1ee3cda");
    _Searchclient1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ded7f286-0ea9-4b5b-9a06-c3adfc02c1d8");
    _Searchclient1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("613d36b7-8bfe-43e7-b9e2-5e9dd947b5b4");
    _Searchclient1201.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c2be19eb-bfbf-44a1-a85a-819f396902f0");
    _Searchclient1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("82b2f28b-3b45-4680-ad75-9ba8e20e508c");
    _Searchclient1201.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("cdf59676-772a-43d3-b574-8259cc3e7be6");
    _Searchclient1201.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("4e5dc901-2106-4d04-bd75-679c398a395c");
    _Searchclient1201.Enter_SearchAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1dcf659b-c999-4d8d-8969-8f61d7261fe0");
    _Searchclient1201.Click_Searchbutton_1();
    

    TestModellerLogger.SetLastNodeGuid("31e43762-a667-48e9-a9a4-898235562137");
    _Searchclient1201.Click_AgentName();
    

    TestModellerLogger.SetLastNodeGuid("15b1b4db-34cb-422e-9378-910e5507515d");
    _Searchclient1201.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("d4db739a-5642-44bc-8655-84ff6fe8b8f6");
    _Searchclient1201.Enter_Searchclientname(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("83a7500d-cb41-414f-b257-31cb2aa8faa0");
    _Searchclient1201.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("b99ad7c9-e962-431d-821f-d5b173b8187b");
    _Searchclient1201.Click__Test_Systems_Ltd();
    

    }

}
