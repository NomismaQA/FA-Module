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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/9a2f908e-338e-473d-afef-dd03bafedfd9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1141, profileId = 101031)
public class Verifydefaultstatusofmembersbenefitsadvancescreditandguarantees30_699_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699","Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699 - Default Profile"})
    @TestModellerPath(guid = "6a6dcb35-3d23-4a03-83ab-24f698f7a005")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersbenefitsadvancescreditandguarantees30_699_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699 _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699 = new pages.Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699(driver);
    TestModellerLogger.SetLastNodeGuid("27242e25-cc5f-48fd-b033-d005aa90e7c7");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("aad8bff4-1770-425e-be50-8fa5a32fdc41");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("71357124-4318-4067-93a7-16ecd0c6ba40");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0336f64b-b9f0-4ca2-9198-bbfb0c562965");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a1d983aa-dbfa-4b29-9488-dbf0c5c2a71b");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2609dde2-4f7e-457d-8c3f-7e94a83d31fd");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ff2988b2-a4c8-4180-8274-542b15651bfa");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("bc974920-bc26-40db-83c6-769df1f3c437");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d1ca87bc-e26f-443c-9845-60d4e448b18b");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("055fbe5d-43ec-45dc-b1e2-6e1bdf6390c0");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("9e6b6535-451a-4717-ac39-ae1a8c779d9d");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("df5d4fac-f783-4641-96b7-4dc30fce35cf");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("2f94979f-c8c4-4948-808d-fd5d1cb17c7c");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("fc965f78-5adf-436d-a837-aaf6ae412d3f");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d5ff98b4-975d-4b9e-bcb3-0efb7796c257");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("342c741d-4778-4490-b93c-34d46b06b49f");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("fc3415f4-be54-4a0e-a92d-a4a003863af1");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("11d05c5e-3227-4571-8089-3b6e3091abb0");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Select_ctl00cPHddStatus("Active");
    

    TestModellerLogger.SetLastNodeGuid("bbe2563a-8588-4ebd-89e8-d6255acd04df");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("896bf242-edf3-48c4-8777-8f6e8b33470d");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("25bfc33a-b05c-4941-886c-97721db810f4");
    _Verify_default_status_of_members_benefits_advances_credit_and_guarantees30_699.Click_Filleted_Accounts();
    

    }

}
