package br.com.controleweb;

import org.openqa.selenium.WebDriver;

public abstract class WebTela {
	private WebDriver webDriver;

	public WebTela(WebDriver webDriver) {
		this.webDriver = webDriver;
	}
}
