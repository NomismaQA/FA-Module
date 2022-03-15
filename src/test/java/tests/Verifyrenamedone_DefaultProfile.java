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

//http://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/ddb1224d-b853-4560-a7ec-655b34ad934b
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 867, profileId = 100746)
public class Verifyrenamedone_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"Verifyrenamedone","Verifyrenamedone - Default Profile"})
    @TestModellerPath(guid = "0d6b1154-a075-4b67-9232-bc24ef48e427")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP1() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="Verifyrenamedone_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.Verifyrenamedone _Verifyrenamedone = new pages.Verifyrenamedone(driver);
    TestModellerLogger.SetLastNodeGuid("bbdbb4cc-a920-4eab-a0e9-3e46f1609e02");
    _Verifyrenamedone.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("02df6a02-7bc2-4dff-886f-ac74e7105100");
    _Verifyrenamedone.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a6ac2bc3-5897-489a-af97-30f0cfca5439");
    _Verifyrenamedone.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("28529745-b6a0-4ed2-897b-f654dcaf0f61");
    _Verifyrenamedone.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("fb5d85e8-9a7f-41e4-8716-bffecd76e468");
    _Verifyrenamedone.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ee4bc414-e008-4692-b766-89cf9536b77d");
    _Verifyrenamedone.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("eda7df7b-51f1-4907-90e2-a933887dc1d0");
    _Verifyrenamedone.Click_Search_button();
    

    TestModellerLogger.SetLastNodeGuid("80f86e85-9aa0-4dd4-8d69-623fac0c7f3b");
    _Verifyrenamedone.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c6e57cff-92d8-4c0f-8d42-aea97f77aa23");
    _Verifyrenamedone.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("2c016f05-0a93-4c4f-be2d-400862a7751a");
    _Verifyrenamedone.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("f655029a-c0a4-4a1d-803f-2c175037fc1d");
    _Verifyrenamedone.Select_ctl00ctl00ParentContentcPHFilterddlType("Show All");
    

    TestModellerLogger.SetLastNodeGuid("9745d639-597b-4cf8-878b-a4f08517516e");
    _Verifyrenamedone.Click_Search_button_1();
    

    TestModellerLogger.SetLastNodeGuid("7e87c464-209e-4a81-9b43-c4195bc03bb9");
    _Verifyrenamedone.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("55900919-05f8-4800-bf4e-20f38a16137e");
    _Verifyrenamedone.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("10b0d52a-8ea6-4869-804d-54421a6898d6");
    _Verifyrenamedone.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f0b7b332-6ac2-4ec0-8e69-46eb33797bc1");
    _Verifyrenamedone.Click_Full_Accounts();
    

    }

    @Test  (groups= {"Verifyrenamedone","Verifyrenamedone - Default Profile"})
    @TestModellerPath(guid = "885cc88d-1895-46f4-b096-f61fc097a53d")
    public void GoToUrlAssertUrlPositiveEnterUsernamePositiveEnterPasswordClickLoginButtonPositiveEnterctl00cP2()
    {
        
        pages.Verifyrenamedone _Verifyrenamedone = new pages.Verifyrenamedone(driver);
    TestModellerLogger.SetLastNodeGuid("bbdbb4cc-a920-4eab-a0e9-3e46f1609e02");
    _Verifyrenamedone.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("02df6a02-7bc2-4dff-886f-ac74e7105100");
    _Verifyrenamedone.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("a6ac2bc3-5897-489a-af97-30f0cfca5439");
    _Verifyrenamedone.Enter_Username(sData[1]);
    

    TestModellerLogger.SetLastNodeGuid("28529745-b6a0-4ed2-897b-f654dcaf0f61");
    _Verifyrenamedone.Enter_Password(sData[2]);
    

    TestModellerLogger.SetLastNodeGuid("fb5d85e8-9a7f-41e4-8716-bffecd76e468");
    _Verifyrenamedone.Click_Login_Button();
    

    TestModellerLogger.SetLastNodeGuid("ee4bc414-e008-4692-b766-89cf9536b77d");
    _Verifyrenamedone.Enter_ctl00cPHFiltertxtAgentName(sData[3]);
    

    TestModellerLogger.SetLastNodeGuid("eda7df7b-51f1-4907-90e2-a933887dc1d0");
    _Verifyrenamedone.Click_Search_button();
    

    TestModellerLogger.SetLastNodeGuid("80f86e85-9aa0-4dd4-8d69-623fac0c7f3b");
    _Verifyrenamedone.Click__Nakul_();
    

    TestModellerLogger.SetLastNodeGuid("c6e57cff-92d8-4c0f-8d42-aea97f77aa23");
    _Verifyrenamedone.Click_Clients();
    

    TestModellerLogger.SetLastNodeGuid("2c016f05-0a93-4c4f-be2d-400862a7751a");
    _Verifyrenamedone.Enter_ctl00ctl00ParentContentcPHFiltertxtSearchCompany(sData[4].trim());
    

    TestModellerLogger.SetLastNodeGuid("f655029a-c0a4-4a1d-803f-2c175037fc1d");
    _Verifyrenamedone.Select_ctl00ctl00ParentContentcPHFilterddlType("LLP");
    

    TestModellerLogger.SetLastNodeGuid("9745d639-597b-4cf8-878b-a4f08517516e");
    _Verifyrenamedone.Click_Search_button_1();
    

    TestModellerLogger.SetLastNodeGuid("7e87c464-209e-4a81-9b43-c4195bc03bb9");
    _Verifyrenamedone.Click__Test_Co();
    

    TestModellerLogger.SetLastNodeGuid("55900919-05f8-4800-bf4e-20f38a16137e");
    _Verifyrenamedone.Click_Final_Accounts1();
    

    TestModellerLogger.SetLastNodeGuid("10b0d52a-8ea6-4869-804d-54421a6898d6");
    _Verifyrenamedone.Click_Final_Accounts2();
    

    TestModellerLogger.SetLastNodeGuid("f0b7b332-6ac2-4ec0-8e69-46eb33797bc1");
    _Verifyrenamedone.Click_Full_Accounts();
    

    }

}
