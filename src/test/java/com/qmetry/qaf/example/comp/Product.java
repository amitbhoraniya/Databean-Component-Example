package com.qmetry.qaf.example.comp;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class Product extends QAFWebComponent {

	@FindBy(locator="css=.front")
	private QAFWebElement img;
	
	@FindBy(locator="css=h3 a")
	private QAFWebElement name;
	
	@FindBy(locator="css=.price")
	private QAFWebElement price;
	
	@FindBy(locator="css=.btn-primary")
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
