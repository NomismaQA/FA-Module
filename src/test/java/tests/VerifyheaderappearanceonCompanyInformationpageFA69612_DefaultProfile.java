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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/8ef0f2b0-56e2-4aa7-af27-0075bf536da8
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1181, profileId = 101070)
public class VerifyheaderappearanceonCompanyInformationpageFA69612_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;
    
    @Test  (groups= {"Verify_header_appearance_on_Company_Information_pageFA69612","Verify_header_appearance_on_Company_Information_pageFA69612 - Default Profile"})
    @TestModellerPath(guid = "2839c61b-c1a4-4169-ad72-9fe382694a00")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterAgentNa() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="VerifyheaderappearanceonCompanyInformationpageFA69612_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);

        
        pages.Verify_header_appearance_on_Company_Information_pageFA69612 _Verify_header_appearance_on_Company_Information_pageFA69612 = new pages.Verify_header_appearance_on_Company_Information_pageFA69612(driver);
    TestModellerLogger.SetLastNodeGuid("48f4db65-4041-4e03-beda-a1f00963f975");
    _Verify_header_appearance_on_Company_Information_pageFA69612.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("148789f7-f186-4627-a117-1c2ac02de498");
    _Verify_header_appearance_on_Company_Information_pageFA69612.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("9d902b72-0cc7-4bdf-bc38-79c98950045d");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("78e9911f-b48e-4c7b-933a-39db8bb9a2ca");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("dd1877fe-f65b-4a15-a477-ea173534af98");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("a1987711-c950-4fdf-9be6-3c896ef60743");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Enter_AgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("87e529fb-dc9a-46b9-be09-22ad27b1906b");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click_Search_button1();
    

    TestModellerLogger.SetLastNodeGuid("75b73151-dc53-4594-b414-446544f51711");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("cd2f79b2-9ba0-42be-895e-c04c4d4e3d9d");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click__Clients_();
    

    TestModellerLogger.SetLastNodeGuid("3955e371-e585-4224-97df-fd5ae2fa8c87");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Enter_SearchCompany(sData[4]);
    

    TestModellerLogger.SetLastNodeGuid("e1ec4087-e28a-401b-ac4b-492b43a66f8b");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Select_FilterType("Limited");
    

    TestModellerLogger.SetLastNodeGuid("34a7b6ac-76cd-4f65-ac33-83ad880fa985");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click_Search_button2();
    

    TestModellerLogger.SetLastNodeGuid("7d2015dd-705c-4a67-8435-e02d25772000");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click__ABC_LTD_();
    

    TestModellerLogger.SetLastNodeGuid("d83e8da8-9b7d-4f08-bfdc-fc39a9596d36");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("8457acd1-5e79-4625-8a91-a33ff506a425");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("9e944514-f6e8-44ed-9d30-8622fde15998");
    _Verify_header_appearance_on_Company_Information_pageFA69612.Click_Full_Accounts();
    

    }

}
