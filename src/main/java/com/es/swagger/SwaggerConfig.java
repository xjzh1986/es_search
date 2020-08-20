package com.es.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration // 启动时就要加载
@EnableSwagger2
public class SwaggerConfig {
    private String version;

    @Bean
    public Docket createRestApi() {

        return new Docket(DocumentationType.SWAGGER_2)
                .genericModelSubstitutes(DeferredResult.class)
                .select()
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());//.globalOperationParameters(pars);

    }

    private ApiInfo apiInfo() {
        //swagger 地址
        //http://localhost:8833/swagger-ui.html#/
        return new ApiInfoBuilder().title("Earth server")
                .description("道口金科")
                .termsOfServiceUrl("http://www.baidu.com")
                .version("1.0").build();
    }
}
