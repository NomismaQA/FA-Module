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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/001011d5-4559-4b0c-b37a-4a56c4588ba6
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 813, profileId = 100702)
public class Accountsettings1201_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Accountsettings1201","Accountsettings1201 - Default Profile"})
    @TestModellerPath(guid = "277f55e6-a98a-4e1a-b67a-14d90ff2bc65")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Accountsettings1201_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
    	
        pages.Accountsettings1201 _Accountsettings1201 = new pages.Accountsettings1201(driver);
    TestModellerLogger.SetLastNodeGuid("c7df7082-9a9a-4087-bf17-38523c662b64");
    _Accountsettings1201.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9fd6a475-740b-452c-84ba-54b8a1baec5a");
    _Accountsettings1201.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e5107160-9b80-410a-8ff4-42e83893b8c1");
    _Accountsettings1201.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("4423d929-6fa0-4bcb-ae29-7c543167dbef");
    _Accountsettings1201.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("b69622c8-eb80-49e1-bc04-cf5efdb245ce");
    _Accountsettings1201.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("c74cec2f-b89d-4f34-bb93-d712c9d39e67");
    _Accountsettings1201.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("7918f8a4-2879-4182-afdb-5fe78b08a1d6");
    _Accountsettings1201.Enter_SearchAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("53b4e4e5-f0dd-4814-ab9a-ed433f0714b0");
    _Accountsettings1201.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("98957f95-5e91-4d9b-b9ab-2a7b1f147a23");
    _Accountsettings1201.Click_AgentName();
    

    TestModellerLogger.SetLastNodeGuid("1d02d17a-38b5-44aa-9ad4-c15b81d41a2b");
    _Accountsettings1201.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("e621a55f-6a6c-4614-9472-ac431dfc5a69");
    _Accountsettings1201.Enter_Searchclientname(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("dcd93500-9cf2-47ec-9361-5e67601b438a");
    _Accountsettings1201.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("45c7dea5-3780-423c-9b71-580218e244c7");
    _Accountsettings1201.Enter_Searchclientname(sData[5]);
    

//    TestModellerLogger.SetLastNodeGuid("83f60f8b-d091-43fd-8845-9393250ff128");
//    _Accountsettings1201.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("4c488d8d-fa93-404f-a729-39695633d700");
    _Accountsettings1201.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("04bfd2fa-ecb9-4342-bb37-f46b240b4679");
    _Accountsettings1201.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("567ed36a-2767-4acb-835e-689a38b63cfb");
    _Accountsettings1201.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("d8a925f0-49ee-43d5-96ed-0f832054fcba");
    _Accountsettings1201.Enter_Principalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("bbc1ae97-4ab2-41a0-9be4-bebe37e06d6c");
    _Accountsettings1201.Enter_Authenticationcode(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("6a4dfa06-4a40-4c2b-b234-6eb441ce030d");
    _Accountsettings1201.Enter_CTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("d5bf0c7b-e227-4aaa-8536-110731669ca5");
    _Accountsettings1201.Enter_CTUTR(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("8f4571b8-9e5c-47d7-9cf6-eb9dee1929b1");
    _Accountsettings1201.Enter_CompanySecretary(sData[20]);
    

    TestModellerLogger.SetLastNodeGuid("0a8a6792-262c-49fd-90a1-0c51db521bb7");
    _Accountsettings1201.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("f342a799-1265-483f-b659-29d82db70f7a");
    _Accountsettings1201.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("f06da4a0-1b7d-4806-b391-9b222e51673e");
    _Accountsettings1201.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("e7bd9fdf-89aa-44ca-9c75-da31a5f02e92");
    _Accountsettings1201.Click_IncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("ba6de222-09d7-4b35-9ebf-b684b7da5e67");
    _Accountsettings1201.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("07813876-1d56-4d64-a768-0e241815d7ae");
    _Accountsettings1201.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("8a9d9215-6a20-4269-9cf5-2dddd077dd3f");
    _Accountsettings1201.Select_Frs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("df3d203e-87e9-40c6-a7fd-ee8658ec1534");
    _Accountsettings1201.Select_Frs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("71371a89-71cc-42d8-a478-f8f0c3f51e08");
    _Accountsettings1201.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("ff863c47-10e6-4e95-ba0d-039515072dc0");
    _Accountsettings1201.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("b7059baf-fbd0-43a5-9e65-afe1643489f5");
    _Accountsettings1201.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("c7a80fe3-4758-4587-b311-0dc8b5e445db");
    _Accountsettings1201.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("4ca62086-facb-4a87-8b83-d08bdaef870f");
    _Accountsettings1201.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("4cd19fea-2d34-4b97-ae6e-91d5327310bd");
    _Accountsettings1201.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("e0a876c8-f381-426f-b33f-2c2ecd75f229");
    _Accountsettings1201.Click_SaveButton();
    

    }

}
