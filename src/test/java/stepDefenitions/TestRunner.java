package stepDefenitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"stepDefenitions"},
monochrome=true, 
tags = "@smoke",
plugin={"pretty","html:target/HtmlReportss/index.html",
		"json:target/JSONReports/report.json",
		"junit:target/JUnitReports/report.xml"}

)
public class TestRunner {

}