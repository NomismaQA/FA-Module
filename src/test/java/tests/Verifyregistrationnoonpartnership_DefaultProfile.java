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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/331dc260-8ea2-4624-bc72-baba59402b73
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 870, profileId = 100749)
public class Verifyregistrationnoonpartnership_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifyregistrationnoonpartnership","Verifyregistrationnoonpartnership - Default Profile"})
    @TestModellerPath(guid = "9f5d9367-c9eb-4f99-bb2e-2a82afcdb2ad")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginPositiveEnterctl00cPHFilte() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyregistrationnoonpartnership_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
    	
    	
        pages.Verifyregistrationnoonpartnership _Verifyregistrationnoonpartnership = new pages.Verifyregistrationnoonpartnership(driver);
    TestModellerLogger.SetLastNodeGuid("f9a74ee4-d274-412f-8777-d644570c2875");
    _Verifyregistrationnoonpartnership.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("94f25f94-4c94-49a5-aeee-c431d57cd520");
    _Verifyregistrationnoonpartnership.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("8f1ee049-f5ca-4fb3-86e2-c965de5d4f0a");
    _Verifyregistrationnoonpartnership.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("0ac4878a-40f8-46eb-9719-74a0f05df301");
    _Verifyregistrationnoonpartnership.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("9e1721a7-4783-4681-b5ad-169068333da0");
    _Verifyregistrationnoonpartnership.Click_Login();
    

    TestModellerLogger.SetLastNodeGuid("7ac0e12d-3173-4efc-b55a-2835e7ea721b");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("639fa984-0284-479b-888b-0575c2205649");
    _Verifyregistrationnoonpartnership.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("564af9d1-32a5-423a-8744-107a0300a170");
    _Verifyregistrationnoonpartnership.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ba2d0dc8-feac-4d94-beb6-13cc5531df81");
    _Verifyregistrationnoonpartnership.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("b4416b05-a5e3-46ff-97a3-f881541629c3");
    _Verifyregistrationnoonpartnership.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("1bbc587b-94aa-4d91-9ec0-69f4fc3d73c5");
    _Verifyregistrationnoonpartnership.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("22b8eea3-f249-4ef5-a1a2-07c90d42a7f8");
    _Verifyregistrationnoonpartnership.Click_Search_button();
    

    TestModellerLogger.SetLastNodeGuid("6318e6b4-13b6-4c32-b441-9f91c8247e1d");
    _Verifyregistrationnoonpartnership.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("e72a1473-c02a-4952-b34f-30bb1be7bf91");
    _Verifyregistrationnoonpartnership.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("4ef62c1f-27c0-4ba7-9957-733661818ca9");
    _Verifyregistrationnoonpartnership.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("d22c528a-4cba-4e23-8068-26f3bc3f7287");
    _Verifyregistrationnoonpartnership.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("e8143a9b-29d6-4933-baac-e67960d23f95");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo("OC121212");
    

    TestModellerLogger.SetLastNodeGuid("c6f750eb-b8a9-47c3-a977-a0bcb2625100");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1("5121 Korey Isle, Connland, French Guiana");
    

    TestModellerLogger.SetLastNodeGuid("bb25bcb2-f4eb-47cf-8bf0-656e0c67006a");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2("7049 Franecki Brooks, North Nannie, Morocco");
    

    TestModellerLogger.SetLastNodeGuid("109e00d4-7c6e-414c-a514-a1c972e883ed");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3("89285 Trantow Harbors, Justynside, Norfolk Island");
    

    TestModellerLogger.SetLastNodeGuid("adec7f82-99d3-4ebf-8639-80a030f4b10f");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4("24099 Volkman Bridge, Port Sabrina, Northern Mariana Islands");
    

    TestModellerLogger.SetLastNodeGuid("65583ab9-847b-404f-9d8e-ca39f9abf62a");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode("WC2N 5DU");
    

    TestModellerLogger.SetLastNodeGuid("c39ca075-19e9-4656-835a-ed8f41c8549c");
    _Verifyregistrationnoonpartnership.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("e7ab68e1-4cb0-4e38-970c-e01ca8049713");
    _Verifyregistrationnoonpartnership.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8e944adc-5750-464b-b4e7-91aba9954821");
    _Verifyregistrationnoonpartnership.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("4ff355f8-20b0-446e-a826-65dc55af1cf8");
    _Verifyregistrationnoonpartnership.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("b634e1c1-0ffa-4f9a-a1b6-1bb216d19ea8");
    _Verifyregistrationnoonpartnership.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("16cbf9c3-69ef-4b40-a11a-d33389c51686");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("7819d032-1e99-4f2c-a297-e16b5de07484");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("843af3a2-b0a2-46ab-9430-8e844c0bc9b4");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("d1ac96c7-3d5a-481c-8320-84e805d2216f");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("cbb6a711-708a-47a5-a8cc-552e16f3f302");
    _Verifyregistrationnoonpartnership.Enter_ctl00cPHtxtCompanySecretary("Kiehn Group");
    

    TestModellerLogger.SetLastNodeGuid("0961e816-e6e2-4bd2-8534-081f43913617");
    _Verifyregistrationnoonpartnership.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("66a625d0-3bf8-4206-98d5-ee8bffac08c6");
    _Verifyregistrationnoonpartnership.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("db0b169b-e81f-4d5d-865d-c956119080ac");
    _Verifyregistrationnoonpartnership.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("818894cc-65f7-4283-aa0c-692b189cb24f");
    _Verifyregistrationnoonpartnership.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("c0a3721b-fb5c-40ee-8be6-d715b5189cdb");
    _Verifyregistrationnoonpartnership.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("9372bd75-4b77-40e4-888a-a93028b2ce8e");
    _Verifyregistrationnoonpartnership.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("8ef6949e-b6c8-460f-8d7c-f553ed15d753");
    _Verifyregistrationnoonpartnership.Click_Full_Accounts();
    

    }

}
