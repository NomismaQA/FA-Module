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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/16e27e23-a09c-4f6a-baa8-7cde2cda8521
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1112, profileId = 101008)
public class VerifymemberswhoservedduringtheyearappearingonPartnershipInformationpage16_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16","Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16 - Default Profile"})
    @TestModellerPath(guid = "a62f69d6-7ff6-4f76-8356-55c155acba39")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifymemberswhoservedduringtheyearappearingonPartnershipInformationpage16_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16 _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16 = new pages.Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16(driver);
    TestModellerLogger.SetLastNodeGuid("4621df66-11f7-4750-a21c-f23af08f8ce8");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("ae2a5046-3409-452a-a49c-221a74c84325");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("3aa2f324-1058-45ee-b900-01789dfd18b0");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("e7c56782-a2b6-43bf-ab9a-986649c0bcaf");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("dea04005-f444-46b5-8dd3-cb73b669db77");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("efc8ee45-af70-4c25-88c3-23761984f40a");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("636463d3-6bb0-4745-9521-9bea451adcd8");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("b2fe43f7-dd25-41bf-a545-a848c61c1a28");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("ba6e02a9-ed3e-424e-b439-fda32753326f");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("9dcb7fa2-8bc5-4b9b-b5d8-99eadf2b36a9");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("a6e1fbf8-7fa6-45b9-8eb1-4f1710996f7e");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("a8bd1217-8334-459f-99af-77133737f909");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("f20f1b6b-d8b1-49a4-92e5-24469a428e75");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("b7c16108-2ad0-4da4-87ba-9c8a0df8e295");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("29bf2e79-2c5c-481d-b694-bd0b255ba704");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("47f3ee87-a067-4aa5-99db-a43cff45e5e1");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Members();
    

    TestModellerLogger.SetLastNodeGuid("b50361b1-196d-4a38-8e31-ad64046e804a");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Add_Members();
    

    TestModellerLogger.SetLastNodeGuid("4945fc5e-2c26-48e4-b63b-85827aed93b9");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtFirstName(sData[29]);
    

    TestModellerLogger.SetLastNodeGuid("f44fe449-abe1-4dc4-9b70-e15348f8e1a7");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtLastName(sData[30]);
    

    TestModellerLogger.SetLastNodeGuid("14b4e23f-0f8a-4578-9b1b-b474825828e9");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtPersonJoiningDate(sData[35]);
    

    TestModellerLogger.SetLastNodeGuid("4ea18efe-d16d-4177-82f5-6380f8c83eeb");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress11(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("a28c2a6d-7d59-4d92-934e-c5e09c194fbb");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress12(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("470c738f-4426-459b-8c59-069b4a2642b9");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress13(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("c663a4b1-aa53-47c5-aeb3-93507492d4d3");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("9d7afe40-0e70-4ef0-b326-e77086700363");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtPostCode1(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("f3276100-2554-42cb-a1de-35be6a064f93");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("2a4ecb6c-6788-4785-90ff-37eefd762294");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("af7ec414-4ba5-4ed1-9b62-02c2b4489994");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Settings2();
    

    TestModellerLogger.SetLastNodeGuid("24e8f57f-4234-4f68-a5a5-1b342ff93098");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("2b99e1b9-5fb3-435d-80a5-d1cb5398214e");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("6c9ce830-0751-4045-9434-d0b6cac3e5a1");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("b1cbabbb-a459-405d-bf13-82aff67c1004");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("e093bf39-0ee1-429d-9230-54b0233a595a");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("70f862b0-fe27-4991-8206-a64bf2e911ac");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("22223716-2768-4f25-ba64-107013c02b38");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("6ad305ca-6d06-49e0-a1a9-4755771ca0a2");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c75e5796-6f84-4aee-a1e1-a2e206264482");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("0e593553-b047-4eb3-9f6f-d2d885c2c4ee");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress21(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("cd4ab166-1668-4251-b2a8-e608f308785c");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress22(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("252e9dee-a482-41c3-95b2-5e9cce025638");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress23(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("da6ba031-fad1-4510-8df4-1c09e39cc015");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtAddress24(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("87b3b3b5-6922-4767-8129-bf066031231a");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Enter_ctl00cPHtxtRegFAPostCode2(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("954fe4d9-43c2-44bb-8e5c-1cfc6bb0b3c4");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("b7c0245d-4e10-4e79-9876-9274bda971e3");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Final_Accounts2();
    
    TestModellerLogger.SetLastNodeGuid("0382e8b5-3b72-41f8-99a1-e1ca8f2b4346");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Full_Accounts();
    
    TestModellerLogger.SetLastNodeGuid("eb929087-a876-4265-a96c-36fa7498afae");
    _Verify_members_who_served_during_the_year_appearing_on_Partnership_Information_page16.Click_Partnership_Information();
    

    }

}
