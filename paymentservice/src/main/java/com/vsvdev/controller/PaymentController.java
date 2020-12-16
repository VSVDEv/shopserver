package com.vsvdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @GetMapping("/pay/{price}")
    public String pay(@PathVariable int price){
        return "payment with price: "+ price+ " is sucessfull";
    }
}
