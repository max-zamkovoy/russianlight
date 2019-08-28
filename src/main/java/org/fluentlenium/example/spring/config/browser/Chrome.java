package org.fluentlenium.example.spring.config.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

class Chrome implements IBrowser {

    @Override
    public Capabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("76.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        return capabilities;
    }

    @Override
    public String getDriverExecutableName() {
        return "chromedriver";
    }

    @Override
    public String getDriverSystemPropertyName() {
        return "webdriver.chrome.driver";
    }

    @Override
    public String toString() {
        return "Chrome";
    }
}
