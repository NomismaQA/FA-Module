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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/7b5fd9fc-fc4a-47b8-8786-5e6c2323aeed
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 854, profileId = 100730)
public class Verifytitlereport_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifytitlereport","Verifytitlereport - Default Profile"})
    @TestModellerPath(guid = "155632d8-2268-4ae0-929b-b17a46a622a4")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterSearcha() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifytitlereport_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
		
        pages.Verifytitlereport _Verifytitlereport = new pages.Verifytitlereport(driver);
    TestModellerLogger.SetLastNodeGuid("27e06302-a30d-413e-bc91-be2c5d49c5ec");
    _Verifytitlereport.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("034f69b2-dae8-4be8-a1d1-2bcc6351060b");
    _Verifytitlereport.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("dbd79200-2acd-4883-a1d0-5501495428ea");
    _Verifytitlereport.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e12dd3b9-3f3f-48b5-bcc8-8db91c5cd348");
    _Verifytitlereport.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("58c6162e-ac29-42e1-83de-22a1e319d122");
    _Verifytitlereport.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("c7e023ea-fd2a-4e5a-82ae-1bde6353285f");
    _Verifytitlereport.Enter_Searchagentname(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("175a582b-4ce9-4140-82c9-df23d4c27bfd");
    _Verifytitlereport.Click_Searchbutton1();
    

    TestModellerLogger.SetLastNodeGuid("7fd86e8a-8f0d-49a9-80d3-bdfcc8d1d934");
    _Verifytitlereport.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("2f8e9439-52a7-4797-b050-583b111aeba5");
    _Verifytitlereport.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("186ea7d2-c1a0-4653-85a3-f8dbd5633bc6");
    _Verifytitlereport.Enter_Searchcompanyname(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("21137239-6a20-4e45-910d-d06535379ced");
    _Verifytitlereport.Select_Companytype("LLP");
    

    TestModellerLogger.SetLastNodeGuid("3bf755d6-576e-4cc6-83ec-1110415a5bd3");
    _Verifytitlereport.Click_Searchbutton2();
    

    TestModellerLogger.SetLastNodeGuid("d2351752-7dee-4368-b5be-0655b5e8bd00");
    _Verifytitlereport.Click_Companyname();
    

    TestModellerLogger.SetLastNodeGuid("3eedbda0-d681-4db2-8b6a-1bec7df1add6");
    _Verifytitlereport.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("0c889e2e-c8c4-47d4-8c2c-97444812e9d5");
    _Verifytitlereport.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("bc3dd8fa-faa3-43cb-8fc0-5b42eb3fa271");
    _Verifytitlereport.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("211a1ad6-b415-4eae-b1fb-b944522dd705");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtCompanyName(sData[27]);
    

    TestModellerLogger.SetLastNodeGuid("ae9b2c99-7282-4867-a90a-ad3bbb72fdd5");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtTradingName(sData[28]);
    

    TestModellerLogger.SetLastNodeGuid("9cc30b6c-20cb-4b0b-ac0f-f5c631e3cbab");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("1d707f92-6ce6-467a-b3db-d1ff0465442c");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("8571848b-0e93-4714-9a5b-fe424c309a88");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("f36b5a2a-f042-42e8-b54e-51979fb2340f");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("2993b6e7-3771-411b-bbc2-a2ac17d00e3f");
    _Verifytitlereport.Enter_ContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("e040b18b-4cf0-49f5-9e42-65185a6de151");
    _Verifytitlereport.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("0aee7997-4fbb-4f01-bf3e-c4bed76b47e0");
    _Verifytitlereport.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("fac8be3a-a677-45a7-a9c8-145672528ea1");
    _Verifytitlereport.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("4c819836-c155-4dc1-b24f-a0e5e1ccdb2e");
    _Verifytitlereport.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("3e4b0eed-5dda-471b-bc21-200d3e1994fc");
    _Verifytitlereport.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("f68b887f-1129-431f-8c61-2bdbc1aec6ef");
    _Verifytitlereport.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("ece672fc-f56d-4e98-b338-d4ff3b305708");
    _Verifytitlereport.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("6afe59e7-cb5b-4412-9031-ac6f27644aa8");
    _Verifytitlereport.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("4a2ec158-64f4-4780-bb90-355900f48dc9");
    _Verifytitlereport.Click_Full_Accounts();
    

    }

}
