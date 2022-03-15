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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f8ff51c7-98a6-422a-b301-7593b72c1a90
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 922, profileId = 100815)
public class VerifydefaultstatusofAveragenumberofemployees35_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;   

    
    @Test  (groups= {"Verify_default_status_of_Average_number_of_employees35","Verify_default_status_of_Average_number_of_employees35 - Default Profile"})
    @TestModellerPath(guid = "54ef03ec-ce20-4107-8849-688e9b247bb0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
	sTestCaseID="VerifydefaultstatusofAveragenumberofemployees35_DefaultProfile";
	sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_default_status_of_Average_number_of_employees35 _Verify_default_status_of_Average_number_of_employees35 = new pages.Verify_default_status_of_Average_number_of_employees35(driver);
    TestModellerLogger.SetLastNodeGuid("8472bfa9-c3b2-4128-ae37-1d69697663f5");
    _Verify_default_status_of_Average_number_of_employees35.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("635c73ec-03ee-44f3-960f-9c005827c363");
    _Verify_default_status_of_Average_number_of_employees35.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("226019ca-691a-475f-a376-a5b0609363ca");
    _Verify_default_status_of_Average_number_of_employees35.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("785202ea-0ef1-4e93-a5ee-aec19ead0915");
    _Verify_default_status_of_Average_number_of_employees35.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b1614946-3d55-426f-a1cf-e12e8fe7dabe");
    _Verify_default_status_of_Average_number_of_employees35.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2d5689cc-4e80-42d9-a54c-16e2c595e6f3");
    _Verify_default_status_of_Average_number_of_employees35.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("3f59930a-2530-4d0d-9658-2b3bcdf7189b");
    _Verify_default_status_of_Average_number_of_employees35.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8e2fbdd6-024c-4384-815d-29ece7cac6e4");
    _Verify_default_status_of_Average_number_of_employees35.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("75fdbea4-2d0b-41c1-9d18-084258f5c9e4");
    _Verify_default_status_of_Average_number_of_employees35.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("f940fa80-8992-400f-94bb-fdc7c3c4f820");
    _Verify_default_status_of_Average_number_of_employees35.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("7f716d6e-cc41-47a4-b424-25fec758f2db");
    _Verify_default_status_of_Average_number_of_employees35.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("99285105-7f63-4a34-8bd2-7cc116ddecbd");
    _Verify_default_status_of_Average_number_of_employees35.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("b6fa32d9-3ef9-4969-8d0a-d61969e1c536");
    _Verify_default_status_of_Average_number_of_employees35.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("c18ce2d1-4546-4657-9e3a-65b01ad54b16");
    _Verify_default_status_of_Average_number_of_employees35.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("dca1f7cd-0fe0-4332-9c45-d6c6f0f53968");
//    _Verify_default_status_of_Average_number_of_employees35.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("10619f03-dabb-44fb-b8c5-93bdc5232652");
    _Verify_default_status_of_Average_number_of_employees35.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("7bf5c524-ddeb-4755-8885-4b3c7ac7cd50");
    _Verify_default_status_of_Average_number_of_employees35.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("9ef79f8a-9613-4104-a004-59beb96c3324");
    _Verify_default_status_of_Average_number_of_employees35.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("16609fdc-ffd2-49c7-bbfb-179257107212");
    _Verify_default_status_of_Average_number_of_employees35.Select_ctl00cPHddStatus("In-active");
    

    TestModellerLogger.SetLastNodeGuid("3ba324fa-9292-4b1f-97f5-75ecae55c341");
    _Verify_default_status_of_Average_number_of_employees35.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("10619f03-dabb-44fb-b8c5-93bdc5232652");
    _Verify_default_status_of_Average_number_of_employees35.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("013a0d5c-cda8-4772-b58c-dcadeb18eb50");
    _Verify_default_status_of_Average_number_of_employees35.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d1ade109-ebf8-44f9-89ad-ab89bc897aed");
    _Verify_default_status_of_Average_number_of_employees35.Click_Statement_of_Financial_Position();
    

    }

}
