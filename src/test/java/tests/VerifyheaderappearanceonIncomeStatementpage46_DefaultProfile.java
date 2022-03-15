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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a86fd918-7505-4efd-8d9f-bc2b37b7ed3c
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 928, profileId = 100821)
public class VerifyheaderappearanceonIncomeStatementpage46_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Income_Statement_page46","Verify_header_appearance_on_Income_Statement_page46 - Default Profile"})
    @TestModellerPath(guid = "518ede82-eb77-4430-b030-5ecaac9e8283")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonIncomeStatementpage46_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_Income_Statement_page46 _Verify_header_appearance_on_Income_Statement_page46 = new pages.Verify_header_appearance_on_Income_Statement_page46(driver);
    TestModellerLogger.SetLastNodeGuid("4b7901ca-5863-4cef-85cc-4eb6d6105038");
    _Verify_header_appearance_on_Income_Statement_page46.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("36ab525d-812e-4550-add8-1f2348ed362f");
    _Verify_header_appearance_on_Income_Statement_page46.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("65187faf-27a0-41b4-b625-6798b2236a70");
    _Verify_header_appearance_on_Income_Statement_page46.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a32df0fa-d26a-4501-b737-f1c3dc5675ae");
    _Verify_header_appearance_on_Income_Statement_page46.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("86036f35-d560-43b1-a424-f8ec4d27f7c1");
    _Verify_header_appearance_on_Income_Statement_page46.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2757214c-3b10-409c-857a-b0368adb37d5");
    _Verify_header_appearance_on_Income_Statement_page46.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("4cd65d86-28e3-4da2-b9a3-2732843172c7");
    _Verify_header_appearance_on_Income_Statement_page46.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("0720edbe-461f-405a-8b32-65cf61a7a244");
    _Verify_header_appearance_on_Income_Statement_page46.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("546aa4bd-d36e-4252-bc77-12b3266a53b5");
    _Verify_header_appearance_on_Income_Statement_page46.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("9bebb35b-2da2-40e0-ba2d-078b79dc3044");
    _Verify_header_appearance_on_Income_Statement_page46.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("edba146b-50a7-4cf5-9e19-5249da504a1b");
    _Verify_header_appearance_on_Income_Statement_page46.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("8db30b51-2b59-4e9d-bdb0-462fa1f13f6a");
    _Verify_header_appearance_on_Income_Statement_page46.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("fb7ea451-f567-4f6a-97bf-950905ec5696");
    _Verify_header_appearance_on_Income_Statement_page46.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("472858e4-24d8-4e72-a82c-59b6868576fd");
    _Verify_header_appearance_on_Income_Statement_page46.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("eea839cd-e313-43c5-91e2-f2cd9f9bdc6d");
    _Verify_header_appearance_on_Income_Statement_page46.Click_Final_Accounts2();
    

    }

}
