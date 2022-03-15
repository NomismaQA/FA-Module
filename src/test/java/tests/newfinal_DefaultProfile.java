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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ce145d7a-f444-48d1-a101-d76bfc9d5747
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 773, profileId = 100659)
public class newfinal_DefaultProfile extends TestBase
{
    
   // @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "514c99be-d005-42dc-a158-cd713d97e727")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive1()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    System.out.println("hello");

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("admin");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("Nakul@@");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("XYZ Tests Limited");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("11223344");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("20-04-2018");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Winona");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Cronin");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("Softwares");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("1234");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("Hales");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("002255");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Schneider, Jacobi and Rolfson");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("998 Koch Estates");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("Alvenaberg");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("027 Buford Mountains, Lake Everetteland, Senegal");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("27564 O'Conner Coves, Littleborough, Kenya");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("22594-5332");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "76ca1458-3ea3-4ec3-b4d5-58eb274a6563")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive2()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("admin");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("Nakul@@");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("voluptatem");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("12345678");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("18-04-2018");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Raquel");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Swaniawski");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("12345");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("Wzls");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("856974");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Bogan and Sons");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("1 - General information");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("113 Orn Lodge, Carrollfort, Russian Federation");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("46617 Waino Islands, Destinistad, Mayotte");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("6850 Dach Stravenue, Beermouth, Ukraine");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("315 Miracle Mountains, South Xzaviershire, Saint Martin");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("34761-5953");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "092fd5ae-d3ea-463d-a61a-716dae80c934")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive3()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("admin");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("nakul@@");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("temporibus");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("88996644");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("24-05-2019");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Dayton");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Maggio");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("kulyhh");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("2586");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("kulo");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("23okli");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Davis, Lynch and Satterfield");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("2 - Average number of employees");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("21624 Gonzalo Tunnel, Tyraville, Andorra");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("765 Mya Stravenue, North Davin, Sierra Leone");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("72329 Bosco Shore, Johnsonchester, Bulgaria");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("59372 Terrence Tunnel, North Mozelle, China");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("42870-9469");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "3ed3dbe2-73c7-439f-899a-b1515712f7aa")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive4()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("admin");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("ea");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("sit");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Darlene");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Homenick");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Beier and Sons");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("1 - General information");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("31472 Crooks Extension, Gregoriabury, Uzbekistan");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("2711 Beier Station, South Granvilletown, El Salvador");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("2108 Heller Divide, Port Abbyfurt, Bangladesh");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("0969 Bernhard Ramp, New Marley, Tokelau");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("69584-7047");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "e402ff9e-7f40-492f-ab64-722eea0e4826")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive5()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Madonna_Bauch39");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("bcvvc594hJ");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("et");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("deserunt");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Chauncey");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Kunze");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Reilly Inc");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("2 - Average number of employees");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("318 Harold Lodge, Melynaland, Mauritania");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("92311 Zaria Parks, Aimeemouth, Dominican Republic");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("13947 Durgan Parkway, Jeraldbury, British Indian Ocean Territory (Chagos Archipelago)");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("477 Dorothy Radial, Riverburgh, Poland");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("01421");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "1340ef85-c52d-4ea6-8d34-ddee2950ca2b")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive6()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Clinton_White");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("jTtjYy6Azk");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("quis");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("voluptatibus");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("River");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Breitenberg");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("McKenzie Inc");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("8691 Kyra Highway, Port Zelma, American Samoa");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("03907 Bergnaum Shoal, South Alexandremouth, Cocos (Keeling) Islands");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("512 Kari Haven, New Bettye, Germany");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("004 Fahey Park, Grantland, Eritrea");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("42597-6395");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "065f3ae3-ee9f-4966-84bb-e308b7cca100")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive7()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Chad29");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("fV_ZpiL3qm");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("voluptatem");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("corporis");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Frederik");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Pfeffer");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Rolfson - Murazik");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("ICAS guidance");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("53239 Haley Roads, Port Prince, Ghana");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("7273 Pouros Terrace, Busterstad, Wallis and Futuna");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("900 Bogan Unions, Lempihaven, Norway");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("96594 Padberg Roads, Port Sylvester, Tokelau");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("71494-8796");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "3bc65fdf-c3b8-4188-b952-97a60f2cdd16")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive8()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Tatum36");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("u0Cv_eXmwF");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("est");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("ut");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Aidan");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Hilll");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Jakubowski - Ondricka");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("ACCA guidance");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("54012 Nils Roads, North Joliefurt, Wallis and Futuna");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("9508 Kihn Causeway, Starkville, Austria");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("411 Burley Rapids, Port Juana, Kiribati");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("507 Marianna Unions, South Jewel, Burundi");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("24212");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "086df492-86e9-4bad-834f-8657dff42ea0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositive9()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Annie_Schmeler48");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("u3IoNWrou6");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("et");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("quis");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Kiel");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Bode");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Bernhard Group");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("CIMA guidance");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("41432 Bergnaum Rue, Dareberg, Mauritius");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("65053 Koelpin Garden, Russelberg, Syrian Arab Republic");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("1849 Elda Glens, Babybury, French Polynesia");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("1250 Greenholt Coves, Moenside, Finland");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("16340-7793");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "c47f4148-cd09-4f51-bd16-e0ffb4d9b17c")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv10()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("admin");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("sandbox@test");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("nakul@@");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("illum");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Dayana");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Rath");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Considine, Hand and Wintheiser");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("AAT guidance");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("881 Boehm Road, Lake Hildegard, Tanzania");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("83147 Elliott Radial, Arnoldmouth, Turkmenistan");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("793 Clement Ports, West Eloyfort, Malawi");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("08174 Russel Landing, Beckerhaven, Cote d'Ivoire");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("18774");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "690e8d1d-c2bd-4c6b-affb-ca1d2477aaf2")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv11()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Dagmar_Lehner5");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("Ri0ZRSpvWE");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("eligendi");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("ipsa");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Angelica");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Beer");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Murazik LLC");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("2177 Wisoky Port, Funkton, Marshall Islands");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("6597 Cronin Plains, New Floyd, China");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("2114 Daniella Roads, Jimmystad, Algeria");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("71618 Katrina Greens, Johnsonville, Micronesia");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("99070");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "547e034c-4e28-465c-8ef9-84e9509c6aa0")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv12()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Adriel.McDermott");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("qqzljqGxNT");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("a");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("tenetur");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Elvie");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Hodkiewicz");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Rau Inc");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Custom");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("1867 Miller Courts, Lake Thomas, Kuwait");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("69236 Little Unions, East Quintenmouth, Czech Republic");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("274 Nathaniel Alley, Lake Kyler, Switzerland");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("54944 Brown Summit, Johathanville, Uruguay");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("10092");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "3a6cd6ea-1278-44d5-9ef8-f151fcf273a4")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv13()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Maia20");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("A8uurFt3tR");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("molestiae");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("quia");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Grayson");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Kshlerin");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("McDermott, White and Thompson");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("66418 Urban Key, New Cecil, Eritrea");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("21060 Verda Key, Diannachester, Cambodia");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("411 Wuckert Trace, North Chaya, Bosnia and Herzegovina");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("51228 Nelda Ford, Walkerbury, Burkina Faso");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("36990-8259");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "0640ada1-0b96-48ef-8c67-bbc60a15d91e")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv14()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Stanley.Davis");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("yfd1tkVwzI");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("earum");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("commodi");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Jamar");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Osinski");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Feil, Runte and Grady");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("Dormant");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("792 Turner Grove, South Dougland, Australia");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("47863 Erdman Trail, Terryberg, Palestinian Territory");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("16411 Gerhold Hills, New Wayne, Slovenia");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("07877 Randall Centers, Sporerfurt, Jersey");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("46146");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "5ebde728-7fbc-4865-ac87-d3de1d67cc8a")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv15()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Terrance70");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("TGzCVyLyWl");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("aut");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("facilis");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204.632997893517");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Joany");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Hackett");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Weimann, Ondricka and Maggio");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("44231 Predovic Overpass, Lake Maggiefort, Cuba");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("077 Albina Fields, Kameronmouth, Israel");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("96030 Milan Mission, Gradyshire, Malaysia");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("92959 Maggie Shoals, West Saulmouth, Seychelles");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("09830");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

    @Test  (groups= {"newfinal","newfinal - Default Profile"})
    @TestModellerPath(guid = "11e2f925-19cb-45de-866f-1dbb940f046d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonClickAgentsPositiv16()
    {
        
        pages.newfinal _newfinal = new pages.newfinal(driver);
    TestModellerLogger.SetLastNodeGuid("361ff446-6dd8-40ac-b646-d2a782788625");
    _newfinal.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("d65f56ab-7acd-44e4-ad4f-ca0d7f8fe151");
    _newfinal.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("fc995fa8-a798-41d0-8f5d-c818628a6ef7");
    _newfinal.Enter_Username("Trisha11");
    

    TestModellerLogger.SetLastNodeGuid("b5d4e6b3-88e0-4e4c-a295-45e595ef40eb");
    _newfinal.Enter_Password("wlPESYbR8w");
    

    TestModellerLogger.SetLastNodeGuid("7c546f74-212d-4043-8eac-c6c54525e7f5");
    _newfinal.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("bf4aec67-b675-4437-87f7-23ab4c024662");
    _newfinal.Click_Agents();
    

    TestModellerLogger.SetLastNodeGuid("b810a163-5fd6-4a6d-bb04-1b2cdbf10494");
    _newfinal.Enter_Searchagentname("laudantium");
    

    TestModellerLogger.SetLastNodeGuid("ff1851ca-994f-458b-877e-cf2b0034412d");
    _newfinal.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("dac51424-be51-4184-baef-00b652302ab3");
    _newfinal.Click_Agentname();
    

    TestModellerLogger.SetLastNodeGuid("45cf9430-31de-4cb9-84d0-17e3471daafb");
    _newfinal.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("222ec3ad-01db-4e25-93c1-c9018d7a36a1");
    _newfinal.Click_Addnewclient();
    

    TestModellerLogger.SetLastNodeGuid("d7a642ce-b0d8-4478-9559-89f33c3c559a");
    _newfinal.Click_Manuallylimitedcompany();
    

    TestModellerLogger.SetLastNodeGuid("95996c1a-fb15-460a-9cc9-c9af8b3b7f0d");
    _newfinal.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("ff3a5736-8812-42f9-8998-d1ca90670557");
    _newfinal.Enter_Businessname("ipsam");
    

    TestModellerLogger.SetLastNodeGuid("5c9a10c4-11bd-4dc2-aab3-6e29079957c4");
    _newfinal.Enter_RegNo("");
    

    TestModellerLogger.SetLastNodeGuid("c4fb0f0b-cd0e-4a6f-9694-65383c3ed5c0");
    _newfinal.Enter_RegDate("44204.632997916669");
    

    TestModellerLogger.SetLastNodeGuid("1722353f-50ec-4299-9966-e7be096edca3");
    _newfinal.Enter_FirstName("Tyrique");
    

    TestModellerLogger.SetLastNodeGuid("2ff70a99-2586-450b-a4fa-0beaa25bf02d");
    _newfinal.Enter_LastName("Wolf");
    

    TestModellerLogger.SetLastNodeGuid("b5e43f55-3f9a-4a11-9f1f-3d31254fd5c2");
    _newfinal.Click_Tickbutton();
    

    TestModellerLogger.SetLastNodeGuid("b74aad79-3483-4d93-b485-46d00733b6c1");
    _newfinal.Click_SaveButton_1();
    

    TestModellerLogger.SetLastNodeGuid("b26abcde-bace-4978-b6d0-a9904f83a42d");
    _newfinal.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("dae9ac1d-8679-4567-8b7d-c022e71b41a2");
    _newfinal.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("4fb42fdb-a6fb-43bd-bfc9-405106321bcc");
    _newfinal.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("43fafaba-b1ef-4e95-802e-e05d4eeaf00a");
    _newfinal.Click_Editbutton();
    

    TestModellerLogger.SetLastNodeGuid("9f5eda98-76ba-4cb2-a415-6de21caef2e6");
    _newfinal.Enter_Principal_activity("");
    

    TestModellerLogger.SetLastNodeGuid("5048d63b-5102-40a4-9dad-fcb40dac182d");
    _newfinal.Enter_Authentication_code("");
    

    TestModellerLogger.SetLastNodeGuid("6daa9958-ec53-4dc2-8c20-da8cc11df883");
    _newfinal.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("5ca2e73b-1e8d-4bce-8ef7-5362c0b91421");
    _newfinal.Enter_CTUTR("");
    

    TestModellerLogger.SetLastNodeGuid("52a42747-c30a-4719-9aeb-714d04e673b0");
    _newfinal.Enter_CompanySecretary("Douglas LLC");
    

    TestModellerLogger.SetLastNodeGuid("de3a71e6-124e-478f-bbd8-50d6caa3294f");
    _newfinal.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("aba89331-d8f9-4426-9950-dde3326f3dd0");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("d4b8171c-4452-4158-a753-2bb2695dfb06");
    _newfinal.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4adde1b4-956b-430b-a83e-f86084a59c77");
    _newfinal.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("8ec00555-f8ba-439c-87cb-8f7883cd58d6");
    _newfinal.Click_chkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("2c20884e-84f4-4c3d-a1a4-8ac6223a337b");
    _newfinal.Click_ByPositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("826045d6-50ec-484d-ad49-0e97e7d4c446");
    _newfinal.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("ab299677-11d2-4cdd-a525-04cba1d015c5");
    _newfinal.Select_tIntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("2a9cad9b-e497-464a-87bd-15441afbdf53");
    _newfinal.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("1de788a0-d2db-40b3-a017-e8be5878d148");
    _newfinal.Enter_Address1("2737 Herman Walk, West Esmeralda, Germany");
    

    TestModellerLogger.SetLastNodeGuid("338ce6fa-c276-4604-b154-11b3d0acd04a");
    _newfinal.Enter_Address2("12028 Miguel Crest, West Taylor, Norway");
    

    TestModellerLogger.SetLastNodeGuid("15f5d2d8-2c68-41f3-99ef-d9609a71830b");
    _newfinal.Enter_Address3("02810 Schimmel Neck, South Raven, Gabon");
    

    TestModellerLogger.SetLastNodeGuid("866fdf7b-05c0-4882-93e3-e00fd58d345b");
    _newfinal.Enter_Address4("70762 Daisy Manor, North Juwan, Nigeria");
    

    TestModellerLogger.SetLastNodeGuid("f554c0fd-7684-456d-b86d-74b9179a5803");
    _newfinal.Enter_PostCode("58973");
    

    TestModellerLogger.SetLastNodeGuid("5613b93d-fb50-48d9-bbef-a5d1b15cf06e");
    _newfinal.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("67b55fc4-2948-4ac6-af38-175e4dbb6478");
    _newfinal.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("279f788d-e280-462a-97bc-adb2675db82d");
    _newfinal.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("406bf980-833a-4787-97d9-6c4447a3fdf4");
    _newfinal.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("fb76fd10-7753-4597-9343-89fb9f67b005");
    _newfinal.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("1fda0c1b-cb42-4fa0-916f-fa80a3c114bb");
    _newfinal.Click_Statement_of_Financial_Position();
    

    TestModellerLogger.SetLastNodeGuid("43a95bc1-b140-4442-b458-81822767d067");
    _newfinal.Click_Detailed_Income_Statement();
    

    }

}
