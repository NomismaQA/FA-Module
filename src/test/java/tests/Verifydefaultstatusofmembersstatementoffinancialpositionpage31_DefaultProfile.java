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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/76d6dd74-1f75-4ca2-a85a-832cc6da88d8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 918, profileId = 100811)
public class Verifydefaultstatusofmembersstatementoffinancialpositionpage31_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    

    
    @Test  (groups= {"Verifydefaultstatusofmembersstatementoffinancialpositionpage31","Verifydefaultstatusofmembersstatementoffinancialpositionpage31 - Default Profile"})
    @TestModellerPath(guid = "20546a9a-2274-4dc1-a5e1-a1fab042902f")
    public void GoToUrlAssertUrlPositiveEnterctl00cPHloginPositiveEnterctl00cPHpassClickLoginButtonPositiveEnt() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydefaultstatusofmembersstatementoffinancialpositionpage31_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
    	
        
        pages.Verifydefaultstatusofmembersstatementoffinancialpositionpage31 _Verifydefaultstatusofmembersstatementoffinancialpositionpage31 = new pages.Verifydefaultstatusofmembersstatementoffinancialpositionpage31(driver);
    TestModellerLogger.SetLastNodeGuid("afd36eaa-7f9c-438f-b144-d3da6e37929f");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("dc303653-fe75-475b-9280-c5df7e3b4158");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3b972e78-c41a-4c2e-8166-8a560d274d6e");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Enter_ctl00cPHlogin(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e104aeae-16a0-4f73-9a70-caff60d26054");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b76a4225-b196-41ac-a815-243b64e5fdf0");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("60a0f1c2-b717-4627-b999-6b533e15a70d");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("80e18f56-a020-4fa0-b152-3f1552156982");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("a38207ed-0afb-44ec-b15c-82abbfc9e752");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ec27cd76-92da-4d1e-ab0a-a0c4685e9c64");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("800cddb4-732f-4055-816f-1d13a521dbbb");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("86e20777-1343-4d67-acde-de6f4198f706");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("3b3ad59d-d45c-426a-bf72-3ba556935b70");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("43bb8c13-ec36-4177-950a-b7d1d40a20c6");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click__ABC_LLP();
    

    TestModellerLogger.SetLastNodeGuid("465f039c-b23b-4097-8c40-eacdf81582c8");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("0fb49d0d-8781-4459-a61b-3cad581a7acd");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("f49f0682-ba83-44bd-a673-46a95d8c7554");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("a57457ff-5b3e-43d0-9b8e-59197bb8670f");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("d6e405a9-78c7-42ba-b586-6dd419e7d1a1");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Select_ctl00cPHddStatus("In-active");
    

    TestModellerLogger.SetLastNodeGuid("4212cc59-1917-4d21-b75f-8e6a18fa11fb");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("0fb49d0d-8781-4459-a61b-3cad581a7acd");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Final_Accounts2();
    

//    TestModellerLogger.SetLastNodeGuid("c64827ac-b122-4319-be21-62ed5588c824");
//    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Final_Accounts2();
//    
//    TestModellerLogger.SetLastNodeGuid("44f0e585-dacb-4649-a797-262b865f48fa");
//    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Note_Templates_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c4b5bc9-7984-4d07-8ea3-64643c7d3b8d");
//    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Edit1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("a3c5cfb9-37a8-40d0-aab2-44000bffcdc6");
//    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Select_ctl00cPHddStatus("Active");
//    
//
//    TestModellerLogger.SetLastNodeGuid("7bb5e448-89bb-4ccb-8455-627392225d1c");
//    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Save();
//    
//    TestModellerLogger.SetLastNodeGuid("c64827ac-b122-4319-be21-62ed5588c824");
//    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b8f18114-52f3-48ac-8238-f0e493f98ce6");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d846cf27-6837-4352-a1f4-83243510c934");
    _Verifydefaultstatusofmembersstatementoffinancialpositionpage31.Click_Statement_of_Financial_Position();
    

    }

}
