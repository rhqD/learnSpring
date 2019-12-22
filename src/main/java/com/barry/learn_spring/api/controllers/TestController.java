package com.barry.learn_spring.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
@RequestMapping(path = "test")
public class TestController {
    @GetMapping("random")
    public ResponseEntity getRandomNumber(
            @RequestParam Optional<Integer> start,
            @RequestParam Optional<Integer> end
    ){
        int startValue = start.orElse(0);
        int endValue = end.orElse(100);
        int randomNum = (int)(startValue + Math.random() * (endValue - startValue));
        return ResponseEntity.of(Optional.of(randomNum));
    }
}
