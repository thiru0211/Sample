package com.JetEdge.OwnerPortal.RunnerClass;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeSample\\src\\test\\resources\\FeatureFiles\\JE_OP_1_SignIn.feature",
glue = "com.JetEdge.OwnerPortal.StepDefinition",
tags="@TC_01",
//plugin = {"pretty","html:Reports/TestReport.html",
//		"json:target/cucumber-report.json",
//		"html:Reports/cucumber-reports.html" })
plugin = {"pretty",	"json:target/cucumber/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class JE_OP_1_SigninRunnerTest {
	
}
