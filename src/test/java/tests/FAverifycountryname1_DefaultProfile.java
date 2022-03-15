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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/3e20577b-1030-4e4b-8676-96781162890a
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 845, profileId = 100724)
public class FAverifycountryname1_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"FAverifycountryname1","FAverifycountryname1 - Default Profile"})
    @TestModellerPath(guid = "43d35be5-e658-4482-86ef-b5f9ec8bcd69")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterSearcha() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="FAverifycountryname1_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
    	
        pages.FAverifycountryname1 _FAverifycountryname1 = new pages.FAverifycountryname1(driver);
    TestModellerLogger.SetLastNodeGuid("2d7a6d7c-a914-4975-99dd-78178489ab5e");
    _FAverifycountryname1.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8acac447-0a03-4511-a237-7ac3bd50160f");
    _FAverifycountryname1.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("96b810ef-05d2-4a00-8bd4-01ed615c616d");
    _FAverifycountryname1.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("db120303-f6d8-4675-86dc-e7150ba356f9");
    _FAverifycountryname1.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("14c05acc-11ed-4ba2-bce3-9480346f8328");
    _FAverifycountryname1.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("06c361c5-00e7-4027-9a4a-8f7503471abc");
    _FAverifycountryname1.Enter_Searchagentname(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("fff0c0e2-95c8-4a16-afd3-a6f1858853b5");
    _FAverifycountryname1.Click_Searchbutton1();
    

    TestModellerLogger.SetLastNodeGuid("2f03e25b-21c9-4dd5-9f7c-a519a1117a33");
    _FAverifycountryname1.Click_AgentName();
    
    TestModellerLogger.SetLastNodeGuid("20028bd5-9f36-4aa6-b0b9-be63f72c8823");
    _FAverifycountryname1.Click__Clients_();

    TestModellerLogger.SetLastNodeGuid("5fadc530-6618-4110-a127-b35b8a90dd72");
    _FAverifycountryname1.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("21137239-6a20-4e45-910d-d06535379ced");
    _FAverifycountryname1.Select_Companytype("LLP");
    

    TestModellerLogger.SetLastNodeGuid("37e86862-97eb-4c31-9d0d-445313e24a2b");
    _FAverifycountryname1.Click_Searchbutton2();
    

    TestModellerLogger.SetLastNodeGuid("fa4ebbfb-b19b-41f3-9e88-0cb0c8cd32c9");
    _FAverifycountryname1.Click_Companyname();
    

    TestModellerLogger.SetLastNodeGuid("4bdbf3b2-b76e-4e1f-bda0-4cf87230beeb");
    _FAverifycountryname1.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("e8b560b7-c4d8-4e8a-a455-e59d1edfaaa9");
    _FAverifycountryname1.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("8f9707bd-c49e-419f-b0dc-a6fb2a05a359");
    _FAverifycountryname1.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("6b96a280-6b41-4e04-8a05-4c83000be8ff");
    _FAverifycountryname1.Enter_ContainerTbGeneraltxtRegNo(sData[26]);
    

    TestModellerLogger.SetLastNodeGuid("5d420e95-d54b-45e1-8722-a2b825b498ca");
    _FAverifycountryname1.Enter_ContainerTbGeneraltxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("13513a2c-c263-4f26-993f-c9154474dc57");
    _FAverifycountryname1.Enter_ContainerTbGeneraltxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("566eecbd-4a0d-434b-afa9-b17037623acf");
    _FAverifycountryname1.Enter_ContainerTbGeneraltxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("6b428f99-4a23-4ba0-ae26-c28a7511c092");
    _FAverifycountryname1.Enter_ContainerTbGeneraltxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("81793081-6556-4648-bcb5-fb48cfa8dfa3");
    _FAverifycountryname1.Enter_ContainerTbGeneraltxtPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("6ccd6aaf-f372-4971-9cc2-7321ff8e06a7");
    _FAverifycountryname1.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("b89894ab-bb57-4844-948e-553f1a403dfa");
    _FAverifycountryname1.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c0899f20-c428-4502-b64d-015524c77d61");
    _FAverifycountryname1.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("8e7fb300-08c1-4c53-a332-c4472e3a0f00");
    _FAverifycountryname1.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("bf064898-600c-4121-85b6-d8a006cbe8f7");
    _FAverifycountryname1.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("fdbe3f3f-9a02-491f-81fe-430540b5a5f3");
    _FAverifycountryname1.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("442ff0c9-7588-4213-8d3a-516dc5ac6179");
    _FAverifycountryname1.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("969ef6f1-31fa-471f-830a-251c6e00bcb8");
    _FAverifycountryname1.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("0fe90b59-e67e-4546-8b72-cb030c47f26d");
     _FAverifycountryname1.Click_Full_Accounts();
    

    }

}
