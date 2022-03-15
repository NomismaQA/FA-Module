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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f00d8635-af9f-44f8-906f-926ef39d93ef
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1315, profileId = 101185)
public class VerifynewlineinsertedafterinvestmentcalledinvestmentpropertyonstatementFA69660_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660","Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660 - Default Profile"})
    @TestModellerPath(guid = "ee3191e3-2cad-4c9c-9e8e-16aec338f035")
    public void GoToUrlAssertUrlPositiveEnterUsernameEnterPaswordClickLoginButtonPositiveEnterAgentNameClickS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifynewlineinsertedafterinvestmentcalledinvestmentpropertyonstatementFA69660_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660 _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660 = new pages.Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660(driver);
    TestModellerLogger.SetLastNodeGuid("7dad4b72-365f-4cae-9571-42dd2382154a");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d9d81d6-1fbc-4488-9f09-69777c81a309");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("56765be4-708f-42dd-8ef2-67773a5c06c3");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("458da0ce-1ea7-4c43-8a2c-8904c411e42f");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Pasword(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("0b9323ea-2b04-4a27-a2de-2c83caafa297");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("cfe0d773-b90f-4288-a7ec-0e6620f3ecaf");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7af1a82d-8bda-4e20-a44c-bc82af0e6e75");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("4f0f8e8b-6609-4a57-9b3b-6280abf885ff");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("7904fc76-01a0-420c-bf31-e104582f4c5a");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("2f414f9d-d041-4700-8782-a585bfd6ac28");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("3d7b7693-d040-48f2-8bba-882d1d014e57");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("05197556-780d-4b37-92dd-3b737bf38ed7");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cbbb1463-5647-4e5d-a930-c84b9de177ec");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("1f5cdf06-a211-4726-8122-f385946362c7");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("3eb7de28-d741-4957-a699-c315976586ce");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("3a87be80-64c9-4f41-b002-8979ba839a25");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Date("22/06/2020");
    

    TestModellerLogger.SetLastNodeGuid("0d5fffba-d4a8-4084-a761-5f47f4ee34ec");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Select_Currency("GBP");
    

    TestModellerLogger.SetLastNodeGuid("c465c36d-cab9-477a-bc6f-199c2544fa32");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Description("Test");
    

    TestModellerLogger.SetLastNodeGuid("4e3f9af1-6774-43d8-9a56-059aed06767a");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Account1("200");
    

    TestModellerLogger.SetLastNodeGuid("c1268b61-6a5b-4a22-919f-89fea72df0cd");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Debit1("500");
    

    TestModellerLogger.SetLastNodeGuid("9fab1ec1-6efd-4e01-ba05-80a1a9584a85");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Account3("1300");
    

    TestModellerLogger.SetLastNodeGuid("815a8040-d8ad-4e42-886c-9230da337791");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Enter_Credit3("1300");
    

    TestModellerLogger.SetLastNodeGuid("de28999d-7aca-48ef-9c90-9836abbf981e");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("27fb17cd-ca78-4b53-9fc0-b2255a90b19c");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("4f3f55bf-2a33-480a-8458-385991f918f5");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("e4cfa6ef-6482-4394-aff8-38256303984a");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ae74a372-9c30-46e8-ae91-b273e4cd591f");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("5281a62a-43fc-4d5c-8d4d-de8c6fe5c359");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("d72de8ab-12bf-4671-a881-c972524de76d");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("fb8f8c42-f0bd-444a-aaaf-8c4ea27fc94a");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("82f2d71f-fdd8-41fd-9f95-69c50bef8748");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("4336628b-f72d-40c3-8d18-230f2c525df7");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("de7acd9f-f3b1-460d-b276-9777a95e6bc4");
    _Verify_new_line_inserted_after_investment_called_investment_property_on_statementFA69660.Click_Full_Accounts();
    

    }

}
