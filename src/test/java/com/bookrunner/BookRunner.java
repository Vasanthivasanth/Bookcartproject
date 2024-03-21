package com.bookrunner;

import org.junit.runner.RunWith;

import com.Base.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber\\src\\main\\java\\com\\feature\\bookscenariooutline.feature"},
dryRun=!true,
glue= "com.bookstep",
monochrome=false,
snippets=SnippetType.CAMELCASE,
//tags= "@smoke",
plugin={"pretty","json:reports/book.json","html:Report/Book.html"})

public class BookRunner extends BaseClass{

}
