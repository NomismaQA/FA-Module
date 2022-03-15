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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/2743013a-ca74-4b7d-9a6f-834c550aa4fc
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 930, profileId = 100824)
public class VerifyNotesappearanceonStatementofFinancialPositionpage51_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_Notes_appearance_on_Statement_of_Financial_Position_page51","Verify_Notes_appearance_on_Statement_of_Financial_Position_page51 - Default Profile"})
    @TestModellerPath(guid = "99af4533-9621-46eb-ae10-60e34e0d96d3")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyNotesappearanceonStatementofFinancialPositionpage51_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verify_Notes_appearance_on_Statement_of_Financial_Position_page51 _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51 = new pages.Verify_Notes_appearance_on_Statement_of_Financial_Position_page51(driver);
    TestModellerLogger.SetLastNodeGuid("aa3e59fe-ea48-4d3e-b5fe-3f4bd9ea7ee6");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9381ba5a-937f-4687-89bc-205ccbac0d5f");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("f9aeccd6-12c0-4e5c-a0df-44f31088ce3e");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("a919d485-ae59-4808-9a43-a43f8a829116");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("52eeb9c0-3636-4df8-a686-a36e6252024e");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("2e5c05a0-bbeb-454a-be9e-1af2c4a1725c");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b008ccf3-06d2-4cf9-ac6c-87fc6c940fc8");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2c2e3486-c2d0-42a3-9ecb-07411f644e63");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("cbafaff1-5f02-43af-8c0c-e17dc6b0c8e8");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("4ca50e19-edfc-48b8-9a2d-459fc9aed63b");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("2caf077c-ac74-42e1-b007-4bfa3b495a2a");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("8a229029-01dd-4cae-8822-630d39318a6b");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7541f5f6-d941-4c05-98c3-1ef4375c861e");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("dda52b61-3000-49a7-9172-0a4ad54c0bae");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("84820123-6c6b-4e11-aa86-b8b0c93e7772");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("c7781bc9-73b7-4841-8f1f-602ad98f1352");
    _Verify_Notes_appearance_on_Statement_of_Financial_Position_page51.Click_Full_Accounts();
    

    }

}
