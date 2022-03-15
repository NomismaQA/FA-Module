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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/53accc5e-d687-43e4-88b2-8e200b6a11de
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 788, profileId = 100678)
public class Clientadd_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"Clientadd","Clientadd - Default Profile"})
    @TestModellerPath(guid = "027bbc8c-a9ec-4d8d-8ddd-efb77d201799")
    public void GoToUrlAssertUrlClickBusinessesClickNewClientClickLimitedCompanyClickLimitedCompanyPositiveEn1()
    {
        
        pages.Clientadd _Clientadd = new pages.Clientadd(driver);
    TestModellerLogger.SetLastNodeGuid("173586a8-faa2-4179-a6ff-917d2c1f177b");
    _Clientadd.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b465566c-19fc-44e8-aa3b-1f434ec3d30f");
    _Clientadd.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b497d75c-2555-4da0-a8d5-3d8278edc1a3");
    _Clientadd.Click_Businesses();
    

    TestModellerLogger.SetLastNodeGuid("12a90fc3-3bcb-472e-bd09-c5fc5a9a1577");
    _Clientadd.Click__New_Client();
    

    TestModellerLogger.SetLastNodeGuid("167c3f20-4a77-4898-af6f-268033b65f1c");
    _Clientadd.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("5ca51065-4a7a-49be-97c0-57d183bf3166");
    _Clientadd.Click_Limited_Company_1();
    

    TestModellerLogger.SetLastNodeGuid("2f1ea797-aa31-491b-a5fb-3f3969bb4133");
    _Clientadd.Enter_Businessname("unde");
    

    TestModellerLogger.SetLastNodeGuid("dfd66919-5e60-440a-934a-306518bf3acd");
    _Clientadd.Enter_RegistrationNumber("100");
    

    TestModellerLogger.SetLastNodeGuid("062a813b-3432-426b-bb53-2281a262517d");
    _Clientadd.Enter_RegistrationDate("44207");
    

    TestModellerLogger.SetLastNodeGuid("18cb1d73-908d-4ec6-8ee8-985fe6aa0d80");
    _Clientadd.Enter_FirstName("Kaylee");
    

    TestModellerLogger.SetLastNodeGuid("29e4c266-3f23-4f26-97a9-8380c0a45ede");
    _Clientadd.Enter_LastName("Jakubowski");
    

    TestModellerLogger.SetLastNodeGuid("97879a22-e648-4572-93c2-ec61a638a570");
    _Clientadd.Click_if_director_is_also_an_employee_in_the_companybutton();
    

    TestModellerLogger.SetLastNodeGuid("0911c5bb-9b6f-425f-9efe-a3410efa2b8e");
    _Clientadd.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("a6b98baf-e299-41ef-a480-e6dbbca45d90");
    _Clientadd.Enter_Searchclient("");
    

    TestModellerLogger.SetLastNodeGuid("14139bfd-31a4-4096-a876-e5956adc2c47");
    _Clientadd.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("4e35ad20-c4a2-4410-a80b-be7dbdab77de");
    _Clientadd.Click__DITYA_SOFTWARES_LTD_();
    

    }

    @Test  (groups= {"Clientadd","Clientadd - Default Profile"})
    @TestModellerPath(guid = "c8014ea1-b084-4cb7-a3bb-f80927edbbb7")
    public void GoToUrlAssertUrlClickBusinessesClickNewClientClickLimitedCompanyClickLimitedCompanyPositiveEn2()
    {
        
        pages.Clientadd _Clientadd = new pages.Clientadd(driver);
    TestModellerLogger.SetLastNodeGuid("173586a8-faa2-4179-a6ff-917d2c1f177b");
    _Clientadd.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b465566c-19fc-44e8-aa3b-1f434ec3d30f");
    _Clientadd.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b497d75c-2555-4da0-a8d5-3d8278edc1a3");
    _Clientadd.Click_Businesses();
    

    TestModellerLogger.SetLastNodeGuid("12a90fc3-3bcb-472e-bd09-c5fc5a9a1577");
    _Clientadd.Click__New_Client();
    

    TestModellerLogger.SetLastNodeGuid("167c3f20-4a77-4898-af6f-268033b65f1c");
    _Clientadd.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("5ca51065-4a7a-49be-97c0-57d183bf3166");
    _Clientadd.Click_Limited_Company_1();
    

    TestModellerLogger.SetLastNodeGuid("2f1ea797-aa31-491b-a5fb-3f3969bb4133");
    _Clientadd.Enter_Businessname("autem");
    

    TestModellerLogger.SetLastNodeGuid("dfd66919-5e60-440a-934a-306518bf3acd");
    _Clientadd.Enter_RegistrationNumber("100");
    

    TestModellerLogger.SetLastNodeGuid("062a813b-3432-426b-bb53-2281a262517d");
    _Clientadd.Enter_RegistrationDate("44207.414754791665");
    

    TestModellerLogger.SetLastNodeGuid("18cb1d73-908d-4ec6-8ee8-985fe6aa0d80");
    _Clientadd.Enter_FirstName("Minnie");
    

    TestModellerLogger.SetLastNodeGuid("29e4c266-3f23-4f26-97a9-8380c0a45ede");
    _Clientadd.Enter_LastName("Ritchie");
    

    TestModellerLogger.SetLastNodeGuid("97879a22-e648-4572-93c2-ec61a638a570");
    _Clientadd.Click_if_director_is_also_an_employee_in_the_companybutton();
    

    TestModellerLogger.SetLastNodeGuid("0911c5bb-9b6f-425f-9efe-a3410efa2b8e");
    _Clientadd.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("a6b98baf-e299-41ef-a480-e6dbbca45d90");
    _Clientadd.Enter_Searchclient("");
    

    TestModellerLogger.SetLastNodeGuid("14139bfd-31a4-4096-a876-e5956adc2c47");
    _Clientadd.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("4e35ad20-c4a2-4410-a80b-be7dbdab77de");
    _Clientadd.Click__DITYA_SOFTWARES_LTD_();
    

    }

    @Test  (groups= {"Clientadd","Clientadd - Default Profile"})
    @TestModellerPath(guid = "07f0a29d-bb7f-4ad3-b623-5136bf37edf3")
    public void GoToUrlAssertUrlClickBusinessesClickNewClientClickLimitedCompanyClickLimitedCompanyPositiveEn3()
    {
        
        pages.Clientadd _Clientadd = new pages.Clientadd(driver);
    TestModellerLogger.SetLastNodeGuid("173586a8-faa2-4179-a6ff-917d2c1f177b");
    _Clientadd.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("b465566c-19fc-44e8-aa3b-1f434ec3d30f");
    _Clientadd.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("b497d75c-2555-4da0-a8d5-3d8278edc1a3");
    _Clientadd.Click_Businesses();
    

    TestModellerLogger.SetLastNodeGuid("12a90fc3-3bcb-472e-bd09-c5fc5a9a1577");
    _Clientadd.Click__New_Client();
    

    TestModellerLogger.SetLastNodeGuid("167c3f20-4a77-4898-af6f-268033b65f1c");
    _Clientadd.Click_Limited_Company();
    

    TestModellerLogger.SetLastNodeGuid("5ca51065-4a7a-49be-97c0-57d183bf3166");
    _Clientadd.Click_Limited_Company_1();
    

    TestModellerLogger.SetLastNodeGuid("2f1ea797-aa31-491b-a5fb-3f3969bb4133");
    _Clientadd.Enter_Businessname("voluptates");
    

    TestModellerLogger.SetLastNodeGuid("dfd66919-5e60-440a-934a-306518bf3acd");
    _Clientadd.Enter_RegistrationNumber("100");
    

    TestModellerLogger.SetLastNodeGuid("062a813b-3432-426b-bb53-2281a262517d");
    _Clientadd.Enter_RegistrationDate("44207.414754791665");
    

    TestModellerLogger.SetLastNodeGuid("18cb1d73-908d-4ec6-8ee8-985fe6aa0d80");
    _Clientadd.Enter_FirstName("Damaris");
    

    TestModellerLogger.SetLastNodeGuid("29e4c266-3f23-4f26-97a9-8380c0a45ede");
    _Clientadd.Enter_LastName("Kerluke");
    

    TestModellerLogger.SetLastNodeGuid("97879a22-e648-4572-93c2-ec61a638a570");
    _Clientadd.Click_if_director_is_also_an_employee_in_the_companybutton();
    

    TestModellerLogger.SetLastNodeGuid("0911c5bb-9b6f-425f-9efe-a3410efa2b8e");
    _Clientadd.Click_SaveButton();
    

    TestModellerLogger.SetLastNodeGuid("a6b98baf-e299-41ef-a480-e6dbbca45d90");
    _Clientadd.Enter_Searchclient("");
    

    TestModellerLogger.SetLastNodeGuid("14139bfd-31a4-4096-a876-e5956adc2c47");
    _Clientadd.Click_Searchbutton();
    

    TestModellerLogger.SetLastNodeGuid("4e35ad20-c4a2-4410-a80b-be7dbdab77de");
    _Clientadd.Click__DITYA_SOFTWARES_LTD_();
    

    }

}
