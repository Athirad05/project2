package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.constants.Report;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources\\features",glue="com.stepdef",dryRun=false,
monochrome=true,plugin= {"rerun:target/failed_scenarios.txt","pretty",
	"html:C:\\Users\\user\\eclipse-workspace\\OrangeHrm\\target",
	"json:C:\\Users\\user\\eclipse-workspace\\OrangeHrm\\target\\sample.json",
	"junit:C:\\Users\\user\\eclipse-workspace\\OrangeHrm\\target\\sample.xml"})

public class TestRunner {
	
	
	@AfterClass
	public static void afterclass() {
		Report.JVMReport("C:\\Users\\user\\eclipse-workspace\\OrangeHrm\\target\\sample.json");

		
	}
	
	
	

}

//src\\test\\resources\\features

//src\test\resources