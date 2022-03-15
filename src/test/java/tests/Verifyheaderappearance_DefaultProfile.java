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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d648da5a-29e7-4c6e-aae0-906f19f5d27c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 869, profileId = 100748)
public class Verifyheaderappearance_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifyheaderappearance","Verifyheaderappearance - Default Profile"})
    @TestModellerPath(guid = "9a399e70-b842-4ca7-8b4e-d9a5a254060d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyheaderappearance_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verifyheaderappearance _Verifyheaderappearance = new pages.Verifyheaderappearance(driver);
    TestModellerLogger.SetLastNodeGuid("9065094a-1c5e-49ff-8402-d3cc33af5232");
    _Verifyheaderappearance.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("bda95d00-0260-49fd-8b40-fffeae01faf8");
    _Verifyheaderappearance.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("4d81d975-9534-40f8-b915-c4b0e143f0a4");
    _Verifyheaderappearance.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ffb7529f-4fce-4ecc-bb8f-c5e75715425f");
    _Verifyheaderappearance.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("07fbbe8c-55bf-4af0-ad49-31daaf7405bb");
    _Verifyheaderappearance.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("eb6a0294-2c98-420c-a5fa-9a938cf3f9dc");
    _Verifyheaderappearance.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("03058299-8830-403c-a729-061a14f9b231");
    _Verifyheaderappearance.Click_Search_button();
    

    TestModellerLogger.SetLastNodeGuid("f128f4ae-ddd4-4bc4-a330-ef8d38791e38");
    _Verifyheaderappearance.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("090ee280-1347-488b-a989-66100fcd0ac2");
    _Verifyheaderappearance.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("3cd75335-a37b-444c-a4d2-a95edba76b93");
    _Verifyheaderappearance.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("374314f0-62af-4b2b-8b01-c3543feaa6b5");
    _Verifyheaderappearance.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("2fee998d-a93b-474b-bdd7-47bb67971b83");
    _Verifyheaderappearance.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("924cb1cf-bb2d-4cab-be21-0d64bde20323");
    _Verifyheaderappearance.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("5cd464fb-345c-45bb-9e19-a901eff6f995");
    _Verifyheaderappearance.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("fb561fa3-76be-405b-ba03-feddc6511785");
    _Verifyheaderappearance.Click_Full_Accounts();
    

    }

}
