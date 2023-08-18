package testt;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "testt", plugin = {"html:target/report.html","json:target/reports.json"}, dryRun = false, monochrome = true, tags = "@sanity"
//tags = {"smoke,sanity"} or
//tags = {"smoke","sanity"} and
)
public class TestRunner {

}
