package book.com;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\src\\main\\java\\book\\com\\book.feature"},
dryRun=!true,
glue= "book.com",
snippets=SnippetType.CAMELCASE,
monochrome=true,
plugin= {"pretty","html:htmlreport","json:report/book.json"}
//tags = " @tag"
)

public class BookRunner {

}
