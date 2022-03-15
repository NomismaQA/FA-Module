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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f314e3a7-0307-4e98-a0ba-fc474c8109ed
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 875, profileId = 100754)
public class Verifyregistrationaddress_DefaultProfile extends TestBase
{
    
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verifyregistrationaddress","Verifyregistrationaddress - Default Profile"})
    @TestModellerPath(guid = "7c2ca97b-4a3d-400f-8e5f-0991635f5350")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyregistrationaddress_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifyregistrationaddress _Verifyregistrationaddress = new pages.Verifyregistrationaddress(driver);
    TestModellerLogger.SetLastNodeGuid("0ab42d62-333e-46fd-b4ea-a4377d99d926");
    _Verifyregistrationaddress.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4be73b1a-ec95-4b84-8920-ef7fb9b27db9");
    _Verifyregistrationaddress.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("64b24a28-fb95-4e96-a9ad-9d723b264ca8");
    _Verifyregistrationaddress.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("899f793c-e2c3-4e46-9a65-29c37e666572");
    _Verifyregistrationaddress.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("70b8b2b0-fd3b-47ff-a0e6-5208c0fd637f");
    _Verifyregistrationaddress.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("645d706a-b09e-4dc2-87ff-c73ef52c277d");
    _Verifyregistrationaddress.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("55926dcf-0e64-4951-b66a-2b7b7e1bdd07");
    _Verifyregistrationaddress.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3c5f6a4d-85ea-4ece-b5f8-7c241671baf3");
    _Verifyregistrationaddress.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("df56618b-6b17-4d17-8074-b565aca2eccb");
    _Verifyregistrationaddress.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("33457816-1561-49af-832d-e1172a1a073e");
    _Verifyregistrationaddress.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("7fb95ffb-6f55-4a61-9363-af159ba3459b");
    _Verifyregistrationaddress.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("f5a3b133-ae3e-4128-90b9-21909afc13b8");
    _Verifyregistrationaddress.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("80c8ad22-cee4-4ac0-ad1a-999c0e3b0ed8");
    _Verifyregistrationaddress.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("ab4ab8a6-d242-4419-98e9-33ff295f1fb1");
    _Verifyregistrationaddress.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("dc6f285a-42b9-4193-a599-b62db7e4b219");
    _Verifyregistrationaddress.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("666deddc-96b2-41c7-b8fb-95281badd2f8");
    _Verifyregistrationaddress.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("e6513af2-e64d-47f7-80c3-d84f20c26370");
    _Verifyregistrationaddress.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("d02971e4-b3c6-4075-9a63-49f04b289120");
    _Verifyregistrationaddress.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("b0c99668-ba1c-497c-b21d-6b88f87bd3e3");
    _Verifyregistrationaddress.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("d1aadde0-ea13-4048-95e4-14bac9d1b6af");
    _Verifyregistrationaddress.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("dce7a663-b50a-4e21-9cb2-d3b2c0541f28");
    _Verifyregistrationaddress.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("d356d18c-fb9d-4a17-a312-af397b3b48cb");
    _Verifyregistrationaddress.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("d171f8ff-c332-4842-bf19-ceff54c307f8");
    _Verifyregistrationaddress.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("ecfdcc1a-dede-4410-afcb-5488c498e97f");
    _Verifyregistrationaddress.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5b757fa9-b270-4671-8c23-7ff9f30c5346");
    _Verifyregistrationaddress.Click_Full_Accounts();
    

    }

}
