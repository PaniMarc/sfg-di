package com.example.sfgdi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//with CConfigurationProperties, we are asking for search in properties every property that starts with "guru"
//the properties file is the yaml or .properties that is active 
//the rest in automatic for exaple the variable username is filled with guru.username
@ConfigurationProperties("guru")
@Configuration
public class SfgConfiguration {

	private String username;
	private String password;
	private String jdbcurl;
	
	
	public String getUsername() {
		return username;
	}
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getJdbcurl() {
		return jdbcurl;
	}
	public void setJdbcurl(String jdbcurl) {
		this.jdbcurl = jdbcurl;
	}
}
