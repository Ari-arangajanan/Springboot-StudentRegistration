package com.sgic.student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2 
public class SwagerConfig {


	@Bean
	public Docket  SwaggerAPIConfig() {
		return new Docket(DocumentationType.SWAGGER_2)
		.select()
		.paths(PathSelectors.any())
		.apis(RequestHandlerSelectors.basePackage("com.sgic.student.controller"))
		.build()
		.apiInfo(metaApi());
	}
	public ApiInfo metaApi() {
		return new ApiInfoBuilder()
				.title("Api Configuration DOC")
				.description("Apid confic Doc")
				.version("1.0.0")
				.build();
	}
	
}
