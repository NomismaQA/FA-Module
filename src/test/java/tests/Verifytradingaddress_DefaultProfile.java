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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/6dcbe001-baf1-4794-a0a5-1b0da63ee35e
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 876, profileId = 100755)
public class Verifytradingaddress_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifytradingaddress","Verifytradingaddress - Default Profile"})
    @TestModellerPath(guid = "0492d88d-ab37-4509-b3ba-29893a34dc9b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifytradingaddress_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        
        pages.Verifytradingaddress _Verifytradingaddress = new pages.Verifytradingaddress(driver);
    TestModellerLogger.SetLastNodeGuid("9a8f97fc-8a6d-4e61-ac25-449604d40606");
    _Verifytradingaddress.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("aa5e7eeb-797f-4106-8cb3-ab50f74fe637");
    _Verifytradingaddress.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("265cd8a8-83a0-4b50-93ae-66dd09da731a");
    _Verifytradingaddress.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("1f2ad0c3-4f19-4b34-9ee8-955b6bc0bbcb");
    _Verifytradingaddress.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("6c070cb5-2b37-4e26-a983-db712ad46952");
    _Verifytradingaddress.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d9289709-f498-4b02-8717-122d1ba8b9b6");
    _Verifytradingaddress.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1be14d6a-9779-480c-8ade-30bae2302c7d");
    _Verifytradingaddress.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b7ab1452-7eea-4447-9b0c-24f5e0be9cc9");
    _Verifytradingaddress.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("bb2ec907-b3ba-48ec-83e2-997264fbea90");
    _Verifytradingaddress.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("5ece7526-eaae-4331-a9f8-a76577c7f157");
    _Verifytradingaddress.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("6ef29866-b281-4751-9600-9e969283168d");
    _Verifytradingaddress.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("b8be8620-6884-4a02-8ae8-90fd323f3cde");
    _Verifytradingaddress.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("62c47e19-8316-43be-9ab1-26b455d71a47");
    _Verifytradingaddress.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("73328b8c-2500-4874-a998-f4ca0d67f477");
    _Verifytradingaddress.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("70eee8c3-ceb3-4265-adc5-34cf3a2371ad");
    _Verifytradingaddress.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("2469ce13-ac44-4c78-80d1-e452e04058a7");
    _Verifytradingaddress.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("bbce5a0b-503f-4b51-b38c-c416bf2deb33");
    _Verifytradingaddress.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("eec1f812-c050-4d90-bb13-e4968d5e79da");
    _Verifytradingaddress.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("58a30868-d85c-4836-b10d-5650fcc6bff6");
    _Verifytradingaddress.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("ed835dd1-a672-4b4b-ab79-3d7768857763");
    _Verifytradingaddress.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("dfe4bf85-3394-421b-934e-6ff80dd343e2");
    _Verifytradingaddress.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("40883f03-acc2-4520-8c05-4609e8b5940f");
    _Verifytradingaddress.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("52ba1638-ec14-42c3-b679-59c03c81a4bd");
    _Verifytradingaddress.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("4806b71a-577f-421c-a721-827aa7ce890c");
    _Verifytradingaddress.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("1eaa475f-2ab1-4586-b6d2-52490ad68033");
    _Verifytradingaddress.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("d55bc8ca-6b4a-4a2c-a7e4-6929c571b48b");
    _Verifytradingaddress.Click_Full_Accounts();
    

    }

}
