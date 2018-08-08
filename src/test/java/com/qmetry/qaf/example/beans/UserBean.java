package com.qmetry.qaf.example.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;
import com.qmetry.qaf.automation.util.Randomizer;

public class UserBean extends BaseFormDataBean {

	@UiElement(fieldLoc = "homepage.regiter.username.textfield", order = 1)
	@Randomizer
	private String username;

	@UiElement(fieldLoc = "homepage.regiter.firstname.textfield", order = 2)
	@Randomizer
	private String firstName;

	@UiElement(fieldLoc = "homepage.regiter.lastname.textfield", order = 3)
	@Randomizer
	private String lastName;

	@UiElement(fieldLoc = "homepage.regiter.email.textfield", order = 4)
	@Randomizer(suffix = "@gmail.com")
	private String email;

	@UiElement(fieldLoc = "homepage.regiter.password.textfield", order = 5)
	@Randomizer
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserBean [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", password=" + password + "]";
	}

}
