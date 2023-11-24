package com.runner;


import com.base_package.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91960\\IdeaProjects\\Para_Bank\\src\\test\\feature.folder\\Parabank.feature",
glue= "com.step_def", dryRun = false,plugin = {"pretty","junit:Report\\target\\juintReport\\junit.xml"})

public class Runner extends BaseClass {

    @BeforeClass
    public static void start(){
  driver = new ChromeDriver();
    }
}
