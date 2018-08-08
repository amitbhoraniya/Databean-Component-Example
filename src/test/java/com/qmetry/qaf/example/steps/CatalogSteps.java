package com.qmetry.qaf.example.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.example.comp.Catalog;

public class CatalogSteps {

	@QAFTestStep(description = "I select product {0}")
	public void selectProduct(String productName) {
		Catalog cat = new Catalog();
		cat.selectByName(productName);
	}
}
