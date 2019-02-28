package com.van.avaliacaoverx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
	            .paths(PathSelectors.any())
				.build()
				.apiInfo(this.ApiInfo().build());
	}
	
	private ApiInfoBuilder ApiInfo() {
		 
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
 
		apiInfoBuilder.title("Verx Avaliação");
		apiInfoBuilder.description("API para avaliação de vaga na UOL");
		apiInfoBuilder.version("1.0");
		apiInfoBuilder.contact(this.contato());
 
		return apiInfoBuilder;
 
	}
	
	private Contact contato() {
		 
		return new Contact(
				"Vanderson Alves",
				"https://www.linkedin.com/in/vaanalvesr/",
				"vanalvesdev@gmail.com");
	}
}
