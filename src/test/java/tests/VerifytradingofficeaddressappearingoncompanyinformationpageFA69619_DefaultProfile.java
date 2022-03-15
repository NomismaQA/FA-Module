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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/17a73b0e-fc61-46ba-8af4-8e49c358ca8f
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1195, profileId = 101081)
public class VerifytradingofficeaddressappearingoncompanyinformationpageFA69619_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_trading_office_address_appearing_on_company_information_pageFA69619","Verify_trading_office_address_appearing_on_company_information_pageFA69619 - Default Profile"})
    @TestModellerPath(guid = "ce17c9de-f534-4e67-87af-680fed04b50e")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifytradingofficeaddressappearingoncompanyinformationpageFA69619_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_trading_office_address_appearing_on_company_information_pageFA69619 _Verify_trading_office_address_appearing_on_company_information_pageFA69619 = new pages.Verify_trading_office_address_appearing_on_company_information_pageFA69619(driver);
    TestModellerLogger.SetLastNodeGuid("cb8d579e-b103-4e54-b34e-4d2665fa9dcd");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("a1526fc9-f2f2-4c27-bc50-b9ff13fc4045");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("248a6f39-509d-4fd0-ba65-294e899ddc94");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("8e057b58-9e59-4003-b8fd-915598b3e5dc");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("12fba1ef-3132-4bfb-8401-08df1c574f67");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("333c3248-2447-4ae5-832e-4194ecb18e52");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b1f52de4-5b70-44de-b38c-e000d0bf3362");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("51b88c7a-80ad-47be-9737-fdacc902d517");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ed792c5d-20ad-4c18-997c-c4e29a918159");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("e61d9ad5-b46c-4c3b-acd5-6c82fddff745");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("8ef581e4-3c0c-4603-b419-e8ff25d596d8");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("58f35876-69ba-46bb-889c-dbb0f1bfa2b5");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("0557900e-a8ee-4e94-ae31-0ec006cdac55");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("cb8b9041-0f36-4c56-85ef-e67a47c3ba01");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("276a8c81-d085-4696-97f7-ceb08e4269a2");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("4f7b0cfa-59d5-4d2c-a0c1-be9ea6012db0");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("f0c9edbb-eed3-43bb-a868-623c830d864b");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Trading_Address_buton();
    

    TestModellerLogger.SetLastNodeGuid("4be808c5-ce15-4ca5-96a5-a2dc56cc62b7");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("31493520-00cb-4bb7-8726-32678ac75f2a");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("19c541bf-66cd-4dc2-b323-ca5f64a6a0be");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("0d2c9f1b-af0e-4c09-9a5a-52649f612da6");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("d449d97f-f16d-4ccd-a568-42943c868413");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("1a57687a-4d26-4d30-aaee-d44bdaeae7ee");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("0cf11691-f019-48b7-86cb-b01af97df013");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("1f393a88-5522-4c19-8d8b-e5fc711263fe");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("be593536-97b0-45e5-9fda-2dbb11d96ce8");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("0e1f6177-8f32-4232-955a-d27e6045d6c5");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("eb83b778-b3a0-4859-b1ff-7f2d0a353701");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("9f640843-2ab8-40c1-8f6f-080d3dfd3141");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("c2c1f8dc-b15f-4906-8dd6-164c050d1f5c");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("4e3512a1-5aa7-40b9-9d70-207a3537c1e6");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("a2d72fc6-3260-4acf-908b-b66d9add5448");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("85288edf-5569-4982-86fc-7d0a216b5020");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("3e02dc32-7001-4c64-af44-182ac785440d");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("d34dbad9-1dd6-492c-8fad-5231ddb96509");
    _Verify_trading_office_address_appearing_on_company_information_pageFA69619.Click_Full_Accounts();
    

    }

}
