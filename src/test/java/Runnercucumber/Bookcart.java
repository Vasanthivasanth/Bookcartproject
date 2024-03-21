package Runnercucumber;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature/book.feature"},
glue="Bookcart",
dryRun=!true,
monochrome=true,
snippets=SnippetType.CAMELCASE,
plugin= {"pretty"})
public class Bookcart extends AbstractTestNGCucumberTests {

}
