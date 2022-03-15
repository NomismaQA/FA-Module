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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/1b849f07-d8a5-4cd2-b60b-0679668e9fc1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 946, profileId = 100840)
public class Verifyregistrationnoappearingoncoverpage_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verifyregistrationnoappearingoncoverpage","Verifyregistrationnoappearingoncoverpage - Default Profile"})
    @TestModellerPath(guid = "6ff2c65f-7ff0-4eb2-9443-4a254edd8691")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassPositiveEnterctl00cPHFiltertxtAge() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyregistrationnoappearingoncoverpage_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verifyregistrationnoappearingoncoverpage _Verifyregistrationnoappearingoncoverpage = new pages.Verifyregistrationnoappearingoncoverpage(driver);
    TestModellerLogger.SetLastNodeGuid("7a099d74-0cf7-40bc-8a3a-31d7d53e2528");
    _Verifyregistrationnoappearingoncoverpage.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c6e30dfb-3df0-4100-90d1-c603a05fa70c");
    _Verifyregistrationnoappearingoncoverpage.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("5af6d305-ce88-469a-a1fa-1467605aac87");
    _Verifyregistrationnoappearingoncoverpage.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("7ed40b1b-57a6-4a67-8a02-3d1ee8e97f51");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHpass(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("7ed40b1b-57a6-4a67-8a02-3d1ee8e97f51");
    _Verifyregistrationnoappearingoncoverpage.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("c148ae54-b1a9-4c3b-b3d9-a65e6eb1c2c9");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("ccc998a6-5fbd-4dec-b5e9-a9a706c2e987");
    _Verifyregistrationnoappearingoncoverpage.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2beff462-a4c0-4fe4-b304-61967509c213");
    _Verifyregistrationnoappearingoncoverpage.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("20028bd5-9f36-4aa6-b0b9-be63f72c8823");
    _Verifyregistrationnoappearingoncoverpage.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("c74d7674-5349-4718-868f-4b9c3c2865b1");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f15f6ddf-0dec-4191-b421-6b0cbb80ca4d");
    _Verifyregistrationnoappearingoncoverpage.Select_ctl00ctl00ParentContentcPHFilterddlType(sData[5]);
    

    TestModellerLogger.SetLastNodeGuid("f398c314-a6e4-4357-a1a2-ab93f4e04043");
    _Verifyregistrationnoappearingoncoverpage.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("086ca4ce-95d1-49a4-8488-da478e7a6705");
    _Verifyregistrationnoappearingoncoverpage.Click__Test_Demo1_();
    

    TestModellerLogger.SetLastNodeGuid("29aae89b-9873-4fc3-937b-137c6d979b68");
    _Verifyregistrationnoappearingoncoverpage.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("8b54f94c-6879-498a-93e4-776bb47c5f22");
    _Verifyregistrationnoappearingoncoverpage.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("5842e7b1-345d-4f62-9fb0-9773d2439f3d");
    _Verifyregistrationnoappearingoncoverpage.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("aa45af9d-ef79-43d5-b1b9-0e59fe4dd415");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("a9969911-f4fd-42a4-b43e-9b7a1dbc591e");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("4a77140d-0d17-4fa6-a900-22e4fd9c4b98");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("e5739a06-17cb-41c8-b43d-257f481e2317");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("59f125cd-67c5-4058-9b5a-af9423ff8a61");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("60efc296-0ce9-4076-9b8f-45c430a08ce1");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("7091dfdb-3c4e-4080-9f6c-742057f9aa5b");
    _Verifyregistrationnoappearingoncoverpage.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("b9956a6e-2573-4c65-aa44-a29c7e88364f");
    _Verifyregistrationnoappearingoncoverpage.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("5d4212b4-eb58-4e73-802f-396695e729ac");
    _Verifyregistrationnoappearingoncoverpage.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("0a082056-97ab-4ff9-a8ce-e07276e628cc");
    _Verifyregistrationnoappearingoncoverpage.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4880bd04-4748-4cf1-a3c9-834892daed41");
    _Verifyregistrationnoappearingoncoverpage.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("15cd7641-a24b-42d2-8887-43652b77ce35");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("18704eea-3477-4f75-a7c1-171cd3dade60");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("b4111de9-6c6d-4ff9-88c4-8e335af65f92");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtxtCTdistrict(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("7ae64dea-9431-4a22-aab4-b2f6e3f5b335");
    _Verifyregistrationnoappearingoncoverpage.Enter_ctl00cPHtxtCTutr(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("aeb4fa8c-c2c5-40b0-a17c-46ac897382b2");
    _Verifyregistrationnoappearingoncoverpage.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("e63bd1da-f60f-4620-b4e1-263a9973e7cc");
    _Verifyregistrationnoappearingoncoverpage.Select_ctl00cPHddlAccountantReportFormat("Default");
  
    
    TestModellerLogger.SetLastNodeGuid("c4ecf226-258c-4c80-93ab-d39017c35e83");
    _Verifyregistrationnoappearingoncoverpage.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("3976c846-b6d2-4674-8176-1f601e8e5119");
    _Verifyregistrationnoappearingoncoverpage.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5b51b1e1-a3bf-4a07-a3ff-94000899b4be");
    _Verifyregistrationnoappearingoncoverpage.Click_Full_Accounts();
    

    }

}
