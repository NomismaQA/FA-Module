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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/cf2abf50-7497-47cd-9dba-02664ea05202
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 758, profileId = 100649)
public class Loginnew_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Loginnew","Loginnew - Default Profile"})
    @TestModellerPath(guid = "ebe62f1e-0c91-4560-8964-52798dbe2143")
    public void GoToUrlAssertUrlPositiveEnterctl00cPHloginPositiveEnterctl00cPHpassClickLogin()
    {
        
        pages.Loginnew _Loginnew = new pages.Loginnew(driver);
    TestModellerLogger.SetLastNodeGuid("0d1154d0-db8b-4ecb-8d89-bc5e6fd3a844");
    _Loginnew.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("13befec4-1f78-4462-9d42-d22d8a90c29e");
    _Loginnew.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("30ede2dc-cf8f-4ab8-9d32-aa85d879df53");
    _Loginnew.Enter_ctl00cPHlogin("admin");
    

    TestModellerLogger.SetLastNodeGuid("4e2a4e57-4d9f-4c65-a872-0cad63e70151");
    _Loginnew.Enter_ctl00cPHpass("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("a2a6bf94-7aae-4db7-9bad-ffe231970d1e");
    _Loginnew.Click_Login();
    

    }

}
