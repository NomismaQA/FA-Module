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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/868e0166-9b3c-403a-bc62-206c5af7205b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1089, profileId = 100987)
public class Verifyrenamehasbeendone9_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_rename_has_been_done9","Verify_rename_has_been_done9 - Default Profile"})
    @TestModellerPath(guid = "57125ccb-f4ae-4bd3-af92-44d6dd5a1231")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyrenamehasbeendone9_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_rename_has_been_done9 _Verify_rename_has_been_done9 = new pages.Verify_rename_has_been_done9(driver);
    TestModellerLogger.SetLastNodeGuid("f0102e53-d013-4795-b00e-d7b45e23d86c");
    _Verify_rename_has_been_done9.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e6b49b07-643f-4927-ac83-3d1f3815ffc4");
    _Verify_rename_has_been_done9.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ea1b812c-254a-4240-98c9-d3a2bb0e1120");
    _Verify_rename_has_been_done9.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("abd2bae0-23be-4086-98a3-cf1c3320f524");
    _Verify_rename_has_been_done9.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a87320b9-1b9a-41b2-bcfc-7478f860db33");
    _Verify_rename_has_been_done9.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("91a0d031-a870-4398-a251-a473331ee459");
    _Verify_rename_has_been_done9.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("32bd2780-74b3-4272-a9cb-67734f74af8a");
    _Verify_rename_has_been_done9.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("8a6150e5-d156-4270-9fe5-0ca553c5000a");
    _Verify_rename_has_been_done9.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("fee4eabe-59b3-4f23-8cf2-98e9a34be2a9");
    _Verify_rename_has_been_done9.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("dd12b0af-a0a9-4f70-bc48-9486dc2386ef");
    _Verify_rename_has_been_done9.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("9fefe885-840b-4205-88d9-46e902c0ea5b");
    _Verify_rename_has_been_done9.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("914cfbb1-fc5a-4244-b674-6057be622c25");
    _Verify_rename_has_been_done9.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("28a3eb62-a448-481e-ba06-34fad12eabf9");
    _Verify_rename_has_been_done9.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("cfd43c54-4cd6-4e7d-80e6-f3230f2e36da");
    _Verify_rename_has_been_done9.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("23212b90-5590-4035-acd9-b15d2b75ca4c");
    _Verify_rename_has_been_done9.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("374085c5-1aa6-4d71-b1b0-3272bc7277f2");
    _Verify_rename_has_been_done9.Click_Filleted_Accounts();
    

    }

}
