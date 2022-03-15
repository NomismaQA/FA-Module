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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/31791308-6514-4875-9252-171431bdac28
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1023, profileId = 100925)
public class Verifyrenamingoflastlineitemasperrequirment49_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_renaming_of_last_line_item_as_per_requirment49","Verify_renaming_of_last_line_item_as_per_requirment49 - Default Profile"})
    @TestModellerPath(guid = "321455c8-bf95-4320-9b81-6ba57a59786b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyrenamingoflastlineitemasperrequirment49_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_renaming_of_last_line_item_as_per_requirment49 _Verify_renaming_of_last_line_item_as_per_requirment49 = new pages.Verify_renaming_of_last_line_item_as_per_requirment49(driver);
    TestModellerLogger.SetLastNodeGuid("5ff1b785-af9b-4d73-8312-717128439768");
    _Verify_renaming_of_last_line_item_as_per_requirment49.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5fd764d1-4e26-439f-bcc5-f67786034f94");
    _Verify_renaming_of_last_line_item_as_per_requirment49.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e0b5a668-9acd-499c-a9d8-4cebb9aabf08");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("89737c14-6bed-4b55-bda5-9d36423d236c");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("dfb358c3-fefe-48a0-b382-69077d648250");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("37c0ac6f-7ed8-4afd-8249-95e99ccaf75e");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1323ce09-644e-4d32-a675-c4f39091efb2");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("507658f3-c6c9-4053-9f7d-f6b91d0afc12");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ab0569e2-8c43-4d6f-896e-bea46f26258d");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("4e97306a-9d2f-49c4-b693-f1280585973f");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6a91ad2f-5ce0-4728-ab66-2acd4ff5e74c");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("69fd3286-b3be-492d-a0a8-406ef7b2f65f");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("097133f8-50c6-4025-a5ba-38a27a6e7025");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("39b7850b-0720-48f8-82fe-964a3da15833");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("28222117-a8b1-4d5d-aee2-ace4bb4d8984");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("e23c954d-ecd3-48bb-84a6-4b155fd8ac1b");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("8a6530e4-306d-4f2d-bf07-bec209905aeb");
    _Verify_renaming_of_last_line_item_as_per_requirment49.Click_Income_Statement();
    

    }

}
