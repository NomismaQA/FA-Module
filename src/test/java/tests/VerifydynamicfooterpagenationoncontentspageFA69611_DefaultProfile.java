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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/440e23d5-9753-4002-92b2-24cfa19ff014
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1179, profileId = 101068)
public class VerifydynamicfooterpagenationoncontentspageFA69611_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_dynamic_footer_pagenation_on_contents_pageFA69611","Verify_dynamic_footer_pagenation_on_contents_pageFA69611 - Default Profile"})
    @TestModellerPath(guid = "0cb0107c-eb6f-4dc9-a0b0-0c3edf20ed65")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydynamicfooterpagenationoncontentspageFA69611_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_dynamic_footer_pagenation_on_contents_pageFA69611 _Verify_dynamic_footer_pagenation_on_contents_pageFA69611 = new pages.Verify_dynamic_footer_pagenation_on_contents_pageFA69611(driver);
    TestModellerLogger.SetLastNodeGuid("106d9f61-de0b-4c92-96a0-1148eae090bf");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("9f5b1a77-3b7e-4a98-85eb-18764f2f41ca");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("aac107ce-08f1-40b0-8568-33a38e4a0914");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("8360e6cb-28a5-4772-a81b-a29afe641ebd");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("3a36abc6-c4cb-429b-bd41-7bb0f198906b");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d4bbd6e6-3480-4682-b008-a9172feccc46");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("25309625-c3d2-4e1f-bbbd-156cd268f9d3");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("69d57f8b-1e91-451c-9c80-4ad9cd982afe");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("77512c56-e02f-4166-b10d-81be42ebad00");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("2b616730-599f-4b07-a51a-b7771ea7a248");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("df18ab18-cf0e-4b17-8419-6407902f57c7");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("21d416b3-471c-4e74-8e3e-7881782c4371");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("db4176ff-0ed9-4ff3-a98c-229e93babf9d");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("055b0227-ce87-465a-bbb3-8095fadbd683");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("b22a7fbb-49dd-4e81-b09e-179e87eb48c5");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("5bf63343-938f-4c83-82eb-562097507bdf");
    _Verify_dynamic_footer_pagenation_on_contents_pageFA69611.Click_Full_Accounts();
    

    }

}
