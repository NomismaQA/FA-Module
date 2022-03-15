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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/4b62d4bc-919e-40f4-ba6f-f8214ce3ab09
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 828, profileId = 100713)
public class FAsandpre_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"FAsandpre","FAsandpre - Default Profile"})
    @TestModellerPath(guid = "bb6c5068-8831-4737-a67f-623eab4a4747")
    public void GoToUrlAssertUrlClickLoginButtonPositiveEnterctl00cPHFiltertxtAgentNameClickSearchbuttonClickA()
    {
        
        pages.FAsandpre _FAsandpre = new pages.FAsandpre(driver);
    TestModellerLogger.SetLastNodeGuid("ce26460b-56cd-4cd8-9506-a246a1021514");
    _FAsandpre.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("00dfd3b4-2425-4dcc-8ebe-332be7a78c04");
    _FAsandpre.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("422cd989-aea2-42d7-990b-22607f9bba95");
    _FAsandpre.Click_LoginButton();
    

    TestModellerLogger.SetLastNodeGuid("f84caaba-b32a-4796-adee-9ad8574925f7");
    _FAsandpre.Enter_ctl00cPHFiltertxtAgentName("culpa");
    

    TestModellerLogger.SetLastNodeGuid("c2e8f8ed-9f2a-41a5-b14d-9659f0e2affa");
    _FAsandpre.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("b0aaf35c-e9e8-4224-80b0-22b331171e75");
    _FAsandpre.Click_AgentName();
    

    TestModellerLogger.SetLastNodeGuid("16a9673a-d5ca-40e2-a616-346a134c7c0e");
    _FAsandpre.Click_LLP();
    

    TestModellerLogger.SetLastNodeGuid("32b69c8a-4be3-4193-817e-2c498b1a97f1");
    _FAsandpre.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany("Leuschke - Daniel");
    

    TestModellerLogger.SetLastNodeGuid("290830b9-8b28-4608-9e1f-940baabf94fc");
    _FAsandpre.Click_Search_();
    

    TestModellerLogger.SetLastNodeGuid("f3db95aa-5fd7-4b79-872a-bf29b565e1e2");
    _FAsandpre.Click__Friends_Test_Company();
    

    TestModellerLogger.SetLastNodeGuid("be986ab0-ce2c-4b78-90cb-b3ef578c76c1");
    _FAsandpre.Click_Settings_1();
    

    TestModellerLogger.SetLastNodeGuid("8f36cba1-9d1a-4b97-9ca5-c8665d9fccfd");
    _FAsandpre.Click_Edit();
    

    TestModellerLogger.SetLastNodeGuid("cbefd4d5-d7ce-41e2-8c23-b607554abfaf");
    _FAsandpre.Click_General();
    

    TestModellerLogger.SetLastNodeGuid("ceb82bce-e6da-4e0a-b253-11d71c0a115b");
    _FAsandpre.Enter_ctl00cPHtbContainerTbGeneraltxtRegNo("");
    

    TestModellerLogger.SetLastNodeGuid("4e6b43f1-7737-4b0f-ae5a-e545bd16feed");
    _FAsandpre.Enter_ctl00cPHtbContainerTbGeneraltxtAddress1("403 Hartmann Plains, Boscoburgh, Samoa");
    

    TestModellerLogger.SetLastNodeGuid("5b4a9321-1464-45d4-917b-ee30512b8873");
    _FAsandpre.Enter_ctl00cPHtbContainerTbGeneraltxtAddress2("20715 Reilly Walk, South Eileen, Sudan");
    

    TestModellerLogger.SetLastNodeGuid("ad357df2-3b9a-4708-a250-5bae2c7a8469");
    _FAsandpre.Enter_ctl00cPHtbContainerTbGeneraltxtAddress3("79890 Gerard Plains, Porterburgh, Fiji");
    

    TestModellerLogger.SetLastNodeGuid("a98656e8-6f98-4d83-896b-8db9b3d8bde7");
    _FAsandpre.Enter_ctl00cPHtbContainerTbGeneraltxtAddress4("276 Demarco Estates, Hermanview, Chile");
    

    TestModellerLogger.SetLastNodeGuid("d95abead-5845-43ec-ba9e-758b09787f68");
    _FAsandpre.Enter_ctl00cPHtbContainerTbGeneraltxtPostCode("47375");
    

    TestModellerLogger.SetLastNodeGuid("fa4a3941-71a6-43fc-8a9c-bcf7ea87a69e");
    _FAsandpre.Click__Save_();
    

    TestModellerLogger.SetLastNodeGuid("6a9e87c9-1aba-4ba5-b0e7-9fd697a4071c");
    _FAsandpre.Click_Final_Accounts_1();
    

    TestModellerLogger.SetLastNodeGuid("4b91db27-ebdb-4b67-9132-720e982f88ca");
    _FAsandpre.Click_Settings_1();
    

    TestModellerLogger.SetLastNodeGuid("4c346cdf-7740-49d0-8dc9-c53b6ed0376c");
    _FAsandpre.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("f82dfe41-8871-465d-81a6-98123a382c66");
    _FAsandpre.Click__Edit();
    

    TestModellerLogger.SetLastNodeGuid("21cd4ccf-e986-47a4-95ac-282ff09e9170");
    _FAsandpre.Enter_ctl00cPHtxtPrincipalactivity("");
    

    TestModellerLogger.SetLastNodeGuid("8ffb76d1-cfbc-489f-b781-ffd3a5abfc03");
    _FAsandpre.Enter_ctl00cPHtxtAuthentication("");
    

    TestModellerLogger.SetLastNodeGuid("0a3c7d73-c9a8-4406-8619-c22302555c47");
    _FAsandpre.Enter_ctl00cPHtxtCTdistrict("");
    

    TestModellerLogger.SetLastNodeGuid("2e2ef52c-9cf7-488b-bcc1-dfd93b7f7429");
    _FAsandpre.Enter_ctl00cPHtxtCTutr("");
    

    TestModellerLogger.SetLastNodeGuid("1152106a-88df-4105-ae1b-2a88b92c0e93");
    _FAsandpre.Enter_ctl00cPHtxtCompanySecretary("Paucek, Collier and Orn");
    

    TestModellerLogger.SetLastNodeGuid("0f48c13d-fdea-483b-bcae-2bb54dde14de");
    _FAsandpre.Select_ctl00cPHddlReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("7b64552c-4033-4cf3-9693-fdb57d9e70b0");
    _FAsandpre.Select_ctl00cPHddlAccountantReportFormat("Default");
    

    TestModellerLogger.SetLastNodeGuid("4ff333dc-11a1-4d9a-8e20-49948e13f55b");
    _FAsandpre.Select_ctl00cPHddlSignatoryPartnerLmtd("John Wright");
    

    TestModellerLogger.SetLastNodeGuid("6d64ab0f-3826-404a-8787-ac9f80199fab");
    _FAsandpre.Click_radPreparedByPositionsLeft_for_ctl00cPHPreparedBy();
    

    TestModellerLogger.SetLastNodeGuid("5ea81e49-4d4d-467a-9cf3-e44414b762a5");
    _FAsandpre.Enter_ctl00cPHtxtAddress1("232 Vida Glens, Borermouth, Italy");
    

    TestModellerLogger.SetLastNodeGuid("40111908-6fac-463d-8e5d-7fe502eb25dc");
    _FAsandpre.Enter_ctl00cPHtxtAddress2("65377 Dooley Neck, Adellafurt, Turkmenistan");
    

    TestModellerLogger.SetLastNodeGuid("9dddf8b3-4251-4a16-886c-432ad5be56dd");
    _FAsandpre.Enter_ctl00cPHtxtAddress3("9679 Corkery Pines, Mariaville, Cameroon");
    

    TestModellerLogger.SetLastNodeGuid("0371e4a3-65e0-46e0-ab30-d0c8f3c98491");
    _FAsandpre.Enter_ctl00cPHtxtAddress4("8203 Will Land, South Willow, Holy See (Vatican City State)");
    

    TestModellerLogger.SetLastNodeGuid("d831cee3-f3c2-4127-8f77-152cce354360");
    _FAsandpre.Enter_ctl00cPHtxtRegFAPostCode("03956-4374");
    

    TestModellerLogger.SetLastNodeGuid("8698b588-3961-4850-8f98-e2ad1251c146");
    _FAsandpre.Click__Save__1();
    

    TestModellerLogger.SetLastNodeGuid("47a3202d-f2c3-482f-bc60-7f90f6fee54a");
    _FAsandpre.Click_Final_Accounts();
    

    TestModellerLogger.SetLastNodeGuid("91fd0280-4089-4a2a-a55c-38ac42f5d013");
    _FAsandpre.Click_Full_Accounts();
    

    }

}
