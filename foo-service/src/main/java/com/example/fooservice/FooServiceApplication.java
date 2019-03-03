package com.example.fooservice;

import com.example.library.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FooServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FooServiceApplication.class, args);
    }

    @GetMapping("/")
    public String greet() {
        Foo foo = new Foo();
        foo.setName("Hallo");
        return foo.getName();
    }
}
