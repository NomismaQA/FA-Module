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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f3b6730a-0dea-4a03-92aa-f756db199662
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 868, profileId = 100747)
public class Verifydynamicfooter_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifydynamicfooter","Verifydynamicfooter - Default Profile"})
    @TestModellerPath(guid = "c748013b-a2df-4d9b-9498-766b65987817")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydynamicfooter_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verifydynamicfooter _Verifydynamicfooter = new pages.Verifydynamicfooter(driver);
    TestModellerLogger.SetLastNodeGuid("a91f8ba5-635e-42f4-9ce4-80cb926d4dc7");
    _Verifydynamicfooter.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("278920f0-b4e2-4058-959a-c0db9d127610");
    _Verifydynamicfooter.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("24bae913-396c-43ce-9cde-40056f45ba87");
    _Verifydynamicfooter.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ac48a25f-a7e6-4549-852e-7cefbd0a0c4a");
    _Verifydynamicfooter.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("de4e0df4-d02b-4619-a0d0-d8fbe16a442f");
    _Verifydynamicfooter.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f0e246f0-7283-4623-be2f-f50fe9fecddd");
    _Verifydynamicfooter.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5f2b52f1-53d9-40fb-a9cd-c1f1cea67b30");
    _Verifydynamicfooter.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("eed2834a-fc1f-4291-87a0-1890c047a9e7");
    _Verifydynamicfooter.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("01ecffa7-18ac-4128-86fb-b3409b0d60ec");
    _Verifydynamicfooter.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("33589913-235e-46b1-92bc-1b93b1cf57dc");
    _Verifydynamicfooter.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("8a0b6016-82a7-425a-9cd8-82aedbfd9f09");
    _Verifydynamicfooter.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("ecff38a1-41bd-4ff1-90b1-3132da7134b4");
    _Verifydynamicfooter.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("514158fe-2533-437c-ab69-40d893bb086b");
    _Verifydynamicfooter.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("8ef1cbc4-c606-463d-93e9-8501c5378b89");
    _Verifydynamicfooter.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("3272f76a-48cc-48ac-882d-bd497b4bff5b");
    _Verifydynamicfooter.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("cf2d9710-9980-422f-8d17-339d5694ed72");
    _Verifydynamicfooter.Click_Full_Accounts();
    

    }

}
