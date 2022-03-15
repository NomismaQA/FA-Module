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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/f3889096-7833-49fa-9d84-22c8b14afdb1
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1345, profileId = 101212)
public class VerifyreporttitlenameoncoverpageFA6973_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_report_titlename_on_cover_pageFA6973","Verify_report_titlename_on_cover_pageFA6973 - Default Profile"})
    @TestModellerPath(guid = "55791b42-5905-404e-aeb6-c37d109cb424")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordPositiveEnterAgentNameClickSearchbut() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyreporttitlenameoncoverpageFA6973_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_report_titlename_on_cover_pageFA6973 _Verify_report_titlename_on_cover_pageFA6973 = new pages.Verify_report_titlename_on_cover_pageFA6973(driver);
    TestModellerLogger.SetLastNodeGuid("fff5d5e2-1419-42f7-beba-3fe88de2635f");
    _Verify_report_titlename_on_cover_pageFA6973.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("15b913ea-6307-4e2c-81f8-56b3afc393df");
    _Verify_report_titlename_on_cover_pageFA6973.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ccf70c27-691c-499d-ba07-fa430bbe8989");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("2176bb27-92fa-47c3-979c-363c4a3bf3e2");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_Password(sData[2]);
    
    TestModellerLogger.SetLastNodeGuid("ab6853e2-f466-4695-831b-b7c929afc906");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("04dd574d-fccb-4db0-a188-3fb34ed7d8ac");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("1c51c080-9480-48bf-997f-294ffa6ddda0");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("ad849082-6c69-438f-bb1b-1e5d1070d22d");
    _Verify_report_titlename_on_cover_pageFA6973.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("fd9a3ddc-f17a-4ef5-aff4-9ad5d00d56c8");
    _Verify_report_titlename_on_cover_pageFA6973.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("ecd4341e-719b-42f9-9456-f27df77eef71");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("f30f3d79-51fb-411b-a307-120cc5c4fa31");
    _Verify_report_titlename_on_cover_pageFA6973.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("70de6aae-23f1-4635-b9b3-8d872b626dd9");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("de7aa370-3bc2-40f0-96a2-470d2bc32047");
    _Verify_report_titlename_on_cover_pageFA6973.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("83e89d08-f49c-4983-82b7-af9fa2722492");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("11b51c3c-d9f0-4ae6-a488-bfaf77e7e97c");
    _Verify_report_titlename_on_cover_pageFA6973.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("ff7f6700-047d-4436-8b92-3570027e6e6b");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Edit1();
    
    TestModellerLogger.SetLastNodeGuid("56b98aaf-7b2a-4624-ac03-eaef1d7f9538");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_ctl00cPHtbContainerTbGeneraltxtCompanyName("ABC LTD");
    

    TestModellerLogger.SetLastNodeGuid("41f5e869-5749-43ef-ac8e-6f45a290f4c2");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_Address1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("a0de2165-e9d3-4fbe-82cb-7e3c6362d0a8");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_Address2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("1cb8810b-189e-46a5-b33d-d072de96f3b9");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_Address3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("c237ab22-2dde-47a3-958b-1d0d0eb50f2f");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_Address4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("71b1b977-7185-486a-b449-fbec06b0c101");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_PostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("b600c650-b34b-4799-b4a9-83e1e3fc8fc6");
    _Verify_report_titlename_on_cover_pageFA6973.Enter_RegNo(sData[7]);
    

    TestModellerLogger.SetLastNodeGuid("896ef126-aa4b-4b85-919e-fbfb29fd0725");
    _Verify_report_titlename_on_cover_pageFA6973.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("6a5bb401-a882-4236-a3c2-1f6f1a3a037f");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("84c85d55-cc73-4eec-9498-0458d62ce106");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("0edfce5d-9d07-4870-81b9-8cc53c796717");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ae236f04-5f8d-4405-b831-f545e8b9eb97");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("f66c8186-df75-4bea-a5a1-bf7f3a4d5625");
    _Verify_report_titlename_on_cover_pageFA6973.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("c0c2e015-9dde-434a-9412-7b57b99466eb");
    _Verify_report_titlename_on_cover_pageFA6973.Click_PositionsLeft();
    

    TestModellerLogger.SetLastNodeGuid("fa954b67-44dd-4ec2-a8d2-db22a8a924cd");
    _Verify_report_titlename_on_cover_pageFA6973.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("2032c148-5b66-4746-b6fd-d1cc01430ab8");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("138bae4a-ad7c-49e5-a882-948e897225d5");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("8dbac7e3-f360-4636-bd8d-4bd41629acb4");
    _Verify_report_titlename_on_cover_pageFA6973.Click_Filleted_Accounts();
    

    }

}
