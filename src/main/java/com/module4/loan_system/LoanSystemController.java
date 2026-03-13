package com.module4.loan_system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanSystemController {
    @GetMapping("/")
    public String display(){
        return "Hello";
    }
}
