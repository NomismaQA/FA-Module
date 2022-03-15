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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d8fde559-c629-47c0-aaed-f1a1ed1705d7
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1097, profileId = 100995)
public class VerifyheaderappearanceonPartnershipInformationpage12_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_header_appearance_on_Partnership_Information_page12","Verify_header_appearance_on_Partnership_Information_page12 - Default Profile"})
    @TestModellerPath(guid = "bcc1af6d-2c88-4385-ab61-ffe5ea5642d2")
    public void GoToUrlAssertUrlPositiveEnterctl00cPHFiltertxtAgentNameClickSearchbutton1ClickClientsPositiveE() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonPartnershipInformationpage12_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.Verify_header_appearance_on_Partnership_Information_page12 _Verify_header_appearance_on_Partnership_Information_page12 = new pages.Verify_header_appearance_on_Partnership_Information_page12(driver);
    TestModellerLogger.SetLastNodeGuid("b347f8a2-e1e9-4214-976d-85ee0e5d7de4");
    _Verify_header_appearance_on_Partnership_Information_page12.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("10689671-36db-4f5d-9ca8-636f9a49b813");
    _Verify_header_appearance_on_Partnership_Information_page12.AssertUrl();
    
    TestModellerLogger.SetLastNodeGuid("ea1b812c-254a-4240-98c9-d3a2bb0e1120");
    _Verify_header_appearance_on_Partnership_Information_page12.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("abd2bae0-23be-4086-98a3-cf1c3320f524");
    _Verify_header_appearance_on_Partnership_Information_page12.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("a87320b9-1b9a-41b2-bcfc-7478f860db33");
    _Verify_header_appearance_on_Partnership_Information_page12.Click_Login_Button();


    TestModellerLogger.SetLastNodeGuid("fea43bc2-4ea9-4c4d-ad97-b25de97a373d");
    _Verify_header_appearance_on_Partnership_Information_page12.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("32b2efa5-14c2-4de1-93d3-0609ac3ec6d9");
    _Verify_header_appearance_on_Partnership_Information_page12.Click_Search_button1();
    
    TestModellerLogger.SetLastNodeGuid("8a6150e5-d156-4270-9fe5-0ca553c5000a");
    _Verify_header_appearance_on_Partnership_Information_page12.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ab1e17c7-fa34-4483-8b46-d12ac4208985");
    _Verify_header_appearance_on_Partnership_Information_page12.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("329ecde3-1814-43e5-92b5-f600ec509b58");
    _Verify_header_appearance_on_Partnership_Information_page12.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6ade3ffc-f4b9-4c95-83fb-c4d8b64a4484");
    _Verify_header_appearance_on_Partnership_Information_page12.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("ab8a5bf7-4d5e-4212-8644-c8b431093621");
    _Verify_header_appearance_on_Partnership_Information_page12.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("d248c36e-e88c-419c-ab24-d8541d00337c");
    _Verify_header_appearance_on_Partnership_Information_page12.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("0a68a47d-e78a-4610-ad2b-ddc79be1cfe6");
    _Verify_header_appearance_on_Partnership_Information_page12.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("aa3be752-07f8-4da3-be59-b278495a61c4");
    _Verify_header_appearance_on_Partnership_Information_page12.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("406e3e0c-52c6-40f8-b074-2bffd31d4d1d");
    _Verify_header_appearance_on_Partnership_Information_page12.Click_Filleted_Accounts();
    

    }

}
