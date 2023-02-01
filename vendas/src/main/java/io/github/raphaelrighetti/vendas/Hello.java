package io.github.raphaelrighetti.vendas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class Hello {

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello, World";
    }
}
