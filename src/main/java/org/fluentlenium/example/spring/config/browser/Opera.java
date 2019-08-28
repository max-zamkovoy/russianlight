package org.fluentlenium.example.spring.config.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

class Opera implements IBrowser {

    @Override
    public Capabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("opera");
        capabilities.setVersion("62.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }

    @Override
    public String getDriverExecutableName() {
        return "operadriver";
    }

    @Override
    public String getDriverSystemPropertyName() {
        return "webdriver.opera.driver";
    }

    @Override
    public String toString() {
        return "Opera";
    }
}
