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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/30b062e8-3568-4867-989a-d5dcd8433182
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1473, profileId = 101349)
public class VerifyCTAdjustmentsiseditableafterunlockingtheperiodFA7153_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;


    
    @Test  (groups= {"Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153","Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153 - Default Profile"})
    @TestModellerPath(guid = "be6710e1-dd74-4ad0-a0bf-bccf3e9adce0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyCTAdjustmentsiseditableafterunlockingtheperiodFA7153_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153 _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153 = new pages.Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153(driver);
    TestModellerLogger.SetLastNodeGuid("b42f85d7-822d-4c9b-a0ef-45ab388e67c5");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("02b22f2f-c05e-409c-8395-e2227b050bcd");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("05673b65-b648-4ace-a3f7-e561d674f730");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("473263b8-96b8-41fb-880c-65a6e945d928");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("606f0528-b3e8-448d-970d-e12793bb6da3");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("d0307c44-cdfc-4e81-ac53-0485c746774a");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("b4789cf2-272d-482b-be07-0b0b905a6701");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("e56935e7-e6cb-44b2-8caa-56fe13f9b947");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("09772cd8-de02-422e-b5c8-37516cde9865");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("1149f3ef-9358-4912-a42b-b63140bfa650");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("919a3bf0-e780-4f0a-b53f-399898202d2b");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("2c7003ec-1188-4de0-b3e1-38095c421624");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("9049b3a9-9564-4b53-bf33-436a720d2bdc");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("caae927e-4bd9-47dd-921b-d9cfa9c89d21");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("e02b65c4-a0e0-4784-91cd-ec74dbfed150");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__CT600_Tax_Return_();
    
    TestModellerLogger.SetLastNodeGuid("0a0a9f2c-bdc3-4993-b149-5591e4f2ac4e");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_Submit_CT600();
    

    TestModellerLogger.SetLastNodeGuid("d63d9b67-cb7a-4c21-9a26-e0fab9374232");
    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_Lock();
    
//    TestModellerLogger.SetLastNodeGuid("4557c9f3-ba3b-4526-b935-275c70d587bb");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_Final_Accounts2();

//    TestModellerLogger.SetLastNodeGuid("73dce38e-d957-43e8-9c17-2feedc5f0323");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__Settings_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("5a3e8cc7-379f-41a1-8d8c-603e98e8791a");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_CT_Adjustments_Settings();
//    
//
//    TestModellerLogger.SetLastNodeGuid("aeb3f6c2-867b-4fa0-98c0-f19d484b190a");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__Edit_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("0c6cc8de-391d-43ea-87f2-e042f387bcea");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Enter_ctl00cPHtbContainerTabPanel1rptProfitctl03txtBalance("");
//    
//
//    TestModellerLogger.SetLastNodeGuid("5836c0c1-cdca-4f46-9332-fa4d7a8d4143");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Enter_Loss(sData[5]);
//    
//
//    TestModellerLogger.SetLastNodeGuid("1ef0a46a-c21f-40c5-bde0-ea789b8f5514");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__Save_();
//    
//
//    TestModellerLogger.SetLastNodeGuid("765f7fcb-d6b3-4f0e-a1f1-78d1bbf79da5");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click__CT600_Tax_Return__1();
//    
//
//    TestModellerLogger.SetLastNodeGuid("3caf8e73-168f-4af7-8abd-100cb4262765");
//    _Verify_CT_Adjustments_is_editable_after_unlocking_the_periodFA7153.Click_CT_Computation();
    

    }

}
