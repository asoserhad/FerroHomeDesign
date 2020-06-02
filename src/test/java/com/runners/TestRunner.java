package com.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/steps"
		,dryRun=false
		,monochrome=true
		,tags= {"@smoke"}
		)


public class TestRunner {

}
