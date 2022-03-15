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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/65e70a49-2a93-4b87-81cc-b2f18bd40ba2
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 934, profileId = 100827)
public class Verifydynamicfooterpagenation54_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_dynamic_footer_pagenation54","Verify_dynamic_footer_pagenation54 - Default Profile"})
    @TestModellerPath(guid = "468251d2-7801-415e-a358-2b9b97e08faa")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifydynamicfooterpagenation54_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_dynamic_footer_pagenation54 _Verify_dynamic_footer_pagenation54 = new pages.Verify_dynamic_footer_pagenation54(driver);
    TestModellerLogger.SetLastNodeGuid("970d46d8-6c44-4948-bbe1-247690b38269");
    _Verify_dynamic_footer_pagenation54.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b6e6a6df-6a9b-4f0d-bea4-2a15f3271078");
    _Verify_dynamic_footer_pagenation54.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b21544d5-92bb-4144-973c-cfa2dc520cf7");
    _Verify_dynamic_footer_pagenation54.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0d62239d-507c-4b35-bf84-f6cc15ff0389");
    _Verify_dynamic_footer_pagenation54.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9ce6a8df-cae8-41e6-802e-e0c21febd6d8");
    _Verify_dynamic_footer_pagenation54.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("f49a48f0-4d25-44bc-b0a2-934a2821c026");
    _Verify_dynamic_footer_pagenation54.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ebc8e28d-b394-4a92-9934-74bde07f22fd");
    _Verify_dynamic_footer_pagenation54.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("9f5c99dc-04dd-469c-9ca6-c7ffe482ce95");
    _Verify_dynamic_footer_pagenation54.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("dee54226-c7eb-4878-aeef-a73b04f912ca");
    _Verify_dynamic_footer_pagenation54.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("28f41bd0-3795-4ab1-8182-5e36e45e8c78");
    _Verify_dynamic_footer_pagenation54.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("1869c4fd-4d96-4fb4-b838-3a6212938be4");
    _Verify_dynamic_footer_pagenation54.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("f1a7b99f-d7d2-4ed6-9513-be32538ca2fb");
    _Verify_dynamic_footer_pagenation54.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("836e4912-1161-4218-adb2-1a3dc3763077");
    _Verify_dynamic_footer_pagenation54.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("2fa01449-2300-432a-94a7-fceb6e90fd95");
    _Verify_dynamic_footer_pagenation54.Click_Final_Accounts1();
    

//    TestModellerLogger.SetLastNodeGuid("098da42b-b75d-4464-880e-b0c3f9aa8725");
//    _Verify_dynamic_footer_pagenation54.Click_Settings1();
    
    TestModellerLogger.SetLastNodeGuid("0a308cf0-948c-4055-9c92-706255fe0dec");
    _Verify_dynamic_footer_pagenation54.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("50ed505b-ee89-41cd-bdbb-7bda52891344");
    _Verify_dynamic_footer_pagenation54.Click_Note_Templates_Settings();
    

    TestModellerLogger.SetLastNodeGuid("86e53f0a-074f-4483-9d5d-610736596f4e");
    _Verify_dynamic_footer_pagenation54.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("f3025d18-9a04-4764-9c28-9949567c8bd7");
    _Verify_dynamic_footer_pagenation54.Click_Save();
    

//    TestModellerLogger.SetLastNodeGuid("0a308cf0-948c-4055-9c92-706255fe0dec");
//    _Verify_dynamic_footer_pagenation54.Click_Final_Accounts2();
//    
//    TestModellerLogger.SetLastNodeGuid("50ed505b-ee89-41cd-bdbb-7bda52891344");
//    _Verify_dynamic_footer_pagenation54.Click_Note_Templates_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("86e53f0a-074f-4483-9d5d-610736596f4e");
//    _Verify_dynamic_footer_pagenation54.Click_Edit1();
//     
//
//    TestModellerLogger.SetLastNodeGuid("f3025d18-9a04-4764-9c28-9949567c8bd7");
//    _Verify_dynamic_footer_pagenation54.Click_Save();
    
    TestModellerLogger.SetLastNodeGuid("0a308cf0-948c-4055-9c92-706255fe0dec");
    _Verify_dynamic_footer_pagenation54.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0d496e48-b578-4ac6-8565-e05b9bd33d9c");
    _Verify_dynamic_footer_pagenation54.Click_Full_Accounts();
    

    }

}
