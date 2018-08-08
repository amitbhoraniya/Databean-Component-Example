package com.qmetry.qaf.example.steps;

import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.step.CommonStep;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.example.beans.UserBean;

public class HomePageSteps {

	@QAFTestStep(description = "I register user with {0} details")
	public void register(String key) {
		CommonStep.click("homepage.register.link");
		CommonStep.waitForVisible("homepage.regiter.username.textfield");
		UserBean bean = new UserBean();
		if (key.equalsIgnoreCase("random")) {
			bean.fillRandomData();
		} else {
			bean.fillFromConfig(key);
		}
		bean.fillUiElements();
		ConfigurationManager.getBundle().setProperty("loggedin.user",bean);
	}
}
