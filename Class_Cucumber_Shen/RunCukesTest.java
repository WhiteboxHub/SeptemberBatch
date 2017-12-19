package com.wbl;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/feature"},
                 glue={"com.wbl.stepdefinition"},
                 dryRun=true
                 )
public class RunCukesTest {

}
