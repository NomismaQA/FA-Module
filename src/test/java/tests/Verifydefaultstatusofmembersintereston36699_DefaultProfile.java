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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/62964dd4-198c-4f91-9fc5-07ae7f35d575
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1150, profileId = 101040)
public class Verifydefaultstatusofmembersintereston36699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_default_status_of_members_interest_on36699","Verify_default_status_of_members_interest_on36699 - Default Profile"})
    @TestModellerPath(guid = "29d2aa4d-5be1-4857-aba1-73dce5203024")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersintereston36699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_default_status_of_members_interest_on36699 _Verify_default_status_of_members_interest_on36699 = new pages.Verify_default_status_of_members_interest_on36699(driver);
    TestModellerLogger.SetLastNodeGuid("f4cadb32-15d7-4612-a4c9-da1bc153416a");
    _Verify_default_status_of_members_interest_on36699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc42340a-a93b-4ff1-b42a-8f20bffebb8e");
    _Verify_default_status_of_members_interest_on36699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8bab1a40-65d1-451c-9033-373153128eea");
    _Verify_default_status_of_members_interest_on36699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("7837cad5-a72b-4ea6-b8fb-da342fc7596b");
    _Verify_default_status_of_members_interest_on36699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9e50f6e5-1a71-4ee2-81b8-fb0175c86bae");
    _Verify_default_status_of_members_interest_on36699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c07d825a-b85e-4627-bc09-b2fc185b87dd");
    _Verify_default_status_of_members_interest_on36699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("2cc04fb6-d623-4c14-92b8-8747dc654bf7");
    _Verify_default_status_of_members_interest_on36699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("06ef0b8f-e8e1-48e9-be89-87f7e999e028");
    _Verify_default_status_of_members_interest_on36699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ff8397a8-7721-44c7-8a62-923a5cd4df6e");
    _Verify_default_status_of_members_interest_on36699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a11d808a-662f-40a4-a557-b15ddb23c72c");
    _Verify_default_status_of_members_interest_on36699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c192147f-910c-4c97-8ebc-e5d4ae566354");
    _Verify_default_status_of_members_interest_on36699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("2a64aaa2-242f-4ee6-91ce-f2ac8fc9aef6");
    _Verify_default_status_of_members_interest_on36699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("95e7c804-4093-47d2-883c-f7234e6c0cd7");
    _Verify_default_status_of_members_interest_on36699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("f0103ee4-e83d-4ffd-83ef-0ab1364be622");
    _Verify_default_status_of_members_interest_on36699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("4accbdb3-a7c6-4306-a7ce-b15d7394235c");
    _Verify_default_status_of_members_interest_on36699.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("b2e9ddda-280c-45e3-a704-999c69b46cdb");
    _Verify_default_status_of_members_interest_on36699.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("4177b74f-3dbc-4379-94d9-24fa3ad44258");
    _Verify_default_status_of_members_interest_on36699.Click_Statement_of_Financial_Position();
    

    }

}
