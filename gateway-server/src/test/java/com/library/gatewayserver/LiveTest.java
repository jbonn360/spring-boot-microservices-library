package com.library.gatewayserver;

import org.aspectj.lang.annotation.Before;

import io.restassured.RestAssured;
import io.restassured.authentication.FormAuthConfig;
import io.restassured.config.RedirectConfig;

import static io.restassured.RestAssured.config;

public class LiveTest {
	private final String ROOT_URI = "http://localhost:8080";
	private FormAuthConfig formConfig = new FormAuthConfig("/login", "username", "password");

	@Before
	public void setup() {
		RestAssured.config = config().redirect(

				RedirectConfig.redirectConfig().followRedirects(false));
	}
}
