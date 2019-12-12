package com.sejin.jpa;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/{name}")
    public Map<String, String> hello(@PathVariable String name) {
        return Collections.singletonMap("message", "Hello, restdocs");
    }

}
