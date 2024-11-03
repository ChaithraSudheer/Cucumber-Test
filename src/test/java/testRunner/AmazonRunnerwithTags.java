package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFile/Amazon.feature",
                 glue="stepdef",
                 tags="@All",
                 publish=true)
public class AmazonRunnerwithTags {

}
