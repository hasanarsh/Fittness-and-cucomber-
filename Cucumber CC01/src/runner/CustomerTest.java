package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="featuresforCC",glue= {"stepsTest"})
public class CustomerTest {

}


