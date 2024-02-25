package runners;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines(value = "cucumber")
@SelectClasspathResource(value = "features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME,value = "steps")
@IncludeTags({"payments","lessons"})

public class PaymentsRunner {
}
