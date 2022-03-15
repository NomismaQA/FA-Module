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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/e1d9ff86-fff7-4b54-ab2a-35907388b0a0
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1163, profileId = 101055)
public class VerifyimpactofDirectoroverdrawnoncorporationtaxcomputation1FA716_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716","Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716 - Default Profile"})
    @TestModellerPath(guid = "be49c2c1-de05-4872-89ec-be3857ad8138")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyimpactofDirectoroverdrawnoncorporationtaxcomputation1FA716_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716 _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716 = new pages.Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716(driver);
    TestModellerLogger.SetLastNodeGuid("875108e1-4682-4692-9c86-63ea48d03855");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("07d5d4cf-140f-408b-882e-a819e5680411");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93795f69-5c9a-41f8-a635-b15081a9edf2");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("58c08d0a-8675-4670-8d0d-a2e4d9080b6c");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("dc08f706-6e95-4da3-bdef-32b0c3d4e20a");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("9058a229-e010-4d20-bd35-8674f9b0bb76");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("fae12598-8d4c-4cb9-b487-7c54555ce3fd");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("75f8c390-7034-4ce0-ac6c-7cc0f0387c53");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("382d455f-dce2-4e44-9665-eb8fdf120b26");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("cc1e1da3-df2b-418c-9587-96bd2c5a9d59");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("ff98cc8b-40e0-462b-a162-b18198fa229b");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Select_ctl00ctl00ParentContentcPHFilterddlType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("f75dca4d-591d-4d10-8350-58043aa30c8c");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("a9fce213-d793-46de-96e7-ec80bfc38c75");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__Test_Systems_Ltd_();
    

    TestModellerLogger.SetLastNodeGuid("96e8f258-36d4-4455-82db-82d10f2877d3");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("6d49cd69-b580-475a-b8b9-e7302a1cb9f7");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5283720b-bdb5-4668-b393-b7b40c80e707");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("be320b2c-4fa1-4a6b-b97c-67495c3291f8");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Add_Director();
    

    TestModellerLogger.SetLastNodeGuid("5dadd649-541b-4371-bd46-07c0eecec8cc");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_FirstName(sData[55]);
    

    TestModellerLogger.SetLastNodeGuid("05527d3d-ae03-4962-a29e-5655beb408a9");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_LastName(sData[56]);
    

    TestModellerLogger.SetLastNodeGuid("63d4d92a-e2dc-4e69-8eb6-a56e4c969c00");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Shareholder();
    

    TestModellerLogger.SetLastNodeGuid("2b4f5732-89ae-44b9-a783-7f865d248274");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_DirectorJoiningDate(sData[57]);
    

    TestModellerLogger.SetLastNodeGuid("93015379-95b5-4899-b1b5-d6b4d2cccaf0");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address1(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("e79eeb71-c14c-4a3e-8a2a-2c36bd504127");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address2(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("d0cd5395-a939-4761-8a1b-3e740b33c90b");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address3(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("4eb4cf4e-254b-4830-9f0f-4fdc850f69f3");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("f8218ecf-6c72-47de-9347-b5eced691f41");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_PostCode("WC2N 5DU");
    
    TestModellerLogger.SetLastNodeGuid("f8218ecf-6c72-47de-9347-b5eced691f41");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Save1();
    

    TestModellerLogger.SetLastNodeGuid("6d49cd69-b580-475a-b8b9-e7302a1cb9f7");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Edit1();
    

    TestModellerLogger.SetLastNodeGuid("5283720b-bdb5-4668-b393-b7b40c80e707");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Director_tab();
    

    TestModellerLogger.SetLastNodeGuid("be320b2c-4fa1-4a6b-b97c-67495c3291f8");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Add_Director();
    
    TestModellerLogger.SetLastNodeGuid("5dadd649-541b-4371-bd46-07c0eecec8cc");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_FirstName("Demo");
    

    TestModellerLogger.SetLastNodeGuid("05527d3d-ae03-4962-a29e-5655beb408a9");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_LastName("Demo2");
    

    TestModellerLogger.SetLastNodeGuid("63d4d92a-e2dc-4e69-8eb6-a56e4c969c00");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Shareholder();
    

    TestModellerLogger.SetLastNodeGuid("2b4f5732-89ae-44b9-a783-7f865d248274");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_DirectorJoiningDate(sData[57]);
    

    TestModellerLogger.SetLastNodeGuid("93015379-95b5-4899-b1b5-d6b4d2cccaf0");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address1(sData[31]);
    

    TestModellerLogger.SetLastNodeGuid("e79eeb71-c14c-4a3e-8a2a-2c36bd504127");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address2(sData[32]);
    

    TestModellerLogger.SetLastNodeGuid("d0cd5395-a939-4761-8a1b-3e740b33c90b");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address3(sData[33]);
    

    TestModellerLogger.SetLastNodeGuid("4eb4cf4e-254b-4830-9f0f-4fdc850f69f3");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Address4(sData[34]);
    

    TestModellerLogger.SetLastNodeGuid("f8218ecf-6c72-47de-9347-b5eced691f41");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_PostCode("WC2N 5DU");
    
    TestModellerLogger.SetLastNodeGuid("f8218ecf-6c72-47de-9347-b5eced691f41");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Save1();
    
    TestModellerLogger.SetLastNodeGuid("0183daf2-6336-40d1-8317-d993e826a34d");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__Accountant_();
    

    TestModellerLogger.SetLastNodeGuid("009a2bab-59be-4773-b985-f385c8c0b71c");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Add_journal_entry();
    

    TestModellerLogger.SetLastNodeGuid("bcb30652-3b95-441c-8ffe-79b990ca483f");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Date("05/10/2020");
    

    TestModellerLogger.SetLastNodeGuid("4de89d72-9cde-4184-9cf5-3af663cc59d6");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Description("TestingNKS");
    

    TestModellerLogger.SetLastNodeGuid("dacd9d72-051e-4c1d-b84c-94ed4fac597a");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Account1("400");
    

    TestModellerLogger.SetLastNodeGuid("78fc938e-9bc8-4819-a54f-319d236119db");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Credit1("20000");
      

    TestModellerLogger.SetLastNodeGuid("4dc00548-0ba4-4f48-8c50-60b108cb1006");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Account2("1321");
    

    TestModellerLogger.SetLastNodeGuid("92563e8b-ecac-4a90-b882-39365daa1f4f");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Debit2("35000");
    

    TestModellerLogger.SetLastNodeGuid("0e4d2991-f02c-4d98-b3ab-ad4285edcb3d");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Account3("1321");
    

    TestModellerLogger.SetLastNodeGuid("df365715-c319-4418-858d-0f3661745677");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Enter_Credit3("15000");
    

    TestModellerLogger.SetLastNodeGuid("cf9058df-021f-4c3f-8424-b7dd4d881223");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_Save2();
    

    TestModellerLogger.SetLastNodeGuid("4fb5df13-be36-4a9d-8948-531cb86d06f1");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__Final_Accounts_();
    

    TestModellerLogger.SetLastNodeGuid("835ccc78-abb6-46bf-8051-79fef2f2abdb");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click__CT600_Tax_Return_();
    

    TestModellerLogger.SetLastNodeGuid("a0f51d86-0bf9-4d03-8ca8-963224e01b93");
    _Verify_impact_of_Director_overdrawn_on_corporation_tax_computation1FA716.Click_CT_Computation();
    

    }

}
