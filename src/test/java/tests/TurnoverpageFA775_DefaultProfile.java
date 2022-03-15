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

//https://nomisma.cloud.testinsights.io/app/#!/model-engine/guid/a44e600b-4ca0-49bb-bdef-91b8d5b0307d
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 1529, profileId = 101526)
public class TurnoverpageFA775_DefaultProfile extends TestBase
{
	ExcelUtils ExUtils;
	String sTestCaseID=null;
	String[] sData=null;

    
    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "a5297aea-8127-4bb5-8179-d268bd525740")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS() throws InvalidFormatException
    {
    	ExUtils = new ExcelUtils();
		sTestCaseID="TurnoverpageFA775_DefaultProfile";
		sData = ExcelUtils.toReadExcelData1(sTestCaseID);
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "6224befe-3da5-4b08-b87c-0581cb6419d9")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS1()
    {
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Apr 2020 - Apr 2021");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "03c2cd9c-e5a5-40ed-b545-01eb1fb097c5")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS2()
    {
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Oct 2018 - Apr 2020");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "cdd6f796-b0fb-4e01-a3d6-33654da0c76b")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS3()
    {
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Apr 2018 - Oct 2018");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "2184784e-35fb-4ef1-a365-efb7b6afbd9c")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS4()
    {
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Apr 2020 - Apr 2021");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "ac3a20b9-bf59-449b-9996-40dbce5c0299")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS5()
    {
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Oct 2018 - Apr 2020");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

    @Test  (groups= {"TurnoverpageFA775","TurnoverpageFA775 - Default Profile"})
    @TestModellerPath(guid = "eb0fb7f4-96ae-42ac-9922-9651eb441d56")
    public void GoToUrlAssertUrlPositiveSelectSelectFinancialYearPositiveSelectSelectFinancialYear2ClickIncomeS6()
    {
        
        pages.TurnoverpageFA775 _TurnoverpageFA775 = new pages.TurnoverpageFA775(driver);
    TestModellerLogger.SetLastNodeGuid("fe84b121-db3d-4d7d-b5d3-365fa3bda404");
    _TurnoverpageFA775.GoToUrl();
    

    TestModellerLogger.SetLastNodeGuid("8be077cc-b660-4f9e-b6ec-54921f4b6e86");
    _TurnoverpageFA775.AssertUrl();
    

    TestModellerLogger.SetLastNodeGuid("93488374-398e-4ea7-bb39-9ea56be63d67");
    _TurnoverpageFA775.Select_Select_Financial_Year("Apr 2018 - Oct 2018");
    

    TestModellerLogger.SetLastNodeGuid("85a42ce2-4556-4147-bf76-512c3df8c3bd");
    _TurnoverpageFA775.Select_Select_Financial_Year2("Apr 2021 - Apr 2022");
    

    TestModellerLogger.SetLastNodeGuid("1877822b-6624-42ce-86dd-0ec01bb8b1eb");
    _TurnoverpageFA775.Click_Income_Statement_Page();
    

    TestModellerLogger.SetLastNodeGuid("7df754cb-1ea1-4613-94d2-e138b28f9a12");
    _TurnoverpageFA775.Click_Turnover_value();
    

    TestModellerLogger.SetLastNodeGuid("413ec62b-8eeb-45ef-98b6-2c015d0f6c32");
    _TurnoverpageFA775.Click_Sales1();
    

    }

}
