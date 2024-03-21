package Expression;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\src\\main\\java\\feature\\expression.feature"},
glue="Cucumberexpression",
dryRun=!true,
monochrome=true,
snippets=SnippetType.CAMELCASE,
plugin= {"pretty"}
)
public class ExpRunner {

}
