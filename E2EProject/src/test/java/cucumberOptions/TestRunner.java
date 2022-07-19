package cucumberOptions;


//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features/login.feature",
		glue="stepDefination")
public class TestRunner extends AbstractTestNGCucumberTests {

}
