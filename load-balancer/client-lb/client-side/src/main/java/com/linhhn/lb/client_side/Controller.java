package com.linhhn.lb.client_side;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

    private final RestTemplate restTemplate;

    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/fetch-server")
    public String fetchServer() {
        return restTemplate.getForObject("http://server-side/hello", String.class);
    }
}
