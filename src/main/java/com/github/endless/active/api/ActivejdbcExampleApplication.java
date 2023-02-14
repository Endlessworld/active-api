package com.github.endless.active.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import javax.sql.DataSource;
import java.util.ArrayList;

@EnableOpenApi
@ComponentScan("com.github.endless.**")
@SpringBootApplication
public class ActivejdbcExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivejdbcExampleApplication.class, args);
	}

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.OAS_30).apiInfo(apiInfo()).enable(true).groupName("activeJdbc").select()
		                                           .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class)).build();
	}

	@Bean
	@ConfigurationProperties("spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}

	public ApiInfo apiInfo() {
		Contact contact = new Contact("ActiveAPI", "", "934393489@qq.com");
		return new ApiInfo("Api Documentation", "Api Documentation", "1.0", "urn:tos", contact, "Apache 2.0", "http://www.apache" + ".org/licenses" +
				"/LICENSE-2.0", new ArrayList<>());
	}

}
