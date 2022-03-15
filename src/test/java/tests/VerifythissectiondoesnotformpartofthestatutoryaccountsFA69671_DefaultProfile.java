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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8dc387db-1963-4a86-a553-b853476f053d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1329, profileId = 101197)
public class VerifythissectiondoesnotformpartofthestatutoryaccountsFA69671_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671","Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671 - Default Profile"})
    @TestModellerPath(guid = "854495d0-889f-4937-a2dc-70e094108ce3")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifythissectiondoesnotformpartofthestatutoryaccountsFA69671_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671 _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671 = new pages.Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671(driver);
    TestModellerLogger.SetLastNodeGuid("c9d1a897-d78f-4d21-8806-1b035f60585a");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("20ae67df-46d7-4c7c-b2ea-6445c4db77f1");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d5449f01-4eb8-4270-88cb-20b59235606a");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ea4aaf34-5b02-4011-b796-47f90eafa785");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b576f79d-47b9-4684-aa13-805fd086451b");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("56559c1e-f792-4c8c-94a2-c0f161defac4");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("cce09c72-d66c-400b-97aa-f5adf34ca7cd");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3001c3a7-4a29-48e1-a2d2-e4e091c7d0de");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("8c006490-5657-4dae-bc6b-338f4656c456");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("a1011c75-26c4-4ca9-b7fc-e7619790ddbb");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("fff381e8-d24a-486d-8566-0622b34181ad");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("55623d96-2140-49d3-8549-cf5c39840c60");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("6fdc7f58-c690-4474-8bf8-6e55af9b7fcb");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("3a86f318-af33-4b2e-8c56-767ceef2ac5f");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("6deb2e33-9c17-47a9-82c0-fd48977f78d3");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("f0626c6b-5f6b-48f4-8233-6370b8cc05c2");
    _Verify_this_section_does_not_form_part_of_the_statutory_accountsFA69671.Click_Full_Accounts();
    

    }

}
