/*package com.festa.doc.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

import java.util.Arrays;
import java.util.HashSet;

@Configuration
@EnableSwagger2*/
public class SwaggerConfig {
    /*private Contact contato(){
        return new Contact(
                "Seu nome",
                "http://www.seusite.com.ber",
                "seu@email.com.br"
        );
    }
    //informaçoes da api

    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Titulo - RestApi");
        apiInfoBuilder.description("API exemplo com swagger 2 e spring boot rest api");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Termo de uso: Open Source");
        apiInfoBuilder.license("Licença - Dev Dock");
        apiInfoBuilder.licenseUrl("");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }

    //documento da api, docket = documento
    @Bean
    public Docket detalheapi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        //documento = docket
        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.festa.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));
        return docket;
    }*/
}
