package com.wbl;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/feature"},
                 glue={"com.wbl.stepdefinition"},
                 dryRun=false,
                 tags={"@NavigateLinks"})
//tags={"@NavigateLinks,@SearchItems"}  -- both scenarios will be executed OR
//tags={"@NavigateLinks","@SearchItems"}
   //-- scenario with both tags will only be executed  AND
//tags={"@NavigateLinks,@SearchItems, ~@FindStore"} --  ~ ignore the scenario

public class RunCukesTest {

}
