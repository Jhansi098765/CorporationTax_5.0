package com.Capium.RunnerFiles;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="D:\\CT 5.0\\CorporationTax_5.0\\src\\test\\resources\\FeatureFiles\\LoginFeature.feature",
            glue="com.Capium.StepDefination" ,
            plugin= {"pretty",
            		"html:target/cucumber-reports/CucumberReport.html", "json:target/cucumber-reports/CucumberReport.json",
    				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
   