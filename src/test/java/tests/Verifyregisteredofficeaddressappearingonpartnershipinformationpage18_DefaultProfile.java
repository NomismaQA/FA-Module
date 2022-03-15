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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f7e98515-fb4b-410d-af14-0c6a2c03a4ab
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1114, profileId = 101010)
public class Verifyregisteredofficeaddressappearingonpartnershipinformationpage18_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_registered_office_address_appearing_on_partnership_information_page18","Verify_registered_office_address_appearing_on_partnership_information_page18 - Default Profile"})
    @TestModellerPath(guid = "cca162e8-a8b0-4e64-87a2-595b640d82c5")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyregisteredofficeaddressappearingonpartnershipinformationpage18_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_registered_office_address_appearing_on_partnership_information_page18 _Verify_registered_office_address_appearing_on_partnership_information_page18 = new pages.Verify_registered_office_address_appearing_on_partnership_information_page18(driver);
    TestModellerLogger.SetLastNodeGuid("6fe63cda-a0bb-4914-a896-7701174b5e6c");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("21ac8f12-8268-48c6-9ffd-6f39806484e1");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8862d7b5-08c4-4cf7-99bc-ba5ca3faf2e9");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("fdafa0f2-171e-4bc8-be06-cdbdfff0280a");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("6d9a3dce-3422-46fe-858a-a626f7b74fbd");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("56fa7406-1717-42ba-9237-2eec32230f35");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("0dd562b0-fd61-42a6-8b1f-72cdb113e0c2");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("0d1c674b-7a6b-4fd7-a867-4ac38159c3cb");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("b2112e7d-1554-4da0-979a-b635ebc3b3b5");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("061c086f-9af9-4947-93c7-2b5a5bfb539a");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("fab3a718-1737-408e-a51a-3171e60dced8");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("5c066155-5156-4fd6-9427-d88f4800e21f");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e0d82b42-0145-4ad1-80e6-12981a42ecbe");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("a770060e-802d-4e58-b67d-a77a8a7a97fe");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("bdccc8e6-2da5-4867-84e9-f6080a5bf1f4");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("2a600e11-b83f-4e8b-b272-31bf393dd8f2");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("f3060c2e-4bc5-49a5-ae19-041ce3359a10");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("b75088ba-e0f4-4ef4-8e2f-c2e2dac62d76");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("45b3e170-2c3a-4b4d-9776-640f3444598a");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("1b56275d-04a7-4f59-b360-fede2f9d3401");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("4fb36693-1daa-4953-8cbb-84ddc4c10135");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("d9ea6389-0354-4275-8419-612b006b9935");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("2e7606d4-10d1-4f73-be9a-96fc88d1cda1");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("959990d3-bbd2-4daa-9d2e-b45448be8b67");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("b69e4842-68a2-48f5-8a47-ea3900606e69");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("2419cf43-3abd-47c4-ad58-7e052acaf156");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("794eaeb6-009d-493e-879d-b63cf64ccd57");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("83e4caf2-ca89-4649-b70e-41fafe0f3157");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("c661b663-7a03-4d51-98fd-ffdf4db21226");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("b8577869-c1e2-4a01-9084-af9767950e92");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("32ca27b4-45c3-4b77-8c46-ae008066df08");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("28bbe431-9996-4928-9286-9388c2ab7a83");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("004e574f-6e81-442b-b212-9a72d00d3768");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("cf5de91d-d820-4c62-9d7d-633e6dedd8b3");
    _Verify_registered_office_address_appearing_on_partnership_information_page18.Click_Partnership_Information();
    

    }

}
