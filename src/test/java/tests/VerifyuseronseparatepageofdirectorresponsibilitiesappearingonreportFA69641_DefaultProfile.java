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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a43f0df0-b2b5-4ebc-9508-75592b4c6b76
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1282, profileId = 101158)
public class VerifyuseronseparatepageofdirectorresponsibilitiesappearingonreportFA69641_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641","Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641 - Default Profile"})
    @TestModellerPath(guid = "4f5e6514-f3a3-4519-897b-fb1e48c31e2c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyuseronseparatepageofdirectorresponsibilitiesappearingonreportFA69641_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641 _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641 = new pages.Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641(driver);
    TestModellerLogger.SetLastNodeGuid("234928d5-bb10-4dab-afdf-043c696b8fd2");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("15f7f377-0b88-4ce4-9ecb-5b7da7c1e2fb");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3ebeaf44-6376-4c74-a3ea-2dbcf88f3fe9");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("d5eb2c76-2047-44cd-acfa-28c6c7c6bf65");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("53c2e857-7066-4d0f-9215-9bf9dc04b0b8");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("56c558fe-68f6-4854-abf9-e6506734eb18");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("f3354dfc-a220-4c4e-aed2-ff7159fb86fc");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2bc70a99-fbed-4ba5-8183-d179c7a0a2a2");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("17b61d54-9d0f-4eb6-8075-da6a390b7fbf");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("0f871dbe-3ed0-4b5a-b781-6d548462367c");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("078a6a22-64ed-486f-b302-6da44bfa36cc");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("64f8c5c2-9393-4262-b8ef-6d9c17c4c982");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("450dab28-638d-4564-b745-d79b88aace7e");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("8bd256d6-635a-4840-af8b-b097b253912e");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("3a3c6261-e250-4312-8608-78b84f6c57a7");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("88c691c6-4738-45fb-bea7-88f0807bc52a");
    _Verify_user_on_separate_page_of_director_responsibilities_appearing_on_reportFA69641.Click_Full_Accounts();
    

    }

}
