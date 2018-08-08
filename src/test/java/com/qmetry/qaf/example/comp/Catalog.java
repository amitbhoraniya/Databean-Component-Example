package com.qmetry.qaf.example.comp;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;

/**
 * @author amit.bhoraniya
 *
 */
public class Catalog extends QAFWebComponent {

	@FindBy(locator = "catalog.product.comp")
	List<Product> products;

	public List<Product> getProducts() {
		return products;
	}

	public Catalog() {
		super("catalog.comp");
	}

	public void selectByName(String name) {
		List<Product> prods = getProducts();
		for (Product prod : prods) {
			if (prod.getName().getText().equalsIgnoreCase(name)) {
				prod.getName().click();
				break;
			}
		}
	}

}
