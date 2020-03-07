package com.consume.rest.app.controller;

import com.consume.rest.app.model.Input;
import com.consume.rest.app.model.Result;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/calc")
public class SpringbootConsumeRestController {
    @Value("${endpoint}")
    String endpoint;

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/add")
    public Result helloUser() {
        final ResponseEntity<Result> responseEntity = this.restTemplate.postForEntity(
                this.endpoint + "/add", new Input(10, 10), Result.class);
        return responseEntity.getBody();

    }
}
