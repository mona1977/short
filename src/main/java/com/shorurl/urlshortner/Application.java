package com.shorurl.urlshortner;

/*
	@Author : SURENDRA GUPTA
	@DATE : 10-DEC-2020
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@SpringBootApplication
public class Application {

	@Bean
	JdbcTemplate getJdbcTemplate() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		dataSource.setDriver(new org.apache.derby.jdbc.ClientDriver());
		String dbName = "urlshortner";
		String connectionURL = "jdbc:derby://162.30.29.134:1527/" + dbName
				+ ";create=true";
		dataSource.setUrl(connectionURL);
		dataSource.setUsername("sa");
		dataSource.setPassword("sa");
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		return jdbcTemplate;
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}