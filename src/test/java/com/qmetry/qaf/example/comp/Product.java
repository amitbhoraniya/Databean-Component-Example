package com.qmetry.qaf.example.comp;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

/**
 * @author amit.bhoraniya
 *
 */
public class Product extends QAFWebComponent {

	@FindBy(locator = "catalog.product.img")
	private QAFWebElement img;

	@FindBy(locator = "catalog.product.name")
	private QAFWebElement name;

	@FindBy(locator = "catalog.product.price.txt")
	private QAFWebElement price;

	@FindBy(locator = "catalog.product.addcart.btn")
	private QAFWebElement addToCartBtn;

	public Product(String locator) {
		super(locator);
	}

	public QAFWebElement getImg() {
		return img;
	}

	public QAFWebElement getName() {
		return name;
	}

	public QAFWebElement getPrice() {
		return price;
	}

	public QAFWebElement getAddToCartBtn() {
		return addToCartBtn;
	}

}
