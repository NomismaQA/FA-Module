package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f656b53a-a51e-4738-a206-93e3df8d3e4b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 762, profileId = 100653)
public class Searchagentnew_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Searchagentnew","Searchagentnew - Default Profile"})
    @TestModellerPath(guid = "1dce048b-4244-473c-a754-6cdaf0488be8")
    public void GoToUrlAssertUrlClickAgentsPositiveEnterSearchagentClickSearchbuttonClickAgentname()
    {
        
        pages.Searchagentnew _Searchagentnew = new pages.Searchagentnew(driver);
    TestModellerLogger.SetLastNodeGuid("c71ee614-9756-45ba-adc8-cadc456c3f93");
    _Searchagentnew.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d290968c-33ea-48c3-86c7-d0de03682ef2");
    _Searchagentnew.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ceabd8ee-fa03-4f1d-978c-aca85474e9e4");
    _Searchagentnew.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("9126537b-aa99-401d-a0a2-056f37e59d80");
    _Searchagentnew.Enter_Searchagent("");
    

    TestModellerLogger.SetLastNodeGuid("bdb998e4-62d7-4d95-b121-46aa754df651");
    _Searchagentnew.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("3a60dece-2c39-4afc-8fa5-cf5e58d21bec");
    _Searchagentnew.Click_Agentname();
    

    }

}
