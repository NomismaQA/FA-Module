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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ced181c6-855f-497f-9dae-d35732a24c7d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 764, profileId = 100655)
public class Selectclient_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Selectclient","Selectclient - Default Profile"})
    @TestModellerPath(guid = "c0529eb2-e398-4fc5-9de6-1b497a4f4eb0")
    public void GoToUrlAssertUrlPositiveEnterusernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive()
    {
        
        pages.Selectclient _Selectclient = new pages.Selectclient(driver);
    TestModellerLogger.SetLastNodeGuid("78639e7c-41b5-4601-9a59-ee3bbe5745b2");
    _Selectclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c416b983-7555-4f71-8183-8bb8d9009031");
    _Selectclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("131680b8-8bb5-4a26-b0d8-518e61d902bb");
    _Selectclient.Enter_username("admin");
    

    TestModellerLogger.SetLastNodeGuid("699cd2c3-029a-466d-9567-d0c8d5992bae");
    _Selectclient.Enter_Password("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("2833e1d1-5f1f-49b8-b70f-bbc60f40eff6");
    _Selectclient.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("443cdc5d-baf9-4bb1-9a71-68e8c90a35b2");
    _Selectclient.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("2b7e53d4-3015-486e-b395-fc4471c4ad23");
    _Selectclient.Enter_Searchagent("Nakul@@");
    

    TestModellerLogger.SetLastNodeGuid("64b20a6c-f850-41f8-8a30-693272103685");
    _Selectclient.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("eedc80c1-3176-414a-bf32-9182425e89d2");
    _Selectclient.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("50615be6-30a4-488d-a151-af50d6079190");
    _Selectclient.Click_Final_Accounts();
    

    }

}
