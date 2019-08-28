package org.fluentlenium.example.spring.config.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

class Firefox implements IBrowser {

    @Override
    public Capabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("firefox");
        capabilities.setVersion("68.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }

    @Override
    public String getDriverExecutableName() {
        return "geckodriver";
    }

    @Override
    public String getDriverSystemPropertyName() {
        return "webdriver.gecko.driver";
    }

    @Override
    public String toString() {
        return "Firefox";
    }
}
