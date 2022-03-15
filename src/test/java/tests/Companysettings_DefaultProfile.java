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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/40c1b0de-a2c4-476d-912f-dd0e0bbed671
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 786, profileId = 100675)
public class Companysettings_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "e361fd65-109f-4c55-a11e-c90523893d48")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri1()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Von Inc");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("9202 Layla Lane, New Wilford, Bahrain");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("64313 Senger Parkways, Johnsonborough, Mexico");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("419 Enrico Oval, Port Crystel, Nepal");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("9011 Cremin Coves, Lake Sabryna, Western Sahara");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("66237-8701");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "1443fc80-6d9a-46ae-be3d-e14486d11f54")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri2()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Shanahan - Ondricka");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("1 - General information");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("2979 Green Spur, Electaton, Sri Lanka");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("39539 Emard Fork, New Loisland, Saint Martin");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("59552 Zulauf Locks, Ratkeburgh, Pakistan");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("4009 Mac Fork, South Darioview, Virgin Islands, British");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("97819-6073");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "03ab6513-785e-4ded-9a97-df78a4c93744")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri3()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Mosciski, Russel and Leannon");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("2 - Average number of employees");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("963 Zulauf Plaza, Reinholdchester, Bosnia and Herzegovina");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("366 Marks Crescent, Lake Christopher, Seychelles");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("512 Cristina Dam, New Janamouth, China");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("3595 Predovic Gardens, South Borishaven, American Samoa");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("27101-8337");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "2a664860-c619-44a0-a511-c579440d5e33")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri4()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Cole, Kessler and Murazik");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("1 - General information");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("6604 Williamson Ports, Predovicborough, Ukraine");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("39031 Ariel Drive, Mrazton, Fiji");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("536 Cruickshank Throughway, West Reganfort, Papua New Guinea");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("76307 Ziemann Forks, Gottliebberg, Pakistan");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("25687-1065");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "29cbbb3a-6e4f-4753-a01b-266dfc7f1af5")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri5()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Carroll, Littel and Lowe");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("2 - Average number of employees");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("5954 Katelynn Inlet, West Everardo, Burundi");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("336 Samson Knolls, Dorristown, Jamaica");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("052 Moises Center, East Violettehaven, Japan");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("727 Deion Forge, Ondrickaside, Ghana");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("80918-8355");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "79786f0f-29e5-4670-8f89-57bd339e83e6")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri6()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Mitchell Inc");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("ICAEW guidance");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("83334 Dibbert Fork, West Mauricehaven, Bahrain");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("54431 Enid Fords, Lake Hayleefurt, Nicaragua");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("357 Esperanza Crossroad, Yostville, Macao");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("0294 London Springs, Swaniawskimouth, Pakistan");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("24576-3660");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "4c337607-94e1-470e-a776-440a91021a46")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri7()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Schumm - Schaefer");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("ICAS guidance");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("53311 Nikolas Summit, Lake Armaniside, Rwanda");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("497 Hildegard Mills, McLaughlinport, Qatar");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("0202 Rosie Hills, Bashirianshire, Vanuatu");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("26506 Shields Course, Cassinchester, Bouvet Island (Bouvetoya)");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("63230");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "e1ac8357-10ce-4a02-b41c-e2917fa64b36")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri8()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Hilll, Hilll and Schultz");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("ACCA guidance");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("935 Howell Neck, Beattyburgh, Saint Barthelemy");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("912 Hoppe Keys, New Jamesonmouth, Samoa");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("1739 Parisian Expressway, Caterinaville, Zimbabwe");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("9064 Tiana Extension, Gutkowskimouth, Yemen");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("64058-9407");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "c869624f-8859-4c98-ba10-b4b6c258dfb3")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPri9()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Boyle, Ritchie and Howe");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("CIMA guidance");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("05409 Maci Union, Lake Isabellaville, Nigeria");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("6168 Alphonso Streets, New Russellton, Angola");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("46737 Allan Cape, Port Joanie, Falkland Islands (Malvinas)");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("2163 O'Hara Port, East Elmore, Virgin Islands, British");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("32178");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "78d885c8-f8db-4677-8c19-a8ea576d3938")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr10()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Metz and Sons");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("AAT guidance");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("42119 Thiel Harbors, D'Amoreberg, Honduras");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("81738 Rolfson Avenue, East Fletcher, Vanuatu");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("324 Jenkins Ways, Theodorestad, Brunei Darussalam");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("313 Sim Forges, South Cleta, Uganda");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("17676");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "2fc73c42-f667-49c0-809e-47bac0295523")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr11()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Bosco Group");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Not Applicable");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("57625 Gabriella Path, Gusmouth, Cameroon");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("0533 Borer Light, East Ericaland, Gambia");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("81460 Kelton Shoals, New Eldora, Colombia");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("939 Haag Landing, Port Donaldberg, Norfolk Island");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("13523");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "f28d5a68-b52d-4471-8c60-a151c8094882")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr12()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Wyman - Luettgen");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Custom");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("963 Lura Corner, New Shirleyburgh, Chile");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("131 Ronny Squares, Volkmanhaven, Kazakhstan");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("9852 Stokes Flats, Arjunside, Virgin Islands, British");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("065 Abbigail Brooks, New Osvaldoville, Maldives");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("51020");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "2240803f-da97-4764-81a2-887fa30bdf16")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr13()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("McClure - Wisoky");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("6471 Sawayn Track, Hermistonshire, China");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("79422 Stanford Islands, Llewellynstad, Slovakia (Slovak Republic)");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("2154 Rice Mews, Emmerichville, Central African Republic");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("2922 Sonia Ville, Zorabury, Gambia");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("17110-4817");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

    @Test  (groups= {"Companysettings","Companysettings - Default Profile"})
    @TestModellerPath(guid = "355d462d-6617-4ee8-acfa-d8aedcc3a29c")
    public void GoToUrlAssertUrlClickFinalAccountsClickSettingsClickAccountsSettingsClickEditPositiveEnterPr14()
    {
        
        pages.Companysettings _Companysettings = new pages.Companysettings(driver);
    TestModellerLogger.SetLastNodeGuid("ecea9049-28b2-420e-99f5-68f7a84b88bb");
    _Companysettings.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("c9b4e636-26f2-42f6-8e72-a4dc29ad9c70");
    _Companysettings.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("77de6cb7-200c-483d-b438-82f568c8f962");
    _Companysettings.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("fcad8d72-f0dc-4141-954e-3b6f3efc1f22");
    _Companysettings.Click_Settings();
    

    TestModellerLogger.SetLastNodeGuid("0daa7406-21dc-4e8f-8734-f53819715b4b");
    _Companysettings.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d830a25b-ee69-4b14-9664-29386dc0545f");
    _Companysettings.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("2d1d8f05-5b62-4aba-b4a5-591195099e3c");
    _Companysettings.Enter_Principalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("da4164f8-f63f-43fa-b7f6-9538c091594c");
    _Companysettings.Enter_Authenticationcode("");
    

    TestModellerLogger.SetLastNodeGuid("d9e59c30-ca99-455d-a243-101ee2a6849c");
    _Companysettings.Enter_CTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("c6381bf7-906c-4d96-9e00-af5581eab77c");
    _Companysettings.Enter_CTutr("");
    

    TestModellerLogger.SetLastNodeGuid("fa782b24-36e2-4392-b820-b401238ffad2");
    _Companysettings.Enter_CompanySecretary("Tremblay - Stiedemann");
    

    TestModellerLogger.SetLastNodeGuid("dadf9ea2-bb17-4e8a-83f1-78dad93fcf02");
    _Companysettings.Select_ReportingStdType("Dormant");
    

    TestModellerLogger.SetLastNodeGuid("176e5449-38bf-4368-8ee2-3f3c1d57224f");
    _Companysettings.Select_AccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("5f75e992-8f4d-498e-a3ba-b52c4d5ec3dc");
    _Companysettings.Select_SignatoryPartnerLmtd("Mark Zurk");
    

    TestModellerLogger.SetLastNodeGuid("43729f3e-459a-4008-888b-178287e1a321");
    _Companysettings.Click_ctl00cPHchkIsIncludeInReport();
    

    TestModellerLogger.SetLastNodeGuid("e9bbaec2-b8d1-4cd0-aede-cea5d9b20b4b");
    _Companysettings.Click_PositionsRight();
    

    TestModellerLogger.SetLastNodeGuid("61e98885-416b-4b50-b52a-6dcdba42dfe9");
    _Companysettings.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("326ed321-baa7-440a-ab8f-1f1179e131b9");
    _Companysettings.Select_IntroducePageBreakAfterPageNumbersFrs105Short("None");
    

    TestModellerLogger.SetLastNodeGuid("4f1af7b1-692d-45cc-9d5b-1504fe79f9f7");
    _Companysettings.Select_lstIntroducePageBreakAfterPageNumbersFrs105Full("None");
    

    TestModellerLogger.SetLastNodeGuid("b46868cc-05dc-40e1-8b12-b39c9f1180f2");
    _Companysettings.Enter_Address1("167 Dayton Skyway, Quigleyside, Saint Kitts and Nevis");
    

    TestModellerLogger.SetLastNodeGuid("33e1b126-fb94-4ac4-8a32-c11a478abe7b");
    _Companysettings.Enter_Address2("75902 Hickle Heights, McCulloughchester, Saint Kitts and Nevis");
    

    TestModellerLogger.SetLastNodeGuid("5f7e8c8e-5d87-4612-bb34-24437e8ec29d");
    _Companysettings.Enter_Address3("1476 Pollich Station, New Meagan, Tokelau");
    

    TestModellerLogger.SetLastNodeGuid("424da60e-7355-4556-8ad7-ef2b7a413b34");
    _Companysettings.Enter_Address4("21663 Kemmer Forest, South Trentchester, Tonga");
    

    TestModellerLogger.SetLastNodeGuid("086f8406-dbbc-4af5-a4f9-a46c0e75dd63");
    _Companysettings.Enter_PostCode("00535");
    

    TestModellerLogger.SetLastNodeGuid("2742d21c-c7f1-42e5-ac3c-61da102d8a16");
    _Companysettings.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("9f05a5bb-efb0-4189-aff2-356376d313df");
    _Companysettings.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("ece937be-0ac8-49bb-8d57-24f2651b9424");
    _Companysettings.Click_Full_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("015550bc-3434-4699-88b8-58b57b10c2ff");
    _Companysettings.Click_Company_Information();
    

    TestModellerLogger.SetLastNodeGuid("7f02742f-0ac0-45bf-9c8e-b17aecc0e2e8");
    _Companysettings.Click_Detailed_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("f6f43499-6ff3-4431-a5ae-489d0a261aea");
    _Companysettings.Click_Income_Statement();
    

    TestModellerLogger.SetLastNodeGuid("e35f9a33-c57c-4618-9439-b4deac4f77b1");
    _Companysettings.Click_Statement_of_Financial_Position();
    

    }

}
