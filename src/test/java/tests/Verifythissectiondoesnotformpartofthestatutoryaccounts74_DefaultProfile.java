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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/532c61d5-7c87-4468-ba91-7ed8a5e9edd9
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1037, profileId = 100939)
public class Verifythissectiondoesnotformpartofthestatutoryaccounts74_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifythissectiondoesnotformpartofthestatutoryaccounts74_DefaultProfile"})
    @TestModellerPath(guid = "f6acbdd0-13cb-4a45-90c5-80f6900281d7")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifythissectiondoesnotformpartofthestatutoryaccounts74_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_this_section_does_not_form_part_of_the_statutory_accounts74 _Verify_this_section_does_not_form_part_of_the_statutory_accounts74 = new pages.Verify_this_section_does_not_form_part_of_the_statutory_accounts74(driver);
    TestModellerLogger.SetLastNodeGuid("f4080337-c960-41f9-93a6-4d0853f29ba2");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("1e4bf9d3-315b-41bb-9a02-00444bf15cbc");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("ded362af-9ae9-4704-b508-2f11e630de02");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c2130390-b228-4bd1-8123-7ca4858b7096");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("11eaa452-5322-4f29-8448-e05862d1979d");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("7a02b7c2-01b4-46ac-9ea8-0d329f05927d");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("7fa92fbe-647a-46d6-8ff7-60f5d6f5e2aa");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("3d2d8e39-32ff-4185-9a7d-eb6d15a0828d");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("5d723698-3a20-4693-89f3-9cbe6e549525");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click__Clients_();
    
    TestModellerLogger.SetLastNodeGuid("c74d7674-5349-4718-868f-4b9c3c2865b1");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("b516c6a1-f064-4908-a3ad-94e78f024042");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("2dc6bfc4-4f81-4bf7-9f47-93152c778b9d");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Search_button2();
    
    TestModellerLogger.SetLastNodeGuid("086ca4ce-95d1-49a4-8488-da478e7a6705");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click__ABC_LLP_();

    TestModellerLogger.SetLastNodeGuid("1507bd00-cde2-4e39-b0db-c14e26e6665d");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("c4a7fceb-59b9-4a04-a088-494820fb3150");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("7e430ab9-e084-4a64-8b21-7d1eb25671e2");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("403885a9-8fe9-406f-b1d8-d67e24c125bc");
    _Verify_this_section_does_not_form_part_of_the_statutory_accounts74.Click_Detailed_Income_Statement();
    

    }

}
