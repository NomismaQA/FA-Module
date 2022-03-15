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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/95b8f5ad-06e3-4a84-b3ca-f615be76ffc7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 873, profileId = 100752)
public class Verifymember2_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifymember2","Verifymember2 - Default Profile"})
    @TestModellerPath(guid = "ee0ef273-d407-4fa9-83ba-1694a31f31e2")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifymember2_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifymember2 _Verifymember2 = new pages.Verifymember2(driver);
    TestModellerLogger.SetLastNodeGuid("1c5bc809-d1fe-4c49-87c4-1dd8a805ce94");
    _Verifymember2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1dd21fda-b1e9-4b44-b957-895c9a34fc6f");
    _Verifymember2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("c4465d21-d309-4214-95b2-fb2be34a4a56");
    _Verifymember2.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d285a494-77d5-4699-aee6-5cdb66635546");
    _Verifymember2.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("6f90e9ea-64a0-4c8a-82ef-413577d3308a");
    _Verifymember2.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("76deb5b5-f18c-4dec-9bec-9cb20705d191");
    _Verifymember2.Enter_ctl00cPHFiltertxtAgentName(sData[3].trim());
    
    TestModellerLogger.SetLastNodeGuid("b8c0fde8-a7fd-4ea0-a01c-2af48d8aeae2");
    _Verifymember2.Click_Search_button1();

    TestModellerLogger.SetLastNodeGuid("9f00a322-e302-4b83-adf1-3c8693efc061");
    _Verifymember2.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0523b881-fce4-410e-a05a-09539862c894");
    _Verifymember2.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("104fe04d-1907-48da-8bb7-68a6558ae2f5");
    _Verifymember2.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("720b47d1-160b-444f-86b6-bfb9d1ccae90");
    _Verifymember2.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("986f1bf1-dfd2-4027-9f08-17fb6d486da7");
    _Verifymember2.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("346ea658-cffa-4cd1-a2b6-70af87bb548b");
    _Verifymember2.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("176a73d3-d8c9-4491-99bf-dd0d13d50c09");
    _Verifymember2.Click_Settings1();
    
    TestModellerLogger.SetLastNodeGuid("d655dc28-c72a-4b0f-8c10-b185cc307227");
   _Verifymember2.Click_Edit1();
    
   TestModellerLogger.SetLastNodeGuid("fa214547-9001-43a2-a253-682afee88163");
  _Verifymember2.Click_Members();

  TestModellerLogger.SetLastNodeGuid("b58f823f-2319-417d-8e43-3f0f4e5a0530");
  _Verifymember2.Click_Add_Members();    

  TestModellerLogger.SetLastNodeGuid("42823fcf-09d2-4208-bd5a-e8d68740fd7a");
 _Verifymember2.Enter_ctl00cPHtxtFirstName(sData[29]);
    
 TestModellerLogger.SetLastNodeGuid("23340b9f-55d1-4575-811a-2ce57c87f665");
 _Verifymember2.Enter_ctl00cPHtxtLastName(sData[30]);

    TestModellerLogger.SetLastNodeGuid("64bc423b-9ad0-4caf-b532-52f9b243d91c");
    _Verifymember2.Enter_ctl00cPHtxtAddress1(sData[31]);

    TestModellerLogger.SetLastNodeGuid("a496f861-f442-4e7e-8aad-e5c2eeb90454");
    _Verifymember2.Enter_ctl00cPHtxtAddress2(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("feff5112-8ca4-4e57-9033-722f42946bbb");
    _Verifymember2.Enter_ctl00cPHtxtAddress3(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("886224ff-df28-4755-b340-6e8474ec4541");
    _Verifymember2.Enter_ctl00cPHtxtAddress4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("3570fac0-8e6c-4583-a3bf-8d7dc029680d");
    _Verifymember2.Enter_ctl00cPHtxtPersonJoiningDate(sData[35]);
    

    TestModellerLogger.SetLastNodeGuid("761fc2da-3b89-4471-85d6-04fb6ac182a0");
    _Verifymember2.Enter_ctl00cPHtxtPersonLeavingDate(sData[36]);
    

    TestModellerLogger.SetLastNodeGuid("108e94bb-8fba-4fa8-b83d-b4914dc224dd");
    _Verifymember2.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("eb1bee00-b622-400f-bc88-5d95577581ec");
    _Verifymember2.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("10e945b1-96fd-4338-9c47-73e7711e0e66");
    _Verifymember2.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("376bc77f-c4db-455a-bcab-bffd448320a3");
    _Verifymember2.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("41bf988a-28bf-42d9-8db8-094cc4cdb7d9");
    _Verifymember2.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("5f40ea99-f59d-4b02-8eed-7045fd7255fa");
    _Verifymember2.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("b8f63293-5b85-4782-9ddb-7aed61512c19");
    _Verifymember2.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("ef7e4ead-ab85-47bc-87ad-11d054237b02");
    _Verifymember2.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("604281eb-17c2-4393-9fba-c36a70c41dbf");
    _Verifymember2.Click_Full_Accounts();
    

    }

}
