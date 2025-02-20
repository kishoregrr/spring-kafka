package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.learning.repositories")
@EntityScan(basePackages = "com.learning.entity")
public class Application {

	/*@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}*/

    @Bean
    public RestTemplate getRestTemplate() {

        /*HttpComponentsClientHttpRequestFactory httpComponentsClientHttpRequestFactory
                = new HttpComponentsClientHttpRequestFactory();
        httpComponentsClientHttpRequestFactory.setConnectTimeout(3000);
        return new RestTemplate(httpComponentsClientHttpRequestFactory);*/

        return new RestTemplate();
    }

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
