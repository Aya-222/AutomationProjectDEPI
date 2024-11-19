package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/main/resources/Features",
        glue = {"testCase"},
        plugin = {"pretty" , "html:target/TestReport.html"}
//        tags = "@Smoke"
)

public class testCasesRunner extends AbstractTestNGCucumberTests {
}