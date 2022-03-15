package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/d8a89b76-b85c-487c-a059-5ee211cad4f4
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 789, profileId = 100679)
public class Accountsetting_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "e6a2a6c1-488c-49dd-a641-af8aa8ed8b9e")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri1()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("DuBuque and Sons");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("578 Collier Vista, Kirastad, Falkland Islands (Malvinas)");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("958 Gerard Route, Port Jany, Cape Verde");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("154 Gustave Brooks, Blockhaven, Bhutan");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("8948 Stiedemann Lights, Schulistbury, Gibraltar");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("15392-7849");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "6759769a-131e-40b8-ab1a-6bf4ea13f0dc")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri2()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Frami, Kozey and Stokes");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("1 - General information");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("31402 Lisette Overpass, West Alyciafort, Comoros");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("55818 Quinten Valleys, North Esmeralda, Sudan");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("2395 Heathcote Burgs, Lake Alberto, Isle of Man");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("4010 Kuhlman Crossroad, Lake Johathan, United States of America");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("37782-1303");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "dbb40abd-e40d-4138-b639-385e68e5092b")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri3()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Baumbach, Becker and Swaniawski");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("2 - Average number of employees");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("68406 Golda Canyon, South Rosemaryville, Libyan Arab Jamahiriya");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("43780 Kris Street, Greenholttown, Malawi");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("2736 Cesar Street, Maverickview, Republic of Korea");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("6300 Wunsch Wall, Reicheltown, Netherlands");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("76840-0179");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "0b53049b-d8d8-4e96-892d-2e64bf12c2f9")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri4()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Jenkins LLC");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("1 - General information");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("33446 Volkman Shoal, West Lisette, Serbia");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("033 Veda Radial, Wizaborough, Saint Kitts and Nevis");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("68313 Rhoda Streets, Hackettshire, French Southern Territories");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("8409 Rachelle Camp, North Harryport, Nauru");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("80377-0813");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "bb19a501-97fb-46ea-8770-7815f351ee90")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri5()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("D'Amore Group");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("2 - Average number of employees");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("822 Aurelio Ferry, Port Kylieberg, Tokelau");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("412 Emmy Highway, Port Doraton, Mongolia");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("02043 Anastasia Unions, South Lynnport, Turkmenistan");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("66997 Lewis Street, Gastonmouth, Myanmar");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("87307-8827");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "c47c1849-80e4-4e76-8d0b-0b750d96de39")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri6()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Padberg, Klein and Beahan");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("0779 Marcella Dam, Bauchfurt, Palestinian Territory");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("04999 Cummings Drive, Wavatown, Cape Verde");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("636 Hand Neck, Elzaburgh, Mexico");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("8744 Anabel Courts, Streichton, Palau");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("12113");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "7a7ab372-8db1-44cd-a5b5-5e7d7ae88efd")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri7()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Runte, Shields and Johnson");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("ICAS guidance");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("032 Opal Shoals, West Melyna, Pitcairn Islands");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("9882 Green Trail, Port Lucymouth, Gabon");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("514 Dooley Mountain, East Tara, Brunei Darussalam");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("575 Humberto Dale, Domingomouth, Romania");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("08088-4574");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "98cd0f9a-63f6-498c-bd2f-c227ad868492")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri8()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Gutkowski, Buckridge and Hessel");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("ACCA guidance");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("892 Gregoria Cape, North Talon, Swaziland");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("32804 Jerrell Circles, East Rozellachester, Taiwan");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("7070 Bergnaum Radial, Port Chloe, Comoros");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("256 Terry Harbors, Lake Vitotown, Malta");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("12338-1913");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "3e21e301-a4f9-42ca-82ee-2b73d069cc0c")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri9()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Crist, Erdman and Larkin");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("CIMA guidance");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("408 Jared Freeway, Emmerichchester, Holy See (Vatican City State)");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("226 Rogahn Mill, Laruebury, Qatar");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("5033 Fahey Road, Dickinsonville, Greenland");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("7024 Stracke Keys, Considineshire, Malta");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("68927-9414");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "11e27d9d-e6d0-4f34-abe9-bbdaba393492")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr10()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Satterfield, Brekke and Gutmann");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("AAT guidance");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("0409 Otha Forge, West Maud, Saint Martin");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("49013 Ebert Rapids, West Dayana, Saudi Arabia");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("89269 Khalil Streets, New Raheemland, Taiwan");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("21101 Steuber Ford, Bogisichside, Saint Lucia");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("47930-5647");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "d82a64b4-83ae-4e89-9ea4-90a64abb013e")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr11()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Donnelly, Mertz and Kuvalis");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("70993 Terry Flats, Borerberg, Bhutan");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("56978 Kreiger Manors, West Lenna, Uganda");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("11495 Leland Plaza, South Mateo, Indonesia");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("05815 Stiedemann Prairie, Lake Daijastad, Mexico");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("69468");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "46591367-0880-4c13-a68f-40aa077fec23")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr12()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Greenfelder Group");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Custom");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("1168 Fermin Knolls, Beahanmouth, Congo");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("163 Sydnee Underpass, East Jimmieborough, Taiwan");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("03534 Sister Wall, South Marlen, Argentina");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("2855 Stephania Unions, Gottliebberg, Haiti");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("62334-4010");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "9e332fe6-906d-4ab1-81eb-8b818912505f")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr13()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Quitzon - Grimes");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("50483 Adela Pass, North Ardellamouth, Zambia");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("7672 Mante Inlet, West Cristobalburgh, Timor-Leste");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("7971 Lisette Corners, Vellafurt, Lebanon");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("2176 Nicolas Manor, Kerlukebury, Central African Republic");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("17512-0763");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"Accountsetting","Accountsetting - Default Profile"})
    @TestModellerPath(guid = "e7fc07ae-53df-43a1-88bf-cc37b95b0124")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr14()
    {
        
        pages.Accountsetting _Accountsetting = new pages.Accountsetting(driver);
    TestModellerLogger.SetLastNodeGuid("70f11d11-6b72-4a15-baa4-626684d03f95");
    _Accountsetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("4ff28607-5da0-40bb-a4b5-608004aacee0");
    _Accountsetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("20cc4b30-af8b-4e40-98c6-89d510ce7739");
    _Accountsetting.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("1b64d8ac-bdc0-4ab4-a7be-9ddeeeb47e0c");
    _Accountsetting.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("262f7b42-c757-4e56-bea1-a7f4b508714e");
    _Accountsetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("ca66a08b-c7f7-4be8-bb77-06458ef8ca2d");
    _Accountsetting.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("18e9b477-e404-4a0d-b8ea-d3e754dda18a");
    _Accountsetting.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("caf2c188-5a6e-4686-a8b5-0a462562b9c8");
    _Accountsetting.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("35b1af3a-cc90-4f8e-bf38-39a7e5ee47bd");
    _Accountsetting.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("720348aa-5a84-4017-b097-6285fd4d1dea");
    _Accountsetting.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("ebf1ab35-1b0a-4afe-b640-aa268a2711ec");
    _Accountsetting.Enter_CompanySecretary("Tremblay, Pfeffer and Lemke");
    

    TestModellerLogger.SetLastNodeGuid("61e9d99e-82cb-4d51-b691-98ef003c7bd5");
    _Accountsetting.Select_ReportingStdType("Dormant");
    

    TestModellerLogger.SetLastNodeGuid("82c135b5-6e17-42b1-8fc3-2a97c1b3acf8");
    _Accountsetting.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("c1102902-1b41-453a-95f8-4b14adc2f57c");
    _Accountsetting.Select_SignatoryPartnerLmtd("NAKUL SHARMA");
    

    TestModellerLogger.SetLastNodeGuid("b4df5b67-00b2-4875-bada-72999c9a3fec");
    _Accountsetting.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("7d890484-9da5-4868-a7ce-68f103ed13bd");
    _Accountsetting.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("f90a257e-61d2-48fc-90e6-7a8c94c93854");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("bc60eda5-c319-412f-b69f-bb181a470629");
    _Accountsetting.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("7de42f6c-12d6-442c-bdfa-8e9ca47f0ee8");
    _Accountsetting.Enter_Address1("304 Ruby Parks, Jailynborough, Uganda");
    

    TestModellerLogger.SetLastNodeGuid("e1d26ba1-93ae-4f79-bc90-09a12095cbe5");
    _Accountsetting.Enter_Address2("975 Annabel Street, Sipesburgh, Nepal");
    

    TestModellerLogger.SetLastNodeGuid("efa8a488-fd0e-4e9f-8525-8b05137490a9");
    _Accountsetting.Enter_Address3("94246 Alfonso Gateway, McClurefort, Saint Helena");
    

    TestModellerLogger.SetLastNodeGuid("754f01c4-3341-4868-9797-9cc2d2f4ca90");
    _Accountsetting.Enter_Address4("694 Funk Prairie, Tamaraview, Burundi");
    

    TestModellerLogger.SetLastNodeGuid("e0f68a19-2156-42f3-a803-1f499b796ddf");
    _Accountsetting.Enter_PostCode("49872-8027");
    

    TestModellerLogger.SetLastNodeGuid("62771ed9-03dd-4ffa-ac73-e15bfd5f6d5f");
    _Accountsetting.Click_Savebutton();
    

    TestModellerLogger.SetLastNodeGuid("4748956f-5d5c-42c8-9115-78064cde0315");
    _Accountsetting.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("d2eed7da-9d23-4d01-b6c0-b57a8169fbb1");
    _Accountsetting.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("eb910df7-5744-4e38-b6f0-2271530f5ada");
    _Accountsetting.Click_Cover_Page();
    

    TestModellerLogger.SetLastNodeGuid("2191e254-6e57-4778-9ce9-19380a8ad0c1");
    _Accountsetting.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("01df514f-d471-4bc4-9d54-7f8a09ff3d3a");
    _Accountsetting.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("39edaf0a-b1ed-474a-a6b8-626c107ca01b");
    _Accountsetting.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("7b65f5e1-3276-4aad-93ff-ac3dc83c9323");
    _Accountsetting.Click_Detailed_Income_Statement();
    

    }

}
