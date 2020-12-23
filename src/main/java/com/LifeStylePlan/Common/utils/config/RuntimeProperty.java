package com.LifeStylePlan.Common.utils.config;

public enum RuntimeProperty {
	     APP_URL("app.url"),
	    WEBDRIVER_TIMEOUT("webdriver.timeout"),
	    ADMIN_USERNAME("username"),
	    ADMIN_PASSWORD("password"),
	    PIPELINE_ENVIRONMENT("environment"),
	    DATASOURCES_FILE("datasources.file"),
	    WEBDRIVER_CAPABILITIES("webconfig");

	    private String key;

	    RuntimeProperty(String key) { this.key = key; }

	    public String getKey() { return this.key; }

}
