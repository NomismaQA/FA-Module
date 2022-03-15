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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/deb71d98-78b6-45fc-b551-f2da310bf3a3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1606, profileId = 101745)
public class CompanySetting_DefaultProfile extends TestBase
{
    

    
    @Test  (groups= {"CompanySetting","CompanySetting - Default Profile"})
    @TestModellerPath(guid = "f3a66d6c-355e-445b-91fb-9ace841b6501")
    public void GoToUrlAssertUrlClickSettingsClickAccountsSettingsClickEdit2PositiveSelectReportingStdTypeCli()
    {
        
        pages.CompanySetting _CompanySetting = new pages.CompanySetting(driver);
    TestModellerLogger.SetLastNodeGuid("21999d67-ce8c-45de-85d6-7551c72c8839");
    _CompanySetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e7088568-ffdf-41d2-a5f0-db00d0819f70");
    _CompanySetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2c47f548-5154-4745-8bc4-e12cd1f9f4b9");
    _CompanySetting.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("0b127633-dffa-4848-96a6-d93548100608");
    _CompanySetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d8b718a3-018f-4645-804a-ab7f017fbfcc");
    _CompanySetting.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("184f2176-86b2-4fc8-8163-2907b7e55cde");
    _CompanySetting.Select_ReportingStdType("MicroEntity (FRS 105)");
    

    TestModellerLogger.SetLastNodeGuid("19c894fb-aa06-4dd3-b552-c14e8a6cae3c");
    _CompanySetting.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("30fdaab7-7487-473a-a42b-b0503a95786c");
    _CompanySetting.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("77eed95b-cc25-4019-a6be-b77ac9f8c84d");
    _CompanySetting.Click_Save_Button();
    

    }

    @Test  (groups= {"CompanySetting","CompanySetting - Default Profile"})
    @TestModellerPath(guid = "a05cb252-eb1e-4d35-86a6-659263c80803")
    public void GoToUrlAssertUrlClickSettingsClickAccountsSettingsClickEdit2PositiveSelectReportingStdTypeCli1()
    {
        
        pages.CompanySetting _CompanySetting = new pages.CompanySetting(driver);
    TestModellerLogger.SetLastNodeGuid("21999d67-ce8c-45de-85d6-7551c72c8839");
    _CompanySetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e7088568-ffdf-41d2-a5f0-db00d0819f70");
    _CompanySetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2c47f548-5154-4745-8bc4-e12cd1f9f4b9");
    _CompanySetting.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("0b127633-dffa-4848-96a6-d93548100608");
    _CompanySetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d8b718a3-018f-4645-804a-ab7f017fbfcc");
    _CompanySetting.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("184f2176-86b2-4fc8-8163-2907b7e55cde");
    _CompanySetting.Select_ReportingStdType("SmallEntity (FRS 102 1A)");
    

    TestModellerLogger.SetLastNodeGuid("19c894fb-aa06-4dd3-b552-c14e8a6cae3c");
    _CompanySetting.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("30fdaab7-7487-473a-a42b-b0503a95786c");
    _CompanySetting.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("77eed95b-cc25-4019-a6be-b77ac9f8c84d");
    _CompanySetting.Click_Save_Button();
    

    }

    @Test  (groups= {"CompanySetting","CompanySetting - Default Profile"})
    @TestModellerPath(guid = "22206c1e-8e07-4829-8216-9d534dff946c")
    public void GoToUrlAssertUrlClickSettingsClickAccountsSettingsClickEdit2PositiveSelectReportingStdTypeCli2()
    {
        
        pages.CompanySetting _CompanySetting = new pages.CompanySetting(driver);
    TestModellerLogger.SetLastNodeGuid("21999d67-ce8c-45de-85d6-7551c72c8839");
    _CompanySetting.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("e7088568-ffdf-41d2-a5f0-db00d0819f70");
    _CompanySetting.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("2c47f548-5154-4745-8bc4-e12cd1f9f4b9");
    _CompanySetting.Click__Settings_();
    

    TestModellerLogger.SetLastNodeGuid("0b127633-dffa-4848-96a6-d93548100608");
    _CompanySetting.Click_Accounts_Settings();
    

    TestModellerLogger.SetLastNodeGuid("d8b718a3-018f-4645-804a-ab7f017fbfcc");
    _CompanySetting.Click_Edit2();
    

    TestModellerLogger.SetLastNodeGuid("184f2176-86b2-4fc8-8163-2907b7e55cde");
    _CompanySetting.Select_ReportingStdType("Dormant");
    

    TestModellerLogger.SetLastNodeGuid("19c894fb-aa06-4dd3-b552-c14e8a6cae3c");
    _CompanySetting.Click_chkCharitDonations();
    

    TestModellerLogger.SetLastNodeGuid("30fdaab7-7487-473a-a42b-b0503a95786c");
    _CompanySetting.Click_chkDirectorsYear();
    

    TestModellerLogger.SetLastNodeGuid("77eed95b-cc25-4019-a6be-b77ac9f8c84d");
    _CompanySetting.Click_Save_Button();
    

    }

}