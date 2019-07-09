package com.qa.freecrmbdd.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:/naveenAuto/freecrmbddcucumberframework/src/main/java/com/qa/freecrmbdd/featurefile/createcontact.feature",
		//where is festure file available
		glue={"com.qa.freecrmbdd.stepdefination"}
		//where step defination
		//dryRun=true,
		//it eill check feature file lines with ste definiation function
		//Format={"pretty","html:test-output"}
		//monochrome=true,
		//it will print on console a readable output
		//format={"pretty","html:test-output"} json junit all report
		//strict=true
		//if everything perfect then only it will run
		)

public class TestRunner {

}
