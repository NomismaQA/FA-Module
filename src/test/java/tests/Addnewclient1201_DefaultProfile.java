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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/46c0d187-1fc1-4b09-b2fe-6ddd2fc3ebb3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 809, profileId = 100698)
public class Addnewclient1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Addnewclient1201","Addnewclient1201 - Default Profile"})
    @TestModellerPath(guid = "123597f2-1b40-4437-8d51-2eeb03522446")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Addnewclient1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
    	
    	
    	
        pages.Addnewclient1201 _Addnewclient1201 = new pages.Addnewclient1201(driver);
    TestModellerLogger.SetLastNodeGuid("8cf870b4-ca2f-4b02-aded-f9457fe7143f");
    _Addnewclient1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("de87bcdb-df2e-4492-b34e-4ca64ae7a75f");
    _Addnewclient1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("bc9f042d-02bb-4481-be45-79694d0b54d5");
    _Addnewclient1201.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("1f24fc29-54f7-4df4-bd88-ae6f79571cdf");
    _Addnewclient1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("154437d0-8bb6-4d89-b149-85c23177fd2a");
    _Addnewclient1201.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("7d1584ae-6937-433f-b1e4-61237d98cf1b");
    _Addnewclient1201.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("a922768b-0f84-4190-a252-119c08e530ed");
    _Addnewclient1201.Enter_SearchAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("248013ed-bc9d-49a5-8a23-a91f47e33efb");
    _Addnewclient1201.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("1efc4a44-cb37-4589-b457-d7aa2b5f2a52");
    _Addnewclient1201.Click_AgentName();
    
    

    TestModellerLogger.SetLastNodeGuid("ce0aa78d-152a-4471-86d3-634907d58296");
    _Addnewclient1201.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("d6d8f9a7-ef61-4dbb-a68e-6f16da1eb780");
    _Addnewclient1201.Click__New_Client();
    

    TestModellerLogger.SetLastNodeGuid("a68e27a1-ffc7-4c13-93dc-2d3af42031e8");
    _Addnewclient1201.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("9e2c39b8-e308-4d24-af56-db9fd1dd4260");
    _Addnewclient1201.Click_ManuallyLimitedCompany();
    

    TestModellerLogger.SetLastNodeGuid("b71f0434-042f-4a26-868b-bfc6380e2831");
    _Addnewclient1201.Enter_Businessname(sData[6]);
    

    TestModellerLogger.SetLastNodeGuid("c8e5c350-916a-421e-a065-ea372e0de821");
    _Addnewclient1201.Enter_RegistrationNumber(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("0a54b90b-0c75-4d02-a782-6c3db0a1cc0b");
    _Addnewclient1201.Enter_RegistrationDate(sData[8]);
    

    TestModellerLogger.SetLastNodeGuid("87e9f75f-b3bc-4035-830e-0961dd17d2c4");
    _Addnewclient1201.Enter_FirstName(sData[9]);
    

    TestModellerLogger.SetLastNodeGuid("6285529a-b43f-457a-8b2a-3d2a69e4f248");
    _Addnewclient1201.Enter_LastName(sData[10]);
    

    TestModellerLogger.SetLastNodeGuid("7583002c-bc98-4797-9b94-935599cdc98e");
    _Addnewclient1201.Click_Please_tick_if_director_is_also_an_employee_in_the_company();
    

    TestModellerLogger.SetLastNodeGuid("e3da77e1-2e67-4705-954a-d7410d7c8d46");
    _Addnewclient1201.Click_SaveButton();
    

    }

}
