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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/840f4e41-d1b4-43d4-9651-9b109120f396
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1516, profileId = 101487)
public class Addnewclientlink_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Addnewclientlink","Addnewclientlink - Default Profile"})
    @TestModellerPath(guid = "c034e13c-ac5e-4c02-9d92-b36d837c3492")
    public void GoToUrlAssertUrlClickAddnewclientlinkClickNewClient()
    {
        
        pages.Addnewclientlink _Addnewclientlink = new pages.Addnewclientlink(driver);
    TestModellerLogger.SetLastNodeGuid("f1ab5059-1954-4544-868a-fc5a8e5e99c3");
    _Addnewclientlink.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("88540420-8ea9-4f22-b5ed-8e9550270770");
    _Addnewclientlink.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f320602a-22cc-4323-be1d-cfd1078d2429");
    _Addnewclientlink.Click_Add_new_client_link();
    

    TestModellerLogger.SetLastNodeGuid("6dde6a70-b015-4674-b740-699d051a7f37");
    _Addnewclientlink.Click__New_Client_();
    

    }

}
