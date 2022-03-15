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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/675ed965-97c8-4ec6-873c-d555f3a1694a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 791, profileId = 100681)
public class Login1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Login1201","Login1201 - Default Profile"})
    @TestModellerPath(guid = "44ffc343-4e2c-46ea-9208-b1f3ca1c8d8a")
    public void GoToUrlAssertUrlPositiveEnterLoginPositiveEnterPasswordClickLoginButton() throws InvalidFormatException
    {
		
    	ExUtils = new ExcelUtils();
		sTestCaseID="Login1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
	   
		         
        pages.Login1201 _Login1201 = new pages.Login1201(driver);
    TestModellerLogger.SetLastNodeGuid("c7714f91-ce93-4494-ac69-0e5345199488");
    _Login1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c2e401c7-9761-437a-b643-f8177e8002c5");
    _Login1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("0fd84278-d025-4f9e-8daa-9272260719e2");
    _Login1201.Enter_Login(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e776881b-5ebf-4c68-a881-d8f7419439ee");
    _Login1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("289ff5d4-dc31-44da-bffe-5720b889e215");
    _Login1201.Click_LoginButton();
    

    }

}
