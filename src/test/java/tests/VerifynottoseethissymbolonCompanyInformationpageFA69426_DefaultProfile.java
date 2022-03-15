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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/be54ca2a-6f90-4f4a-a56d-519a80e27a32
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1423, profileId = 101293)
public class VerifynottoseethissymbolonCompanyInformationpageFA69426_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426","Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426 - Default Profile"})
    @TestModellerPath(guid = "d3b85668-13c1-46e4-87cb-5c3907cd657b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifynottoseethissymbolonCompanyInformationpageFA69426_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426 _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426 = new pages.Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426(driver);
    TestModellerLogger.SetLastNodeGuid("95e31bbb-116e-44be-b612-4b71b84ae741");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8a714722-1e2f-4b65-8bce-645346052f03");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f25ac1e3-89f3-448b-bb02-5ad55507eaf3");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2a7e46c1-de41-4699-8a95-e5f19878872a");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("75191c04-69a7-4d2b-99be-32438a1142f5");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c0f2d9f4-c9ba-4751-bf9f-c5e3192f43ab");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1e015e28-7fe8-4e5a-a859-87e053baadc4");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("d3d72b31-da7b-4fe9-95db-eda05af6ca1e");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ef922da4-e3fc-4224-b510-b91bbbe0dcde");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("68adbd35-cf7e-424b-b797-02692ac38517");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6796c2b1-f884-4d4c-8aaa-5de1b024e55e");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("e5d4945d-4c97-4c34-97af-f5801d33f7f3");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("34df93a4-b767-4e87-b5c7-b7ea76f6cd6e");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("2434ed92-bcd5-4a8b-807a-231a7445ba4f");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("9d737628-bc9c-4a03-b4c5-115fba6050ac");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("568fcd08-a6f8-4593-a1ee-7398f209fcbb");
    _Verify_not_to_see_this_symbol_on_Company_Information_pageFA69426.Click_Full_Accounts();
    

    }

}
