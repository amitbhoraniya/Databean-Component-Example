package com.qmetry.qaf.example.listeners;

import org.openqa.selenium.remote.DriverCommand;

import com.qmetry.qaf.automation.ui.webdriver.CommandTracker;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriverCommandAdapter;

public class WDListener extends QAFWebDriverCommandAdapter {
	@Override
	public void afterCommand(QAFExtendedWebDriver driver, CommandTracker commandTracker) {
		if (commandTracker.getCommand().equalsIgnoreCase(DriverCommand.GET)) {
			driver.manage().window().maximize();
		}
	}

}
