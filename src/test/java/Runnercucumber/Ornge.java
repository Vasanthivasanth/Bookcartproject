package Runnercucumber;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/feature"},
dryRun=false,
glue="Stepdefinition",
snippets=SnippetType.CAMELCASE,
monochrome=true)
public class Ornge extends AbstractTestNGCucumberTests {
}
