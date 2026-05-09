package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
		
//"./src/test/resources/features/0000/Login.feature",
"./src/test/resources/features/0000/GetPetData.feature",
//"./src/test/resources/features/0000/PostPet.feature",

},
// To generate the step definition class
		//dryRun=true,
		strict = true, 
		glue = { "stepDefinitions" }, 
		tags = { "@Regression" }, 
		//tags = { "-@Div" }, 
		plugin = { "pretty",
				"json:target/cucumber.json", "junit:target/cucumber.xml",
				"html:target/cucumber-html-reports" }, monochrome = true, stepNotifications = true)
public class TestRunner {

}