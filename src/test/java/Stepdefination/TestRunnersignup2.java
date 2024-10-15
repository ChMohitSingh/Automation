package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mohit chaudhary\\eclipse-workspace\\week1230Maven\\src\\test\\resources\\featureFile\\signup2.feature", glue="Stepdefination",
monochrome=true,
tags= "@single or @multiple",
plugin={"html:src/test/resources/target/reports3.html"}
		)
public class TestRunnersignup2 {

}
