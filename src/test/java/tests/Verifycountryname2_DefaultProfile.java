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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d8aabdfd-41fa-4c2c-82dd-0129ef2108ec
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 852, profileId = 100729)
public class Verifycountryname2_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifycountryname2","Verifycountryname2 - Default Profile"})
    @TestModellerPath(guid = "37a1329b-8428-486f-a344-d32a484c0c93")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterSearchA() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifycountryname2_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verifycountryname2 _Verifycountryname2 = new pages.Verifycountryname2(driver);
    TestModellerLogger.SetLastNodeGuid("907a5df3-c34a-4d02-91bd-bd52299c14ba");
    _Verifycountryname2.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("6967e595-adac-4599-b557-2e1707a136c2");
    _Verifycountryname2.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("d55bae3a-7e93-4d38-83a3-3b55705c4eeb");
    _Verifycountryname2.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("bbb0759a-57b4-4555-9ddb-ac1aaacc9f27");
    _Verifycountryname2.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("4d695305-cc23-4946-8c3f-656f898e8b3d");
    _Verifycountryname2.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("c3c2648b-5fc3-4839-9112-8d504a1c9b49");
    _Verifycountryname2.Enter_SearchAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("5986c026-29e8-4019-91c0-e6c4122141da");
    _Verifycountryname2.Click_Searchbutton1();
    

    TestModellerLogger.SetLastNodeGuid("761191df-8c03-48e8-a14e-ab19db3b33df");
    _Verifycountryname2.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("80c02b6e-8893-414d-b8ca-4646d6aa23e4");
    _Verifycountryname2.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("25d42373-162c-4ad2-aed9-fe19977d9ba3");
    _Verifycountryname2.Enter_Searchcompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("a2bb2da4-c761-44b8-aa30-b1128f39d103");
    _Verifycountryname2.Select_CompanyType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("94908006-96f0-4df6-9e80-9e3a6cdb905a");
    _Verifycountryname2.Click_Searchbutton2();
    

    TestModellerLogger.SetLastNodeGuid("35e945eb-34f9-48bb-9473-4f531db22469");
    _Verifycountryname2.Click__Friends_Test_Company();
    

    TestModellerLogger.SetLastNodeGuid("b700ccca-7c70-4085-80c7-dee6a7afa852");
    _Verifycountryname2.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("cbe820c1-b0f0-4ae8-aa9d-29cd8644e7e9");
    _Verifycountryname2.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("f61e74be-ab90-4289-9b45-e4b24d687009");
    _Verifycountryname2.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("40be2776-532b-471f-9f1d-7a0aea27c0ee");
    _Verifycountryname2.Enter_ContainerTbGeneraltxtRegNo("NI121212");
    

    TestModellerLogger.SetLastNodeGuid("2c807fc1-0de2-4a96-a043-d88602fc85d0");
    _Verifycountryname2.Enter_ContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("5c6871c5-029f-4421-8c27-d9671d4e2e9f");
    _Verifycountryname2.Enter_ContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("21ce7b60-e24d-48fc-99e3-44206f268482");
    _Verifycountryname2.Enter_ContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("52b65eac-9386-4b3a-b676-cc820ebad0e2");
    _Verifycountryname2.Enter_ContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("2ca5e1c3-4731-4682-8d46-14b67f7cdc40");
    _Verifycountryname2.Enter_ContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("ceec5304-f8ab-4890-939d-450783e1f4ab");
    _Verifycountryname2.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("258d4636-c38f-4045-ba8f-f68a695d1cfa");
    _Verifycountryname2.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b00080a6-5f4e-482a-8ad8-bd1e9b856557");
    _Verifycountryname2.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("500b766b-8af5-4e4d-a9f3-aa183f4f1f91");
    _Verifycountryname2.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("9ca7106c-4010-42df-b27e-f45d96662aba");
    _Verifycountryname2.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("91c4ac09-3567-4212-b981-bfc176a0850c");
    _Verifycountryname2.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("38236f9b-14ff-4082-92f8-bf8dca27f2da");
    _Verifycountryname2.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("e96a5d9e-6900-483d-a98e-cb41326b0a5f");
    _Verifycountryname2.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("4d4d42b6-53c3-4967-8930-30c0abad1ecb");
    _Verifycountryname2.Click_Full_Accounts();
    

    }

}
