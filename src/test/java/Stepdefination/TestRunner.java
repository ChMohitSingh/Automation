package Stepdefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\mohit chaudhary\\eclipse-workspace\\week1230Maven\\src\\test\\resources\\featureFile\\fullsignup.feature", glue="Stepdefination",
monochrome=true,
plugin={"html:src/test/resources/target/reports2.html"}
		)
public class TestRunner {

}
