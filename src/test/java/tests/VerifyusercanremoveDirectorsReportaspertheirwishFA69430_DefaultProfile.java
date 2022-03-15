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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a915798c-7a28-4a93-8182-9fdedbceaf33
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1425, profileId = 101295)
public class VerifyusercanremoveDirectorsReportaspertheirwishFA69430_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430","Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430 - Default Profile"})
    @TestModellerPath(guid = "0d4ae924-c122-4ef8-ad6e-6ed4f08f7adf")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanremoveDirectorsReportaspertheirwishFA69430_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430 _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430 = new pages.Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430(driver);
    TestModellerLogger.SetLastNodeGuid("62b11d0e-1a25-42cc-9c83-d7e00e21c6eb");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("54dc86bd-9fb4-42de-8f33-6b3d3cf9d044");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("7c2fb253-3bd2-490b-8a06-2e58d38ccbda");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b962f6f0-8ade-4ff1-809f-2f8f6fea9772");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("510342dd-d777-4d2f-b993-a38f50ddfb32");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("efacfd2c-072a-412b-a7be-7acf97b6dffb");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("05e14db5-a879-4927-b47f-b1b1245b26f0");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8bc87b76-1fb6-437d-8ee7-8cd7a53ae199");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("2ee600ff-bdb9-41d4-b1f3-3404064fe548");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("35e9be0a-55c9-4465-bd07-6cec8581f5b6");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a8a6ebcd-14a9-4203-8f05-6d1a9639a057");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("fb2c0d77-b8f5-4ffa-a23d-c4fa4d2e0af0");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("93780447-0725-4e22-91e6-7eca4e6f7e44");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("acd50dd7-5c1b-43be-87d6-d0a37eac4a7b");
    _Verify_user_can_remove_Directors_Report_as_per_their_wishFA69430.Click_Final_Accounts2();
    

    }

}
