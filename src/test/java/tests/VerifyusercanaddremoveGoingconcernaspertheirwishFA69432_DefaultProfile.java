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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/b815debf-f55c-447c-ac93-f1064e5b06d6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1432, profileId = 101306)
public class VerifyusercanaddremoveGoingconcernaspertheirwishFA69432_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432","Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432 - Default Profile"})
    @TestModellerPath(guid = "937af9ba-5b7e-4730-b4ff-0270470f30df")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanaddremoveGoingconcernaspertheirwishFA69432_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432 _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432 = new pages.Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432(driver);
    TestModellerLogger.SetLastNodeGuid("0adae32e-25a5-48bf-943b-27d51d0e1a96");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f3db133a-a956-4021-bf17-6044185d00d3");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5b24d65e-383c-46cd-be7d-cbf5cadf029d");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4450538f-c427-4fb2-9bb6-04416fd2fe76");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("82fd216c-b6f9-4940-b7fb-44f6718b24b4");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c8974770-81a9-4ed7-8086-aa87ccdc7dd8");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("31d963b3-553a-4da2-ba07-b2f2e919017f");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("489adc88-3aea-442b-9b37-9c7439a7dad4");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c60a3bcf-29fb-4965-90b5-c2f8d56d4f48");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("6886ed7d-88d0-426a-b0f2-9fcd9bb623d6");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("436fda06-d64f-4eb9-94e7-38a1190b3244");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("9028d8fd-8305-40cd-81bb-89c4d932e46f");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("1b71f1fd-f110-47d2-8109-c71f7f7c9810");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("615f60bf-cea1-452b-9e5f-231be8a70e47");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("1889427b-c1b4-400d-94fd-a1f5b162fb38");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("9fc8d888-846e-43ff-8840-195c22e5da43");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("e39776f2-d004-40cf-b2be-533e666d6fdb");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("a3230a5d-5318-4b67-adab-6ea7aec9257a");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("ebefdd1f-fbf1-4ea6-8ddd-da9f9f3c61bb");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("6a56c76d-46d1-4350-8d41-402f7f2c1e03");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("b7211839-2a44-49bc-8c7c-22d46dfe6251");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_CharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("5252523c-4ab7-4164-bf4a-b719ffdf72cc");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("9ee04cc9-37a0-4dd4-8292-a176ee890f11");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("73877b29-185f-4192-a6b6-3e6d386421f8");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3b82418b-9a47-4018-95b8-0268358d9c09");
    _Verify_user_can_add_remove_Going_concern_as_per_their_wishFA69432.Click_Full_Accounts();
    

    }

}
