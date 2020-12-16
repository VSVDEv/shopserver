package com.vsvdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShopController {

    private final RestTemplate template;
@Autowired
    public ShopController(RestTemplate template) {
        this.template = template;
    }

    @GetMapping("/shop/{price}")
    public String invokePaymentService(@PathVariable int price){
       String url="http://paymentservice/payment/pay/"+price;
        return template.getForObject( url,String.class );
    }
}
