package co.com.falabella;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = "co.com.falabella.stepdefinitions",
        features = "src/test/resources/features"
)
public class CucumberTestSuite {}
