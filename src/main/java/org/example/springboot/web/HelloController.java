package org.example.springboot.web;
// API를 만듦

import org.example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // GetMapping을 통해 "/hello"로 요청이 오면
    // 문자열 "hello"를 반환하는 기능을 가짐
    // http://localhost:8080/hello
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // 전달형식
    // http://localhost:8080/hello/dto?name=홍승준&amount=100
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
