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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cde78156-7b4c-4065-b0c7-8de09e827008
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1518, profileId = 101493)
public class NewTestclient_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"NewTestclient","NewTestclient - Default Profile"})
    @TestModellerPath(guid = "99fe16b5-9ef3-457c-87de-458446a4630d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa()
    {
        
        pages.NewTestclient _NewTestclient = new pages.NewTestclient(driver);
    TestModellerLogger.SetLastNodeGuid("5f69c344-9022-480f-957a-83072a8546ff");
    _NewTestclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6df76fca-63e2-46d3-85c0-67ec478f84d4");
    _NewTestclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e501fad1-9ed8-4ae6-ad9f-66fa3d0934f7");
    _NewTestclient.Enter_Username("Keanu_Torp96");
    

    TestModellerLogger.SetLastNodeGuid("685a31ea-8e9a-40f7-8943-ea7d94ea70cb");
    _NewTestclient.Enter_Password("1JkXCuwrkv");
    

    TestModellerLogger.SetLastNodeGuid("3cc1819c-7543-4d1f-9436-5bfcf3c0f592");
    _NewTestclient.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2c94c22f-2c0a-4d0d-8a66-99c25a29d681");
    _NewTestclient.Enter_AgentName("dolorem");
    

    TestModellerLogger.SetLastNodeGuid("a9d95d37-5182-44f1-91c5-89748fb56048");
    _NewTestclient.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("6ef75c27-1bae-42c2-b685-b7581bf3cd9e");
    _NewTestclient.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("86aec89c-a276-4086-aeaf-e7aa520f921b");
    _NewTestclient.Click__New_Test_Ltd_();
    

    }

}
