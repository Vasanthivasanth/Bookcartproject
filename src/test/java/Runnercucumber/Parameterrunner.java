package Runnercucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\src\\main\\java\\feature\\parameter.feature"},
glue="Stepdefinition",
dryRun=false,
snippets=SnippetType.CAMELCASE,
monochrome=true,
plugin= {"pretty"})
public class Parameterrunner {

}
