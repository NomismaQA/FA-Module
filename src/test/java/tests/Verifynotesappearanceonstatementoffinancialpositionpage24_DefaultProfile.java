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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e3bdff30-9cf6-4432-995f-b4ab505e0af3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1124, profileId = 101019)
public class Verifynotesappearanceonstatementoffinancialpositionpage24_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_notes_appearance_on_statement_of_financial_position_page24","Verify_notes_appearance_on_statement_of_financial_position_page24 - Default Profile"})
    @TestModellerPath(guid = "ef3a0fe5-6ca4-4864-bd34-baffd5fb1957")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifynotesappearanceonstatementoffinancialpositionpage24_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

    	
        pages.Verify_notes_appearance_on_statement_of_financial_position_page24 _Verify_notes_appearance_on_statement_of_financial_position_page24 = new pages.Verify_notes_appearance_on_statement_of_financial_position_page24(driver);
    TestModellerLogger.SetLastNodeGuid("a32ade28-3b8a-469d-8d1f-30602611b557");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("219c3a60-a4f0-437d-a053-112a7c29a579");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2d80065d-9266-407d-a87f-e434b2bbc663");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("908f9f8a-01ae-402a-85aa-ae5bea59417b");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("caddf7c6-f5e5-47d3-b08d-463728609b9e");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("e1d9cf69-ff08-405a-89f2-df0c920ada6e");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("3f8e2dbe-cf8b-4179-8ef2-036c913b3e19");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("2c9351d3-dae4-47ec-a40d-5cf70bca86c9");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("d6daea52-6058-4d95-ad35-2f9007018f7b");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("ba0f4e1d-c087-4aa9-89c6-2c582eca8f56");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("6b6aa6a9-a22e-4e80-aee9-d3ae03f012ef");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("c994fcee-da41-4641-b772-71d60183cb91");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("c6ac767e-d9e3-4882-819d-69b4b0b31edb");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click__ABC_LLP_();
    

    TestModellerLogger.SetLastNodeGuid("77931053-d6ab-4099-8af7-6b69c4656855");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("2efcaaf7-584f-4115-8a2a-d721a4c7ce06");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Settings1();
    

    TestModellerLogger.SetLastNodeGuid("1ba99214-ea06-4745-b687-4f2d53c69851");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("6be3c069-64af-4b23-ac53-441970de308a");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("b2ca3533-dab0-4697-abe6-fb48da9bd56f");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtPrincipalactivity(sData[16]);
    

    TestModellerLogger.SetLastNodeGuid("a8c05eb3-2ece-4070-854e-d91dd85f4029");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtAuthentication(sData[17]);
    

    TestModellerLogger.SetLastNodeGuid("b9d609ef-c6d2-49dc-aaf5-cb860eeaea9b");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtCTdistrict(sData[18]);
    

    TestModellerLogger.SetLastNodeGuid("7ab52297-9691-4fb0-9905-a6d7ba618d7b");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtCTutr(sData[19]);
    

    TestModellerLogger.SetLastNodeGuid("3cd019f0-b254-4125-9e37-755c105d6e33");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtCompanySecretary("John Williams");
    

    TestModellerLogger.SetLastNodeGuid("dbdc0100-295e-450d-8b2b-da576f113b83");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("a30b5b9b-b58e-47ea-99b5-6df737c397eb");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("d22d5c3e-0fc4-4bca-bc5f-24fa290ccb7b");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_radPreparedByPositionsRight_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("dbce0119-bdf8-42af-9cff-b065422e2ccb");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtAddress1(sData[21]);
    

    TestModellerLogger.SetLastNodeGuid("97fbee26-8665-4a78-8855-96b137fe2864");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtAddress2(sData[22]);
    

    TestModellerLogger.SetLastNodeGuid("160d47df-6aae-4de1-9819-c75ce88cfe65");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtAddress3(sData[23]);
    

    TestModellerLogger.SetLastNodeGuid("b3c91f36-8bec-491f-9e40-7835d216c4c0");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtAddress4(sData[24]);
    

    TestModellerLogger.SetLastNodeGuid("240a6632-f61d-465f-b771-88e7519b8af0");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Enter_ctl00cPHtxtRegFAPostCode(sData[25]);
    

    TestModellerLogger.SetLastNodeGuid("6a0a42fc-55fa-467f-99cc-a2c2b84c588a");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Save_Button();
    

    TestModellerLogger.SetLastNodeGuid("ef35f343-11ae-428d-b2a8-a2f759544cad");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("2282365a-563c-40cf-bc85-116ef1935638");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Filleted_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d8a4258c-24d9-4efd-9d57-5b6e397b83b3");
    _Verify_notes_appearance_on_statement_of_financial_position_page24.Click_Partnership_Information();
    

    }

}
