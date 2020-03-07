package com.consume.rest.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ConsumingRestApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumingRestApplication.class);

    public static void main(final String[] args) {
        SpringApplication.run(ConsumingRestApplication.class, args);
    }

    //    @Bean
    //    public RestTemplate restTemplate(final RestTemplateBuilder builder) {
    //        return builder.build();
    //    }

    //    @Bean
    //    public CommandLineRunner run(final RestTemplate restTemplate) throws Exception {
    //        return args -> {
    //            final ResponseEntity<Result> responseEntity = restTemplate.postForEntity(
    //                    "http://localhost:8080/api/v1/calc/add", new Input(10, 10), Result.class);
    //            log.info(responseEntity.getBody().toString());
    //        };
    //    }

}
