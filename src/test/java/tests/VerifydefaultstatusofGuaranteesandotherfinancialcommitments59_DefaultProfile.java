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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/be29d103-9da6-48c2-bf74-c36d383873e5
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 940, profileId = 100832)
public class VerifydefaultstatusofGuaranteesandotherfinancialcommitments59_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    @Test  (groups= {"Verify_default_status_of_Guarantees_and_other_financial_commitments59","Verify_default_status_of_Guarantees_and_other_financial_commitments59 - Default Profile"})
    @TestModellerPath(guid = "fe5abd1e-616f-45fe-98aa-dd374def740f")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterctl00cPHpassClickLoginButtonPositiveEnterctl() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifydefaultstatusofGuaranteesandotherfinancialcommitments59_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_default_status_of_Guarantees_and_other_financial_commitments59 _Verify_default_status_of_Guarantees_and_other_financial_commitments59 = new pages.Verify_default_status_of_Guarantees_and_other_financial_commitments59(driver);
    TestModellerLogger.SetLastNodeGuid("aa1cae5b-2043-440d-a13a-b8f96bedac7d");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("2210783f-452d-4030-be0d-fb97cff7d8d2");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("e1676f17-17ee-42fc-990c-993ac596dd66");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("c1b3b098-7e1f-45d3-9642-97f0ca441831");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Enter_ctl00cPHpass(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("99dc03e1-d47b-4f90-be59-898c624369bc");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("fbb519a0-9f19-456b-84a9-41e6e947d044");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("f6e4965c-8602-49b6-86b3-c7676d1f92c7");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("999e5fdb-3651-45ce-bb99-30ff03dfdd86");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("43aa056f-391e-4b00-9863-b0ab2ae2d81d");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("8f0fed48-92f4-4778-b137-ca1a57ddec75");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("07515edd-e9ea-4da9-960f-dbeda22136ae");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("74a71ede-2a10-4754-83d5-30337cda1687");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("cbc98585-ec3a-40c3-ae36-a3be928497f0");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click__Test_Demo1();
    

    TestModellerLogger.SetLastNodeGuid("4716610e-d323-465a-bd65-358570206443");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8b93216f-e1af-4065-ab88-ce094bdd3fc9");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("b6230deb-8576-429a-8036-7142c7f4a74a");
    _Verify_default_status_of_Guarantees_and_other_financial_commitments59.Click_Full_Accounts();
    

    }

}
