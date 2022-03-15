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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2958dd8d-6d6e-4c6d-9278-6f658aafb252
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 763, profileId = 100654)
public class Addnewclient_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Addnewclient","Addnewclient - Default Profile"})
    @TestModellerPath(guid = "99c74f17-67fc-4de8-8ae1-e79ef17a1fe2")
    public void GoToUrlAssertUrlClickClientsClickLimitedCompanyClickLimitedCompanyPositiveEnterBusinessnamePo1()
    {
        
        pages.Addnewclient _Addnewclient = new pages.Addnewclient(driver);
    TestModellerLogger.SetLastNodeGuid("4b2d74b1-6d5c-4014-b178-5241087f2715");
    _Addnewclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d124597-7734-497d-8ff0-fe09549ea633");
    _Addnewclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7743f839-280a-4b00-8d05-cde8437d84b8");
    _Addnewclient.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("32be31af-53ef-4a78-b0a9-160afb5feaf5");
    _Addnewclient.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("7811a0a4-23d8-4f63-8466-dcd5ebba94e9");
    _Addnewclient.Click_LimitedCompany();
    

    TestModellerLogger.SetLastNodeGuid("b671082c-fe38-4261-8279-e12177b1ab5d");
    _Addnewclient.Enter_Businessname("quia");
    

    TestModellerLogger.SetLastNodeGuid("42a65160-4dce-4e08-b114-a2a1553e84ab");
    _Addnewclient.Enter_RegistrationNumber("100");
    

    TestModellerLogger.SetLastNodeGuid("74c42818-e695-4ef0-bf4f-1ad4c58687ad");
    _Addnewclient.Enter_RegistrationDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("ec51793b-7b7d-4253-81c2-dc954288cd52");
    _Addnewclient.Enter_FirstName("Ramon");
    

    TestModellerLogger.SetLastNodeGuid("0ce58955-318b-496d-b280-131d9ea14108");
    _Addnewclient.Enter_LastName("Bergstrom");
    

    TestModellerLogger.SetLastNodeGuid("53519b56-931b-42d8-9279-6a3dcc918b2e");
    _Addnewclient.Click_Tick();
    

    TestModellerLogger.SetLastNodeGuid("b2df8588-b419-442f-aea8-0ba40f35d45c");
    _Addnewclient.Click_SaveButton();
    

    }

    @Test  (groups= {"Addnewclient","Addnewclient - Default Profile"})
    @TestModellerPath(guid = "2dc942c4-b977-46b5-b497-25ff2cb41aa6")
    public void GoToUrlAssertUrlClickClientsClickLimitedCompanyClickLimitedCompanyPositiveEnterBusinessnamePo2()
    {
        
        pages.Addnewclient _Addnewclient = new pages.Addnewclient(driver);
    TestModellerLogger.SetLastNodeGuid("4b2d74b1-6d5c-4014-b178-5241087f2715");
    _Addnewclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d124597-7734-497d-8ff0-fe09549ea633");
    _Addnewclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7743f839-280a-4b00-8d05-cde8437d84b8");
    _Addnewclient.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("32be31af-53ef-4a78-b0a9-160afb5feaf5");
    _Addnewclient.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("7811a0a4-23d8-4f63-8466-dcd5ebba94e9");
    _Addnewclient.Click_LimitedCompany();
    

    TestModellerLogger.SetLastNodeGuid("b671082c-fe38-4261-8279-e12177b1ab5d");
    _Addnewclient.Enter_Businessname("provident");
    

    TestModellerLogger.SetLastNodeGuid("42a65160-4dce-4e08-b114-a2a1553e84ab");
    _Addnewclient.Enter_RegistrationNumber("100");
    

    TestModellerLogger.SetLastNodeGuid("74c42818-e695-4ef0-bf4f-1ad4c58687ad");
    _Addnewclient.Enter_RegistrationDate("44204.491421562503");
    

    TestModellerLogger.SetLastNodeGuid("ec51793b-7b7d-4253-81c2-dc954288cd52");
    _Addnewclient.Enter_FirstName("Abbie");
    

    TestModellerLogger.SetLastNodeGuid("0ce58955-318b-496d-b280-131d9ea14108");
    _Addnewclient.Enter_LastName("Torp");
    

    TestModellerLogger.SetLastNodeGuid("53519b56-931b-42d8-9279-6a3dcc918b2e");
    _Addnewclient.Click_Tick();
    

    TestModellerLogger.SetLastNodeGuid("b2df8588-b419-442f-aea8-0ba40f35d45c");
    _Addnewclient.Click_SaveButton();
    

    }

    @Test  (groups= {"Addnewclient","Addnewclient - Default Profile"})
    @TestModellerPath(guid = "3e45a593-68d6-4e91-a93f-4a4a6ea1849b")
    public void GoToUrlAssertUrlClickClientsClickLimitedCompanyClickLimitedCompanyPositiveEnterBusinessnamePo3()
    {
        
        pages.Addnewclient _Addnewclient = new pages.Addnewclient(driver);
    TestModellerLogger.SetLastNodeGuid("4b2d74b1-6d5c-4014-b178-5241087f2715");
    _Addnewclient.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d124597-7734-497d-8ff0-fe09549ea633");
    _Addnewclient.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7743f839-280a-4b00-8d05-cde8437d84b8");
    _Addnewclient.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("32be31af-53ef-4a78-b0a9-160afb5feaf5");
    _Addnewclient.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("7811a0a4-23d8-4f63-8466-dcd5ebba94e9");
    _Addnewclient.Click_LimitedCompany();
    

    TestModellerLogger.SetLastNodeGuid("b671082c-fe38-4261-8279-e12177b1ab5d");
    _Addnewclient.Enter_Businessname("ratione");
    

    TestModellerLogger.SetLastNodeGuid("42a65160-4dce-4e08-b114-a2a1553e84ab");
    _Addnewclient.Enter_RegistrationNumber("100");
    

    TestModellerLogger.SetLastNodeGuid("74c42818-e695-4ef0-bf4f-1ad4c58687ad");
    _Addnewclient.Enter_RegistrationDate("44204.491421562503");
    

    TestModellerLogger.SetLastNodeGuid("ec51793b-7b7d-4253-81c2-dc954288cd52");
    _Addnewclient.Enter_FirstName("Unique");
    

    TestModellerLogger.SetLastNodeGuid("0ce58955-318b-496d-b280-131d9ea14108");
    _Addnewclient.Enter_LastName("Flatley");
    

    TestModellerLogger.SetLastNodeGuid("53519b56-931b-42d8-9279-6a3dcc918b2e");
    _Addnewclient.Click_Tick();
    

    TestModellerLogger.SetLastNodeGuid("b2df8588-b419-442f-aea8-0ba40f35d45c");
    _Addnewclient.Click_SaveButton();
    

    }

}
