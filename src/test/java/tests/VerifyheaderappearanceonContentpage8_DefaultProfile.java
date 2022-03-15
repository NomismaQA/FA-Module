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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/198fb591-4751-4403-aa81-08d910169f92
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1088, profileId = 100986)
public class VerifyheaderappearanceonContentpage8_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_header_appearance_on_Content_page9","Verify_header_appearance_on_Content_page9 - Default Profile"})
    @TestModellerPath(guid = "bf988be7-3073-4c44-abff-7558efd3e903")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonContentpage8_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_header_appearance_on_Content_page8 _Verify_header_appearance_on_Content_page9 = new pages.Verify_header_appearance_on_Content_page8(driver);
    TestModellerLogger.SetLastNodeGuid("bafb3c3e-6a49-4a09-803f-fe2e4fcbc585");
    _Verify_header_appearance_on_Content_page9.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("5d63690f-ee6c-4009-ac46-413dcc91a4bc");
    _Verify_header_appearance_on_Content_page9.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8ab8043f-d0e6-410e-a6db-34c0889b7907");
    _Verify_header_appearance_on_Content_page9.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("1880e002-90fe-46ea-bdb2-44e2f5eb4921");
    _Verify_header_appearance_on_Content_page9.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a15e2715-c87e-4b89-bd97-4c5a85556264");
    _Verify_header_appearance_on_Content_page9.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("10b86c31-60ec-4c2d-80f9-61ddc70e91b4");
    _Verify_header_appearance_on_Content_page9.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("27e76c16-250f-4cfc-b10c-366081165137");
    _Verify_header_appearance_on_Content_page9.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("9a6f9b0f-b574-4d10-87eb-845bda3bdf4c");
    _Verify_header_appearance_on_Content_page9.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("4ab26d3e-3843-44dc-b7e3-51a5b34aef94");
    _Verify_header_appearance_on_Content_page9.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c499aa09-8467-497e-ac31-d6097f645f3d");
    _Verify_header_appearance_on_Content_page9.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("591cf1f7-5f4e-4bc2-b3a5-beb534b20cd8");
    _Verify_header_appearance_on_Content_page9.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("f9d49ad8-14dc-457a-b8ae-7dc43fa194a3");
    _Verify_header_appearance_on_Content_page9.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("e8343e21-8b3c-474f-bb06-2945f99fa1e2");
    _Verify_header_appearance_on_Content_page9.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("e18b0194-6812-4d23-a2f5-d2833c8b9762");
    _Verify_header_appearance_on_Content_page9.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("ea0ac110-e60a-421d-b1d1-4233232104de");
    _Verify_header_appearance_on_Content_page9.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b23d973b-9aef-4729-9168-41c61163e2f7");
    _Verify_header_appearance_on_Content_page9.Click_Filleted_Accounts();
    

    }

}
