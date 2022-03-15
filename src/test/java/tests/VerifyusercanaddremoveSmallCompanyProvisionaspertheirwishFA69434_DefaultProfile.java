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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/18308a22-5732-4572-82ec-a1be84339d67
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1435, profileId = 101310)
public class VerifyusercanaddremoveSmallCompanyProvisionaspertheirwishFA69434_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434","Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434 - Default Profile"})
    @TestModellerPath(guid = "93ea0978-d2a0-4340-ba74-ee382237305c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyusercanaddremoveSmallCompanyProvisionaspertheirwishFA69434_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434 _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434 = new pages.Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434(driver);
    TestModellerLogger.SetLastNodeGuid("063f5e34-caaa-4a9f-9dcb-7e50be9c95ff");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("f22137c6-e3e4-48df-914c-2d6c875761df");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e797d7d-6315-4b23-a5d2-fbb21d2544e5");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("ffc2494e-b374-4a91-b0c9-9f272146ca97");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("1db9ed78-4249-47e7-9490-257a82c11f9c");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f0b28a38-4347-4518-ae61-8403e69a1e01");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("857704c5-99d9-4d89-9720-8f19379f1030");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("70cde3f3-793d-4f24-a6ec-0ffcc3440d95");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("a6f52773-b905-45bd-aafe-7636a9c9b9c0");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("2131acc1-1d7b-42dd-ab55-c36ad700483d");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("8357d612-9482-4ce6-88d8-c43e03457d8f");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("8159a336-1566-485e-a6b5-39b01d807fc1");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d1cba864-39bb-463d-94be-49b44630d388");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("ceef1691-e532-4e11-ba5a-d1e14c338488");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("674afcfc-ec08-4072-8f00-77f35a72c87e");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3dcaa20e-312f-4c30-aa52-b0e57ba5987c");
    _Verify_user_can_add_remove_Small_Company_Provision_as_per_their_wishFA69434.Click_Full_Accounts();
    

    }

}
