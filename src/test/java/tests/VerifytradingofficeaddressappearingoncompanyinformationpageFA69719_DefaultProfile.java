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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/af728be5-a83b-4f01-8a71-97aea267a24d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1372, profileId = 101236)
public class VerifytradingofficeaddressappearingoncompanyinformationpageFA69719_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_trading_office_address_appearing_on_company_information_pageFA69719","Verify_trading_office_address_appearing_on_company_information_pageFA69719 - Default Profile"})
    @TestModellerPath(guid = "a5241a85-181d-45a7-97b1-fd41ef4284ef")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifytradingofficeaddressappearingoncompanyinformationpageFA69719_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_trading_office_address_appearing_on_company_information_pageFA69719 _Verify_trading_office_address_appearing_on_company_information_pageFA69719 = new pages.Verify_trading_office_address_appearing_on_company_information_pageFA69719(driver);
    TestModellerLogger.SetLastNodeGuid("ad3e63fe-1e1a-465d-aaff-f1f8aa1370ee");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("01480eef-51cc-47d6-976f-7f18b396d8b4");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3d003b34-fff9-4d1f-a7c7-b83ccbb79de9");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("b3d2c858-2796-4c65-94a8-334c5051d940");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4decc4e8-02ad-4857-9e50-ef4c68a18388");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f9b99685-10ec-444b-b65b-8430e69a614b");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7930bf9c-f655-40cc-93f9-ff116a6ea074");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("4a5e4e12-27b1-4681-82d3-1ae9bbf8aaaf");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("0eee8a30-0c57-4329-88ef-1c3066740d8b");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("ae3cfcb9-1bca-4a1c-8d38-0e3b004054ab");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("c8fdcb87-c85b-4808-92a4-8ed8c88d0efe");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("88553283-c749-4daa-99d3-1d3109d36762");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f260563e-9450-474a-806d-28c2d4342b3e");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("194a2d3e-d806-44c7-b6ec-9aa694f7e74f");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("d9d3959f-cc21-4fa0-b489-9de83fb51aba");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ce6d17b9-132e-4105-90fc-cdfca84d358d");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("1fbc54b9-b696-4de1-88d4-d3b30dc5b5a2");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("2bfa1fae-57f3-4c3a-83c6-a69189dce1a8");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Enter_CompanySecretary("Name1");
    

    TestModellerLogger.SetLastNodeGuid("1ccc65dc-e4fa-4a99-861c-b722dea09976");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    
    
    TestModellerLogger.SetLastNodeGuid("1f393a88-5522-4c19-8d8b-e5fc711263fe");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_chkIsIncludeInReport();
    
    TestModellerLogger.SetLastNodeGuid("23ee9d58-87be-4d92-8f96-8e03934dd2d9");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("8747f1b1-31f7-43ce-9beb-ec12919d7710");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("e4801d2f-1d65-41ba-b454-40da0d19677f");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("a8816817-39ea-4850-b4c9-ba5fb5389868");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("3326a383-3c9d-4ca5-8d27-3b8ced827e60");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69719.Click_Filleted_Accounts();
    

    }

}
